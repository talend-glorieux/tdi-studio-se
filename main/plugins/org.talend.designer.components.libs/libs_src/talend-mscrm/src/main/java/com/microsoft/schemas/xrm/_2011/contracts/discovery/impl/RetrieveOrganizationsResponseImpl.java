/*
 * XML Type:  RetrieveOrganizationsResponse
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * An XML RetrieveOrganizationsResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery).
 *
 * This is a complex type.
 */
public class RetrieveOrganizationsResponseImpl extends com.microsoft.schemas.xrm._2011.contracts.discovery.impl.DiscoveryResponseImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsResponse
{
    private static final long serialVersionUID = 1L;
    
    public RetrieveOrganizationsResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DETAILS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "Details");
    
    
    /**
     * Gets the "Details" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection getDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection)get_store().find_element_user(DETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Details" element
     */
    public boolean isNilDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection)get_store().find_element_user(DETAILS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Details" element
     */
    public boolean isSetDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAILS$0) != 0;
        }
    }
    
    /**
     * Sets the "Details" element
     */
    public void setDetails(com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection details)
    {
        generatedSetterHelperImpl(details, DETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Details" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection addNewDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection)get_store().add_element_user(DETAILS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Details" element
     */
    public void setNilDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection)get_store().find_element_user(DETAILS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection)get_store().add_element_user(DETAILS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Details" element
     */
    public void unsetDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAILS$0, 0);
        }
    }
}
