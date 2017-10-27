/*
 * XML Type:  RetrieveOrganizationRequest
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * An XML RetrieveOrganizationRequest(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery).
 *
 * This is a complex type.
 */
public class RetrieveOrganizationRequestImpl extends com.microsoft.schemas.xrm._2011.contracts.discovery.impl.DiscoveryRequestImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationRequest
{
    private static final long serialVersionUID = 1L;
    
    public RetrieveOrganizationRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCESSTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "AccessType");
    private static final javax.xml.namespace.QName RELEASE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "Release");
    private static final javax.xml.namespace.QName UNIQUENAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "UniqueName");
    
    
    /**
     * Gets the "AccessType" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType.Enum getAccessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccessType" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType xgetAccessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType)get_store().find_element_user(ACCESSTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AccessType" element
     */
    public boolean isSetAccessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCESSTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "AccessType" element
     */
    public void setAccessType(com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType.Enum accessType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSTYPE$0);
            }
            target.setEnumValue(accessType);
        }
    }
    
    /**
     * Sets (as xml) the "AccessType" element
     */
    public void xsetAccessType(com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType accessType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType)get_store().find_element_user(ACCESSTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType)get_store().add_element_user(ACCESSTYPE$0);
            }
            target.set(accessType);
        }
    }
    
    /**
     * Unsets the "AccessType" element
     */
    public void unsetAccessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCESSTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "Release" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease.Enum getRelease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELEASE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Release" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease xgetRelease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease)get_store().find_element_user(RELEASE$2, 0);
            return target;
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
            return get_store().count_elements(RELEASE$2) != 0;
        }
    }
    
    /**
     * Sets the "Release" element
     */
    public void setRelease(com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease.Enum release)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELEASE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELEASE$2);
            }
            target.setEnumValue(release);
        }
    }
    
    /**
     * Sets (as xml) the "Release" element
     */
    public void xsetRelease(com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease release)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease)get_store().find_element_user(RELEASE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease)get_store().add_element_user(RELEASE$2);
            }
            target.set(release);
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
            get_store().remove_element(RELEASE$2, 0);
        }
    }
    
    /**
     * Gets the "UniqueName" element
     */
    public java.lang.String getUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUENAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UniqueName" element
     */
    public org.apache.xmlbeans.XmlString xgetUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNIQUENAME$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "UniqueName" element
     */
    public boolean isNilUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNIQUENAME$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "UniqueName" element
     */
    public boolean isSetUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIQUENAME$4) != 0;
        }
    }
    
    /**
     * Sets the "UniqueName" element
     */
    public void setUniqueName(java.lang.String uniqueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUENAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIQUENAME$4);
            }
            target.setStringValue(uniqueName);
        }
    }
    
    /**
     * Sets (as xml) the "UniqueName" element
     */
    public void xsetUniqueName(org.apache.xmlbeans.XmlString uniqueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNIQUENAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UNIQUENAME$4);
            }
            target.set(uniqueName);
        }
    }
    
    /**
     * Nils the "UniqueName" element
     */
    public void setNilUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNIQUENAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UNIQUENAME$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "UniqueName" element
     */
    public void unsetUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIQUENAME$4, 0);
        }
    }
}
