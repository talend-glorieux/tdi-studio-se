/*
 * XML Type:  ArrayOfArrayOfPrincipalAccess
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrincipalAccess
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfPrincipalAccess(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfPrincipalAccessImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrincipalAccess
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfPrincipalAccessImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPRINCIPALACCESS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfPrincipalAccess");
    
    
    /**
     * Gets array of all "ArrayOfPrincipalAccess" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess[] getArrayOfPrincipalAccessArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFPRINCIPALACCESS$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfPrincipalAccess" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess getArrayOfPrincipalAccessArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess)get_store().find_element_user(ARRAYOFPRINCIPALACCESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfPrincipalAccess" element
     */
    public boolean isNilArrayOfPrincipalAccessArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess)get_store().find_element_user(ARRAYOFPRINCIPALACCESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfPrincipalAccess" element
     */
    public int sizeOfArrayOfPrincipalAccessArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFPRINCIPALACCESS$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfPrincipalAccess" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfPrincipalAccessArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess[] arrayOfPrincipalAccessArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfPrincipalAccessArray, ARRAYOFPRINCIPALACCESS$0);
    }
    
    /**
     * Sets ith "ArrayOfPrincipalAccess" element
     */
    public void setArrayOfPrincipalAccessArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess arrayOfPrincipalAccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess)get_store().find_element_user(ARRAYOFPRINCIPALACCESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfPrincipalAccess);
        }
    }
    
    /**
     * Nils the ith "ArrayOfPrincipalAccess" element
     */
    public void setNilArrayOfPrincipalAccessArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess)get_store().find_element_user(ARRAYOFPRINCIPALACCESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfPrincipalAccess" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess insertNewArrayOfPrincipalAccess(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess)get_store().insert_element_user(ARRAYOFPRINCIPALACCESS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfPrincipalAccess" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess addNewArrayOfPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPrincipalAccess)get_store().add_element_user(ARRAYOFPRINCIPALACCESS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfPrincipalAccess" element
     */
    public void removeArrayOfPrincipalAccess(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFPRINCIPALACCESS$0, i);
        }
    }
}
