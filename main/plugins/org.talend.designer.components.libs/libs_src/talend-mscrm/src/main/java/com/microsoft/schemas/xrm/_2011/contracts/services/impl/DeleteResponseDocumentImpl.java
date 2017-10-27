/*
 * An XML document type.
 * Localname: DeleteResponse
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Services
 * Java type: com.microsoft.schemas.xrm._2011.contracts.services.DeleteResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.services.impl;
/**
 * A document containing one DeleteResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Services) element.
 *
 * This is a complex type.
 */
public class DeleteResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.DeleteResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "DeleteResponse");
    
    
    /**
     * Gets the "DeleteResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.DeleteResponseDocument.DeleteResponse getDeleteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.DeleteResponseDocument.DeleteResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.DeleteResponseDocument.DeleteResponse)get_store().find_element_user(DELETERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteResponse" element
     */
    public void setDeleteResponse(com.microsoft.schemas.xrm._2011.contracts.services.DeleteResponseDocument.DeleteResponse deleteResponse)
    {
        generatedSetterHelperImpl(deleteResponse, DELETERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeleteResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.DeleteResponseDocument.DeleteResponse addNewDeleteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.DeleteResponseDocument.DeleteResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.DeleteResponseDocument.DeleteResponse)get_store().add_element_user(DELETERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Services).
     *
     * This is a complex type.
     */
    public static class DeleteResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.DeleteResponseDocument.DeleteResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
