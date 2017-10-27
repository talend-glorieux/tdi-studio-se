/*
 * An XML document type.
 * Localname: ArrayOfArrayOfSearchResults
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchResultsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfSearchResults(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfSearchResultsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchResultsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfSearchResultsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFSEARCHRESULTS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfSearchResults");
    
    
    /**
     * Gets the "ArrayOfArrayOfSearchResults" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchResults getArrayOfArrayOfSearchResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchResults)get_store().find_element_user(ARRAYOFARRAYOFSEARCHRESULTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfSearchResults" element
     */
    public boolean isNilArrayOfArrayOfSearchResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchResults)get_store().find_element_user(ARRAYOFARRAYOFSEARCHRESULTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfSearchResults" element
     */
    public void setArrayOfArrayOfSearchResults(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchResults arrayOfArrayOfSearchResults)
    {
        generatedSetterHelperImpl(arrayOfArrayOfSearchResults, ARRAYOFARRAYOFSEARCHRESULTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfSearchResults" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchResults addNewArrayOfArrayOfSearchResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchResults)get_store().add_element_user(ARRAYOFARRAYOFSEARCHRESULTS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfSearchResults" element
     */
    public void setNilArrayOfArrayOfSearchResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchResults target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchResults)get_store().find_element_user(ARRAYOFARRAYOFSEARCHRESULTS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchResults)get_store().add_element_user(ARRAYOFARRAYOFSEARCHRESULTS$0);
            }
            target.setNil();
        }
    }
}
