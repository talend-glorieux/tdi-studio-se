/*
 * An XML document type.
 * Localname: ArrayOfRibbonLocationFilters
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFiltersDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfRibbonLocationFilters(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfRibbonLocationFiltersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFiltersDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRibbonLocationFiltersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFRIBBONLOCATIONFILTERS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfRibbonLocationFilters");
    
    
    /**
     * Gets the "ArrayOfRibbonLocationFilters" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters getArrayOfRibbonLocationFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters)get_store().find_element_user(ARRAYOFRIBBONLOCATIONFILTERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfRibbonLocationFilters" element
     */
    public boolean isNilArrayOfRibbonLocationFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters)get_store().find_element_user(ARRAYOFRIBBONLOCATIONFILTERS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfRibbonLocationFilters" element
     */
    public void setArrayOfRibbonLocationFilters(com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters arrayOfRibbonLocationFilters)
    {
        generatedSetterHelperImpl(arrayOfRibbonLocationFilters, ARRAYOFRIBBONLOCATIONFILTERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfRibbonLocationFilters" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters addNewArrayOfRibbonLocationFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters)get_store().add_element_user(ARRAYOFRIBBONLOCATIONFILTERS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfRibbonLocationFilters" element
     */
    public void setNilArrayOfRibbonLocationFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters)get_store().find_element_user(ARRAYOFRIBBONLOCATIONFILTERS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters)get_store().add_element_user(ARRAYOFRIBBONLOCATIONFILTERS$0);
            }
            target.setNil();
        }
    }
}
