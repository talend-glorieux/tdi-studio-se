/*
 * XML Type:  ArrayOfArrayOfAuditDetailCollection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetailCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfAuditDetailCollection(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfAuditDetailCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetailCollection
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfAuditDetailCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFAUDITDETAILCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAuditDetailCollection");
    
    
    /**
     * Gets array of all "ArrayOfAuditDetailCollection" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection[] getArrayOfAuditDetailCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFAUDITDETAILCOLLECTION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfAuditDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection getArrayOfAuditDetailCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection)get_store().find_element_user(ARRAYOFAUDITDETAILCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfAuditDetailCollection" element
     */
    public boolean isNilArrayOfAuditDetailCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection)get_store().find_element_user(ARRAYOFAUDITDETAILCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfAuditDetailCollection" element
     */
    public int sizeOfArrayOfAuditDetailCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFAUDITDETAILCOLLECTION$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfAuditDetailCollection" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfAuditDetailCollectionArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection[] arrayOfAuditDetailCollectionArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfAuditDetailCollectionArray, ARRAYOFAUDITDETAILCOLLECTION$0);
    }
    
    /**
     * Sets ith "ArrayOfAuditDetailCollection" element
     */
    public void setArrayOfAuditDetailCollectionArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection arrayOfAuditDetailCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection)get_store().find_element_user(ARRAYOFAUDITDETAILCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfAuditDetailCollection);
        }
    }
    
    /**
     * Nils the ith "ArrayOfAuditDetailCollection" element
     */
    public void setNilArrayOfAuditDetailCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection)get_store().find_element_user(ARRAYOFAUDITDETAILCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfAuditDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection insertNewArrayOfAuditDetailCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection)get_store().insert_element_user(ARRAYOFAUDITDETAILCOLLECTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfAuditDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection addNewArrayOfAuditDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection)get_store().add_element_user(ARRAYOFAUDITDETAILCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfAuditDetailCollection" element
     */
    public void removeArrayOfAuditDetailCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFAUDITDETAILCOLLECTION$0, i);
        }
    }
}
