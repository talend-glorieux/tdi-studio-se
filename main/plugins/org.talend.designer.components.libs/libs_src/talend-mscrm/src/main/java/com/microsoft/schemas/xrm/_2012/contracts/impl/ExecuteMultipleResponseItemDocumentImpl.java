/*
 * An XML document type.
 * Localname: ExecuteMultipleResponseItem
 * Namespace: http://schemas.microsoft.com/xrm/2012/Contracts
 * Java type: com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItemDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2012.contracts.impl;
/**
 * A document containing one ExecuteMultipleResponseItem(@http://schemas.microsoft.com/xrm/2012/Contracts) element.
 *
 * This is a complex type.
 */
public class ExecuteMultipleResponseItemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItemDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExecuteMultipleResponseItemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXECUTEMULTIPLERESPONSEITEM$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2012/Contracts", "ExecuteMultipleResponseItem");
    
    
    /**
     * Gets the "ExecuteMultipleResponseItem" element
     */
    public com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem getExecuteMultipleResponseItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem target = null;
            target = (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem)get_store().find_element_user(EXECUTEMULTIPLERESPONSEITEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ExecuteMultipleResponseItem" element
     */
    public boolean isNilExecuteMultipleResponseItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem target = null;
            target = (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem)get_store().find_element_user(EXECUTEMULTIPLERESPONSEITEM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ExecuteMultipleResponseItem" element
     */
    public void setExecuteMultipleResponseItem(com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem executeMultipleResponseItem)
    {
        generatedSetterHelperImpl(executeMultipleResponseItem, EXECUTEMULTIPLERESPONSEITEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ExecuteMultipleResponseItem" element
     */
    public com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem addNewExecuteMultipleResponseItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem target = null;
            target = (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem)get_store().add_element_user(EXECUTEMULTIPLERESPONSEITEM$0);
            return target;
        }
    }
    
    /**
     * Nils the "ExecuteMultipleResponseItem" element
     */
    public void setNilExecuteMultipleResponseItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem target = null;
            target = (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem)get_store().find_element_user(EXECUTEMULTIPLERESPONSEITEM$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem)get_store().add_element_user(EXECUTEMULTIPLERESPONSEITEM$0);
            }
            target.setNil();
        }
    }
}
