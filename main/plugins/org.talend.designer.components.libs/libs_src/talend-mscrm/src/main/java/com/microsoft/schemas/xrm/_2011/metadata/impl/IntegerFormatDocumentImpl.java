/*
 * An XML document type.
 * Localname: IntegerFormat
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.IntegerFormatDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one IntegerFormat(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class IntegerFormatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.IntegerFormatDocument
{
    private static final long serialVersionUID = 1L;
    
    public IntegerFormatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTEGERFORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IntegerFormat");
    
    
    /**
     * Gets the "IntegerFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.IntegerFormat.Enum getIntegerFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERFORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "IntegerFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.IntegerFormat xgetIntegerFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.IntegerFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat)get_store().find_element_user(INTEGERFORMAT$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IntegerFormat" element
     */
    public boolean isNilIntegerFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.IntegerFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat)get_store().find_element_user(INTEGERFORMAT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "IntegerFormat" element
     */
    public void setIntegerFormat(com.microsoft.schemas.xrm._2011.metadata.IntegerFormat.Enum integerFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERFORMAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTEGERFORMAT$0);
            }
            target.setEnumValue(integerFormat);
        }
    }
    
    /**
     * Sets (as xml) the "IntegerFormat" element
     */
    public void xsetIntegerFormat(com.microsoft.schemas.xrm._2011.metadata.IntegerFormat integerFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.IntegerFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat)get_store().find_element_user(INTEGERFORMAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat)get_store().add_element_user(INTEGERFORMAT$0);
            }
            target.set(integerFormat);
        }
    }
    
    /**
     * Nils the "IntegerFormat" element
     */
    public void setNilIntegerFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.IntegerFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat)get_store().find_element_user(INTEGERFORMAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat)get_store().add_element_user(INTEGERFORMAT$0);
            }
            target.setNil();
        }
    }
}
