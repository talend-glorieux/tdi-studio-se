/*
 * XML Type:  ArrayOfAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfAuditDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAuditDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AuditDetail");
    
    
    /**
     * Gets array of all "AuditDetail" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditDetail[] getAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUDITDETAIL$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.AuditDetail[] result = new com.microsoft.schemas.crm._2011.contracts.AuditDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditDetail getAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetail)get_store().find_element_user(AUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AuditDetail" element
     */
    public boolean isNilAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetail)get_store().find_element_user(AUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AuditDetail" element
     */
    public int sizeOfAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUDITDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "AuditDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAuditDetailArray(com.microsoft.schemas.crm._2011.contracts.AuditDetail[] auditDetailArray)
    {
        check_orphaned();
        arraySetterHelper(auditDetailArray, AUDITDETAIL$0);
    }
    
    /**
     * Sets ith "AuditDetail" element
     */
    public void setAuditDetailArray(int i, com.microsoft.schemas.crm._2011.contracts.AuditDetail auditDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetail)get_store().find_element_user(AUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(auditDetail);
        }
    }
    
    /**
     * Nils the ith "AuditDetail" element
     */
    public void setNilAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetail)get_store().find_element_user(AUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditDetail insertNewAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetail)get_store().insert_element_user(AUDITDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditDetail addNewAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetail)get_store().add_element_user(AUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AuditDetail" element
     */
    public void removeAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUDITDETAIL$0, i);
        }
    }
}
