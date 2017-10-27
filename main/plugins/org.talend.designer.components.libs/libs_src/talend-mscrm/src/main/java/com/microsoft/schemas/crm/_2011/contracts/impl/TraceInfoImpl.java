/*
 * XML Type:  TraceInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.TraceInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML TraceInfo(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class TraceInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.TraceInfo
{
    private static final long serialVersionUID = 1L;
    
    public TraceInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORINFOLIST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ErrorInfoList");
    
    
    /**
     * Gets the "ErrorInfoList" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo getErrorInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo)get_store().find_element_user(ERRORINFOLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ErrorInfoList" element
     */
    public boolean isNilErrorInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo)get_store().find_element_user(ERRORINFOLIST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ErrorInfoList" element
     */
    public boolean isSetErrorInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORINFOLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "ErrorInfoList" element
     */
    public void setErrorInfoList(com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo errorInfoList)
    {
        generatedSetterHelperImpl(errorInfoList, ERRORINFOLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ErrorInfoList" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo addNewErrorInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo)get_store().add_element_user(ERRORINFOLIST$0);
            return target;
        }
    }
    
    /**
     * Nils the "ErrorInfoList" element
     */
    public void setNilErrorInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo)get_store().find_element_user(ERRORINFOLIST$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo)get_store().add_element_user(ERRORINFOLIST$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ErrorInfoList" element
     */
    public void unsetErrorInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORINFOLIST$0, 0);
        }
    }
}
