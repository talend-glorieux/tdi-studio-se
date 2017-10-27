/*
 * XML Type:  OrganizationResponseCollection
 * Namespace: http://schemas.microsoft.com/xrm/2012/Contracts
 * Java type: com.microsoft.schemas.xrm._2012.contracts.OrganizationResponseCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2012.contracts.impl;
/**
 * An XML OrganizationResponseCollection(@http://schemas.microsoft.com/xrm/2012/Contracts).
 *
 * This is a complex type.
 */
public class OrganizationResponseCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2012.contracts.OrganizationResponseCollection
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationResponseCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXECUTEMULTIPLERESPONSEITEM$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2012/Contracts", "ExecuteMultipleResponseItem");
    
    
    /**
     * Gets array of all "ExecuteMultipleResponseItem" elements
     */
    public com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem[] getExecuteMultipleResponseItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXECUTEMULTIPLERESPONSEITEM$0, targetList);
            com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem[] result = new com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ExecuteMultipleResponseItem" element
     */
    public com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem getExecuteMultipleResponseItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem target = null;
            target = (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem)get_store().find_element_user(EXECUTEMULTIPLERESPONSEITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ExecuteMultipleResponseItem" element
     */
    public boolean isNilExecuteMultipleResponseItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem target = null;
            target = (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem)get_store().find_element_user(EXECUTEMULTIPLERESPONSEITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ExecuteMultipleResponseItem" element
     */
    public int sizeOfExecuteMultipleResponseItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXECUTEMULTIPLERESPONSEITEM$0);
        }
    }
    
    /**
     * Sets array of all "ExecuteMultipleResponseItem" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setExecuteMultipleResponseItemArray(com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem[] executeMultipleResponseItemArray)
    {
        check_orphaned();
        arraySetterHelper(executeMultipleResponseItemArray, EXECUTEMULTIPLERESPONSEITEM$0);
    }
    
    /**
     * Sets ith "ExecuteMultipleResponseItem" element
     */
    public void setExecuteMultipleResponseItemArray(int i, com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem executeMultipleResponseItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem target = null;
            target = (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem)get_store().find_element_user(EXECUTEMULTIPLERESPONSEITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(executeMultipleResponseItem);
        }
    }
    
    /**
     * Nils the ith "ExecuteMultipleResponseItem" element
     */
    public void setNilExecuteMultipleResponseItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem target = null;
            target = (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem)get_store().find_element_user(EXECUTEMULTIPLERESPONSEITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ExecuteMultipleResponseItem" element
     */
    public com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem insertNewExecuteMultipleResponseItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem target = null;
            target = (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem)get_store().insert_element_user(EXECUTEMULTIPLERESPONSEITEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ExecuteMultipleResponseItem" element
     */
    public com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem addNewExecuteMultipleResponseItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem target = null;
            target = (com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem)get_store().add_element_user(EXECUTEMULTIPLERESPONSEITEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ExecuteMultipleResponseItem" element
     */
    public void removeExecuteMultipleResponseItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXECUTEMULTIPLERESPONSEITEM$0, i);
        }
    }
}
