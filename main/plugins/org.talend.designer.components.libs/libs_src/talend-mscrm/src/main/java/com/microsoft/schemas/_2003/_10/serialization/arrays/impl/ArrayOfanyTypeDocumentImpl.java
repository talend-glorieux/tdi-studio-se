/*
 * An XML document type.
 * Localname: ArrayOfanyType
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * A document containing one ArrayOfanyType(@http://schemas.microsoft.com/2003/10/Serialization/Arrays) element.
 *
 * This is a complex type.
 */
public class ArrayOfanyTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfanyTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFANYTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfanyType");
    
    
    /**
     * Gets the "ArrayOfanyType" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType getArrayOfanyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType)get_store().find_element_user(ARRAYOFANYTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfanyType" element
     */
    public boolean isNilArrayOfanyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType)get_store().find_element_user(ARRAYOFANYTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfanyType" element
     */
    public void setArrayOfanyType(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType arrayOfanyType)
    {
        generatedSetterHelperImpl(arrayOfanyType, ARRAYOFANYTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfanyType" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType addNewArrayOfanyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType)get_store().add_element_user(ARRAYOFANYTYPE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfanyType" element
     */
    public void setNilArrayOfanyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType)get_store().find_element_user(ARRAYOFANYTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType)get_store().add_element_user(ARRAYOFANYTYPE$0);
            }
            target.setNil();
        }
    }
}
