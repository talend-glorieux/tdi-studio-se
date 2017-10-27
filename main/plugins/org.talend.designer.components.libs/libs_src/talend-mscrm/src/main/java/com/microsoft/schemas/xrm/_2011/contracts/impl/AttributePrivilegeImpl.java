/*
 * XML Type:  AttributePrivilege
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML AttributePrivilege(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class AttributePrivilegeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege
{
    private static final long serialVersionUID = 1L;
    
    public AttributePrivilegeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "AttributeId");
    private static final javax.xml.namespace.QName CANCREATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "CanCreate");
    private static final javax.xml.namespace.QName CANREAD$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "CanRead");
    private static final javax.xml.namespace.QName CANUPDATE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "CanUpdate");
    
    
    /**
     * Gets the "AttributeId" element
     */
    public java.lang.String getAttributeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttributeId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetAttributeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ATTRIBUTEID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AttributeId" element
     */
    public boolean isSetAttributeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEID$0) != 0;
        }
    }
    
    /**
     * Sets the "AttributeId" element
     */
    public void setAttributeId(java.lang.String attributeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTEID$0);
            }
            target.setStringValue(attributeId);
        }
    }
    
    /**
     * Sets (as xml) the "AttributeId" element
     */
    public void xsetAttributeId(com.microsoft.schemas._2003._10.serialization.Guid attributeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ATTRIBUTEID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(ATTRIBUTEID$0);
            }
            target.set(attributeId);
        }
    }
    
    /**
     * Unsets the "AttributeId" element
     */
    public void unsetAttributeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEID$0, 0);
        }
    }
    
    /**
     * Gets the "CanCreate" element
     */
    public int getCanCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANCREATE$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CanCreate" element
     */
    public org.apache.xmlbeans.XmlInt xgetCanCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CANCREATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CanCreate" element
     */
    public boolean isSetCanCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANCREATE$2) != 0;
        }
    }
    
    /**
     * Sets the "CanCreate" element
     */
    public void setCanCreate(int canCreate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANCREATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANCREATE$2);
            }
            target.setIntValue(canCreate);
        }
    }
    
    /**
     * Sets (as xml) the "CanCreate" element
     */
    public void xsetCanCreate(org.apache.xmlbeans.XmlInt canCreate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CANCREATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CANCREATE$2);
            }
            target.set(canCreate);
        }
    }
    
    /**
     * Unsets the "CanCreate" element
     */
    public void unsetCanCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANCREATE$2, 0);
        }
    }
    
    /**
     * Gets the "CanRead" element
     */
    public int getCanRead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANREAD$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CanRead" element
     */
    public org.apache.xmlbeans.XmlInt xgetCanRead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CANREAD$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "CanRead" element
     */
    public boolean isSetCanRead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANREAD$4) != 0;
        }
    }
    
    /**
     * Sets the "CanRead" element
     */
    public void setCanRead(int canRead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANREAD$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANREAD$4);
            }
            target.setIntValue(canRead);
        }
    }
    
    /**
     * Sets (as xml) the "CanRead" element
     */
    public void xsetCanRead(org.apache.xmlbeans.XmlInt canRead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CANREAD$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CANREAD$4);
            }
            target.set(canRead);
        }
    }
    
    /**
     * Unsets the "CanRead" element
     */
    public void unsetCanRead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANREAD$4, 0);
        }
    }
    
    /**
     * Gets the "CanUpdate" element
     */
    public int getCanUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANUPDATE$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CanUpdate" element
     */
    public org.apache.xmlbeans.XmlInt xgetCanUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CANUPDATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "CanUpdate" element
     */
    public boolean isSetCanUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANUPDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "CanUpdate" element
     */
    public void setCanUpdate(int canUpdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANUPDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANUPDATE$6);
            }
            target.setIntValue(canUpdate);
        }
    }
    
    /**
     * Sets (as xml) the "CanUpdate" element
     */
    public void xsetCanUpdate(org.apache.xmlbeans.XmlInt canUpdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CANUPDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CANUPDATE$6);
            }
            target.set(canUpdate);
        }
    }
    
    /**
     * Unsets the "CanUpdate" element
     */
    public void unsetCanUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANUPDATE$6, 0);
        }
    }
}
