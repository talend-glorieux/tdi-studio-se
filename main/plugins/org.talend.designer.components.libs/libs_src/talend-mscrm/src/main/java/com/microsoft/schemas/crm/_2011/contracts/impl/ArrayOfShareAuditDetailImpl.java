/*
 * XML Type:  ArrayOfShareAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfShareAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfShareAuditDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfShareAuditDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHAREAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ShareAuditDetail");
    
    
    /**
     * Gets array of all "ShareAuditDetail" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail[] getShareAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHAREAUDITDETAIL$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail[] result = new com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ShareAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail getShareAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail)get_store().find_element_user(SHAREAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ShareAuditDetail" element
     */
    public boolean isNilShareAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail)get_store().find_element_user(SHAREAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ShareAuditDetail" element
     */
    public int sizeOfShareAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHAREAUDITDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "ShareAuditDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setShareAuditDetailArray(com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail[] shareAuditDetailArray)
    {
        check_orphaned();
        arraySetterHelper(shareAuditDetailArray, SHAREAUDITDETAIL$0);
    }
    
    /**
     * Sets ith "ShareAuditDetail" element
     */
    public void setShareAuditDetailArray(int i, com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail shareAuditDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail)get_store().find_element_user(SHAREAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(shareAuditDetail);
        }
    }
    
    /**
     * Nils the ith "ShareAuditDetail" element
     */
    public void setNilShareAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail)get_store().find_element_user(SHAREAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ShareAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail insertNewShareAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail)get_store().insert_element_user(SHAREAUDITDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ShareAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail addNewShareAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail)get_store().add_element_user(SHAREAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ShareAuditDetail" element
     */
    public void removeShareAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHAREAUDITDETAIL$0, i);
        }
    }
}
