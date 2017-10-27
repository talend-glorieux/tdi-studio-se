/*
 * An XML document type.
 * Localname: ArrayOfguid
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguidDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * A document containing one ArrayOfguid(@http://schemas.microsoft.com/2003/10/Serialization/Arrays) element.
 *
 * This is a complex type.
 */
public class ArrayOfguidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguidDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfguidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFGUID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfguid");
    
    
    /**
     * Gets the "ArrayOfguid" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid getArrayOfguid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().find_element_user(ARRAYOFGUID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfguid" element
     */
    public boolean isNilArrayOfguid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().find_element_user(ARRAYOFGUID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfguid" element
     */
    public void setArrayOfguid(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid arrayOfguid)
    {
        generatedSetterHelperImpl(arrayOfguid, ARRAYOFGUID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfguid" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid addNewArrayOfguid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().add_element_user(ARRAYOFGUID$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfguid" element
     */
    public void setNilArrayOfguid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().find_element_user(ARRAYOFGUID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().add_element_user(ARRAYOFGUID$0);
            }
            target.setNil();
        }
    }
}
