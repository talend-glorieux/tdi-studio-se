// ============================================================================
//
// Copyright (C) 2006-2016 Talend Inc. - www.talend.com
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

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorReference;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.runtime.model.components.IComponentConstants;
import org.talend.commons.runtime.xml.XmlUtil;
import org.talend.core.CorePlugin;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.IESBService;
import org.talend.core.PluginChecker;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.context.ContextUtils;
import org.talend.core.model.context.JobContextManager;
import org.talend.core.model.metadata.IEbcdicConstant;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.MetadataToolHelper;
import org.talend.core.model.metadata.QueryUtil;
import org.talend.core.model.metadata.builder.ConvertionHelper;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.FTPConnection;
import org.talend.core.model.metadata.builder.connection.HeaderFooterConnection;
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.core.model.metadata.builder.connection.Query;
import org.talend.core.model.metadata.builder.connection.SAPBWTable;
import org.talend.core.model.metadata.builder.connection.SAPConnection;
import org.talend.core.model.metadata.builder.connection.SAPFunctionUnit;
import org.talend.core.model.metadata.builder.connection.SAPIDocUnit;
import org.talend.core.model.metadata.builder.connection.SalesforceModuleUnit;
import org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection;
import org.talend.core.model.metadata.builder.connection.ValidationRulesConnection;
import org.talend.core.model.metadata.builder.connection.XmlFileConnection;
import org.talend.core.model.metadata.builder.connection.impl.XmlFileConnectionImpl;
import org.talend.core.model.metadata.designerproperties.RepositoryToComponentProperty;
import org.talend.core.model.process.EComponentCategory;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IContext;
import org.talend.core.model.process.IContextManager;
import org.talend.core.model.process.IContextParameter;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.IExternalData;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.process.IProcess2;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.properties.ContextItem;
import org.talend.core.model.properties.DatabaseConnectionItem;
import org.talend.core.model.properties.EbcdicConnectionItem;
import org.talend.core.model.properties.FileItem;
import org.talend.core.model.properties.GenericSchemaConnectionItem;
import org.talend.core.model.properties.HeaderFooterConnectionItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.JobletProcessItem;
import org.talend.core.model.properties.LinkRulesItem;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.Property;
import org.talend.core.model.properties.RulesItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.model.update.AbstractUpdateManager;
import org.talend.core.model.update.EUpdateItemType;
import org.talend.core.model.update.EUpdateResult;
import org.talend.core.model.update.IUpdateItemType;
import org.talend.core.model.update.RepositoryUpdateManager;
import org.talend.core.model.update.UpdateManagerHelper;
import org.talend.core.model.update.UpdateResult;
import org.talend.core.model.update.UpdatesConstants;
import org.talend.core.model.update.extension.UpdateManagerProviderDetector;
import org.talend.core.model.utils.SAPConnectionUtils;
import org.talend.core.model.utils.TalendTextUtils;
import org.talend.core.runtime.services.IGenericWizardService;
import org.talend.core.service.IDesignerMapperService;
import org.talend.core.service.IEBCDICProviderService;
import org.talend.core.service.IMetadataManagmentService;
import org.talend.core.ui.ICDCProviderService;
import org.talend.core.ui.IJobletProviderService;
import org.talend.core.ui.component.ComponentsFactoryProvider;
import org.talend.cwm.helper.SAPBWTableHelper;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.model.components.ElementParameter;
import org.talend.designer.core.model.components.EmfComponent;
import org.talend.designer.core.model.process.AbstractProcessProvider;
import org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.update.UpdateCheckResult;
import org.talend.designer.core.ui.editor.update.UpdateManagerUtils;
import org.talend.designer.core.utils.SAPParametersUtils;
import org.talend.metadata.managment.ui.utils.ConnectionContextHelper;
import org.talend.repository.UpdateRepositoryUtils;

/**
 * ggu class global comment. Detailled comment
 */
public class ProcessUpdateManager extends AbstractUpdateManager {

    /**
     * for joblet
     */
    private AbstractProcessProvider jobletProcessProvider = AbstractProcessProvider
            .findProcessProviderFromPID(IComponent.JOBLET_PID);

    private Map<String, Date> jobletReferenceMap = new HashMap<String, Date>();

    private Process process = null;

    public ProcessUpdateManager(org.talend.designer.core.ui.editor.process.Process process) {
        super();
        if (process == null) {
            throw new RuntimeException("The argument is null."); //$NON-NLS-1$
        }
        this.process = process;

    }

    @Override
    public void retrieveRefInformation() {
        jobletReferenceMap.clear();

        if (jobletProcessProvider == null) {
            return;
        }
        for (INode node : this.getProcess().getGraphicalNodes()) {
            Item jobletItem = jobletProcessProvider.getJobletItem(node);
            if (jobletItem != null) {
                jobletReferenceMap.put(jobletItem.getProperty().getId(), jobletItem.getProperty().getModificationDate());
            }
        }
    }

    public Process getProcess() {
        return this.process;
    }

    /*
     * zli check context group
     */

    private List<UpdateResult> checkGroupContext(boolean onlySimpleShow) {
        List<UpdateResult> contextResults = new ArrayList<UpdateResult>();
        final IContextManager contextManager = getProcess().getContextManager();
        List<IContext> addGroupContext = ((JobContextManager) contextManager).getAddGroupContext();
        Map<ContextItem, List<IContext>> addContextGroupMap = ((JobContextManager) contextManager).getAddContextGroupMap();

        List<IContext> removeGroupContext = ((JobContextManager) contextManager).getRemoveGroupContext();
        Map<ContextItem, List<IContext>> removeContextGroupMap = ((JobContextManager) contextManager).getRemoveContextGroupMap();

        Map<IContext, String> renameGroupContext = ((JobContextManager) contextManager).getRenameGroupContext();
        Map<ContextItem, List<IContext>> renameContextGroupMap = ((JobContextManager) contextManager).getRenameContextGroupMap();

        List<IContext> listContext = contextManager.getListContext();

        List<IProcess2> openedProcesses = UpdateManagerUtils.getOpenedProcess();

        for (ContextItem item : addContextGroupMap.keySet()) {

            List<IContext> existedContextGroup = new ArrayList<IContext>();

            if (addGroupContext.size() > 0) {
                for (int i = 0; i < addGroupContext.size(); i++) {
                    IContext context = addGroupContext.get(i);
                    for (int j = 0; j < listContext.size(); j++) {
                        if (context.getName().equals(listContext.get(j).getName())) {
                            existedContextGroup.add(context);
                            break;
                        }
                    }
                }
                addGroupContext.removeAll(existedContextGroup);
            }

            if (addGroupContext.size() > 0) {
                for (IContext context : addGroupContext) {

                    UpdateCheckResult result = new UpdateCheckResult(context);
                    String remark = UpdateRepositoryUtils.getRepositorySourceName(item);
                    result.setResult(EUpdateItemType.CONTEXT_GROUP, EUpdateResult.ADD, item, remark);
                    if (!openedProcesses.contains(getProcess())) {
                        result.setFromItem(true);
                    }
                    result.setJob(getProcess());
                    setConfigrationForReadOnlyJob(result);
                    contextResults.add(result);
                }
            }
        }

        for (ContextItem item : removeContextGroupMap.keySet()) {

            List<IContext> notExistedContextGroup = new ArrayList<IContext>();

            if (removeGroupContext.size() > 0) {
                for (int i = 0; i < removeGroupContext.size(); i++) {
                    IContext context = removeGroupContext.get(i);
                    boolean haveFound = false;
                    for (int j = 0; j < listContext.size(); j++) {
                        if (context.getName().equals(listContext.get(j).getName())) {
                            haveFound = true;
                            break;
                        }
                    }
                    if (!haveFound) {
                        notExistedContextGroup.add(context);
                    }
                }
                removeGroupContext.removeAll(notExistedContextGroup);
            }

            if (removeGroupContext.size() > 0) {
                for (IContext context : removeGroupContext) {

                    UpdateCheckResult result = new UpdateCheckResult(context);
                    String remark = UpdateRepositoryUtils.getRepositorySourceName(item);
                    result.setResult(EUpdateItemType.CONTEXT_GROUP, EUpdateResult.DELETE, item, remark);
                    if (!openedProcesses.contains(getProcess())) {
                        result.setFromItem(true);
                    }
                    result.setJob(getProcess());
                    setConfigrationForReadOnlyJob(result);
                    contextResults.add(result);
                }
            }
        }

        Map<IContext, String> temRenameGroupContext = new HashMap<IContext, String>();
        temRenameGroupContext.putAll(renameGroupContext);
        for (ContextItem item : renameContextGroupMap.keySet()) {

            if (renameGroupContext.size() > 0) {
                for (IContext context : temRenameGroupContext.keySet()) {
                    // IContext context = renameGroupContext.get(i);
                    boolean haveFound = false;
                    for (int j = 0; j < listContext.size(); j++) {
                        if (temRenameGroupContext.get(context).equals(listContext.get(j).getName())) {
                            haveFound = true;
                            break;
                        }
                    }
                    if (!haveFound) {
                        renameGroupContext.remove(context);
                    }
                }
            }

            if (renameGroupContext.size() > 0) {
                for (IContext context : renameGroupContext.keySet()) {

                    UpdateCheckResult result = new UpdateCheckResult(context);
                    String remark = UpdateRepositoryUtils.getRepositorySourceName(item);
                    result.setResult(EUpdateItemType.CONTEXT_GROUP, EUpdateResult.RENAME, item, remark);
                    if (!openedProcesses.contains(getProcess())) {
                        result.setFromItem(true);
                    }
                    result.setJob(getProcess());
                    setConfigrationForReadOnlyJob(result);
                    contextResults.add(result);
                }
            }
        }

        return contextResults;
    }

    /*
     * check context.
     */
    private List<UpdateResult> checkContext(boolean onlySimpleShow) {
        List<UpdateResult> contextResults = new ArrayList<UpdateResult>();
        final IContextManager contextManager = getProcess().getContextManager();
        // record the unsame
        ContextItemParamMap unsameMap = new ContextItemParamMap();
        // rename
        ContextItemParamMap renamedMap = new ContextItemParamMap();
        // built in
        ContextItemParamMap builtInMap = new ContextItemParamMap();
        Set<String> builtInSet = new HashSet<String>();

        Map<ContextItem, Map<String, String>> repositoryRenamedMap = ((JobContextManager) contextManager)
                .getRepositoryRenamedMap();

        ContextItemParamMap deleteParams = new ContextItemParamMap();

        final List<ContextItem> allContextItem = ContextUtils.getAllContextItem();

        Set<String> refContextIds = new HashSet<String>();

        List<IProcess2> openedProcesses = UpdateManagerUtils.getOpenedProcess();

        for (IContext context : contextManager.getListContext()) {
            for (IContextParameter param : context.getContextParameterList()) {
                if (!param.isBuiltIn()) {
                    String source = param.getSource();
                    String paramName = param.getName();
                    refContextIds.add(source);
                    // rename
                    boolean renamed = false;
                    for (ContextItem item : repositoryRenamedMap.keySet()) {
                        if (source.equals(item.getProperty().getId())) {
                            String newName = getRenamedVarName(paramName, repositoryRenamedMap.get(item));
                            if (newName != null && !newName.equals(paramName)) {
                                renamedMap.add(item, paramName);
                                renamed = true;
                            }
                        }
                    }
                    if (!renamed) {
                        // update
                        final Item contextItem = ContextUtils.getRepositoryContextItemById(source);
                        boolean builtin = true;
                        if (contextItem != null) {
                            if (contextItem instanceof ContextItem) {
                                final ContextType contextType = ContextUtils.getContextTypeByName((ContextItem) contextItem,
                                        context.getName(), true);
                                if (contextType != null) {
                                    final ContextParameterType contextParameterType = ContextUtils.getContextParameterTypeByName(
                                            contextType, paramName);
                                    if (contextParameterType != null) {
                                        if (onlySimpleShow
                                                || !ContextUtils.samePropertiesForContextParameter(param, contextParameterType)) {
                                            unsameMap.add(contextItem, paramName);
                                        }
                                        builtin = false;
                                    } else {
                                        // delete context variable
                                        if (ContextUtils.isPropagateContextVariable()) {
                                            deleteParams.add(contextItem, paramName);
                                            builtin = false;
                                        }
                                    }
                                }
                            } else if (contextItem instanceof JobletProcessItem) {
                                builtin = false;
                            } else if (contextItem instanceof ProcessItem) {
                                builtin = false;
                            }
                        }
                        if (builtin) {
                            // built in
                            if (contextItem != null) {
                                builtInMap.add(contextItem, paramName);
                            } else {
                                builtInSet.add(paramName);
                            }
                        }
                    }
                }
            }
        }
        // built-in
        if (contextManager instanceof JobContextManager) { // add the lost source for init process
            Set<String> lostParameters = ((JobContextManager) contextManager).getLostParameters();
            if (lostParameters != null && !lostParameters.isEmpty()) {
                builtInSet.addAll(lostParameters);
                lostParameters.clear();
            }
        }
        if (!builtInSet.isEmpty()) {
            UpdateCheckResult result = new UpdateCheckResult(builtInSet);
            result.setResult(EUpdateItemType.CONTEXT, EUpdateResult.BUIL_IN);
            if (!openedProcesses.contains(getProcess())) {
                result.setFromItem(true);
            }
            result.setJob(getProcess());
            setConfigrationForReadOnlyJob(result);
            contextResults.add(result);
        }
        if (!builtInMap.isEmpty()) {
            for (Item item : builtInMap.getContexts()) {
                Set<String> names = builtInMap.get(item);
                if (names != null && !names.isEmpty()) {
                    UpdateCheckResult result = new UpdateCheckResult(names);
                    result.setResult(EUpdateItemType.CONTEXT, EUpdateResult.BUIL_IN, null,
                            UpdateRepositoryUtils.getRepositorySourceName(item));
                    if (!openedProcesses.contains(getProcess())) {
                        result.setFromItem(true);
                    }
                    result.setJob(getProcess());
                    setConfigrationForReadOnlyJob(result);
                    contextResults.add(result);
                }
            }
        }
        // see 0004661: Add an option to propagate when add or remove a variable in a repository context to
        // jobs/joblets.
        checkPropagateContextVariable(contextResults, contextManager, deleteParams, allContextItem, refContextIds);

        // update
        if (!unsameMap.isEmpty()) {
            for (Item item : unsameMap.getContexts()) {
                Set<String> names = unsameMap.get(item);
                if (names != null && !names.isEmpty()) {
                    collectUpdateResult(contextResults, EUpdateItemType.CONTEXT, EUpdateResult.UPDATE, item, names);
                }
            }
        }
        // rename
        if (!renamedMap.isEmpty()) {
            for (Item item : renamedMap.getContexts()) {
                Map<String, String> nameMap = repositoryRenamedMap.get(item);
                if (nameMap != null && !nameMap.isEmpty()) {
                    for (String newName : nameMap.keySet()) {
                        String oldName = nameMap.get(newName);
                        if (newName.equals(oldName)) {
                            continue;
                        }
                        Set<String> nameSet = new HashSet<String>();
                        nameSet.add(oldName);

                        List<Object> parameterList = new ArrayList<Object>();
                        parameterList.add(item);
                        parameterList.add(oldName);
                        parameterList.add(newName);

                        UpdateCheckResult result = new UpdateCheckResult(nameSet);
                        result.setResult(EUpdateItemType.CONTEXT, EUpdateResult.RENAME, parameterList,
                                UpdateRepositoryUtils.getRepositorySourceName(item));
                        if (!openedProcesses.contains(getProcess())) {
                            result.setFromItem(true);
                        }
                        result.setJob(getProcess());
                        // if (!isOpenedProcess(getProcess())) {
                        // result.setItemProcess(getProcess());
                        // }

                        setConfigrationForReadOnlyJob(result);
                        contextResults.add(result);
                    }
                }
            }
        }
        repositoryRenamedMap.clear();
        return contextResults;
    }

    /**
     * propagate when add or remove a variable in a repository context to jobs/joblets.
     * 
     * @param contextResults
     * @param contextManager
     * @param deleteParams
     * @param allContextItem
     * @param refContextIds
     */
    private void checkPropagateContextVariable(List<UpdateResult> contextResults, final IContextManager contextManager,
            ContextItemParamMap deleteParams, final List<ContextItem> allContextItem, Set<String> refContextIds) {
        if (ContextUtils.isPropagateContextVariable()) {
            // check newly added parameter
            Map<ContextItem, Set<String>> newParametersMap = ((JobContextManager) contextManager).getNewParametersMap();
            if (newParametersMap != null) {
                // improve lookup speed
                Map<String, ContextItem> contextItemsMap = new HashMap<String, ContextItem>();
                for (ContextItem contextItem : allContextItem) {
                    contextItemsMap.put(contextItem.getProperty().getId(), contextItem);
                }

                for (String id : refContextIds) {
                    ContextItem contextItem = contextItemsMap.get(id);
                    Set<String> names = newParametersMap.get(contextItem);
                    if (names == null || names.isEmpty()) {
                        continue;
                    }
                    collectUpdateResult(contextResults, EUpdateItemType.CONTEXT, EUpdateResult.ADD, contextItem, names);
                }
            }

            // delete
            if (!deleteParams.isEmpty()) {
                for (Item item : deleteParams.getContexts()) {
                    Set<String> names = deleteParams.get(item);
                    if (!names.isEmpty()) {
                        collectUpdateResult(contextResults, EUpdateItemType.CONTEXT, EUpdateResult.DELETE, item, names);
                    }
                }
            }
        }
    }

    private UpdateCheckResult collectUpdateResult(List<UpdateResult> contextResults, EUpdateItemType itemType,
            EUpdateResult resulstType, Item contextItem, Object names) {
        UpdateCheckResult result = new UpdateCheckResult(names);
        result.setResult(itemType, resulstType, contextItem, UpdateRepositoryUtils.getRepositorySourceName(contextItem));
        List<IProcess2> openedProcesses = UpdateManagerUtils.getOpenedProcess();
        if (!openedProcesses.contains(getProcess())) {
            result.setFromItem(true);
        }
        result.setJob(getProcess());
        setConfigrationForReadOnlyJob(result);
        contextResults.add(result);
        return result;
    }

    private List<Map<String, Object>> collectHadoopPropertiesList(List jobHadoopPropertyList) {
        List<Map<String, Object>> filterBuildInList = new ArrayList<Map<String, Object>>();
        for (Object map : jobHadoopPropertyList) {
            if (map instanceof HashMap) {
                HashMap<String, Object> oldMap = (HashMap<String, Object>) map;
                filterBuildInList.add((Map<String, Object>) oldMap.clone());
            }
        }
        Iterator<Map<String, Object>> propertyIter = filterBuildInList.iterator();
        while (propertyIter.hasNext()) {
            Map<String, Object> oldMap = propertyIter.next();
            if (oldMap != null && oldMap.size() > 0) {
                for (Map.Entry<String, Object> entry : oldMap.entrySet()) {
                    if ("BUILDIN".equals(entry.getKey())) {
                        if (Boolean.valueOf((String) entry.getValue())) {
                            propertyIter.remove();
                        }
                    }
                }
            }
        }
        return filterBuildInList;
    }

    private static boolean isOpenedProcess(Process curProcess) {
        IEditorReference[] reference = RepositoryUpdateManager.getEditors();
        List<IProcess2> openedProcessList = CorePlugin.getDefault().getDesignerCoreService().getOpenedProcess(reference);
        for (IProcess2 process : openedProcessList) {
            Property property = curProcess.getProperty();
            if (process.getId().equals(property.getId()) && process.getName().equals(property.getLabel())
                    && process.getVersion().equals(property.getVersion())) {
                return true;
            }
        }
        return false;
    }

    private static String getRenamedVarName(final String varName, Map<String, String> renamedMap) {
        if (varName == null || renamedMap == null || renamedMap.isEmpty()) {
            return null;
        }

        Set<String> keySet = renamedMap.keySet();
        for (String newName : keySet) {
            String oldName = renamedMap.get(newName);
            if (varName.equals(oldName)) {
                return newName;
            }
        }
        return null;
    }

    /*
     * check job settings parameters.
     */
    private List<UpdateResult> checkMainParameters(EUpdateItemType type, boolean onlySimpleShow) {
        List<UpdateResult> mainResults = new ArrayList<UpdateResult>();
        switch (type) {
        case JOB_PROPERTY_MAPREDUCE:
            if (ComponentCategory.CATEGORY_4_MAPREDUCE.getName().equals(getProcess().getComponentsType())) {
                mainResults.addAll(checkJobSettingsParameters(EComponentCategory.MAPREDUCE_JOB_CONFIG_FOR_HADOOP, type,
                        onlySimpleShow));
            } else if (ComponentCategory.CATEGORY_4_SPARK.getName().equals(getProcess().getComponentsType())) {
                mainResults.addAll(checkJobSettingsParameters(EComponentCategory.SPARK_JOB_CONFIG, type, onlySimpleShow));
            }
            break;
        case JOB_PROPERTY_STORM:
            if (ComponentCategory.CATEGORY_4_SPARKSTREAMING.getName().equals(getProcess().getComponentsType())) {
                mainResults.addAll(checkJobSettingsParameters(EComponentCategory.SPARK_JOB_CONFIG, type, onlySimpleShow));
            }
            break;
        case JOB_PROPERTY_EXTRA:
            mainResults.addAll(checkJobSettingsParameters(EComponentCategory.EXTRA, type, onlySimpleShow));
            break;
        case JOB_PROPERTY_STATS_LOGS:
            mainResults.addAll(checkJobSettingsParameters(EComponentCategory.STATSANDLOGS, type, onlySimpleShow));
            break;
        case JOB_PROPERTY_HEADERFOOTER:
            mainResults.addAll(checkJobSettingsHeaderFooterParameters(EComponentCategory.HEADERFOOTER, type, onlySimpleShow));
            break;
        default:
            return Collections.emptyList();
        }

        return mainResults;
    }

    private List<UpdateResult> checkJobSettingsHeaderFooterParameters(EComponentCategory category, EUpdateItemType type,
            boolean onlySimpleShow) {
        List<UpdateResult> jobSettingsResults = new ArrayList<UpdateResult>();
        boolean sameValues = true;

        List<IProcess2> openedProcesses = UpdateManagerUtils.getOpenedProcess();

        final Process process2 = getProcess();
        UpdateCheckResult result = null;

        IElementParameter headerIDParameter = process2.getElementParameter(EParameterName.HEADERFOOTER_HEADERID.getName());
        if (headerIDParameter == null) {
            return jobSettingsResults;
        }
        IRepositoryViewObject lastVersion = UpdateRepositoryUtils.getRepositoryObjectById((String) headerIDParameter.getValue());
        HeaderFooterConnection repositoryConnection = null;
        String source = null;
        if (lastVersion != null) {
            final Item item = lastVersion.getProperty().getItem();
            if (item != null && item instanceof ConnectionItem) {
                source = UpdateRepositoryUtils.getRepositorySourceName(item);
                repositoryConnection = (HeaderFooterConnection) ((HeaderFooterConnectionItem) item).getConnection();
            }
        }

        if (repositoryConnection != null) {
            Boolean isHeader = repositoryConnection.isIsHeader();
            String libraries = repositoryConnection.getLibraries();
            String mainCode = repositoryConnection.getMainCode();
            String imports = repositoryConnection.getImports();
            for (IElementParameter param : getProcess().getElementParameters()) {
                if (param.getCategory() == category && isHeader) {

                    if (param.getName().equals(EParameterName.HEADERFOOTER_HEADERID.getName())) {

                        Boolean value = (Boolean) process2.getElementParameter(EParameterName.HEADER_ENABLED.getName())
                                .getValue();
                        final Object headerLibrary = process2.getElementParameter(EParameterName.HEADER_LIBRARY.getName())
                                .getValue();
                        String value2 = null;
                        if (headerLibrary != null) {
                            value2 = (String) headerLibrary;
                        }
                        Object headMainCode = process2.getElementParameter(EParameterName.HEADER_CODE.getName()).getValue();
                        String value3 = null;
                        if (headMainCode != null) {
                            value3 = (String) headMainCode;
                        }

                        Object headImport = process2.getElementParameter(EParameterName.HEADER_IMPORT.getName()).getValue();
                        String value4 = null;
                        if (headImport != null) {
                            value4 = (String) headImport;
                        }
                        boolean librariesIsSame = (value2 != null && !"".equals(value2) && value2.equals(libraries)) //$NON-NLS-1$
                                || ((value2 == null || "".equals(value2)) && libraries == null); //$NON-NLS-1$
                        boolean mainCodeIsSame = (value3 != null && !"".equals(value3) && value3.equals(mainCode)) //$NON-NLS-1$
                                || ((value3 == null || "".equals(value3)) && mainCode == null); //$NON-NLS-1$
                        boolean importsIsSame = (value4 != null && !"".equals(value4) && value4.equals(imports)) //$NON-NLS-1$
                                || ((value4 == null || "".equals(value4)) && imports == null); //$NON-NLS-1$
                        if (!(value && librariesIsSame && mainCodeIsSame && importsIsSame)) {
                            sameValues = false;
                        }

                        if (onlySimpleShow || !sameValues) {
                            result = new UpdateCheckResult(getProcess());
                            result.setResult(type, EUpdateResult.UPDATE, repositoryConnection, source);
                            if (result != null) {
                                if (!openedProcesses.contains(getProcess())) {
                                    result.setFromItem(true);
                                }
                                result.setJob(getProcess());
                                setConfigrationForReadOnlyJob(result);
                                jobSettingsResults.add(result);
                            }

                        }
                    }

                }
            }

            IElementParameter footerIDParameter = process2.getElementParameter(EParameterName.HEADERFOOTER_FOOTERID.getName());
            IRepositoryViewObject footerLastVersion = UpdateRepositoryUtils.getRepositoryObjectById((String) footerIDParameter
                    .getValue());
            HeaderFooterConnection footerRepositoryConnection = null;
            String footerSource = null;
            if (footerLastVersion != null) {
                Item item = footerLastVersion.getProperty().getItem();
                if (item != null && item instanceof ConnectionItem) {
                    footerSource = UpdateRepositoryUtils.getRepositorySourceName(item);
                    footerRepositoryConnection = (HeaderFooterConnection) ((HeaderFooterConnectionItem) item).getConnection();
                }
            }

            if (footerRepositoryConnection != null) {
                Boolean footerIsHeader = footerRepositoryConnection.isIsHeader();
                String footerLibraries = footerRepositoryConnection.getLibraries();
                String footerMainCode = footerRepositoryConnection.getMainCode();
                String footerImports = footerRepositoryConnection.getImports();
                for (IElementParameter param : getProcess().getElementParameters()) {
                    if (param.getCategory() == category && !footerIsHeader) {

                        if (param.getName().equals(EParameterName.HEADERFOOTER_FOOTERID.getName())) {

                            Boolean value = (Boolean) process2.getElementParameter(EParameterName.FOOTER_ENABLED.getName())
                                    .getValue();
                            Object Library = process2.getElementParameter(EParameterName.FOOTER_LIBRARY.getName()).getValue();
                            String value2 = null;
                            if (Library != null) {
                                value2 = (String) Library;
                            }
                            Object mainCode2 = process2.getElementParameter(EParameterName.FOOTER_CODE.getName()).getValue();
                            String value3 = null;
                            if (mainCode2 != null) {
                                value3 = (String) mainCode2;
                            }

                            Object footerImport = process2.getElementParameter(EParameterName.FOOTER_IMPORT.getName()).getValue();
                            String value4 = null;
                            if (footerMainCode != null) {
                                value4 = (String) footerImport;
                            }

                            boolean librariesIsSame = (value2 != null && !"".equals(value2) && value2.equals(footerLibraries)) //$NON-NLS-1$
                                    || ((value2 == null || "".equals(value2)) && footerLibraries == null); //$NON-NLS-1$
                            boolean mainCodeIsSame = (value3 != null && !"".equals(value3) && value3.equals(footerMainCode)) //$NON-NLS-1$
                                    || ((value3 == null || "".equals(value3)) && footerMainCode == null); //$NON-NLS-1$
                            boolean importsIsSame = (value4 != null && !"".equals(value4) && value4.equals(footerImports)) //$NON-NLS-1$
                                    || ((value4 == null || "".equals(value4)) && footerImports == null); //$NON-NLS-1$

                            if (!(value && librariesIsSame && mainCodeIsSame && importsIsSame)) {
                                sameValues = false;
                            }

                            if (onlySimpleShow || !sameValues) {
                                result = new UpdateCheckResult(getProcess());
                                result.setResult(type, EUpdateResult.UPDATE, footerRepositoryConnection, footerSource);
                                if (result != null) {
                                    if (!openedProcesses.contains(getProcess())) {
                                        result.setFromItem(true);
                                    }
                                    result.setJob(getProcess());
                                    setConfigrationForReadOnlyJob(result);
                                    jobSettingsResults.add(result);
                                }

                            }
                        }

                    }
                }
            }

        }

        return jobSettingsResults;

    }

    private List<UpdateResult> checkJobSettingsParameters(EComponentCategory category, EUpdateItemType type,
            boolean onlySimpleShow) {
        List<UpdateResult> jobSettingsResults = new ArrayList<UpdateResult>();
        final IElementParameter propertyTypeParam = getProcess().getElementParameterFromField(EParameterFieldType.PROPERTY_TYPE,
                category);

        if (propertyTypeParam != null && propertyTypeParam.isShow(getProcess().getElementParameters())) {
            final Map<String, IElementParameter> childParameters = propertyTypeParam.getChildParameters();
            if (childParameters == null) {
                return Collections.emptyList();
            }

            List<IProcess2> openedProcesses = UpdateManagerUtils.getOpenedProcess();

            IElementParameter elementParameter = childParameters.get(EParameterName.PROPERTY_TYPE.getName());
            // is repository
            if (elementParameter != null && EmfComponent.REPOSITORY.equals(elementParameter.getValue())) {
                IElementParameter repositoryParam = childParameters.get(EParameterName.REPOSITORY_PROPERTY_TYPE.getName());
                if (repositoryParam != null) {

                    // get the connection
                    Connection repositoryConnection = null;
                    String source = null;
                    IRepositoryViewObject lastVersion = UpdateRepositoryUtils.getRepositoryObjectById((String) repositoryParam
                            .getValue());
                    if (lastVersion != null) {
                        final Item item = lastVersion.getProperty().getItem();
                        if (item != null && item instanceof ConnectionItem) {
                            source = UpdateRepositoryUtils.getRepositorySourceName(item);
                            repositoryConnection = ((ConnectionItem) item).getConnection();
                        }
                    }
                    UpdateCheckResult result = null;

                    if (repositoryConnection != null) {
                        boolean sameValues = true;
                        for (IElementParameter param : getProcess().getElementParameters()) {
                            if (param.getCategory() == category) {
                                String repositoryValue = param.getRepositoryValue();
                                if (param.isShow(getProcess().getElementParameters()) && (repositoryValue != null)
                                        && !param.getName().equals(EParameterName.PROPERTY_TYPE.getName())) {
                                    Object repValue = RepositoryToComponentProperty.getValue(repositoryConnection,
                                            repositoryValue, null);
                                    if (repValue == null) {
                                        continue;
                                    }
                                    if (repositoryValue.equals(UpdatesConstants.TYPE)) { // datebase type
                                        boolean found = false;
                                        String[] list = param.getListRepositoryItems();
                                        for (int i = 0; (i < list.length) && (!found); i++) {
                                            if (repValue.equals(list[i])) {
                                                found = true;
                                            }
                                            // if (repValue.toString().equals("Oracle")) {
                                            // if (list[i].equals("ORACLE_SID")) {
                                            // found = true;
                                            // }
                                            // }
                                        }
                                        if (!found) {
                                            sameValues = false;
                                        }

                                    } else {
                                        // check the value
                                        if (param.getName().equals("HADOOP_ADVANCED_PROPERTIES")) {
                                            if (param.getValue() instanceof List && repValue instanceof List) {
                                                // TDI-29719: since the feature TDI-27468 added.we must check for the
                                                // property/value for the list
                                                List repoHadoopPros = (List) repValue;
                                                List<Map<String, Object>> jobHadoopPros = (List<Map<String, Object>>) param
                                                        .getValue();
                                                List<Map<String, Object>> filterBuildInList = collectHadoopPropertiesList(jobHadoopPros);
                                                if (repoHadoopPros.size() != filterBuildInList.size()) {
                                                    sameValues = false;
                                                } else {
                                                    for (int i = 0; i < filterBuildInList.size(); i++) {
                                                        Map<String, Object> oldMap = filterBuildInList.get(i);
                                                        Map<String, Object> objectMap = (Map<String, Object>) repoHadoopPros
                                                                .get(i);
                                                        if (oldMap.get("PROPERTY").equals(objectMap.get("PROPERTY"))
                                                                && oldMap.get("VALUE").equals(objectMap.get("VALUE"))) { //$NON-NLS-1$
                                                            sameValues = true;
                                                        } else {
                                                            sameValues = false;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (!param.getValue().equals(repValue)) {
                                            sameValues = false;
                                        }
                                    }
                                }
                                if (!sameValues) {
                                    break;
                                }
                            }
                        }
                        if (onlySimpleShow || !sameValues) {
                            result = new UpdateCheckResult(getProcess());
                            result.setResult(type, EUpdateResult.UPDATE, repositoryConnection, source);

                        }
                        for (IElementParameter param : getProcess().getElementParameters()) {
                            String repositoryValue = param.getRepositoryValue();
                            if (param.isShow(getProcess().getElementParameters()) && (repositoryValue != null)
                                    && (!param.getName().equals(EParameterName.PROPERTY_TYPE.getName()))
                                    && param.getCategory() == category) {
                                param.setRepositoryValueUsed(true);
                                param.setReadOnly(true);
                            }
                        }
                        // for context mode(bug 5198)
                        List<UpdateResult> contextResults = checkParameterContextMode(getProcess().getElementParameters(),
                                (ConnectionItem) lastVersion.getProperty().getItem(), category);
                        if (contextResults != null) {
                            jobSettingsResults.addAll(contextResults);
                        }
                    } else {
                        result = new UpdateCheckResult(getProcess());
                        result.setResult(type, EUpdateResult.BUIL_IN);
                    }

                    if (result != null) {
                        if (!openedProcesses.contains(getProcess())) {
                            result.setFromItem(true);
                        }
                        result.setJob(getProcess());
                        setConfigrationForReadOnlyJob(result);
                        jobSettingsResults.add(result);
                    }
                }
            }
        }
        return jobSettingsResults;
    }

    /*
     * check node parameters.
     */
    @SuppressWarnings("unchecked")
    private List<UpdateResult> checkNodesParameters(EUpdateItemType type, boolean onlySimpleShow) {
        List<UpdateResult> nodesResults = new ArrayList<UpdateResult>();
        for (Node node : (List<Node>) getProcess().getGraphicalNodes()) {
            switch (type) {
            case NODE_SCHEMA:
                nodesResults.addAll(checkNodeSchemaFromRepository(node, onlySimpleShow));
                break;
            case NODE_PROPERTY:
                nodesResults.addAll(checkNodePropertiesFromRepository(node, onlySimpleShow));
                break;
            case NODE_QUERY:
                nodesResults.addAll(checkNodeQueryFromRepository(node, onlySimpleShow));
                break;
            case NODE_SAP_FUNCTION:
                nodesResults.addAll(checkNodeSAPFunctionFromRepository(node, onlySimpleShow));
                break;
            case NODE_SAP_IDOC:
                nodesResults.addAll(checkNodeSAPIDocFromRepository(node, onlySimpleShow));
                break;
            case NODE_VALIDATION_RULE:
                nodesResults.addAll(checkNodeValidationRuleFromRepository(node, onlySimpleShow));
                break;
            default:
                return Collections.emptyList();
            }
        }
        getSchemaRenamedMap().clear();
        return nodesResults;
    }

    /**
     * DOC ycbai Comment method "checkNodeValidationRuleFromRepository".
     * 
     * @param node
     * @param onlySimpleShow
     * @return
     */
    private List<UpdateResult> checkNodeValidationRuleFromRepository(final Node node, boolean onlySimpleShow) {
        if (node == null || !isFromRepository()) {
            return Collections.emptyList();
        }
        boolean same = true;
        IElementParameter isCheckparam = node.getElementParameter(EParameterName.VALIDATION_RULES.getName());
        if (isCheckparam != null && isCheckparam.getValue() != null && (Boolean) isCheckparam.getValue() == true) {
            List<UpdateResult> queryResults = new ArrayList<UpdateResult>();
            String propertyValue = (String) node.getPropertyValue(EParameterName.REPOSITORY_VALIDATION_RULE_TYPE.getName());
            ConnectionItem connectionItem = UpdateRepositoryUtils.getConnectionItemByItemId(propertyValue);
            ValidationRulesConnection connection = null;
            if (connectionItem != null) {
                connection = (ValidationRulesConnection) connectionItem.getConnection();
                if (connection != null) {
                    same = false;
                }
            }
            if (!same || onlySimpleShow) {
                String source = UpdateRepositoryUtils.getRepositorySourceName(connectionItem);
                UpdateCheckResult result = new UpdateCheckResult(node);
                result.setResult(EUpdateItemType.NODE_VALIDATION_RULE, EUpdateResult.UPDATE, connection, source);
                List<IProcess2> openedProcesses = UpdateManagerUtils.getOpenedProcess();
                if (!openedProcesses.contains(getProcess())) {
                    result.setFromItem(true);
                }
                result.setJob(getProcess());
                setConfigrationForReadOnlyJob(result);
                queryResults.add(result);
                return queryResults;
            }
        }

        return Collections.emptyList();
    }

    private List<UpdateResult> checkNodeSAPIDocFromRepository(final Node node, boolean onlySimpleShow) {
        if (node == null) {
            return Collections.emptyList();
        }
        List<UpdateResult> updateResults = new ArrayList<UpdateResult>();
        String propertyType = (String) node.getPropertyValue(EParameterName.PROPERTY_TYPE.getName());
        if (propertyType != null) {
            if (propertyType.equals(EmfComponent.REPOSITORY)) {
                String propertyValue = (String) node.getPropertyValue(EParameterName.REPOSITORY_PROPERTY_TYPE.getName());

                ConnectionItem connectionItem = null;
                connectionItem = UpdateRepositoryUtils.getConnectionItemByItemId(propertyValue);

                // IRepositoryViewObject footerLastVersion = UpdateRepositoryUtils.getRepositoryObjectById((String)
                // footerIDParameter
                // .getValue());
                // HeaderFooterConnection footerRepositoryConnection = null;
                // String footerSource = null;
                // if (footerLastVersion != null) {
                // Item item = footerLastVersion.getProperty().getItem();
                // if (item != null && item instanceof ConnectionItem) {
                // footerSource = UpdateRepositoryUtils.getRepositorySourceName(item);

                if (connectionItem != null) {
                    if (connectionItem.getConnection() instanceof SAPConnection) {
                        boolean same = true;
                        IElementParameter sapNodeParam = node.getElementParameter("LABEL"); //$NON-NLS-1$

                        if (sapNodeParam == null) {
                            return updateResults;
                        }

                        String iDocName = TalendTextUtils.removeQuotes((String) sapNodeParam.getValue());
                        Connection connection = connectionItem.getConnection();
                        if (connection instanceof SAPConnection) {
                            SAPConnection sapConnection = (SAPConnection) connection;
                            SAPIDocUnit iDocUnit = SAPConnectionUtils.findExistIDocUnit(sapConnection, iDocName);
                            if (iDocUnit == null) {
                                for (IElementParameter param : node.getElementParameters()) {
                                    SAPParametersUtils.setNoRepositoryParams(param);
                                }
                                return updateResults;
                            }

                            String gatewayService = "";
                            String programId = "";
                            Boolean formatXml = false;
                            Boolean formatHtml = false;
                            String fileXml = "";
                            String fileHtml = "";
                            IElementParameter elementParameter = node.getElementParameter("GATEWAYSERVICE");
                            if (elementParameter != null) {
                                gatewayService = (String) elementParameter.getValue();
                                gatewayService = TalendTextUtils.removeQuotes(gatewayService);
                            }
                            IElementParameter elementParameter2 = node.getElementParameter("PROGRAMID");
                            if (elementParameter2 != null) {
                                programId = (String) elementParameter2.getValue();
                                programId = TalendTextUtils.removeQuotes(programId);
                            }
                            IElementParameter elementParameter3 = node.getElementParameter("FORMAT_XML");
                            if (elementParameter3 != null) {
                                formatXml = (Boolean) elementParameter3.getValue();
                            }
                            IElementParameter elementParameter4 = node.getElementParameter("FORMAT_HTML");
                            if (elementParameter4 != null) {
                                formatHtml = (Boolean) elementParameter4.getValue();
                            }
                            IElementParameter elementParameter5 = node.getElementParameter("FILE_IDOC_XML");
                            if (elementParameter5 != null) {
                                fileXml = (String) elementParameter5.getValue();
                                fileXml = TalendTextUtils.removeQuotes(fileXml);
                            }
                            IElementParameter elementParameter6 = node.getElementParameter("FILE_IDOC_HTML");
                            if (elementParameter6 != null) {
                                fileHtml = (String) elementParameter6.getValue();
                                fileHtml = TalendTextUtils.removeQuotes(fileHtml);
                            }
                            if (!((gatewayService == null && iDocUnit.getGatewayService() == null) || (gatewayService != null && gatewayService
                                    .equals(iDocUnit.getGatewayService())))) {
                                same = false;
                            }
                            if (!((programId == null && iDocUnit.getProgramId() == null) || (programId != null && programId
                                    .equals(iDocUnit.getProgramId())))) {
                                same = false;
                            }
                            if (!((formatXml && iDocUnit.isUseXmlOutput()) || (!formatXml && !iDocUnit.isUseXmlOutput()))) {
                                same = false;
                            }
                            if (!((formatHtml && iDocUnit.isUseHtmlOutput()) || (!formatHtml && !iDocUnit.isUseHtmlOutput()))) {
                                same = false;
                            }

                            if (!((fileXml == null && iDocUnit.getXmlFile() == null) || (fileXml != null && fileXml
                                    .equals(iDocUnit.getXmlFile())))) {
                                same = false;
                            }
                            if (!((fileHtml == null && iDocUnit.getHtmlFile() == null) || (fileHtml != null && fileHtml
                                    .equals(iDocUnit.getHtmlFile())))) {
                                same = false;
                            }
                            if (!same || onlySimpleShow) {
                                String source = UpdateRepositoryUtils.getRepositorySourceName(connectionItem);
                                UpdateCheckResult result = new UpdateCheckResult(node);
                                result.setResult(EUpdateItemType.NODE_SAP_IDOC, EUpdateResult.UPDATE, iDocUnit, source);
                                setConfigrationForReadOnlyJob(result);
                                updateResults.add(result);
                            }
                        }

                    }
                }
            }
        }
        return updateResults;
    }

    /**
     * 
     * DOC YeXiaowei Comment method "checkNodeSAPFunctionFromRepository".
     * 
     * @param node
     * @return
     */
    private List<UpdateResult> checkNodeSAPFunctionFromRepository(final Node node, boolean onlySimpleShow) {
        if (node == null) {
            return Collections.emptyList();
        }
        List<UpdateResult> queryResults = new ArrayList<UpdateResult>();
        String propertyType = (String) node.getPropertyValue(EParameterName.PROPERTY_TYPE.getName());
        if (propertyType != null) {
            if (propertyType.equals(EmfComponent.REPOSITORY)) {
                String propertyValue = (String) node.getPropertyValue(EParameterName.REPOSITORY_PROPERTY_TYPE.getName());

                ConnectionItem connectionItem = null;
                connectionItem = UpdateRepositoryUtils.getConnectionItemByItemId(propertyValue);
                if (connectionItem != null) {
                    boolean same = true;
                    IElementParameter sapNodeParam = node.getElementParameter("SAP_FUNCTION"); //$NON-NLS-1$

                    if (sapNodeParam == null) {
                        return queryResults;
                    }

                    String functioName = TalendTextUtils.removeQuotes((String) sapNodeParam.getValue());
                    SAPConnection connection = (SAPConnection) connectionItem.getConnection();
                    SAPFunctionUnit function = SAPConnectionUtils.findExistFunctionUnit(connection, functioName);
                    if (function == null) {
                        for (IElementParameter param : node.getElementParameters()) {
                            SAPParametersUtils.setNoRepositoryParams(param);
                        }
                        return queryResults;
                    }
                    // check SAP_ITERATE_OUT_TYPE
                    sapNodeParam = node.getElementParameter("SAP_ITERATE_OUT_TYPE"); //$NON-NLS-1$
                    if (sapNodeParam != null && !function.getOutputType().replace(".", "_").equals(sapNodeParam.getValue())) { //$NON-NLS-1$ //$NON-NLS-2$
                        same = false;
                    } else {
                        // check SAP_ITERATE_OUT_TABLENAME
                        sapNodeParam = node.getElementParameter("SAP_ITERATE_OUT_TABLENAME"); //$NON-NLS-1$
                        if (sapNodeParam != null) {
                            String source = (String) sapNodeParam.getValue();
                            String dest = function.getOutputTableName();
                            if (dest == null) {
                                dest = ""; //$NON-NLS-1$
                            }
                            if (!TalendTextUtils.addQuotes(dest).equals(source) && !source.equals(dest)) {
                                same = false;
                            }
                        }
                    }
                    boolean inputSame = true;
                    sapNodeParam = node.getElementParameter("MAPPING_INPUT"); //$NON-NLS-1$
                    if (sapNodeParam != null && sapNodeParam.getRepositoryValue() != null && sapNodeParam.getValue() != null) {
                        inputSame = SAPConnectionUtils.sameParamterTableWith(function,
                                (List<Map<String, Object>>) sapNodeParam.getValue(), true);
                    }
                    boolean outputSame = true;
                    sapNodeParam = node.getElementParameter("MAPPING_OUTPUT"); //$NON-NLS-1$
                    if (sapNodeParam != null && sapNodeParam.getRepositoryValue() != null && sapNodeParam.getValue() != null) {
                        outputSame = SAPConnectionUtils.sameParamterTableWith(function,
                                (List<Map<String, Object>>) sapNodeParam.getValue(), false);
                    }

                    if (!same || !inputSame || !outputSame || onlySimpleShow) {
                        String source = UpdateRepositoryUtils.getRepositorySourceName(connectionItem);
                        UpdateCheckResult result = new UpdateCheckResult(node);
                        result.setResult(EUpdateItemType.NODE_SAP_FUNCTION, EUpdateResult.UPDATE, function, source);
                        setConfigrationForReadOnlyJob(result);
                        queryResults.add(result);
                    }
                }

            }
        }
        return queryResults;
    }

    /**
     * 
     * nrousseau Comment method "checkNodeSchemaFromRepository".
     * 
     * @param nc
     * @param metadataTable
     * @return true if the data have been modified
     */
    private List<UpdateResult> checkNodeSchemaFromRepository(final Node node, boolean onlySimpleShow) {
        if (node == null) {
            return Collections.emptyList();
        }
        List<UpdateResult> schemaResults = new ArrayList<UpdateResult>();

        List<IProcess2> openedProcesses = UpdateManagerUtils.getOpenedProcess();

        if (PluginChecker.isEBCDICPluginLoaded()) {
            List<UpdateResult> resultForEBCDIC = checkNodeSchemaFromRepositoryForEBCDIC(node, onlySimpleShow);
            if (resultForEBCDIC != null && !resultForEBCDIC.isEmpty()) {
                // means it's one ebcdic component, no need to check others
                return resultForEBCDIC;
            }
            // return schemaResults;
        }

        // check tMap schema...
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IDesignerMapperService.class)) {
            List<UpdateResult> resultForTMap = checkNodeSchemaFromRepositoryForTMap(node, onlySimpleShow);
            if (resultForTMap != null && resultForTMap.size() > 0) {
                schemaResults.addAll(resultForTMap);
            }
        }

        // check the metadata from the repository to see if it's up to date.
        List<IElementParameter> schemaTypeParams = node.getElementParametersFromField(EParameterFieldType.SCHEMA_TYPE);
        if (schemaTypeParams.isEmpty()) {
            schemaTypeParams = node.getElementParametersFromField(EParameterFieldType.SCHEMA_REFERENCE);
        }
        // IElementParameter schemaTypeParam = node.getElementParameterFromField(EParameterFieldType.SCHEMA_TYPE);
        if (schemaTypeParams != null) {
            for (IElementParameter schemaTypeParam : schemaTypeParams) {
                UpdateCheckResult result = null;
                IElementParameter schemaParam = schemaTypeParam.getChildParameters().get(EParameterName.SCHEMA_TYPE.getName());
                if (schemaParam != null && ((ElementParameter) schemaTypeParam).isDisplayedByDefault()) {
                    if (schemaParam.getValue().equals(EmfComponent.REPOSITORY)) {
                        String propertyValue = (String) schemaTypeParam.getChildParameters()
                                .get(EParameterName.REPOSITORY_SCHEMA_TYPE.getName()).getValue();
                        ConnectionItem connectionItem = null;
                        String schemaName = null;
                        String[] names = UpdateManagerUtils.getSourceIdAndChildName(propertyValue);
                        if (names != null && names.length > 1) {
                            connectionItem = UpdateRepositoryUtils.getConnectionItemByItemId(names[0]);
                            schemaName = names[1];
                        }

                        //

                        boolean builtIn = true;
                        if (connectionItem != null) {
                            final String uniqueName = node.getUniqueName();
                            String newSourceId = getSchemaRenamedMap().get(propertyValue);
                            Map<String, EUpdateResult> deletedOrReselect = getDeletedOrReselectTablesMap();
                            String connectionId = (String) node.getPropertyValue(EParameterName.REPOSITORY_PROPERTY_TYPE
                                    .getName());
                            List<Object> parameter = null;
                            // renamed
                            if (newSourceId != null && !newSourceId.equals(propertyValue)) {
                                String[] newSourceIdAndName = UpdateManagerUtils.getSourceIdAndChildName(newSourceId);
                                if (newSourceIdAndName != null) {
                                    IMetadataTable table = UpdateRepositoryUtils.getTableByName(connectionItem,
                                            newSourceIdAndName[1]);
                                    if (table != null) {
                                        String source = UpdateRepositoryUtils.getRepositorySourceName(connectionItem);

                                        final IMetadataTable copyOfrepositoryMetadata = table.clone();
                                        copyOfrepositoryMetadata.setTableName(uniqueName);
                                        copyOfrepositoryMetadata.setAttachedConnector(schemaTypeParam.getContext());

                                        parameter = new ArrayList<Object>();
                                        parameter.add(copyOfrepositoryMetadata);
                                        parameter.add(propertyValue);
                                        parameter.add(newSourceId);

                                        result = new UpdateCheckResult(node);
                                        result.setResult(EUpdateItemType.NODE_SCHEMA, EUpdateResult.RENAME, parameter, source);
                                        builtIn = false;
                                    }
                                }
                            } else if (!deletedOrReselect.isEmpty() && connectionId != null) {
                                String source = UpdateRepositoryUtils.getRepositorySourceName(connectionItem);
                                EUpdateResult status = deletedOrReselect.get(propertyValue);
                                // deleted
                                if (status != null) {
                                    if (status.equals(EUpdateResult.DELETE)) {
                                        // if reselect,need to reload the table for the refrence job.
                                        parameter = new ArrayList<Object>();
                                        String tableName = propertyValue.split(UpdatesConstants.SEGMENT_LINE)[1];
                                        parameter.add(tableName);
                                        parameter.add(status);
                                        result = new UpdateCheckResult(node);
                                        result.setResult(EUpdateItemType.NODE_SCHEMA, EUpdateResult.DELETE, parameter, source);
                                        builtIn = false;
                                    } else if (status.equals(EUpdateResult.RELOAD)) {
                                        parameter = new ArrayList<Object>();
                                        String tableName = propertyValue.split(UpdatesConstants.SEGMENT_LINE)[1];
                                        parameter.add(tableName);
                                        parameter.add(status);
                                        result = new UpdateCheckResult(node);
                                        result.setResult(EUpdateItemType.NODE_SCHEMA, EUpdateResult.RELOAD, parameter, source);
                                        builtIn = false;
                                    }
                                }

                            } else {
                                IMetadataTable table = null;
                                IGenericWizardService wizardService = null;
                                if (GlobalServiceRegister.getDefault().isServiceRegistered(IGenericWizardService.class)) {
                                    wizardService = (IGenericWizardService) GlobalServiceRegister.getDefault().getService(
                                            IGenericWizardService.class);
                                }
                                // Generic
                                if (wizardService != null && wizardService.isGenericItem(connectionItem)) {
                                    List<MetadataTable> metadataTables = wizardService.getMetadataTables(connectionItem
                                            .getConnection());
                                    for (MetadataTable metadataTable : metadataTables) {
                                        if (metadataTable.getLabel().equals(schemaName)) {
                                            if (GlobalServiceRegister.getDefault().isServiceRegistered(
                                                    IMetadataManagmentService.class)) {
                                                IMetadataManagmentService mmService = (IMetadataManagmentService) GlobalServiceRegister
                                                        .getDefault().getService(IMetadataManagmentService.class);
                                                table = mmService.convertMetadataTable(metadataTable);
                                            }
                                        }
                                    }
                                } else {
                                    String innerIOType = null;
                                    IMetadataTable metadataTable = node.getMetadataFromConnector(schemaTypeParam.getContext());
                                    innerIOType = metadataTable.getAdditionalProperties().get(
                                            SAPBWTableHelper.SAP_INFOOBJECT_INNER_TYPE);
                                    if (innerIOType != null) {
                                        Connection connection = connectionItem.getConnection();
                                        if (connection != null && connection instanceof SAPConnection) {
                                            List<SAPBWTable> bwTables = ((SAPConnection) connection).getBWInfoObjects();
                                            for (SAPBWTable bwTable : bwTables) {
                                                if (schemaName.equals(bwTable.getLabel())
                                                        && innerIOType.equals(bwTable.getInnerIOType())) {
                                                    table = ConvertionHelper.convert(bwTable);
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        table = UpdateRepositoryUtils.getTableByName(connectionItem, schemaName);
                                    }
                                }
                                if (table != null) {
                                    String source = UpdateRepositoryUtils.getRepositorySourceName(connectionItem)
                                            + UpdatesConstants.SEGMENT_LINE + schemaName;

                                    final IMetadataTable copyOfrepositoryMetadata = table.clone();
                                    copyOfrepositoryMetadata.setTableName(uniqueName);
                                    copyOfrepositoryMetadata.setAttachedConnector(schemaTypeParam.getContext());
                                    List<String> columnNames = new ArrayList<String>();
                                    for (IMetadataColumn column : copyOfrepositoryMetadata.getListColumns()) {
                                        columnNames.add(column.getLabel());
                                    }
                                    copyOfrepositoryMetadata.setOriginalColumns(columnNames);

                                    // // fixed the such as tContextDump component.
                                    // MetadataTool.initilializeSchemaFromElementParameters(copyOfrepositoryMetadata,
                                    // (List<IElementParameter>) node.getElementParameters());

                                    final IMetadataTable metadataTable = node.getMetadataFromConnector(schemaTypeParam
                                            .getContext());
                                    /*
                                     * should ignore the db type column. because database component can use other
                                     * database schema.
                                     */
                                    if (this.isAddColumn) {
                                        Display.getDefault().syncExec(new Runnable() {

                                            @Override
                                            public void run() {
                                                isColumnUsed = MessageDialog.openQuestion(Display.getDefault().getActiveShell(),
                                                        Messages.getString("ProcessUpdateManager.Question"),
                                                        Messages.getString("ProcessUpdateManager.QuestionString"));
                                                copyUsefulAttribute(copyOfrepositoryMetadata, metadataTable, isColumnUsed);
                                            }

                                        });
                                        this.isAddColumn = false;
                                    } else {
                                        if (node.getComponentProperties() != null) {
                                            // always set columns as used for new component framework
                                            copyUsefulAttribute(copyOfrepositoryMetadata, metadataTable, true);
                                        } else {
                                            copyUsefulAttribute(copyOfrepositoryMetadata, metadataTable, isColumnUsed);
                                        }
                                    }

                                    if (onlySimpleShow
                                            || !metadataTable.sameMetadataAs(copyOfrepositoryMetadata,
                                                    IMetadataColumn.OPTIONS_IGNORE_DBTYPE)
                                            || connectionItem instanceof GenericSchemaConnectionItem
                                            && !metadataTable.sameMetadataAs(copyOfrepositoryMetadata,
                                                    IMetadataColumn.OPTIONS_NONE)) {
                                        result = new UpdateCheckResult(node);
                                        result.setResult(EUpdateItemType.NODE_SCHEMA, EUpdateResult.UPDATE,
                                                copyOfrepositoryMetadata, source);
                                        result.setContextModeConnectionItem(connectionItem);
                                    }
                                    builtIn = false;
                                }
                            }
                        }

                        if (builtIn) {
                            // if the repository connection doesn't exists then set to built-in
                            result = new UpdateCheckResult(node);
                            result.setResult(EUpdateItemType.NODE_SCHEMA, EUpdateResult.BUIL_IN, schemaTypeParam.getContext());
                        }

                        // add the check result to resultList, hold the value.
                        if (result != null) {
                            if (!openedProcesses.contains(getProcess())) {
                                result.setFromItem(true);
                            }
                            result.setJob(getProcess());
                            setConfigrationForReadOnlyJob(result);
                            schemaResults.add(result);
                        }
                    }
                }
            }
        }
        return schemaResults;
    }

    private void copyUsefulAttribute(IMetadataTable tableFromMetadata, IMetadataTable tableFromProcess, boolean isMustUsed) {
        for (IMetadataColumn columnFromMetadata : tableFromMetadata.getListColumns()) {
            boolean flag = false;
            for (IMetadataColumn columnFromProcess : tableFromProcess.getListColumns(true)) {
                if (columnFromMetadata.getLabel().equals(columnFromProcess.getLabel())) {
                    flag = true;
                    columnFromMetadata.setUsefulColumn(columnFromProcess.isUsefulColumn());
                }
            }
            if (!flag) {
                if (isMustUsed) {
                    columnFromMetadata.setUsefulColumn(true);
                } else {
                    columnFromMetadata.setUsefulColumn(false);
                }
            }
        }
        tableFromMetadata.getListColumns();
    }

    /**
     * DOC ycbai Comment method "checkNodeSchemaFromRepositoryForTMap".
     * 
     * @param node
     * @param onlySimpleShow
     * @return
     */
    private List<UpdateResult> checkNodeSchemaFromRepositoryForTMap(final Node node, boolean onlySimpleShow) {
        if (node == null || node.getExternalNode() == null || node.getExternalNode().getExternalData() == null) {
            return Collections.emptyList();
        }

        IExternalData externalData = node.getExternalNode().getExternalData();
        List<UpdateResult> schemaResults = new ArrayList<UpdateResult>();

        IDesignerMapperService service = (IDesignerMapperService) GlobalServiceRegister.getDefault().getService(
                IDesignerMapperService.class);
        if (service != null) {
            List<String> schemaIds = service.getRepositorySchemaIds(externalData);
            if (schemaIds.size() > 0) {
                List<IProcess2> openedProcesses = UpdateManagerUtils.getOpenedProcess();
                for (String schemaId : schemaIds) {
                    UpdateCheckResult result = null;
                    String[] names = UpdateManagerUtils.getSourceIdAndChildName(schemaId);
                    ConnectionItem connectionItem = null;
                    String schemaName = null;
                    if (names != null && names.length > 1) {
                        connectionItem = UpdateRepositoryUtils.getConnectionItemByItemId(names[0]);
                        schemaName = names[1];
                    }
                    String newSourceId = getSchemaRenamedMap().get(schemaId);
                    // rename metadat
                    if (newSourceId != null && !newSourceId.equals(schemaId)) {
                        String[] newSourceIdAndName = UpdateManagerUtils.getSourceIdAndChildName(newSourceId);
                        if (newSourceIdAndName != null) {
                            List<Object> parameter = new ArrayList<Object>();
                            IMetadataTable table = UpdateRepositoryUtils.getTableByName(connectionItem, newSourceIdAndName[1]);
                            if (table != null) {
                                String source = UpdateRepositoryUtils.getRepositorySourceName(connectionItem);

                                final IMetadataTable copyOfrepositoryMetadata = table.clone();

                                parameter = new ArrayList<Object>();
                                parameter.add(copyOfrepositoryMetadata);
                                parameter.add(schemaId);
                                parameter.add(newSourceId);

                                result = new UpdateCheckResult(node);
                                result.setResult(EUpdateItemType.NODE_SCHEMA, EUpdateResult.RENAME, parameter, source);
                            }
                        }
                    } else {
                        IMetadataTable table = UpdateRepositoryUtils.getTableByName(connectionItem, schemaName);
                        String source = UpdateRepositoryUtils.getRepositorySourceName(connectionItem);
                        if (table != null) {
                            final IMetadataTable copyOfrepositoryMetadata = table.clone();
                            if (onlySimpleShow
                                    || !service.isSameMetadata(node.getExternalNode(), schemaId, copyOfrepositoryMetadata)) {
                                List<Object> parameter = new ArrayList<Object>();
                                parameter.add(copyOfrepositoryMetadata);
                                parameter.add(schemaId);
                                result = new UpdateCheckResult(node);
                                result.setResult(EUpdateItemType.NODE_SCHEMA, EUpdateResult.UPDATE, parameter, source);
                                result.setContextModeConnectionItem(connectionItem);
                            }
                        }
                    }

                    if (result != null) {
                        if (!openedProcesses.contains(getProcess())) {
                            result.setFromItem(true);
                        }
                        result.setJob(getProcess());
                        setConfigrationForReadOnlyJob(result);
                        schemaResults.add(result);
                    }
                }
            }
        }

        return schemaResults;
    }

    /**
     * 
     * nrousseau Comment method "checkNodeSchemaFromRepositoryForEBCDIC".
     * 
     * @param node
     * @return
     */
    private List<UpdateResult> checkNodeSchemaFromRepositoryForEBCDIC(final Node node, boolean onlySimpleShow) {
        if (node == null) {
            return Collections.emptyList();
        }
        List<UpdateResult> schemaResults = new ArrayList<UpdateResult>();

        if (PluginChecker.isEBCDICPluginLoaded()) {
            IEBCDICProviderService service = (IEBCDICProviderService) GlobalServiceRegister.getDefault().getService(
                    IEBCDICProviderService.class);
            if (service != null) {
                EbcdicConnectionItem repositoryItem = service.getRepositoryItem(node);
                if (repositoryItem != null) {
                    IElementParameter schemasTableParam = node.getElementParameter(IEbcdicConstant.TABLE_SCHEMAS);
                    IElementParameter schemaParam = node.getElementParameter(IEbcdicConstant.FIELD_SCHEMA);
                    if (schemasTableParam != null) {
                        List<IProcess2> openedProcesses = UpdateManagerUtils.getOpenedProcess();
                        List<Map<String, Object>> paramValues = (List<Map<String, Object>>) schemasTableParam.getValue();
                        for (Map<String, Object> line : paramValues) {
                            if (service.isRepositorySchemaLine(node, line)) {
                                final String schemaName = (String) line.get(IEbcdicConstant.FIELD_SCHEMA);
                                final String propertyValue = repositoryItem.getProperty().getId() + UpdatesConstants.SEGMENT_LINE
                                        + schemaName;
                                //
                                boolean builtIn = true;
                                UpdateCheckResult result = null;

                                if (repositoryItem != null) {
                                    String newSourceId = getSchemaRenamedMap().get(propertyValue);
                                    // renamed
                                    if (newSourceId != null && !newSourceId.equals(propertyValue)) {
                                        String[] newSourceIdAndName = UpdateManagerUtils.getSourceIdAndChildName(newSourceId);
                                        if (newSourceIdAndName != null) {
                                            IMetadataTable table = UpdateRepositoryUtils.getTableByName(repositoryItem,
                                                    newSourceIdAndName[1]);
                                            if (table != null) {
                                                String source = UpdateRepositoryUtils.getRepositorySourceName(repositoryItem);

                                                final IMetadataTable copyOfrepositoryMetadata = table.clone();
                                                // String uniqueName =
                                                // this.getProcess().generateUniqueConnectionName(table + "_");
                                                // copyOfrepositoryMetadata.setTableName(uniqueName);
                                                // copyOfrepositoryMetadata.setAttachedConnector(schemaTypeParam.
                                                // getContext());

                                                List<Object> parameter = new ArrayList<Object>();
                                                parameter.add(copyOfrepositoryMetadata);
                                                parameter.add(propertyValue);
                                                parameter.add(newSourceId);
                                                parameter.add(line);

                                                result = new UpdateCheckResult(node);
                                                result.setResult(EUpdateItemType.NODE_SCHEMA, EUpdateResult.RENAME, parameter,
                                                        source);
                                                builtIn = false;
                                            }
                                        }
                                    } else {
                                        boolean isNeedUpdateSchemaFromRepo = true;
                                        if (schemaParam.getChildParameters() != null
                                                && schemaParam.getChildParameters().get("SCHEMA_TYPE") != null) {
                                            boolean isBuildinSchemaType = schemaParam.getChildParameters().get("SCHEMA_TYPE")
                                                    .getValue().equals("BUILT_IN");
                                            isNeedUpdateSchemaFromRepo = !(schemaParam.isShow(node.getElementParameters()) && isBuildinSchemaType);
                                        }
                                        IMetadataTable table = UpdateRepositoryUtils.getTableByName(repositoryItem, schemaName);
                                        if (table != null && isNeedUpdateSchemaFromRepo) {
                                            String source = UpdateRepositoryUtils.getRepositorySourceName(repositoryItem)
                                                    + UpdatesConstants.SEGMENT_LINE + table.getLabel();

                                            final IMetadataTable copyOfrepositoryMetadata = table.clone();
                                            // copyOfrepositoryMetadata.setTableName(uniqueName);
                                            // copyOfrepositoryMetadata.setAttachedConnector(schemaTypeParam.getContext()
                                            // );

                                            IMetadataTable metadataTable = null;
                                            // metadataTable =
                                            // node.getMetadataFromConnector(schemaTypeParam.getContext());
                                            metadataTable = MetadataToolHelper.getMetadataTableFromNodeLabel(node, schemaName);

                                            if (this.isAddColumn) {
                                                Display.getDefault().syncExec(new Runnable() {

                                                    @Override
                                                    public void run() {
                                                        isColumnUsed = MessageDialog.openQuestion(Display.getDefault()
                                                                .getActiveShell(), Messages
                                                                .getString("ProcessUpdateManager.Question"), Messages
                                                                .getString("ProcessUpdateManager.QuestionString"));
                                                    }

                                                });
                                                this.isAddColumn = false;
                                                copyUsefulAttribute(copyOfrepositoryMetadata, metadataTable, isColumnUsed);
                                            }

                                            if (metadataTable != null
                                                    && (onlySimpleShow || !metadataTable.sameMetadataAs(copyOfrepositoryMetadata,
                                                            IMetadataColumn.OPTIONS_IGNORE_USED))) {

                                                List<Object> parameter = new ArrayList<Object>();
                                                parameter.add(copyOfrepositoryMetadata);
                                                parameter.add(schemaName);

                                                result = new UpdateCheckResult(node);
                                                result.setResult(EUpdateItemType.NODE_SCHEMA, EUpdateResult.UPDATE, parameter,
                                                        source);
                                            }
                                            builtIn = false;
                                        }
                                    }
                                }

                                if (builtIn) {
                                    // if the repository connection doesn't exists then set to built-in
                                    result = new UpdateCheckResult(node);
                                    result.setResult(EUpdateItemType.NODE_SCHEMA, EUpdateResult.BUIL_IN, line);
                                }

                                // add the check result to resultList, hold the value.
                                if (result != null) {
                                    if (!openedProcesses.contains(getProcess())) {
                                        result.setFromItem(true);
                                    }
                                    result.setJob(getProcess());
                                    setConfigrationForReadOnlyJob(result);
                                    schemaResults.add(result);
                                }
                            }
                        }
                    }
                }
            }

        }
        return schemaResults;
    }

    /**
     * 
     * nrousseau Comment method "checkNodePropertiesFromRepository".
     * 
     * @param node
     * @return true if the data have been modified
     */
    @SuppressWarnings("unchecked")
    private List<UpdateResult> checkNodePropertiesFromRepository(final Node node, boolean onlySimpleShow) {
        if (node == null) {
            return Collections.emptyList();
        }
        List<UpdateResult> propertiesResults = new ArrayList<UpdateResult>();

        for (IElementParameter curPropertyParam : node.getElementParametersFromField(EParameterFieldType.PROPERTY_TYPE)) {
            String propertyType = (String) curPropertyParam.getChildParameters().get(EParameterName.PROPERTY_TYPE.getName())
                    .getValue();
            if (propertyType != null) {
                if (propertyType.equals(EmfComponent.REPOSITORY)) {
                    List<IProcess2> openedProcesses = UpdateManagerUtils.getOpenedProcess();
                    IElementParameter repositoryPropertyParam = curPropertyParam.getChildParameters().get(
                            EParameterName.REPOSITORY_PROPERTY_TYPE.getName());

                    String propertyValue = (String) repositoryPropertyParam.getValue();

                    if (node.getComponent().getName().startsWith("tESB")) {
                        if (propertyValue.contains(" - ")) {
                            propertyValue = propertyValue.split(" - ")[0];
                        }
                    }

                    IRepositoryViewObject lastVersion = UpdateRepositoryUtils.getRepositoryObjectById(propertyValue);
                    UpdateCheckResult result = null;

                    Connection repositoryConnection = null;
                    RulesItem repositoryRulesItem = null; // hywang add for 6484
                    LinkRulesItem repositoryLinkRulesItem = null;
                    String source = null;
                    Item item = null;
                    if (lastVersion != null) {
                        item = lastVersion.getProperty().getItem();
                        if (item != null && item instanceof ConnectionItem) {
                            source = UpdateRepositoryUtils.getRepositorySourceName(item);
                            repositoryConnection = ((ConnectionItem) item).getConnection();
                        }
                        if (item != null && item instanceof FileItem) {
                            if (item instanceof RulesItem) {
                                repositoryRulesItem = (RulesItem) item;
                            }
                        }
                        if (item != null && item instanceof LinkRulesItem) {
                            repositoryLinkRulesItem = (LinkRulesItem) item;
                        }
                    }

                    if (repositoryConnection != null) {
                        boolean sameValues = true;
                        // added by wzhang for 9302
                        boolean isXsdPath = false;
                        if (repositoryConnection instanceof XmlFileConnectionImpl) {
                            String filePath = ((XmlFileConnectionImpl) repositoryConnection).getXmlFilePath();
                            if (filePath != null) {
                                if (XmlUtil.isXSDFile(filePath)) {
                                    isXsdPath = true;
                                }
                            }
                        }

                        // if salesforce modul is deleted from repository , change to build-in , no need to check other
                        // ElementParameters
                        boolean needBuildIn = false;
                        if (repositoryConnection instanceof SalesforceSchemaConnection
                                && !((SalesforceSchemaConnection) repositoryConnection).isUseCustomModuleName()) {
                            IElementParameter param = node.getElementParameter("MODULENAME");
                            if (param != null) {
                                boolean found = false;
                                SalesforceSchemaConnection salesforceConnection = (SalesforceSchemaConnection) repositoryConnection;
                                List<SalesforceModuleUnit> units = salesforceConnection.getModules();
                                for (SalesforceModuleUnit unit : units) {
                                    if (unit.getLabel() != null && unit.getLabel().equals(param.getValue())) {
                                        found = true;
                                        break;
                                    }
                                }
                                if (!found) {
                                    result = new UpdateCheckResult(node);
                                    result.setResult(EUpdateItemType.NODE_PROPERTY, EUpdateResult.BUIL_IN,
                                            repositoryPropertyParam);
                                    needBuildIn = true;
                                }
                            }
                        }

                        // if the repository connection exists then test the values
                        for (IElementParameter param : node.getElementParameters()) {
                            if (needBuildIn) {
                                break;
                            }
                            if (param.getRepositoryValue() == null || param.getRepositoryProperty() != null
                                    && !param.getRepositoryProperty().equals(curPropertyParam.getName())) {
                                continue;
                            }
                            if (param.getFieldType() == EParameterFieldType.PROPERTY_TYPE) {
                                continue;
                            }
                            if (param.getFieldType() == EParameterFieldType.SCHEMA_REFERENCE) {
                                continue;
                            }
                            String repositoryValue = param.getRepositoryValue();
                            String relatedComponent = node.getComponent().getName();
                            if ((repositoryValue != null)
                                    && (param.isShow(node.getElementParameters())
                                            || (node instanceof INode && ((INode) node).getComponent().getName()
                                                    .equals("tESBProviderRequest")) || (node instanceof INode && ((INode) node)
                                            .getComponent().getName().equals("tAdvancedFileOutputXML")))) { //$NON-NLS-1$
                                if ((param.getFieldType().equals(EParameterFieldType.FILE) && isXsdPath)
                                        || (repositoryConnection instanceof SalesforceSchemaConnection
                                                && "MODULENAME".equals(repositoryValue) && !((SalesforceSchemaConnection) repositoryConnection)
                                                    .isUseCustomModuleName())) {
                                    continue;
                                }
                                IMetadataTable table = null;
                                if (!node.getMetadataList().isEmpty()) {
                                    table = node.getMetadataList().get(0);
                                }
                                Object objectValue = RepositoryToComponentProperty.getValue(repositoryConnection,
                                        repositoryValue, table, relatedComponent);
                                if (objectValue == null || "".equals(objectValue)) {
                                    if (GlobalServiceRegister.getDefault().isServiceRegistered(IESBService.class)) {
                                        IESBService service = (IESBService) GlobalServiceRegister.getDefault().getService(
                                                IESBService.class);
                                        if (service != null) {
                                            Object objectValueFromESB = service.getValue(item, repositoryValue, node);
                                            if (objectValueFromESB != null) {
                                                objectValue = objectValueFromESB;
                                            }
                                        }
                                    }

                                }
                                if (param.getName().equals(EParameterName.CDC_TYPE_MODE.getName())
                                        && item instanceof DatabaseConnectionItem) {
                                    if (PluginChecker.isCDCPluginLoaded()) {
                                        ICDCProviderService service = (ICDCProviderService) GlobalServiceRegister.getDefault()
                                                .getService(ICDCProviderService.class);
                                        if (service != null) {
                                            try {
                                                List<IRepositoryViewObject> all;
                                                all = CorePlugin.getDefault().getProxyRepositoryFactory()
                                                        .getAll(ERepositoryObjectType.METADATA_CONNECTIONS);
                                                for (IRepositoryViewObject obj : all) {
                                                    Item tempItem = obj.getProperty().getItem();
                                                    if (tempItem instanceof DatabaseConnectionItem) {
                                                        String cdcLinkId = service
                                                                .getCDCConnectionLinkId((DatabaseConnectionItem) tempItem);
                                                        if (cdcLinkId != null && item.getProperty().getId().equals(cdcLinkId)) {
                                                            objectValue = RepositoryToComponentProperty.getValue(
                                                                    ((DatabaseConnectionItem) tempItem).getConnection(),
                                                                    repositoryValue, node.getMetadataList().get(0));
                                                            break;
                                                        }
                                                    }
                                                }
                                            } catch (PersistenceException e) {
                                                ExceptionHandler.process(e);
                                            }
                                        }
                                    }
                                }
                                Object value = param.getValue();
                                if (objectValue != null) {
                                    if ((param.getFieldType().equals(EParameterFieldType.CLOSED_LIST) && UpdatesConstants.TYPE
                                            .equals(param.getRepositoryValue()))) {
                                        boolean found = false;
                                        String[] list = param.getListRepositoryItems();
                                        for (int i = 0; (i < list.length) && (!found); i++) {
                                            if (objectValue.equals(list[i])) {
                                                found = true;
                                            }
                                        }
                                        if (!found) {
                                            sameValues = false;
                                        }

                                    } else {
                                        if (param.getFieldType().equals(EParameterFieldType.TABLE)) {
                                            List<Map<String, Object>> oldList = (List<Map<String, Object>>) value;
                                            String name = param.getName();
                                            // update for tAdvancedFileOutputXML wizard
                                            if ("ROOT".equals(name) || "LOOP".equals(name) || "GROUP".equals(name) //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                                                    && !oldList.isEmpty() && objectValue instanceof List) {
                                                List objectList = (List) objectValue;
                                                if (oldList.size() != objectList.size()) {
                                                    sameValues = false;
                                                } else {
                                                    for (int i = 0; i < oldList.size(); i++) {
                                                        Map<String, Object> oldMap = oldList.get(i);
                                                        Map<String, Object> objectMap = (Map<String, Object>) objectList.get(i);
                                                        if (oldMap.get("PATH").equals(objectMap.get("PATH")) //$NON-NLS-1$ //$NON-NLS-2$
                                                                && oldMap.get("ATTRIBUTE").equals(objectMap.get("ATTRIBUTE")) //$NON-NLS-1$ //$NON-NLS-2$
                                                                && ((oldMap.get("VALUE") == null && objectMap.get("VALUE") == null) || (oldMap //$NON-NLS-1$ //$NON-NLS-2$
                                                                        .get("VALUE") != null //$NON-NLS-1$
                                                                        && objectMap.get("VALUE") != null && oldMap.get("VALUE") //$NON-NLS-1$ //$NON-NLS-2$
                                                                        .equals(objectMap.get("VALUE")))) //$NON-NLS-1$
                                                                && ((oldMap.get("COLUMN") == null && objectMap.get("COLUMN") == null) || (oldMap //$NON-NLS-1$ //$NON-NLS-2$
                                                                        .get("COLUMN") != null //$NON-NLS-1$
                                                                        && oldMap.get("COLUMN") != null && oldMap.get("COLUMN") //$NON-NLS-1$ //$NON-NLS-2$
                                                                        .equals(objectMap.get("COLUMN"))))) { //$NON-NLS-1$
                                                            sameValues = true;
                                                        } else {
                                                            sameValues = false;
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else if (param.getName().equals("SHEETLIST") && oldList != null //$NON-NLS-1$
                                                    && objectValue instanceof List) {
                                                // hywang modified for bug
                                                // 9537
                                                List repList = (List) objectValue;
                                                if (oldList.size() == repList.size()) {
                                                    for (Map<String, Object> line : oldList) {
                                                        final String sheetName = "SHEETNAME"; //$NON-NLS-1$
                                                        Object oldValue = line.get(sheetName);
                                                        if (oldValue instanceof String && repList.get(0) instanceof Map) {
                                                            boolean found = false;
                                                            for (Map map : (List<Map>) repList) {
                                                                Object repValue = map.get(sheetName);
                                                                if (oldValue.equals(repValue)) {
                                                                    found = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!found) {
                                                                sameValues = false;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    sameValues = false;
                                                }
                                            } else if (("HADOOP_ADVANCED_PROPERTIES".equals(param.getName())
                                                    || "ADVANCED_PROPERTIES".equals(param.getName()) || param.getName().equals(
                                                    "HBASE_PARAMETERS")) && oldList != null //$NON-NLS-1$
                                                    && objectValue instanceof List) {
                                                List objectList = (List) objectValue;
                                                // TUP-2028: for hadoop properties,since in the repository mode it can
                                                // add
                                                // property manually or drag from repository at the same list,so when
                                                // check
                                                // repositroy update,need to filter the build-in property
                                                List<Map<String, Object>> filterBuildInList = collectHadoopPropertiesList(oldList);
                                                if (filterBuildInList.size() != objectList.size()) {
                                                    sameValues = false;
                                                } else {
                                                    for (int i = 0; i < filterBuildInList.size(); i++) {
                                                        Map<String, Object> oldMap = filterBuildInList.get(i);
                                                        Map<String, Object> objectMap = (Map<String, Object>) objectList.get(i);
                                                        if (oldMap.get("PROPERTY").equals(objectMap.get("PROPERTY"))
                                                                && oldMap.get("VALUE").equals(objectMap.get("VALUE"))) { //$NON-NLS-1$
                                                            sameValues = true;
                                                        } else {
                                                            sameValues = false;
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else if ((param.getName().equals("SAP_PROPERTIES"))//$NON-NLS-1$
                                                    && oldList != null && objectValue instanceof List) {
                                                List objectList = (List) objectValue;
                                                if (oldList.size() != objectList.size()) {
                                                    sameValues = false;
                                                } else {
                                                    for (int i = 0; i < oldList.size(); i++) {
                                                        Map<String, Object> oldMap = oldList.get(i);
                                                        Map<String, Object> objectMap = (Map<String, Object>) objectList.get(i);
                                                        if (oldMap.get("PROPERTY").equals(objectMap.get("PROPERTY"))
                                                                && oldMap.get("VALUE").equals(objectMap.get("VALUE"))) { //$NON-NLS-1$
                                                            sameValues = true;
                                                        } else {
                                                            sameValues = false;
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else
                                            // fix 18011 :after change the jars in wizard, the update manager can't
                                            // detect
                                            // it in jobs
                                            if (param.getName().equals("DRIVER_JAR") && oldList != null) {
                                                List objectList = (List) objectValue;
                                                if (oldList.size() != objectList.size()) {
                                                    sameValues = false;
                                                } else {
                                                    for (int i = 0; i < oldList.size(); i++) {
                                                        Map<String, Object> oldMap = oldList.get(i);
                                                        Map<String, Object> objectMap = (Map<String, Object>) objectList.get(i);
                                                        if (oldMap.get("JAR_NAME").equals(objectMap.get("JAR_NAME"))) { //$NON-NLS-1$
                                                            sameValues = true;
                                                        } else {
                                                            sameValues = false;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        } else
                                        // check the value
                                        if (value instanceof String && objectValue instanceof String) {
                                            if (!value.equals("CustomModule") && !value.equals(objectValue)) {//$NON-NLS-1$
                                                if (repositoryConnection instanceof XmlFileConnection) {
                                                    if ((((XmlFileConnection) repositoryConnection).getXmlFilePath().endsWith(
                                                            "xsd") || ((XmlFileConnection) repositoryConnection) //$NON-NLS-1$
                                                            .getXmlFilePath().endsWith("xsd\"")) //$NON-NLS-1$
                                                            && repositoryValue.equals("FILE_PATH")) { //$NON-NLS-1$
                                                    } else {
                                                        sameValues = false;
                                                    }
                                                } else {
                                                    sameValues = false;
                                                }
                                            }

                                            if (repositoryValue.equals("ENCODING")) { //$NON-NLS-1$
                                                IElementParameter paramEncoding = param.getChildParameters().get(
                                                        EParameterName.ENCODING_TYPE.getName());
                                                if (paramEncoding != null) {
                                                    if (repositoryConnection instanceof FTPConnection) {
                                                        if (((FTPConnection) repositoryConnection).getEcoding() != null) {
                                                            paramEncoding.setValue(((FTPConnection) repositoryConnection)
                                                                    .getEcoding());
                                                        } else {
                                                            paramEncoding.setValue(EmfComponent.ENCODING_TYPE_CUSTOM);
                                                        }

                                                    }
                                                    // else {
                                                    // paramEncoding.setValue(EmfComponent.ENCODING_TYPE_CUSTOM);
                                                    // paramEncoding.setRepositoryValueUsed(true);
                                                    // }
                                                }

                                            }
                                        } else if (value instanceof Boolean && objectValue instanceof Boolean) {
                                            sameValues = ((Boolean) value).equals(objectValue);
                                        }
                                    }
                                } else if (param.getFieldType().equals(EParameterFieldType.TABLE)
                                        && UpdatesConstants.XML_MAPPING.equals(repositoryValue)) {
                                    List<Map<String, Object>> newMaps = RepositoryToComponentProperty.getXMLMappingValue(
                                            repositoryConnection, node.getMetadataList(), getColumnRenamedMap());
                                    if ((value instanceof List) && newMaps != null) {
                                        List<Map<String, Object>> oldMaps = (List<Map<String, Object>>) value;
                                        // sameValues = oldMaps.size() == newMaps.size();
                                        if (oldMaps.size() != newMaps.size()) {
                                            sameValues = false;
                                            break;
                                        }

                                        for (int i = 0; i < newMaps.size() && sameValues; i++) {
                                            Map<String, Object> newmap = newMaps.get(i);
                                            Map<String, Object> oldmap = null; // oldMaps.get(i);
                                            if (i < oldMaps.size()) {
                                                oldmap = oldMaps.get(i);
                                            }
                                            if (oldmap != null && sameValues) {
                                                Object o = newmap.get(UpdatesConstants.QUERY);
                                                if (o != null) {
                                                    sameValues = newmap.get(UpdatesConstants.QUERY).equals(
                                                            oldmap.get(UpdatesConstants.QUERY));
                                                } else {
                                                    sameValues = oldmap.get(UpdatesConstants.QUERY) == null;
                                                }
                                            }
                                            // for hl7
                                            if (newmap.get(UpdatesConstants.SCHEMA) != null) {
                                                if (!newmap.get(UpdatesConstants.SCHEMA).equals(
                                                        newmap.get(UpdatesConstants.SCHEMA))) {
                                                    oldmap = null;
                                                    for (int j = 0; j < oldMaps.size(); j++) {
                                                        Map<String, Object> m = oldMaps.get(j);
                                                        if (newmap.get(UpdatesConstants.SCHEMA).equals(
                                                                m.get(UpdatesConstants.SCHEMA))) {
                                                            oldmap = m;
                                                        }
                                                    }
                                                }
                                                if (oldmap == null) {
                                                    sameValues = false;
                                                } else {
                                                    Object o = newmap.get(UpdatesConstants.MAPPING);

                                                    if (o != null) {
                                                        sameValues = o.equals(oldmap.get(UpdatesConstants.MAPPING));
                                                    } else {
                                                        sameValues = oldmap.get(UpdatesConstants.MAPPING) == null;
                                                    }

                                                }
                                            }

                                            if (!sameValues) {
                                                break;
                                            }
                                        }
                                        // if (oldMaps.size() > newMaps.size()) {
                                        // int size = newMaps.size();
                                        // for (int i = size; i < oldMaps.size(); i++) {
                                        // Map<String, Object> map = new HashMap<String, Object>();
                                        // map.put(UpdatesConstants.QUERY, UpdatesConstants.EMPTY);
                                        // newMaps.add(map);
                                        // }
                                        // sameValues = false;
                                        // }
                                    }
                                } else if (param.getFieldType().equals(EParameterFieldType.TABLE)
                                        && param.getName().equals("PARAMS")) { //$NON-NLS-1$
                                    objectValue = RepositoryToComponentProperty.getValue(repositoryConnection, param.getName(),
                                            node.getMetadataList().get(0));
                                    if (value == null) {
                                        sameValues = false;
                                        break;
                                    }
                                    if (objectValue == null) {
                                        sameValues = false;
                                        break;
                                    }
                                    List<Map<String, Object>> oldMaps = (List<Map<String, Object>>) value;

                                    List repList = (List) objectValue;
                                    if (oldMaps.size() == repList.size()) {
                                        for (Map<String, Object> line : oldMaps) {
                                            final String sheetName = "VALUE"; //$NON-NLS-1$
                                            Object oldValue = line.get(sheetName);
                                            if (oldValue instanceof String && repList.get(0) instanceof String) {
                                                boolean found = false;
                                                for (String str : (List<String>) repList) {
                                                    Object repValue = TalendTextUtils.addQuotes(str);
                                                    if (oldValue.equals(repValue)) {
                                                        found = true;
                                                        break;
                                                    }
                                                }
                                                if (!found) {
                                                    sameValues = false;
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        sameValues = false;
                                    }
                                }
                            }
                            if (!sameValues) {
                                break;
                            }
                        }
                        if (onlySimpleShow || !sameValues) {
                            result = new UpdateCheckResult(node);
                            result.setResult(EUpdateItemType.NODE_PROPERTY, EUpdateResult.UPDATE, item, source);

                        }
                        for (IElementParameter param : node.getElementParameters()) {
                            String repositoryValue = param.getRepositoryValue();
                            if (param.getRepositoryProperty() != null
                                    && !param.getRepositoryProperty().equals(curPropertyParam.getName())) {
                                continue;
                            }
                            if (repositoryValue != null
                                    && (!param.getName().equals(EParameterName.PROPERTY_TYPE.getName()))
                                    && param.getFieldType() != EParameterFieldType.MEMO_SQL
                                    && !("tMDMReceive".equals(node.getComponent().getName()) && "XPATH_PREFIX".equals(param //$NON-NLS-1$ //$NON-NLS-2$
                                            .getRepositoryValue()))
                                    && !("tSAPOutput".equals(node.getComponent().getName()) && param.getName().equals(
                                            UpdatesConstants.MAPPING))
                                    && !("tFileInputEBCDIC".equals(node.getComponent().getName()) && "DATA_FILE"
                                            .equals(repositoryValue)) && param.isShow(node.getElementParameters())) {
                                param.setRepositoryValueUsed(true);
                                param.setReadOnly(true);
                            }
                        }
                        // for context mode(bug 5198)
                        List<UpdateResult> contextResults = checkParameterContextMode(node.getElementParameters(),
                                (ConnectionItem) lastVersion.getProperty().getItem(), null);
                        if (contextResults != null) {
                            propertiesResults.addAll(contextResults);
                        }

                    } else {
                        result = new UpdateCheckResult(node);
                        result.setResult(EUpdateItemType.NODE_PROPERTY, EUpdateResult.BUIL_IN, repositoryPropertyParam);
                    }

                    // add the check result to resultList, hold the value.
                    if (result != null) {
                        if (!openedProcesses.contains(getProcess())) {
                            result.setFromItem(true);
                        }
                        result.setJob(getProcess());
                        setConfigrationForReadOnlyJob(result);
                        propertiesResults.add(result);
                    }
                }
            }
        }
        return propertiesResults;
    }

    /**
     * ggu Comment method "checkParameterContextMode".
     * 
     * for bug 5198
     */
    private List<UpdateResult> checkParameterContextMode(final List<? extends IElementParameter> parameters,
            ConnectionItem connItem, EComponentCategory category) {
        List<UpdateResult> contextResults = new ArrayList<UpdateResult>();

        if (connItem != null && parameters != null) {
            ConnectionContextHelper.checkContextMode(connItem);
            Connection connection = connItem.getConnection();
            if (connection.isContextMode()) {
                Set<String> neededVars = ConnectionContextHelper.retrieveContextVar(parameters, connection, category);
                if (neededVars != null && !neededVars.isEmpty()) {
                    ContextItem contextItem = ContextUtils.getContextItemById2(connection.getContextId());
                    EcoreUtil.resolveAll(contextItem);
                    if (contextItem != null) {
                        // find added variables
                        Set<String> addedVars = ConnectionContextHelper.checkAndAddContextVariables(contextItem, neededVars,
                                process.getContextManager(), false);
                        if (addedVars != null && !addedVars.isEmpty()) {
                            UpdateCheckResult result = new UpdateCheckResult(addedVars);
                            String remark = UpdateRepositoryUtils.getRepositorySourceName(connItem);
                            result.setResult(EUpdateItemType.CONTEXT, EUpdateResult.ADD, contextItem, remark
                                    + UpdatesConstants.CONTEXT_MODE);
                            List<IProcess2> openedProcesses = UpdateManagerUtils.getOpenedProcess();
                            if (!openedProcesses.contains(getProcess())) {
                                result.setFromItem(true);
                            }
                            result.setJob(getProcess());
                            result.setContextModeConnectionItem(connItem);
                            setConfigrationForReadOnlyJob(result);
                            contextResults.add(result);

                        }
                    }
                }
            }
        }
        return contextResults;
    }

    /*
     * check node query.
     */
    private List<UpdateResult> checkNodeQueryFromRepository(final Node node, boolean onlySimpleShow) {
        if (node == null) {
            return Collections.emptyList();
        }
        List<UpdateResult> queryResults = new ArrayList<UpdateResult>();

        String propertyType = (String) node.getPropertyValue(EParameterName.QUERYSTORE_TYPE.getName());
        if (propertyType != null) {
            if (propertyType.equals(EmfComponent.REPOSITORY)) {
                List<IProcess2> openedProcesses = UpdateManagerUtils.getOpenedProcess();
                String propertyValue = (String) node.getPropertyValue(EParameterName.REPOSITORY_QUERYSTORE_TYPE.getName());

                ConnectionItem connectionItem = null;
                String[] names = UpdateManagerUtils.getSourceIdAndChildName(propertyValue);
                if (names != null) {
                    connectionItem = UpdateRepositoryUtils.getConnectionItemByItemId(names[0]);

                }
                Query query = null;
                String source = null;
                if (connectionItem != null) {
                    query = UpdateRepositoryUtils.getQueryByName(connectionItem, names[1]);
                }
                String connectQuery = null;
                if (query != null) {
                    source = UpdateRepositoryUtils.getRepositorySourceName(connectionItem) + UpdatesConstants.SEGMENT_LINE
                            + query.getLabel();
                    connectQuery = query.getValue();
                }
                UpdateCheckResult result = null;

                if (connectQuery != null) {
                    IElementParameter sqlParam = node.getElementParameterFromField(EParameterFieldType.MEMO_SQL);
                    if (sqlParam != null && UpdatesConstants.QUERY.equals(sqlParam.getName())) {
                        String paramValue = (String) sqlParam.getValue();
                        // modefied by hywang , to see if there is contextmode
                        if (!query.isContextMode()) {
                            connectQuery = QueryUtil.checkAndAddQuotes(connectQuery);
                        }

                        if (onlySimpleShow || !connectQuery.equals(paramValue)) {
                            result = new UpdateCheckResult(node);
                            result.setResult(EUpdateItemType.NODE_QUERY, EUpdateResult.UPDATE, query, source);
                        }
                        sqlParam.setReadOnly(true);
                        sqlParam.setRepositoryValueUsed(true);
                    }
                } else {
                    result = new UpdateCheckResult(node);
                    result.setResult(EUpdateItemType.NODE_QUERY, EUpdateResult.BUIL_IN);
                }

                if (result != null) {
                    if (!openedProcesses.contains(getProcess())) {
                        result.setFromItem(true);
                    }
                    result.setJob(getProcess());
                    setConfigrationForReadOnlyJob(result);
                    queryResults.add(result);
                }

            }
        }

        return queryResults;
    }

    private List<UpdateResult> checkJobletNodeReload(boolean onlySimpleShow) {
        if (getProcess() == null || jobletProcessProvider == null) {
            return Collections.emptyList();
        }
        List<IProcess2> openedProcesses = UpdateManagerUtils.getOpenedProcess();
        List<UpdateResult> nodeResults = new ArrayList<UpdateResult>();
        for (INode node : this.getProcess().getGraphicalNodes()) {
            final Item jobletItem = jobletProcessProvider.getJobletItem(node);
            if (jobletItem != null) {
                final Property property = jobletItem.getProperty();
                final String id = property.getId();
                final Date modificationDate = property.getModificationDate();

                final Date oldDate = this.jobletReferenceMap.get(id);

                if (((oldDate != null && !modificationDate.equals(oldDate)) || onlySimpleShow)
                        && !getProcess().getId().equals(id)) {
                    List<INode> jobletNodes = findRelatedJobletNode(getProcess(), property.getLabel(), null);
                    if (jobletNodes != null && !jobletNodes.isEmpty()) {
                        String source = UpdatesConstants.JOBLET + UpdatesConstants.COLON + property.getLabel();
                        UpdateCheckResult result = new UpdateCheckResult(jobletNodes);
                        result.setResult(EUpdateItemType.RELOAD, EUpdateResult.RELOAD, jobletItem, source);
                        if (!openedProcesses.contains(getProcess())) {
                            result.setFromItem(true);
                        }
                        result.setJob(getProcess());
                        setConfigrationForReadOnlyJob(result);

                        nodeResults.add(result);
                    }
                }
            }
        }
        return nodeResults;
    }

    /**
     * 
     * ggu Comment method "checkNodesPropertyChanger".
     * 
     * If this is not relational joblet node to update. filter it.
     * 
     * @deprecated seems have unused it.
     */
    @Deprecated
    private List<UpdateResult> checkJobletNodesPropertyChanger() {
        if (getProcess() == null || getNodePropertyChanger() == null) {
            return Collections.emptyList();
        }
        List<UpdateResult> nodeResults = new ArrayList<UpdateResult>();
        List<IProcess2> openedProcesses = UpdateManagerUtils.getOpenedProcess();
        for (PropertyChangeEvent event : getNodePropertyChanger()) {
            UpdateCheckResult result = null;

            String propertyName = event.getPropertyName();
            if (propertyName.equals(IComponentConstants.NORMAL)) {
                if (jobletProcessProvider != null && !jobletProcessProvider.hasJobletComponent(getProcess())) {
                    break;

                }
                Object object = event.getSource();
                if (object instanceof IProcess) {
                    IProcess process2 = (IProcess) object;
                    // avoid reload self
                    if (!getProcess().getId().equals(process2.getId())) {
                        List<INode> jobletNodes = findRelatedJobletNode(getProcess(), process2.getName(), null);
                        if (jobletNodes != null && !jobletNodes.isEmpty()) {
                            String source = UpdatesConstants.JOBLET + UpdatesConstants.COLON + process2.getName();
                            result = new UpdateCheckResult(jobletNodes);
                            result.setResult(EUpdateItemType.RELOAD, EUpdateResult.RELOAD, event, source);
                        }
                    }
                } else { // reload all components
                    result = new UpdateCheckResult(UpdatesConstants.COMPONENT);
                    result.setResult(EUpdateItemType.RELOAD, EUpdateResult.RELOAD, event);
                }
                // moved (bug 4231)
                // } else if (propertyName.equals(ComponentUtilities.JOBLET_NAME_CHANGED)) {
                // String oldName = (String) event.getOldValue();
                // String newName = (String) event.getNewValue();
                // List<INode> jobletNodes = findRelatedJobletNode(getProcess(), oldName, newName);
                // if (jobletNodes != null && !jobletNodes.isEmpty()) {
                // String source = UpdatesConstants.JOBLET + UpdatesConstants.COLON + newName;
                //
                // result = new UpdateCheckResult(jobletNodes);
                // result.setResult(EUpdateItemType.JOBLET_RENAMED, EUpdateResult.JOBLET_UPDATE, event, source);
                // }
                // } else if (propertyName.equals(ComponentUtilities.JOBLET_SCHEMA_CHANGED)) {
                // Object object = event.getSource();
                // if (object instanceof IProcess) {
                // String oldName = ((IProcess) object).getName();
                // Set<String> nodesName = findRelatedJobletNode(getProcess(), oldName, null);
                // if (nodesName != null && !nodesName.isEmpty()) {
                // String source = UpdatesConstants.JOBLET + UpdatesConstants.COLON + ((IProcess) object).getLabel();
                //
                // result = new UpdateCheckResult(nodesName);
                // result.setResult(EUpdateItemType.JOBLET_SCHEMA, EUpdateResult.JOBLET_UPDATE, event, source);
                // }
                // }
            }
            if (result != null) {
                if (!openedProcesses.contains(getProcess())) {
                    result.setFromItem(true);
                }
                result.setJob(getProcess());
                setConfigrationForReadOnlyJob(result);
                nodeResults.add(result);
            }
        }
        // clear
        getNodePropertyChanger().clear();
        return nodeResults;
    }

    @SuppressWarnings("unchecked")
    private List<INode> findRelatedJobletNode(Process process, String oldjobletName, String newJobletName) {
        if (oldjobletName == null || process == null) {
            return null;
        }
        if (newJobletName == null) {
            newJobletName = oldjobletName;
        }
        IComponent newComponent = ComponentsFactoryProvider.getInstance().get(newJobletName,
                process.getComponentsType());
        if (newComponent == null) {
            return Collections.EMPTY_LIST;
        }

        List<INode> jobletNodes = new ArrayList<INode>();
        if (PluginChecker.isJobLetPluginLoaded()) {
            IJobletProviderService service = (IJobletProviderService) GlobalServiceRegister.getDefault().getService(
                    IJobletProviderService.class);
            if (service != null) {
                for (Node node : (List<Node>) process.getGraphicalNodes()) {
                    if (service.isJobletComponent(node) && node.getComponent().getName().equals(newJobletName)) {
                        jobletNodes.add(node);
                    }
                }
            }
        }
        return jobletNodes;
    }

    private List<UpdateResult> checkJobletNodeSchema() {
        if (jobletProcessProvider != null) {
            return jobletProcessProvider.checkJobletNodeSchema(getProcess());
        }
        return null;
    }

    @Override
    public List<UpdateResult> getUpdatesNeeded(IUpdateItemType type) {
        return getUpdatesNeeded(type, false);
    }

    @Override
    public List<UpdateResult> getUpdatesNeeded(IUpdateItemType itemType, boolean onlySimpleShow) {

        if (itemType == null) {
            return null;
        }
        List<UpdateResult> tmpResults = new ArrayList<UpdateResult>();
        if (itemType instanceof EUpdateItemType) {
            EUpdateItemType type = (EUpdateItemType) itemType;
            switch (type) {
            case NODE_PROPERTY:
            case NODE_SCHEMA:
            case NODE_QUERY:
            case NODE_SAP_IDOC:
            case NODE_SAP_FUNCTION:
            case NODE_VALIDATION_RULE:
                tmpResults = checkNodesParameters(type, onlySimpleShow);
                break;
            case JOB_PROPERTY_EXTRA:
            case JOB_PROPERTY_STATS_LOGS:
            case JOB_PROPERTY_HEADERFOOTER:
            case JOB_PROPERTY_STORM:
            case JOB_PROPERTY_MAPREDUCE:
                tmpResults = checkMainParameters(type, onlySimpleShow);
                break;
            case CONTEXT:
                tmpResults = checkContext(onlySimpleShow);
                break;
            case CONTEXT_GROUP:
                tmpResults = checkGroupContext(onlySimpleShow);
                break;
            case JOBLET_SCHEMA:
                tmpResults = checkJobletNodeSchema();
                break;
            case JOBLET_RENAMED: // unused
                // case RELOAD:
                tmpResults = checkJobletNodesPropertyChanger();
                break;
            case RELOAD:
                tmpResults = checkJobletNodeReload(onlySimpleShow);
                break;
            // have moved to extension point
            // case JOBLET_CONTEXT:
            // tmpResults = checkJobletNodesContext();
            // break;
            default:
            }
        } else { // extension
            tmpResults = UpdateManagerProviderDetector.INSTANCE.retrieveProcessUpdateResults(process, itemType);
        }
        return tmpResults;
    }

    @Override
    public boolean executeUpdates(List<UpdateResult> results) {
        return UpdateManagerUtils.executeUpdates(results, false, true, true);
    }

    /**
     * 
     * DOC hcw ProcessUpdateManager class global comment. Detailled comment
     */
    static class ContextItemParamMap {

        private Map<Item, Set<String>> map = new HashMap<Item, Set<String>>();

        public void add(Item item, String param) {
            Set<String> params = map.get(item);
            if (params == null) {
                params = new HashSet<String>();
                map.put(item, params);
            }
            params.add(param);
        }

        @SuppressWarnings("unchecked")
        public Set<String> get(Item item) {
            Set<String> params = map.get(item);
            return (params == null) ? Collections.EMPTY_SET : params;

        }

        public boolean isEmpty() {
            return map.isEmpty();
        }

        public Set<Item> getContexts() {
            return map.keySet();
        }
    }

    private void setConfigrationForReadOnlyJob(UpdateCheckResult result) {
        UpdateManagerHelper.setConfigrationForReadOnlyJob(process, result);
    }

}
