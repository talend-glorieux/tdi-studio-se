/*
 * XML Type:  AliasedValue
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.AliasedValue
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML AliasedValue(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class AliasedValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.AliasedValue
{
    private static final long serialVersionUID = 1L;
    
    public AliasedValueImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTELOGICALNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "AttributeLogicalName");
    private static final javax.xml.namespace.QName ENTITYLOGICALNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "EntityLogicalName");
    private static final javax.xml.namespace.QName VALUE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Value");
    
    
    /**
     * Gets the "AttributeLogicalName" element
     */
    public java.lang.String getAttributeLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTELOGICALNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttributeLogicalName" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTELOGICALNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeLogicalName" element
     */
    public boolean isNilAttributeLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTELOGICALNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AttributeLogicalName" element
     */
    public boolean isSetAttributeLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTELOGICALNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "AttributeLogicalName" element
     */
    public void setAttributeLogicalName(java.lang.String attributeLogicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTELOGICALNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTELOGICALNAME$0);
            }
            target.setStringValue(attributeLogicalName);
        }
    }
    
    /**
     * Sets (as xml) the "AttributeLogicalName" element
     */
    public void xsetAttributeLogicalName(org.apache.xmlbeans.XmlString attributeLogicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTELOGICALNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTELOGICALNAME$0);
            }
            target.set(attributeLogicalName);
        }
    }
    
    /**
     * Nils the "AttributeLogicalName" element
     */
    public void setNilAttributeLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTELOGICALNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTELOGICALNAME$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AttributeLogicalName" element
     */
    public void unsetAttributeLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTELOGICALNAME$0, 0);
        }
    }
    
    /**
     * Gets the "EntityLogicalName" element
     */
    public java.lang.String getEntityLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYLOGICALNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityLogicalName" element
     */
    public org.apache.xmlbeans.XmlString xgetEntityLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYLOGICALNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityLogicalName" element
     */
    public boolean isNilEntityLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYLOGICALNAME$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EntityLogicalName" element
     */
    public boolean isSetEntityLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYLOGICALNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "EntityLogicalName" element
     */
    public void setEntityLogicalName(java.lang.String entityLogicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYLOGICALNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYLOGICALNAME$2);
            }
            target.setStringValue(entityLogicalName);
        }
    }
    
    /**
     * Sets (as xml) the "EntityLogicalName" element
     */
    public void xsetEntityLogicalName(org.apache.xmlbeans.XmlString entityLogicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYLOGICALNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYLOGICALNAME$2);
            }
            target.set(entityLogicalName);
        }
    }
    
    /**
     * Nils the "EntityLogicalName" element
     */
    public void setNilEntityLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYLOGICALNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYLOGICALNAME$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EntityLogicalName" element
     */
    public void unsetEntityLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYLOGICALNAME$2, 0);
        }
    }
    
    /**
     * Gets the "Value" element
     */
    public org.apache.xmlbeans.XmlObject getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(VALUE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Value" element
     */
    public boolean isNilValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(VALUE$4, 0);
            if (target == null) return false;
            return target.isNil();
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
    public void setValue(org.apache.xmlbeans.XmlObject value)
    {
        generatedSetterHelperImpl(value, VALUE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Value" element
     */
    public org.apache.xmlbeans.XmlObject addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(VALUE$4);
            return target;
        }
    }
    
    /**
     * Nils the "Value" element
     */
    public void setNilValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(VALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(VALUE$4);
            }
            target.setNil();
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
