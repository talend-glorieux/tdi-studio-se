/*
 * XML Type:  ArrayOfArrayOfSyncAction
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSyncAction
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfSyncAction(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfSyncActionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSyncAction
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfSyncActionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSYNCACTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfSyncAction");
    
    
    /**
     * Gets array of all "ArrayOfSyncAction" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction[] getArrayOfSyncActionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFSYNCACTION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfSyncAction" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction getArrayOfSyncActionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction)get_store().find_element_user(ARRAYOFSYNCACTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfSyncAction" element
     */
    public boolean isNilArrayOfSyncActionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction)get_store().find_element_user(ARRAYOFSYNCACTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfSyncAction" element
     */
    public int sizeOfArrayOfSyncActionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFSYNCACTION$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfSyncAction" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfSyncActionArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction[] arrayOfSyncActionArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfSyncActionArray, ARRAYOFSYNCACTION$0);
    }
    
    /**
     * Sets ith "ArrayOfSyncAction" element
     */
    public void setArrayOfSyncActionArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction arrayOfSyncAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction)get_store().find_element_user(ARRAYOFSYNCACTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfSyncAction);
        }
    }
    
    /**
     * Nils the ith "ArrayOfSyncAction" element
     */
    public void setNilArrayOfSyncActionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction)get_store().find_element_user(ARRAYOFSYNCACTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfSyncAction" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction insertNewArrayOfSyncAction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction)get_store().insert_element_user(ARRAYOFSYNCACTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfSyncAction" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction addNewArrayOfSyncAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction)get_store().add_element_user(ARRAYOFSYNCACTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfSyncAction" element
     */
    public void removeArrayOfSyncAction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFSYNCACTION$0, i);
        }
    }
}
