/*
 * An XML document type.
 * Localname: ErrorInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ErrorInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ErrorInfo(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ErrorInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ErrorInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ErrorInfo");
    
    
    /**
     * Gets the "ErrorInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ErrorInfo getErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ErrorInfo)get_store().find_element_user(ERRORINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ErrorInfo" element
     */
    public boolean isNilErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ErrorInfo)get_store().find_element_user(ERRORINFO$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ErrorInfo" element
     */
    public void setErrorInfo(com.microsoft.schemas.crm._2011.contracts.ErrorInfo errorInfo)
    {
        generatedSetterHelperImpl(errorInfo, ERRORINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ErrorInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ErrorInfo addNewErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ErrorInfo)get_store().add_element_user(ERRORINFO$0);
            return target;
        }
    }
    
    /**
     * Nils the "ErrorInfo" element
     */
    public void setNilErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ErrorInfo)get_store().find_element_user(ERRORINFO$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ErrorInfo)get_store().add_element_user(ERRORINFO$0);
            }
            target.setNil();
        }
    }
}
