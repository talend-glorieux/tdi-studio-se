/*
 * An XML document type.
 * Localname: ExecuteMultipleSettings
 * Namespace: http://schemas.microsoft.com/xrm/2012/Contracts
 * Java type: com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettingsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2012.contracts.impl;
/**
 * A document containing one ExecuteMultipleSettings(@http://schemas.microsoft.com/xrm/2012/Contracts) element.
 *
 * This is a complex type.
 */
public class ExecuteMultipleSettingsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettingsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExecuteMultipleSettingsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXECUTEMULTIPLESETTINGS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2012/Contracts", "ExecuteMultipleSettings");
    
    
    /**
     * Gets the "ExecuteMultipleSettings" element
     */
    public com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings getExecuteMultipleSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings target = null;
            target = (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings)get_store().find_element_user(EXECUTEMULTIPLESETTINGS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ExecuteMultipleSettings" element
     */
    public boolean isNilExecuteMultipleSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings target = null;
            target = (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings)get_store().find_element_user(EXECUTEMULTIPLESETTINGS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ExecuteMultipleSettings" element
     */
    public void setExecuteMultipleSettings(com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings executeMultipleSettings)
    {
        generatedSetterHelperImpl(executeMultipleSettings, EXECUTEMULTIPLESETTINGS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ExecuteMultipleSettings" element
     */
    public com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings addNewExecuteMultipleSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings target = null;
            target = (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings)get_store().add_element_user(EXECUTEMULTIPLESETTINGS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ExecuteMultipleSettings" element
     */
    public void setNilExecuteMultipleSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings target = null;
            target = (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings)get_store().find_element_user(EXECUTEMULTIPLESETTINGS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings)get_store().add_element_user(EXECUTEMULTIPLESETTINGS$0);
            }
            target.setNil();
        }
    }
}
