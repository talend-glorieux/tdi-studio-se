/*
 * An XML document type.
 * Localname: unsignedInt
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/
 * Java type: com.microsoft.schemas._2003._10.serialization.UnsignedIntDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.impl;
/**
 * A document containing one unsignedInt(@http://schemas.microsoft.com/2003/10/Serialization/) element.
 *
 * This is a complex type.
 */
public class UnsignedIntDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.UnsignedIntDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnsignedIntDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSIGNEDINT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    
    
    /**
     * Gets the "unsignedInt" element
     */
    public long getUnsignedInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSIGNEDINT$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "unsignedInt" element
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetUnsignedInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(UNSIGNEDINT$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "unsignedInt" element
     */
    public boolean isNilUnsignedInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(UNSIGNEDINT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "unsignedInt" element
     */
    public void setUnsignedInt(long unsignedInt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSIGNEDINT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNSIGNEDINT$0);
            }
            target.setLongValue(unsignedInt);
        }
    }
    
    /**
     * Sets (as xml) the "unsignedInt" element
     */
    public void xsetUnsignedInt(org.apache.xmlbeans.XmlUnsignedInt unsignedInt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(UNSIGNEDINT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(UNSIGNEDINT$0);
            }
            target.set(unsignedInt);
        }
    }
    
    /**
     * Nils the "unsignedInt" element
     */
    public void setNilUnsignedInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(UNSIGNEDINT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(UNSIGNEDINT$0);
            }
            target.setNil();
        }
    }
}
