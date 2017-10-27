/*
 * XML Type:  ErrorInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ErrorInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ErrorInfo(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ErrorInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ErrorInfo
{
    private static final long serialVersionUID = 1L;
    
    public ErrorInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORCODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ErrorCode");
    private static final javax.xml.namespace.QName RESOURCELIST$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ResourceList");
    
    
    /**
     * Gets the "ErrorCode" element
     */
    public java.lang.String getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorCode" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ErrorCode" element
     */
    public boolean isNilErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORCODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ErrorCode" element
     */
    public boolean isSetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "ErrorCode" element
     */
    public void setErrorCode(java.lang.String errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORCODE$0);
            }
            target.setStringValue(errorCode);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorCode" element
     */
    public void xsetErrorCode(org.apache.xmlbeans.XmlString errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORCODE$0);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Nils the "ErrorCode" element
     */
    public void setNilErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORCODE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ErrorCode" element
     */
    public void unsetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORCODE$0, 0);
        }
    }
    
    /**
     * Gets the "ResourceList" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo getResourceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo)get_store().find_element_user(RESOURCELIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ResourceList" element
     */
    public boolean isNilResourceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo)get_store().find_element_user(RESOURCELIST$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ResourceList" element
     */
    public boolean isSetResourceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCELIST$2) != 0;
        }
    }
    
    /**
     * Sets the "ResourceList" element
     */
    public void setResourceList(com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo resourceList)
    {
        generatedSetterHelperImpl(resourceList, RESOURCELIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ResourceList" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo addNewResourceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo)get_store().add_element_user(RESOURCELIST$2);
            return target;
        }
    }
    
    /**
     * Nils the "ResourceList" element
     */
    public void setNilResourceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo)get_store().find_element_user(RESOURCELIST$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo)get_store().add_element_user(RESOURCELIST$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ResourceList" element
     */
    public void unsetResourceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCELIST$2, 0);
        }
    }
}
