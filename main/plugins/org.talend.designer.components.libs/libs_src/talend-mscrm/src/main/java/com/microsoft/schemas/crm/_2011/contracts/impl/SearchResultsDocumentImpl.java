/*
 * An XML document type.
 * Localname: SearchResults
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.SearchResultsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one SearchResults(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class SearchResultsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.SearchResultsDocument
{
    private static final long serialVersionUID = 1L;
    
    public SearchResultsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHRESULTS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SearchResults");
    
    
    /**
     * Gets the "SearchResults" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SearchResults getSearchResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchResults)get_store().find_element_user(SEARCHRESULTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SearchResults" element
     */
    public boolean isNilSearchResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchResults)get_store().find_element_user(SEARCHRESULTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SearchResults" element
     */
    public void setSearchResults(com.microsoft.schemas.crm._2011.contracts.SearchResults searchResults)
    {
        generatedSetterHelperImpl(searchResults, SEARCHRESULTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SearchResults" element
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
     * Nils the "SearchResults" element
     */
    public void setNilSearchResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchResults)get_store().find_element_user(SEARCHRESULTS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.SearchResults)get_store().add_element_user(SEARCHRESULTS$0);
            }
            target.setNil();
        }
    }
}
