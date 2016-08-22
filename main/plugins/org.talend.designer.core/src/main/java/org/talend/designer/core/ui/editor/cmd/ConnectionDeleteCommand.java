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
package org.talend.designer.core.ui.editor.cmd;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.process.AbstractNode;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.INodeConnector;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.ui.editor.connections.Connection;
import org.talend.designer.core.ui.editor.jobletcontainer.AbstractJobletContainer;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.process.Process;

/**
 * Command that will delete a given connection. <br/>
 * 
 * $Id$
 * 
 */
public class ConnectionDeleteCommand extends Command {

    private List<Connection> connectionList;

    private Map<Connection, ConnectionDeletedInfo> connectionDeletedInfosMap;

    /**
     * Initialisation of the command that will delete the given connection.
     * 
     * @param connection connection to delete
     */
    public ConnectionDeleteCommand(List<Connection> connectionList) {
        setLabel(Messages.getString("ConnectionDeleteCommand.Label")); //$NON-NLS-1$
        this.connectionList = connectionList;
    }

    @Override
    public void execute() {
        connectionDeletedInfosMap = new HashMap<Connection, ConnectionDeleteCommand.ConnectionDeletedInfo>();
        Process process = (Process) connectionList.get(0).getSource().getProcess();
        for (Connection connection : connectionList) {
            boolean re = deleteExpendNode(connection);
            if (re) {
                return;
            }
            ConnectionDeletedInfo deletedInfo = new ConnectionDeletedInfo();
            connectionDeletedInfosMap.put(connection, deletedInfo);

            INode source = connection.getSource();
            if (source != null) {
                deletedInfo.metadataTable = connection.getMetadataTable();
                List<IMetadataTable> metaList = source.getMetadataList();
                if (metaList != null && deletedInfo.metadataTable != null) {
                    deletedInfo.metadataTableIndex = metaList.indexOf(deletedInfo.metadataTable);
                }
            }

            connection.disconnect();
            final INode target = connection.getTarget();
            if (target.getExternalNode() instanceof AbstractNode) {
                ((AbstractNode) target.getExternalNode()).removeInput(connection);
            }
            INodeConnector nodeConnectorSource, nodeConnectorTarget;
            nodeConnectorSource = connection.getSourceNodeConnector();
            if (nodeConnectorSource != null) {
                nodeConnectorSource.setCurLinkNbOutput(nodeConnectorSource.getCurLinkNbOutput() - 1);
            }
            nodeConnectorTarget = connection.getTargetNodeConnector();
            nodeConnectorTarget.setCurLinkNbInput(nodeConnectorTarget.getCurLinkNbInput() - 1);
        }
        process.checkStartNodes();
        process.checkProcess();
    }

    @Override
    public void undo() {
        Process process = (Process) connectionList.get(0).getSource().getProcess();
        for (Connection connection : connectionList) {
            collpseJoblet(connection);
            ConnectionDeletedInfo deletedInfo = connectionDeletedInfosMap.get(connection);
            if (deletedInfo != null) {
                INode source = connection.getSource();
                if (source != null && deletedInfo.metadataTable != null) {
                    List<IMetadataTable> metaList = source.getMetadataList();
                    if (!metaList.contains(deletedInfo.metadataTable)) {
                        metaList.add(deletedInfo.metadataTableIndex, deletedInfo.metadataTable);
                    }
                }
            }
            connection.reconnect();
            INode target = connection.getTarget();
            if (target.getExternalNode() instanceof AbstractNode) {
                ((AbstractNode) target.getExternalNode()).addInput(connection);
            }

            INodeConnector nodeConnectorSource, nodeConnectorTarget;
            nodeConnectorSource = connection.getSourceNodeConnector();
            if (nodeConnectorSource != null) {
                nodeConnectorSource.setCurLinkNbOutput(nodeConnectorSource.getCurLinkNbOutput() + 1);
            }

            nodeConnectorTarget = connection.getTargetNodeConnector();
            if (nodeConnectorTarget != null) {
                nodeConnectorTarget.setCurLinkNbInput(nodeConnectorTarget.getCurLinkNbInput() + 1);
            }

        }
        process.checkStartNodes();
        process.checkProcess();
    }

    private boolean deleteExpendNode(Connection connection) {
        final INode target = connection.getTarget();
        if (target instanceof Node && ((Node) target).getNodeContainer() != null) {
            if (((Node) target).getJobletNode() != null) {
                MessageDialog.openWarning(Display.getCurrent().getActiveShell(),
                        Messages.getString("ConnectionDeleteCommand.COLLAPSE"), //$NON-NLS-1$
                        Messages.getString("ConnectionDeleteCommand.COLLAPSEJOBLET")); //$NON-NLS-1$
                return true;
            }
            ((Node) target).getNodeContainer().getInputs().remove(connection);
        }
        final INode source = connection.getSource();
        if (source instanceof Node && ((Node) source).getNodeContainer() != null) {
            if (((Node) source).getJobletNode() != null) {
                MessageDialog.openWarning(Display.getCurrent().getActiveShell(),
                        Messages.getString("ConnectionDeleteCommand.COLLAPSE"), //$NON-NLS-1$
                        Messages.getString("ConnectionDeleteCommand.COLLAPSEJOBLET")); //$NON-NLS-1$
                return true;
            }
            ((Node) source).getNodeContainer().getOutputs().remove(connection);
        }
        return false;
    }

    private void collpseJoblet(Connection conn) {
        INode source = conn.getSource();
        if ((source instanceof Node) && ((Node) source).isJoblet()
                && (((Node) source).getNodeContainer() instanceof AbstractJobletContainer)) {
            ((AbstractJobletContainer) ((Node) source).getNodeContainer()).setCollapsed(true);
        }
        INode target = conn.getTarget();
        if ((target instanceof Node) && ((Node) target).isJoblet()
                && (((Node) target).getNodeContainer() instanceof AbstractJobletContainer)) {
            ((AbstractJobletContainer) ((Node) target).getNodeContainer()).setCollapsed(true);
        }
    }

    private class ConnectionDeletedInfo {

        public int metadataTableIndex = -1;

        public IMetadataTable metadataTable = null;

    }
}
