/*
 * An XML document type.
 * Localname: char
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/
 * Java type: com.microsoft.schemas._2003._10.serialization.CharDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.impl;
/**
 * A document containing one char(@http://schemas.microsoft.com/2003/10/Serialization/) element.
 *
 * This is a complex type.
 */
public class CharDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.CharDocument
{
    private static final long serialVersionUID = 1L;
    
    public CharDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHAR$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    
    
    /**
     * Gets the "char" element
     */
    public int getChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHAR$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "char" element
     */
    public com.microsoft.schemas._2003._10.serialization.Char xgetChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Char target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Char)get_store().find_element_user(CHAR$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "char" element
     */
    public boolean isNilChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Char target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Char)get_store().find_element_user(CHAR$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "char" element
     */
    public void setChar(int xchar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHAR$0);
            }
            target.setIntValue(xchar);
        }
    }
    
    /**
     * Sets (as xml) the "char" element
     */
    public void xsetChar(com.microsoft.schemas._2003._10.serialization.Char xchar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Char target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Char)get_store().find_element_user(CHAR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Char)get_store().add_element_user(CHAR$0);
            }
            target.set(xchar);
        }
    }
    
    /**
     * Nils the "char" element
     */
    public void setNilChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Char target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Char)get_store().find_element_user(CHAR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Char)get_store().add_element_user(CHAR$0);
            }
            target.setNil();
        }
    }
}
