/*
 * XML Type:  ArrayOfArrayOfBulkOperationSource
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBulkOperationSource
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfBulkOperationSource(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfBulkOperationSourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBulkOperationSource
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfBulkOperationSourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFBULKOPERATIONSOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfBulkOperationSource");
    
    
    /**
     * Gets array of all "ArrayOfBulkOperationSource" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource[] getArrayOfBulkOperationSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFBULKOPERATIONSOURCE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfBulkOperationSource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource getArrayOfBulkOperationSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource)get_store().find_element_user(ARRAYOFBULKOPERATIONSOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfBulkOperationSource" element
     */
    public boolean isNilArrayOfBulkOperationSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource)get_store().find_element_user(ARRAYOFBULKOPERATIONSOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfBulkOperationSource" element
     */
    public int sizeOfArrayOfBulkOperationSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFBULKOPERATIONSOURCE$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfBulkOperationSource" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfBulkOperationSourceArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource[] arrayOfBulkOperationSourceArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfBulkOperationSourceArray, ARRAYOFBULKOPERATIONSOURCE$0);
    }
    
    /**
     * Sets ith "ArrayOfBulkOperationSource" element
     */
    public void setArrayOfBulkOperationSourceArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource arrayOfBulkOperationSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource)get_store().find_element_user(ARRAYOFBULKOPERATIONSOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfBulkOperationSource);
        }
    }
    
    /**
     * Nils the ith "ArrayOfBulkOperationSource" element
     */
    public void setNilArrayOfBulkOperationSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource)get_store().find_element_user(ARRAYOFBULKOPERATIONSOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfBulkOperationSource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource insertNewArrayOfBulkOperationSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource)get_store().insert_element_user(ARRAYOFBULKOPERATIONSOURCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfBulkOperationSource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource addNewArrayOfBulkOperationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource)get_store().add_element_user(ARRAYOFBULKOPERATIONSOURCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfBulkOperationSource" element
     */
    public void removeArrayOfBulkOperationSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFBULKOPERATIONSOURCE$0, i);
        }
    }
}
