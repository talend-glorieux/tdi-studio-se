/*
 * An XML document type.
 * Localname: unsignedByte
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/
 * Java type: com.microsoft.schemas._2003._10.serialization.UnsignedByteDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.impl;
/**
 * A document containing one unsignedByte(@http://schemas.microsoft.com/2003/10/Serialization/) element.
 *
 * This is a complex type.
 */
public class UnsignedByteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.UnsignedByteDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnsignedByteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSIGNEDBYTE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    
    
    /**
     * Gets the "unsignedByte" element
     */
    public short getUnsignedByte()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSIGNEDBYTE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "unsignedByte" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetUnsignedByte()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(UNSIGNEDBYTE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "unsignedByte" element
     */
    public boolean isNilUnsignedByte()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(UNSIGNEDBYTE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "unsignedByte" element
     */
    public void setUnsignedByte(short unsignedByte)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSIGNEDBYTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNSIGNEDBYTE$0);
            }
            target.setShortValue(unsignedByte);
        }
    }
    
    /**
     * Sets (as xml) the "unsignedByte" element
     */
    public void xsetUnsignedByte(org.apache.xmlbeans.XmlUnsignedByte unsignedByte)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(UNSIGNEDBYTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(UNSIGNEDBYTE$0);
            }
            target.set(unsignedByte);
        }
    }
    
    /**
     * Nils the "unsignedByte" element
     */
    public void setNilUnsignedByte()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(UNSIGNEDBYTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(UNSIGNEDBYTE$0);
            }
            target.setNil();
        }
    }
}
