/*
 * XML Type:  ManagedPropertyboolean
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML ManagedPropertyboolean(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ManagedPropertybooleanImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean
{
    private static final long serialVersionUID = 1L;
    
    public ManagedPropertybooleanImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANBECHANGED$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "CanBeChanged");
    private static final javax.xml.namespace.QName MANAGEDPROPERTYLOGICALNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ManagedPropertyLogicalName");
    private static final javax.xml.namespace.QName VALUE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Value");
    
    
    /**
     * Gets the "CanBeChanged" element
     */
    public boolean getCanBeChanged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANBECHANGED$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "CanBeChanged" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCanBeChanged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBECHANGED$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "CanBeChanged" element
     */
    public boolean isSetCanBeChanged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANBECHANGED$0) != 0;
        }
    }
    
    /**
     * Sets the "CanBeChanged" element
     */
    public void setCanBeChanged(boolean canBeChanged)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANBECHANGED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANBECHANGED$0);
            }
            target.setBooleanValue(canBeChanged);
        }
    }
    
    /**
     * Sets (as xml) the "CanBeChanged" element
     */
    public void xsetCanBeChanged(org.apache.xmlbeans.XmlBoolean canBeChanged)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBECHANGED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CANBECHANGED$0);
            }
            target.set(canBeChanged);
        }
    }
    
    /**
     * Unsets the "CanBeChanged" element
     */
    public void unsetCanBeChanged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANBECHANGED$0, 0);
        }
    }
    
    /**
     * Gets the "ManagedPropertyLogicalName" element
     */
    public java.lang.String getManagedPropertyLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEDPROPERTYLOGICALNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ManagedPropertyLogicalName" element
     */
    public org.apache.xmlbeans.XmlString xgetManagedPropertyLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGEDPROPERTYLOGICALNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ManagedPropertyLogicalName" element
     */
    public boolean isNilManagedPropertyLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGEDPROPERTYLOGICALNAME$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ManagedPropertyLogicalName" element
     */
    public boolean isSetManagedPropertyLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANAGEDPROPERTYLOGICALNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "ManagedPropertyLogicalName" element
     */
    public void setManagedPropertyLogicalName(java.lang.String managedPropertyLogicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEDPROPERTYLOGICALNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANAGEDPROPERTYLOGICALNAME$2);
            }
            target.setStringValue(managedPropertyLogicalName);
        }
    }
    
    /**
     * Sets (as xml) the "ManagedPropertyLogicalName" element
     */
    public void xsetManagedPropertyLogicalName(org.apache.xmlbeans.XmlString managedPropertyLogicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGEDPROPERTYLOGICALNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANAGEDPROPERTYLOGICALNAME$2);
            }
            target.set(managedPropertyLogicalName);
        }
    }
    
    /**
     * Nils the "ManagedPropertyLogicalName" element
     */
    public void setNilManagedPropertyLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGEDPROPERTYLOGICALNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANAGEDPROPERTYLOGICALNAME$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ManagedPropertyLogicalName" element
     */
    public void unsetManagedPropertyLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANAGEDPROPERTYLOGICALNAME$2, 0);
        }
    }
    
    /**
     * Gets the "Value" element
     */
    public boolean getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Value" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VALUE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Value" element
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$4) != 0;
        }
    }
    
    /**
     * Sets the "Value" element
     */
    public void setValue(boolean value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$4);
            }
            target.setBooleanValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "Value" element
     */
    public void xsetValue(org.apache.xmlbeans.XmlBoolean value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(VALUE$4);
            }
            target.set(value);
        }
    }
    
    /**
     * Unsets the "Value" element
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$4, 0);
        }
    }
}
