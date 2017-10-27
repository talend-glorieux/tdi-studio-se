/*
 * XML Type:  RetrieveOrganizationsRequest
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * An XML RetrieveOrganizationsRequest(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery).
 *
 * This is a complex type.
 */
public class RetrieveOrganizationsRequestImpl extends com.microsoft.schemas.xrm._2011.contracts.discovery.impl.DiscoveryRequestImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationsRequest
{
    private static final long serialVersionUID = 1L;
    
    public RetrieveOrganizationsRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCESSTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "AccessType");
    private static final javax.xml.namespace.QName ISINTERNALCROSSGEOSERVERREQUEST$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "IsInternalCrossGeoServerRequest");
    private static final javax.xml.namespace.QName RELEASE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "Release");
    
    
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
     * Gets the "IsInternalCrossGeoServerRequest" element
     */
    public boolean getIsInternalCrossGeoServerRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISINTERNALCROSSGEOSERVERREQUEST$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsInternalCrossGeoServerRequest" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsInternalCrossGeoServerRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISINTERNALCROSSGEOSERVERREQUEST$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsInternalCrossGeoServerRequest" element
     */
    public boolean isSetIsInternalCrossGeoServerRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISINTERNALCROSSGEOSERVERREQUEST$2) != 0;
        }
    }
    
    /**
     * Sets the "IsInternalCrossGeoServerRequest" element
     */
    public void setIsInternalCrossGeoServerRequest(boolean isInternalCrossGeoServerRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISINTERNALCROSSGEOSERVERREQUEST$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISINTERNALCROSSGEOSERVERREQUEST$2);
            }
            target.setBooleanValue(isInternalCrossGeoServerRequest);
        }
    }
    
    /**
     * Sets (as xml) the "IsInternalCrossGeoServerRequest" element
     */
    public void xsetIsInternalCrossGeoServerRequest(org.apache.xmlbeans.XmlBoolean isInternalCrossGeoServerRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISINTERNALCROSSGEOSERVERREQUEST$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISINTERNALCROSSGEOSERVERREQUEST$2);
            }
            target.set(isInternalCrossGeoServerRequest);
        }
    }
    
    /**
     * Unsets the "IsInternalCrossGeoServerRequest" element
     */
    public void unsetIsInternalCrossGeoServerRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISINTERNALCROSSGEOSERVERREQUEST$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELEASE$4, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease)get_store().find_element_user(RELEASE$4, 0);
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
            return get_store().count_elements(RELEASE$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELEASE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELEASE$4);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease)get_store().find_element_user(RELEASE$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationRelease)get_store().add_element_user(RELEASE$4);
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
            get_store().remove_element(RELEASE$4, 0);
        }
    }
}
