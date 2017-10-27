/*
 * XML Type:  AttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML AttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class AttributeMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.MetadataBaseImpl implements com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata
{
    private static final long serialVersionUID = 1L;
    
    public AttributeMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEOF$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "AttributeOf");
    private static final javax.xml.namespace.QName ATTRIBUTETYPE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "AttributeType");
    private static final javax.xml.namespace.QName CANBESECUREDFORCREATE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanBeSecuredForCreate");
    private static final javax.xml.namespace.QName CANBESECUREDFORREAD$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanBeSecuredForRead");
    private static final javax.xml.namespace.QName CANBESECUREDFORUPDATE$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanBeSecuredForUpdate");
    private static final javax.xml.namespace.QName CANMODIFYADDITIONALSETTINGS$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanModifyAdditionalSettings");
    private static final javax.xml.namespace.QName COLUMNNUMBER$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ColumnNumber");
    private static final javax.xml.namespace.QName DEPRECATEDVERSION$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "DeprecatedVersion");
    private static final javax.xml.namespace.QName DESCRIPTION$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Description");
    private static final javax.xml.namespace.QName DISPLAYNAME$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "DisplayName");
    private static final javax.xml.namespace.QName ENTITYLOGICALNAME$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "EntityLogicalName");
    private static final javax.xml.namespace.QName ISAUDITENABLED$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsAuditEnabled");
    private static final javax.xml.namespace.QName ISCUSTOMATTRIBUTE$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsCustomAttribute");
    private static final javax.xml.namespace.QName ISCUSTOMIZABLE$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsCustomizable");
    private static final javax.xml.namespace.QName ISMANAGED$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsManaged");
    private static final javax.xml.namespace.QName ISPRIMARYID$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsPrimaryId");
    private static final javax.xml.namespace.QName ISPRIMARYNAME$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsPrimaryName");
    private static final javax.xml.namespace.QName ISRENAMEABLE$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsRenameable");
    private static final javax.xml.namespace.QName ISSECURED$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsSecured");
    private static final javax.xml.namespace.QName ISVALIDFORADVANCEDFIND$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsValidForAdvancedFind");
    private static final javax.xml.namespace.QName ISVALIDFORCREATE$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsValidForCreate");
    private static final javax.xml.namespace.QName ISVALIDFORREAD$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsValidForRead");
    private static final javax.xml.namespace.QName ISVALIDFORUPDATE$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsValidForUpdate");
    private static final javax.xml.namespace.QName LINKEDATTRIBUTEID$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "LinkedAttributeId");
    private static final javax.xml.namespace.QName LOGICALNAME$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "LogicalName");
    private static final javax.xml.namespace.QName REQUIREDLEVEL$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "RequiredLevel");
    private static final javax.xml.namespace.QName SCHEMANAME$52 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "SchemaName");
    private static final javax.xml.namespace.QName ATTRIBUTETYPENAME$54 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "AttributeTypeName");
    private static final javax.xml.namespace.QName INTRODUCEDVERSION$56 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IntroducedVersion");
    private static final javax.xml.namespace.QName ISLOGICAL$58 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsLogical");
    private static final javax.xml.namespace.QName SOURCETYPE$60 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "SourceType");
    
    
    /**
     * Gets the "AttributeOf" element
     */
    public java.lang.String getAttributeOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttributeOf" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEOF$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeOf" element
     */
    public boolean isNilAttributeOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEOF$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AttributeOf" element
     */
    public boolean isSetAttributeOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEOF$0) != 0;
        }
    }
    
    /**
     * Sets the "AttributeOf" element
     */
    public void setAttributeOf(java.lang.String attributeOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEOF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTEOF$0);
            }
            target.setStringValue(attributeOf);
        }
    }
    
    /**
     * Sets (as xml) the "AttributeOf" element
     */
    public void xsetAttributeOf(org.apache.xmlbeans.XmlString attributeOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEOF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTEOF$0);
            }
            target.set(attributeOf);
        }
    }
    
    /**
     * Nils the "AttributeOf" element
     */
    public void setNilAttributeOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEOF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTEOF$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AttributeOf" element
     */
    public void unsetAttributeOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEOF$0, 0);
        }
    }
    
    /**
     * Gets the "AttributeType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum getAttributeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTETYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttributeType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode xgetAttributeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().find_element_user(ATTRIBUTETYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeType" element
     */
    public boolean isNilAttributeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().find_element_user(ATTRIBUTETYPE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AttributeType" element
     */
    public boolean isSetAttributeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTETYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "AttributeType" element
     */
    public void setAttributeType(com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode.Enum attributeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTETYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTETYPE$2);
            }
            target.setEnumValue(attributeType);
        }
    }
    
    /**
     * Sets (as xml) the "AttributeType" element
     */
    public void xsetAttributeType(com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode attributeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().find_element_user(ATTRIBUTETYPE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().add_element_user(ATTRIBUTETYPE$2);
            }
            target.set(attributeType);
        }
    }
    
    /**
     * Nils the "AttributeType" element
     */
    public void setNilAttributeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().find_element_user(ATTRIBUTETYPE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AttributeTypeCode)get_store().add_element_user(ATTRIBUTETYPE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AttributeType" element
     */
    public void unsetAttributeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTETYPE$2, 0);
        }
    }
    
    /**
     * Gets the "CanBeSecuredForCreate" element
     */
    public boolean getCanBeSecuredForCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANBESECUREDFORCREATE$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "CanBeSecuredForCreate" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCanBeSecuredForCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBESECUREDFORCREATE$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CanBeSecuredForCreate" element
     */
    public boolean isNilCanBeSecuredForCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBESECUREDFORCREATE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CanBeSecuredForCreate" element
     */
    public boolean isSetCanBeSecuredForCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANBESECUREDFORCREATE$4) != 0;
        }
    }
    
    /**
     * Sets the "CanBeSecuredForCreate" element
     */
    public void setCanBeSecuredForCreate(boolean canBeSecuredForCreate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANBESECUREDFORCREATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANBESECUREDFORCREATE$4);
            }
            target.setBooleanValue(canBeSecuredForCreate);
        }
    }
    
    /**
     * Sets (as xml) the "CanBeSecuredForCreate" element
     */
    public void xsetCanBeSecuredForCreate(org.apache.xmlbeans.XmlBoolean canBeSecuredForCreate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBESECUREDFORCREATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CANBESECUREDFORCREATE$4);
            }
            target.set(canBeSecuredForCreate);
        }
    }
    
    /**
     * Nils the "CanBeSecuredForCreate" element
     */
    public void setNilCanBeSecuredForCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBESECUREDFORCREATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CANBESECUREDFORCREATE$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CanBeSecuredForCreate" element
     */
    public void unsetCanBeSecuredForCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANBESECUREDFORCREATE$4, 0);
        }
    }
    
    /**
     * Gets the "CanBeSecuredForRead" element
     */
    public boolean getCanBeSecuredForRead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANBESECUREDFORREAD$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "CanBeSecuredForRead" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCanBeSecuredForRead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBESECUREDFORREAD$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CanBeSecuredForRead" element
     */
    public boolean isNilCanBeSecuredForRead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBESECUREDFORREAD$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CanBeSecuredForRead" element
     */
    public boolean isSetCanBeSecuredForRead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANBESECUREDFORREAD$6) != 0;
        }
    }
    
    /**
     * Sets the "CanBeSecuredForRead" element
     */
    public void setCanBeSecuredForRead(boolean canBeSecuredForRead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANBESECUREDFORREAD$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANBESECUREDFORREAD$6);
            }
            target.setBooleanValue(canBeSecuredForRead);
        }
    }
    
    /**
     * Sets (as xml) the "CanBeSecuredForRead" element
     */
    public void xsetCanBeSecuredForRead(org.apache.xmlbeans.XmlBoolean canBeSecuredForRead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBESECUREDFORREAD$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CANBESECUREDFORREAD$6);
            }
            target.set(canBeSecuredForRead);
        }
    }
    
    /**
     * Nils the "CanBeSecuredForRead" element
     */
    public void setNilCanBeSecuredForRead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBESECUREDFORREAD$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CANBESECUREDFORREAD$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CanBeSecuredForRead" element
     */
    public void unsetCanBeSecuredForRead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANBESECUREDFORREAD$6, 0);
        }
    }
    
    /**
     * Gets the "CanBeSecuredForUpdate" element
     */
    public boolean getCanBeSecuredForUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANBESECUREDFORUPDATE$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "CanBeSecuredForUpdate" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCanBeSecuredForUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBESECUREDFORUPDATE$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CanBeSecuredForUpdate" element
     */
    public boolean isNilCanBeSecuredForUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBESECUREDFORUPDATE$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CanBeSecuredForUpdate" element
     */
    public boolean isSetCanBeSecuredForUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANBESECUREDFORUPDATE$8) != 0;
        }
    }
    
    /**
     * Sets the "CanBeSecuredForUpdate" element
     */
    public void setCanBeSecuredForUpdate(boolean canBeSecuredForUpdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANBESECUREDFORUPDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANBESECUREDFORUPDATE$8);
            }
            target.setBooleanValue(canBeSecuredForUpdate);
        }
    }
    
    /**
     * Sets (as xml) the "CanBeSecuredForUpdate" element
     */
    public void xsetCanBeSecuredForUpdate(org.apache.xmlbeans.XmlBoolean canBeSecuredForUpdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBESECUREDFORUPDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CANBESECUREDFORUPDATE$8);
            }
            target.set(canBeSecuredForUpdate);
        }
    }
    
    /**
     * Nils the "CanBeSecuredForUpdate" element
     */
    public void setNilCanBeSecuredForUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBESECUREDFORUPDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CANBESECUREDFORUPDATE$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CanBeSecuredForUpdate" element
     */
    public void unsetCanBeSecuredForUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANBESECUREDFORUPDATE$8, 0);
        }
    }
    
    /**
     * Gets the "CanModifyAdditionalSettings" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getCanModifyAdditionalSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANMODIFYADDITIONALSETTINGS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CanModifyAdditionalSettings" element
     */
    public boolean isNilCanModifyAdditionalSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANMODIFYADDITIONALSETTINGS$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CanModifyAdditionalSettings" element
     */
    public boolean isSetCanModifyAdditionalSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANMODIFYADDITIONALSETTINGS$10) != 0;
        }
    }
    
    /**
     * Sets the "CanModifyAdditionalSettings" element
     */
    public void setCanModifyAdditionalSettings(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty canModifyAdditionalSettings)
    {
        generatedSetterHelperImpl(canModifyAdditionalSettings, CANMODIFYADDITIONALSETTINGS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CanModifyAdditionalSettings" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewCanModifyAdditionalSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANMODIFYADDITIONALSETTINGS$10);
            return target;
        }
    }
    
    /**
     * Nils the "CanModifyAdditionalSettings" element
     */
    public void setNilCanModifyAdditionalSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(CANMODIFYADDITIONALSETTINGS$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(CANMODIFYADDITIONALSETTINGS$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CanModifyAdditionalSettings" element
     */
    public void unsetCanModifyAdditionalSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANMODIFYADDITIONALSETTINGS$10, 0);
        }
    }
    
    /**
     * Gets the "ColumnNumber" element
     */
    public int getColumnNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNNUMBER$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ColumnNumber" element
     */
    public org.apache.xmlbeans.XmlInt xgetColumnNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COLUMNNUMBER$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ColumnNumber" element
     */
    public boolean isNilColumnNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COLUMNNUMBER$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ColumnNumber" element
     */
    public boolean isSetColumnNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLUMNNUMBER$12) != 0;
        }
    }
    
    /**
     * Sets the "ColumnNumber" element
     */
    public void setColumnNumber(int columnNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNNUMBER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLUMNNUMBER$12);
            }
            target.setIntValue(columnNumber);
        }
    }
    
    /**
     * Sets (as xml) the "ColumnNumber" element
     */
    public void xsetColumnNumber(org.apache.xmlbeans.XmlInt columnNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COLUMNNUMBER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(COLUMNNUMBER$12);
            }
            target.set(columnNumber);
        }
    }
    
    /**
     * Nils the "ColumnNumber" element
     */
    public void setNilColumnNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COLUMNNUMBER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(COLUMNNUMBER$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ColumnNumber" element
     */
    public void unsetColumnNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLUMNNUMBER$12, 0);
        }
    }
    
    /**
     * Gets the "DeprecatedVersion" element
     */
    public java.lang.String getDeprecatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPRECATEDVERSION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeprecatedVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetDeprecatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPRECATEDVERSION$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DeprecatedVersion" element
     */
    public boolean isNilDeprecatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPRECATEDVERSION$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DeprecatedVersion" element
     */
    public boolean isSetDeprecatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPRECATEDVERSION$14) != 0;
        }
    }
    
    /**
     * Sets the "DeprecatedVersion" element
     */
    public void setDeprecatedVersion(java.lang.String deprecatedVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPRECATEDVERSION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPRECATEDVERSION$14);
            }
            target.setStringValue(deprecatedVersion);
        }
    }
    
    /**
     * Sets (as xml) the "DeprecatedVersion" element
     */
    public void xsetDeprecatedVersion(org.apache.xmlbeans.XmlString deprecatedVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPRECATEDVERSION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEPRECATEDVERSION$14);
            }
            target.set(deprecatedVersion);
        }
    }
    
    /**
     * Nils the "DeprecatedVersion" element
     */
    public void setNilDeprecatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPRECATEDVERSION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEPRECATEDVERSION$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DeprecatedVersion" element
     */
    public void unsetDeprecatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPRECATEDVERSION$14, 0);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DESCRIPTION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Description" element
     */
    public boolean isNilDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DESCRIPTION$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$16) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(com.microsoft.schemas.xrm._2011.contracts.Label description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Description" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DESCRIPTION$16);
            return target;
        }
    }
    
    /**
     * Nils the "Description" element
     */
    public void setNilDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DESCRIPTION$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DESCRIPTION$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$16, 0);
        }
    }
    
    /**
     * Gets the "DisplayName" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label getDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DISPLAYNAME$18, 0);
            if (target == null)
            {
                return null;
            }
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
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DISPLAYNAME$18, 0);
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
            return get_store().count_elements(DISPLAYNAME$18) != 0;
        }
    }
    
    /**
     * Sets the "DisplayName" element
     */
    public void setDisplayName(com.microsoft.schemas.xrm._2011.contracts.Label displayName)
    {
        generatedSetterHelperImpl(displayName, DISPLAYNAME$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DisplayName" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label addNewDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DISPLAYNAME$18);
            return target;
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
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DISPLAYNAME$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DISPLAYNAME$18);
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
            get_store().remove_element(DISPLAYNAME$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYLOGICALNAME$20, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYLOGICALNAME$20, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYLOGICALNAME$20, 0);
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
            return get_store().count_elements(ENTITYLOGICALNAME$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYLOGICALNAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYLOGICALNAME$20);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYLOGICALNAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYLOGICALNAME$20);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYLOGICALNAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYLOGICALNAME$20);
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
            get_store().remove_element(ENTITYLOGICALNAME$20, 0);
        }
    }
    
    /**
     * Gets the "IsAuditEnabled" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsAuditEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISAUDITENABLED$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IsAuditEnabled" element
     */
    public boolean isNilIsAuditEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISAUDITENABLED$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsAuditEnabled" element
     */
    public boolean isSetIsAuditEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISAUDITENABLED$22) != 0;
        }
    }
    
    /**
     * Sets the "IsAuditEnabled" element
     */
    public void setIsAuditEnabled(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isAuditEnabled)
    {
        generatedSetterHelperImpl(isAuditEnabled, ISAUDITENABLED$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IsAuditEnabled" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsAuditEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISAUDITENABLED$22);
            return target;
        }
    }
    
    /**
     * Nils the "IsAuditEnabled" element
     */
    public void setNilIsAuditEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISAUDITENABLED$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISAUDITENABLED$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsAuditEnabled" element
     */
    public void unsetIsAuditEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISAUDITENABLED$22, 0);
        }
    }
    
    /**
     * Gets the "IsCustomAttribute" element
     */
    public boolean getIsCustomAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCUSTOMATTRIBUTE$24, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsCustomAttribute" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsCustomAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCUSTOMATTRIBUTE$24, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsCustomAttribute" element
     */
    public boolean isNilIsCustomAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCUSTOMATTRIBUTE$24, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsCustomAttribute" element
     */
    public boolean isSetIsCustomAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCUSTOMATTRIBUTE$24) != 0;
        }
    }
    
    /**
     * Sets the "IsCustomAttribute" element
     */
    public void setIsCustomAttribute(boolean isCustomAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCUSTOMATTRIBUTE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCUSTOMATTRIBUTE$24);
            }
            target.setBooleanValue(isCustomAttribute);
        }
    }
    
    /**
     * Sets (as xml) the "IsCustomAttribute" element
     */
    public void xsetIsCustomAttribute(org.apache.xmlbeans.XmlBoolean isCustomAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCUSTOMATTRIBUTE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCUSTOMATTRIBUTE$24);
            }
            target.set(isCustomAttribute);
        }
    }
    
    /**
     * Nils the "IsCustomAttribute" element
     */
    public void setNilIsCustomAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCUSTOMATTRIBUTE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCUSTOMATTRIBUTE$24);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsCustomAttribute" element
     */
    public void unsetIsCustomAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCUSTOMATTRIBUTE$24, 0);
        }
    }
    
    /**
     * Gets the "IsCustomizable" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsCustomizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISCUSTOMIZABLE$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IsCustomizable" element
     */
    public boolean isNilIsCustomizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISCUSTOMIZABLE$26, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsCustomizable" element
     */
    public boolean isSetIsCustomizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCUSTOMIZABLE$26) != 0;
        }
    }
    
    /**
     * Sets the "IsCustomizable" element
     */
    public void setIsCustomizable(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isCustomizable)
    {
        generatedSetterHelperImpl(isCustomizable, ISCUSTOMIZABLE$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IsCustomizable" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsCustomizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISCUSTOMIZABLE$26);
            return target;
        }
    }
    
    /**
     * Nils the "IsCustomizable" element
     */
    public void setNilIsCustomizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISCUSTOMIZABLE$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISCUSTOMIZABLE$26);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsCustomizable" element
     */
    public void unsetIsCustomizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCUSTOMIZABLE$26, 0);
        }
    }
    
    /**
     * Gets the "IsManaged" element
     */
    public boolean getIsManaged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMANAGED$28, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsManaged" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsManaged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$28, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsManaged" element
     */
    public boolean isNilIsManaged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$28, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsManaged" element
     */
    public boolean isSetIsManaged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISMANAGED$28) != 0;
        }
    }
    
    /**
     * Sets the "IsManaged" element
     */
    public void setIsManaged(boolean isManaged)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMANAGED$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISMANAGED$28);
            }
            target.setBooleanValue(isManaged);
        }
    }
    
    /**
     * Sets (as xml) the "IsManaged" element
     */
    public void xsetIsManaged(org.apache.xmlbeans.XmlBoolean isManaged)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISMANAGED$28);
            }
            target.set(isManaged);
        }
    }
    
    /**
     * Nils the "IsManaged" element
     */
    public void setNilIsManaged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISMANAGED$28);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsManaged" element
     */
    public void unsetIsManaged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISMANAGED$28, 0);
        }
    }
    
    /**
     * Gets the "IsPrimaryId" element
     */
    public boolean getIsPrimaryId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPRIMARYID$30, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsPrimaryId" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsPrimaryId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIMARYID$30, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsPrimaryId" element
     */
    public boolean isNilIsPrimaryId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIMARYID$30, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsPrimaryId" element
     */
    public boolean isSetIsPrimaryId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISPRIMARYID$30) != 0;
        }
    }
    
    /**
     * Sets the "IsPrimaryId" element
     */
    public void setIsPrimaryId(boolean isPrimaryId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPRIMARYID$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISPRIMARYID$30);
            }
            target.setBooleanValue(isPrimaryId);
        }
    }
    
    /**
     * Sets (as xml) the "IsPrimaryId" element
     */
    public void xsetIsPrimaryId(org.apache.xmlbeans.XmlBoolean isPrimaryId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIMARYID$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISPRIMARYID$30);
            }
            target.set(isPrimaryId);
        }
    }
    
    /**
     * Nils the "IsPrimaryId" element
     */
    public void setNilIsPrimaryId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIMARYID$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISPRIMARYID$30);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsPrimaryId" element
     */
    public void unsetIsPrimaryId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISPRIMARYID$30, 0);
        }
    }
    
    /**
     * Gets the "IsPrimaryName" element
     */
    public boolean getIsPrimaryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPRIMARYNAME$32, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsPrimaryName" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsPrimaryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIMARYNAME$32, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsPrimaryName" element
     */
    public boolean isNilIsPrimaryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIMARYNAME$32, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsPrimaryName" element
     */
    public boolean isSetIsPrimaryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISPRIMARYNAME$32) != 0;
        }
    }
    
    /**
     * Sets the "IsPrimaryName" element
     */
    public void setIsPrimaryName(boolean isPrimaryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPRIMARYNAME$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISPRIMARYNAME$32);
            }
            target.setBooleanValue(isPrimaryName);
        }
    }
    
    /**
     * Sets (as xml) the "IsPrimaryName" element
     */
    public void xsetIsPrimaryName(org.apache.xmlbeans.XmlBoolean isPrimaryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIMARYNAME$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISPRIMARYNAME$32);
            }
            target.set(isPrimaryName);
        }
    }
    
    /**
     * Nils the "IsPrimaryName" element
     */
    public void setNilIsPrimaryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIMARYNAME$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISPRIMARYNAME$32);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsPrimaryName" element
     */
    public void unsetIsPrimaryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISPRIMARYNAME$32, 0);
        }
    }
    
    /**
     * Gets the "IsRenameable" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsRenameable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISRENAMEABLE$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IsRenameable" element
     */
    public boolean isNilIsRenameable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISRENAMEABLE$34, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsRenameable" element
     */
    public boolean isSetIsRenameable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISRENAMEABLE$34) != 0;
        }
    }
    
    /**
     * Sets the "IsRenameable" element
     */
    public void setIsRenameable(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isRenameable)
    {
        generatedSetterHelperImpl(isRenameable, ISRENAMEABLE$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IsRenameable" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsRenameable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISRENAMEABLE$34);
            return target;
        }
    }
    
    /**
     * Nils the "IsRenameable" element
     */
    public void setNilIsRenameable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISRENAMEABLE$34, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISRENAMEABLE$34);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsRenameable" element
     */
    public void unsetIsRenameable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISRENAMEABLE$34, 0);
        }
    }
    
    /**
     * Gets the "IsSecured" element
     */
    public boolean getIsSecured()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSECURED$36, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsSecured" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsSecured()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSECURED$36, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsSecured" element
     */
    public boolean isNilIsSecured()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSECURED$36, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsSecured" element
     */
    public boolean isSetIsSecured()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSECURED$36) != 0;
        }
    }
    
    /**
     * Sets the "IsSecured" element
     */
    public void setIsSecured(boolean isSecured)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSECURED$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSECURED$36);
            }
            target.setBooleanValue(isSecured);
        }
    }
    
    /**
     * Sets (as xml) the "IsSecured" element
     */
    public void xsetIsSecured(org.apache.xmlbeans.XmlBoolean isSecured)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSECURED$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSECURED$36);
            }
            target.set(isSecured);
        }
    }
    
    /**
     * Nils the "IsSecured" element
     */
    public void setNilIsSecured()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSECURED$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSECURED$36);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsSecured" element
     */
    public void unsetIsSecured()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSECURED$36, 0);
        }
    }
    
    /**
     * Gets the "IsValidForAdvancedFind" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty getIsValidForAdvancedFind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISVALIDFORADVANCEDFIND$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IsValidForAdvancedFind" element
     */
    public boolean isNilIsValidForAdvancedFind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISVALIDFORADVANCEDFIND$38, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsValidForAdvancedFind" element
     */
    public boolean isSetIsValidForAdvancedFind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISVALIDFORADVANCEDFIND$38) != 0;
        }
    }
    
    /**
     * Sets the "IsValidForAdvancedFind" element
     */
    public void setIsValidForAdvancedFind(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isValidForAdvancedFind)
    {
        generatedSetterHelperImpl(isValidForAdvancedFind, ISVALIDFORADVANCEDFIND$38, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IsValidForAdvancedFind" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty addNewIsValidForAdvancedFind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISVALIDFORADVANCEDFIND$38);
            return target;
        }
    }
    
    /**
     * Nils the "IsValidForAdvancedFind" element
     */
    public void setNilIsValidForAdvancedFind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISVALIDFORADVANCEDFIND$38, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISVALIDFORADVANCEDFIND$38);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsValidForAdvancedFind" element
     */
    public void unsetIsValidForAdvancedFind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISVALIDFORADVANCEDFIND$38, 0);
        }
    }
    
    /**
     * Gets the "IsValidForCreate" element
     */
    public boolean getIsValidForCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVALIDFORCREATE$40, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsValidForCreate" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsValidForCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORCREATE$40, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsValidForCreate" element
     */
    public boolean isNilIsValidForCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORCREATE$40, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsValidForCreate" element
     */
    public boolean isSetIsValidForCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISVALIDFORCREATE$40) != 0;
        }
    }
    
    /**
     * Sets the "IsValidForCreate" element
     */
    public void setIsValidForCreate(boolean isValidForCreate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVALIDFORCREATE$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISVALIDFORCREATE$40);
            }
            target.setBooleanValue(isValidForCreate);
        }
    }
    
    /**
     * Sets (as xml) the "IsValidForCreate" element
     */
    public void xsetIsValidForCreate(org.apache.xmlbeans.XmlBoolean isValidForCreate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORCREATE$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISVALIDFORCREATE$40);
            }
            target.set(isValidForCreate);
        }
    }
    
    /**
     * Nils the "IsValidForCreate" element
     */
    public void setNilIsValidForCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORCREATE$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISVALIDFORCREATE$40);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsValidForCreate" element
     */
    public void unsetIsValidForCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISVALIDFORCREATE$40, 0);
        }
    }
    
    /**
     * Gets the "IsValidForRead" element
     */
    public boolean getIsValidForRead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVALIDFORREAD$42, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsValidForRead" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsValidForRead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORREAD$42, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsValidForRead" element
     */
    public boolean isNilIsValidForRead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORREAD$42, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsValidForRead" element
     */
    public boolean isSetIsValidForRead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISVALIDFORREAD$42) != 0;
        }
    }
    
    /**
     * Sets the "IsValidForRead" element
     */
    public void setIsValidForRead(boolean isValidForRead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVALIDFORREAD$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISVALIDFORREAD$42);
            }
            target.setBooleanValue(isValidForRead);
        }
    }
    
    /**
     * Sets (as xml) the "IsValidForRead" element
     */
    public void xsetIsValidForRead(org.apache.xmlbeans.XmlBoolean isValidForRead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORREAD$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISVALIDFORREAD$42);
            }
            target.set(isValidForRead);
        }
    }
    
    /**
     * Nils the "IsValidForRead" element
     */
    public void setNilIsValidForRead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORREAD$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISVALIDFORREAD$42);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsValidForRead" element
     */
    public void unsetIsValidForRead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISVALIDFORREAD$42, 0);
        }
    }
    
    /**
     * Gets the "IsValidForUpdate" element
     */
    public boolean getIsValidForUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVALIDFORUPDATE$44, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsValidForUpdate" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsValidForUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORUPDATE$44, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsValidForUpdate" element
     */
    public boolean isNilIsValidForUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORUPDATE$44, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsValidForUpdate" element
     */
    public boolean isSetIsValidForUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISVALIDFORUPDATE$44) != 0;
        }
    }
    
    /**
     * Sets the "IsValidForUpdate" element
     */
    public void setIsValidForUpdate(boolean isValidForUpdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVALIDFORUPDATE$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISVALIDFORUPDATE$44);
            }
            target.setBooleanValue(isValidForUpdate);
        }
    }
    
    /**
     * Sets (as xml) the "IsValidForUpdate" element
     */
    public void xsetIsValidForUpdate(org.apache.xmlbeans.XmlBoolean isValidForUpdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORUPDATE$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISVALIDFORUPDATE$44);
            }
            target.set(isValidForUpdate);
        }
    }
    
    /**
     * Nils the "IsValidForUpdate" element
     */
    public void setNilIsValidForUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORUPDATE$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISVALIDFORUPDATE$44);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsValidForUpdate" element
     */
    public void unsetIsValidForUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISVALIDFORUPDATE$44, 0);
        }
    }
    
    /**
     * Gets the "LinkedAttributeId" element
     */
    public java.lang.String getLinkedAttributeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKEDATTRIBUTEID$46, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LinkedAttributeId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetLinkedAttributeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(LINKEDATTRIBUTEID$46, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "LinkedAttributeId" element
     */
    public boolean isNilLinkedAttributeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(LINKEDATTRIBUTEID$46, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LinkedAttributeId" element
     */
    public boolean isSetLinkedAttributeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKEDATTRIBUTEID$46) != 0;
        }
    }
    
    /**
     * Sets the "LinkedAttributeId" element
     */
    public void setLinkedAttributeId(java.lang.String linkedAttributeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKEDATTRIBUTEID$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINKEDATTRIBUTEID$46);
            }
            target.setStringValue(linkedAttributeId);
        }
    }
    
    /**
     * Sets (as xml) the "LinkedAttributeId" element
     */
    public void xsetLinkedAttributeId(com.microsoft.schemas._2003._10.serialization.Guid linkedAttributeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(LINKEDATTRIBUTEID$46, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(LINKEDATTRIBUTEID$46);
            }
            target.set(linkedAttributeId);
        }
    }
    
    /**
     * Nils the "LinkedAttributeId" element
     */
    public void setNilLinkedAttributeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(LINKEDATTRIBUTEID$46, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(LINKEDATTRIBUTEID$46);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LinkedAttributeId" element
     */
    public void unsetLinkedAttributeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKEDATTRIBUTEID$46, 0);
        }
    }
    
    /**
     * Gets the "LogicalName" element
     */
    public java.lang.String getLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALNAME$48, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LogicalName" element
     */
    public org.apache.xmlbeans.XmlString xgetLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$48, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "LogicalName" element
     */
    public boolean isNilLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$48, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LogicalName" element
     */
    public boolean isSetLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGICALNAME$48) != 0;
        }
    }
    
    /**
     * Sets the "LogicalName" element
     */
    public void setLogicalName(java.lang.String logicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALNAME$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGICALNAME$48);
            }
            target.setStringValue(logicalName);
        }
    }
    
    /**
     * Sets (as xml) the "LogicalName" element
     */
    public void xsetLogicalName(org.apache.xmlbeans.XmlString logicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGICALNAME$48);
            }
            target.set(logicalName);
        }
    }
    
    /**
     * Nils the "LogicalName" element
     */
    public void setNilLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGICALNAME$48);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LogicalName" element
     */
    public void unsetLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGICALNAME$48, 0);
        }
    }
    
    /**
     * Gets the "RequiredLevel" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty getRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty)get_store().find_element_user(REQUIREDLEVEL$50, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RequiredLevel" element
     */
    public boolean isNilRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty)get_store().find_element_user(REQUIREDLEVEL$50, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RequiredLevel" element
     */
    public boolean isSetRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUIREDLEVEL$50) != 0;
        }
    }
    
    /**
     * Sets the "RequiredLevel" element
     */
    public void setRequiredLevel(com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty requiredLevel)
    {
        generatedSetterHelperImpl(requiredLevel, REQUIREDLEVEL$50, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RequiredLevel" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty addNewRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty)get_store().add_element_user(REQUIREDLEVEL$50);
            return target;
        }
    }
    
    /**
     * Nils the "RequiredLevel" element
     */
    public void setNilRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty)get_store().find_element_user(REQUIREDLEVEL$50, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty)get_store().add_element_user(REQUIREDLEVEL$50);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RequiredLevel" element
     */
    public void unsetRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUIREDLEVEL$50, 0);
        }
    }
    
    /**
     * Gets the "SchemaName" element
     */
    public java.lang.String getSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMANAME$52, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SchemaName" element
     */
    public org.apache.xmlbeans.XmlString xgetSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$52, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SchemaName" element
     */
    public boolean isNilSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$52, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SchemaName" element
     */
    public boolean isSetSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEMANAME$52) != 0;
        }
    }
    
    /**
     * Sets the "SchemaName" element
     */
    public void setSchemaName(java.lang.String schemaName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMANAME$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEMANAME$52);
            }
            target.setStringValue(schemaName);
        }
    }
    
    /**
     * Sets (as xml) the "SchemaName" element
     */
    public void xsetSchemaName(org.apache.xmlbeans.XmlString schemaName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCHEMANAME$52);
            }
            target.set(schemaName);
        }
    }
    
    /**
     * Nils the "SchemaName" element
     */
    public void setNilSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCHEMANAME$52);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SchemaName" element
     */
    public void unsetSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEMANAME$52, 0);
        }
    }
    
    /**
     * Gets the "AttributeTypeName" element
     */
    public com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName getAttributeTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName)get_store().find_element_user(ATTRIBUTETYPENAME$54, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeTypeName" element
     */
    public boolean isNilAttributeTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName)get_store().find_element_user(ATTRIBUTETYPENAME$54, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AttributeTypeName" element
     */
    public boolean isSetAttributeTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTETYPENAME$54) != 0;
        }
    }
    
    /**
     * Sets the "AttributeTypeName" element
     */
    public void setAttributeTypeName(com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName attributeTypeName)
    {
        generatedSetterHelperImpl(attributeTypeName, ATTRIBUTETYPENAME$54, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AttributeTypeName" element
     */
    public com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName addNewAttributeTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName)get_store().add_element_user(ATTRIBUTETYPENAME$54);
            return target;
        }
    }
    
    /**
     * Nils the "AttributeTypeName" element
     */
    public void setNilAttributeTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName)get_store().find_element_user(ATTRIBUTETYPENAME$54, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName)get_store().add_element_user(ATTRIBUTETYPENAME$54);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AttributeTypeName" element
     */
    public void unsetAttributeTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTETYPENAME$54, 0);
        }
    }
    
    /**
     * Gets the "IntroducedVersion" element
     */
    public java.lang.String getIntroducedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTRODUCEDVERSION$56, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IntroducedVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetIntroducedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$56, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IntroducedVersion" element
     */
    public boolean isNilIntroducedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$56, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IntroducedVersion" element
     */
    public boolean isSetIntroducedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTRODUCEDVERSION$56) != 0;
        }
    }
    
    /**
     * Sets the "IntroducedVersion" element
     */
    public void setIntroducedVersion(java.lang.String introducedVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTRODUCEDVERSION$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTRODUCEDVERSION$56);
            }
            target.setStringValue(introducedVersion);
        }
    }
    
    /**
     * Sets (as xml) the "IntroducedVersion" element
     */
    public void xsetIntroducedVersion(org.apache.xmlbeans.XmlString introducedVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTRODUCEDVERSION$56);
            }
            target.set(introducedVersion);
        }
    }
    
    /**
     * Nils the "IntroducedVersion" element
     */
    public void setNilIntroducedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTRODUCEDVERSION$56);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IntroducedVersion" element
     */
    public void unsetIntroducedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTRODUCEDVERSION$56, 0);
        }
    }
    
    /**
     * Gets the "IsLogical" element
     */
    public boolean getIsLogical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISLOGICAL$58, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsLogical" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsLogical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISLOGICAL$58, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsLogical" element
     */
    public boolean isNilIsLogical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISLOGICAL$58, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsLogical" element
     */
    public boolean isSetIsLogical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISLOGICAL$58) != 0;
        }
    }
    
    /**
     * Sets the "IsLogical" element
     */
    public void setIsLogical(boolean isLogical)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISLOGICAL$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISLOGICAL$58);
            }
            target.setBooleanValue(isLogical);
        }
    }
    
    /**
     * Sets (as xml) the "IsLogical" element
     */
    public void xsetIsLogical(org.apache.xmlbeans.XmlBoolean isLogical)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISLOGICAL$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISLOGICAL$58);
            }
            target.set(isLogical);
        }
    }
    
    /**
     * Nils the "IsLogical" element
     */
    public void setNilIsLogical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISLOGICAL$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISLOGICAL$58);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsLogical" element
     */
    public void unsetIsLogical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISLOGICAL$58, 0);
        }
    }
    
    /**
     * Gets the "SourceType" element
     */
    public int getSourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETYPE$60, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceType" element
     */
    public org.apache.xmlbeans.XmlInt xgetSourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPE$60, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SourceType" element
     */
    public boolean isNilSourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPE$60, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SourceType" element
     */
    public boolean isSetSourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCETYPE$60) != 0;
        }
    }
    
    /**
     * Sets the "SourceType" element
     */
    public void setSourceType(int sourceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETYPE$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCETYPE$60);
            }
            target.setIntValue(sourceType);
        }
    }
    
    /**
     * Sets (as xml) the "SourceType" element
     */
    public void xsetSourceType(org.apache.xmlbeans.XmlInt sourceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPE$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SOURCETYPE$60);
            }
            target.set(sourceType);
        }
    }
    
    /**
     * Nils the "SourceType" element
     */
    public void setNilSourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPE$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SOURCETYPE$60);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SourceType" element
     */
    public void unsetSourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCETYPE$60, 0);
        }
    }
}
