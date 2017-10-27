/*
 * An XML document type.
 * Localname: ArrayOfSearchResults
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResultsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfSearchResults(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfSearchResultsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResultsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSearchResultsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSEARCHRESULTS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfSearchResults");
    
    
    /**
     * Gets the "ArrayOfSearchResults" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults getArrayOfSearchResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults)get_store().find_element_user(ARRAYOFSEARCHRESULTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfSearchResults" element
     */
    public boolean isNilArrayOfSearchResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults)get_store().find_element_user(ARRAYOFSEARCHRESULTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfSearchResults" element
     */
    public void setArrayOfSearchResults(com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults arrayOfSearchResults)
    {
        generatedSetterHelperImpl(arrayOfSearchResults, ARRAYOFSEARCHRESULTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfSearchResults" element
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
     * Nils the "ArrayOfSearchResults" element
     */
    public void setNilArrayOfSearchResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults)get_store().find_element_user(ARRAYOFSEARCHRESULTS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchResults)get_store().add_element_user(ARRAYOFSEARCHRESULTS$0);
            }
            target.setNil();
        }
    }
}
