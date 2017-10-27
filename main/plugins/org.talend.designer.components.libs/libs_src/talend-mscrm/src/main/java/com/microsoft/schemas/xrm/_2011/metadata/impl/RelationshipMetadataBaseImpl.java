/*
 * XML Type:  RelationshipMetadataBase
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML RelationshipMetadataBase(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class RelationshipMetadataBaseImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.MetadataBaseImpl implements com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipMetadataBaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISCUSTOMRELATIONSHIP$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsCustomRelationship");
    private static final javax.xml.namespace.QName ISCUSTOMIZABLE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsCustomizable");
    private static final javax.xml.namespace.QName ISMANAGED$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsManaged");
    private static final javax.xml.namespace.QName ISVALIDFORADVANCEDFIND$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsValidForAdvancedFind");
    private static final javax.xml.namespace.QName SCHEMANAME$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "SchemaName");
    private static final javax.xml.namespace.QName SECURITYTYPES$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "SecurityTypes");
    private static final javax.xml.namespace.QName INTRODUCEDVERSION$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IntroducedVersion");
    private static final javax.xml.namespace.QName RELATIONSHIPTYPE$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "RelationshipType");
    
    
    /**
     * Gets the "IsCustomRelationship" element
     */
    public boolean getIsCustomRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCUSTOMRELATIONSHIP$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsCustomRelationship" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsCustomRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCUSTOMRELATIONSHIP$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsCustomRelationship" element
     */
    public boolean isNilIsCustomRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCUSTOMRELATIONSHIP$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsCustomRelationship" element
     */
    public boolean isSetIsCustomRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCUSTOMRELATIONSHIP$0) != 0;
        }
    }
    
    /**
     * Sets the "IsCustomRelationship" element
     */
    public void setIsCustomRelationship(boolean isCustomRelationship)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCUSTOMRELATIONSHIP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCUSTOMRELATIONSHIP$0);
            }
            target.setBooleanValue(isCustomRelationship);
        }
    }
    
    /**
     * Sets (as xml) the "IsCustomRelationship" element
     */
    public void xsetIsCustomRelationship(org.apache.xmlbeans.XmlBoolean isCustomRelationship)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCUSTOMRELATIONSHIP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCUSTOMRELATIONSHIP$0);
            }
            target.set(isCustomRelationship);
        }
    }
    
    /**
     * Nils the "IsCustomRelationship" element
     */
    public void setNilIsCustomRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCUSTOMRELATIONSHIP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCUSTOMRELATIONSHIP$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsCustomRelationship" element
     */
    public void unsetIsCustomRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCUSTOMRELATIONSHIP$0, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISCUSTOMIZABLE$2, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISCUSTOMIZABLE$2, 0);
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
            return get_store().count_elements(ISCUSTOMIZABLE$2) != 0;
        }
    }
    
    /**
     * Sets the "IsCustomizable" element
     */
    public void setIsCustomizable(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isCustomizable)
    {
        generatedSetterHelperImpl(isCustomizable, ISCUSTOMIZABLE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISCUSTOMIZABLE$2);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISCUSTOMIZABLE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISCUSTOMIZABLE$2);
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
            get_store().remove_element(ISCUSTOMIZABLE$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMANAGED$4, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$4, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$4, 0);
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
            return get_store().count_elements(ISMANAGED$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMANAGED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISMANAGED$4);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISMANAGED$4);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISMANAGED$4);
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
            get_store().remove_element(ISMANAGED$4, 0);
        }
    }
    
    /**
     * Gets the "IsValidForAdvancedFind" element
     */
    public boolean getIsValidForAdvancedFind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVALIDFORADVANCEDFIND$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsValidForAdvancedFind" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsValidForAdvancedFind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORADVANCEDFIND$6, 0);
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
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORADVANCEDFIND$6, 0);
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
            return get_store().count_elements(ISVALIDFORADVANCEDFIND$6) != 0;
        }
    }
    
    /**
     * Sets the "IsValidForAdvancedFind" element
     */
    public void setIsValidForAdvancedFind(boolean isValidForAdvancedFind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVALIDFORADVANCEDFIND$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISVALIDFORADVANCEDFIND$6);
            }
            target.setBooleanValue(isValidForAdvancedFind);
        }
    }
    
    /**
     * Sets (as xml) the "IsValidForAdvancedFind" element
     */
    public void xsetIsValidForAdvancedFind(org.apache.xmlbeans.XmlBoolean isValidForAdvancedFind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORADVANCEDFIND$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISVALIDFORADVANCEDFIND$6);
            }
            target.set(isValidForAdvancedFind);
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
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALIDFORADVANCEDFIND$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISVALIDFORADVANCEDFIND$6);
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
            get_store().remove_element(ISVALIDFORADVANCEDFIND$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMANAME$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$8, 0);
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
            return get_store().count_elements(SCHEMANAME$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMANAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEMANAME$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCHEMANAME$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCHEMANAME$8);
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
            get_store().remove_element(SCHEMANAME$8, 0);
        }
    }
    
    /**
     * Gets the "SecurityTypes" element
     */
    public java.util.List getSecurityTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYTYPES$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "SecurityTypes" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.SecurityTypes xgetSecurityTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityTypes)get_store().find_element_user(SECURITYTYPES$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SecurityTypes" element
     */
    public boolean isNilSecurityTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityTypes)get_store().find_element_user(SECURITYTYPES$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SecurityTypes" element
     */
    public boolean isSetSecurityTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYTYPES$10) != 0;
        }
    }
    
    /**
     * Sets the "SecurityTypes" element
     */
    public void setSecurityTypes(java.util.List securityTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYTYPES$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECURITYTYPES$10);
            }
            target.setListValue(securityTypes);
        }
    }
    
    /**
     * Sets (as xml) the "SecurityTypes" element
     */
    public void xsetSecurityTypes(com.microsoft.schemas.xrm._2011.metadata.SecurityTypes securityTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityTypes)get_store().find_element_user(SECURITYTYPES$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.SecurityTypes)get_store().add_element_user(SECURITYTYPES$10);
            }
            target.set(securityTypes);
        }
    }
    
    /**
     * Nils the "SecurityTypes" element
     */
    public void setNilSecurityTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityTypes)get_store().find_element_user(SECURITYTYPES$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.SecurityTypes)get_store().add_element_user(SECURITYTYPES$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SecurityTypes" element
     */
    public void unsetSecurityTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYTYPES$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTRODUCEDVERSION$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$12, 0);
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
            return get_store().count_elements(INTRODUCEDVERSION$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTRODUCEDVERSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTRODUCEDVERSION$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTRODUCEDVERSION$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTRODUCEDVERSION$12);
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
            get_store().remove_element(INTRODUCEDVERSION$12, 0);
        }
    }
    
    /**
     * Gets the "RelationshipType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.RelationshipType.Enum getRelationshipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPTYPE$14, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.RelationshipType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RelationshipType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.RelationshipType xgetRelationshipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipType)get_store().find_element_user(RELATIONSHIPTYPE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "RelationshipType" element
     */
    public boolean isSetRelationshipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONSHIPTYPE$14) != 0;
        }
    }
    
    /**
     * Sets the "RelationshipType" element
     */
    public void setRelationshipType(com.microsoft.schemas.xrm._2011.metadata.RelationshipType.Enum relationshipType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPTYPE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONSHIPTYPE$14);
            }
            target.setEnumValue(relationshipType);
        }
    }
    
    /**
     * Sets (as xml) the "RelationshipType" element
     */
    public void xsetRelationshipType(com.microsoft.schemas.xrm._2011.metadata.RelationshipType relationshipType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipType)get_store().find_element_user(RELATIONSHIPTYPE$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipType)get_store().add_element_user(RELATIONSHIPTYPE$14);
            }
            target.set(relationshipType);
        }
    }
    
    /**
     * Unsets the "RelationshipType" element
     */
    public void unsetRelationshipType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONSHIPTYPE$14, 0);
        }
    }
}
