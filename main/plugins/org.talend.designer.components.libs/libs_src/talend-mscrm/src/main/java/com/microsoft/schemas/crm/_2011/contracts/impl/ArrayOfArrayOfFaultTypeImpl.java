/*
 * XML Type:  ArrayOfArrayOfFaultType
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfFaultType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfFaultType(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfFaultTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfFaultType
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfFaultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFFAULTTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfFaultType");
    
    
    /**
     * Gets array of all "ArrayOfFaultType" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType[] getArrayOfFaultTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFFAULTTYPE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfFaultType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType getArrayOfFaultTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType)get_store().find_element_user(ARRAYOFFAULTTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfFaultType" element
     */
    public boolean isNilArrayOfFaultTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType)get_store().find_element_user(ARRAYOFFAULTTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfFaultType" element
     */
    public int sizeOfArrayOfFaultTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFFAULTTYPE$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfFaultType" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfFaultTypeArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType[] arrayOfFaultTypeArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfFaultTypeArray, ARRAYOFFAULTTYPE$0);
    }
    
    /**
     * Sets ith "ArrayOfFaultType" element
     */
    public void setArrayOfFaultTypeArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType arrayOfFaultType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType)get_store().find_element_user(ARRAYOFFAULTTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfFaultType);
        }
    }
    
    /**
     * Nils the ith "ArrayOfFaultType" element
     */
    public void setNilArrayOfFaultTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType)get_store().find_element_user(ARRAYOFFAULTTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfFaultType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType insertNewArrayOfFaultType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType)get_store().insert_element_user(ARRAYOFFAULTTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfFaultType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType addNewArrayOfFaultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType)get_store().add_element_user(ARRAYOFFAULTTYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfFaultType" element
     */
    public void removeArrayOfFaultType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFFAULTTYPE$0, i);
        }
    }
}
