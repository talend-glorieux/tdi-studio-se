/*
 * XML Type:  ArrayOfArrayOfShareAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfShareAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfShareAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfShareAuditDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfShareAuditDetail
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfShareAuditDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSHAREAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfShareAuditDetail");
    
    
    /**
     * Gets array of all "ArrayOfShareAuditDetail" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail[] getArrayOfShareAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFSHAREAUDITDETAIL$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfShareAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail getArrayOfShareAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail)get_store().find_element_user(ARRAYOFSHAREAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfShareAuditDetail" element
     */
    public boolean isNilArrayOfShareAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail)get_store().find_element_user(ARRAYOFSHAREAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfShareAuditDetail" element
     */
    public int sizeOfArrayOfShareAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFSHAREAUDITDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfShareAuditDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfShareAuditDetailArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail[] arrayOfShareAuditDetailArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfShareAuditDetailArray, ARRAYOFSHAREAUDITDETAIL$0);
    }
    
    /**
     * Sets ith "ArrayOfShareAuditDetail" element
     */
    public void setArrayOfShareAuditDetailArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail arrayOfShareAuditDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail)get_store().find_element_user(ARRAYOFSHAREAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfShareAuditDetail);
        }
    }
    
    /**
     * Nils the ith "ArrayOfShareAuditDetail" element
     */
    public void setNilArrayOfShareAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail)get_store().find_element_user(ARRAYOFSHAREAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfShareAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail insertNewArrayOfShareAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail)get_store().insert_element_user(ARRAYOFSHAREAUDITDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfShareAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail addNewArrayOfShareAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail)get_store().add_element_user(ARRAYOFSHAREAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfShareAuditDetail" element
     */
    public void removeArrayOfShareAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFSHAREAUDITDETAIL$0, i);
        }
    }
}
