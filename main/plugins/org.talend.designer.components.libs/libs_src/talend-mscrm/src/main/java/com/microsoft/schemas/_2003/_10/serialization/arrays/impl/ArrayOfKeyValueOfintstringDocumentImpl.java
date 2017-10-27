/*
 * An XML document type.
 * Localname: ArrayOfKeyValueOfintstring
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstringDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * A document containing one ArrayOfKeyValueOfintstring(@http://schemas.microsoft.com/2003/10/Serialization/Arrays) element.
 *
 * This is a complex type.
 */
public class ArrayOfKeyValueOfintstringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstringDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfKeyValueOfintstringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFKEYVALUEOFINTSTRING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfintstring");
    
    
    /**
     * Gets the "ArrayOfKeyValueOfintstring" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring getArrayOfKeyValueOfintstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring)get_store().find_element_user(ARRAYOFKEYVALUEOFINTSTRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfKeyValueOfintstring" element
     */
    public boolean isNilArrayOfKeyValueOfintstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring)get_store().find_element_user(ARRAYOFKEYVALUEOFINTSTRING$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfKeyValueOfintstring" element
     */
    public void setArrayOfKeyValueOfintstring(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring arrayOfKeyValueOfintstring)
    {
        generatedSetterHelperImpl(arrayOfKeyValueOfintstring, ARRAYOFKEYVALUEOFINTSTRING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfKeyValueOfintstring" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring addNewArrayOfKeyValueOfintstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring)get_store().add_element_user(ARRAYOFKEYVALUEOFINTSTRING$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfKeyValueOfintstring" element
     */
    public void setNilArrayOfKeyValueOfintstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring)get_store().find_element_user(ARRAYOFKEYVALUEOFINTSTRING$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring)get_store().add_element_user(ARRAYOFKEYVALUEOFINTSTRING$0);
            }
            target.setNil();
        }
    }
}
