/*
 * XML Type:  ArrayOfArrayOfRibbonLocationFilters
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRibbonLocationFilters
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfRibbonLocationFilters(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfRibbonLocationFiltersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRibbonLocationFilters
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfRibbonLocationFiltersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFRIBBONLOCATIONFILTERS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfRibbonLocationFilters");
    
    
    /**
     * Gets array of all "ArrayOfRibbonLocationFilters" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters[] getArrayOfRibbonLocationFiltersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFRIBBONLOCATIONFILTERS$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfRibbonLocationFilters" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters getArrayOfRibbonLocationFiltersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters)get_store().find_element_user(ARRAYOFRIBBONLOCATIONFILTERS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfRibbonLocationFilters" element
     */
    public boolean isNilArrayOfRibbonLocationFiltersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters)get_store().find_element_user(ARRAYOFRIBBONLOCATIONFILTERS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfRibbonLocationFilters" element
     */
    public int sizeOfArrayOfRibbonLocationFiltersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFRIBBONLOCATIONFILTERS$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfRibbonLocationFilters" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfRibbonLocationFiltersArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters[] arrayOfRibbonLocationFiltersArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfRibbonLocationFiltersArray, ARRAYOFRIBBONLOCATIONFILTERS$0);
    }
    
    /**
     * Sets ith "ArrayOfRibbonLocationFilters" element
     */
    public void setArrayOfRibbonLocationFiltersArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters arrayOfRibbonLocationFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters)get_store().find_element_user(ARRAYOFRIBBONLOCATIONFILTERS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfRibbonLocationFilters);
        }
    }
    
    /**
     * Nils the ith "ArrayOfRibbonLocationFilters" element
     */
    public void setNilArrayOfRibbonLocationFiltersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters)get_store().find_element_user(ARRAYOFRIBBONLOCATIONFILTERS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfRibbonLocationFilters" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters insertNewArrayOfRibbonLocationFilters(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters)get_store().insert_element_user(ARRAYOFRIBBONLOCATIONFILTERS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfRibbonLocationFilters" element
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
     * Removes the ith "ArrayOfRibbonLocationFilters" element
     */
    public void removeArrayOfRibbonLocationFilters(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFRIBBONLOCATIONFILTERS$0, i);
        }
    }
}
