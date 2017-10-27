/*
 * XML Type:  ArrayOfArrayOfSearchResults
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchResults
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfSearchResults(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfSearchResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchResults
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfSearchResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSEARCHRESULTS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfSearchResults");
    
    
    /**
     * Gets array of all "ArrayOfSearchResults" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults[] getArrayOfSearchResultsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFSEARCHRESULTS$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfSearchResults" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults getArrayOfSearchResultsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults)get_store().find_element_user(ARRAYOFSEARCHRESULTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfSearchResults" element
     */
    public boolean isNilArrayOfSearchResultsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults)get_store().find_element_user(ARRAYOFSEARCHRESULTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfSearchResults" element
     */
    public int sizeOfArrayOfSearchResultsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFSEARCHRESULTS$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfSearchResults" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfSearchResultsArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults[] arrayOfSearchResultsArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfSearchResultsArray, ARRAYOFSEARCHRESULTS$0);
    }
    
    /**
     * Sets ith "ArrayOfSearchResults" element
     */
    public void setArrayOfSearchResultsArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults arrayOfSearchResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults)get_store().find_element_user(ARRAYOFSEARCHRESULTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfSearchResults);
        }
    }
    
    /**
     * Nils the ith "ArrayOfSearchResults" element
     */
    public void setNilArrayOfSearchResultsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults)get_store().find_element_user(ARRAYOFSEARCHRESULTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfSearchResults" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults insertNewArrayOfSearchResults(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults)get_store().insert_element_user(ARRAYOFSEARCHRESULTS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfSearchResults" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults addNewArrayOfSearchResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults)get_store().add_element_user(ARRAYOFSEARCHRESULTS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfSearchResults" element
     */
    public void removeArrayOfSearchResults(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFSEARCHRESULTS$0, i);
        }
    }
}
