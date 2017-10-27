/*
 * XML Type:  MoneyAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.MoneyAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML MoneyAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class MoneyAttributeMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.AttributeMetadataImpl implements com.microsoft.schemas.xrm._2011.metadata.MoneyAttributeMetadata
{
    private static final long serialVersionUID = 1L;
    
    public MoneyAttributeMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALCULATIONOF$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CalculationOf");
    private static final javax.xml.namespace.QName IMEMODE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ImeMode");
    private static final javax.xml.namespace.QName MAXVALUE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "MaxValue");
    private static final javax.xml.namespace.QName MINVALUE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "MinValue");
    private static final javax.xml.namespace.QName PRECISION$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Precision");
    private static final javax.xml.namespace.QName PRECISIONSOURCE$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "PrecisionSource");
    private static final javax.xml.namespace.QName FORMULADEFINITION$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "FormulaDefinition");
    private static final javax.xml.namespace.QName ISBASECURRENCY$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsBaseCurrency");
    private static final javax.xml.namespace.QName SOURCETYPEMASK$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "SourceTypeMask");
    
    
    /**
     * Gets the "CalculationOf" element
     */
    public java.lang.String getCalculationOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALCULATIONOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CalculationOf" element
     */
    public org.apache.xmlbeans.XmlString xgetCalculationOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALCULATIONOF$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CalculationOf" element
     */
    public boolean isNilCalculationOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALCULATIONOF$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CalculationOf" element
     */
    public boolean isSetCalculationOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALCULATIONOF$0) != 0;
        }
    }
    
    /**
     * Sets the "CalculationOf" element
     */
    public void setCalculationOf(java.lang.String calculationOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALCULATIONOF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALCULATIONOF$0);
            }
            target.setStringValue(calculationOf);
        }
    }
    
    /**
     * Sets (as xml) the "CalculationOf" element
     */
    public void xsetCalculationOf(org.apache.xmlbeans.XmlString calculationOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALCULATIONOF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CALCULATIONOF$0);
            }
            target.set(calculationOf);
        }
    }
    
    /**
     * Nils the "CalculationOf" element
     */
    public void setNilCalculationOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALCULATIONOF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CALCULATIONOF$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CalculationOf" element
     */
    public void unsetCalculationOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALCULATIONOF$0, 0);
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
     * Gets the "MaxValue" element
     */
    public double getMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXVALUE$4, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxValue" element
     */
    public org.apache.xmlbeans.XmlDouble xgetMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAXVALUE$4, 0);
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
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAXVALUE$4, 0);
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
            return get_store().count_elements(MAXVALUE$4) != 0;
        }
    }
    
    /**
     * Sets the "MaxValue" element
     */
    public void setMaxValue(double maxValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXVALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXVALUE$4);
            }
            target.setDoubleValue(maxValue);
        }
    }
    
    /**
     * Sets (as xml) the "MaxValue" element
     */
    public void xsetMaxValue(org.apache.xmlbeans.XmlDouble maxValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAXVALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MAXVALUE$4);
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
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAXVALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MAXVALUE$4);
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
            get_store().remove_element(MAXVALUE$4, 0);
        }
    }
    
    /**
     * Gets the "MinValue" element
     */
    public double getMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINVALUE$6, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinValue" element
     */
    public org.apache.xmlbeans.XmlDouble xgetMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINVALUE$6, 0);
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
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINVALUE$6, 0);
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
            return get_store().count_elements(MINVALUE$6) != 0;
        }
    }
    
    /**
     * Sets the "MinValue" element
     */
    public void setMinValue(double minValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINVALUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINVALUE$6);
            }
            target.setDoubleValue(minValue);
        }
    }
    
    /**
     * Sets (as xml) the "MinValue" element
     */
    public void xsetMinValue(org.apache.xmlbeans.XmlDouble minValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINVALUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MINVALUE$6);
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
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINVALUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MINVALUE$6);
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
            get_store().remove_element(MINVALUE$6, 0);
        }
    }
    
    /**
     * Gets the "Precision" element
     */
    public int getPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECISION$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Precision" element
     */
    public org.apache.xmlbeans.XmlInt xgetPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRECISION$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Precision" element
     */
    public boolean isNilPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRECISION$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Precision" element
     */
    public boolean isSetPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRECISION$8) != 0;
        }
    }
    
    /**
     * Sets the "Precision" element
     */
    public void setPrecision(int precision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECISION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRECISION$8);
            }
            target.setIntValue(precision);
        }
    }
    
    /**
     * Sets (as xml) the "Precision" element
     */
    public void xsetPrecision(org.apache.xmlbeans.XmlInt precision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRECISION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PRECISION$8);
            }
            target.set(precision);
        }
    }
    
    /**
     * Nils the "Precision" element
     */
    public void setNilPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRECISION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PRECISION$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Precision" element
     */
    public void unsetPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRECISION$8, 0);
        }
    }
    
    /**
     * Gets the "PrecisionSource" element
     */
    public int getPrecisionSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECISIONSOURCE$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrecisionSource" element
     */
    public org.apache.xmlbeans.XmlInt xgetPrecisionSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRECISIONSOURCE$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PrecisionSource" element
     */
    public boolean isNilPrecisionSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRECISIONSOURCE$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PrecisionSource" element
     */
    public boolean isSetPrecisionSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRECISIONSOURCE$10) != 0;
        }
    }
    
    /**
     * Sets the "PrecisionSource" element
     */
    public void setPrecisionSource(int precisionSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECISIONSOURCE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRECISIONSOURCE$10);
            }
            target.setIntValue(precisionSource);
        }
    }
    
    /**
     * Sets (as xml) the "PrecisionSource" element
     */
    public void xsetPrecisionSource(org.apache.xmlbeans.XmlInt precisionSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRECISIONSOURCE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PRECISIONSOURCE$10);
            }
            target.set(precisionSource);
        }
    }
    
    /**
     * Nils the "PrecisionSource" element
     */
    public void setNilPrecisionSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRECISIONSOURCE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PRECISIONSOURCE$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PrecisionSource" element
     */
    public void unsetPrecisionSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRECISIONSOURCE$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMULADEFINITION$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$12, 0);
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
            return get_store().count_elements(FORMULADEFINITION$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMULADEFINITION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMULADEFINITION$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMULADEFINITION$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMULADEFINITION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMULADEFINITION$12);
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
            get_store().remove_element(FORMULADEFINITION$12, 0);
        }
    }
    
    /**
     * Gets the "IsBaseCurrency" element
     */
    public boolean getIsBaseCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISBASECURRENCY$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsBaseCurrency" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsBaseCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISBASECURRENCY$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsBaseCurrency" element
     */
    public boolean isNilIsBaseCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISBASECURRENCY$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsBaseCurrency" element
     */
    public boolean isSetIsBaseCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISBASECURRENCY$14) != 0;
        }
    }
    
    /**
     * Sets the "IsBaseCurrency" element
     */
    public void setIsBaseCurrency(boolean isBaseCurrency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISBASECURRENCY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISBASECURRENCY$14);
            }
            target.setBooleanValue(isBaseCurrency);
        }
    }
    
    /**
     * Sets (as xml) the "IsBaseCurrency" element
     */
    public void xsetIsBaseCurrency(org.apache.xmlbeans.XmlBoolean isBaseCurrency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISBASECURRENCY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISBASECURRENCY$14);
            }
            target.set(isBaseCurrency);
        }
    }
    
    /**
     * Nils the "IsBaseCurrency" element
     */
    public void setNilIsBaseCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISBASECURRENCY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISBASECURRENCY$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsBaseCurrency" element
     */
    public void unsetIsBaseCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISBASECURRENCY$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETYPEMASK$16, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$16, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$16, 0);
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
            return get_store().count_elements(SOURCETYPEMASK$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETYPEMASK$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCETYPEMASK$16);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SOURCETYPEMASK$16);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPEMASK$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SOURCETYPEMASK$16);
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
            get_store().remove_element(SOURCETYPEMASK$16, 0);
        }
    }
}
