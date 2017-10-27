/*
 * XML Type:  ArrayOfFaultType
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfFaultType(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfFaultTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfFaultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAULTTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "FaultType");
    
    
    /**
     * Gets array of all "FaultType" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.FaultType.Enum[] getFaultTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FAULTTYPE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.FaultType.Enum[] result = new com.microsoft.schemas.crm._2011.contracts.FaultType.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.crm._2011.contracts.FaultType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "FaultType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.FaultType.Enum getFaultTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.crm._2011.contracts.FaultType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "FaultType" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.FaultType[] xgetFaultTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FAULTTYPE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.FaultType[] result = new com.microsoft.schemas.crm._2011.contracts.FaultType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "FaultType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.FaultType xgetFaultTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.FaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.FaultType)get_store().find_element_user(FAULTTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "FaultType" element
     */
    public int sizeOfFaultTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAULTTYPE$0);
        }
    }
    
    /**
     * Sets array of all "FaultType" element
     */
    public void setFaultTypeArray(com.microsoft.schemas.crm._2011.contracts.FaultType.Enum[] faultTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(faultTypeArray, FAULTTYPE$0);
        }
    }
    
    /**
     * Sets ith "FaultType" element
     */
    public void setFaultTypeArray(int i, com.microsoft.schemas.crm._2011.contracts.FaultType.Enum faultType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(faultType);
        }
    }
    
    /**
     * Sets (as xml) array of all "FaultType" element
     */
    public void xsetFaultTypeArray(com.microsoft.schemas.crm._2011.contracts.FaultType[]faultTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(faultTypeArray, FAULTTYPE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "FaultType" element
     */
    public void xsetFaultTypeArray(int i, com.microsoft.schemas.crm._2011.contracts.FaultType faultType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.FaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.FaultType)get_store().find_element_user(FAULTTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(faultType);
        }
    }
    
    /**
     * Inserts the value as the ith "FaultType" element
     */
    public void insertFaultType(int i, com.microsoft.schemas.crm._2011.contracts.FaultType.Enum faultType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FAULTTYPE$0, i);
            target.setEnumValue(faultType);
        }
    }
    
    /**
     * Appends the value as the last "FaultType" element
     */
    public void addFaultType(com.microsoft.schemas.crm._2011.contracts.FaultType.Enum faultType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAULTTYPE$0);
            target.setEnumValue(faultType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FaultType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.FaultType insertNewFaultType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.FaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.FaultType)get_store().insert_element_user(FAULTTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FaultType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.FaultType addNewFaultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.FaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.FaultType)get_store().add_element_user(FAULTTYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "FaultType" element
     */
    public void removeFaultType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAULTTYPE$0, i);
        }
    }
}
