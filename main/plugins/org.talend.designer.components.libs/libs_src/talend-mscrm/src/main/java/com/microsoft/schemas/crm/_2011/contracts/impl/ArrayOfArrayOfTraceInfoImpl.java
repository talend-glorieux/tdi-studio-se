/*
 * XML Type:  ArrayOfArrayOfTraceInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTraceInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfTraceInfo(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfTraceInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTraceInfo
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfTraceInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFTRACEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfTraceInfo");
    
    
    /**
     * Gets array of all "ArrayOfTraceInfo" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo[] getArrayOfTraceInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFTRACEINFO$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfTraceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo getArrayOfTraceInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo)get_store().find_element_user(ARRAYOFTRACEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfTraceInfo" element
     */
    public boolean isNilArrayOfTraceInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo)get_store().find_element_user(ARRAYOFTRACEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfTraceInfo" element
     */
    public int sizeOfArrayOfTraceInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFTRACEINFO$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfTraceInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfTraceInfoArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo[] arrayOfTraceInfoArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfTraceInfoArray, ARRAYOFTRACEINFO$0);
    }
    
    /**
     * Sets ith "ArrayOfTraceInfo" element
     */
    public void setArrayOfTraceInfoArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo arrayOfTraceInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo)get_store().find_element_user(ARRAYOFTRACEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfTraceInfo);
        }
    }
    
    /**
     * Nils the ith "ArrayOfTraceInfo" element
     */
    public void setNilArrayOfTraceInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo)get_store().find_element_user(ARRAYOFTRACEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfTraceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo insertNewArrayOfTraceInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo)get_store().insert_element_user(ARRAYOFTRACEINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfTraceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo addNewArrayOfTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo)get_store().add_element_user(ARRAYOFTRACEINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfTraceInfo" element
     */
    public void removeArrayOfTraceInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFTRACEINFO$0, i);
        }
    }
}
