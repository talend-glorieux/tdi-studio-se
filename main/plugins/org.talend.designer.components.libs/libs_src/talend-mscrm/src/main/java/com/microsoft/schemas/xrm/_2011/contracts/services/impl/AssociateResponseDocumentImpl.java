/*
 * An XML document type.
 * Localname: AssociateResponse
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Services
 * Java type: com.microsoft.schemas.xrm._2011.contracts.services.AssociateResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.services.impl;
/**
 * A document containing one AssociateResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Services) element.
 *
 * This is a complex type.
 */
public class AssociateResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.AssociateResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AssociateResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSOCIATERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "AssociateResponse");
    
    
    /**
     * Gets the "AssociateResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.AssociateResponseDocument.AssociateResponse getAssociateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.AssociateResponseDocument.AssociateResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.AssociateResponseDocument.AssociateResponse)get_store().find_element_user(ASSOCIATERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AssociateResponse" element
     */
    public void setAssociateResponse(com.microsoft.schemas.xrm._2011.contracts.services.AssociateResponseDocument.AssociateResponse associateResponse)
    {
        generatedSetterHelperImpl(associateResponse, ASSOCIATERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AssociateResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.AssociateResponseDocument.AssociateResponse addNewAssociateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.AssociateResponseDocument.AssociateResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.AssociateResponseDocument.AssociateResponse)get_store().add_element_user(ASSOCIATERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AssociateResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Services).
     *
     * This is a complex type.
     */
    public static class AssociateResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.AssociateResponseDocument.AssociateResponse
    {
        private static final long serialVersionUID = 1L;
        
        public AssociateResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
