/*
 * XML Type:  ArrayOfRolePrivilege
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfRolePrivilege(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfRolePrivilegeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRolePrivilegeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLEPRIVILEGE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "RolePrivilege");
    
    
    /**
     * Gets array of all "RolePrivilege" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.RolePrivilege[] getRolePrivilegeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLEPRIVILEGE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.RolePrivilege[] result = new com.microsoft.schemas.crm._2011.contracts.RolePrivilege[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RolePrivilege" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RolePrivilege getRolePrivilegeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilege)get_store().find_element_user(ROLEPRIVILEGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "RolePrivilege" element
     */
    public boolean isNilRolePrivilegeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilege)get_store().find_element_user(ROLEPRIVILEGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "RolePrivilege" element
     */
    public int sizeOfRolePrivilegeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLEPRIVILEGE$0);
        }
    }
    
    /**
     * Sets array of all "RolePrivilege" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRolePrivilegeArray(com.microsoft.schemas.crm._2011.contracts.RolePrivilege[] rolePrivilegeArray)
    {
        check_orphaned();
        arraySetterHelper(rolePrivilegeArray, ROLEPRIVILEGE$0);
    }
    
    /**
     * Sets ith "RolePrivilege" element
     */
    public void setRolePrivilegeArray(int i, com.microsoft.schemas.crm._2011.contracts.RolePrivilege rolePrivilege)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilege)get_store().find_element_user(ROLEPRIVILEGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rolePrivilege);
        }
    }
    
    /**
     * Nils the ith "RolePrivilege" element
     */
    public void setNilRolePrivilegeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilege)get_store().find_element_user(ROLEPRIVILEGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RolePrivilege" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RolePrivilege insertNewRolePrivilege(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilege)get_store().insert_element_user(ROLEPRIVILEGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RolePrivilege" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RolePrivilege addNewRolePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilege)get_store().add_element_user(ROLEPRIVILEGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RolePrivilege" element
     */
    public void removeRolePrivilege(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLEPRIVILEGE$0, i);
        }
    }
}
