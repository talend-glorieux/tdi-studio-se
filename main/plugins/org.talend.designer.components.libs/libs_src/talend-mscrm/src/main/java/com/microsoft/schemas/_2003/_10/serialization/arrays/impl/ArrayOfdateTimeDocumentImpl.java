/*
 * An XML document type.
 * Localname: ArrayOfdateTime
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdateTimeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * A document containing one ArrayOfdateTime(@http://schemas.microsoft.com/2003/10/Serialization/Arrays) element.
 *
 * This is a complex type.
 */
public class ArrayOfdateTimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdateTimeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfdateTimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFDATETIME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfdateTime");
    
    
    /**
     * Gets the "ArrayOfdateTime" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdateTime getArrayOfdateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdateTime target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdateTime)get_store().find_element_user(ARRAYOFDATETIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfdateTime" element
     */
    public boolean isNilArrayOfdateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdateTime target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdateTime)get_store().find_element_user(ARRAYOFDATETIME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfdateTime" element
     */
    public void setArrayOfdateTime(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdateTime arrayOfdateTime)
    {
        generatedSetterHelperImpl(arrayOfdateTime, ARRAYOFDATETIME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfdateTime" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdateTime addNewArrayOfdateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdateTime target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdateTime)get_store().add_element_user(ARRAYOFDATETIME$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfdateTime" element
     */
    public void setNilArrayOfdateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdateTime target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdateTime)get_store().find_element_user(ARRAYOFDATETIME$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdateTime)get_store().add_element_user(ARRAYOFDATETIME$0);
            }
            target.setNil();
        }
    }
}
