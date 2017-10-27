/*
 * An XML document type.
 * Localname: OrganizationResources
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.OrganizationResourcesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one OrganizationResources(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class OrganizationResourcesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.OrganizationResourcesDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationResourcesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONRESOURCES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "OrganizationResources");
    
    
    /**
     * Gets the "OrganizationResources" element
     */
    public com.microsoft.schemas.crm._2011.contracts.OrganizationResources getOrganizationResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.OrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.OrganizationResources)get_store().find_element_user(ORGANIZATIONRESOURCES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationResources" element
     */
    public boolean isNilOrganizationResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.OrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.OrganizationResources)get_store().find_element_user(ORGANIZATIONRESOURCES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationResources" element
     */
    public void setOrganizationResources(com.microsoft.schemas.crm._2011.contracts.OrganizationResources organizationResources)
    {
        generatedSetterHelperImpl(organizationResources, ORGANIZATIONRESOURCES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrganizationResources" element
     */
    public com.microsoft.schemas.crm._2011.contracts.OrganizationResources addNewOrganizationResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.OrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.OrganizationResources)get_store().add_element_user(ORGANIZATIONRESOURCES$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrganizationResources" element
     */
    public void setNilOrganizationResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.OrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.OrganizationResources)get_store().find_element_user(ORGANIZATIONRESOURCES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.OrganizationResources)get_store().add_element_user(ORGANIZATIONRESOURCES$0);
            }
            target.setNil();
        }
    }
}
