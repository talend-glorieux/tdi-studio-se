/*
 * An XML document type.
 * Localname: ArrayOfdouble
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdoubleDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * A document containing one ArrayOfdouble(@http://schemas.microsoft.com/2003/10/Serialization/Arrays) element.
 *
 * This is a complex type.
 */
public class ArrayOfdoubleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdoubleDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfdoubleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFDOUBLE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfdouble");
    
    
    /**
     * Gets the "ArrayOfdouble" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble getArrayOfdouble()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble)get_store().find_element_user(ARRAYOFDOUBLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfdouble" element
     */
    public boolean isNilArrayOfdouble()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble)get_store().find_element_user(ARRAYOFDOUBLE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfdouble" element
     */
    public void setArrayOfdouble(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble arrayOfdouble)
    {
        generatedSetterHelperImpl(arrayOfdouble, ARRAYOFDOUBLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfdouble" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble addNewArrayOfdouble()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble)get_store().add_element_user(ARRAYOFDOUBLE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfdouble" element
     */
    public void setNilArrayOfdouble()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble)get_store().find_element_user(ARRAYOFDOUBLE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble)get_store().add_element_user(ARRAYOFDOUBLE$0);
            }
            target.setNil();
        }
    }
}
