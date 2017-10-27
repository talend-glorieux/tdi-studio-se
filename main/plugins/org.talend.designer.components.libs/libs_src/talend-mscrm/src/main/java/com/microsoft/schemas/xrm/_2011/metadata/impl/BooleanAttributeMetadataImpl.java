/*
 * XML Type:  BooleanAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.BooleanAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML BooleanAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class BooleanAttributeMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.AttributeMetadataImpl implements com.microsoft.schemas.xrm._2011.metadata.BooleanAttributeMetadata
{
    private static final long serialVersionUID = 1L;
    
    public BooleanAttributeMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFAULTVALUE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "DefaultValue");
    private static final javax.xml.namespace.QName OPTIONSET$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "OptionSet");
    private static final javax.xml.namespace.QName FORMULADEFINITION$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "FormulaDefinition");
    private static final javax.xml.namespace.QName SOURCETYPEMASK$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "SourceTypeMask");
    
    
    /**
     * Gets the "DefaultValue" element
     */
    public boolean getDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTVALUE$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "DefaultValue" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DEFAULTVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DefaultValue" element
     */
    public boolean isNilDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DEFAULTVALUE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DefaultValue" element
     */
    public boolean isSetDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTVALUE$0) != 0;
        }
    }
    
    /**
     * Sets the "DefaultValue" element
     */
    public void setDefaultValue(boolean defaultValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTVALUE$0);
            }
            target.setBooleanValue(defaultValue);
        }
    }
    
    /**
     * Sets (as xml) the "DefaultValue" element
     */
    public void xsetDefaultValue(org.apache.xmlbeans.XmlBoolean defaultValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DEFAULTVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DEFAULTVALUE$0);
            }
            target.set(defaultValue);
        }
    }
    
    /**
     * Nils the "DefaultValue" element
     */
    public void setNilDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DEFAULTVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DEFAULTVALUE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DefaultValue" element
     */
    public void unsetDefaultValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTVALUE$0, 0);
        }
    }
    
    /**
     * Gets the "OptionSet" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata getOptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata)get_store().find_element_user(OPTIONSET$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OptionSet" element
     */
    public boolean isNilOptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata)get_store().find_element_user(OPTIONSET$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OptionSet" element
     */
    public boolean isSetOptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTIONSET$2) != 0;
        }
    }
    
    /**
     * Sets the "OptionSet" element
     */
    public void setOptionSet(com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata optionSet)
    {
        generatedSetterHelperImpl(optionSet, OPTIONSET$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OptionSet" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata addNewOptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata)get_store().add_element_user(OPTIONSET$2);
            return target;
        }
    }
    
    /**
     * Nils the "OptionSet" element
     */
    public void setNilOptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata)get_store().find_element_user(OPTIONSET$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata)get_store().add_element_user(OPTIONSET$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OptionSet" element
     */
    public void unsetOptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTIONSET$2, 0);
        }
    }
    
    /**
     * Gets the "FormulaDefinition" element
     */
    public java.lang.String getFormulaDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMULADEFINITION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FormulaDefinition" element
     */
    public org.apache.xmlbeans.XmlString xgetFormulaDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "FormulaDefinition" element
     */
    public boolean isNilFormulaDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "FormulaDefinition" element
     */
    public boolean isSetFormulaDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMULADEFINITION$4) != 0;
        }
    }
    
    /**
     * Sets the "FormulaDefinition" element
     */
    public void setFormulaDefinition(java.lang.String formulaDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMULADEFINITION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMULADEFINITION$4);
            }
            target.setStringValue(formulaDefinition);
        }
    }
    
    /**
     * Sets (as xml) the "FormulaDefinition" element
     */
    public void xsetFormulaDefinition(org.apache.xmlbeans.XmlString formulaDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMULADEFINITION$4);
            }
            target.set(formulaDefinition);
        }
    }
    
    /**
     * Nils the "FormulaDefinition" element
     */
    public void setNilFormulaDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMULADEFINITION$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "FormulaDefinition" element
     */
    public void unsetFormulaDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMULADEFINITION$4, 0);
        }
    }
    
    /**
     * Gets the "SourceTypeMask" element
     */
    public int getSourceTypeMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETYPEMASK$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceTypeMask" element
     */
    public org.apache.xmlbeans.XmlInt xgetSourceTypeMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SourceTypeMask" element
     */
    public boolean isNilSourceTypeMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SourceTypeMask" element
     */
    public boolean isSetSourceTypeMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCETYPEMASK$6) != 0;
        }
    }
    
    /**
     * Sets the "SourceTypeMask" element
     */
    public void setSourceTypeMask(int sourceTypeMask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETYPEMASK$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCETYPEMASK$6);
            }
            target.setIntValue(sourceTypeMask);
        }
    }
    
    /**
     * Sets (as xml) the "SourceTypeMask" element
     */
    public void xsetSourceTypeMask(org.apache.xmlbeans.XmlInt sourceTypeMask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SOURCETYPEMASK$6);
            }
            target.set(sourceTypeMask);
        }
    }
    
    /**
     * Nils the "SourceTypeMask" element
     */
    public void setNilSourceTypeMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SOURCETYPEMASK$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SourceTypeMask" element
     */
    public void unsetSourceTypeMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCETYPEMASK$6, 0);
        }
    }
}
