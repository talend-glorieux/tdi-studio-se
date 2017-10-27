/*
 * XML Type:  RetrieveUserIdByExternalIdRequest
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * An XML RetrieveUserIdByExternalIdRequest(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery).
 *
 * This is a complex type.
 */
public class RetrieveUserIdByExternalIdRequestImpl extends com.microsoft.schemas.xrm._2011.contracts.discovery.impl.DiscoveryRequestImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdRequest
{
    private static final long serialVersionUID = 1L;
    
    public RetrieveUserIdByExternalIdRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "ExternalId");
    private static final javax.xml.namespace.QName ORGANIZATIONID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "OrganizationId");
    private static final javax.xml.namespace.QName ORGANIZATIONNAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "OrganizationName");
    private static final javax.xml.namespace.QName RELEASE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "Release");
    
    
    /**
     * Gets the "ExternalId" element
     */
    public java.lang.String getExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExternalId" element
     */
    public org.apache.xmlbeans.XmlString xgetExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ExternalId" element
     */
    public boolean isNilExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ExternalId" element
     */
    public boolean isSetExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALID$0) != 0;
        }
    }
    
    /**
     * Sets the "ExternalId" element
     */
    public void setExternalId(java.lang.String externalId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALID$0);
            }
            target.setStringValue(externalId);
        }
    }
    
    /**
     * Sets (as xml) the "ExternalId" element
     */
    public void xsetExternalId(org.apache.xmlbeans.XmlString externalId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALID$0);
            }
            target.set(externalId);
        }
    }
    
    /**
     * Nils the "ExternalId" element
     */
    public void setNilExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALID$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ExternalId" element
     */
    public void unsetExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALID$0, 0);
        }
    }
    
    /**
     * Gets the "OrganizationId" element
     */
    public java.lang.String getOrganizationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganizationId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetOrganizationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ORGANIZATIONID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "OrganizationId" element
     */
    public boolean isSetOrganizationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONID$2) != 0;
        }
    }
    
    /**
     * Sets the "OrganizationId" element
     */
    public void setOrganizationId(java.lang.String organizationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANIZATIONID$2);
            }
            target.setStringValue(organizationId);
        }
    }
    
    /**
     * Sets (as xml) the "OrganizationId" element
     */
    public void xsetOrganizationId(com.microsoft.schemas._2003._10.serialization.Guid organizationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ORGANIZATIONID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(ORGANIZATIONID$2);
            }
            target.set(organizationId);
        }
    }
    
    /**
     * Unsets the "OrganizationId" element
     */
    public void unsetOrganizationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONID$2, 0);
        }
    }
    
    /**
     * Gets the "OrganizationName" element
     */
    public java.lang.String getOrganizationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganizationName" element
     */
    public org.apache.xmlbeans.XmlString xgetOrganizationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATIONNAME$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationName" element
     */
    public boolean isNilOrganizationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATIONNAME$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrganizationName" element
     */
    public boolean isSetOrganizationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "OrganizationName" element
     */
    public void setOrganizationName(java.lang.String organizationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANIZATIONNAME$4);
            }
            target.setStringValue(organizationName);
        }
    }
    
    /**
     * Sets (as xml) the "OrganizationName" element
     */
    public void xsetOrganizationName(org.apache.xmlbeans.XmlString organizationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATIONNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGANIZATIONNAME$4);
            }
            target.set(organizationName);
        }
    }
    
    /**
     * Nils the "OrganizationName" element
     */
    public void setNilOrganizationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATIONNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGANIZATIONNAME$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrganizationName" element
     */
    public void unsetOrganizationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONNAME$4, 0);
        }
    }
    
    /**
     * Gets the "Release" element
     */
    public java.lang.String getRelease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELEASE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Release" element
     */
    public org.apache.xmlbeans.XmlString xgetRelease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELEASE$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Release" element
     */
    public boolean isNilRelease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELEASE$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Release" element
     */
    public boolean isSetRelease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELEASE$6) != 0;
        }
    }
    
    /**
     * Sets the "Release" element
     */
    public void setRelease(java.lang.String release)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELEASE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELEASE$6);
            }
            target.setStringValue(release);
        }
    }
    
    /**
     * Sets (as xml) the "Release" element
     */
    public void xsetRelease(org.apache.xmlbeans.XmlString release)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELEASE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELEASE$6);
            }
            target.set(release);
        }
    }
    
    /**
     * Nils the "Release" element
     */
    public void setNilRelease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELEASE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELEASE$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Release" element
     */
    public void unsetRelease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELEASE$6, 0);
        }
    }
}
