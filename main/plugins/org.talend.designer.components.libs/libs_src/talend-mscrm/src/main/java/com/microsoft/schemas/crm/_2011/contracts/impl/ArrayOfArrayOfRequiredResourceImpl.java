/*
 * XML Type:  ArrayOfArrayOfRequiredResource
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRequiredResource
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfRequiredResource(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfRequiredResourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRequiredResource
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfRequiredResourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFREQUIREDRESOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfRequiredResource");
    
    
    /**
     * Gets array of all "ArrayOfRequiredResource" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource[] getArrayOfRequiredResourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFREQUIREDRESOURCE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfRequiredResource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource getArrayOfRequiredResourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource)get_store().find_element_user(ARRAYOFREQUIREDRESOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfRequiredResource" element
     */
    public boolean isNilArrayOfRequiredResourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource)get_store().find_element_user(ARRAYOFREQUIREDRESOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfRequiredResource" element
     */
    public int sizeOfArrayOfRequiredResourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFREQUIREDRESOURCE$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfRequiredResource" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfRequiredResourceArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource[] arrayOfRequiredResourceArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfRequiredResourceArray, ARRAYOFREQUIREDRESOURCE$0);
    }
    
    /**
     * Sets ith "ArrayOfRequiredResource" element
     */
    public void setArrayOfRequiredResourceArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource arrayOfRequiredResource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource)get_store().find_element_user(ARRAYOFREQUIREDRESOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfRequiredResource);
        }
    }
    
    /**
     * Nils the ith "ArrayOfRequiredResource" element
     */
    public void setNilArrayOfRequiredResourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource)get_store().find_element_user(ARRAYOFREQUIREDRESOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfRequiredResource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource insertNewArrayOfRequiredResource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource)get_store().insert_element_user(ARRAYOFREQUIREDRESOURCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfRequiredResource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource addNewArrayOfRequiredResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource)get_store().add_element_user(ARRAYOFREQUIREDRESOURCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfRequiredResource" element
     */
    public void removeArrayOfRequiredResource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFREQUIREDRESOURCE$0, i);
        }
    }
}
