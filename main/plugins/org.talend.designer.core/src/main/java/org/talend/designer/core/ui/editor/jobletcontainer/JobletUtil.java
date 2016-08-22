package org.talend.designer.core.ui.editor.jobletcontainer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.runtime.model.repository.ERepositoryStatus;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.PluginChecker;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.MetadataTable;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.Element;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.IExternalData;
import org.talend.core.model.process.IExternalNode;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.INodeConnector;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.process.IProcess2;
import org.talend.core.model.process.ISubjobContainer;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.JobletProcessItem;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.ui.editor.RepositoryEditorInput;
import org.talend.core.services.ISVNProviderService;
import org.talend.core.ui.IJobletProviderService;
import org.talend.core.ui.component.ComponentsFactoryProvider;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.model.components.NodeConnector;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.ui.AbstractMultiPageTalendEditor;
import org.talend.designer.core.ui.editor.connections.Connection;
import org.talend.designer.core.ui.editor.nodecontainer.NodeContainer;
import org.talend.designer.core.ui.editor.nodecontainer.NodeContainerPart;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.nodes.NodePart;
import org.talend.designer.core.ui.editor.subjobcontainer.SubjobContainer;
import org.talend.designer.joblet.model.JobletNode;
import org.talend.designer.joblet.model.JobletProcess;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.IProxyRepositoryService;

public class JobletUtil {

    public boolean isJobletInput(Node connNode, IProcess2 process) {
        if (process.getProperty().getItem() instanceof JobletProcessItem) {
            JobletProcess jobletProcess = ((JobletProcessItem) process.getProperty().getItem()).getJobletProcess();
            List<JobletNode> jobletNodes = jobletProcess.getJobletNodes();
            for (JobletNode jnode : jobletNodes) {
                List list = jnode.getElementParameter();
                for (Object obj : list) {
                    if (obj instanceof ElementParameterType) {
                        if (((ElementParameterType) obj).getValue().equals(connNode.getJoblet_unique_name())) {
                            return jnode.isInput();
                        }
                    }
                }
            }
        }
        return false;
    }

    public List<INodeConnector> createConnectors(INode node, IProcess2 process) {
        List<INodeConnector> listConnector = new ArrayList<INodeConnector>();
        if (process == null) {
            return listConnector;
        }
        if (process.getProperty().getItem() instanceof JobletProcessItem) {
            JobletProcess jobletProcess = ((JobletProcessItem) process.getProperty().getItem()).getJobletProcess();
            EList<JobletNode> jobletLinks = jobletProcess.getJobletNodes();
            INodeConnector nodeConnector;
            int nbInput = 0;
            int nbOutput = 0;
            int jobletNbInput = 0;
            for (JobletNode jNode : jobletLinks) {
                if (jNode.isInput()) {
                    jobletNbInput++;
                }
            }
            boolean multipleInput = jobletNbInput > 1;
            for (JobletNode jNode : jobletLinks) {
                String name = ComponentUtilities.getNodeUniqueName(jNode);
                if (jNode.isTrigger()) {
                    // createTriggerConnector(listConnector, node);
                } else {
                    if (jNode.isInput()) {
                        if (multipleInput) {
                            nodeConnector = new NodeConnector(node);
                            nodeConnector.setName(name);
                            nodeConnector.setBaseSchema(EConnectionType.FLOW_MAIN.getName());
                            nodeConnector.setDefaultConnectionType(EConnectionType.FLOW_MAIN);
                            nodeConnector.setMaxLinkInput(1);
                            nodeConnector.setMinLinkInput(0);
                            nodeConnector.setMaxLinkOutput(0);
                            nodeConnector.setMinLinkOutput(0);
                            listConnector.add(nodeConnector);
                        }
                        nbInput++;
                    } else {
                        nodeConnector = new NodeConnector(node);
                        nodeConnector.setName(name);
                        nodeConnector.setBaseSchema(EConnectionType.FLOW_MAIN.getName());
                        nodeConnector.setBuiltIn(true);
                        nodeConnector.setMaxLinkOutput(1);
                        nodeConnector.setMinLinkOutput(1);
                        // achen modify to fix bug 6205

                        String displayName = getDisplayName(jNode);
                        nodeConnector.setLinkName("Joblet " + name);
                        nodeConnector.setMenuName(displayName);

                        nodeConnector.setDefaultConnectionType(EConnectionType.FLOW_MAIN);
                        nodeConnector.addConnectionProperty(EConnectionType.FLOW_MAIN, EConnectionType.FLOW_MAIN.getRGB(),
                                EConnectionType.FLOW_MAIN.getDefaultLineStyle());
                        nodeConnector.addConnectionProperty(EConnectionType.FLOW_REF, EConnectionType.FLOW_REF.getRGB(),
                                EConnectionType.FLOW_REF.getDefaultLineStyle());
                        nodeConnector.addConnectionProperty(EConnectionType.FLOW_MERGE, EConnectionType.FLOW_MERGE.getRGB(),
                                EConnectionType.FLOW_MERGE.getDefaultLineStyle());
                        listConnector.add(nodeConnector);
                        nbOutput++;
                    }
                }
            }
        }
        createTriggerConnector(listConnector, node);
        return listConnector;
    }

    private void createTriggerConnector(List<INodeConnector> listConnector, INode jobletNode) {
        IJobletProviderService service = (IJobletProviderService) GlobalServiceRegister.getDefault().getService(
                IJobletProviderService.class);
        if (service != null) {
            List<INode> triggerNodes = service.getTriggerNodes(jobletNode.getJobletNode());
            for (INode node : triggerNodes) {
                // INode node = jobletNode;
                EConnectionType triggerConnType = service.getTriggerNodeConnType(node);
                if (triggerConnType == null) {
                    continue;
                }
                boolean isInput = service.isTriggerInputNode(node);
                INodeConnector nodeConnector = null;
                String name = node.getUniqueName();

                nodeConnector = new NodeConnector(jobletNode);
                nodeConnector.setName(name);
                nodeConnector.setBaseSchema(triggerConnType.getName());
                nodeConnector.setBuiltIn(true);

                nodeConnector.setMaxLinkOutput(isInput ? 0 : 1);
                nodeConnector.setMinLinkOutput(0);
                nodeConnector.setMaxLinkInput(isInput ? 1 : 0);
                nodeConnector.setMinLinkInput(0);

                String displayName = conDisplayName(node.getLabel(), name);

                nodeConnector.setLinkName(triggerConnType.getDefaultLinkName() + " (" + displayName + ")"); //$NON-NLS-1$ //$NON-NLS-2$
                nodeConnector.setMenuName(triggerConnType.getDefaultMenuName() + " (" + displayName + ")"); //$NON-NLS-1$ //$NON-NLS-2$

                nodeConnector.setDefaultConnectionType(triggerConnType);
                nodeConnector.addConnectionProperty(triggerConnType, triggerConnType.getRGB(),
                        triggerConnType.getDefaultLineStyle());

                listConnector.add(nodeConnector);

            }
        }
    }

    private String getDisplayName(NodeType node) {
        String uniqueName = ComponentUtilities.getNodeUniqueName(node);
        String label = ComponentUtilities.getNodePropertyValue(node, EParameterName.LABEL.getName());
        String displayName = uniqueName;
        if (label != null && uniqueName != null) {
            label = label.replaceAll("__" + EParameterName.UNIQUE_NAME.getName() + "__", uniqueName);//$NON-NLS-1$
            displayName = conDisplayName(label, uniqueName);
        }
        return "Joblet " + displayName;
    }

    private String conDisplayName(String label, String uniqueName) {
        String displayName = uniqueName;
        if (!label.equals(uniqueName)) {
            displayName = label + "(" + uniqueName + ")"; //$NON-NLS-1$ //$NON-NLS-2$
        }
        return displayName;
    }

    public NodeContainer cloneNodeContainer(NodeContainer nodeContainer, Node cloneNode) {
        NodeContainerPart nodeConPart = new NodeContainerPart();
        // TDI-13132
        IComponent tempComponent = cloneNode.getComponent();
        if (tempComponent != null) {
            String tempComponentName = tempComponent.getName();
            if (tempComponentName != null) {
                IComponent component = ComponentsFactoryProvider.getInstance().get(tempComponentName,
                        cloneNode.getProcess().getComponentsType());
                if (component != null) {
                    cloneNode.setComponent(component);
                }
            }
        }
        NodeContainer cloneNodeContainer = new NodeContainer(cloneNode);
        nodeConPart.setModel(cloneNodeContainer);
        cloneNodeContainer.setNodeError(cloneNode.getNodeError());
        cloneNodeContainer.setNodeLabel(cloneNode.getNodeLabel());
        cloneNodeContainer.setNodeProgressBar(cloneNode.getNodeProgressBar());
        cloneNodeContainer.setReadOnly(nodeContainer.isReadOnly());
        return cloneNodeContainer;
    }

    public Node cloneNode(Node node, IProcess process, Map<String, List<? extends IElementParameter>> paraMap, boolean lockByOther) {
        NodePart nodePart = new NodePart();
        IJobletProviderService service = (IJobletProviderService) GlobalServiceRegister.getDefault().getService(
                IJobletProviderService.class);
        boolean isInOut = false;
        if (service != null) {
            isInOut = service.isJobletInOutComponent(node);
        }
        Node cloneNode = null;
        if (isInOut) {
            cloneNode = new Node(node.getComponent(), (IProcess2) process, node.getUniqueName());
        } else {
            cloneNode = new Node(node.getComponent(), (IProcess2) process);
        }

        nodePart.setModel(cloneNode);
        // if (lock == null) {
        // cloneNode.setReadOnly(true);
        // } else {
        // if (lock) {
        // cloneNode.setReadOnly(false);
        // } else {
        // cloneNode.setReadOnly(true);
        // }
        // }

        if (lockByOther) {
            cloneNode.setReadOnly(true);
        } else {
            cloneNode.setReadOnly(false);
        }

        cloneNode.setDummy(node.isDummy());
        cloneNode.setActivate(node.isActivate());

        List<? extends IElementParameter> elementParas = null;
        if (paraMap.containsKey(node.getUniqueName())) {
            elementParas = paraMap.get(node.getUniqueName());
        } else {
            elementParas = node.getElementParameters();
        }

        for (IElementParameter elementPara : elementParas) {
            if (elementPara.getName() != null && !elementPara.getName().equals("UNIQUE_NAME")) {
                IElementParameter cloneElement = cloneNode.getElementParameter(elementPara.getName());
                Object paValue = elementPara.getValue();
                if (paValue instanceof List) {
                    List list = new ArrayList();
                    list.addAll((List) paValue);
                    cloneElement.setValue(list);
                } else {
                    // TDI-25599
                    cloneElement.setContextMode(elementPara.isContextMode());
                    cloneElement.setValue(elementPara.getValue());
                }

                // if (lock == null) {
                // cloneElement.setReadOnly(true);
                // } else {
                // if (lock) {
                // cloneElement.setReadOnly(false);
                // } else {
                // cloneElement.setReadOnly(true);
                // }
                // }
                if (lockByOther) {
                    cloneElement.setReadOnly(true);
                } else {
                    cloneElement.setReadOnly(elementPara.isReadOnly());
                }

                if (elementPara.getChildParameters() != null) {
                    Map<String, IElementParameter> elementParaChild = elementPara.getChildParameters();
                    Map<String, IElementParameter> cloneElementChild = cloneElement.getChildParameters();
                    Iterator<Entry<String, IElementParameter>> ite = elementParaChild.entrySet().iterator();
                    while (ite.hasNext()) {
                        Entry<String, IElementParameter> entry = ite.next();
                        String key = entry.getKey();
                        IElementParameter c = entry.getValue();
                        if (key != null && c != null) {
                            IElementParameter cloneC = cloneElementChild.get(key);
                            if (cloneC != null) {
                                cloneC.setValue(c.getValue());
                                // if (lock == null) {
                                // cloneC.setReadOnly(true);
                                // } else {
                                // if (lock) {
                                // cloneC.setReadOnly(false);
                                // } else {
                                // cloneC.setReadOnly(true);
                                // }
                                // }
                                if (lockByOther) {
                                    cloneC.setReadOnly(true);
                                } else {
                                    cloneC.setReadOnly(c.isReadOnly());
                                }
                            }
                        }
                    }
                }
            }

        }

        for (IElementParameter param : cloneNode.getElementParameters()) {
            String repositoryValue = param.getRepositoryValue();
            if (param.isShow(cloneNode.getElementParameters()) && (repositoryValue != null)
                    && (!param.getName().equals(EParameterName.PROPERTY_TYPE.getName()))
                    && param.getFieldType() != EParameterFieldType.MEMO_SQL) {
                param.setRepositoryValueUsed(true);
                param.setReadOnly(true);
            }
        }

        cloneNode.setMetadataList(node.getMetadataList());
        // cloneNode.setExternalNode(node.getExternalNode());
        cloneNode.setListConnector(node.getListConnector());
        cloneNode.setConnectionName(node.getConnectionName());
        cloneNode.setLocation(node.getLocation());

        IExternalNode externalNode = cloneNode.getExternalNode();
        if (externalNode != null) {
            if (node.getExternalData() != null) {
                try {
                    externalNode.setExternalData(node.getExternalData().clone());
                } catch (CloneNotSupportedException e) {
                    ExceptionHandler.process(e);
                }
                cloneNode.setExternalData(externalNode.getExternalData());
            }
            if (node.getExternalNode().getExternalEmfData() != null) {
                externalNode.setExternalEmfData(EcoreUtil.copy(node.getExternalNode().getExternalEmfData()));
            }

            // for (IMetadataTable metaTable : node.getMetadataList()) {
            // String oldName = metaTable.getTableName();
            //                String newName = oldMetaToNewMeta.get(cloneNode.getUniqueName() + ":" + metaTable.getTableName()); //$NON-NLS-1$
            // externalNode.renameOutputConnection(oldName, newName);
            // CorePlugin.getDefault().getMapperService()
            // .renameJoinTable(process, externalNode.getExternalData(), createdNames);
            // }
            // when copy a external node, should also copy screeshot
            if (node.getExternalNode() != null) {
                ImageDescriptor screenshot = node.getExternalNode().getScreenshot();
                if (screenshot != null) {
                    externalNode.setScreenshot(screenshot);
                }
            }
        }
        cloneNode.setLabel(node.getLabel());
        cloneNode.setPropertyValue(EParameterName.LABEL.getName(), node.getLabel());
        return cloneNode;
    }

    public void updateNode(Node cloneNode, Node node) {
        List<? extends IElementParameter> elementParas = node.getElementParameters();
        for (IElementParameter elementPara : elementParas) {
            if (elementPara.getName() != null && !elementPara.getName().equals("UNIQUE_NAME")) {
                IElementParameter cloneElement = cloneNode.getElementParameter(elementPara.getName());
                cloneElement.setValue(elementPara.getValue());
            }

        }
        cloneNode.setLocation(node.getLocation());
    }

    public Connection cloneConnection(IConnection conn, INode source, INode target) {
        Connection cloneConn = new Connection(source, target, conn.getLineStyle(), conn.getConnectorName(), conn.getMetaName(),
                conn.getName(), conn.isMonitorConnection());
        if (!source.isActivate() || !target.isActivate()) {
            cloneConn.setActivate(false);
        }

        List<? extends IElementParameter> elementParas = conn.getElementParameters();

        for (IElementParameter elementPara : elementParas) {
            if (elementPara.getName() != null && !elementPara.getName().equals("UNIQUE_NAME")) {
                IElementParameter cloneElement = cloneConn.getElementParameter(elementPara.getName());
                Object paValue = elementPara.getValue();
                if (paValue instanceof List) {
                    List list = new ArrayList();
                    list.addAll((List) paValue);
                    cloneElement.setValue(list);
                } else {
                    cloneElement.setContextMode(elementPara.isContextMode());
                    cloneElement.setValue(elementPara.getValue());
                }

            }
        }

        return cloneConn;
    }

    public boolean canAdd(List<NodeContainer> nodeContainers, INode jobletNodes) {
        for (NodeContainer nodeCon : nodeContainers) {
            Node temNode = nodeCon.getNode();
            if (jobletNodes.getUniqueName().equals(temNode.getJoblet_unique_name())) {
                return false;
            }
        }
        return true;
    }

    public boolean canDelete(List<? extends INode> jobletNodes, Node temNode) {
        for (INode jCon : jobletNodes) {
            if (jCon.getUniqueName().equals(temNode.getJoblet_unique_name())) {
                return false;
            }
        }
        return true;
    }

    public Rectangle getExpandRectangle(Rectangle nodeRec) {
        Point location = nodeRec.getLocation();
        Dimension size = nodeRec.getSize();
        int width = location.x + size.width;
        int height = location.y + size.height;
        Rectangle rec = new Rectangle(0, 0, width, height);
        return rec;
    }

    public void makeSureUnlockJoblet(IProcess2 process) {
        List<? extends INode> nodeList = process.getGraphicalNodes();
        for (INode node : nodeList) {
            if (((Node) node).isJoblet()) {
                IJobletProviderService service = (IJobletProviderService) GlobalServiceRegister.getDefault().getService(
                        IJobletProviderService.class);
                if (service != null) {
                    service.unlockJoblet(node, false);
                }
            }
        }

    }

    public boolean needReadOnlyJoblet(JobletProcessItem jobletItem) {
        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        IEditorPart[] editors = page.getEditors();
        for (IEditorPart editor : editors) {
            if (editor instanceof AbstractMultiPageTalendEditor) {
                List<? extends INode> nodeList = ((AbstractMultiPageTalendEditor) editor).getProcess().getGraphicalNodes();
                for (INode node : nodeList) {
                    if (((Node) node).isJoblet() && jobletItem.getProperty() != null) {
                        if (jobletItem.getProperty().getId().equals(node.getComponent().getProcess().getId())) {
                            boolean haveLock = jobletItem.getState().isLocked();
                            boolean isSvn = false;
                            ISVNProviderService service = null;
                            if (PluginChecker.isSVNProviderPluginLoaded()) {
                                service = (ISVNProviderService) GlobalServiceRegister.getDefault().getService(
                                        ISVNProviderService.class);
                            }
                            if (service != null && service.isProjectInSvnMode()) {
                                isSvn = service.isProjectInSvnMode();
                            }
                            if (isSvn) {
                                IProxyRepositoryService proxyService = (IProxyRepositoryService) GlobalServiceRegister
                                        .getDefault().getService(IProxyRepositoryService.class);
                                IProxyRepositoryFactory factory = proxyService.getProxyRepositoryFactory();
                                ERepositoryStatus repositoryStatus = factory.getStatus(jobletItem);
                                if (repositoryStatus == ERepositoryStatus.LOCK_BY_USER) {
                                    haveLock = true;
                                }
                            }
                            if (haveLock) {
                                return true;
                            }

                        }

                    }
                }
            }
        }
        return false;
    }

    public boolean openedInJob(JobletProcessItem jobletItem, Node currNode) {
        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        IEditorPart[] editors = page.getEditors();
        for (IEditorPart editor : editors) {
            if (editor instanceof AbstractMultiPageTalendEditor) {
                IProcess2 pro = ((AbstractMultiPageTalendEditor) editor).getProcess();
                if (currNode != null) {
                    IProcess2 currPro = (IProcess2) currNode.getProcess();
                    if (currPro.getId().equals(pro.getId())) {
                        List<? extends INode> currNodeList = currPro.getGraphicalNodes();
                        for (INode node : currNodeList) {
                            if (node == currNode) {
                                continue;
                            } else {
                                if (((Node) node).isJoblet()&& jobletItem.getProperty() != null) {
                                    if (jobletItem.getProperty().getId().equals(node.getComponent().getProcess().getId())) {
                                        boolean haveOpened = !((Node) node).getNodeContainer().isCollapsed();
                                        if (haveOpened) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                        continue;
                    }
                }

                List<? extends INode> nodeList = pro.getGraphicalNodes();
                for (INode node : nodeList) {
                    if (((Node) node).isJoblet() && jobletItem.getProperty() != null) {
                        if (jobletItem.getProperty().getId().equals(node.getComponent().getProcess().getId())) {
                            boolean haveOpened = !((Node) node).getNodeContainer().isCollapsed();
                            if (haveOpened) {
                                return true;
                            }

                        }

                    }
                }
            }
        }
        return false;
    }

    public boolean checkModify(JobletContainer jobletContainer) {
        IJobletProviderService service = (IJobletProviderService) GlobalServiceRegister.getDefault().getService(
                IJobletProviderService.class);
        if (service != null) {
            service.reloadJobletProcess(jobletContainer.getNode());
        }
        IProcess process = jobletContainer.getNode().getComponent().getProcess();
        List<? extends INode> nodeList = process.getGraphicalNodes();
        List<NodeContainer> containerList = jobletContainer.getNodeContainers();
        for (NodeContainer nodeCon : containerList) {
            Node node = nodeCon.getNode();
            String jobletUnique = node.getJoblet_unique_name();
            if (jobletUnique == null || "".equals(jobletUnique)) {
                continue;
            }
            for (INode nodeOra : nodeList) {
                if (nodeOra.getUniqueName().equals(jobletUnique)) {
                    // if (nodeOra.isActivate() != node.isActivate()) {
                    // return true;
                    // }
                    List<? extends IElementParameter> paras = node.getElementParameters();
                    for (IElementParameter para : paras) {
                        if (para == null) {
                            continue;
                        }
                        String paraName = para.getName();
                        if (paraName != null) {
                            if (paraName.equals(EParameterName.UNIQUE_NAME.getName())) {
                                continue;
                            }
                            if (paraName.equals(EParameterName.UPDATE_COMPONENTS.getName())) {
                                continue;
                            }
                            IElementParameter paraOra = nodeOra.getElementParameter(paraName);
                            if (paraOra == null || para == null) {
                                continue;
                            }

                            if (para.getValue() != null) {
                                if (paraOra.getValue() != null) {
                                    // TDI-18915:The parameter here is not only a string value,but can be a
                                    // MetadataTable
                                    if (para.getValue() instanceof IMetadataTable) {
                                        boolean isSame = ((MetadataTable) para.getValue()).sameMetadataAs((MetadataTable) paraOra
                                                .getValue());
                                        if (!isSame) {
                                            return true;
                                        }
                                    } else {
                                        if (!para.getValue().equals(paraOra.getValue())) {
                                            return true;
                                        }
                                    }
                                } else {
                                    return true;
                                }
                            } else {
                                if (paraOra.getValue() != null) {
                                    return true;
                                }
                            }

                            if (paraOra.getChildParameters() != null && para.getChildParameters() != null) {
                                Map<String, IElementParameter> paraChild = para.getChildParameters();
                                Map<String, IElementParameter> paraOraChild = paraOra.getChildParameters();
                                Iterator<Entry<String, IElementParameter>> ite = paraChild.entrySet().iterator();
                                while (ite.hasNext()) {
                                    Entry<String, IElementParameter> entry = ite.next();
                                    String key = entry.getKey();
                                    IElementParameter c = entry.getValue();
                                    if (key != null && c != null) {
                                        IElementParameter oc = paraOraChild.get(key);

                                        if (oc != null) {
                                            if (c.getValue() != null) {
                                                if (oc.getValue() != null) {
                                                    if (!oc.getValue().equals(c.getValue())) {
                                                        return true;
                                                    }
                                                } else {
                                                    return true;
                                                }
                                            } else {
                                                if (oc.getValue() != null) {
                                                    return true;
                                                }
                                            }
                                        }

                                    }
                                }
                            }
                        }

                    }

                    List<IMetadataTable> nodeTables = node.getMetadataList();
                    List<IMetadataTable> oraTables = nodeOra.getMetadataList();
                    if (nodeTables.size() != oraTables.size()) {
                        return true;
                    }
                    for (IMetadataTable tab : nodeTables) {
                        for (IMetadataTable oraTab : oraTables) {
                            if (tab.getTableName().equals(oraTab.getTableName())) {
                                if (tab.getListColumns().size() != oraTab.getListColumns().size()) {
                                    return true;
                                } else {
                                    for (IMetadataColumn c : tab.getListColumns()) {
                                        IMetadataColumn oraColumn = oraTab.getColumn(c.getLabel());
                                        if (oraColumn == null) {
                                            return true;
                                        } else if (!c.getTalendType().equals(oraColumn.getTalendType())) {
                                            return true;
                                        } else if (!c.getType().equals(oraColumn.getType())) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    IExternalNode OraExternalNode = nodeOra.getExternalNode();
                    if (OraExternalNode != null) {
                        IExternalNode externalNode = node.getExternalNode();
                        if (externalNode == null) {
                            return true;
                        }
                        IExternalData oraData = nodeOra.getExternalData();
                        IExternalData data = node.getExternalData();
                        if (oraData != null) {
                            if (data == null) {
                                return true;
                            }
                            List<IMetadataTable> oraMetaList = OraExternalNode.getMetadataList();
                            List<IMetadataTable> metaList = externalNode.getMetadataList();
                            if (oraMetaList != null) {
                                if (metaList == null) {
                                    return true;
                                }
                                if (oraMetaList.size() != metaList.size()) {
                                    return true;
                                }
                            }

                        }

                    }

                }
            }
        }

        return false;
    }

    public boolean keepLockJoblet(Item item) {
        if (item instanceof JobletProcessItem) {
            boolean isOpen = openedInJob((JobletProcessItem) item, null);
            return !isOpen;
            // if (isOpen) {
            // boolean flag = MessageDialog.openConfirm(Display.getDefault().getActiveShell(), "Lock joblet",
            // "The joblet is openes in a job,Do you want unlock it?");
            // return flag;
            // }

        }
        return true;
    }

    public Map<String, List<AbstractJobletContainer>> getModifyMap(List<Element> elem) {
        Map<String, List<AbstractJobletContainer>> jobletNodeMap = new HashMap<String, List<AbstractJobletContainer>>();
        for (Element element : elem) {
            if (element instanceof SubjobContainer) {
                for (NodeContainer container : ((SubjobContainer) element).getNodeContainers()) {
                    if (container instanceof AbstractJobletContainer) {
                        String processID = container.getNode().getProcess().getId();
                        if (!jobletNodeMap.containsKey(processID)) {
                            List<AbstractJobletContainer> nodeList = new ArrayList<AbstractJobletContainer>();
                            nodeList.add((AbstractJobletContainer) container);
                            jobletNodeMap.put(processID, nodeList);
                        } else {
                            jobletNodeMap.get(processID).add((AbstractJobletContainer) container);
                        }
                    }
                }
            }
        }
        return jobletNodeMap;
    }

    // public void reloadJobletComponent(IProcess2 process){
    // IJobletProviderService service = (IJobletProviderService) GlobalServiceRegister.getDefault().getService(
    // IJobletProviderService.class);
    // if (service != null) {
    // process.get
    // service.reloadJobletProcess(this);
    // }
    // }

    public boolean lockByOthers(Item item) {
        IProxyRepositoryService service = (IProxyRepositoryService) GlobalServiceRegister.getDefault().getService(
                IProxyRepositoryService.class);
        IProxyRepositoryFactory factory = service.getProxyRepositoryFactory();
        ERepositoryStatus repositoryStatus = factory.getStatus(item);
        if (repositoryStatus == ERepositoryStatus.LOCK_BY_OTHER) {
            return true;
        }
        return false;
    }

    public List<SubjobContainer> getConnSubjob(SubjobContainer sub, List<ISubjobContainer> proSubList) {
        List<SubjobContainer> subList = new ArrayList<SubjobContainer>();
        if (!proSubList.contains(sub)) {
            return subList;
        }
        for (NodeContainer container : sub.getNodeContainers()) {
            List<IConnection> inList = new ArrayList<IConnection>();
            List<IConnection> outList = new ArrayList<IConnection>();
            if ((container instanceof AbstractJobletContainer)) {// && ((JobletContainer) container).isCollapsed()
                inList.addAll(((JobletContainer) container).getInputs());
                outList.addAll(((JobletContainer) container).getOutputs());
            } else {
                inList.addAll(container.getNode().getIncomingConnections());
                outList.addAll(container.getNode().getOutgoingConnections());
            }

            for (IConnection conn : inList) {
                INode source = conn.getSource();
                if (source instanceof Node) {
                    SubjobContainer tem = ((Node) conn.getSource()).getNodeContainer().getSubjobContainer();
                    if (tem != null && sub != tem) {
                        if (subList.contains(tem) || !proSubList.contains(tem)) {
                            continue;
                        }
                        subList.add(tem);
                        proSubList.remove(tem);
                        subList.addAll(getConnSubjob(tem, proSubList));
                    }
                }
            }
            for (IConnection conn : outList) {
                INode target = conn.getTarget();
                if (target instanceof Node) {
                    SubjobContainer tem = ((Node) conn.getTarget()).getNodeContainer().getSubjobContainer();
                    if (tem != null && sub != tem) {
                        if (subList.contains(tem) || !proSubList.contains(tem)) {
                            continue;
                        }
                        subList.add(tem);
                        proSubList.remove(tem);
                        subList.addAll(getConnSubjob(tem, proSubList));
                    }
                }
            }
        }
        return subList;

    }

    public boolean isRed(AbstractJobletContainer jobletContainer) {
        IProcess2 jobletProcess = (IProcess2) jobletContainer.getNode().getComponent().getProcess();
        if (jobletProcess == null) {
            return false;
        }
        ERepositoryStatus status = ProxyRepositoryFactory.getInstance().getStatus(jobletProcess.getProperty().getItem());
        if (status == ERepositoryStatus.LOCK_BY_OTHER) {
            return true;
        }
        IEditorPart[] editors = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getDirtyEditors();
        if (editors.length <= 0) {
            return false;
        }
        for (IEditorPart editor : editors) {
            if (editor.getEditorInput() instanceof RepositoryEditorInput) {
                RepositoryEditorInput editorInput = (RepositoryEditorInput) editor.getEditorInput();
                String jobletId = editorInput.getId();
                if (jobletId.equals(jobletProcess.getId())) {
                    return true;
                }
            }
        }

        return false;
    }

}
