/*
 * An XML document type.
 * Localname: OrganizationRelease
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationReleaseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * A document containing one OrganizationRelease(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery) element.
 *
 * This is a complex type.
 */
public class OrganizationReleaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationReleaseDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationReleaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONRELEASE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "OrganizationRelease");
    
    
    /**
     * Gets the "OrganizationRelease" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease.Enum getOrganizationRelease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONRELEASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganizationRelease" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease xgetOrganizationRelease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease)get_store().find_element_user(ORGANIZATIONRELEASE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationRelease" element
     */
    public boolean isNilOrganizationRelease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease)get_store().find_element_user(ORGANIZATIONRELEASE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationRelease" element
     */
    public void setOrganizationRelease(com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease.Enum organizationRelease)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONRELEASE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANIZATIONRELEASE$0);
            }
            target.setEnumValue(organizationRelease);
        }
    }
    
    /**
     * Sets (as xml) the "OrganizationRelease" element
     */
    public void xsetOrganizationRelease(com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease organizationRelease)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease)get_store().find_element_user(ORGANIZATIONRELEASE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease)get_store().add_element_user(ORGANIZATIONRELEASE$0);
            }
            target.set(organizationRelease);
        }
    }
    
    /**
     * Nils the "OrganizationRelease" element
     */
    public void setNilOrganizationRelease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease)get_store().find_element_user(ORGANIZATIONRELEASE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease)get_store().add_element_user(ORGANIZATIONRELEASE$0);
            }
            target.setNil();
        }
    }
}
