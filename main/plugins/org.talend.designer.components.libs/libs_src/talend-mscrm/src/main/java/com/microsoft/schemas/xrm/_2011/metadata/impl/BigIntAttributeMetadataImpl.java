/*
 * XML Type:  BigIntAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.BigIntAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML BigIntAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class BigIntAttributeMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.AttributeMetadataImpl implements com.microsoft.schemas.xrm._2011.metadata.BigIntAttributeMetadata
{
    private static final long serialVersionUID = 1L;
    
    public BigIntAttributeMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXVALUE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "MaxValue");
    private static final javax.xml.namespace.QName MINVALUE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "MinValue");
    
    
    /**
     * Gets the "MaxValue" element
     */
    public long getMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXVALUE$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxValue" element
     */
    public org.apache.xmlbeans.XmlLong xgetMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MAXVALUE$0, 0);
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
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MAXVALUE$0, 0);
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
            return get_store().count_elements(MAXVALUE$0) != 0;
        }
    }
    
    /**
     * Sets the "MaxValue" element
     */
    public void setMaxValue(long maxValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXVALUE$0);
            }
            target.setLongValue(maxValue);
        }
    }
    
    /**
     * Sets (as xml) the "MaxValue" element
     */
    public void xsetMaxValue(org.apache.xmlbeans.XmlLong maxValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MAXVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(MAXVALUE$0);
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
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MAXVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(MAXVALUE$0);
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
            get_store().remove_element(MAXVALUE$0, 0);
        }
    }
    
    /**
     * Gets the "MinValue" element
     */
    public long getMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINVALUE$2, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinValue" element
     */
    public org.apache.xmlbeans.XmlLong xgetMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MINVALUE$2, 0);
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
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MINVALUE$2, 0);
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
            return get_store().count_elements(MINVALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "MinValue" element
     */
    public void setMinValue(long minValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINVALUE$2);
            }
            target.setLongValue(minValue);
        }
    }
    
    /**
     * Sets (as xml) the "MinValue" element
     */
    public void xsetMinValue(org.apache.xmlbeans.XmlLong minValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MINVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(MINVALUE$2);
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
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MINVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(MINVALUE$2);
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
            get_store().remove_element(MINVALUE$2, 0);
        }
    }
}
