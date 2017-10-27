/*
 * An XML document type.
 * Localname: ExecuteResponse
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Services
 * Java type: com.microsoft.schemas.xrm._2011.contracts.services.ExecuteResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.services.impl;
/**
 * A document containing one ExecuteResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Services) element.
 *
 * This is a complex type.
 */
public class ExecuteResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.ExecuteResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExecuteResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXECUTERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "ExecuteResponse");
    
    
    /**
     * Gets the "ExecuteResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.ExecuteResponseDocument.ExecuteResponse getExecuteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.ExecuteResponseDocument.ExecuteResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.ExecuteResponseDocument.ExecuteResponse)get_store().find_element_user(EXECUTERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExecuteResponse" element
     */
    public void setExecuteResponse(com.microsoft.schemas.xrm._2011.contracts.services.ExecuteResponseDocument.ExecuteResponse executeResponse)
    {
        generatedSetterHelperImpl(executeResponse, EXECUTERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ExecuteResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.ExecuteResponseDocument.ExecuteResponse addNewExecuteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.ExecuteResponseDocument.ExecuteResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.ExecuteResponseDocument.ExecuteResponse)get_store().add_element_user(EXECUTERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ExecuteResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Services).
     *
     * This is a complex type.
     */
    public static class ExecuteResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.ExecuteResponseDocument.ExecuteResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ExecuteResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXECUTERESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "ExecuteResult");
        
        
        /**
         * Gets the "ExecuteResult" element
         */
        public com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse getExecuteResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse)get_store().find_element_user(EXECUTERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "ExecuteResult" element
         */
        public boolean isNilExecuteResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse)get_store().find_element_user(EXECUTERESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "ExecuteResult" element
         */
        public boolean isSetExecuteResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXECUTERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "ExecuteResult" element
         */
        public void setExecuteResult(com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse executeResult)
        {
            generatedSetterHelperImpl(executeResult, EXECUTERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ExecuteResult" element
         */
        public com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse addNewExecuteResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse)get_store().add_element_user(EXECUTERESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "ExecuteResult" element
         */
        public void setNilExecuteResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse)get_store().find_element_user(EXECUTERESULT$0, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse)get_store().add_element_user(EXECUTERESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "ExecuteResult" element
         */
        public void unsetExecuteResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXECUTERESULT$0, 0);
            }
        }
    }
}
