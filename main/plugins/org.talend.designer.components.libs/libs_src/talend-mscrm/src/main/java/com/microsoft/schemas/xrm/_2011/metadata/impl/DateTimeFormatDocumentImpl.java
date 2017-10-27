/*
 * An XML document type.
 * Localname: DateTimeFormat
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.DateTimeFormatDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one DateTimeFormat(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class DateTimeFormatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.DateTimeFormatDocument
{
    private static final long serialVersionUID = 1L;
    
    public DateTimeFormatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATETIMEFORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "DateTimeFormat");
    
    
    /**
     * Gets the "DateTimeFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat.Enum getDateTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIMEFORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DateTimeFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat xgetDateTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat)get_store().find_element_user(DATETIMEFORMAT$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DateTimeFormat" element
     */
    public boolean isNilDateTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat)get_store().find_element_user(DATETIMEFORMAT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DateTimeFormat" element
     */
    public void setDateTimeFormat(com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat.Enum dateTimeFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIMEFORMAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATETIMEFORMAT$0);
            }
            target.setEnumValue(dateTimeFormat);
        }
    }
    
    /**
     * Sets (as xml) the "DateTimeFormat" element
     */
    public void xsetDateTimeFormat(com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat dateTimeFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat)get_store().find_element_user(DATETIMEFORMAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat)get_store().add_element_user(DATETIMEFORMAT$0);
            }
            target.set(dateTimeFormat);
        }
    }
    
    /**
     * Nils the "DateTimeFormat" element
     */
    public void setNilDateTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat)get_store().find_element_user(DATETIMEFORMAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat)get_store().add_element_user(DATETIMEFORMAT$0);
            }
            target.setNil();
        }
    }
}
