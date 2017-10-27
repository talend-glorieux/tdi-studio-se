/*
 * XML Type:  ArrayOfQueryByEntityNameDictionary
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfQueryByEntityNameDictionary(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfQueryByEntityNameDictionaryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfQueryByEntityNameDictionaryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYBYENTITYNAMEDICTIONARY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "QueryByEntityNameDictionary");
    
    
    /**
     * Gets array of all "QueryByEntityNameDictionary" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary[] getQueryByEntityNameDictionaryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUERYBYENTITYNAMEDICTIONARY$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary[] result = new com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "QueryByEntityNameDictionary" element
     */
    public com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary getQueryByEntityNameDictionaryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary)get_store().find_element_user(QUERYBYENTITYNAMEDICTIONARY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "QueryByEntityNameDictionary" element
     */
    public boolean isNilQueryByEntityNameDictionaryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary)get_store().find_element_user(QUERYBYENTITYNAMEDICTIONARY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "QueryByEntityNameDictionary" element
     */
    public int sizeOfQueryByEntityNameDictionaryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYBYENTITYNAMEDICTIONARY$0);
        }
    }
    
    /**
     * Sets array of all "QueryByEntityNameDictionary" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setQueryByEntityNameDictionaryArray(com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary[] queryByEntityNameDictionaryArray)
    {
        check_orphaned();
        arraySetterHelper(queryByEntityNameDictionaryArray, QUERYBYENTITYNAMEDICTIONARY$0);
    }
    
    /**
     * Sets ith "QueryByEntityNameDictionary" element
     */
    public void setQueryByEntityNameDictionaryArray(int i, com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary queryByEntityNameDictionary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary)get_store().find_element_user(QUERYBYENTITYNAMEDICTIONARY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(queryByEntityNameDictionary);
        }
    }
    
    /**
     * Nils the ith "QueryByEntityNameDictionary" element
     */
    public void setNilQueryByEntityNameDictionaryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary)get_store().find_element_user(QUERYBYENTITYNAMEDICTIONARY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QueryByEntityNameDictionary" element
     */
    public com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary insertNewQueryByEntityNameDictionary(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary)get_store().insert_element_user(QUERYBYENTITYNAMEDICTIONARY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QueryByEntityNameDictionary" element
     */
    public com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary addNewQueryByEntityNameDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary)get_store().add_element_user(QUERYBYENTITYNAMEDICTIONARY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "QueryByEntityNameDictionary" element
     */
    public void removeQueryByEntityNameDictionary(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYBYENTITYNAMEDICTIONARY$0, i);
        }
    }
}
