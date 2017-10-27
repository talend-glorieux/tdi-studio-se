/*
 * An XML document type.
 * Localname: ArrayOfIntegerFormat
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfIntegerFormatDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfIntegerFormat(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfIntegerFormatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfIntegerFormatDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfIntegerFormatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFINTEGERFORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfIntegerFormat");
    
    
    /**
     * Gets the "ArrayOfIntegerFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfIntegerFormat getArrayOfIntegerFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfIntegerFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfIntegerFormat)get_store().find_element_user(ARRAYOFINTEGERFORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfIntegerFormat" element
     */
    public boolean isNilArrayOfIntegerFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfIntegerFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfIntegerFormat)get_store().find_element_user(ARRAYOFINTEGERFORMAT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfIntegerFormat" element
     */
    public void setArrayOfIntegerFormat(com.microsoft.schemas.xrm._2011.metadata.ArrayOfIntegerFormat arrayOfIntegerFormat)
    {
        generatedSetterHelperImpl(arrayOfIntegerFormat, ARRAYOFINTEGERFORMAT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfIntegerFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfIntegerFormat addNewArrayOfIntegerFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfIntegerFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfIntegerFormat)get_store().add_element_user(ARRAYOFINTEGERFORMAT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfIntegerFormat" element
     */
    public void setNilArrayOfIntegerFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfIntegerFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfIntegerFormat)get_store().find_element_user(ARRAYOFINTEGERFORMAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfIntegerFormat)get_store().add_element_user(ARRAYOFINTEGERFORMAT$0);
            }
            target.setNil();
        }
    }
}
