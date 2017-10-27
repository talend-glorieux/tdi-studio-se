/*
 * XML Type:  ArrayOfRibbonLocationFilters
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfRibbonLocationFilters(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfRibbonLocationFiltersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfRibbonLocationFilters
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRibbonLocationFiltersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RIBBONLOCATIONFILTERS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "RibbonLocationFilters");
    
    
    /**
     * Gets array of all "RibbonLocationFilters" elements
     */
    public java.util.List[] getRibbonLocationFiltersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RIBBONLOCATIONFILTERS$0, targetList);
            java.util.List[] result = new java.util.List[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getListValue();
            return result;
        }
    }
    
    /**
     * Gets ith "RibbonLocationFilters" element
     */
    public java.util.List getRibbonLocationFiltersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIBBONLOCATIONFILTERS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "RibbonLocationFilters" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters[] xgetRibbonLocationFiltersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RIBBONLOCATIONFILTERS$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters[] result = new com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "RibbonLocationFilters" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters xgetRibbonLocationFiltersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters)get_store().find_element_user(RIBBONLOCATIONFILTERS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RibbonLocationFilters" element
     */
    public int sizeOfRibbonLocationFiltersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIBBONLOCATIONFILTERS$0);
        }
    }
    
    /**
     * Sets array of all "RibbonLocationFilters" element
     */
    public void setRibbonLocationFiltersArray(java.util.List[] ribbonLocationFiltersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ribbonLocationFiltersArray, RIBBONLOCATIONFILTERS$0);
        }
    }
    
    /**
     * Sets ith "RibbonLocationFilters" element
     */
    public void setRibbonLocationFiltersArray(int i, java.util.List ribbonLocationFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIBBONLOCATIONFILTERS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setListValue(ribbonLocationFilters);
        }
    }
    
    /**
     * Sets (as xml) array of all "RibbonLocationFilters" element
     */
    public void xsetRibbonLocationFiltersArray(com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters[]ribbonLocationFiltersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ribbonLocationFiltersArray, RIBBONLOCATIONFILTERS$0);
        }
    }
    
    /**
     * Sets (as xml) ith "RibbonLocationFilters" element
     */
    public void xsetRibbonLocationFiltersArray(int i, com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters ribbonLocationFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters)get_store().find_element_user(RIBBONLOCATIONFILTERS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ribbonLocationFilters);
        }
    }
    
    /**
     * Inserts the value as the ith "RibbonLocationFilters" element
     */
    public void insertRibbonLocationFilters(int i, java.util.List ribbonLocationFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(RIBBONLOCATIONFILTERS$0, i);
            target.setListValue(ribbonLocationFilters);
        }
    }
    
    /**
     * Appends the value as the last "RibbonLocationFilters" element
     */
    public void addRibbonLocationFilters(java.util.List ribbonLocationFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RIBBONLOCATIONFILTERS$0);
            target.setListValue(ribbonLocationFilters);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RibbonLocationFilters" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters insertNewRibbonLocationFilters(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters)get_store().insert_element_user(RIBBONLOCATIONFILTERS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RibbonLocationFilters" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters addNewRibbonLocationFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters)get_store().add_element_user(RIBBONLOCATIONFILTERS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RibbonLocationFilters" element
     */
    public void removeRibbonLocationFilters(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIBBONLOCATIONFILTERS$0, i);
        }
    }
}
