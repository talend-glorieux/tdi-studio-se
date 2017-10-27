/*
 * XML Type:  ArrayOfValidationResult
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfValidationResult(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfValidationResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfValidationResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATIONRESULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ValidationResult");
    
    
    /**
     * Gets array of all "ValidationResult" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ValidationResult[] getValidationResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALIDATIONRESULT$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ValidationResult[] result = new com.microsoft.schemas.crm._2011.contracts.ValidationResult[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ValidationResult" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ValidationResult getValidationResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ValidationResult)get_store().find_element_user(VALIDATIONRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ValidationResult" element
     */
    public boolean isNilValidationResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ValidationResult)get_store().find_element_user(VALIDATIONRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ValidationResult" element
     */
    public int sizeOfValidationResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATIONRESULT$0);
        }
    }
    
    /**
     * Sets array of all "ValidationResult" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setValidationResultArray(com.microsoft.schemas.crm._2011.contracts.ValidationResult[] validationResultArray)
    {
        check_orphaned();
        arraySetterHelper(validationResultArray, VALIDATIONRESULT$0);
    }
    
    /**
     * Sets ith "ValidationResult" element
     */
    public void setValidationResultArray(int i, com.microsoft.schemas.crm._2011.contracts.ValidationResult validationResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ValidationResult)get_store().find_element_user(VALIDATIONRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(validationResult);
        }
    }
    
    /**
     * Nils the ith "ValidationResult" element
     */
    public void setNilValidationResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ValidationResult)get_store().find_element_user(VALIDATIONRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValidationResult" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ValidationResult insertNewValidationResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ValidationResult)get_store().insert_element_user(VALIDATIONRESULT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ValidationResult" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ValidationResult addNewValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ValidationResult)get_store().add_element_user(VALIDATIONRESULT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ValidationResult" element
     */
    public void removeValidationResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATIONRESULT$0, i);
        }
    }
}
