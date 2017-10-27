/*
 * XML Type:  ArrayOfBulkOperationSource
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfBulkOperationSource(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfBulkOperationSourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfBulkOperationSourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BULKOPERATIONSOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "BulkOperationSource");
    
    
    /**
     * Gets array of all "BulkOperationSource" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.BulkOperationSource.Enum[] getBulkOperationSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BULKOPERATIONSOURCE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.BulkOperationSource.Enum[] result = new com.microsoft.schemas.crm._2011.contracts.BulkOperationSource.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.crm._2011.contracts.BulkOperationSource.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "BulkOperationSource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.BulkOperationSource.Enum getBulkOperationSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BULKOPERATIONSOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.crm._2011.contracts.BulkOperationSource.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "BulkOperationSource" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.BulkOperationSource[] xgetBulkOperationSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BULKOPERATIONSOURCE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.BulkOperationSource[] result = new com.microsoft.schemas.crm._2011.contracts.BulkOperationSource[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "BulkOperationSource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.BulkOperationSource xgetBulkOperationSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.BulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.BulkOperationSource)get_store().find_element_user(BULKOPERATIONSOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "BulkOperationSource" element
     */
    public int sizeOfBulkOperationSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BULKOPERATIONSOURCE$0);
        }
    }
    
    /**
     * Sets array of all "BulkOperationSource" element
     */
    public void setBulkOperationSourceArray(com.microsoft.schemas.crm._2011.contracts.BulkOperationSource.Enum[] bulkOperationSourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bulkOperationSourceArray, BULKOPERATIONSOURCE$0);
        }
    }
    
    /**
     * Sets ith "BulkOperationSource" element
     */
    public void setBulkOperationSourceArray(int i, com.microsoft.schemas.crm._2011.contracts.BulkOperationSource.Enum bulkOperationSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BULKOPERATIONSOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(bulkOperationSource);
        }
    }
    
    /**
     * Sets (as xml) array of all "BulkOperationSource" element
     */
    public void xsetBulkOperationSourceArray(com.microsoft.schemas.crm._2011.contracts.BulkOperationSource[]bulkOperationSourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bulkOperationSourceArray, BULKOPERATIONSOURCE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "BulkOperationSource" element
     */
    public void xsetBulkOperationSourceArray(int i, com.microsoft.schemas.crm._2011.contracts.BulkOperationSource bulkOperationSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.BulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.BulkOperationSource)get_store().find_element_user(BULKOPERATIONSOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bulkOperationSource);
        }
    }
    
    /**
     * Inserts the value as the ith "BulkOperationSource" element
     */
    public void insertBulkOperationSource(int i, com.microsoft.schemas.crm._2011.contracts.BulkOperationSource.Enum bulkOperationSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BULKOPERATIONSOURCE$0, i);
            target.setEnumValue(bulkOperationSource);
        }
    }
    
    /**
     * Appends the value as the last "BulkOperationSource" element
     */
    public void addBulkOperationSource(com.microsoft.schemas.crm._2011.contracts.BulkOperationSource.Enum bulkOperationSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BULKOPERATIONSOURCE$0);
            target.setEnumValue(bulkOperationSource);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BulkOperationSource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.BulkOperationSource insertNewBulkOperationSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.BulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.BulkOperationSource)get_store().insert_element_user(BULKOPERATIONSOURCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BulkOperationSource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.BulkOperationSource addNewBulkOperationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.BulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.BulkOperationSource)get_store().add_element_user(BULKOPERATIONSOURCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "BulkOperationSource" element
     */
    public void removeBulkOperationSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BULKOPERATIONSOURCE$0, i);
        }
    }
}
