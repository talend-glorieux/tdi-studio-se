/*
 * XML Type:  ArrayOfAuditPartitionDetailCollection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfAuditPartitionDetailCollection(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfAuditPartitionDetailCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAuditPartitionDetailCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDITPARTITIONDETAILCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AuditPartitionDetailCollection");
    
    
    /**
     * Gets array of all "AuditPartitionDetailCollection" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection[] getAuditPartitionDetailCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUDITPARTITIONDETAILCOLLECTION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection[] result = new com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AuditPartitionDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection getAuditPartitionDetailCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection)get_store().find_element_user(AUDITPARTITIONDETAILCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AuditPartitionDetailCollection" element
     */
    public boolean isNilAuditPartitionDetailCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection)get_store().find_element_user(AUDITPARTITIONDETAILCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AuditPartitionDetailCollection" element
     */
    public int sizeOfAuditPartitionDetailCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUDITPARTITIONDETAILCOLLECTION$0);
        }
    }
    
    /**
     * Sets array of all "AuditPartitionDetailCollection" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAuditPartitionDetailCollectionArray(com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection[] auditPartitionDetailCollectionArray)
    {
        check_orphaned();
        arraySetterHelper(auditPartitionDetailCollectionArray, AUDITPARTITIONDETAILCOLLECTION$0);
    }
    
    /**
     * Sets ith "AuditPartitionDetailCollection" element
     */
    public void setAuditPartitionDetailCollectionArray(int i, com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection auditPartitionDetailCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection)get_store().find_element_user(AUDITPARTITIONDETAILCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(auditPartitionDetailCollection);
        }
    }
    
    /**
     * Nils the ith "AuditPartitionDetailCollection" element
     */
    public void setNilAuditPartitionDetailCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection)get_store().find_element_user(AUDITPARTITIONDETAILCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AuditPartitionDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection insertNewAuditPartitionDetailCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection)get_store().insert_element_user(AUDITPARTITIONDETAILCOLLECTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AuditPartitionDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection addNewAuditPartitionDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection)get_store().add_element_user(AUDITPARTITIONDETAILCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AuditPartitionDetailCollection" element
     */
    public void removeAuditPartitionDetailCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUDITPARTITIONDETAILCOLLECTION$0, i);
        }
    }
}
