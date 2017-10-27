/*
 * An XML document type.
 * Localname: ArrayOfDateTimeFormat
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfDateTimeFormatDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfDateTimeFormat(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfDateTimeFormatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfDateTimeFormatDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfDateTimeFormatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFDATETIMEFORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfDateTimeFormat");
    
    
    /**
     * Gets the "ArrayOfDateTimeFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfDateTimeFormat getArrayOfDateTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfDateTimeFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfDateTimeFormat)get_store().find_element_user(ARRAYOFDATETIMEFORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfDateTimeFormat" element
     */
    public boolean isNilArrayOfDateTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfDateTimeFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfDateTimeFormat)get_store().find_element_user(ARRAYOFDATETIMEFORMAT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfDateTimeFormat" element
     */
    public void setArrayOfDateTimeFormat(com.microsoft.schemas.xrm._2011.metadata.ArrayOfDateTimeFormat arrayOfDateTimeFormat)
    {
        generatedSetterHelperImpl(arrayOfDateTimeFormat, ARRAYOFDATETIMEFORMAT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfDateTimeFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfDateTimeFormat addNewArrayOfDateTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfDateTimeFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfDateTimeFormat)get_store().add_element_user(ARRAYOFDATETIMEFORMAT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfDateTimeFormat" element
     */
    public void setNilArrayOfDateTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfDateTimeFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfDateTimeFormat)get_store().find_element_user(ARRAYOFDATETIMEFORMAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfDateTimeFormat)get_store().add_element_user(ARRAYOFDATETIMEFORMAT$0);
            }
            target.setNil();
        }
    }
}
