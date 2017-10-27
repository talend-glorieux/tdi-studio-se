/*
 * XML Type:  ArrayOfArrayOfErrorInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfErrorInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfErrorInfo(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfErrorInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfErrorInfo
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfErrorInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFERRORINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfErrorInfo");
    
    
    /**
     * Gets array of all "ArrayOfErrorInfo" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo[] getArrayOfErrorInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFERRORINFO$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfErrorInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo getArrayOfErrorInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo)get_store().find_element_user(ARRAYOFERRORINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfErrorInfo" element
     */
    public boolean isNilArrayOfErrorInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo)get_store().find_element_user(ARRAYOFERRORINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfErrorInfo" element
     */
    public int sizeOfArrayOfErrorInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFERRORINFO$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfErrorInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfErrorInfoArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo[] arrayOfErrorInfoArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfErrorInfoArray, ARRAYOFERRORINFO$0);
    }
    
    /**
     * Sets ith "ArrayOfErrorInfo" element
     */
    public void setArrayOfErrorInfoArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo arrayOfErrorInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo)get_store().find_element_user(ARRAYOFERRORINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfErrorInfo);
        }
    }
    
    /**
     * Nils the ith "ArrayOfErrorInfo" element
     */
    public void setNilArrayOfErrorInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo)get_store().find_element_user(ARRAYOFERRORINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfErrorInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo insertNewArrayOfErrorInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo)get_store().insert_element_user(ARRAYOFERRORINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfErrorInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo addNewArrayOfErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo)get_store().add_element_user(ARRAYOFERRORINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfErrorInfo" element
     */
    public void removeArrayOfErrorInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFERRORINFO$0, i);
        }
    }
}
