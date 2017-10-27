/*
 * XML Type:  ArrayOfArrayOfUserAccessAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfUserAccessAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfUserAccessAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfUserAccessAuditDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfUserAccessAuditDetail
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfUserAccessAuditDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFUSERACCESSAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfUserAccessAuditDetail");
    
    
    /**
     * Gets array of all "ArrayOfUserAccessAuditDetail" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail[] getArrayOfUserAccessAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFUSERACCESSAUDITDETAIL$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfUserAccessAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail getArrayOfUserAccessAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail)get_store().find_element_user(ARRAYOFUSERACCESSAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfUserAccessAuditDetail" element
     */
    public boolean isNilArrayOfUserAccessAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail)get_store().find_element_user(ARRAYOFUSERACCESSAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfUserAccessAuditDetail" element
     */
    public int sizeOfArrayOfUserAccessAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFUSERACCESSAUDITDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfUserAccessAuditDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfUserAccessAuditDetailArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail[] arrayOfUserAccessAuditDetailArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfUserAccessAuditDetailArray, ARRAYOFUSERACCESSAUDITDETAIL$0);
    }
    
    /**
     * Sets ith "ArrayOfUserAccessAuditDetail" element
     */
    public void setArrayOfUserAccessAuditDetailArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail arrayOfUserAccessAuditDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail)get_store().find_element_user(ARRAYOFUSERACCESSAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfUserAccessAuditDetail);
        }
    }
    
    /**
     * Nils the ith "ArrayOfUserAccessAuditDetail" element
     */
    public void setNilArrayOfUserAccessAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail)get_store().find_element_user(ARRAYOFUSERACCESSAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfUserAccessAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail insertNewArrayOfUserAccessAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail)get_store().insert_element_user(ARRAYOFUSERACCESSAUDITDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfUserAccessAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail addNewArrayOfUserAccessAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail)get_store().add_element_user(ARRAYOFUSERACCESSAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfUserAccessAuditDetail" element
     */
    public void removeArrayOfUserAccessAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFUSERACCESSAUDITDETAIL$0, i);
        }
    }
}
