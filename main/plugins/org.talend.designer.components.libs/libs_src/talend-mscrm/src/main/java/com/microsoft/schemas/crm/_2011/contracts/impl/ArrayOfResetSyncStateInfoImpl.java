/*
 * XML Type:  ArrayOfResetSyncStateInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfResetSyncStateInfo(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfResetSyncStateInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfResetSyncStateInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESETSYNCSTATEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ResetSyncStateInfo");
    
    
    /**
     * Gets array of all "ResetSyncStateInfo" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo[] getResetSyncStateInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESETSYNCSTATEINFO$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo[] result = new com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ResetSyncStateInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo getResetSyncStateInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo)get_store().find_element_user(RESETSYNCSTATEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ResetSyncStateInfo" element
     */
    public boolean isNilResetSyncStateInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo)get_store().find_element_user(RESETSYNCSTATEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ResetSyncStateInfo" element
     */
    public int sizeOfResetSyncStateInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESETSYNCSTATEINFO$0);
        }
    }
    
    /**
     * Sets array of all "ResetSyncStateInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResetSyncStateInfoArray(com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo[] resetSyncStateInfoArray)
    {
        check_orphaned();
        arraySetterHelper(resetSyncStateInfoArray, RESETSYNCSTATEINFO$0);
    }
    
    /**
     * Sets ith "ResetSyncStateInfo" element
     */
    public void setResetSyncStateInfoArray(int i, com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo resetSyncStateInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo)get_store().find_element_user(RESETSYNCSTATEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resetSyncStateInfo);
        }
    }
    
    /**
     * Nils the ith "ResetSyncStateInfo" element
     */
    public void setNilResetSyncStateInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo)get_store().find_element_user(RESETSYNCSTATEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ResetSyncStateInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo insertNewResetSyncStateInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo)get_store().insert_element_user(RESETSYNCSTATEINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ResetSyncStateInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo addNewResetSyncStateInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo)get_store().add_element_user(RESETSYNCSTATEINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ResetSyncStateInfo" element
     */
    public void removeResetSyncStateInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESETSYNCSTATEINFO$0, i);
        }
    }
}
