/*
 * An XML document type.
 * Localname: RetrieveMultipleResponse
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Services
 * Java type: com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.services.impl;
/**
 * A document containing one RetrieveMultipleResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Services) element.
 *
 * This is a complex type.
 */
public class RetrieveMultipleResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RetrieveMultipleResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIEVEMULTIPLERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "RetrieveMultipleResponse");
    
    
    /**
     * Gets the "RetrieveMultipleResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleResponseDocument.RetrieveMultipleResponse getRetrieveMultipleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleResponseDocument.RetrieveMultipleResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleResponseDocument.RetrieveMultipleResponse)get_store().find_element_user(RETRIEVEMULTIPLERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RetrieveMultipleResponse" element
     */
    public void setRetrieveMultipleResponse(com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleResponseDocument.RetrieveMultipleResponse retrieveMultipleResponse)
    {
        generatedSetterHelperImpl(retrieveMultipleResponse, RETRIEVEMULTIPLERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RetrieveMultipleResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleResponseDocument.RetrieveMultipleResponse addNewRetrieveMultipleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleResponseDocument.RetrieveMultipleResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleResponseDocument.RetrieveMultipleResponse)get_store().add_element_user(RETRIEVEMULTIPLERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML RetrieveMultipleResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Services).
     *
     * This is a complex type.
     */
    public static class RetrieveMultipleResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.RetrieveMultipleResponseDocument.RetrieveMultipleResponse
    {
        private static final long serialVersionUID = 1L;
        
        public RetrieveMultipleResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETRIEVEMULTIPLERESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "RetrieveMultipleResult");
        
        
        /**
         * Gets the "RetrieveMultipleResult" element
         */
        public com.microsoft.schemas.xrm._2011.contracts.EntityCollection getRetrieveMultipleResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.EntityCollection target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().find_element_user(RETRIEVEMULTIPLERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "RetrieveMultipleResult" element
         */
        public boolean isNilRetrieveMultipleResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.EntityCollection target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().find_element_user(RETRIEVEMULTIPLERESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "RetrieveMultipleResult" element
         */
        public boolean isSetRetrieveMultipleResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETRIEVEMULTIPLERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "RetrieveMultipleResult" element
         */
        public void setRetrieveMultipleResult(com.microsoft.schemas.xrm._2011.contracts.EntityCollection retrieveMultipleResult)
        {
            generatedSetterHelperImpl(retrieveMultipleResult, RETRIEVEMULTIPLERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "RetrieveMultipleResult" element
         */
        public com.microsoft.schemas.xrm._2011.contracts.EntityCollection addNewRetrieveMultipleResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.EntityCollection target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().add_element_user(RETRIEVEMULTIPLERESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "RetrieveMultipleResult" element
         */
        public void setNilRetrieveMultipleResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.EntityCollection target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().find_element_user(RETRIEVEMULTIPLERESULT$0, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().add_element_user(RETRIEVEMULTIPLERESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "RetrieveMultipleResult" element
         */
        public void unsetRetrieveMultipleResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETRIEVEMULTIPLERESULT$0, 0);
            }
        }
    }
}
