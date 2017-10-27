/*
 * XML Type:  ArrayOfArrayOfstring
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfArrayOfstring
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * An XML ArrayOfArrayOfstring(@http://schemas.microsoft.com/2003/10/Serialization/Arrays).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfstringImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfArrayOfstring
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfstringImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSTRING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    
    
    /**
     * Gets array of all "ArrayOfstring" elements
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring[] getArrayOfstringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFSTRING$0, targetList);
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring[] result = new com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfstring" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getArrayOfstringArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ARRAYOFSTRING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfstring" element
     */
    public boolean isNilArrayOfstringArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ARRAYOFSTRING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfstring" element
     */
    public int sizeOfArrayOfstringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFSTRING$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfstring" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfstringArray(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring[] arrayOfstringArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfstringArray, ARRAYOFSTRING$0);
    }
    
    /**
     * Sets ith "ArrayOfstring" element
     */
    public void setArrayOfstringArray(int i, com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring arrayOfstring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ARRAYOFSTRING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfstring);
        }
    }
    
    /**
     * Nils the ith "ArrayOfstring" element
     */
    public void setNilArrayOfstringArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ARRAYOFSTRING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfstring" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring insertNewArrayOfstring(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().insert_element_user(ARRAYOFSTRING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfstring" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewArrayOfstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(ARRAYOFSTRING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfstring" element
     */
    public void removeArrayOfstring(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFSTRING$0, i);
        }
    }
}
