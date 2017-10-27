/*
 * XML Type:  OrganizationDetail
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * An XML OrganizationDetail(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery).
 *
 * This is a complex type.
 */
public class OrganizationDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDPOINTS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "Endpoints");
    private static final javax.xml.namespace.QName FRIENDLYNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "FriendlyName");
    private static final javax.xml.namespace.QName ORGANIZATIONID$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "OrganizationId");
    private static final javax.xml.namespace.QName ORGANIZATIONVERSION$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "OrganizationVersion");
    private static final javax.xml.namespace.QName STATE$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "State");
    private static final javax.xml.namespace.QName UNIQUENAME$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "UniqueName");
    private static final javax.xml.namespace.QName URLNAME$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "UrlName");
    
    
    /**
     * Gets the "Endpoints" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection getEndpoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection)get_store().find_element_user(ENDPOINTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Endpoints" element
     */
    public boolean isNilEndpoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection)get_store().find_element_user(ENDPOINTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Endpoints" element
     */
    public boolean isSetEndpoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDPOINTS$0) != 0;
        }
    }
    
    /**
     * Sets the "Endpoints" element
     */
    public void setEndpoints(com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection endpoints)
    {
        generatedSetterHelperImpl(endpoints, ENDPOINTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Endpoints" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection addNewEndpoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection)get_store().add_element_user(ENDPOINTS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Endpoints" element
     */
    public void setNilEndpoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection)get_store().find_element_user(ENDPOINTS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection)get_store().add_element_user(ENDPOINTS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Endpoints" element
     */
    public void unsetEndpoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDPOINTS$0, 0);
        }
    }
    
    /**
     * Gets the "FriendlyName" element
     */
    public java.lang.String getFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRIENDLYNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FriendlyName" element
     */
    public org.apache.xmlbeans.XmlString xgetFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRIENDLYNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "FriendlyName" element
     */
    public boolean isNilFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRIENDLYNAME$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "FriendlyName" element
     */
    public boolean isSetFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FRIENDLYNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "FriendlyName" element
     */
    public void setFriendlyName(java.lang.String friendlyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRIENDLYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FRIENDLYNAME$2);
            }
            target.setStringValue(friendlyName);
        }
    }
    
    /**
     * Sets (as xml) the "FriendlyName" element
     */
    public void xsetFriendlyName(org.apache.xmlbeans.XmlString friendlyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRIENDLYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FRIENDLYNAME$2);
            }
            target.set(friendlyName);
        }
    }
    
    /**
     * Nils the "FriendlyName" element
     */
    public void setNilFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRIENDLYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FRIENDLYNAME$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "FriendlyName" element
     */
    public void unsetFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FRIENDLYNAME$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONID$4, 0);
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
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ORGANIZATIONID$4, 0);
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
            return get_store().count_elements(ORGANIZATIONID$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANIZATIONID$4);
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
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ORGANIZATIONID$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(ORGANIZATIONID$4);
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
            get_store().remove_element(ORGANIZATIONID$4, 0);
        }
    }
    
    /**
     * Gets the "OrganizationVersion" element
     */
    public java.lang.String getOrganizationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONVERSION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganizationVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetOrganizationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATIONVERSION$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationVersion" element
     */
    public boolean isNilOrganizationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATIONVERSION$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OrganizationVersion" element
     */
    public boolean isSetOrganizationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONVERSION$6) != 0;
        }
    }
    
    /**
     * Sets the "OrganizationVersion" element
     */
    public void setOrganizationVersion(java.lang.String organizationVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONVERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANIZATIONVERSION$6);
            }
            target.setStringValue(organizationVersion);
        }
    }
    
    /**
     * Sets (as xml) the "OrganizationVersion" element
     */
    public void xsetOrganizationVersion(org.apache.xmlbeans.XmlString organizationVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATIONVERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGANIZATIONVERSION$6);
            }
            target.set(organizationVersion);
        }
    }
    
    /**
     * Nils the "OrganizationVersion" element
     */
    public void setNilOrganizationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATIONVERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGANIZATIONVERSION$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OrganizationVersion" element
     */
    public void unsetOrganizationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONVERSION$6, 0);
        }
    }
    
    /**
     * Gets the "State" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationState.Enum getState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "State" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationState xgetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationState target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationState)get_store().find_element_user(STATE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "State" element
     */
    public boolean isSetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATE$8) != 0;
        }
    }
    
    /**
     * Sets the "State" element
     */
    public void setState(com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationState.Enum state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$8);
            }
            target.setEnumValue(state);
        }
    }
    
    /**
     * Sets (as xml) the "State" element
     */
    public void xsetState(com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationState state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationState target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationState)get_store().find_element_user(STATE$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationState)get_store().add_element_user(STATE$8);
            }
            target.set(state);
        }
    }
    
    /**
     * Unsets the "State" element
     */
    public void unsetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATE$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUENAME$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNIQUENAME$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNIQUENAME$10, 0);
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
            return get_store().count_elements(UNIQUENAME$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUENAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIQUENAME$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNIQUENAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UNIQUENAME$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNIQUENAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UNIQUENAME$10);
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
            get_store().remove_element(UNIQUENAME$10, 0);
        }
    }
    
    /**
     * Gets the "UrlName" element
     */
    public java.lang.String getUrlName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URLNAME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UrlName" element
     */
    public org.apache.xmlbeans.XmlString xgetUrlName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLNAME$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "UrlName" element
     */
    public boolean isNilUrlName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLNAME$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "UrlName" element
     */
    public boolean isSetUrlName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URLNAME$12) != 0;
        }
    }
    
    /**
     * Sets the "UrlName" element
     */
    public void setUrlName(java.lang.String urlName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URLNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URLNAME$12);
            }
            target.setStringValue(urlName);
        }
    }
    
    /**
     * Sets (as xml) the "UrlName" element
     */
    public void xsetUrlName(org.apache.xmlbeans.XmlString urlName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URLNAME$12);
            }
            target.set(urlName);
        }
    }
    
    /**
     * Nils the "UrlName" element
     */
    public void setNilUrlName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URLNAME$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "UrlName" element
     */
    public void unsetUrlName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URLNAME$12, 0);
        }
    }
}
