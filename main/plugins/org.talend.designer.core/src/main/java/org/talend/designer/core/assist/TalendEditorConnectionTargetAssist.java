// ============================================================================
//
// Copyright (C) 2006-2013 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.assist;

import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.swt.widgets.Display;
import org.talend.core.model.process.IProcess2;

/**
 * DOC Talend class global comment. Detailled comment
 */
public class TalendEditorConnectionTargetAssist extends TalendEditorComponentCreationAssist {

    private String componentName;

    public TalendEditorConnectionTargetAssist(String categoryName, GraphicalViewer viewer, CommandStack commandStack,
            IProcess2 process) {
        super(categoryName, viewer, commandStack, process);
    }

    /**
     * open the creation assist according to the trigger character
     * 
     * @param triggerChar
     */
    @Override
    public void showComponentCreationAssist(char triggerChar) {
        super.showComponentCreationAssist(triggerChar);

        Display display = assistText.getDisplay();
        while (!assistText.isDisposed() && assistText.isVisible()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
    }

    /**
     * create component at current position, according to select proposal label DOC talend2 Comment method
     * "createComponent".
     * 
     * @param componentName
     * @param location
     */
    @Override
    protected void acceptProposal() {
        this.componentName = assistText.getText().trim();
        disposeAssistText();
    }

    private void disposeAssistText() {
        if (assistText != null && !assistText.isDisposed()) {
            assistText.dispose();
        }
        // restore key event filter on Display
        if (bindingService != null) {
            bindingService.setKeyFilterEnabled(isKeyFilterEnabled);
        }
        if (overedConnection != null) {
            overedConnection.setLineWidth(1);
            overedConnection = null;
        }
    }

    public String getComponentName() {
        return this.componentName;
    }

    public void releaseText() {
        assistText = null;
    }

}
