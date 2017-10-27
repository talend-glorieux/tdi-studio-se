/*
 * An XML document type.
 * Localname: ArrayOfint
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfintDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * A document containing one ArrayOfint(@http://schemas.microsoft.com/2003/10/Serialization/Arrays) element.
 *
 * This is a complex type.
 */
public class ArrayOfintDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfintDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfintDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFINT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    
    
    /**
     * Gets the "ArrayOfint" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint getArrayOfint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint)get_store().find_element_user(ARRAYOFINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfint" element
     */
    public boolean isNilArrayOfint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint)get_store().find_element_user(ARRAYOFINT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfint" element
     */
    public void setArrayOfint(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint arrayOfint)
    {
        generatedSetterHelperImpl(arrayOfint, ARRAYOFINT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfint" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint addNewArrayOfint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint)get_store().add_element_user(ARRAYOFINT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfint" element
     */
    public void setNilArrayOfint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint)get_store().find_element_user(ARRAYOFINT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint)get_store().add_element_user(ARRAYOFINT$0);
            }
            target.setNil();
        }
    }
}
