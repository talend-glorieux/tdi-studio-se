/*
 * An XML document type.
 * Localname: ArrayOfArrayOfstring
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfArrayOfstringDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * A document containing one ArrayOfArrayOfstring(@http://schemas.microsoft.com/2003/10/Serialization/Arrays) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfstringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfArrayOfstringDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfstringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFSTRING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfArrayOfstring");
    
    
    /**
     * Gets the "ArrayOfArrayOfstring" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfArrayOfstring getArrayOfArrayOfstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfArrayOfstring)get_store().find_element_user(ARRAYOFARRAYOFSTRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfstring" element
     */
    public boolean isNilArrayOfArrayOfstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfArrayOfstring)get_store().find_element_user(ARRAYOFARRAYOFSTRING$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfstring" element
     */
    public void setArrayOfArrayOfstring(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfArrayOfstring arrayOfArrayOfstring)
    {
        generatedSetterHelperImpl(arrayOfArrayOfstring, ARRAYOFARRAYOFSTRING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfstring" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfArrayOfstring addNewArrayOfArrayOfstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfArrayOfstring)get_store().add_element_user(ARRAYOFARRAYOFSTRING$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfstring" element
     */
    public void setNilArrayOfArrayOfstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfArrayOfstring)get_store().find_element_user(ARRAYOFARRAYOFSTRING$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfArrayOfstring)get_store().add_element_user(ARRAYOFARRAYOFSTRING$0);
            }
            target.setNil();
        }
    }
}
