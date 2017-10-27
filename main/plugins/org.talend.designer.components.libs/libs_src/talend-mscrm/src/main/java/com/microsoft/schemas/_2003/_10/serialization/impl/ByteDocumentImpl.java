/*
 * An XML document type.
 * Localname: byte
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/
 * Java type: com.microsoft.schemas._2003._10.serialization.ByteDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.impl;
/**
 * A document containing one byte(@http://schemas.microsoft.com/2003/10/Serialization/) element.
 *
 * This is a complex type.
 */
public class ByteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.ByteDocument
{
    private static final long serialVersionUID = 1L;
    
    public ByteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BYTE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    
    
    /**
     * Gets the "byte" element
     */
    public byte getByte()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BYTE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getByteValue();
        }
    }
    
    /**
     * Gets (as xml) the "byte" element
     */
    public org.apache.xmlbeans.XmlByte xgetByte()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(BYTE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "byte" element
     */
    public boolean isNilByte()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(BYTE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "byte" element
     */
    public void setByte(byte xbyte)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BYTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BYTE$0);
            }
            target.setByteValue(xbyte);
        }
    }
    
    /**
     * Sets (as xml) the "byte" element
     */
    public void xsetByte(org.apache.xmlbeans.XmlByte xbyte)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(BYTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlByte)get_store().add_element_user(BYTE$0);
            }
            target.set(xbyte);
        }
    }
    
    /**
     * Nils the "byte" element
     */
    public void setNilByte()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(BYTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlByte)get_store().add_element_user(BYTE$0);
            }
            target.setNil();
        }
    }
}
