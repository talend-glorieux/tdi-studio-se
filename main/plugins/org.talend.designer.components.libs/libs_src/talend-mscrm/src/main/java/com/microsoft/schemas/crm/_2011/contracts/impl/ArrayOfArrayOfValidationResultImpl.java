/*
 * XML Type:  ArrayOfArrayOfValidationResult
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfValidationResult
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfValidationResult(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfValidationResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfValidationResult
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfValidationResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFVALIDATIONRESULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfValidationResult");
    
    
    /**
     * Gets array of all "ArrayOfValidationResult" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult[] getArrayOfValidationResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFVALIDATIONRESULT$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfValidationResult" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult getArrayOfValidationResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult)get_store().find_element_user(ARRAYOFVALIDATIONRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfValidationResult" element
     */
    public boolean isNilArrayOfValidationResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult)get_store().find_element_user(ARRAYOFVALIDATIONRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfValidationResult" element
     */
    public int sizeOfArrayOfValidationResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFVALIDATIONRESULT$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfValidationResult" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfValidationResultArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult[] arrayOfValidationResultArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfValidationResultArray, ARRAYOFVALIDATIONRESULT$0);
    }
    
    /**
     * Sets ith "ArrayOfValidationResult" element
     */
    public void setArrayOfValidationResultArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult arrayOfValidationResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult)get_store().find_element_user(ARRAYOFVALIDATIONRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfValidationResult);
        }
    }
    
    /**
     * Nils the ith "ArrayOfValidationResult" element
     */
    public void setNilArrayOfValidationResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult)get_store().find_element_user(ARRAYOFVALIDATIONRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfValidationResult" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult insertNewArrayOfValidationResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult)get_store().insert_element_user(ARRAYOFVALIDATIONRESULT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfValidationResult" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult addNewArrayOfValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult)get_store().add_element_user(ARRAYOFVALIDATIONRESULT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfValidationResult" element
     */
    public void removeArrayOfValidationResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFVALIDATIONRESULT$0, i);
        }
    }
}
