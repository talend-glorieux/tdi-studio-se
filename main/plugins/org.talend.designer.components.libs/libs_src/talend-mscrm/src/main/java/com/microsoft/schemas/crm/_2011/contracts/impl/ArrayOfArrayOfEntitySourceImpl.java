/*
 * XML Type:  ArrayOfArrayOfEntitySource
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfEntitySource
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfEntitySource(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfEntitySourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfEntitySource
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfEntitySourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFENTITYSOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfEntitySource");
    
    
    /**
     * Gets array of all "ArrayOfEntitySource" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource[] getArrayOfEntitySourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFENTITYSOURCE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfEntitySource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource getArrayOfEntitySourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource)get_store().find_element_user(ARRAYOFENTITYSOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfEntitySource" element
     */
    public boolean isNilArrayOfEntitySourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource)get_store().find_element_user(ARRAYOFENTITYSOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfEntitySource" element
     */
    public int sizeOfArrayOfEntitySourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFENTITYSOURCE$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfEntitySource" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfEntitySourceArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource[] arrayOfEntitySourceArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfEntitySourceArray, ARRAYOFENTITYSOURCE$0);
    }
    
    /**
     * Sets ith "ArrayOfEntitySource" element
     */
    public void setArrayOfEntitySourceArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource arrayOfEntitySource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource)get_store().find_element_user(ARRAYOFENTITYSOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfEntitySource);
        }
    }
    
    /**
     * Nils the ith "ArrayOfEntitySource" element
     */
    public void setNilArrayOfEntitySourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource)get_store().find_element_user(ARRAYOFENTITYSOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfEntitySource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource insertNewArrayOfEntitySource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource)get_store().insert_element_user(ARRAYOFENTITYSOURCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfEntitySource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource addNewArrayOfEntitySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource)get_store().add_element_user(ARRAYOFENTITYSOURCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfEntitySource" element
     */
    public void removeArrayOfEntitySource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFENTITYSOURCE$0, i);
        }
    }
}
