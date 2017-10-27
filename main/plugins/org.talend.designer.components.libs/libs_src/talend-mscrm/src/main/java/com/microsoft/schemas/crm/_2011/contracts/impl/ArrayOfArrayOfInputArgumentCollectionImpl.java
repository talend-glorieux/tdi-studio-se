/*
 * XML Type:  ArrayOfArrayOfInputArgumentCollection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfInputArgumentCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfInputArgumentCollection(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfInputArgumentCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfInputArgumentCollection
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfInputArgumentCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFINPUTARGUMENTCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfInputArgumentCollection");
    
    
    /**
     * Gets array of all "ArrayOfInputArgumentCollection" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection[] getArrayOfInputArgumentCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFINPUTARGUMENTCOLLECTION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfInputArgumentCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection getArrayOfInputArgumentCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection)get_store().find_element_user(ARRAYOFINPUTARGUMENTCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfInputArgumentCollection" element
     */
    public boolean isNilArrayOfInputArgumentCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection)get_store().find_element_user(ARRAYOFINPUTARGUMENTCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfInputArgumentCollection" element
     */
    public int sizeOfArrayOfInputArgumentCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFINPUTARGUMENTCOLLECTION$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfInputArgumentCollection" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfInputArgumentCollectionArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection[] arrayOfInputArgumentCollectionArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfInputArgumentCollectionArray, ARRAYOFINPUTARGUMENTCOLLECTION$0);
    }
    
    /**
     * Sets ith "ArrayOfInputArgumentCollection" element
     */
    public void setArrayOfInputArgumentCollectionArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection arrayOfInputArgumentCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection)get_store().find_element_user(ARRAYOFINPUTARGUMENTCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfInputArgumentCollection);
        }
    }
    
    /**
     * Nils the ith "ArrayOfInputArgumentCollection" element
     */
    public void setNilArrayOfInputArgumentCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection)get_store().find_element_user(ARRAYOFINPUTARGUMENTCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfInputArgumentCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection insertNewArrayOfInputArgumentCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection)get_store().insert_element_user(ARRAYOFINPUTARGUMENTCOLLECTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfInputArgumentCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection addNewArrayOfInputArgumentCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection)get_store().add_element_user(ARRAYOFINPUTARGUMENTCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfInputArgumentCollection" element
     */
    public void removeArrayOfInputArgumentCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFINPUTARGUMENTCOLLECTION$0, i);
        }
    }
}
