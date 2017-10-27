/*
 * XML Type:  ArrayOfArrayOfAuditPartitionDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfAuditPartitionDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfAuditPartitionDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetail
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfAuditPartitionDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFAUDITPARTITIONDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAuditPartitionDetail");
    
    
    /**
     * Gets array of all "ArrayOfAuditPartitionDetail" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail[] getArrayOfAuditPartitionDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFAUDITPARTITIONDETAIL$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfAuditPartitionDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail getArrayOfAuditPartitionDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail)get_store().find_element_user(ARRAYOFAUDITPARTITIONDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfAuditPartitionDetail" element
     */
    public boolean isNilArrayOfAuditPartitionDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail)get_store().find_element_user(ARRAYOFAUDITPARTITIONDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfAuditPartitionDetail" element
     */
    public int sizeOfArrayOfAuditPartitionDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFAUDITPARTITIONDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfAuditPartitionDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfAuditPartitionDetailArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail[] arrayOfAuditPartitionDetailArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfAuditPartitionDetailArray, ARRAYOFAUDITPARTITIONDETAIL$0);
    }
    
    /**
     * Sets ith "ArrayOfAuditPartitionDetail" element
     */
    public void setArrayOfAuditPartitionDetailArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail arrayOfAuditPartitionDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail)get_store().find_element_user(ARRAYOFAUDITPARTITIONDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfAuditPartitionDetail);
        }
    }
    
    /**
     * Nils the ith "ArrayOfAuditPartitionDetail" element
     */
    public void setNilArrayOfAuditPartitionDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail)get_store().find_element_user(ARRAYOFAUDITPARTITIONDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfAuditPartitionDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail insertNewArrayOfAuditPartitionDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail)get_store().insert_element_user(ARRAYOFAUDITPARTITIONDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfAuditPartitionDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail addNewArrayOfAuditPartitionDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail)get_store().add_element_user(ARRAYOFAUDITPARTITIONDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfAuditPartitionDetail" element
     */
    public void removeArrayOfAuditPartitionDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFAUDITPARTITIONDETAIL$0, i);
        }
    }
}
