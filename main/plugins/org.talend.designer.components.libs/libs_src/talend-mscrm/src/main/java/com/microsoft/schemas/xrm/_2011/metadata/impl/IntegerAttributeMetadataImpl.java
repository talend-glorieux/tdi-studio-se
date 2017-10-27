/*
 * XML Type:  IntegerAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML IntegerAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class IntegerAttributeMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.AttributeMetadataImpl implements com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata
{
    private static final long serialVersionUID = 1L;
    
    public IntegerAttributeMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Format");
    private static final javax.xml.namespace.QName MAXVALUE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "MaxValue");
    private static final javax.xml.namespace.QName MINVALUE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "MinValue");
    private static final javax.xml.namespace.QName FORMULADEFINITION$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "FormulaDefinition");
    private static final javax.xml.namespace.QName SOURCETYPEMASK$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "SourceTypeMask");
    
    
    /**
     * Gets the "Format" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.IntegerFormat.Enum getFormat()
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
            return (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Format" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.IntegerFormat xgetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.IntegerFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat)get_store().find_element_user(FORMAT$0, 0);
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
            com.microsoft.schemas.xrm._2011.metadata.IntegerFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat)get_store().find_element_user(FORMAT$0, 0);
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
    public void setFormat(com.microsoft.schemas.xrm._2011.metadata.IntegerFormat.Enum format)
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
    public void xsetFormat(com.microsoft.schemas.xrm._2011.metadata.IntegerFormat format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.IntegerFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat)get_store().add_element_user(FORMAT$0);
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
            com.microsoft.schemas.xrm._2011.metadata.IntegerFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat)get_store().add_element_user(FORMAT$0);
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
     * Gets the "MaxValue" element
     */
    public int getMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXVALUE$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxValue" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXVALUE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "MaxValue" element
     */
    public boolean isNilMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXVALUE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "MaxValue" element
     */
    public boolean isSetMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXVALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "MaxValue" element
     */
    public void setMaxValue(int maxValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXVALUE$2);
            }
            target.setIntValue(maxValue);
        }
    }
    
    /**
     * Sets (as xml) the "MaxValue" element
     */
    public void xsetMaxValue(org.apache.xmlbeans.XmlInt maxValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXVALUE$2);
            }
            target.set(maxValue);
        }
    }
    
    /**
     * Nils the "MaxValue" element
     */
    public void setNilMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXVALUE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "MaxValue" element
     */
    public void unsetMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXVALUE$2, 0);
        }
    }
    
    /**
     * Gets the "MinValue" element
     */
    public int getMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINVALUE$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinValue" element
     */
    public org.apache.xmlbeans.XmlInt xgetMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINVALUE$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "MinValue" element
     */
    public boolean isNilMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINVALUE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "MinValue" element
     */
    public boolean isSetMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINVALUE$4) != 0;
        }
    }
    
    /**
     * Sets the "MinValue" element
     */
    public void setMinValue(int minValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINVALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINVALUE$4);
            }
            target.setIntValue(minValue);
        }
    }
    
    /**
     * Sets (as xml) the "MinValue" element
     */
    public void xsetMinValue(org.apache.xmlbeans.XmlInt minValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINVALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MINVALUE$4);
            }
            target.set(minValue);
        }
    }
    
    /**
     * Nils the "MinValue" element
     */
    public void setNilMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINVALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MINVALUE$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "MinValue" element
     */
    public void unsetMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINVALUE$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMULADEFINITION$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$6, 0);
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
            return get_store().count_elements(FORMULADEFINITION$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMULADEFINITION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMULADEFINITION$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMULADEFINITION$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMULADEFINITION$6);
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
            get_store().remove_element(FORMULADEFINITION$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETYPEMASK$8, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$8, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$8, 0);
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
            return get_store().count_elements(SOURCETYPEMASK$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETYPEMASK$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCETYPEMASK$8);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SOURCETYPEMASK$8);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SOURCETYPEMASK$8);
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
            get_store().remove_element(SOURCETYPEMASK$8, 0);
        }
    }
}
