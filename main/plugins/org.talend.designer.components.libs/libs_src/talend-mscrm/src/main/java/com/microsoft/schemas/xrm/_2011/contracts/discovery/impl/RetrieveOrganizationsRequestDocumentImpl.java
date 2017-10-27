/*
 * An XML document type.
 * Localname: RetrieveOrganizationsRequest
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * A document containing one RetrieveOrganizationsRequest(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery) element.
 *
 * This is a complex type.
 */
public class RetrieveOrganizationsRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RetrieveOrganizationsRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIEVEORGANIZATIONSREQUEST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "RetrieveOrganizationsRequest");
    
    
    /**
     * Gets the "RetrieveOrganizationsRequest" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest getRetrieveOrganizationsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest)get_store().find_element_user(RETRIEVEORGANIZATIONSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RetrieveOrganizationsRequest" element
     */
    public boolean isNilRetrieveOrganizationsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest)get_store().find_element_user(RETRIEVEORGANIZATIONSREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RetrieveOrganizationsRequest" element
     */
    public void setRetrieveOrganizationsRequest(com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest retrieveOrganizationsRequest)
    {
        generatedSetterHelperImpl(retrieveOrganizationsRequest, RETRIEVEORGANIZATIONSREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RetrieveOrganizationsRequest" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest addNewRetrieveOrganizationsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest)get_store().add_element_user(RETRIEVEORGANIZATIONSREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "RetrieveOrganizationsRequest" element
     */
    public void setNilRetrieveOrganizationsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest)get_store().find_element_user(RETRIEVEORGANIZATIONSREQUEST$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest)get_store().add_element_user(RETRIEVEORGANIZATIONSREQUEST$0);
            }
            target.setNil();
        }
    }
}
