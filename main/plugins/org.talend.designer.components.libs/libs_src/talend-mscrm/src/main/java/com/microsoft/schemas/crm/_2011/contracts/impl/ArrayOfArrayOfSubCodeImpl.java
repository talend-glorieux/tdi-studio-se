/*
 * XML Type:  ArrayOfArrayOfSubCode
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSubCode
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfSubCode(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfSubCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSubCode
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfSubCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSUBCODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfSubCode");
    
    
    /**
     * Gets array of all "ArrayOfSubCode" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode[] getArrayOfSubCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFSUBCODE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfSubCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode getArrayOfSubCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode)get_store().find_element_user(ARRAYOFSUBCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfSubCode" element
     */
    public boolean isNilArrayOfSubCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode)get_store().find_element_user(ARRAYOFSUBCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfSubCode" element
     */
    public int sizeOfArrayOfSubCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFSUBCODE$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfSubCode" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfSubCodeArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode[] arrayOfSubCodeArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfSubCodeArray, ARRAYOFSUBCODE$0);
    }
    
    /**
     * Sets ith "ArrayOfSubCode" element
     */
    public void setArrayOfSubCodeArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode arrayOfSubCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode)get_store().find_element_user(ARRAYOFSUBCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfSubCode);
        }
    }
    
    /**
     * Nils the ith "ArrayOfSubCode" element
     */
    public void setNilArrayOfSubCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode)get_store().find_element_user(ARRAYOFSUBCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfSubCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode insertNewArrayOfSubCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode)get_store().insert_element_user(ARRAYOFSUBCODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfSubCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode addNewArrayOfSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode)get_store().add_element_user(ARRAYOFSUBCODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfSubCode" element
     */
    public void removeArrayOfSubCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFSUBCODE$0, i);
        }
    }
}
