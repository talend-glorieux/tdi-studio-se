/*
 * An XML document type.
 * Localname: StringFormat
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.StringFormatDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one StringFormat(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class StringFormatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.StringFormatDocument
{
    private static final long serialVersionUID = 1L;
    
    public StringFormatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRINGFORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "StringFormat");
    
    
    /**
     * Gets the "StringFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum getStringFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGFORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "StringFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StringFormat xgetStringFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().find_element_user(STRINGFORMAT$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "StringFormat" element
     */
    public boolean isNilStringFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().find_element_user(STRINGFORMAT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "StringFormat" element
     */
    public void setStringFormat(com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum stringFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGFORMAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRINGFORMAT$0);
            }
            target.setEnumValue(stringFormat);
        }
    }
    
    /**
     * Sets (as xml) the "StringFormat" element
     */
    public void xsetStringFormat(com.microsoft.schemas.xrm._2011.metadata.StringFormat stringFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().find_element_user(STRINGFORMAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().add_element_user(STRINGFORMAT$0);
            }
            target.set(stringFormat);
        }
    }
    
    /**
     * Nils the "StringFormat" element
     */
    public void setNilStringFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().find_element_user(STRINGFORMAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().add_element_user(STRINGFORMAT$0);
            }
            target.setNil();
        }
    }
}
