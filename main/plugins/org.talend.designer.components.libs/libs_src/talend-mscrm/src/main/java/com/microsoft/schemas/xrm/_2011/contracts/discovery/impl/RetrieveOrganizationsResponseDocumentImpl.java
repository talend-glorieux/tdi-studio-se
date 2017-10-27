/*
 * An XML document type.
 * Localname: RetrieveOrganizationsResponse
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * A document containing one RetrieveOrganizationsResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery) element.
 *
 * This is a complex type.
 */
public class RetrieveOrganizationsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RetrieveOrganizationsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIEVEORGANIZATIONSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "RetrieveOrganizationsResponse");
    
    
    /**
     * Gets the "RetrieveOrganizationsResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsResponse getRetrieveOrganizationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsResponse)get_store().find_element_user(RETRIEVEORGANIZATIONSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RetrieveOrganizationsResponse" element
     */
    public boolean isNilRetrieveOrganizationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsResponse)get_store().find_element_user(RETRIEVEORGANIZATIONSRESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RetrieveOrganizationsResponse" element
     */
    public void setRetrieveOrganizationsResponse(com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsResponse retrieveOrganizationsResponse)
    {
        generatedSetterHelperImpl(retrieveOrganizationsResponse, RETRIEVEORGANIZATIONSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RetrieveOrganizationsResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsResponse addNewRetrieveOrganizationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsResponse)get_store().add_element_user(RETRIEVEORGANIZATIONSRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "RetrieveOrganizationsResponse" element
     */
    public void setNilRetrieveOrganizationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsResponse)get_store().find_element_user(RETRIEVEORGANIZATIONSRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsResponse)get_store().add_element_user(RETRIEVEORGANIZATIONSRESPONSE$0);
            }
            target.setNil();
        }
    }
}
