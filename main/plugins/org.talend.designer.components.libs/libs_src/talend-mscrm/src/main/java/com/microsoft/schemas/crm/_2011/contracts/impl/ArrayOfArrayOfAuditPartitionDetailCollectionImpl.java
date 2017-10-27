/*
 * XML Type:  ArrayOfArrayOfAuditPartitionDetailCollection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetailCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfAuditPartitionDetailCollection(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfAuditPartitionDetailCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetailCollection
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfAuditPartitionDetailCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFAUDITPARTITIONDETAILCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAuditPartitionDetailCollection");
    
    
    /**
     * Gets array of all "ArrayOfAuditPartitionDetailCollection" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection[] getArrayOfAuditPartitionDetailCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFAUDITPARTITIONDETAILCOLLECTION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfAuditPartitionDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection getArrayOfAuditPartitionDetailCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection)get_store().find_element_user(ARRAYOFAUDITPARTITIONDETAILCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfAuditPartitionDetailCollection" element
     */
    public boolean isNilArrayOfAuditPartitionDetailCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection)get_store().find_element_user(ARRAYOFAUDITPARTITIONDETAILCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfAuditPartitionDetailCollection" element
     */
    public int sizeOfArrayOfAuditPartitionDetailCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFAUDITPARTITIONDETAILCOLLECTION$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfAuditPartitionDetailCollection" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfAuditPartitionDetailCollectionArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection[] arrayOfAuditPartitionDetailCollectionArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfAuditPartitionDetailCollectionArray, ARRAYOFAUDITPARTITIONDETAILCOLLECTION$0);
    }
    
    /**
     * Sets ith "ArrayOfAuditPartitionDetailCollection" element
     */
    public void setArrayOfAuditPartitionDetailCollectionArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection arrayOfAuditPartitionDetailCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection)get_store().find_element_user(ARRAYOFAUDITPARTITIONDETAILCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfAuditPartitionDetailCollection);
        }
    }
    
    /**
     * Nils the ith "ArrayOfAuditPartitionDetailCollection" element
     */
    public void setNilArrayOfAuditPartitionDetailCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection)get_store().find_element_user(ARRAYOFAUDITPARTITIONDETAILCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfAuditPartitionDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection insertNewArrayOfAuditPartitionDetailCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection)get_store().insert_element_user(ARRAYOFAUDITPARTITIONDETAILCOLLECTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfAuditPartitionDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection addNewArrayOfAuditPartitionDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection)get_store().add_element_user(ARRAYOFAUDITPARTITIONDETAILCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfAuditPartitionDetailCollection" element
     */
    public void removeArrayOfAuditPartitionDetailCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFAUDITPARTITIONDETAILCOLLECTION$0, i);
        }
    }
}
