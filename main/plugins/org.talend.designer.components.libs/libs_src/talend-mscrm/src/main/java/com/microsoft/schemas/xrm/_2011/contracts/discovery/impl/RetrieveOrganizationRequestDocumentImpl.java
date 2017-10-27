/*
 * An XML document type.
 * Localname: RetrieveOrganizationRequest
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * A document containing one RetrieveOrganizationRequest(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery) element.
 *
 * This is a complex type.
 */
public class RetrieveOrganizationRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RetrieveOrganizationRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIEVEORGANIZATIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "RetrieveOrganizationRequest");
    
    
    /**
     * Gets the "RetrieveOrganizationRequest" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationRequest getRetrieveOrganizationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationRequest)get_store().find_element_user(RETRIEVEORGANIZATIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RetrieveOrganizationRequest" element
     */
    public boolean isNilRetrieveOrganizationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationRequest)get_store().find_element_user(RETRIEVEORGANIZATIONREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RetrieveOrganizationRequest" element
     */
    public void setRetrieveOrganizationRequest(com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationRequest retrieveOrganizationRequest)
    {
        generatedSetterHelperImpl(retrieveOrganizationRequest, RETRIEVEORGANIZATIONREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RetrieveOrganizationRequest" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationRequest addNewRetrieveOrganizationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationRequest)get_store().add_element_user(RETRIEVEORGANIZATIONREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "RetrieveOrganizationRequest" element
     */
    public void setNilRetrieveOrganizationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationRequest)get_store().find_element_user(RETRIEVEORGANIZATIONREQUEST$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationRequest)get_store().add_element_user(RETRIEVEORGANIZATIONREQUEST$0);
            }
            target.setNil();
        }
    }
}
