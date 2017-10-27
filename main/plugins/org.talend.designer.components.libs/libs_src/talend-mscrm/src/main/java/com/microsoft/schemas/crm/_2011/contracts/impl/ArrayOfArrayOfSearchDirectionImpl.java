/*
 * XML Type:  ArrayOfArrayOfSearchDirection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchDirection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfSearchDirection(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfSearchDirectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchDirection
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfSearchDirectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSEARCHDIRECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfSearchDirection");
    
    
    /**
     * Gets array of all "ArrayOfSearchDirection" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection[] getArrayOfSearchDirectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFSEARCHDIRECTION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfSearchDirection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection getArrayOfSearchDirectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection)get_store().find_element_user(ARRAYOFSEARCHDIRECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfSearchDirection" element
     */
    public boolean isNilArrayOfSearchDirectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection)get_store().find_element_user(ARRAYOFSEARCHDIRECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfSearchDirection" element
     */
    public int sizeOfArrayOfSearchDirectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFSEARCHDIRECTION$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfSearchDirection" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfSearchDirectionArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection[] arrayOfSearchDirectionArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfSearchDirectionArray, ARRAYOFSEARCHDIRECTION$0);
    }
    
    /**
     * Sets ith "ArrayOfSearchDirection" element
     */
    public void setArrayOfSearchDirectionArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection arrayOfSearchDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection)get_store().find_element_user(ARRAYOFSEARCHDIRECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfSearchDirection);
        }
    }
    
    /**
     * Nils the ith "ArrayOfSearchDirection" element
     */
    public void setNilArrayOfSearchDirectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection)get_store().find_element_user(ARRAYOFSEARCHDIRECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfSearchDirection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection insertNewArrayOfSearchDirection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection)get_store().insert_element_user(ARRAYOFSEARCHDIRECTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfSearchDirection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection addNewArrayOfSearchDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection)get_store().add_element_user(ARRAYOFSEARCHDIRECTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfSearchDirection" element
     */
    public void removeArrayOfSearchDirection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFSEARCHDIRECTION$0, i);
        }
    }
}
