/*
 * XML Type:  ProposalParty
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ProposalParty
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ProposalParty(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ProposalPartyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ProposalParty
{
    private static final long serialVersionUID = 1L;
    
    public ProposalPartyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "DisplayName");
    private static final javax.xml.namespace.QName EFFORTREQUIRED$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "EffortRequired");
    private static final javax.xml.namespace.QName ENTITYNAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "EntityName");
    private static final javax.xml.namespace.QName RESOURCEID$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ResourceId");
    private static final javax.xml.namespace.QName RESOURCESPECID$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ResourceSpecId");
    
    
    /**
     * Gets the "DisplayName" element
     */
    public java.lang.String getDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DisplayName" element
     */
    public org.apache.xmlbeans.XmlString xgetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DisplayName" element
     */
    public boolean isNilDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DisplayName" element
     */
    public boolean isSetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "DisplayName" element
     */
    public void setDisplayName(java.lang.String displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYNAME$0);
            }
            target.setStringValue(displayName);
        }
    }
    
    /**
     * Sets (as xml) the "DisplayName" element
     */
    public void xsetDisplayName(org.apache.xmlbeans.XmlString displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYNAME$0);
            }
            target.set(displayName);
        }
    }
    
    /**
     * Nils the "DisplayName" element
     */
    public void setNilDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYNAME$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DisplayName" element
     */
    public void unsetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYNAME$0, 0);
        }
    }
    
    /**
     * Gets the "EffortRequired" element
     */
    public double getEffortRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFORTREQUIRED$2, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "EffortRequired" element
     */
    public org.apache.xmlbeans.XmlDouble xgetEffortRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EFFORTREQUIRED$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "EffortRequired" element
     */
    public boolean isSetEffortRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFORTREQUIRED$2) != 0;
        }
    }
    
    /**
     * Sets the "EffortRequired" element
     */
    public void setEffortRequired(double effortRequired)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFORTREQUIRED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFORTREQUIRED$2);
            }
            target.setDoubleValue(effortRequired);
        }
    }
    
    /**
     * Sets (as xml) the "EffortRequired" element
     */
    public void xsetEffortRequired(org.apache.xmlbeans.XmlDouble effortRequired)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EFFORTREQUIRED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(EFFORTREQUIRED$2);
            }
            target.set(effortRequired);
        }
    }
    
    /**
     * Unsets the "EffortRequired" element
     */
    public void unsetEffortRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFORTREQUIRED$2, 0);
        }
    }
    
    /**
     * Gets the "EntityName" element
     */
    public java.lang.String getEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityName" element
     */
    public org.apache.xmlbeans.XmlString xgetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityName" element
     */
    public boolean isNilEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EntityName" element
     */
    public boolean isSetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "EntityName" element
     */
    public void setEntityName(java.lang.String entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYNAME$4);
            }
            target.setStringValue(entityName);
        }
    }
    
    /**
     * Sets (as xml) the "EntityName" element
     */
    public void xsetEntityName(org.apache.xmlbeans.XmlString entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYNAME$4);
            }
            target.set(entityName);
        }
    }
    
    /**
     * Nils the "EntityName" element
     */
    public void setNilEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYNAME$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EntityName" element
     */
    public void unsetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYNAME$4, 0);
        }
    }
    
    /**
     * Gets the "ResourceId" element
     */
    public java.lang.String getResourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResourceId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetResourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(RESOURCEID$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ResourceId" element
     */
    public boolean isSetResourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEID$6) != 0;
        }
    }
    
    /**
     * Sets the "ResourceId" element
     */
    public void setResourceId(java.lang.String resourceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCEID$6);
            }
            target.setStringValue(resourceId);
        }
    }
    
    /**
     * Sets (as xml) the "ResourceId" element
     */
    public void xsetResourceId(com.microsoft.schemas._2003._10.serialization.Guid resourceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(RESOURCEID$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(RESOURCEID$6);
            }
            target.set(resourceId);
        }
    }
    
    /**
     * Unsets the "ResourceId" element
     */
    public void unsetResourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEID$6, 0);
        }
    }
    
    /**
     * Gets the "ResourceSpecId" element
     */
    public java.lang.String getResourceSpecId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCESPECID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResourceSpecId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetResourceSpecId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(RESOURCESPECID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ResourceSpecId" element
     */
    public boolean isSetResourceSpecId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCESPECID$8) != 0;
        }
    }
    
    /**
     * Sets the "ResourceSpecId" element
     */
    public void setResourceSpecId(java.lang.String resourceSpecId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCESPECID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCESPECID$8);
            }
            target.setStringValue(resourceSpecId);
        }
    }
    
    /**
     * Sets (as xml) the "ResourceSpecId" element
     */
    public void xsetResourceSpecId(com.microsoft.schemas._2003._10.serialization.Guid resourceSpecId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(RESOURCESPECID$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(RESOURCESPECID$8);
            }
            target.set(resourceSpecId);
        }
    }
    
    /**
     * Unsets the "ResourceSpecId" element
     */
    public void unsetResourceSpecId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCESPECID$8, 0);
        }
    }
}
