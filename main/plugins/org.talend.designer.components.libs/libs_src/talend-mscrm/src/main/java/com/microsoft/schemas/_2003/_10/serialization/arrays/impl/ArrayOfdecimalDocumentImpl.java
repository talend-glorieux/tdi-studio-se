/*
 * An XML document type.
 * Localname: ArrayOfdecimal
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdecimalDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * A document containing one ArrayOfdecimal(@http://schemas.microsoft.com/2003/10/Serialization/Arrays) element.
 *
 * This is a complex type.
 */
public class ArrayOfdecimalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdecimalDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfdecimalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFDECIMAL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfdecimal");
    
    
    /**
     * Gets the "ArrayOfdecimal" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdecimal getArrayOfdecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdecimal target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdecimal)get_store().find_element_user(ARRAYOFDECIMAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfdecimal" element
     */
    public boolean isNilArrayOfdecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdecimal target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdecimal)get_store().find_element_user(ARRAYOFDECIMAL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfdecimal" element
     */
    public void setArrayOfdecimal(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdecimal arrayOfdecimal)
    {
        generatedSetterHelperImpl(arrayOfdecimal, ARRAYOFDECIMAL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfdecimal" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdecimal addNewArrayOfdecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdecimal target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdecimal)get_store().add_element_user(ARRAYOFDECIMAL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfdecimal" element
     */
    public void setNilArrayOfdecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdecimal target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdecimal)get_store().find_element_user(ARRAYOFDECIMAL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdecimal)get_store().add_element_user(ARRAYOFDECIMAL$0);
            }
            target.setNil();
        }
    }
}
