/*
 * An XML document type.
 * Localname: ArrayOfArrayOfRibbonLocationFilters
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRibbonLocationFiltersDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfRibbonLocationFilters(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfRibbonLocationFiltersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRibbonLocationFiltersDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfRibbonLocationFiltersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFRIBBONLOCATIONFILTERS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfRibbonLocationFilters");
    
    
    /**
     * Gets the "ArrayOfArrayOfRibbonLocationFilters" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRibbonLocationFilters getArrayOfArrayOfRibbonLocationFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRibbonLocationFilters)get_store().find_element_user(ARRAYOFARRAYOFRIBBONLOCATIONFILTERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfRibbonLocationFilters" element
     */
    public boolean isNilArrayOfArrayOfRibbonLocationFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRibbonLocationFilters)get_store().find_element_user(ARRAYOFARRAYOFRIBBONLOCATIONFILTERS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfRibbonLocationFilters" element
     */
    public void setArrayOfArrayOfRibbonLocationFilters(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRibbonLocationFilters arrayOfArrayOfRibbonLocationFilters)
    {
        generatedSetterHelperImpl(arrayOfArrayOfRibbonLocationFilters, ARRAYOFARRAYOFRIBBONLOCATIONFILTERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfRibbonLocationFilters" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRibbonLocationFilters addNewArrayOfArrayOfRibbonLocationFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRibbonLocationFilters)get_store().add_element_user(ARRAYOFARRAYOFRIBBONLOCATIONFILTERS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfRibbonLocationFilters" element
     */
    public void setNilArrayOfArrayOfRibbonLocationFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRibbonLocationFilters)get_store().find_element_user(ARRAYOFARRAYOFRIBBONLOCATIONFILTERS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRibbonLocationFilters)get_store().add_element_user(ARRAYOFARRAYOFRIBBONLOCATIONFILTERS$0);
            }
            target.setNil();
        }
    }
}
