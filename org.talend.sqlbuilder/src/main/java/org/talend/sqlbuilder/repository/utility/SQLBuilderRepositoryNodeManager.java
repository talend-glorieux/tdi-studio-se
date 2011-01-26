// ============================================================================
//
// Copyright (C) 2006-2010 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.sqlbuilder.repository.utility;

import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.swt.custom.CTabItem;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.commons.utils.PasswordEncryptUtil;
import org.talend.commons.utils.VersionUtils;
import org.talend.core.CorePlugin;
import org.talend.core.context.Context;
import org.talend.core.context.RepositoryContext;
import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.model.metadata.IMetadataConnection;
import org.talend.core.model.metadata.MetadataTalendType;
import org.talend.core.model.metadata.builder.ConvertionHelper;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.metadata.builder.connection.MetadataColumn;
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.core.model.metadata.builder.connection.QueriesConnection;
import org.talend.core.model.metadata.builder.connection.Query;
import org.talend.core.model.metadata.builder.database.ExtractMetaDataFromDataBase;
import org.talend.core.model.metadata.builder.database.ExtractMetaDataUtils;
import org.talend.core.model.properties.DatabaseConnectionItem;
import org.talend.core.model.properties.ItemState;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.model.repository.RepositoryObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.sqlbuilder.util.ConnectionParameters;
import org.talend.core.sqlbuilder.util.TextUtil;
import org.talend.cwm.helper.ConnectionHelper;
import org.talend.cwm.helper.PackageHelper;
import org.talend.cwm.relational.TdColumn;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.ui.utils.ManagerConnection;
import org.talend.sqlbuilder.Messages;
import org.talend.sqlbuilder.SqlBuilderPlugin;
import org.talend.sqlbuilder.dbstructure.DBTreeProvider;
import org.talend.sqlbuilder.dbstructure.DBTreeProvider.MetadataColumnRepositoryObject;
import org.talend.sqlbuilder.dbstructure.DBTreeProvider.MetadataTableRepositoryObject;
import org.talend.sqlbuilder.dbstructure.RepositoryNodeType;
import org.talend.sqlbuilder.dbstructure.SqlBuilderRepositoryObject;
import org.talend.sqlbuilder.editors.MultiPageSqlBuilderEditor;
import org.talend.sqlbuilder.ui.AbstractSQLEditorComposite;
import org.talend.sqlbuilder.ui.SQLBuilderDialog;
import orgomg.cwm.resource.relational.Catalog;
import orgomg.cwm.resource.relational.Schema;

/**
 * dev class global comment. Detailled comment <br/>
 * 
 * $Id: talend-code-templates.xml 1 2006-09-29 17:06:40 +0000 (Fri, 29 Sep 2006) nrousseau $
 * 
 */
public class SQLBuilderRepositoryNodeManager {

    // /store all DatabaseConnection's RepositoryNode.
    private static List<RepositoryNode> repositoryNodes = new ArrayList<RepositoryNode>();

    private static List<RepositoryNode> repositoryNodes2 = new ArrayList<RepositoryNode>();

    /**
     * dev Comment method "isChangeElementColor".
     * 
     * @param node
     * @return
     */
    public boolean isChangeElementColor(RepositoryNode node) {
        boolean flag = false;
        Object type = node.getProperties(EProperties.CONTENT_TYPE);
        if (type.equals(RepositoryNodeType.DATABASE)) {
            return getItem(node).getConnection().isDivergency();
        }

        if (type.equals(RepositoryNodeType.TABLE)) {
            MetadataTableRepositoryObject object = (MetadataTableRepositoryObject) node.getObject();
            MetadataTable table = object.getTable();
            flag = table.getSourceName().equals(table.getLabel());
            flag = flag && table.isDivergency();
        }
        return flag;
    }

    /**
     * dev Comment method "isDiff".
     * 
     * @param node
     * @return
     */
    @SuppressWarnings("unchecked")//$NON-NLS-1$
    public boolean[] isDiff(RepositoryNode node) {
        boolean isDiffDivergency = false;
        boolean isDiffSyschronize = false;
        boolean isDiffGray = false;
        Object type = node.getProperties(EProperties.CONTENT_TYPE);
        if (type.equals(RepositoryNodeType.DATABASE)) {
            DatabaseConnection connection = (DatabaseConnection) getItem(node).getConnection();
            Set<MetadataTable> tables = ConnectionHelper.getTables(connection);
            for (MetadataTable table : tables) {
                List<MetadataColumn> columns = table.getColumns();
                for (MetadataColumn column : columns) {
                    if (column.isDivergency()) {
                        isDiffDivergency = true;
                    }
                    if (column.isSynchronised()) {
                        isDiffSyschronize = true;
                    }
                    if (column.getLabel() == null || "".equals(column.getLabel())) { //$NON-NLS-1$
                        isDiffGray = true;
                    }
                }
                if (table.isDivergency()) {
                    isDiffDivergency = true;
                }
                if (table.getLabel() == null || "".equals(table.getLabel())) { //$NON-NLS-1$
                    isDiffGray = true;
                }
            }
        } else if (type.equals(RepositoryNodeType.TABLE)) {
            MetadataTableRepositoryObject object = (MetadataTableRepositoryObject) node.getObject();
            MetadataTable table = object.getTable();
            List<MetadataColumn> columns = table.getColumns();
            for (MetadataColumn column : columns) {
                if (column.isDivergency()) {
                    isDiffDivergency = true;
                }
                if (column.isSynchronised()) {
                    isDiffSyschronize = true;
                }
                if (column.getLabel() == null || "".equals(column.getLabel())) { //$NON-NLS-1$
                    isDiffGray = true;
                }
            }
            if (table.isDivergency()) {
                isDiffDivergency = true;
            }
        }

        return new boolean[] { isDiffGray, isDiffDivergency, isDiffSyschronize };
    }

    /**
     * dev Comment method "removeAllRepositoryNodes".
     */
    public static void removeAllRepositoryNodes() {
        repositoryNodes.clear();
        repositoryNodes2.clear();
    }

    /**
     * dev Comment method "addRepositoryNode".
     * 
     * @param node
     */
    public void addRepositoryNode(RepositoryNode node) {
        if (repositoryNodes.contains(node)) {
            return;
        }
        repositoryNodes.add(node);
        repositoryNodes2.add(node);
    }

    public void addAllRepositoryNodes() {
        repositoryNodes.clear();
        repositoryNodes.addAll(repositoryNodes2);
    }

    /**
     * dev Comment method "getRepositoryNodebyName".
     * 
     * @param name
     * @return
     */
    public RepositoryNode getRepositoryNodebyName(String name) {
        for (RepositoryNode node : repositoryNodes) {
            if (((SqlBuilderRepositoryObject) node.getObject()).getRepositoryName().equals(name)) {
                return node;
            }
        }
        return null;
    }

    /**
     * dev Comment method "removeRepositoryNodeExceptNodeByName".
     * 
     * @param repositoryNodeName
     */
    public void removeRepositoryNodeExceptNodeByName(String repositoryNodeName) {
        for (Iterator it = repositoryNodes.iterator(); it.hasNext();) {
            RepositoryNode node = (RepositoryNode) it.next();
            if (!((SqlBuilderRepositoryObject) node.getObject()).getRepositoryName().equals(repositoryNodeName)) {
                it.remove();
            }
        }
    }

    /**
     * dev Comment method "sortTableColumn".
     * 
     * @param set
     * @return
     */
    @SuppressWarnings("unchecked")//$NON-NLS-1$
    private static List<MetadataTable> sortTableColumn(Collection<MetadataTable> set) {
        List<MetadataTable> sysTables = new ArrayList<MetadataTable>();
        List<MetadataTable> divTables = new ArrayList<MetadataTable>();
        List<MetadataTable> grayTables = new ArrayList<MetadataTable>();
        List<MetadataTable> norTables = new ArrayList<MetadataTable>();
        List<MetadataTable> sortTables = new ArrayList<MetadataTable>();
        for (MetadataTable object : set) {
            boolean isTableNormal = true;
            if (object.isDivergency()) {
                divTables.add(object);
                isTableNormal = false;
                continue;
            }
            if (object.getLabel() == null || "".equals(object.getLabel())) { //$NON-NLS-1$
                grayTables.add(object);
                isTableNormal = false;
                continue;
            }
            List<MetadataColumn> columns = sortColumn(object.getColumns());
            object.getColumns().clear();
            object.getColumns().addAll(columns);
            for (MetadataColumn column : columns) {
                if (column.isSynchronised()) {
                    sysTables.add(object);
                    isTableNormal = false;
                    break;
                }
                if (column.isDivergency()) {
                    divTables.add(object);
                    isTableNormal = false;
                    break;
                }
                if (column.getLabel() == null || "".equals(column.getLabel())) { //$NON-NLS-1$
                    grayTables.add(object);
                    isTableNormal = false;
                    break;
                }
            }
            if (isTableNormal) {
                norTables.add(object);
            }
        }
        MetadataTableComparator metadataTableComparator = new MetadataTableComparator();
        Collections.sort(norTables, metadataTableComparator);
        Collections.sort(sysTables, metadataTableComparator);
        Collections.sort(divTables, metadataTableComparator);
        Collections.sort(grayTables, metadataTableComparator);
        sortTables.addAll(norTables);
        sortTables.addAll(sysTables);
        sortTables.addAll(divTables);
        sortTables.addAll(grayTables);
        return sortTables;
    }

    /**
     * dev Comment method "sortColumn".
     * 
     * @param columns
     * @return
     */
    private static List<MetadataColumn> sortColumn(Collection<MetadataColumn> columns) {
        List<MetadataColumn> sortColumns = new ArrayList<MetadataColumn>();
        List<MetadataColumn> sysColumns = new ArrayList<MetadataColumn>();
        List<MetadataColumn> grayColumns = new ArrayList<MetadataColumn>();
        List<MetadataColumn> divColumns = new ArrayList<MetadataColumn>();
        List<MetadataColumn> norColumns = new ArrayList<MetadataColumn>();
        for (MetadataColumn column : columns) {
            if (column.isSynchronised()) {
                sysColumns.add(column);
                continue;
            }
            if (column.isDivergency()) {
                divColumns.add(column);
                continue;
            }
            if (column.getLabel() == null || "".equals(column.getLabel())) { //$NON-NLS-1$
                grayColumns.add(column);
                continue;
            }
            norColumns.add(column);
        }
        MetadataColumnComparator metadataColumnComparator = new MetadataColumnComparator();
        Collections.sort(norColumns, metadataColumnComparator);
        Collections.sort(sysColumns, metadataColumnComparator);
        Collections.sort(divColumns, metadataColumnComparator);
        Collections.sort(grayColumns, metadataColumnComparator);
        sortColumns.addAll(norColumns);
        sortColumns.addAll(sysColumns);
        sortColumns.addAll(divColumns);
        sortColumns.addAll(grayColumns);
        return sortColumns;
    }

    /**
     * method "getTableNamesByRepositoryNode" get All Table Names in current RepositoryNode's DatabaseConnectionItem.
     * 
     * @param node current RepositoryNode
     * @return List :all Table Names.
     */
    @SuppressWarnings("unchecked")//$NON-NLS-1$
    public static Map<String, List<String>> getAllNamesByRepositoryNode(RepositoryNode node) {
        Map<String, List<String>> allNames = new HashMap<String, List<String>>();
        DatabaseConnectionItem item = getItem(getRoot(node));
        DatabaseConnection connection = (DatabaseConnection) item.getConnection();
        Set<MetadataTable> tablesFromEMF = ConnectionHelper.getTables(connection);
        boolean isOdbc = connection.getSID() == null || connection.getSID().length() == 0;
        String sid = isOdbc ? connection.getDatasourceName() : connection.getSID();
        for (MetadataTable table : tablesFromEMF) {
            String tableName = table.getSourceName();
            if (tableName != null && !"".equals(tableName)) { //$NON-NLS-1$
                List<String> columnNames = new ArrayList<String>();
                tableName = "\"" + sid + "\".\"" + tableName + "\""; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                List<MetadataColumn> columns = table.getColumns();
                for (MetadataColumn column : columns) {
                    String columnName = column.getOriginalField();
                    if (columnName != null && !"".equals(columnName)) { //$NON-NLS-1$
                        columnName = tableName + ".\"" + columnName + "\""; //$NON-NLS-1$ //$NON-NLS-2$
                        columnNames.add(columnName);
                    }
                }

                allNames.put(tableName, columnNames);
            }
        }
        return allNames;
    }

    /**
     * method "getALLReposotoryNodeNames" get all DatabaseConnection's RepositoryNode Names.
     * 
     * @return List : all DatabaseConnection's RepositoryNode Names
     */
    public List<String> getALLReposotoryNodeNames() {
        List<String> names = new ArrayList<String>();
        for (RepositoryNode node : repositoryNodes) {
            names.add(((SqlBuilderRepositoryObject) node.getObject()).getRepositoryName());
        }
        return names;
    }

    /**
     * Gets all the connection repositories.
     * 
     * @return
     */
    public List<RepositoryNode> getAllDisplayedConnection() {
        return repositoryNodes;
    }

    /**
     * method "getRepositoryNodeFromDB".
     * 
     * @param oldNode
     * @return
     */
    @SuppressWarnings("unchecked")//$NON-NLS-1$
    public RepositoryNode getRepositoryNodeFromDB(RepositoryNode oldNode, String selectedContext) {
        DatabaseConnectionItem item = getItem(getRoot(oldNode));
        DatabaseConnection connection = (DatabaseConnection) item.getConnection();
        IMetadataConnection iMetadataConnection = ConvertionHelper.convert(connection, false, selectedContext);
        try {
            modifyOldRepositoryNode(connection, iMetadataConnection, oldNode);
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }

        return oldNode;
    }

    /**
     * dev Comment method "modifyOldRepositoryNode".
     * 
     * @param connection
     * @param iMetadataConnection
     */
    @SuppressWarnings("unchecked")//$NON-NLS-1$
    private void modifyOldRepositoryNode(DatabaseConnection connection, IMetadataConnection iMetadataConnection,
            RepositoryNode oldNode) throws Exception {

        boolean status = new ManagerConnection().check(iMetadataConnection);
        connection.setDivergency(!status);
        if (status) {
            // /Get MetadataTable From DB
            List<MetadataTable> tablesFromDB = ExtractMetaDataFromDataBase.returnMetaTablesFormConnection(iMetadataConnection);
            // Get MetadataTable From EMF(Old RepositoryNode)

            Set<MetadataTable> tablesetFromEMF = ConnectionHelper.getTables(connection);
            List<MetadataTable> tablesFromEMF = new ArrayList<MetadataTable>();
            tablesFromEMF.addAll(tablesetFromEMF);
            if (oldNode.getProperties(EProperties.CONTENT_TYPE) == RepositoryNodeType.DATABASE) {
                modifyOldConnection(tablesFromEMF, iMetadataConnection, tablesFromDB, oldNode);
                restoreConnection(connection, tablesFromEMF);
            } else if (oldNode.getProperties(EProperties.CONTENT_TYPE) == RepositoryNodeType.TABLE) {
                MetadataTable metadataTable = ((MetadataTableRepositoryObject) oldNode.getObject()).getTable();
                modifyOldOneTableFromDB(tablesFromDB, metadataTable);
                MetadataTable tableFromDB = null;
                for (MetadataTable table : tablesFromDB) {
                    if (table.getSourceName().equals(metadataTable.getSourceName())) {
                        tableFromDB = table;
                    }
                }
                if (tableFromDB != null) {
                    List<MetadataColumn> columnsFromDB = new ArrayList<MetadataColumn>();
                    columnsFromDB.addAll(ExtractMetaDataFromDataBase.returnMetadataColumnsFormTable(iMetadataConnection,
                            tableFromDB.getSourceName()));
                    fixedColumns(columnsFromDB, metadataTable.getColumns());
                }
                // for (MetadataColumn metadataColumn : (List<MetadataColumn>) metadataTable.getColumns()) {
                // modifyOneColumnFromDB(iMetadataConnection, tablesFromDB, metadataColumn);
                // }
                restoreConnection(connection, tablesFromEMF);
            } else if (oldNode.getProperties(EProperties.CONTENT_TYPE) == RepositoryNodeType.COLUMN) {
                MetadataColumn metadataColumn = ((MetadataColumnRepositoryObject) oldNode.getObject()).getColumn();
                modifyOneColumnFromDB(iMetadataConnection, tablesFromDB, metadataColumn);
            }
        } else {
            Set<MetadataTable> tableset = ConnectionHelper.getTables(connection);
            List<MetadataTable> tablesFromEMF = new ArrayList<MetadataTable>();
            tablesFromEMF.addAll(tableset);
            for (MetadataTable tableFromEMF : tablesFromEMF) {
                List<MetadataColumn> columnsFromEMF = tableFromEMF.getColumns();
                for (MetadataColumn column : columnsFromEMF) {
                    column.setOriginalField(" "); //$NON-NLS-1$
                    column.setDivergency(true);
                    column.setSynchronised(false);
                }
                tableFromEMF.setSourceName(" "); //$NON-NLS-1$
                tableFromEMF.setDivergency(true);
            }
        }
    }

    /**
     * dev Comment method "modifyOneColumnFromDB".
     * 
     * @param iMetadataConnection
     * @param tablesFromDB
     * @param metadataColumn
     */
    private void modifyOneColumnFromDB(IMetadataConnection iMetadataConnection, List<MetadataTable> tablesFromDB,
            MetadataColumn metadataColumn) {
        MetadataTable tableFromDB = null;
        for (MetadataTable table : tablesFromDB) {
            if (table.getSourceName().equals(metadataColumn.getTable().getSourceName())) {
                tableFromDB = table;
            }
        }
        if (tableFromDB != null) {
            List<MetadataColumn> columnsFromDB = new ArrayList<MetadataColumn>();
            columnsFromDB.addAll(ExtractMetaDataFromDataBase.returnMetadataColumnsFormTable(iMetadataConnection,
                    tableFromDB.getSourceName()));
            modifyOldOneColumnFromDB(columnsFromDB, metadataColumn);
        }
    }

    /**
     * dev Comment method "ModifyOldConnection".
     * 
     * @param tablesFromEMF
     * @param iMetadataConnection
     * @param tablesFromDB
     */
    @SuppressWarnings("unchecked")//$NON-NLS-1$
    private void modifyOldConnection(List<MetadataTable> tablesFromEMF, IMetadataConnection iMetadataConnection,
            List<MetadataTable> tablesFromDB, RepositoryNode oldNode) {
        for (MetadataTable tableFromDB : tablesFromDB) {
            // /Get MetadataColumn from DB
            List<MetadataColumn> columnsFromDB = new ArrayList<MetadataColumn>();
            columnsFromDB.addAll(ExtractMetaDataFromDataBase.returnMetadataColumnsFormTable(iMetadataConnection,
                    tableFromDB.getSourceName()));
            for (MetadataTable tableFromEMF : tablesFromEMF) {
                // /Get MetadataColumn From EMF
                List<MetadataColumn> columnsFromEMF = tableFromEMF.getColumns();
                if (tableFromDB.getSourceName().equals(tableFromEMF.getSourceName())) {
                    fixedColumns(columnsFromDB, columnsFromEMF);
                }
            }
        }
        fixedTables(tablesFromDB, tablesFromEMF, iMetadataConnection, oldNode);
    }

    /**
     * dev Comment method "restoreConnection".
     * 
     * @param connection
     * @param tablesFromEMF
     */
    @SuppressWarnings("unchecked")//$NON-NLS-1$
    private void restoreConnection(DatabaseConnection connection, List<MetadataTable> tablesFromEMF) {
        tablesFromEMF = sortTableColumn(tablesFromEMF);
        // ConnectionHelper.getTables(connection).clear();
        // ConnectionHelper.getTables(connection).addAll(tablesFromEMF);

        Catalog c = (Catalog) ConnectionHelper.getPackage(connection.getSID(), connection, Catalog.class);
        Schema s = (Schema) ConnectionHelper.getPackage(connection.getSID(), connection, Schema.class);
        if (c != null) {
            PackageHelper.addMetadataTable(tablesFromEMF, c);
        } else if (s != null) {
            PackageHelper.addMetadataTable(tablesFromEMF, s);
        }
    }

    /**
     * dev Comment method "getRepositoryNodeByBuildIn".
     * 
     * @param node
     * @param parameters
     * @return
     */
    @SuppressWarnings("unchecked")//$NON-NLS-1$
    public RepositoryNode getRepositoryNodeByBuildIn(RepositoryNode node, ConnectionParameters parameters) {

        DatabaseConnection connection = createConnection(parameters);
        if (connection == null) {
            return null;
        }
        IMetadataConnection iMetadataConnection = ConvertionHelper.convert(connection);

        RepositoryNode newNode = createNewRepositoryNode(node, parameters, connection, iMetadataConnection);

        return newNode;
    }

    /**
     * dev Comment method "createNewRepositoryNode".
     * 
     * @param node
     * @param parameters
     * @param connection
     * @param iMetadataConnection
     * @return
     */
    @SuppressWarnings("unchecked")//$NON-NLS-1$
    private RepositoryNode createNewRepositoryNode(RepositoryNode node, ConnectionParameters parameters,
            DatabaseConnection connection, IMetadataConnection iMetadataConnection) {
        ManagerConnection managerConnection = new ManagerConnection();
        boolean status = managerConnection.check(iMetadataConnection);
        connection.setDivergency(!status);
        ConnectionHelper.getTables(connection).clear();
        if (status) {
            try {
                List<MetadataTable> tablesFromDB = ExtractMetaDataFromDataBase
                        .returnMetaTablesFormConnection(iMetadataConnection);
                ExtractMetaDataUtils.isReconnect = false;
                for (MetadataTable table : tablesFromDB) {
                    List<MetadataColumn> columnsFromDB = new ArrayList<MetadataColumn>();
                    columnsFromDB.addAll(ExtractMetaDataFromDataBase.returnMetadataColumnsFormTable(iMetadataConnection,
                            table.getSourceName()));
                    table.getColumns().clear();
                    for (MetadataColumn column : columnsFromDB) {
                        column.setLabel(""); //$NON-NLS-1$
                        table.getColumns().add(column);
                    }
                    table.setLabel(""); //$NON-NLS-1$
                    ConnectionHelper.getTables(connection).add(table);
                }
                ExtractMetaDataUtils.isReconnect = true;
            } catch (Exception e) {
                if (parameters != null) {
                    parameters.setConnectionComment(e.getMessage());
                }
                return null;
            }

        } else {
            if (parameters != null) {
                parameters.setConnectionComment(managerConnection.getMessageException() == null ? "" : managerConnection //$NON-NLS-1$
                        .getMessageException());
            }
        }
        DatabaseConnectionItem item = PropertiesFactory.eINSTANCE.createDatabaseConnectionItem();
        Property connectionProperty = PropertiesFactory.eINSTANCE.createProperty();
        connectionProperty.setAuthor(((RepositoryContext) CorePlugin.getContext().getProperty(Context.REPOSITORY_CONTEXT_KEY))
                .getUser());
        connectionProperty.setVersion(VersionUtils.DEFAULT_VERSION);
        connectionProperty.setStatusCode(""); //$NON-NLS-1$

        item.setProperty(connectionProperty);
        item.setConnection(connection);
        RepositoryObject object = new RepositoryObject(connectionProperty);
        object.setLabel(""); //$NON-NLS-1$
        ItemState state = PropertiesFactory.eINSTANCE.createItemState();
        state.setDeleted(false);
        item.setState(state);
        if (node == null) {
            node = new RepositoryNode(null, null, ENodeType.SYSTEM_FOLDER);
        }
        RepositoryNode newNode = new RepositoryNode(object, node, ENodeType.SYSTEM_FOLDER);
        return newNode;
    }

    /**
     * dev Comment method "createConnection".
     * 
     * @param parameters inputed when use Built-In .
     * @return DatabaseConnection : connetion .
     */
    public DatabaseConnection createConnection(ConnectionParameters parameters) {
        String dbType = parameters.getDbType();
        boolean isNeedSchema = EDatabaseTypeName.getTypeFromDbType(dbType).isNeedSchema();
        String productName = EDatabaseTypeName.getTypeFromDisplayName(dbType).getProduct();
        // boolean isOralceWithSid = productName.equals(EDatabaseTypeName.ORACLEFORSID.getProduct());

        String schema = parameters.getSchema();
        if (EDatabaseTypeName.TERADATA.getProduct().equals(productName)) {
            schema = parameters.getDbName();
        }

        if ("".equals(schema) && EDatabaseTypeName.INFORMIX.getProduct().equals(productName)) { //$NON-NLS-1$
            schema = parameters.getUserName();
        }

        boolean isSchemaInValid = (schema == null) || (schema.equals("\'\'")) || (schema.equals("\"\"")) //$NON-NLS-1$ //$NON-NLS-2$
                || (schema.trim().equals("")); //$NON-NLS-1$
        // from 616 till line 622 modified by hyWang
        NotReallyNeedSchemaDBS dbs = new NotReallyNeedSchemaDBS();
        dbs.init();
        List<String> names = dbs.getNeedSchemaDBNames();
        boolean ifNeedSchemaDB = names.contains(productName);
        if (isNeedSchema && isSchemaInValid && !ifNeedSchemaDB) { //$NON-NLS-1$
            parameters.setConnectionComment(Messages.getString("SQLBuilderRepositoryNodeManager.connectionComment")); //$NON-NLS-1$
            return null;
        }
        DatabaseConnection connection = ConnectionFactory.eINSTANCE.createDatabaseConnection();
        connection.setFileFieldName(parameters.getFilename());
        connection.setDatabaseType(dbType);
        connection.setUsername(parameters.getUserName());
        connection.setPort(parameters.getPort());
        // added by hyWang,to let repository node has encrypted password
        try {
            String encryptedPassword = null;
            encryptedPassword = PasswordEncryptUtil.encryptPassword(parameters.getPassword());
            connection.setPassword(encryptedPassword);
        } catch (Exception e) {
            // e.printStackTrace();
            ExceptionHandler.process(e);
        }
        if (dbType != null && dbType.equals(EDatabaseTypeName.ORACLE_OCI.getDisplayName())
                && parameters.getLocalServiceName() != null && !"".equals(parameters.getLocalServiceName())) {
            connection.setSID(parameters.getLocalServiceName());
        } else {
            connection.setSID(parameters.getDbName());
        }
        connection.setLabel(parameters.getDbName());
        connection.setDatasourceName(parameters.getDatasource());
        if ("".equals(connection.getLabel())) { //$NON-NLS-1$
            connection.setLabel(parameters.getDatasource());
        }
        final String product = EDatabaseTypeName.getTypeFromDisplayName(connection.getDatabaseType()).getProduct();
        connection.setProductId(product);
        if (MetadataTalendType.getDefaultDbmsFromProduct(product) != null) {
            final String mapping = MetadataTalendType.getDefaultDbmsFromProduct(product).getId();
            connection.setDbmsId(mapping);
        }

        if (!isSchemaInValid && isNeedSchema) {
            schema = schema.replaceAll("\'", ""); //$NON-NLS-1$ //$NON-NLS-2$
            schema = schema.replaceAll("\"", ""); //$NON-NLS-1$ //$NON-NLS-2$
            connection.setUiSchema(schema); //$NON-NLS-1$ //$NON-NLS-2$
        }
        connection.setServerName(parameters.getHost());
        connection.setAdditionalParams(parameters.getJdbcProperties());

        String driverClassByDbType = null;
        if (parameters.getDriverClass() != null) {
            driverClassByDbType = parameters.getDriverClass();
        } else {
            driverClassByDbType = ExtractMetaDataUtils.getDriverClassByDbType(dbType);
        }

        connection.setDriverClass(driverClassByDbType);
        connection.setDriverJarPath(parameters.getDriverJar());
        connection.setURL(parameters.getCombineURL());

        connection.setDBRootPath(parameters.getDirectory());
        connection.setDbVersionString(parameters.getDbVersion());

        return connection;
    }

    /**
     * dev Comment method "getDbTypeFromRepositoryNode".
     * 
     * @param node
     * @return
     */
    public static String getDbTypeFromRepositoryNode(RepositoryNode node) {
        DatabaseConnection connection = (DatabaseConnection) getItem(getRoot(node)).getConnection();
        return connection.getDatabaseType();
    }

    /**
     * method "getItem" get DatabaseConnectionItem by current RepositoryNode .
     * 
     * @param newNode current RepositoryNode
     * @return DatabaseConnectionItem : item current node.
     */
    public static DatabaseConnectionItem getItem(RepositoryNode newNode) {
        IRepositoryViewObject repositoryObject = newNode.getObject();
        DatabaseConnectionItem item = (DatabaseConnectionItem) repositoryObject.getProperty().getItem();
        return item;
    }

    public static DatabaseConnectionItem getEMFItem(String id) {
        IRepositoryViewObject repositoryObject = DBTreeProvider.getMaps().get(id);
        DatabaseConnectionItem item = (DatabaseConnectionItem) repositoryObject.getProperty().getItem();
        return item;
    }

    /**
     * method "getDatabaseNameByRepositoryNode" get databaseName .
     * 
     * @param node current RepositoryNode
     * @return String :databaseName
     */
    public static String getDatabaseNameByRepositoryNode(RepositoryNode node) {
        DatabaseConnection connection = (DatabaseConnection) getItem(node).getConnection();
        boolean isOdbc = connection.getSID() == null || connection.getSID().length() == 0;
        return isOdbc ? connection.getDatasourceName() : connection.getSID();
    }

    /**
     * method "getDatabaseMetaData" get databaseMetaData.
     * 
     * @param iMetadataConnection contains connection
     * @return dbMetaData DatabaseMetaData .
     */
    public DatabaseMetaData getDatabaseMetaData(IMetadataConnection iMetadataConnection) {
        ExtractMetaDataUtils.getConnection(iMetadataConnection.getDbType(), iMetadataConnection.getUrl(),
                iMetadataConnection.getUsername(), iMetadataConnection.getPassword(), iMetadataConnection.getDatabase(),
                iMetadataConnection.getSchema(), iMetadataConnection.getDriverClass(), iMetadataConnection.getDriverJarPath(),
                iMetadataConnection.getDbVersionString(), iMetadataConnection.getAdditionalParams());
        String dbType = iMetadataConnection.getDbType();
        DatabaseMetaData dbMetaData = ExtractMetaDataUtils.getDatabaseMetaData(ExtractMetaDataUtils.conn, dbType);
        return dbMetaData;
    }

    /**
     * dev Comment method "getALLQueryLabels".
     * 
     * @param repositoryNode current RepositoryNode.
     * @return all QueryLabels in Emf.
     */
    @SuppressWarnings("unchecked")//$NON-NLS-1$
    public List<String> getALLQueryLabels(RepositoryNode repositoryNode) {
        List<String> allQueries = new ArrayList<String>();
        DatabaseConnectionItem item = getEMFItem(repositoryNode.getObject().getId());
        DatabaseConnection connection = (DatabaseConnection) item.getConnection();
        QueriesConnection queriesConnection = connection.getQueries();
        if (queriesConnection != null) {
            List<Query> qs = queriesConnection.getQuery();
            for (Query q1 : qs) {
                allQueries.add(q1.getLabel());
            }
        }
        return allQueries;
    }

    /**
     * method "saveQuery" use save inputed Query to EMF's xml File.
     * 
     * @param repositoryNode current RepositoryNode
     * @param query need to save Query
     */
    @SuppressWarnings("unchecked")//$NON-NLS-1$
    private void saveEMFQuery(String id, Query query, String oldQuery) {
        DatabaseConnectionItem item = getEMFItem(id);
        if (query != null) {
            Query query3 = ConnectionFactory.eINSTANCE.createQuery();
            query3.setComment(query.getComment());
            query3.setLabel(query.getLabel());
            query3.setValue(query.getValue());
            query3.setContextMode(query.isContextMode()); // Add by hyWang
            Connection connection = item.getConnection();
            QueriesConnection queriesConnection = connection.getQueries();
            if (queriesConnection == null) {
                QueriesConnection qc = ConnectionFactory.eINSTANCE.createQueriesConnection();
                qc.setConnection(connection);
                qc.getQuery().add(query3);
                assignQueryId(query3, qc); // assign id to new query
            } else {
                List<Query> queries = queriesConnection.getQuery();
                boolean isModify = false;
                for (Query query2 : queries) {
                    if (oldQuery != null && (query2.getLabel().equals(oldQuery)) || query2.getLabel().equals(query3.getLabel())) {
                        query2.setComment(query3.getComment());
                        query2.setId(query3.getId());
                        query2.setValue(query3.getValue());
                        query2.setLabel(query3.getLabel());
                        // add by hywang
                        query2.setContextMode(query3.isContextMode());
                        isModify = true;
                    }
                    assignQueryId(query2, queriesConnection); // assign id to old query without id
                }
                if (!isModify) {
                    queriesConnection.getQuery().add(query3);
                    assignQueryId(query3, queriesConnection); // assign id to new query
                }
            }
        }

        saveMetaData(item);
    }

    @SuppressWarnings("unchecked")//$NON-NLS-1$
    public void saveQuery(RepositoryNode repositoryNode, Query query, String oldQuery) {

        saveEMFQuery(repositoryNode.getObject().getId(), query, oldQuery);
        DatabaseConnectionItem item = getItem(repositoryNode);
        if (query != null) {
            Connection connection = item.getConnection();
            QueriesConnection queriesConnection = connection.getQueries();
            if (queriesConnection == null) {
                QueriesConnection qc = ConnectionFactory.eINSTANCE.createQueriesConnection();
                qc.setConnection(connection);
                qc.getQuery().add(query);
                assignQueryId(query, qc); // assign id to new query
            } else {
                List<Query> queries = queriesConnection.getQuery();
                boolean isModify = false;
                for (Query query2 : queries) {
                    if (query2.getLabel().equals(query.getLabel())) {
                        query2.setComment(query.getComment());
                        query2.setId(query.getId());
                        query2.setValue(query.getValue());
                        query2.setContextMode(query.isContextMode()); // add by hywang
                        isModify = true;
                    }
                    assignQueryId(query2, queriesConnection); // assign id to old query without id
                }
                if (!isModify) {
                    queriesConnection.getQuery().add(query);
                    assignQueryId(query, queriesConnection); // assign id to new query
                }
            }
        }

    }

    private void assignQueryId(Query query, QueriesConnection connection) {
        if (query.getId() == null) {
            query.setId(ProxyRepositoryFactory.getInstance().getNextId());
        }
    }

    /**
     * method "deleteQueries" use delete Queries.
     * 
     * @param repositoryNode databaseConnection's RepositoryNode
     * @param queries need to deleted Queries
     */
    @SuppressWarnings("unchecked")//$NON-NLS-1$
    public void deleteQueries(RepositoryNode repositoryNode, List<Query> queries) {
        DatabaseConnectionItem item = getItem(repositoryNode);
        DatabaseConnection connection = (DatabaseConnection) item.getConnection();
        QueriesConnection queriesConnection = connection.getQueries();
        if (queriesConnection != null) {
            List<Query> qs = queriesConnection.getQuery();
            List<Query> qs2 = new ArrayList<Query>();
            qs2.clear();
            for (Query query : qs) {
                boolean flag = true;
                for (Query q : queries) {
                    if (query.getLabel().equals(q.getLabel())) {
                        flag = false;
                    }
                }
                if (flag) {
                    qs2.add(query);
                }
            }
            queriesConnection.getQuery().clear();
            queriesConnection.getQuery().addAll(qs2);
        }
        deleteEMFQueries(repositoryNode.getObject().getId(), queries);
    }

    @SuppressWarnings("unchecked")
    private void deleteEMFQueries(String id, List<Query> queries) {
        DatabaseConnectionItem item = getEMFItem(id);
        DatabaseConnection connection = (DatabaseConnection) item.getConnection();
        QueriesConnection queriesConnection = connection.getQueries();
        if (queriesConnection != null) {
            List<Query> qs = queriesConnection.getQuery();
            List<Query> qs2 = new ArrayList<Query>();
            qs2.clear();
            for (Query query : qs) {
                boolean flag = true;
                for (Query q : queries) {
                    if (query.getLabel().equals(q.getLabel())) {
                        flag = false;
                    }
                }
                if (flag) {
                    qs2.add(query);
                }
            }
            queriesConnection.getQuery().clear();
            queriesConnection.getQuery().addAll(qs2);
        }
        saveMetaData(item);
    }

    /**
     * save MetaData into EMF's xml files.
     * 
     * @param item need to be saved Item
     */
    public static void saveMetaData(DatabaseConnectionItem item) {

        ProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        try {
            factory.save(item);
        } catch (PersistenceException e) {
            SqlBuilderPlugin.log(Messages.getString("SQLBuilderRepositoryNodeManager.logMessage"), e); //$NON-NLS-1$
        }
    }

    /**
     * fixed Table .
     * 
     * @param metaFromDB MetadataTable from Database
     * @param metaFromEMF MetadataTable from Emf
     * @param iMetadataConnection contain Connection.
     */
    @SuppressWarnings("unchecked")//$NON-NLS-1$
    private void fixedTables(List<MetadataTable> metaFromDB, List<MetadataTable> metaFromEMF,
            IMetadataConnection iMetadataConnection, RepositoryNode oldNode) {
        List<MetadataTable> removeEmfDB = new ArrayList<MetadataTable>();
        for (MetadataTable emf : metaFromEMF) {
            boolean flag = modifyOldOneTableFromDB(metaFromDB, emf);
            if (flag) {
                removeEmfDB.add(emf);
            }
        }
        // if (((SqlBuilderRepositoryObject) oldNode.getObject()).getRepositoryName().equals("Built-In")) {

        for (MetadataTable metadataTable : removeEmfDB) {
            if (metadataTable.getLabel() == null || "".equals(metadataTable.getLabel())) { //$NON-NLS-1$
                metaFromEMF.remove(metadataTable);
            }
        }
        // }
        while (!metaFromDB.isEmpty()) {
            MetadataTable db = metaFromDB.remove(0);
            modifyOldOneTableFromEMF(metaFromEMF, iMetadataConnection, db);
        }
    }

    /**
     * dev Comment method "modifyOldOneTableFromEMF".
     * 
     * @param metaFromEMF
     * @param iMetadataConnection
     * @param db
     */
    @SuppressWarnings("unchecked")//$NON-NLS-1$
    private void modifyOldOneTableFromEMF(List<MetadataTable> metaFromEMF, IMetadataConnection iMetadataConnection,
            MetadataTable db) {
        boolean flag = true;
        for (MetadataTable emf : metaFromEMF) {
            if (db.getSourceName().equals(emf.getSourceName())) {
                flag = false;
                break;
            }
        }
        if (flag) {
            MetadataTable table = ConnectionFactory.eINSTANCE.createMetadataTable();
            table.setSourceName(db.getSourceName());
            table.setLabel(""); //$NON-NLS-1$
            List<TdColumn> columns = ExtractMetaDataFromDataBase.returnMetadataColumnsFormTable(iMetadataConnection,
                    table.getSourceName());
            for (MetadataColumn column : columns) {
                MetadataColumn column1 = ConnectionFactory.eINSTANCE.createMetadataColumn();
                column1.setOriginalField(column.getOriginalField());
                column1.setLabel(""); //$NON-NLS-1$
                table.getColumns().add(column1);
            }
            metaFromEMF.add(table);
        }
    }

    /**
     * dev Comment method "modifyOldOneTableFromDB".
     * 
     * @param metaFromDB
     * @param connectionLabel
     * @param emf
     */
    @SuppressWarnings("unchecked")//$NON-NLS-1$
    private boolean modifyOldOneTableFromDB(List<MetadataTable> metaFromDB, MetadataTable emf) {
        boolean flag = true;
        for (MetadataTable db : metaFromDB) {
            if (db.getSourceName().equals(emf.getSourceName())) {
                flag = false;
                if (!emf.getLabel().equals("") && !emf.getLabel().equals(db.getSourceName())) { //$NON-NLS-1$
                    emf.setDivergency(true);
                }
            }
        }
        if (flag) {
            List<MetadataColumn> columns = emf.getColumns();
            for (MetadataColumn column : columns) {
                column.setOriginalField(" "); //$NON-NLS-1$
                column.setDivergency(true);
                column.setSynchronised(false);
            }
            emf.setSourceName(" "); //$NON-NLS-1$
            emf.setDivergency(true);
            emf.setSynchronised(false);
        }
        return flag;
    }

    /**
     * fixed Column from EMF use Column From DataBase .
     * 
     * @param columnsFromDB MetadataColumn from Database
     * @param cloumnsFromEMF MetadataColumn from Emf
     */
    private void fixedColumns(List<MetadataColumn> columnsFromDB, List<MetadataColumn> cloumnsFromEMF) {
        for (MetadataColumn emf : cloumnsFromEMF) {
            modifyOldOneColumnFromDB(columnsFromDB, emf);
        }
        while (!columnsFromDB.isEmpty()) {
            MetadataColumn db = columnsFromDB.remove(0);
            modifyOldOneColumnFromEMF(cloumnsFromEMF, db);
        }

    }

    /**
     * dev Comment method "modifyOldOneColumnFromEMF".
     * 
     * @param cloumnsFromEMF
     * @param db
     */
    private void modifyOldOneColumnFromEMF(List<MetadataColumn> cloumnsFromEMF, MetadataColumn db) {
        boolean flag = true;
        for (MetadataColumn emf : cloumnsFromEMF) {
            if (db.getOriginalField().equals(emf.getOriginalField())) {
                flag = false;
                break;
            }
        }
        if (flag) {
            MetadataColumn column = ConnectionFactory.eINSTANCE.createMetadataColumn();
            column.setOriginalField(db.getOriginalField());
            column.setLabel(""); //$NON-NLS-1$
            cloumnsFromEMF.add(column);
        }
    }

    /**
     * dev Comment method "modifyOldOneColumnFromDB".
     * 
     * @param columnsFromDB
     * @param connAndTableLabel
     * @param emf
     */
    private void modifyOldOneColumnFromDB(List<MetadataColumn> columnsFromDB, MetadataColumn emf) {
        boolean flag = true;
        for (MetadataColumn db : columnsFromDB) {

            if (db.getOriginalField().equals(emf.getOriginalField())) {
                flag = false;
                if (emf.getLabel().length() != 0) {
                    boolean is = !isEquivalent(db, emf);
                    emf.setDivergency(is);
                    emf.setSynchronised(is);
                }
            }
        }
        if (flag) {
            emf.setOriginalField(" "); //$NON-NLS-1$
            emf.setDivergency(true);
            emf.setSynchronised(false);
        }
    }

    public static void saveMetadataColumn(List<RepositoryNode> repositorynodes, List<MetadataColumn> columnNodes) {
        saveEMFMetadataColumn(repositorynodes.get(0).getObject().getId(), columnNodes);
    }

    @SuppressWarnings("unchecked")
    private static void saveEMFMetadataColumn(String id, List<MetadataColumn> columnNodes) {
        DatabaseConnectionItem item = getEMFItem(id);
        final DatabaseConnection connection = (DatabaseConnection) item.getConnection();
        IMetadataConnection iMetadataConnection = ConvertionHelper.convert(connection);
        Set<MetadataTable> tableset = ConnectionHelper.getTables(connection);
        List<MetadataTable> tables = new ArrayList<MetadataTable>();
        tables.addAll(tableset);
        List<MetadataColumn> emfCols = new ArrayList<MetadataColumn>();
        List<MetadataColumn> dbCols = new ArrayList<MetadataColumn>();
        for (MetadataColumn col : columnNodes) {
            for (MetadataTable table : tables) {
                if (table.getLabel().equals(col.getTable().getLabel())) {
                    List<TdColumn> returnCols = ExtractMetaDataFromDataBase.returnMetadataColumnsFormTable(iMetadataConnection,
                            table.getSourceName());
                    for (MetadataColumn emfcolumn : (List<MetadataColumn>) table.getColumns()) {
                        for (MetadataColumn column : returnCols) {
                            if (emfcolumn.getLabel().equals(col.getLabel()) && column.getLabel().equals(col.getOriginalField())) {
                                emfCols.add(emfcolumn);
                                dbCols.add(column);
                            }
                        }
                    }
                }
            }
        }
        saveOneMetadataColumn(emfCols, columnNodes, dbCols);
        saveMetaData(item);
    }

    @SuppressWarnings("unchecked")//$NON-NLS-1$
    private static void saveOneMetadataColumn(List<MetadataColumn> emfCols, List<MetadataColumn> columnNodes,
            List<MetadataColumn> dbCols) {
        for (int i = 0; i < columnNodes.size(); i++) {
            MetadataColumn columnNode = columnNodes.get(i);
            MetadataColumn emfCol = emfCols.get(i);
            MetadataColumn metadataColumn = dbCols.get(i);
            if (metadataColumn.getLabel().equals(columnNode.getOriginalField())) {
                if (columnNode.getLabel().equals("")) { //$NON-NLS-1$
                    columnNode.setLabel(columnNode.getOriginalField());
                }
                columnNode.setComment(metadataColumn.getComment());
                columnNode.setDefaultValue(metadataColumn.getDefaultValue());
                columnNode.setKey(metadataColumn.isKey());
                columnNode.setLength(metadataColumn.getLength());
                columnNode.setNullable(metadataColumn.isNullable());
                columnNode.setPattern(metadataColumn.getPattern());
                columnNode.setPrecision(metadataColumn.getPrecision());
                columnNode.setSourceType(metadataColumn.getSourceType());
                columnNode.setTalendType(metadataColumn.getTalendType());
                columnNode.setDivergency(false);
                columnNode.setSynchronised(false);

                if (emfCol.getLabel().equals("")) { //$NON-NLS-1$
                    emfCol.setLabel(emfCol.getOriginalField());
                }
                emfCol.setComment(metadataColumn.getComment());
                emfCol.setDefaultValue(metadataColumn.getDefaultValue());
                emfCol.setKey(metadataColumn.isKey());
                emfCol.setLength(metadataColumn.getLength());
                emfCol.setNullable(metadataColumn.isNullable());
                emfCol.setPattern(metadataColumn.getPattern());
                emfCol.setPrecision(metadataColumn.getPrecision());
                emfCol.setSourceType(metadataColumn.getSourceType());
                emfCol.setTalendType(metadataColumn.getTalendType());
                emfCol.setDivergency(false);
                emfCol.setSynchronised(false);

            }
        }
    }

    /**
     * Check if Two MetadataColumns are the same..
     * 
     * @param info MetadataColumn
     * @param column MetadataColumn
     * @return isEquivalent.
     */
    private boolean isEquivalent(MetadataColumn info, MetadataColumn column) {

        if (info.getLength() != column.getLength()) {
            return false;
        }
        if (info.getDefaultValue() != null && !info.getDefaultValue().equals(column.getDefaultValue())) {
            return false;
        }
        if (column.getDefaultValue() != null && column.getDefaultValue().length() != 0
                && !column.getDefaultValue().equals(info.getDefaultValue())) {
            return false;
        }
        if (info.isNullable() != column.isNullable()) {
            return false;
        }
        if (info.isKey() != column.isKey()) {
            return false;
        }
        if (info.getPrecision() != column.getPrecision()) {
            return false;
        }
        if (info.getSourceType() != null && !info.getSourceType().equals(column.getSourceType())) {
            return false;
        }
        if (info.getComment() != null && info.getComment().length() != 0 && !info.getComment().equals(column.getComment())) {
            return false;
        }
        if (column.getComment() != null && column.getComment().length() != 0 && !column.getComment().equals(info.getComment())) {
            return false;
        }

        if (info.getTalendType() != null && !info.getTalendType().equals(column.getTalendType())) {
            return false;
        }
        if (column.getTalendType() != null && !column.getTalendType().equals(info.getTalendType())) {
            return false;
        }

        return true;
    }

    /**
     * RepositoryNode.
     * 
     * @param repositoryNode RepositoryNode
     * @return RepositoryNodeType
     * @see RepositoryNodeType
     */
    public static RepositoryNodeType getRepositoryType(RepositoryNode repositoryNode) {
        return (RepositoryNodeType) repositoryNode.getProperties(EProperties.CONTENT_TYPE);
    }

    /**
     * be a RepositoryNode with database infomation.
     * 
     * @param repositoryNode RepositoryNode
     * @return RepositoryNode
     */
    public static RepositoryNode getRoot(RepositoryNode repositoryNode) {
        if (getRepositoryType(repositoryNode) == RepositoryNodeType.FOLDER) {
            // return null;
            throw new RuntimeException(Messages.getString("SQLBuilderRepositoryNodeManager.exceptionMessage")); //$NON-NLS-1$
        }

        if (getRepositoryType(repositoryNode) == RepositoryNodeType.DATABASE) {
            return repositoryNode;
        }
        return getRoot(repositoryNode.getParent());
    }

    public void synchronizeAllSqlEditors(SQLBuilderDialog builderDialog) {
        if (builderDialog.getStructureComposite() == null) {
            return;
        }
        List<Query> displayQueries = builderDialog.getStructureComposite().getTreeLabelProvider().getDisplayQueries();
        for (Query activeQuery : displayQueries) {
            CTabItem[] items = builderDialog.getEditorComposite().getTabFolder().getItems();
            for (CTabItem item : items) {
                final boolean b = (item.getData() instanceof Query)
                        && item.getData(TextUtil.KEY) instanceof MultiPageSqlBuilderEditor && activeQuery != null;
                Query data2 = (Query) item.getData();
                if (b && data2.getLabel().equals(activeQuery.getLabel())) {
                    data2.setValue(activeQuery.getValue());
                    data2.setComment(activeQuery.getComment());
                    data2.setLabel(activeQuery.getLabel());
                    updateEditor(activeQuery, (MultiPageSqlBuilderEditor) item.getData("KEY")); //$NON-NLS-1$
                }
            }
        }
    }

    /**
     * qzhang Comment method "updateEditor".
     * 
     * @param activeQuery
     * @param editor
     */
    private void updateEditor(Query activeQuery, MultiPageSqlBuilderEditor editor) {
        AbstractSQLEditorComposite activeEditors = editor.getActiveEditors();
        activeEditors.setEditorContent(activeQuery.getValue());
    }

}

/**
 * dev class global comment. Detailled comment <br/>
 * 
 * $Id: talend-code-templates.xml 1 2006-09-29 17:06:40 +0000 (Fri, 29 Sep 2006) nrousseau $
 * 
 */
class MetadataTableComparator implements Comparator<MetadataTable> {

    public int compare(MetadataTable o1, MetadataTable o2) {
        if (o1.getSourceName() == null || "".equals(o1.getSourceName()) || " ".equals(o1.getSourceName()) //$NON-NLS-1$ //$NON-NLS-2$
                || o2.getSourceName() == null) {
            return -1;
        } else {
            return o1.getSourceName().compareTo(o2.getSourceName());
        }
    }
}

/**
 * dev class global comment. Detailled comment <br/>
 * 
 * $Id: talend-code-templates.xml 1 2006-09-29 17:06:40 +0000 (Fri, 29 Sep 2006) nrousseau $
 * 
 */
class MetadataColumnComparator implements Comparator<MetadataColumn> {

    public int compare(MetadataColumn o1, MetadataColumn o2) {
        if (o1.getOriginalField() == null || "".equals(o1.getOriginalField()) || " ".equals(o1.getOriginalField()) //$NON-NLS-1$ //$NON-NLS-2$
                || o2.getOriginalField() == null) {
            return -1;
        } else {
            return o1.getOriginalField().compareTo(o2.getOriginalField());
        }
    }
}
