/*
 * An XML document type.
 * Localname: CreateResponse
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Services
 * Java type: com.microsoft.schemas.xrm._2011.contracts.services.CreateResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.services.impl;
/**
 * A document containing one CreateResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Services) element.
 *
 * This is a complex type.
 */
public class CreateResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.CreateResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "CreateResponse");
    
    
    /**
     * Gets the "CreateResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.CreateResponseDocument.CreateResponse getCreateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.CreateResponseDocument.CreateResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.CreateResponseDocument.CreateResponse)get_store().find_element_user(CREATERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateResponse" element
     */
    public void setCreateResponse(com.microsoft.schemas.xrm._2011.contracts.services.CreateResponseDocument.CreateResponse createResponse)
    {
        generatedSetterHelperImpl(createResponse, CREATERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CreateResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.CreateResponseDocument.CreateResponse addNewCreateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.CreateResponseDocument.CreateResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.CreateResponseDocument.CreateResponse)get_store().add_element_user(CREATERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Services).
     *
     * This is a complex type.
     */
    public static class CreateResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.CreateResponseDocument.CreateResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CreateResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CREATERESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "CreateResult");
        
        
        /**
         * Gets the "CreateResult" element
         */
        public java.lang.String getCreateResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CreateResult" element
         */
        public com.microsoft.schemas._2003._10.serialization.Guid xgetCreateResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas._2003._10.serialization.Guid target = null;
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(CREATERESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "CreateResult" element
         */
        public boolean isSetCreateResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "CreateResult" element
         */
        public void setCreateResult(java.lang.String createResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATERESULT$0);
                }
                target.setStringValue(createResult);
            }
        }
        
        /**
         * Sets (as xml) the "CreateResult" element
         */
        public void xsetCreateResult(com.microsoft.schemas._2003._10.serialization.Guid createResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas._2003._10.serialization.Guid target = null;
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(CREATERESULT$0, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(CREATERESULT$0);
                }
                target.set(createResult);
            }
        }
        
        /**
         * Unsets the "CreateResult" element
         */
        public void unsetCreateResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATERESULT$0, 0);
            }
        }
    }
}
