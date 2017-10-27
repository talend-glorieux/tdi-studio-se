/*
 * XML Type:  ArrayOfArrayOfCacheItem
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfCacheItem
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfCacheItem(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfCacheItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfCacheItem
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfCacheItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFCACHEITEM$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfCacheItem");
    
    
    /**
     * Gets array of all "ArrayOfCacheItem" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem[] getArrayOfCacheItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFCACHEITEM$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfCacheItem" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem getArrayOfCacheItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem)get_store().find_element_user(ARRAYOFCACHEITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfCacheItem" element
     */
    public boolean isNilArrayOfCacheItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem)get_store().find_element_user(ARRAYOFCACHEITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfCacheItem" element
     */
    public int sizeOfArrayOfCacheItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFCACHEITEM$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfCacheItem" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfCacheItemArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem[] arrayOfCacheItemArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfCacheItemArray, ARRAYOFCACHEITEM$0);
    }
    
    /**
     * Sets ith "ArrayOfCacheItem" element
     */
    public void setArrayOfCacheItemArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem arrayOfCacheItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem)get_store().find_element_user(ARRAYOFCACHEITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfCacheItem);
        }
    }
    
    /**
     * Nils the ith "ArrayOfCacheItem" element
     */
    public void setNilArrayOfCacheItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem)get_store().find_element_user(ARRAYOFCACHEITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfCacheItem" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem insertNewArrayOfCacheItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem)get_store().insert_element_user(ARRAYOFCACHEITEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfCacheItem" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem addNewArrayOfCacheItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem)get_store().add_element_user(ARRAYOFCACHEITEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfCacheItem" element
     */
    public void removeArrayOfCacheItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFCACHEITEM$0, i);
        }
    }
}
