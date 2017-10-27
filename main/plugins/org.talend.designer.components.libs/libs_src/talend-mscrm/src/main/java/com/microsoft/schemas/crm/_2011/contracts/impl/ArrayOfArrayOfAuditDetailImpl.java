/*
 * XML Type:  ArrayOfArrayOfAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfAuditDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetail
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfAuditDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAuditDetail");
    
    
    /**
     * Gets array of all "ArrayOfAuditDetail" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail[] getArrayOfAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFAUDITDETAIL$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail getArrayOfAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail)get_store().find_element_user(ARRAYOFAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfAuditDetail" element
     */
    public boolean isNilArrayOfAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail)get_store().find_element_user(ARRAYOFAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfAuditDetail" element
     */
    public int sizeOfArrayOfAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFAUDITDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfAuditDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfAuditDetailArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail[] arrayOfAuditDetailArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfAuditDetailArray, ARRAYOFAUDITDETAIL$0);
    }
    
    /**
     * Sets ith "ArrayOfAuditDetail" element
     */
    public void setArrayOfAuditDetailArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail arrayOfAuditDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail)get_store().find_element_user(ARRAYOFAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfAuditDetail);
        }
    }
    
    /**
     * Nils the ith "ArrayOfAuditDetail" element
     */
    public void setNilArrayOfAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail)get_store().find_element_user(ARRAYOFAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail insertNewArrayOfAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail)get_store().insert_element_user(ARRAYOFAUDITDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail addNewArrayOfAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail)get_store().add_element_user(ARRAYOFAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfAuditDetail" element
     */
    public void removeArrayOfAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFAUDITDETAIL$0, i);
        }
    }
}
