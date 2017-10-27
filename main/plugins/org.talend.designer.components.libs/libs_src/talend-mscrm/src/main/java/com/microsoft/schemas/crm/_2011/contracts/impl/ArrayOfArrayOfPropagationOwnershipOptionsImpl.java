/*
 * XML Type:  ArrayOfArrayOfPropagationOwnershipOptions
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPropagationOwnershipOptions
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfPropagationOwnershipOptions(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfPropagationOwnershipOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPropagationOwnershipOptions
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfPropagationOwnershipOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfPropagationOwnershipOptions");
    
    
    /**
     * Gets array of all "ArrayOfPropagationOwnershipOptions" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions[] getArrayOfPropagationOwnershipOptionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfPropagationOwnershipOptions" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions getArrayOfPropagationOwnershipOptionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions)get_store().find_element_user(ARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfPropagationOwnershipOptions" element
     */
    public boolean isNilArrayOfPropagationOwnershipOptionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions)get_store().find_element_user(ARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfPropagationOwnershipOptions" element
     */
    public int sizeOfArrayOfPropagationOwnershipOptionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfPropagationOwnershipOptions" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfPropagationOwnershipOptionsArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions[] arrayOfPropagationOwnershipOptionsArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfPropagationOwnershipOptionsArray, ARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0);
    }
    
    /**
     * Sets ith "ArrayOfPropagationOwnershipOptions" element
     */
    public void setArrayOfPropagationOwnershipOptionsArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions arrayOfPropagationOwnershipOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions)get_store().find_element_user(ARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfPropagationOwnershipOptions);
        }
    }
    
    /**
     * Nils the ith "ArrayOfPropagationOwnershipOptions" element
     */
    public void setNilArrayOfPropagationOwnershipOptionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions)get_store().find_element_user(ARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfPropagationOwnershipOptions" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions insertNewArrayOfPropagationOwnershipOptions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions)get_store().insert_element_user(ARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfPropagationOwnershipOptions" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions addNewArrayOfPropagationOwnershipOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions)get_store().add_element_user(ARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfPropagationOwnershipOptions" element
     */
    public void removeArrayOfPropagationOwnershipOptions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0, i);
        }
    }
}
