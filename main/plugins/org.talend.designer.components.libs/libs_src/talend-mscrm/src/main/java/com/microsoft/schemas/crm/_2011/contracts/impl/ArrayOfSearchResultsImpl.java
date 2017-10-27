/*
 * XML Type:  ArrayOfSearchResults
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfSearchResults(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfSearchResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSearchResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHRESULTS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SearchResults");
    
    
    /**
     * Gets array of all "SearchResults" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.SearchResults[] getSearchResultsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SEARCHRESULTS$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.SearchResults[] result = new com.microsoft.schemas.crm._2011.contracts.SearchResults[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SearchResults" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SearchResults getSearchResultsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchResults)get_store().find_element_user(SEARCHRESULTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "SearchResults" element
     */
    public boolean isNilSearchResultsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchResults)get_store().find_element_user(SEARCHRESULTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "SearchResults" element
     */
    public int sizeOfSearchResultsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEARCHRESULTS$0);
        }
    }
    
    /**
     * Sets array of all "SearchResults" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSearchResultsArray(com.microsoft.schemas.crm._2011.contracts.SearchResults[] searchResultsArray)
    {
        check_orphaned();
        arraySetterHelper(searchResultsArray, SEARCHRESULTS$0);
    }
    
    /**
     * Sets ith "SearchResults" element
     */
    public void setSearchResultsArray(int i, com.microsoft.schemas.crm._2011.contracts.SearchResults searchResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchResults)get_store().find_element_user(SEARCHRESULTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(searchResults);
        }
    }
    
    /**
     * Nils the ith "SearchResults" element
     */
    public void setNilSearchResultsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchResults)get_store().find_element_user(SEARCHRESULTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SearchResults" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SearchResults insertNewSearchResults(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchResults)get_store().insert_element_user(SEARCHRESULTS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SearchResults" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SearchResults addNewSearchResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchResults)get_store().add_element_user(SEARCHRESULTS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SearchResults" element
     */
    public void removeSearchResults(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEARCHRESULTS$0, i);
        }
    }
}
