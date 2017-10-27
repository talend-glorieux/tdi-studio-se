/*
 * An XML document type.
 * Localname: RetrieveOrganizationResponse
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * A document containing one RetrieveOrganizationResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery) element.
 *
 * This is a complex type.
 */
public class RetrieveOrganizationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RetrieveOrganizationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIEVEORGANIZATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "RetrieveOrganizationResponse");
    
    
    /**
     * Gets the "RetrieveOrganizationResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationResponse getRetrieveOrganizationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationResponse)get_store().find_element_user(RETRIEVEORGANIZATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RetrieveOrganizationResponse" element
     */
    public boolean isNilRetrieveOrganizationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationResponse)get_store().find_element_user(RETRIEVEORGANIZATIONRESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RetrieveOrganizationResponse" element
     */
    public void setRetrieveOrganizationResponse(com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationResponse retrieveOrganizationResponse)
    {
        generatedSetterHelperImpl(retrieveOrganizationResponse, RETRIEVEORGANIZATIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RetrieveOrganizationResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationResponse addNewRetrieveOrganizationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationResponse)get_store().add_element_user(RETRIEVEORGANIZATIONRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "RetrieveOrganizationResponse" element
     */
    public void setNilRetrieveOrganizationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationResponse)get_store().find_element_user(RETRIEVEORGANIZATIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationResponse)get_store().add_element_user(RETRIEVEORGANIZATIONRESPONSE$0);
            }
            target.setNil();
        }
    }
}
