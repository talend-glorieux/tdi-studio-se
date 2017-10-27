/*
 * XML Type:  StringAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML StringAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class StringAttributeMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.AttributeMetadataImpl implements com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata
{
    private static final long serialVersionUID = 1L;
    
    public StringAttributeMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Format");
    private static final javax.xml.namespace.QName IMEMODE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ImeMode");
    private static final javax.xml.namespace.QName MAXLENGTH$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "MaxLength");
    private static final javax.xml.namespace.QName YOMIOF$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "YomiOf");
    private static final javax.xml.namespace.QName FORMATNAME$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "FormatName");
    private static final javax.xml.namespace.QName FORMULADEFINITION$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "FormulaDefinition");
    private static final javax.xml.namespace.QName ISLOCALIZABLE$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsLocalizable");
    private static final javax.xml.namespace.QName SOURCETYPEMASK$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "SourceTypeMask");
    
    
    /**
     * Gets the "Format" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum getFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Format" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StringFormat xgetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().find_element_user(FORMAT$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Format" element
     */
    public boolean isNilFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().find_element_user(FORMAT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Format" element
     */
    public boolean isSetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMAT$0) != 0;
        }
    }
    
    /**
     * Sets the "Format" element
     */
    public void setFormat(com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMAT$0);
            }
            target.setEnumValue(format);
        }
    }
    
    /**
     * Sets (as xml) the "Format" element
     */
    public void xsetFormat(com.microsoft.schemas.xrm._2011.metadata.StringFormat format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().add_element_user(FORMAT$0);
            }
            target.set(format);
        }
    }
    
    /**
     * Nils the "Format" element
     */
    public void setNilFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().add_element_user(FORMAT$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Format" element
     */
    public void unsetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMAT$0, 0);
        }
    }
    
    /**
     * Gets the "ImeMode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum getImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMEMODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImeMode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ImeMode xgetImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().find_element_user(IMEMODE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ImeMode" element
     */
    public boolean isNilImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().find_element_user(IMEMODE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ImeMode" element
     */
    public boolean isSetImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMEMODE$2) != 0;
        }
    }
    
    /**
     * Sets the "ImeMode" element
     */
    public void setImeMode(com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum imeMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMEMODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMEMODE$2);
            }
            target.setEnumValue(imeMode);
        }
    }
    
    /**
     * Sets (as xml) the "ImeMode" element
     */
    public void xsetImeMode(com.microsoft.schemas.xrm._2011.metadata.ImeMode imeMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().find_element_user(IMEMODE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().add_element_user(IMEMODE$2);
            }
            target.set(imeMode);
        }
    }
    
    /**
     * Nils the "ImeMode" element
     */
    public void setNilImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().find_element_user(IMEMODE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().add_element_user(IMEMODE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ImeMode" element
     */
    public void unsetImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMEMODE$2, 0);
        }
    }
    
    /**
     * Gets the "MaxLength" element
     */
    public int getMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXLENGTH$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxLength" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXLENGTH$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "MaxLength" element
     */
    public boolean isNilMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXLENGTH$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "MaxLength" element
     */
    public boolean isSetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXLENGTH$4) != 0;
        }
    }
    
    /**
     * Sets the "MaxLength" element
     */
    public void setMaxLength(int maxLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXLENGTH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXLENGTH$4);
            }
            target.setIntValue(maxLength);
        }
    }
    
    /**
     * Sets (as xml) the "MaxLength" element
     */
    public void xsetMaxLength(org.apache.xmlbeans.XmlInt maxLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXLENGTH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXLENGTH$4);
            }
            target.set(maxLength);
        }
    }
    
    /**
     * Nils the "MaxLength" element
     */
    public void setNilMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXLENGTH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXLENGTH$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "MaxLength" element
     */
    public void unsetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXLENGTH$4, 0);
        }
    }
    
    /**
     * Gets the "YomiOf" element
     */
    public java.lang.String getYomiOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIOF$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "YomiOf" element
     */
    public org.apache.xmlbeans.XmlString xgetYomiOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIOF$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "YomiOf" element
     */
    public boolean isNilYomiOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIOF$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "YomiOf" element
     */
    public boolean isSetYomiOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(YOMIOF$6) != 0;
        }
    }
    
    /**
     * Sets the "YomiOf" element
     */
    public void setYomiOf(java.lang.String yomiOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIOF$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YOMIOF$6);
            }
            target.setStringValue(yomiOf);
        }
    }
    
    /**
     * Sets (as xml) the "YomiOf" element
     */
    public void xsetYomiOf(org.apache.xmlbeans.XmlString yomiOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIOF$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YOMIOF$6);
            }
            target.set(yomiOf);
        }
    }
    
    /**
     * Nils the "YomiOf" element
     */
    public void setNilYomiOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIOF$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YOMIOF$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "YomiOf" element
     */
    public void unsetYomiOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(YOMIOF$6, 0);
        }
    }
    
    /**
     * Gets the "FormatName" element
     */
    public com.microsoft.schemas.xrm._2013.metadata.StringFormatName getFormatName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.StringFormatName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.StringFormatName)get_store().find_element_user(FORMATNAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FormatName" element
     */
    public boolean isNilFormatName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.StringFormatName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.StringFormatName)get_store().find_element_user(FORMATNAME$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "FormatName" element
     */
    public boolean isSetFormatName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMATNAME$8) != 0;
        }
    }
    
    /**
     * Sets the "FormatName" element
     */
    public void setFormatName(com.microsoft.schemas.xrm._2013.metadata.StringFormatName formatName)
    {
        generatedSetterHelperImpl(formatName, FORMATNAME$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FormatName" element
     */
    public com.microsoft.schemas.xrm._2013.metadata.StringFormatName addNewFormatName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.StringFormatName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.StringFormatName)get_store().add_element_user(FORMATNAME$8);
            return target;
        }
    }
    
    /**
     * Nils the "FormatName" element
     */
    public void setNilFormatName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.StringFormatName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.StringFormatName)get_store().find_element_user(FORMATNAME$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2013.metadata.StringFormatName)get_store().add_element_user(FORMATNAME$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "FormatName" element
     */
    public void unsetFormatName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMATNAME$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMULADEFINITION$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$10, 0);
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
            return get_store().count_elements(FORMULADEFINITION$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMULADEFINITION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMULADEFINITION$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMULADEFINITION$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMULADEFINITION$10);
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
            get_store().remove_element(FORMULADEFINITION$10, 0);
        }
    }
    
    /**
     * Gets the "IsLocalizable" element
     */
    public boolean getIsLocalizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISLOCALIZABLE$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsLocalizable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsLocalizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISLOCALIZABLE$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsLocalizable" element
     */
    public boolean isNilIsLocalizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISLOCALIZABLE$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsLocalizable" element
     */
    public boolean isSetIsLocalizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISLOCALIZABLE$12) != 0;
        }
    }
    
    /**
     * Sets the "IsLocalizable" element
     */
    public void setIsLocalizable(boolean isLocalizable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISLOCALIZABLE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISLOCALIZABLE$12);
            }
            target.setBooleanValue(isLocalizable);
        }
    }
    
    /**
     * Sets (as xml) the "IsLocalizable" element
     */
    public void xsetIsLocalizable(org.apache.xmlbeans.XmlBoolean isLocalizable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISLOCALIZABLE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISLOCALIZABLE$12);
            }
            target.set(isLocalizable);
        }
    }
    
    /**
     * Nils the "IsLocalizable" element
     */
    public void setNilIsLocalizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISLOCALIZABLE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISLOCALIZABLE$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsLocalizable" element
     */
    public void unsetIsLocalizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISLOCALIZABLE$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETYPEMASK$14, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$14, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$14, 0);
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
            return get_store().count_elements(SOURCETYPEMASK$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETYPEMASK$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCETYPEMASK$14);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SOURCETYPEMASK$14);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SOURCETYPEMASK$14);
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
            get_store().remove_element(SOURCETYPEMASK$14, 0);
        }
    }
}
