/*
 * An XML document type.
 * Localname: unsignedLong
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/
 * Java type: com.microsoft.schemas._2003._10.serialization.UnsignedLongDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.impl;
/**
 * A document containing one unsignedLong(@http://schemas.microsoft.com/2003/10/Serialization/) element.
 *
 * This is a complex type.
 */
public class UnsignedLongDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.UnsignedLongDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnsignedLongDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSIGNEDLONG$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    
    
    /**
     * Gets the "unsignedLong" element
     */
    public java.math.BigInteger getUnsignedLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSIGNEDLONG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "unsignedLong" element
     */
    public org.apache.xmlbeans.XmlUnsignedLong xgetUnsignedLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_element_user(UNSIGNEDLONG$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "unsignedLong" element
     */
    public boolean isNilUnsignedLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_element_user(UNSIGNEDLONG$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "unsignedLong" element
     */
    public void setUnsignedLong(java.math.BigInteger unsignedLong)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSIGNEDLONG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNSIGNEDLONG$0);
            }
            target.setBigIntegerValue(unsignedLong);
        }
    }
    
    /**
     * Sets (as xml) the "unsignedLong" element
     */
    public void xsetUnsignedLong(org.apache.xmlbeans.XmlUnsignedLong unsignedLong)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_element_user(UNSIGNEDLONG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().add_element_user(UNSIGNEDLONG$0);
            }
            target.set(unsignedLong);
        }
    }
    
    /**
     * Nils the "unsignedLong" element
     */
    public void setNilUnsignedLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_element_user(UNSIGNEDLONG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().add_element_user(UNSIGNEDLONG$0);
            }
            target.setNil();
        }
    }
}
