/*
 * An XML document type.
 * Localname: base64Binary
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/
 * Java type: com.microsoft.schemas._2003._10.serialization.Base64BinaryDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.impl;
/**
 * A document containing one base64Binary(@http://schemas.microsoft.com/2003/10/Serialization/) element.
 *
 * This is a complex type.
 */
public class Base64BinaryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.Base64BinaryDocument
{
    private static final long serialVersionUID = 1L;
    
    public Base64BinaryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASE64BINARY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    
    
    /**
     * Gets the "base64Binary" element
     */
    public byte[] getBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASE64BINARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "base64Binary" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(BASE64BINARY$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "base64Binary" element
     */
    public boolean isNilBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(BASE64BINARY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "base64Binary" element
     */
    public void setBase64Binary(byte[] base64Binary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASE64BINARY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BASE64BINARY$0);
            }
            target.setByteArrayValue(base64Binary);
        }
    }
    
    /**
     * Sets (as xml) the "base64Binary" element
     */
    public void xsetBase64Binary(org.apache.xmlbeans.XmlBase64Binary base64Binary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(BASE64BINARY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(BASE64BINARY$0);
            }
            target.set(base64Binary);
        }
    }
    
    /**
     * Nils the "base64Binary" element
     */
    public void setNilBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(BASE64BINARY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(BASE64BINARY$0);
            }
            target.setNil();
        }
    }
}
