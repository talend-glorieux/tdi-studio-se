/*
 * An XML document type.
 * Localname: DisassociateResponse
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Services
 * Java type: com.microsoft.schemas.xrm._2011.contracts.services.DisassociateResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.services.impl;
/**
 * A document containing one DisassociateResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Services) element.
 *
 * This is a complex type.
 */
public class DisassociateResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.DisassociateResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisassociateResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISASSOCIATERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Services", "DisassociateResponse");
    
    
    /**
     * Gets the "DisassociateResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.DisassociateResponseDocument.DisassociateResponse getDisassociateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.DisassociateResponseDocument.DisassociateResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateResponseDocument.DisassociateResponse)get_store().find_element_user(DISASSOCIATERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DisassociateResponse" element
     */
    public void setDisassociateResponse(com.microsoft.schemas.xrm._2011.contracts.services.DisassociateResponseDocument.DisassociateResponse disassociateResponse)
    {
        generatedSetterHelperImpl(disassociateResponse, DISASSOCIATERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DisassociateResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.services.DisassociateResponseDocument.DisassociateResponse addNewDisassociateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.services.DisassociateResponseDocument.DisassociateResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.services.DisassociateResponseDocument.DisassociateResponse)get_store().add_element_user(DISASSOCIATERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DisassociateResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Services).
     *
     * This is a complex type.
     */
    public static class DisassociateResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.services.DisassociateResponseDocument.DisassociateResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DisassociateResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
