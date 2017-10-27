/*
 * XML Type:  ArrayOfanyType
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * An XML ArrayOfanyType(@http://schemas.microsoft.com/2003/10/Serialization/Arrays).
 *
 * This is a complex type.
 */
public class ArrayOfanyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfanyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANYTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "anyType");
    
    
    /**
     * Gets array of all "anyType" elements
     */
    public org.apache.xmlbeans.XmlObject[] getAnyTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ANYTYPE$0, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "anyType" element
     */
    public org.apache.xmlbeans.XmlObject getAnyTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ANYTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "anyType" element
     */
    public boolean isNilAnyTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ANYTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "anyType" element
     */
    public int sizeOfAnyTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANYTYPE$0);
        }
    }
    
    /**
     * Sets array of all "anyType" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAnyTypeArray(org.apache.xmlbeans.XmlObject[] anyTypeArray)
    {
        check_orphaned();
        arraySetterHelper(anyTypeArray, ANYTYPE$0);
    }
    
    /**
     * Sets ith "anyType" element
     */
    public void setAnyTypeArray(int i, org.apache.xmlbeans.XmlObject anyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ANYTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(anyType);
        }
    }
    
    /**
     * Nils the ith "anyType" element
     */
    public void setNilAnyTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ANYTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "anyType" element
     */
    public org.apache.xmlbeans.XmlObject insertNewAnyType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(ANYTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "anyType" element
     */
    public org.apache.xmlbeans.XmlObject addNewAnyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ANYTYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "anyType" element
     */
    public void removeAnyType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANYTYPE$0, i);
        }
    }
}
