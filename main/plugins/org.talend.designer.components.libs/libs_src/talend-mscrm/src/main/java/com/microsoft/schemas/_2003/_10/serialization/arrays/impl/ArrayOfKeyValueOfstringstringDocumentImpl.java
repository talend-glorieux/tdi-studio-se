/*
 * An XML document type.
 * Localname: ArrayOfKeyValueOfstringstring
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstringDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * A document containing one ArrayOfKeyValueOfstringstring(@http://schemas.microsoft.com/2003/10/Serialization/Arrays) element.
 *
 * This is a complex type.
 */
public class ArrayOfKeyValueOfstringstringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstringDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfKeyValueOfstringstringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFKEYVALUEOFSTRINGSTRING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringstring");
    
    
    /**
     * Gets the "ArrayOfKeyValueOfstringstring" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring getArrayOfKeyValueOfstringstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring)get_store().find_element_user(ARRAYOFKEYVALUEOFSTRINGSTRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfKeyValueOfstringstring" element
     */
    public boolean isNilArrayOfKeyValueOfstringstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring)get_store().find_element_user(ARRAYOFKEYVALUEOFSTRINGSTRING$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfKeyValueOfstringstring" element
     */
    public void setArrayOfKeyValueOfstringstring(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring arrayOfKeyValueOfstringstring)
    {
        generatedSetterHelperImpl(arrayOfKeyValueOfstringstring, ARRAYOFKEYVALUEOFSTRINGSTRING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfKeyValueOfstringstring" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring addNewArrayOfKeyValueOfstringstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring)get_store().add_element_user(ARRAYOFKEYVALUEOFSTRINGSTRING$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfKeyValueOfstringstring" element
     */
    public void setNilArrayOfKeyValueOfstringstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring)get_store().find_element_user(ARRAYOFKEYVALUEOFSTRINGSTRING$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring)get_store().add_element_user(ARRAYOFKEYVALUEOFSTRINGSTRING$0);
            }
            target.setNil();
        }
    }
}
