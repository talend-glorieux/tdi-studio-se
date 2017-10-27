/*
 * XML Type:  RequiredResource
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.RequiredResource
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML RequiredResource(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class RequiredResourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.RequiredResource
{
    private static final long serialVersionUID = 1L;
    
    public RequiredResourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ResourceId");
    private static final javax.xml.namespace.QName RESOURCESPECID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ResourceSpecId");
    
    
    /**
     * Gets the "ResourceId" element
     */
    public java.lang.String getResourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEID$0, 0);
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
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(RESOURCEID$0, 0);
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
            return get_store().count_elements(RESOURCEID$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCEID$0);
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
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(RESOURCEID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(RESOURCEID$0);
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
            get_store().remove_element(RESOURCEID$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCESPECID$2, 0);
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
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(RESOURCESPECID$2, 0);
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
            return get_store().count_elements(RESOURCESPECID$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCESPECID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCESPECID$2);
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
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(RESOURCESPECID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(RESOURCESPECID$2);
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
            get_store().remove_element(RESOURCESPECID$2, 0);
        }
    }
}
