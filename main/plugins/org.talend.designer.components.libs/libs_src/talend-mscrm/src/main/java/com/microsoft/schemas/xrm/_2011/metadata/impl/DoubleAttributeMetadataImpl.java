/*
 * XML Type:  DoubleAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML DoubleAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class DoubleAttributeMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.AttributeMetadataImpl implements com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata
{
    private static final long serialVersionUID = 1L;
    
    public DoubleAttributeMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMEMODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ImeMode");
    private static final javax.xml.namespace.QName MAXVALUE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "MaxValue");
    private static final javax.xml.namespace.QName MINVALUE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "MinValue");
    private static final javax.xml.namespace.QName PRECISION$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Precision");
    
    
    /**
     * Gets the "ImeMode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum getImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMEMODE$0, 0);
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
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().find_element_user(IMEMODE$0, 0);
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
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().find_element_user(IMEMODE$0, 0);
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
            return get_store().count_elements(IMEMODE$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMEMODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMEMODE$0);
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
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().find_element_user(IMEMODE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().add_element_user(IMEMODE$0);
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
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().find_element_user(IMEMODE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().add_element_user(IMEMODE$0);
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
            get_store().remove_element(IMEMODE$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXVALUE$2, 0);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAXVALUE$2, 0);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAXVALUE$2, 0);
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
    public void setMaxValue(double maxValue)
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAXVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MAXVALUE$2);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAXVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MAXVALUE$2);
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
    public double getMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINVALUE$4, 0);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINVALUE$4, 0);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINVALUE$4, 0);
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
    public void setMinValue(double minValue)
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINVALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MINVALUE$4);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINVALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MINVALUE$4);
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
     * Gets the "Precision" element
     */
    public int getPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECISION$6, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRECISION$6, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRECISION$6, 0);
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
            return get_store().count_elements(PRECISION$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECISION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRECISION$6);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRECISION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PRECISION$6);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRECISION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PRECISION$6);
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
            get_store().remove_element(PRECISION$6, 0);
        }
    }
}
