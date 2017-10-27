/*
 * XML Type:  OptionSetMetadataBase
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML OptionSetMetadataBase(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class OptionSetMetadataBaseImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.MetadataBaseImpl implements com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase
{
    private static final long serialVersionUID = 1L;
    
    public OptionSetMetadataBaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Description");
    private static final javax.xml.namespace.QName DISPLAYNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "DisplayName");
    private static final javax.xml.namespace.QName ISCUSTOMOPTIONSET$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsCustomOptionSet");
    private static final javax.xml.namespace.QName ISCUSTOMIZABLE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsCustomizable");
    private static final javax.xml.namespace.QName ISGLOBAL$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsGlobal");
    private static final javax.xml.namespace.QName ISMANAGED$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsManaged");
    private static final javax.xml.namespace.QName NAME$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Name");
    private static final javax.xml.namespace.QName OPTIONSETTYPE$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "OptionSetType");
    private static final javax.xml.namespace.QName INTRODUCEDVERSION$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IntroducedVersion");
    
    
    /**
     * Gets the "Description" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DESCRIPTION$0, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DESCRIPTION$0, 0);
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
            return get_store().count_elements(DESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(com.microsoft.schemas.xrm._2011.contracts.Label description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DESCRIPTION$0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DESCRIPTION$0);
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
            get_store().remove_element(DESCRIPTION$0, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DISPLAYNAME$2, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DISPLAYNAME$2, 0);
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
            return get_store().count_elements(DISPLAYNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "DisplayName" element
     */
    public void setDisplayName(com.microsoft.schemas.xrm._2011.contracts.Label displayName)
    {
        generatedSetterHelperImpl(displayName, DISPLAYNAME$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DISPLAYNAME$2);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DISPLAYNAME$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DISPLAYNAME$2);
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
            get_store().remove_element(DISPLAYNAME$2, 0);
        }
    }
    
    /**
     * Gets the "IsCustomOptionSet" element
     */
    public boolean getIsCustomOptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCUSTOMOPTIONSET$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsCustomOptionSet" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsCustomOptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCUSTOMOPTIONSET$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsCustomOptionSet" element
     */
    public boolean isNilIsCustomOptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCUSTOMOPTIONSET$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsCustomOptionSet" element
     */
    public boolean isSetIsCustomOptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCUSTOMOPTIONSET$4) != 0;
        }
    }
    
    /**
     * Sets the "IsCustomOptionSet" element
     */
    public void setIsCustomOptionSet(boolean isCustomOptionSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCUSTOMOPTIONSET$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCUSTOMOPTIONSET$4);
            }
            target.setBooleanValue(isCustomOptionSet);
        }
    }
    
    /**
     * Sets (as xml) the "IsCustomOptionSet" element
     */
    public void xsetIsCustomOptionSet(org.apache.xmlbeans.XmlBoolean isCustomOptionSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCUSTOMOPTIONSET$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCUSTOMOPTIONSET$4);
            }
            target.set(isCustomOptionSet);
        }
    }
    
    /**
     * Nils the "IsCustomOptionSet" element
     */
    public void setNilIsCustomOptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCUSTOMOPTIONSET$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCUSTOMOPTIONSET$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsCustomOptionSet" element
     */
    public void unsetIsCustomOptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCUSTOMOPTIONSET$4, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISCUSTOMIZABLE$6, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISCUSTOMIZABLE$6, 0);
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
            return get_store().count_elements(ISCUSTOMIZABLE$6) != 0;
        }
    }
    
    /**
     * Sets the "IsCustomizable" element
     */
    public void setIsCustomizable(com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty isCustomizable)
    {
        generatedSetterHelperImpl(isCustomizable, ISCUSTOMIZABLE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISCUSTOMIZABLE$6);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().find_element_user(ISCUSTOMIZABLE$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty)get_store().add_element_user(ISCUSTOMIZABLE$6);
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
            get_store().remove_element(ISCUSTOMIZABLE$6, 0);
        }
    }
    
    /**
     * Gets the "IsGlobal" element
     */
    public boolean getIsGlobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISGLOBAL$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsGlobal" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsGlobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISGLOBAL$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsGlobal" element
     */
    public boolean isNilIsGlobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISGLOBAL$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsGlobal" element
     */
    public boolean isSetIsGlobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISGLOBAL$8) != 0;
        }
    }
    
    /**
     * Sets the "IsGlobal" element
     */
    public void setIsGlobal(boolean isGlobal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISGLOBAL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISGLOBAL$8);
            }
            target.setBooleanValue(isGlobal);
        }
    }
    
    /**
     * Sets (as xml) the "IsGlobal" element
     */
    public void xsetIsGlobal(org.apache.xmlbeans.XmlBoolean isGlobal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISGLOBAL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISGLOBAL$8);
            }
            target.set(isGlobal);
        }
    }
    
    /**
     * Nils the "IsGlobal" element
     */
    public void setNilIsGlobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISGLOBAL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISGLOBAL$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsGlobal" element
     */
    public void unsetIsGlobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISGLOBAL$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMANAGED$10, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$10, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$10, 0);
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
            return get_store().count_elements(ISMANAGED$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMANAGED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISMANAGED$10);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISMANAGED$10);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISMANAGED$10);
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
            get_store().remove_element(ISMANAGED$10, 0);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Name" element
     */
    public boolean isNilName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$12) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$12);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$12);
            }
            target.set(name);
        }
    }
    
    /**
     * Nils the "Name" element
     */
    public void setNilName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$12, 0);
        }
    }
    
    /**
     * Gets the "OptionSetType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionSetType.Enum getOptionSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTIONSETTYPE$14, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.OptionSetType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OptionSetType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionSetType xgetOptionSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetType)get_store().find_element_user(OPTIONSETTYPE$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OptionSetType" element
     */
    public boolean isNilOptionSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetType)get_store().find_element_user(OPTIONSETTYPE$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OptionSetType" element
     */
    public boolean isSetOptionSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTIONSETTYPE$14) != 0;
        }
    }
    
    /**
     * Sets the "OptionSetType" element
     */
    public void setOptionSetType(com.microsoft.schemas.xrm._2011.metadata.OptionSetType.Enum optionSetType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTIONSETTYPE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPTIONSETTYPE$14);
            }
            target.setEnumValue(optionSetType);
        }
    }
    
    /**
     * Sets (as xml) the "OptionSetType" element
     */
    public void xsetOptionSetType(com.microsoft.schemas.xrm._2011.metadata.OptionSetType optionSetType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetType)get_store().find_element_user(OPTIONSETTYPE$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetType)get_store().add_element_user(OPTIONSETTYPE$14);
            }
            target.set(optionSetType);
        }
    }
    
    /**
     * Nils the "OptionSetType" element
     */
    public void setNilOptionSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetType)get_store().find_element_user(OPTIONSETTYPE$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetType)get_store().add_element_user(OPTIONSETTYPE$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OptionSetType" element
     */
    public void unsetOptionSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTIONSETTYPE$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTRODUCEDVERSION$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$16, 0);
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
            return get_store().count_elements(INTRODUCEDVERSION$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTRODUCEDVERSION$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTRODUCEDVERSION$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTRODUCEDVERSION$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRODUCEDVERSION$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTRODUCEDVERSION$16);
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
            get_store().remove_element(INTRODUCEDVERSION$16, 0);
        }
    }
}
