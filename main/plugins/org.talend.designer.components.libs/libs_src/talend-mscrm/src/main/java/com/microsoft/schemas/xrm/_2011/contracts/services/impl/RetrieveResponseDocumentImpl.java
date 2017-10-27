/*
 * An XML document type.
 * Localname: RetrieveResponse
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Services
 * Java type: com.microsoft.schemas.xrm._2011.contracts.services.RetrieveResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.services.impl;
/**
 * A document containing one RetrieveResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Services) element.
 *
 * This is a complex type.
 */
public class RetrieveResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.RetrieveResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RetrieveResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIEVERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "RetrieveResponse");
    
    
    /**
     * Gets the "RetrieveResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.RetrieveResponseDocument.RetrieveResponse getRetrieveResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.RetrieveResponseDocument.RetrieveResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.RetrieveResponseDocument.RetrieveResponse)get_store().find_element_user(RETRIEVERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RetrieveResponse" element
     */
    public void setRetrieveResponse(com.microsoft.schemas.xrm._2011.contracts.services.RetrieveResponseDocument.RetrieveResponse retrieveResponse)
    {
        generatedSetterHelperImpl(retrieveResponse, RETRIEVERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RetrieveResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.RetrieveResponseDocument.RetrieveResponse addNewRetrieveResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.RetrieveResponseDocument.RetrieveResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.RetrieveResponseDocument.RetrieveResponse)get_store().add_element_user(RETRIEVERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML RetrieveResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Services).
     *
     * This is a complex type.
     */
    public static class RetrieveResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.RetrieveResponseDocument.RetrieveResponse
    {
        private static final long serialVersionUID = 1L;
        
        public RetrieveResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETRIEVERESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "RetrieveResult");
        
        
        /**
         * Gets the "RetrieveResult" element
         */
        public com.microsoft.schemas.xrm._2011.contracts.Entity getRetrieveResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(RETRIEVERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "RetrieveResult" element
         */
        public boolean isNilRetrieveResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(RETRIEVERESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "RetrieveResult" element
         */
        public boolean isSetRetrieveResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETRIEVERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "RetrieveResult" element
         */
        public void setRetrieveResult(com.microsoft.schemas.xrm._2011.contracts.Entity retrieveResult)
        {
            generatedSetterHelperImpl(retrieveResult, RETRIEVERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "RetrieveResult" element
         */
        public com.microsoft.schemas.xrm._2011.contracts.Entity addNewRetrieveResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().add_element_user(RETRIEVERESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "RetrieveResult" element
         */
        public void setNilRetrieveResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
                target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(RETRIEVERESULT$0, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().add_element_user(RETRIEVERESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "RetrieveResult" element
         */
        public void unsetRetrieveResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETRIEVERESULT$0, 0);
            }
        }
    }
}
