/*
 * XML Type:  ManagedPropertyAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ManagedPropertyAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ManagedPropertyAttributeMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.AttributeMetadataImpl implements com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata
{
    private static final long serialVersionUID = 1L;
    
    public ManagedPropertyAttributeMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANAGEDPROPERTYLOGICALNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ManagedPropertyLogicalName");
    private static final javax.xml.namespace.QName PARENTATTRIBUTENAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ParentAttributeName");
    private static final javax.xml.namespace.QName PARENTCOMPONENTTYPE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ParentComponentType");
    private static final javax.xml.namespace.QName VALUEATTRIBUTETYPECODE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ValueAttributeTypeCode");
    
    
    /**
     * Gets the "ManagedPropertyLogicalName" element
     */
    public java.lang.String getManagedPropertyLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEDPROPERTYLOGICALNAME$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGEDPROPERTYLOGICALNAME$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGEDPROPERTYLOGICALNAME$0, 0);
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
            return get_store().count_elements(MANAGEDPROPERTYLOGICALNAME$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEDPROPERTYLOGICALNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANAGEDPROPERTYLOGICALNAME$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGEDPROPERTYLOGICALNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANAGEDPROPERTYLOGICALNAME$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGEDPROPERTYLOGICALNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANAGEDPROPERTYLOGICALNAME$0);
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
            get_store().remove_element(MANAGEDPROPERTYLOGICALNAME$0, 0);
        }
    }
    
    /**
     * Gets the "ParentAttributeName" element
     */
    public java.lang.String getParentAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTATTRIBUTENAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParentAttributeName" element
     */
    public org.apache.xmlbeans.XmlString xgetParentAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTATTRIBUTENAME$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ParentAttributeName" element
     */
    public boolean isNilParentAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTATTRIBUTENAME$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ParentAttributeName" element
     */
    public boolean isSetParentAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTATTRIBUTENAME$2) != 0;
        }
    }
    
    /**
     * Sets the "ParentAttributeName" element
     */
    public void setParentAttributeName(java.lang.String parentAttributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTATTRIBUTENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTATTRIBUTENAME$2);
            }
            target.setStringValue(parentAttributeName);
        }
    }
    
    /**
     * Sets (as xml) the "ParentAttributeName" element
     */
    public void xsetParentAttributeName(org.apache.xmlbeans.XmlString parentAttributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTATTRIBUTENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARENTATTRIBUTENAME$2);
            }
            target.set(parentAttributeName);
        }
    }
    
    /**
     * Nils the "ParentAttributeName" element
     */
    public void setNilParentAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTATTRIBUTENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARENTATTRIBUTENAME$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ParentAttributeName" element
     */
    public void unsetParentAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTATTRIBUTENAME$2, 0);
        }
    }
    
    /**
     * Gets the "ParentComponentType" element
     */
    public int getParentComponentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTCOMPONENTTYPE$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParentComponentType" element
     */
    public org.apache.xmlbeans.XmlInt xgetParentComponentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PARENTCOMPONENTTYPE$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ParentComponentType" element
     */
    public boolean isNilParentComponentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PARENTCOMPONENTTYPE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ParentComponentType" element
     */
    public boolean isSetParentComponentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTCOMPONENTTYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "ParentComponentType" element
     */
    public void setParentComponentType(int parentComponentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTCOMPONENTTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTCOMPONENTTYPE$4);
            }
            target.setIntValue(parentComponentType);
        }
    }
    
    /**
     * Sets (as xml) the "ParentComponentType" element
     */
    public void xsetParentComponentType(org.apache.xmlbeans.XmlInt parentComponentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PARENTCOMPONENTTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PARENTCOMPONENTTYPE$4);
            }
            target.set(parentComponentType);
        }
    }
    
    /**
     * Nils the "ParentComponentType" element
     */
    public void setNilParentComponentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PARENTCOMPONENTTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PARENTCOMPONENTTYPE$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ParentComponentType" element
     */
    public void unsetParentComponentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTCOMPONENTTYPE$4, 0);
        }
    }
    
    /**
     * Gets the "ValueAttributeTypeCode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum getValueAttributeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUEATTRIBUTETYPECODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValueAttributeTypeCode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode xgetValueAttributeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().find_element_user(VALUEATTRIBUTETYPECODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ValueAttributeTypeCode" element
     */
    public boolean isSetValueAttributeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEATTRIBUTETYPECODE$6) != 0;
        }
    }
    
    /**
     * Sets the "ValueAttributeTypeCode" element
     */
    public void setValueAttributeTypeCode(com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum valueAttributeTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUEATTRIBUTETYPECODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUEATTRIBUTETYPECODE$6);
            }
            target.setEnumValue(valueAttributeTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "ValueAttributeTypeCode" element
     */
    public void xsetValueAttributeTypeCode(com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode valueAttributeTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().find_element_user(VALUEATTRIBUTETYPECODE$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().add_element_user(VALUEATTRIBUTETYPECODE$6);
            }
            target.set(valueAttributeTypeCode);
        }
    }
    
    /**
     * Unsets the "ValueAttributeTypeCode" element
     */
    public void unsetValueAttributeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEATTRIBUTETYPECODE$6, 0);
        }
    }
}
