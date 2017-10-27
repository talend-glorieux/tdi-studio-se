/*
 * XML Type:  ArrayOfArrayOfResetSyncStateInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResetSyncStateInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfResetSyncStateInfo(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfResetSyncStateInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResetSyncStateInfo
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfResetSyncStateInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFRESETSYNCSTATEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfResetSyncStateInfo");
    
    
    /**
     * Gets array of all "ArrayOfResetSyncStateInfo" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo[] getArrayOfResetSyncStateInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFRESETSYNCSTATEINFO$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfResetSyncStateInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo getArrayOfResetSyncStateInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo)get_store().find_element_user(ARRAYOFRESETSYNCSTATEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfResetSyncStateInfo" element
     */
    public boolean isNilArrayOfResetSyncStateInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo)get_store().find_element_user(ARRAYOFRESETSYNCSTATEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfResetSyncStateInfo" element
     */
    public int sizeOfArrayOfResetSyncStateInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFRESETSYNCSTATEINFO$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfResetSyncStateInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfResetSyncStateInfoArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo[] arrayOfResetSyncStateInfoArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfResetSyncStateInfoArray, ARRAYOFRESETSYNCSTATEINFO$0);
    }
    
    /**
     * Sets ith "ArrayOfResetSyncStateInfo" element
     */
    public void setArrayOfResetSyncStateInfoArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo arrayOfResetSyncStateInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo)get_store().find_element_user(ARRAYOFRESETSYNCSTATEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfResetSyncStateInfo);
        }
    }
    
    /**
     * Nils the ith "ArrayOfResetSyncStateInfo" element
     */
    public void setNilArrayOfResetSyncStateInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo)get_store().find_element_user(ARRAYOFRESETSYNCSTATEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfResetSyncStateInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo insertNewArrayOfResetSyncStateInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo)get_store().insert_element_user(ARRAYOFRESETSYNCSTATEINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfResetSyncStateInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo addNewArrayOfResetSyncStateInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo)get_store().add_element_user(ARRAYOFRESETSYNCSTATEINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfResetSyncStateInfo" element
     */
    public void removeArrayOfResetSyncStateInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFRESETSYNCSTATEINFO$0, i);
        }
    }
}
