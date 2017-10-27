/*
 * An XML document type.
 * Localname: OrganizationResponse
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.OrganizationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one OrganizationResponse(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class OrganizationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.OrganizationResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "OrganizationResponse");
    
    
    /**
     * Gets the "OrganizationResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse getOrganizationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse)get_store().find_element_user(ORGANIZATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationResponse" element
     */
    public boolean isNilOrganizationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse)get_store().find_element_user(ORGANIZATIONRESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationResponse" element
     */
    public void setOrganizationResponse(com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse organizationResponse)
    {
        generatedSetterHelperImpl(organizationResponse, ORGANIZATIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrganizationResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse addNewOrganizationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse)get_store().add_element_user(ORGANIZATIONRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrganizationResponse" element
     */
    public void setNilOrganizationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse)get_store().find_element_user(ORGANIZATIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse)get_store().add_element_user(ORGANIZATIONRESPONSE$0);
            }
            target.setNil();
        }
    }
}
