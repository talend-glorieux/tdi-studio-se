/*
 * An XML document type.
 * Localname: OrganizationRequest
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.OrganizationRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one OrganizationRequest(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class OrganizationRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.OrganizationRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "OrganizationRequest");
    
    
    /**
     * Gets the "OrganizationRequest" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest getOrganizationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest)get_store().find_element_user(ORGANIZATIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationRequest" element
     */
    public boolean isNilOrganizationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest)get_store().find_element_user(ORGANIZATIONREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationRequest" element
     */
    public void setOrganizationRequest(com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest organizationRequest)
    {
        generatedSetterHelperImpl(organizationRequest, ORGANIZATIONREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrganizationRequest" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest addNewOrganizationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest)get_store().add_element_user(ORGANIZATIONREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrganizationRequest" element
     */
    public void setNilOrganizationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest)get_store().find_element_user(ORGANIZATIONREQUEST$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest)get_store().add_element_user(ORGANIZATIONREQUEST$0);
            }
            target.setNil();
        }
    }
}
