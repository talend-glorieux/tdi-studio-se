/*
 * XML Type:  ArrayOfAuditPartitionDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfAuditPartitionDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfAuditPartitionDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAuditPartitionDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDITPARTITIONDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AuditPartitionDetail");
    
    
    /**
     * Gets array of all "AuditPartitionDetail" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail[] getAuditPartitionDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUDITPARTITIONDETAIL$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail[] result = new com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AuditPartitionDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail getAuditPartitionDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail)get_store().find_element_user(AUDITPARTITIONDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AuditPartitionDetail" element
     */
    public boolean isNilAuditPartitionDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail)get_store().find_element_user(AUDITPARTITIONDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AuditPartitionDetail" element
     */
    public int sizeOfAuditPartitionDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUDITPARTITIONDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "AuditPartitionDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAuditPartitionDetailArray(com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail[] auditPartitionDetailArray)
    {
        check_orphaned();
        arraySetterHelper(auditPartitionDetailArray, AUDITPARTITIONDETAIL$0);
    }
    
    /**
     * Sets ith "AuditPartitionDetail" element
     */
    public void setAuditPartitionDetailArray(int i, com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail auditPartitionDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail)get_store().find_element_user(AUDITPARTITIONDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(auditPartitionDetail);
        }
    }
    
    /**
     * Nils the ith "AuditPartitionDetail" element
     */
    public void setNilAuditPartitionDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail)get_store().find_element_user(AUDITPARTITIONDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AuditPartitionDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail insertNewAuditPartitionDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail)get_store().insert_element_user(AUDITPARTITIONDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AuditPartitionDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail addNewAuditPartitionDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail)get_store().add_element_user(AUDITPARTITIONDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AuditPartitionDetail" element
     */
    public void removeAuditPartitionDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUDITPARTITIONDETAIL$0, i);
        }
    }
}
