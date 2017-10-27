/*
 * An XML document type.
 * Localname: ArrayOfboolean
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfbooleanDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * A document containing one ArrayOfboolean(@http://schemas.microsoft.com/2003/10/Serialization/Arrays) element.
 *
 * This is a complex type.
 */
public class ArrayOfbooleanDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfbooleanDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfbooleanDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFBOOLEAN$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfboolean");
    
    
    /**
     * Gets the "ArrayOfboolean" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfboolean getArrayOfboolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfboolean target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfboolean)get_store().find_element_user(ARRAYOFBOOLEAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfboolean" element
     */
    public boolean isNilArrayOfboolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfboolean target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfboolean)get_store().find_element_user(ARRAYOFBOOLEAN$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfboolean" element
     */
    public void setArrayOfboolean(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfboolean arrayOfboolean)
    {
        generatedSetterHelperImpl(arrayOfboolean, ARRAYOFBOOLEAN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfboolean" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfboolean addNewArrayOfboolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfboolean target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfboolean)get_store().add_element_user(ARRAYOFBOOLEAN$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfboolean" element
     */
    public void setNilArrayOfboolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfboolean target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfboolean)get_store().find_element_user(ARRAYOFBOOLEAN$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfboolean)get_store().add_element_user(ARRAYOFBOOLEAN$0);
            }
            target.setNil();
        }
    }
}
