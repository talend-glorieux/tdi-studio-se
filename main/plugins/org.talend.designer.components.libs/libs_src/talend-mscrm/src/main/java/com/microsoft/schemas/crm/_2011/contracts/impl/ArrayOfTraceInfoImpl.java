/*
 * XML Type:  ArrayOfTraceInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfTraceInfo(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfTraceInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfTraceInfo
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfTraceInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRACEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "TraceInfo");
    
    
    /**
     * Gets array of all "TraceInfo" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.TraceInfo[] getTraceInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRACEINFO$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.TraceInfo[] result = new com.microsoft.schemas.crm._2011.contracts.TraceInfo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TraceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TraceInfo getTraceInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().find_element_user(TRACEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "TraceInfo" element
     */
    public boolean isNilTraceInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().find_element_user(TRACEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "TraceInfo" element
     */
    public int sizeOfTraceInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACEINFO$0);
        }
    }
    
    /**
     * Sets array of all "TraceInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTraceInfoArray(com.microsoft.schemas.crm._2011.contracts.TraceInfo[] traceInfoArray)
    {
        check_orphaned();
        arraySetterHelper(traceInfoArray, TRACEINFO$0);
    }
    
    /**
     * Sets ith "TraceInfo" element
     */
    public void setTraceInfoArray(int i, com.microsoft.schemas.crm._2011.contracts.TraceInfo traceInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().find_element_user(TRACEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(traceInfo);
        }
    }
    
    /**
     * Nils the ith "TraceInfo" element
     */
    public void setNilTraceInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().find_element_user(TRACEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TraceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TraceInfo insertNewTraceInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().insert_element_user(TRACEINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TraceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TraceInfo addNewTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().add_element_user(TRACEINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "TraceInfo" element
     */
    public void removeTraceInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACEINFO$0, i);
        }
    }
}
