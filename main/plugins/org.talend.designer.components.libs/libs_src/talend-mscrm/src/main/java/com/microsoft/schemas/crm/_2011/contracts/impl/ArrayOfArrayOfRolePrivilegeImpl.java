/*
 * XML Type:  ArrayOfArrayOfRolePrivilege
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilege
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfRolePrivilege(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfRolePrivilegeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilege
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfRolePrivilegeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFROLEPRIVILEGE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfRolePrivilege");
    
    
    /**
     * Gets array of all "ArrayOfRolePrivilege" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege[] getArrayOfRolePrivilegeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFROLEPRIVILEGE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfRolePrivilege" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege getArrayOfRolePrivilegeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().find_element_user(ARRAYOFROLEPRIVILEGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfRolePrivilege" element
     */
    public boolean isNilArrayOfRolePrivilegeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().find_element_user(ARRAYOFROLEPRIVILEGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfRolePrivilege" element
     */
    public int sizeOfArrayOfRolePrivilegeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFROLEPRIVILEGE$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfRolePrivilege" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfRolePrivilegeArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege[] arrayOfRolePrivilegeArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfRolePrivilegeArray, ARRAYOFROLEPRIVILEGE$0);
    }
    
    /**
     * Sets ith "ArrayOfRolePrivilege" element
     */
    public void setArrayOfRolePrivilegeArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege arrayOfRolePrivilege)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().find_element_user(ARRAYOFROLEPRIVILEGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfRolePrivilege);
        }
    }
    
    /**
     * Nils the ith "ArrayOfRolePrivilege" element
     */
    public void setNilArrayOfRolePrivilegeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().find_element_user(ARRAYOFROLEPRIVILEGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfRolePrivilege" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege insertNewArrayOfRolePrivilege(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().insert_element_user(ARRAYOFROLEPRIVILEGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfRolePrivilege" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege addNewArrayOfRolePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().add_element_user(ARRAYOFROLEPRIVILEGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfRolePrivilege" element
     */
    public void removeArrayOfRolePrivilege(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFROLEPRIVILEGE$0, i);
        }
    }
}
