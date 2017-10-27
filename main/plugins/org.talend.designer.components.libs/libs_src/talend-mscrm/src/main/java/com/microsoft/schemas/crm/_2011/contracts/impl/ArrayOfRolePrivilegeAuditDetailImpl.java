/*
 * XML Type:  ArrayOfRolePrivilegeAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfRolePrivilegeAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfRolePrivilegeAuditDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRolePrivilegeAuditDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLEPRIVILEGEAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "RolePrivilegeAuditDetail");
    
    
    /**
     * Gets array of all "RolePrivilegeAuditDetail" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail[] getRolePrivilegeAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLEPRIVILEGEAUDITDETAIL$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail[] result = new com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RolePrivilegeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail getRolePrivilegeAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail)get_store().find_element_user(ROLEPRIVILEGEAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "RolePrivilegeAuditDetail" element
     */
    public boolean isNilRolePrivilegeAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail)get_store().find_element_user(ROLEPRIVILEGEAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "RolePrivilegeAuditDetail" element
     */
    public int sizeOfRolePrivilegeAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLEPRIVILEGEAUDITDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "RolePrivilegeAuditDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRolePrivilegeAuditDetailArray(com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail[] rolePrivilegeAuditDetailArray)
    {
        check_orphaned();
        arraySetterHelper(rolePrivilegeAuditDetailArray, ROLEPRIVILEGEAUDITDETAIL$0);
    }
    
    /**
     * Sets ith "RolePrivilegeAuditDetail" element
     */
    public void setRolePrivilegeAuditDetailArray(int i, com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail rolePrivilegeAuditDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail)get_store().find_element_user(ROLEPRIVILEGEAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rolePrivilegeAuditDetail);
        }
    }
    
    /**
     * Nils the ith "RolePrivilegeAuditDetail" element
     */
    public void setNilRolePrivilegeAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail)get_store().find_element_user(ROLEPRIVILEGEAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RolePrivilegeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail insertNewRolePrivilegeAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail)get_store().insert_element_user(ROLEPRIVILEGEAUDITDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RolePrivilegeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail addNewRolePrivilegeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail)get_store().add_element_user(ROLEPRIVILEGEAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RolePrivilegeAuditDetail" element
     */
    public void removeRolePrivilegeAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLEPRIVILEGEAUDITDETAIL$0, i);
        }
    }
}
