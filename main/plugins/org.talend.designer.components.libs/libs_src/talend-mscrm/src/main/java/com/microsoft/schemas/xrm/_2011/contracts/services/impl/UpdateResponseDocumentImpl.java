/*
 * An XML document type.
 * Localname: UpdateResponse
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Services
 * Java type: com.microsoft.schemas.xrm._2011.contracts.services.UpdateResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.services.impl;
/**
 * A document containing one UpdateResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Services) element.
 *
 * This is a complex type.
 */
public class UpdateResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.UpdateResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "UpdateResponse");
    
    
    /**
     * Gets the "UpdateResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.UpdateResponseDocument.UpdateResponse getUpdateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.UpdateResponseDocument.UpdateResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.UpdateResponseDocument.UpdateResponse)get_store().find_element_user(UPDATERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateResponse" element
     */
    public void setUpdateResponse(com.microsoft.schemas.xrm._2011.contracts.services.UpdateResponseDocument.UpdateResponse updateResponse)
    {
        generatedSetterHelperImpl(updateResponse, UPDATERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UpdateResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.UpdateResponseDocument.UpdateResponse addNewUpdateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.UpdateResponseDocument.UpdateResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.UpdateResponseDocument.UpdateResponse)get_store().add_element_user(UPDATERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Services).
     *
     * This is a complex type.
     */
    public static class UpdateResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.UpdateResponseDocument.UpdateResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
