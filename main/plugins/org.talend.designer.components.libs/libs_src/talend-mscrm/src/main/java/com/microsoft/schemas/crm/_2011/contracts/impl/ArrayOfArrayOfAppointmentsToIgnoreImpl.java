/*
 * XML Type:  ArrayOfArrayOfAppointmentsToIgnore
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfAppointmentsToIgnore(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfAppointmentsToIgnoreImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfAppointmentsToIgnoreImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFAPPOINTMENTSTOIGNORE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAppointmentsToIgnore");
    
    
    /**
     * Gets array of all "ArrayOfAppointmentsToIgnore" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore[] getArrayOfAppointmentsToIgnoreArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFAPPOINTMENTSTOIGNORE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfAppointmentsToIgnore" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore getArrayOfAppointmentsToIgnoreArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore)get_store().find_element_user(ARRAYOFAPPOINTMENTSTOIGNORE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfAppointmentsToIgnore" element
     */
    public boolean isNilArrayOfAppointmentsToIgnoreArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore)get_store().find_element_user(ARRAYOFAPPOINTMENTSTOIGNORE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfAppointmentsToIgnore" element
     */
    public int sizeOfArrayOfAppointmentsToIgnoreArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFAPPOINTMENTSTOIGNORE$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfAppointmentsToIgnore" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfAppointmentsToIgnoreArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore[] arrayOfAppointmentsToIgnoreArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfAppointmentsToIgnoreArray, ARRAYOFAPPOINTMENTSTOIGNORE$0);
    }
    
    /**
     * Sets ith "ArrayOfAppointmentsToIgnore" element
     */
    public void setArrayOfAppointmentsToIgnoreArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore arrayOfAppointmentsToIgnore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore)get_store().find_element_user(ARRAYOFAPPOINTMENTSTOIGNORE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfAppointmentsToIgnore);
        }
    }
    
    /**
     * Nils the ith "ArrayOfAppointmentsToIgnore" element
     */
    public void setNilArrayOfAppointmentsToIgnoreArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore)get_store().find_element_user(ARRAYOFAPPOINTMENTSTOIGNORE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfAppointmentsToIgnore" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore insertNewArrayOfAppointmentsToIgnore(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore)get_store().insert_element_user(ARRAYOFAPPOINTMENTSTOIGNORE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfAppointmentsToIgnore" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore addNewArrayOfAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore)get_store().add_element_user(ARRAYOFAPPOINTMENTSTOIGNORE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfAppointmentsToIgnore" element
     */
    public void removeArrayOfAppointmentsToIgnore(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFAPPOINTMENTSTOIGNORE$0, i);
        }
    }
}
