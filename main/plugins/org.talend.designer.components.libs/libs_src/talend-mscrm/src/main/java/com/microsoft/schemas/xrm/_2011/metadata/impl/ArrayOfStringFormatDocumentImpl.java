/*
 * An XML document type.
 * Localname: ArrayOfStringFormat
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfStringFormatDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfStringFormat(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfStringFormatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfStringFormatDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfStringFormatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSTRINGFORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfStringFormat");
    
    
    /**
     * Gets the "ArrayOfStringFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfStringFormat getArrayOfStringFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfStringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfStringFormat)get_store().find_element_user(ARRAYOFSTRINGFORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfStringFormat" element
     */
    public boolean isNilArrayOfStringFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfStringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfStringFormat)get_store().find_element_user(ARRAYOFSTRINGFORMAT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfStringFormat" element
     */
    public void setArrayOfStringFormat(com.microsoft.schemas.xrm._2011.metadata.ArrayOfStringFormat arrayOfStringFormat)
    {
        generatedSetterHelperImpl(arrayOfStringFormat, ARRAYOFSTRINGFORMAT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfStringFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfStringFormat addNewArrayOfStringFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfStringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfStringFormat)get_store().add_element_user(ARRAYOFSTRINGFORMAT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfStringFormat" element
     */
    public void setNilArrayOfStringFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfStringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfStringFormat)get_store().find_element_user(ARRAYOFSTRINGFORMAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfStringFormat)get_store().add_element_user(ARRAYOFSTRINGFORMAT$0);
            }
            target.setNil();
        }
    }
}
