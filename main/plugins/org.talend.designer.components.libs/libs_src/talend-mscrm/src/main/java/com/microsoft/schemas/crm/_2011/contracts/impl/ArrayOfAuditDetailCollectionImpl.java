/*
 * XML Type:  ArrayOfAuditDetailCollection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfAuditDetailCollection(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfAuditDetailCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAuditDetailCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDITDETAILCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AuditDetailCollection");
    
    
    /**
     * Gets array of all "AuditDetailCollection" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection[] getAuditDetailCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUDITDETAILCOLLECTION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection[] result = new com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AuditDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection getAuditDetailCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection)get_store().find_element_user(AUDITDETAILCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AuditDetailCollection" element
     */
    public boolean isNilAuditDetailCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection)get_store().find_element_user(AUDITDETAILCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AuditDetailCollection" element
     */
    public int sizeOfAuditDetailCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUDITDETAILCOLLECTION$0);
        }
    }
    
    /**
     * Sets array of all "AuditDetailCollection" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAuditDetailCollectionArray(com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection[] auditDetailCollectionArray)
    {
        check_orphaned();
        arraySetterHelper(auditDetailCollectionArray, AUDITDETAILCOLLECTION$0);
    }
    
    /**
     * Sets ith "AuditDetailCollection" element
     */
    public void setAuditDetailCollectionArray(int i, com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection auditDetailCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection)get_store().find_element_user(AUDITDETAILCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(auditDetailCollection);
        }
    }
    
    /**
     * Nils the ith "AuditDetailCollection" element
     */
    public void setNilAuditDetailCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection)get_store().find_element_user(AUDITDETAILCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AuditDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection insertNewAuditDetailCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection)get_store().insert_element_user(AUDITDETAILCOLLECTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AuditDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection addNewAuditDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection)get_store().add_element_user(AUDITDETAILCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AuditDetailCollection" element
     */
    public void removeAuditDetailCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUDITDETAILCOLLECTION$0, i);
        }
    }
}
