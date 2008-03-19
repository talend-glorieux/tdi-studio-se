// ============================================================================
//
// Copyright (C) 2006-2007 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.editor.process;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Translatable;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.util.TransferDropTargetListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Canvas;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.builder.ConvertionHelper;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.core.model.metadata.builder.connection.QueriesConnection;
import org.talend.core.model.metadata.builder.connection.Query;
import org.talend.core.model.metadata.designerproperties.RepositoryToComponentProperty;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.RepositoryObject;
import org.talend.designer.core.DesignerPlugin;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.model.components.EmfComponent;
import org.talend.designer.core.ui.editor.AbstractTalendEditor;
import org.talend.designer.core.ui.editor.TalendEditor;
import org.talend.designer.core.ui.editor.cmd.ChangeValuesFromRepository;
import org.talend.designer.core.ui.editor.cmd.CreateNodeContainerCommand;
import org.talend.designer.core.ui.editor.cmd.PropertyChangeCommand;
import org.talend.designer.core.ui.editor.cmd.QueryGuessCommand;
import org.talend.designer.core.ui.editor.cmd.RepositoryChangeMetadataCommand;
import org.talend.designer.core.ui.editor.cmd.RepositoryChangeQueryCommand;
import org.talend.designer.core.ui.editor.nodecontainer.NodeContainer;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.preferences.TalendDesignerPrefConstants;
import org.talend.repository.model.ERepositoryStatus;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.model.RepositoryNode.EProperties;

/**
 * Performs a native Drop for the talendEditor. see feature
 * 
 * $Id: TalendEditorDropTargetListener.java 1 2006-09-29 17:06:40 +0000 (ææäº, 29 ä¹æ 2006) nrousseau $
 * 
 */
public class TalendEditorDropTargetListener implements TransferDropTargetListener {

    private AbstractTalendEditor editor;

    /**
     * TalendEditorDropTargetListener constructor comment.
     * 
     * @param editor
     */
    public TalendEditorDropTargetListener(AbstractTalendEditor editor) {
        this.editor = editor;
    }

    public Transfer getTransfer() {
        return LocalSelectionTransfer.getTransfer();
    }

    public boolean isEnabled(DropTargetEvent event) {
        return true;
    }

    public void dragEnter(DropTargetEvent event) {

    }

    public void dragLeave(DropTargetEvent event) {

    }

    public void dragOperationChanged(DropTargetEvent event) {

    }

    public void dragOver(DropTargetEvent event) {
        // when the job that selected is the same one in the current editor, the drag event should be disabled.
        IStructuredSelection selection = getSelection();
        if (selection.size() != 1) {
            return;
        }

        if (selection.getFirstElement() instanceof RepositoryNode) {
            RepositoryNode sourceNode = (RepositoryNode) selection.getFirstElement();
            if (equalsJobInCurrentEditor(sourceNode)) {
                event.detail = DND.DROP_NONE;
            }
        }
    }

    private boolean equalsJobInCurrentEditor(RepositoryNode sourceNode) {
        Item item = sourceNode.getObject().getProperty().getItem();
        if (item instanceof ProcessItem) {
            return editor.getProcess().getProperty().getItem().equals(item);
        }
        return false;
    }

    private IStructuredSelection getSelection() {
        LocalSelectionTransfer transfer = (LocalSelectionTransfer) getTransfer();
        IStructuredSelection selection = (IStructuredSelection) transfer.getSelection();
        return selection;
    }

    /**
     * Used to store data temporarily. <br/>
     * 
     * $Id: talend.epf 1 2006-09-29 17:06:40 +0000 (ææäº, 29 ä¹æ 2006) nrousseau $
     * 
     */
    class TempStore {

        // This is the element that user select in the repositoryView.
        RepositoryNode seletetedNode = null;

        EDatabaseComponentName componentName = null;

        IComponent component;

    }

    public void drop(DropTargetEvent event1) {
        boolean isInput = event1.detail == DND.DROP_MOVE;
        List<TempStore> list = new ArrayList<TempStore>();

        IStructuredSelection selection = getSelection();
        for (Object obj : selection.toArray()) {
            if (obj instanceof RepositoryNode) {
                RepositoryNode sourceNode = (RepositoryNode) obj;
                if (equalsJobInCurrentEditor(sourceNode)) {
                    continue;
                }

                Item item = sourceNode.getObject().getProperty().getItem();
                ERepositoryObjectType type = sourceNode.getObjectType();
                if (!(item instanceof ConnectionItem) && !(item instanceof ProcessItem)) {
                    continue;
                }
                TempStore store = new TempStore();
                store.seletetedNode = sourceNode;
                getCorrespondingComponent(item, isInput, store, type);
                if (store.component != null) {
                    list.add(store);
                } else {
                    MessageDialog.openInformation(editor.getEditorSite().getShell(), Messages
                            .getString("TalendEditorDropTargetListener.dngsupportdialog.title"), //$NON-NLS-1$
                            Messages.getString("TalendEditorDropTargetListener.dngsupportdialog.content")); //$NON-NLS-1$
                }
            }
        }

        org.eclipse.swt.graphics.Point swtLocation = new org.eclipse.swt.graphics.Point(event1.x, event1.y);
        Canvas canvas = (Canvas) editor.getViewer().getControl();

        /*
         * translate to Canvas coordinate
         */
        swtLocation = canvas.toControl(swtLocation);
        org.eclipse.swt.graphics.Point size = canvas.getSize();
        /*
         * translate to Viewport coordinate with zoom
         */
        org.eclipse.draw2d.geometry.Point draw2dPosition = new org.eclipse.draw2d.geometry.Point(swtLocation.x, swtLocation.y);

        /*
         * calcule the view port position. Take into acounte the scroll position
         */
        ProcessPart part = (ProcessPart) editor.getViewer().getRootEditPart().getRoot().getChildren().get(0);

        IFigure targetFigure = part.getFigure();
        translateAbsolateToRelative(targetFigure, draw2dPosition);

        // creates every node
        for (Iterator<TempStore> iter = list.iterator(); iter.hasNext();) {
            TempStore store = iter.next();

            RepositoryNode selectedNode = store.seletetedNode;
            IComponent element = store.component;
            Node node = new Node(element);
            IPreferenceStore preferenceStore = DesignerPlugin.getDefault().getPreferenceStore();
            if (preferenceStore.getBoolean(TalendDesignerPrefConstants.USE_REPOSITORY_NAME)) {
                node.setPropertyValue(EParameterName.LABEL.getName(), selectedNode.getObject().getProperty().getLabel());
            }
            processSpecificDBTypeIfSameProduct(store.componentName, node);
            NodeContainer nc = new NodeContainer(node);

            // create the node on the design sheet
            execCommandStack(new CreateNodeContainerCommand((Process) editor.getProcess(), nc, draw2dPosition));
            // initialize the propertiesView

            List<Command> commands = createRefreshingPropertiesCommand(selectedNode, node);
            for (Command command : commands) {
                execCommandStack(command);
            }
            draw2dPosition = draw2dPosition.getCopy();
            draw2dPosition.x += TalendEditor.GRID_SIZE;
            draw2dPosition.y += TalendEditor.GRID_SIZE;

        }

    }

    /**
     * DOC bqian Comment method "createRefreshingPropertiesCommand".
     * 
     * @param selectedNode
     * @param node
     */
    private List<Command> createRefreshingPropertiesCommand(RepositoryNode selectedNode, Node node) {
        List<Command> list = new ArrayList<Command>();
        if (selectedNode.getObject().getProperty().getItem() instanceof ConnectionItem) {
            IElementParameter propertyParam = node.getElementParameterFromField(EParameterFieldType.PROPERTY_TYPE);
            if (propertyParam != null) {
                propertyParam.getChildParameters().get(EParameterName.PROPERTY_TYPE.getName()).setValue(EmfComponent.REPOSITORY);
                propertyParam.getChildParameters().get(EParameterName.REPOSITORY_PROPERTY_TYPE.getName()).setValue(
                        selectedNode.getObject().getProperty().getId());
            }

            ConnectionItem connectionItem = (ConnectionItem) selectedNode.getObject().getProperty().getItem();

            IProxyRepositoryFactory factory = DesignerPlugin.getDefault().getProxyRepositoryFactory();
            Map<String, List<String>> tablesMap = new HashMap<String, List<String>>();

            Map<String, List<String>> queriesMap = new HashMap<String, List<String>>();
            Map<String, IMetadataTable> repositoryTableMap = new HashMap<String, IMetadataTable>();

            List<String> tableNamesList = new ArrayList<String>();
            List<String> tableValuesList = new ArrayList<String>();
            List<String> queryStoreNameList = new ArrayList<String>();
            List<String> queryStoreValuesList = new ArrayList<String>();
            Connection connection = connectionItem.getConnection();
            if (!connection.isReadOnly()) {
                for (Object tableObj : connection.getTables()) {
                    org.talend.core.model.metadata.builder.connection.MetadataTable table;

                    table = (org.talend.core.model.metadata.builder.connection.MetadataTable) tableObj;

                    if (factory.getStatus(connectionItem) != ERepositoryStatus.DELETED) {
                        if (!factory.isDeleted(table)) {
                            String name = getRepositoryAliasName(connectionItem) + ":" //$NON-NLS-1$
                                    + connectionItem.getProperty().getLabel() + " - " + table.getLabel(); //$NON-NLS-1$
                            String value = connectionItem.getProperty().getId() + " - " + table.getLabel(); //$NON-NLS-1$
                            IMetadataTable newTable = ConvertionHelper.convert(table);
                            repositoryTableMap.put(value, newTable);
                            addOrderDisplayNames(tableValuesList, tableNamesList, value, name);
                        }
                    }
                }
            }
            tablesMap.put(connectionItem.getProperty().getId(), tableValuesList);
            IElementParameter schemaParam = node.getElementParameterFromField(EParameterFieldType.SCHEMA_TYPE);
            if (schemaParam != null) {
                IElementParameter repositorySchemaTypeParameter = schemaParam.getChildParameters().get(
                        EParameterName.REPOSITORY_SCHEMA_TYPE.getName());
                if (repositorySchemaTypeParameter != null) {
                    repositorySchemaTypeParameter.setListItemsValue(tableValuesList.toArray(new String[0]));
                }
            }
            if (connection instanceof DatabaseConnection && !connection.isReadOnly()) {
                DatabaseConnection dbConnection = (DatabaseConnection) connection;
                QueriesConnection queriesConnection = dbConnection.getQueries();
                if (queriesConnection != null) {
                    List<Query> qs = queriesConnection.getQuery();
                    for (Query query : qs) {
                        String name = getRepositoryAliasName(connectionItem) + ":" //$NON-NLS-1$
                                + connectionItem.getProperty().getLabel() + " - " + query.getLabel(); //$NON-NLS-1$
                        String value = connectionItem.getProperty().getId() + " - " + query.getLabel(); //$NON-NLS-1$
                        addOrderDisplayNames(queryStoreValuesList, queryStoreNameList, value, name);
                    }
                }
            }
            queriesMap.put(connectionItem.getProperty().getId(), queryStoreValuesList);

            if (propertyParam != null) {
                // command used to set property type
                ChangeValuesFromRepository command1 = new ChangeValuesFromRepository(node, connectionItem.getConnection(),
                        propertyParam.getName() + ":" + EParameterName.REPOSITORY_PROPERTY_TYPE.getName(), selectedNode
                                .getObject().getProperty().getId());

                command1.setMaps(tablesMap, queriesMap, repositoryTableMap);
                list.add(command1);
            }

            // command used to set metadata
            if (selectedNode.getProperties(EProperties.CONTENT_TYPE) == ERepositoryObjectType.METADATA_CON_TABLE) {
                RepositoryObject object = (RepositoryObject) selectedNode.getObject();
                MetadataTable table = (MetadataTable) object.getAdapter(MetadataTable.class);
                String value = connectionItem.getProperty().getId() + " - " + object.getLabel(); //$NON-NLS-1$
                RepositoryChangeMetadataCommand command2 = new RepositoryChangeMetadataCommand(node, schemaParam.getName() + ":"
                        + EParameterName.REPOSITORY_SCHEMA_TYPE.getName(), value, repositoryTableMap.get(value), null);
                list.add(command2);
            }

            // command used to set query
            if (selectedNode.getProperties(EProperties.CONTENT_TYPE) == ERepositoryObjectType.METADATA_CON_QUERY) {
                IElementParameter queryParam = node.getElementParameterFromField(EParameterFieldType.QUERYSTORE_TYPE);

                RepositoryObject object = (RepositoryObject) selectedNode.getObject();
                Query query = (Query) object.getAdapter(Query.class);
                String value = connectionItem.getProperty().getId() + " - " + object.getLabel(); //$NON-NLS-1$
                RepositoryChangeQueryCommand command3 = new RepositoryChangeQueryCommand(node, query, queryParam.getName() + ":"
                        + EParameterName.REPOSITORY_QUERYSTORE_TYPE.getName(), value);
                list.add(command3);
            }
            if (connection instanceof DatabaseConnection) {
                DatabaseConnection connection2 = (DatabaseConnection) connection;
                String schema = connection2.getSchema();
                String dbType = connection2.getDatabaseType();
                QueryGuessCommand queryGuessCommand = null;
                if (node.getMetadataList().size() == 0) {
                    queryGuessCommand = new QueryGuessCommand(node, null, schema, dbType);
                } else {
                    queryGuessCommand = new QueryGuessCommand(node, node.getMetadataList().get(0), schema, dbType);
                }
                list.add(queryGuessCommand);
            }
        } else if (selectedNode.getObject().getProperty().getItem() instanceof ProcessItem) {
            ProcessItem processItem = (ProcessItem) selectedNode.getObject().getProperty().getItem();
            // command used to set job
            String value = processItem.getProperty().getLabel();
            PropertyChangeCommand command4 = new PropertyChangeCommand(node, EParameterName.PROCESS_TYPE_PROCESS.getName(), value);
            list.add(command4);
        }

        return list;
    }

    private String getRepositoryAliasName(ConnectionItem connectionItem) {
        ERepositoryObjectType repositoryObjectType = ERepositoryObjectType.getItemType(connectionItem);
        String aliasName = repositoryObjectType.getAlias();
        Connection connection = connectionItem.getConnection();
        if (connection instanceof DatabaseConnection) {
            String currentDbType = (String) RepositoryToComponentProperty.getValue(connection, "TYPE"); //$NON-NLS-1$
            aliasName += " (" + currentDbType + ")"; //$NON-NLS-1$ //$NON-NLS-2$
        }
        return aliasName;
    }

    private void addOrderDisplayNames(List<String> connectionValuesList, List<String> connectionStringList, String key,
            String name) {
        int i = 0;

        for (; i < connectionStringList.size(); i++) {
            String string = connectionStringList.get(i);
            if (name.compareTo(string) < 0) {
                connectionStringList.add(i, name);
                connectionValuesList.add(i, key);
                break;
            }
        }
        if (connectionStringList.size() == 0 || i == connectionStringList.size()) {
            connectionStringList.add(name);
            connectionValuesList.add(key);
        }
    }

    public void dropAccept(DropTargetEvent event) {
    }

    private void getCorrespondingComponent(Item item, boolean input, TempStore store, ERepositoryObjectType type) {
        EDatabaseComponentName name = EDatabaseComponentName.getCorrespondingComponentName(item, type);
        IComponent component = null;
        if (name != null) {
            String componentName = null;
            if (input) {
                componentName = name.getInputComponentName();
            } else {
                componentName = name.getOutPutComponentName();
            }
            component = editor.getComponent(componentName);
        }
        store.componentName = name;
        store.component = component;
    }

    private void execCommandStack(Command command) {
        CommandStack cs = editor.getCommandStack();
        if (cs != null) {
            cs.execute(command);
        } else {
            command.execute();
        }
    }

    /**
     * see issue 0002439.<br>
     * There are two types of Oracle.
     * 
     * @param name
     * @param node
     */
    private void processSpecificDBTypeIfSameProduct(EDatabaseComponentName name, Node node) {
        // process "Oracle with service name"
        if (name == EDatabaseComponentName.DBORACLESN) {
            IElementParameter p = node.getElementParameter("CONNECTION_TYPE");
            // set value to "ORACLE_SERVICE_NAME"
            p.setValue(p.getListItemsValue()[1]);
        }
    }

    public void translateAbsolateToRelative(IFigure owner, Translatable t) {
        owner.translateToRelative(t);

        Rectangle bounds = owner.getBounds();
        t.performTranslate(-bounds.x, -bounds.y);

    }

    /**
     * Sets the editor.
     * 
     * @param editor the editor to set
     */
    public void setEditor(AbstractTalendEditor editor) {
        this.editor = editor;
    }

}
