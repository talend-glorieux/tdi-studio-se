/*
 * XML Type:  ArrayOfSyncAction
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfSyncAction(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfSyncActionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSyncActionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYNCACTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SyncAction");
    
    
    /**
     * Gets array of all "SyncAction" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.SyncAction.Enum[] getSyncActionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SYNCACTION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.SyncAction.Enum[] result = new com.microsoft.schemas.crm._2011.contracts.SyncAction.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.crm._2011.contracts.SyncAction.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "SyncAction" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SyncAction.Enum getSyncActionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYNCACTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.crm._2011.contracts.SyncAction.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "SyncAction" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.SyncAction[] xgetSyncActionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SYNCACTION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.SyncAction[] result = new com.microsoft.schemas.crm._2011.contracts.SyncAction[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "SyncAction" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SyncAction xgetSyncActionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SyncAction)get_store().find_element_user(SYNCACTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SyncAction" element
     */
    public int sizeOfSyncActionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYNCACTION$0);
        }
    }
    
    /**
     * Sets array of all "SyncAction" element
     */
    public void setSyncActionArray(com.microsoft.schemas.crm._2011.contracts.SyncAction.Enum[] syncActionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(syncActionArray, SYNCACTION$0);
        }
    }
    
    /**
     * Sets ith "SyncAction" element
     */
    public void setSyncActionArray(int i, com.microsoft.schemas.crm._2011.contracts.SyncAction.Enum syncAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYNCACTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(syncAction);
        }
    }
    
    /**
     * Sets (as xml) array of all "SyncAction" element
     */
    public void xsetSyncActionArray(com.microsoft.schemas.crm._2011.contracts.SyncAction[]syncActionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(syncActionArray, SYNCACTION$0);
        }
    }
    
    /**
     * Sets (as xml) ith "SyncAction" element
     */
    public void xsetSyncActionArray(int i, com.microsoft.schemas.crm._2011.contracts.SyncAction syncAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SyncAction)get_store().find_element_user(SYNCACTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(syncAction);
        }
    }
    
    /**
     * Inserts the value as the ith "SyncAction" element
     */
    public void insertSyncAction(int i, com.microsoft.schemas.crm._2011.contracts.SyncAction.Enum syncAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SYNCACTION$0, i);
            target.setEnumValue(syncAction);
        }
    }
    
    /**
     * Appends the value as the last "SyncAction" element
     */
    public void addSyncAction(com.microsoft.schemas.crm._2011.contracts.SyncAction.Enum syncAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYNCACTION$0);
            target.setEnumValue(syncAction);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SyncAction" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SyncAction insertNewSyncAction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SyncAction)get_store().insert_element_user(SYNCACTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SyncAction" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SyncAction addNewSyncAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SyncAction)get_store().add_element_user(SYNCACTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SyncAction" element
     */
    public void removeSyncAction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYNCACTION$0, i);
        }
    }
}
