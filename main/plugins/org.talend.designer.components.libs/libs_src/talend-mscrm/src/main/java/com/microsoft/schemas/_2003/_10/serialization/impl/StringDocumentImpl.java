/*
 * An XML document type.
 * Localname: string
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/
 * Java type: com.microsoft.schemas._2003._10.serialization.StringDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.impl;
/**
 * A document containing one string(@http://schemas.microsoft.com/2003/10/Serialization/) element.
 *
 * This is a complex type.
 */
public class StringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.StringDocument
{
    private static final long serialVersionUID = 1L;
    
    public StringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    
    
    /**
     * Gets the "string" element
     */
    public java.lang.String getString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "string" element
     */
    public org.apache.xmlbeans.XmlString xgetString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRING$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "string" element
     */
    public boolean isNilString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRING$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "string" element
     */
    public void setString(java.lang.String string)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRING$0);
            }
            target.setStringValue(string);
        }
    }
    
    /**
     * Sets (as xml) the "string" element
     */
    public void xsetString(org.apache.xmlbeans.XmlString string)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRING$0);
            }
            target.set(string);
        }
    }
    
    /**
     * Nils the "string" element
     */
    public void setNilString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRING$0);
            }
            target.setNil();
        }
    }
}
