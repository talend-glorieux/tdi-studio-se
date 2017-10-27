/*
 * XML Type:  ArrayOfArrayOfQueryByEntityNameDictionary
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfQueryByEntityNameDictionary(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfQueryByEntityNameDictionaryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfQueryByEntityNameDictionaryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFQUERYBYENTITYNAMEDICTIONARY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfQueryByEntityNameDictionary");
    
    
    /**
     * Gets array of all "ArrayOfQueryByEntityNameDictionary" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary[] getArrayOfQueryByEntityNameDictionaryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFQUERYBYENTITYNAMEDICTIONARY$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfQueryByEntityNameDictionary" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary getArrayOfQueryByEntityNameDictionaryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary)get_store().find_element_user(ARRAYOFQUERYBYENTITYNAMEDICTIONARY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfQueryByEntityNameDictionary" element
     */
    public boolean isNilArrayOfQueryByEntityNameDictionaryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary)get_store().find_element_user(ARRAYOFQUERYBYENTITYNAMEDICTIONARY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfQueryByEntityNameDictionary" element
     */
    public int sizeOfArrayOfQueryByEntityNameDictionaryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFQUERYBYENTITYNAMEDICTIONARY$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfQueryByEntityNameDictionary" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfQueryByEntityNameDictionaryArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary[] arrayOfQueryByEntityNameDictionaryArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfQueryByEntityNameDictionaryArray, ARRAYOFQUERYBYENTITYNAMEDICTIONARY$0);
    }
    
    /**
     * Sets ith "ArrayOfQueryByEntityNameDictionary" element
     */
    public void setArrayOfQueryByEntityNameDictionaryArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary arrayOfQueryByEntityNameDictionary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary)get_store().find_element_user(ARRAYOFQUERYBYENTITYNAMEDICTIONARY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfQueryByEntityNameDictionary);
        }
    }
    
    /**
     * Nils the ith "ArrayOfQueryByEntityNameDictionary" element
     */
    public void setNilArrayOfQueryByEntityNameDictionaryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary)get_store().find_element_user(ARRAYOFQUERYBYENTITYNAMEDICTIONARY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfQueryByEntityNameDictionary" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary insertNewArrayOfQueryByEntityNameDictionary(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary)get_store().insert_element_user(ARRAYOFQUERYBYENTITYNAMEDICTIONARY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfQueryByEntityNameDictionary" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary addNewArrayOfQueryByEntityNameDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary)get_store().add_element_user(ARRAYOFQUERYBYENTITYNAMEDICTIONARY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfQueryByEntityNameDictionary" element
     */
    public void removeArrayOfQueryByEntityNameDictionary(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFQUERYBYENTITYNAMEDICTIONARY$0, i);
        }
    }
}
