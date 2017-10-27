/*
 * XML Type:  ArrayOfCacheItem
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfCacheItem(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfCacheItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfCacheItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CACHEITEM$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "CacheItem");
    
    
    /**
     * Gets array of all "CacheItem" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.CacheItem[] getCacheItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CACHEITEM$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.CacheItem[] result = new com.microsoft.schemas.crm._2011.contracts.CacheItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CacheItem" element
     */
    public com.microsoft.schemas.crm._2011.contracts.CacheItem getCacheItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.CacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.CacheItem)get_store().find_element_user(CACHEITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "CacheItem" element
     */
    public boolean isNilCacheItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.CacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.CacheItem)get_store().find_element_user(CACHEITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "CacheItem" element
     */
    public int sizeOfCacheItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CACHEITEM$0);
        }
    }
    
    /**
     * Sets array of all "CacheItem" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCacheItemArray(com.microsoft.schemas.crm._2011.contracts.CacheItem[] cacheItemArray)
    {
        check_orphaned();
        arraySetterHelper(cacheItemArray, CACHEITEM$0);
    }
    
    /**
     * Sets ith "CacheItem" element
     */
    public void setCacheItemArray(int i, com.microsoft.schemas.crm._2011.contracts.CacheItem cacheItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.CacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.CacheItem)get_store().find_element_user(CACHEITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cacheItem);
        }
    }
    
    /**
     * Nils the ith "CacheItem" element
     */
    public void setNilCacheItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.CacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.CacheItem)get_store().find_element_user(CACHEITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CacheItem" element
     */
    public com.microsoft.schemas.crm._2011.contracts.CacheItem insertNewCacheItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.CacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.CacheItem)get_store().insert_element_user(CACHEITEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CacheItem" element
     */
    public com.microsoft.schemas.crm._2011.contracts.CacheItem addNewCacheItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.CacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.CacheItem)get_store().add_element_user(CACHEITEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "CacheItem" element
     */
    public void removeCacheItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CACHEITEM$0, i);
        }
    }
}
