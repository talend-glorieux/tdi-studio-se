/*
 * An XML document type.
 * Localname: unsignedShort
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/
 * Java type: com.microsoft.schemas._2003._10.serialization.UnsignedShortDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.impl;
/**
 * A document containing one unsignedShort(@http://schemas.microsoft.com/2003/10/Serialization/) element.
 *
 * This is a complex type.
 */
public class UnsignedShortDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.UnsignedShortDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnsignedShortDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSIGNEDSHORT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    
    
    /**
     * Gets the "unsignedShort" element
     */
    public int getUnsignedShort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSIGNEDSHORT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "unsignedShort" element
     */
    public org.apache.xmlbeans.XmlUnsignedShort xgetUnsignedShort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(UNSIGNEDSHORT$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "unsignedShort" element
     */
    public boolean isNilUnsignedShort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(UNSIGNEDSHORT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "unsignedShort" element
     */
    public void setUnsignedShort(int unsignedShort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSIGNEDSHORT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNSIGNEDSHORT$0);
            }
            target.setIntValue(unsignedShort);
        }
    }
    
    /**
     * Sets (as xml) the "unsignedShort" element
     */
    public void xsetUnsignedShort(org.apache.xmlbeans.XmlUnsignedShort unsignedShort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(UNSIGNEDSHORT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_element_user(UNSIGNEDSHORT$0);
            }
            target.set(unsignedShort);
        }
    }
    
    /**
     * Nils the "unsignedShort" element
     */
    public void setNilUnsignedShort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(UNSIGNEDSHORT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_element_user(UNSIGNEDSHORT$0);
            }
            target.setNil();
        }
    }
}
