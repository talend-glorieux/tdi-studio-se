/*
 * XML Type:  AttributeMapping
 * Namespace: http://schemas.microsoft.com/xrm/2014/Contracts
 * Java type: com.microsoft.schemas.xrm._2014.contracts.AttributeMapping
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2014.contracts.impl;
/**
 * An XML AttributeMapping(@http://schemas.microsoft.com/xrm/2014/Contracts).
 *
 * This is a complex type.
 */
public class AttributeMappingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2014.contracts.AttributeMapping
{
    private static final long serialVersionUID = 1L;
    
    public AttributeMappingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALLOWEDSYNCDIRECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2014/Contracts", "AllowedSyncDirection");
    private static final javax.xml.namespace.QName ATTRIBUTECRMDISPLAYNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2014/Contracts", "AttributeCrmDisplayName");
    private static final javax.xml.namespace.QName ATTRIBUTECRMNAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2014/Contracts", "AttributeCrmName");
    private static final javax.xml.namespace.QName ATTRIBUTEEXCHANGEDISPLAYNAME$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2014/Contracts", "AttributeExchangeDisplayName");
    private static final javax.xml.namespace.QName ATTRIBUTEEXCHANGENAME$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2014/Contracts", "AttributeExchangeName");
    private static final javax.xml.namespace.QName ATTRIBUTEMAPPINGID$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2014/Contracts", "AttributeMappingId");
    private static final javax.xml.namespace.QName COMPUTEDPROPERTIES$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2014/Contracts", "ComputedProperties");
    private static final javax.xml.namespace.QName DEFAULTSYNCDIRECTION$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2014/Contracts", "DefaultSyncDirection");
    private static final javax.xml.namespace.QName ENTITYTYPECODE$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2014/Contracts", "EntityTypeCode");
    private static final javax.xml.namespace.QName ISCOMPUTED$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2014/Contracts", "IsComputed");
    private static final javax.xml.namespace.QName MAPPINGNAME$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2014/Contracts", "MappingName");
    private static final javax.xml.namespace.QName SYNCDIRECTION$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2014/Contracts", "SyncDirection");
    
    
    /**
     * Gets the "AllowedSyncDirection" element
     */
    public int getAllowedSyncDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLOWEDSYNCDIRECTION$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "AllowedSyncDirection" element
     */
    public org.apache.xmlbeans.XmlInt xgetAllowedSyncDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ALLOWEDSYNCDIRECTION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AllowedSyncDirection" element
     */
    public boolean isSetAllowedSyncDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOWEDSYNCDIRECTION$0) != 0;
        }
    }
    
    /**
     * Sets the "AllowedSyncDirection" element
     */
    public void setAllowedSyncDirection(int allowedSyncDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLOWEDSYNCDIRECTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALLOWEDSYNCDIRECTION$0);
            }
            target.setIntValue(allowedSyncDirection);
        }
    }
    
    /**
     * Sets (as xml) the "AllowedSyncDirection" element
     */
    public void xsetAllowedSyncDirection(org.apache.xmlbeans.XmlInt allowedSyncDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ALLOWEDSYNCDIRECTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ALLOWEDSYNCDIRECTION$0);
            }
            target.set(allowedSyncDirection);
        }
    }
    
    /**
     * Unsets the "AllowedSyncDirection" element
     */
    public void unsetAllowedSyncDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOWEDSYNCDIRECTION$0, 0);
        }
    }
    
    /**
     * Gets the "AttributeCrmDisplayName" element
     */
    public java.lang.String getAttributeCrmDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTECRMDISPLAYNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttributeCrmDisplayName" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeCrmDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTECRMDISPLAYNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeCrmDisplayName" element
     */
    public boolean isNilAttributeCrmDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTECRMDISPLAYNAME$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AttributeCrmDisplayName" element
     */
    public boolean isSetAttributeCrmDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTECRMDISPLAYNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "AttributeCrmDisplayName" element
     */
    public void setAttributeCrmDisplayName(java.lang.String attributeCrmDisplayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTECRMDISPLAYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTECRMDISPLAYNAME$2);
            }
            target.setStringValue(attributeCrmDisplayName);
        }
    }
    
    /**
     * Sets (as xml) the "AttributeCrmDisplayName" element
     */
    public void xsetAttributeCrmDisplayName(org.apache.xmlbeans.XmlString attributeCrmDisplayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTECRMDISPLAYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTECRMDISPLAYNAME$2);
            }
            target.set(attributeCrmDisplayName);
        }
    }
    
    /**
     * Nils the "AttributeCrmDisplayName" element
     */
    public void setNilAttributeCrmDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTECRMDISPLAYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTECRMDISPLAYNAME$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AttributeCrmDisplayName" element
     */
    public void unsetAttributeCrmDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTECRMDISPLAYNAME$2, 0);
        }
    }
    
    /**
     * Gets the "AttributeCrmName" element
     */
    public java.lang.String getAttributeCrmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTECRMNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttributeCrmName" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeCrmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTECRMNAME$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeCrmName" element
     */
    public boolean isNilAttributeCrmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTECRMNAME$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AttributeCrmName" element
     */
    public boolean isSetAttributeCrmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTECRMNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "AttributeCrmName" element
     */
    public void setAttributeCrmName(java.lang.String attributeCrmName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTECRMNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTECRMNAME$4);
            }
            target.setStringValue(attributeCrmName);
        }
    }
    
    /**
     * Sets (as xml) the "AttributeCrmName" element
     */
    public void xsetAttributeCrmName(org.apache.xmlbeans.XmlString attributeCrmName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTECRMNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTECRMNAME$4);
            }
            target.set(attributeCrmName);
        }
    }
    
    /**
     * Nils the "AttributeCrmName" element
     */
    public void setNilAttributeCrmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTECRMNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTECRMNAME$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AttributeCrmName" element
     */
    public void unsetAttributeCrmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTECRMNAME$4, 0);
        }
    }
    
    /**
     * Gets the "AttributeExchangeDisplayName" element
     */
    public java.lang.String getAttributeExchangeDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEEXCHANGEDISPLAYNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttributeExchangeDisplayName" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeExchangeDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEEXCHANGEDISPLAYNAME$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeExchangeDisplayName" element
     */
    public boolean isNilAttributeExchangeDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEEXCHANGEDISPLAYNAME$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AttributeExchangeDisplayName" element
     */
    public boolean isSetAttributeExchangeDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEEXCHANGEDISPLAYNAME$6) != 0;
        }
    }
    
    /**
     * Sets the "AttributeExchangeDisplayName" element
     */
    public void setAttributeExchangeDisplayName(java.lang.String attributeExchangeDisplayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEEXCHANGEDISPLAYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTEEXCHANGEDISPLAYNAME$6);
            }
            target.setStringValue(attributeExchangeDisplayName);
        }
    }
    
    /**
     * Sets (as xml) the "AttributeExchangeDisplayName" element
     */
    public void xsetAttributeExchangeDisplayName(org.apache.xmlbeans.XmlString attributeExchangeDisplayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEEXCHANGEDISPLAYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTEEXCHANGEDISPLAYNAME$6);
            }
            target.set(attributeExchangeDisplayName);
        }
    }
    
    /**
     * Nils the "AttributeExchangeDisplayName" element
     */
    public void setNilAttributeExchangeDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEEXCHANGEDISPLAYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTEEXCHANGEDISPLAYNAME$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AttributeExchangeDisplayName" element
     */
    public void unsetAttributeExchangeDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEEXCHANGEDISPLAYNAME$6, 0);
        }
    }
    
    /**
     * Gets the "AttributeExchangeName" element
     */
    public java.lang.String getAttributeExchangeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEEXCHANGENAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttributeExchangeName" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeExchangeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEEXCHANGENAME$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeExchangeName" element
     */
    public boolean isNilAttributeExchangeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEEXCHANGENAME$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AttributeExchangeName" element
     */
    public boolean isSetAttributeExchangeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEEXCHANGENAME$8) != 0;
        }
    }
    
    /**
     * Sets the "AttributeExchangeName" element
     */
    public void setAttributeExchangeName(java.lang.String attributeExchangeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEEXCHANGENAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTEEXCHANGENAME$8);
            }
            target.setStringValue(attributeExchangeName);
        }
    }
    
    /**
     * Sets (as xml) the "AttributeExchangeName" element
     */
    public void xsetAttributeExchangeName(org.apache.xmlbeans.XmlString attributeExchangeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEEXCHANGENAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTEEXCHANGENAME$8);
            }
            target.set(attributeExchangeName);
        }
    }
    
    /**
     * Nils the "AttributeExchangeName" element
     */
    public void setNilAttributeExchangeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEEXCHANGENAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTEEXCHANGENAME$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AttributeExchangeName" element
     */
    public void unsetAttributeExchangeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEEXCHANGENAME$8, 0);
        }
    }
    
    /**
     * Gets the "AttributeMappingId" element
     */
    public java.lang.String getAttributeMappingId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEMAPPINGID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttributeMappingId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetAttributeMappingId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ATTRIBUTEMAPPINGID$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "AttributeMappingId" element
     */
    public boolean isSetAttributeMappingId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEMAPPINGID$10) != 0;
        }
    }
    
    /**
     * Sets the "AttributeMappingId" element
     */
    public void setAttributeMappingId(java.lang.String attributeMappingId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEMAPPINGID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTEMAPPINGID$10);
            }
            target.setStringValue(attributeMappingId);
        }
    }
    
    /**
     * Sets (as xml) the "AttributeMappingId" element
     */
    public void xsetAttributeMappingId(com.microsoft.schemas._2003._10.serialization.Guid attributeMappingId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ATTRIBUTEMAPPINGID$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(ATTRIBUTEMAPPINGID$10);
            }
            target.set(attributeMappingId);
        }
    }
    
    /**
     * Unsets the "AttributeMappingId" element
     */
    public void unsetAttributeMappingId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEMAPPINGID$10, 0);
        }
    }
    
    /**
     * Gets the "ComputedProperties" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getComputedProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(COMPUTEDPROPERTIES$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ComputedProperties" element
     */
    public boolean isNilComputedProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(COMPUTEDPROPERTIES$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ComputedProperties" element
     */
    public boolean isSetComputedProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPUTEDPROPERTIES$12) != 0;
        }
    }
    
    /**
     * Sets the "ComputedProperties" element
     */
    public void setComputedProperties(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring computedProperties)
    {
        generatedSetterHelperImpl(computedProperties, COMPUTEDPROPERTIES$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ComputedProperties" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewComputedProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(COMPUTEDPROPERTIES$12);
            return target;
        }
    }
    
    /**
     * Nils the "ComputedProperties" element
     */
    public void setNilComputedProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(COMPUTEDPROPERTIES$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(COMPUTEDPROPERTIES$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ComputedProperties" element
     */
    public void unsetComputedProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPUTEDPROPERTIES$12, 0);
        }
    }
    
    /**
     * Gets the "DefaultSyncDirection" element
     */
    public int getDefaultSyncDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTSYNCDIRECTION$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DefaultSyncDirection" element
     */
    public org.apache.xmlbeans.XmlInt xgetDefaultSyncDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEFAULTSYNCDIRECTION$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "DefaultSyncDirection" element
     */
    public boolean isSetDefaultSyncDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTSYNCDIRECTION$14) != 0;
        }
    }
    
    /**
     * Sets the "DefaultSyncDirection" element
     */
    public void setDefaultSyncDirection(int defaultSyncDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTSYNCDIRECTION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTSYNCDIRECTION$14);
            }
            target.setIntValue(defaultSyncDirection);
        }
    }
    
    /**
     * Sets (as xml) the "DefaultSyncDirection" element
     */
    public void xsetDefaultSyncDirection(org.apache.xmlbeans.XmlInt defaultSyncDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEFAULTSYNCDIRECTION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEFAULTSYNCDIRECTION$14);
            }
            target.set(defaultSyncDirection);
        }
    }
    
    /**
     * Unsets the "DefaultSyncDirection" element
     */
    public void unsetDefaultSyncDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTSYNCDIRECTION$14, 0);
        }
    }
    
    /**
     * Gets the "EntityTypeCode" element
     */
    public int getEntityTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYTYPECODE$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityTypeCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetEntityTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ENTITYTYPECODE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "EntityTypeCode" element
     */
    public boolean isSetEntityTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYTYPECODE$16) != 0;
        }
    }
    
    /**
     * Sets the "EntityTypeCode" element
     */
    public void setEntityTypeCode(int entityTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYTYPECODE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYTYPECODE$16);
            }
            target.setIntValue(entityTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "EntityTypeCode" element
     */
    public void xsetEntityTypeCode(org.apache.xmlbeans.XmlInt entityTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ENTITYTYPECODE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ENTITYTYPECODE$16);
            }
            target.set(entityTypeCode);
        }
    }
    
    /**
     * Unsets the "EntityTypeCode" element
     */
    public void unsetEntityTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYTYPECODE$16, 0);
        }
    }
    
    /**
     * Gets the "IsComputed" element
     */
    public boolean getIsComputed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCOMPUTED$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsComputed" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsComputed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCOMPUTED$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsComputed" element
     */
    public boolean isSetIsComputed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCOMPUTED$18) != 0;
        }
    }
    
    /**
     * Sets the "IsComputed" element
     */
    public void setIsComputed(boolean isComputed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCOMPUTED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCOMPUTED$18);
            }
            target.setBooleanValue(isComputed);
        }
    }
    
    /**
     * Sets (as xml) the "IsComputed" element
     */
    public void xsetIsComputed(org.apache.xmlbeans.XmlBoolean isComputed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCOMPUTED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCOMPUTED$18);
            }
            target.set(isComputed);
        }
    }
    
    /**
     * Unsets the "IsComputed" element
     */
    public void unsetIsComputed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCOMPUTED$18, 0);
        }
    }
    
    /**
     * Gets the "MappingName" element
     */
    public java.lang.String getMappingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPPINGNAME$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MappingName" element
     */
    public org.apache.xmlbeans.XmlString xgetMappingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPPINGNAME$20, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "MappingName" element
     */
    public boolean isNilMappingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPPINGNAME$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "MappingName" element
     */
    public boolean isSetMappingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPPINGNAME$20) != 0;
        }
    }
    
    /**
     * Sets the "MappingName" element
     */
    public void setMappingName(java.lang.String mappingName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPPINGNAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAPPINGNAME$20);
            }
            target.setStringValue(mappingName);
        }
    }
    
    /**
     * Sets (as xml) the "MappingName" element
     */
    public void xsetMappingName(org.apache.xmlbeans.XmlString mappingName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPPINGNAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAPPINGNAME$20);
            }
            target.set(mappingName);
        }
    }
    
    /**
     * Nils the "MappingName" element
     */
    public void setNilMappingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPPINGNAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAPPINGNAME$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "MappingName" element
     */
    public void unsetMappingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPPINGNAME$20, 0);
        }
    }
    
    /**
     * Gets the "SyncDirection" element
     */
    public int getSyncDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYNCDIRECTION$22, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SyncDirection" element
     */
    public org.apache.xmlbeans.XmlInt xgetSyncDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SYNCDIRECTION$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "SyncDirection" element
     */
    public boolean isSetSyncDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYNCDIRECTION$22) != 0;
        }
    }
    
    /**
     * Sets the "SyncDirection" element
     */
    public void setSyncDirection(int syncDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYNCDIRECTION$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYNCDIRECTION$22);
            }
            target.setIntValue(syncDirection);
        }
    }
    
    /**
     * Sets (as xml) the "SyncDirection" element
     */
    public void xsetSyncDirection(org.apache.xmlbeans.XmlInt syncDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SYNCDIRECTION$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SYNCDIRECTION$22);
            }
            target.set(syncDirection);
        }
    }
    
    /**
     * Unsets the "SyncDirection" element
     */
    public void unsetSyncDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYNCDIRECTION$22, 0);
        }
    }
}
