// ============================================================================
//
// Copyright (C) 2006-2015 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.editor.properties.controllers.generator;

import org.talend.core.ui.properties.tab.IDynamicProperty;
import org.talend.designer.core.ui.editor.properties.controllers.AbstractElementPropertySectionController;
import org.talend.designer.core.ui.editor.properties.controllers.OpenedListController;

/**
 * DOC zli class global comment. Detailled comment
 */
public class OpenedListGenerator implements IControllerGenerator {

    private IDynamicProperty dp;

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.designer.core.ui.editor.properties.controllers.generator.IControllerGenerator#generate()
     */
    public AbstractElementPropertySectionController generate() {
        return new OpenedListController(dp);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.talend.designer.core.ui.editor.properties.controllers.generator.IControllerGenerator#setDynamicProperty(org
     * .talend.designer.core.ui.editor.properties.controllers.generator.IDynamicProperty)
     */
    public void setDynamicProperty(IDynamicProperty dp) {
        this.dp = dp;
    }
}
