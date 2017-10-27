/*
 * XML Type:  ArrayOfArrayOfResourceInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResourceInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfResourceInfo(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfResourceInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResourceInfo
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfResourceInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFRESOURCEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfResourceInfo");
    
    
    /**
     * Gets array of all "ArrayOfResourceInfo" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo[] getArrayOfResourceInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFRESOURCEINFO$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfResourceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo getArrayOfResourceInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo)get_store().find_element_user(ARRAYOFRESOURCEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfResourceInfo" element
     */
    public boolean isNilArrayOfResourceInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo)get_store().find_element_user(ARRAYOFRESOURCEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfResourceInfo" element
     */
    public int sizeOfArrayOfResourceInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFRESOURCEINFO$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfResourceInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfResourceInfoArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo[] arrayOfResourceInfoArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfResourceInfoArray, ARRAYOFRESOURCEINFO$0);
    }
    
    /**
     * Sets ith "ArrayOfResourceInfo" element
     */
    public void setArrayOfResourceInfoArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo arrayOfResourceInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo)get_store().find_element_user(ARRAYOFRESOURCEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfResourceInfo);
        }
    }
    
    /**
     * Nils the ith "ArrayOfResourceInfo" element
     */
    public void setNilArrayOfResourceInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo)get_store().find_element_user(ARRAYOFRESOURCEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfResourceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo insertNewArrayOfResourceInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo)get_store().insert_element_user(ARRAYOFRESOURCEINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfResourceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo addNewArrayOfResourceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo)get_store().add_element_user(ARRAYOFRESOURCEINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfResourceInfo" element
     */
    public void removeArrayOfResourceInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFRESOURCEINFO$0, i);
        }
    }
}
