/*
 * XML Type:  ArrayOfPrincipalAccess
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfPrincipalAccess(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfPrincipalAccessImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfPrincipalAccessImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRINCIPALACCESS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "PrincipalAccess");
    
    
    /**
     * Gets array of all "PrincipalAccess" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.PrincipalAccess[] getPrincipalAccessArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRINCIPALACCESS$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.PrincipalAccess[] result = new com.microsoft.schemas.crm._2011.contracts.PrincipalAccess[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PrincipalAccess" element
     */
    public com.microsoft.schemas.crm._2011.contracts.PrincipalAccess getPrincipalAccessArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrincipalAccess)get_store().find_element_user(PRINCIPALACCESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "PrincipalAccess" element
     */
    public boolean isNilPrincipalAccessArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrincipalAccess)get_store().find_element_user(PRINCIPALACCESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "PrincipalAccess" element
     */
    public int sizeOfPrincipalAccessArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRINCIPALACCESS$0);
        }
    }
    
    /**
     * Sets array of all "PrincipalAccess" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPrincipalAccessArray(com.microsoft.schemas.crm._2011.contracts.PrincipalAccess[] principalAccessArray)
    {
        check_orphaned();
        arraySetterHelper(principalAccessArray, PRINCIPALACCESS$0);
    }
    
    /**
     * Sets ith "PrincipalAccess" element
     */
    public void setPrincipalAccessArray(int i, com.microsoft.schemas.crm._2011.contracts.PrincipalAccess principalAccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrincipalAccess)get_store().find_element_user(PRINCIPALACCESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(principalAccess);
        }
    }
    
    /**
     * Nils the ith "PrincipalAccess" element
     */
    public void setNilPrincipalAccessArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrincipalAccess)get_store().find_element_user(PRINCIPALACCESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PrincipalAccess" element
     */
    public com.microsoft.schemas.crm._2011.contracts.PrincipalAccess insertNewPrincipalAccess(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrincipalAccess)get_store().insert_element_user(PRINCIPALACCESS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PrincipalAccess" element
     */
    public com.microsoft.schemas.crm._2011.contracts.PrincipalAccess addNewPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrincipalAccess)get_store().add_element_user(PRINCIPALACCESS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "PrincipalAccess" element
     */
    public void removePrincipalAccess(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRINCIPALACCESS$0, i);
        }
    }
}
