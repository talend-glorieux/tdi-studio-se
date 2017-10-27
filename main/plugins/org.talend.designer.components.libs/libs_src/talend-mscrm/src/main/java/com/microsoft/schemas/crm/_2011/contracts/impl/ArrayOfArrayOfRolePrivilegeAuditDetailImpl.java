/*
 * XML Type:  ArrayOfArrayOfRolePrivilegeAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilegeAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfRolePrivilegeAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfRolePrivilegeAuditDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilegeAuditDetail
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfRolePrivilegeAuditDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFROLEPRIVILEGEAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfRolePrivilegeAuditDetail");
    
    
    /**
     * Gets array of all "ArrayOfRolePrivilegeAuditDetail" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail[] getArrayOfRolePrivilegeAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFROLEPRIVILEGEAUDITDETAIL$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfRolePrivilegeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail getArrayOfRolePrivilegeAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail)get_store().find_element_user(ARRAYOFROLEPRIVILEGEAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfRolePrivilegeAuditDetail" element
     */
    public boolean isNilArrayOfRolePrivilegeAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail)get_store().find_element_user(ARRAYOFROLEPRIVILEGEAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfRolePrivilegeAuditDetail" element
     */
    public int sizeOfArrayOfRolePrivilegeAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFROLEPRIVILEGEAUDITDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfRolePrivilegeAuditDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfRolePrivilegeAuditDetailArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail[] arrayOfRolePrivilegeAuditDetailArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfRolePrivilegeAuditDetailArray, ARRAYOFROLEPRIVILEGEAUDITDETAIL$0);
    }
    
    /**
     * Sets ith "ArrayOfRolePrivilegeAuditDetail" element
     */
    public void setArrayOfRolePrivilegeAuditDetailArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail arrayOfRolePrivilegeAuditDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail)get_store().find_element_user(ARRAYOFROLEPRIVILEGEAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfRolePrivilegeAuditDetail);
        }
    }
    
    /**
     * Nils the ith "ArrayOfRolePrivilegeAuditDetail" element
     */
    public void setNilArrayOfRolePrivilegeAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail)get_store().find_element_user(ARRAYOFROLEPRIVILEGEAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfRolePrivilegeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail insertNewArrayOfRolePrivilegeAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail)get_store().insert_element_user(ARRAYOFROLEPRIVILEGEAUDITDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfRolePrivilegeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail addNewArrayOfRolePrivilegeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail)get_store().add_element_user(ARRAYOFROLEPRIVILEGEAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfRolePrivilegeAuditDetail" element
     */
    public void removeArrayOfRolePrivilegeAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFROLEPRIVILEGEAUDITDETAIL$0, i);
        }
    }
}
