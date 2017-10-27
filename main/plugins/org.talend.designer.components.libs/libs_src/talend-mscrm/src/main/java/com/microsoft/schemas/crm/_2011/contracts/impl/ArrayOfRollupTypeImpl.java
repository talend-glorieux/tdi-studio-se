/*
 * XML Type:  ArrayOfRollupType
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfRollupType(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfRollupTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRollupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLLUPTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "RollupType");
    
    
    /**
     * Gets array of all "RollupType" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.RollupType.Enum[] getRollupTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLLUPTYPE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.RollupType.Enum[] result = new com.microsoft.schemas.crm._2011.contracts.RollupType.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.crm._2011.contracts.RollupType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "RollupType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RollupType.Enum getRollupTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLLUPTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.crm._2011.contracts.RollupType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "RollupType" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.RollupType[] xgetRollupTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLLUPTYPE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.RollupType[] result = new com.microsoft.schemas.crm._2011.contracts.RollupType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "RollupType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RollupType xgetRollupTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RollupType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RollupType)get_store().find_element_user(ROLLUPTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RollupType" element
     */
    public int sizeOfRollupTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLLUPTYPE$0);
        }
    }
    
    /**
     * Sets array of all "RollupType" element
     */
    public void setRollupTypeArray(com.microsoft.schemas.crm._2011.contracts.RollupType.Enum[] rollupTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rollupTypeArray, ROLLUPTYPE$0);
        }
    }
    
    /**
     * Sets ith "RollupType" element
     */
    public void setRollupTypeArray(int i, com.microsoft.schemas.crm._2011.contracts.RollupType.Enum rollupType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLLUPTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(rollupType);
        }
    }
    
    /**
     * Sets (as xml) array of all "RollupType" element
     */
    public void xsetRollupTypeArray(com.microsoft.schemas.crm._2011.contracts.RollupType[]rollupTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rollupTypeArray, ROLLUPTYPE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "RollupType" element
     */
    public void xsetRollupTypeArray(int i, com.microsoft.schemas.crm._2011.contracts.RollupType rollupType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RollupType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RollupType)get_store().find_element_user(ROLLUPTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rollupType);
        }
    }
    
    /**
     * Inserts the value as the ith "RollupType" element
     */
    public void insertRollupType(int i, com.microsoft.schemas.crm._2011.contracts.RollupType.Enum rollupType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ROLLUPTYPE$0, i);
            target.setEnumValue(rollupType);
        }
    }
    
    /**
     * Appends the value as the last "RollupType" element
     */
    public void addRollupType(com.microsoft.schemas.crm._2011.contracts.RollupType.Enum rollupType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROLLUPTYPE$0);
            target.setEnumValue(rollupType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RollupType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RollupType insertNewRollupType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RollupType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RollupType)get_store().insert_element_user(ROLLUPTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RollupType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RollupType addNewRollupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RollupType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RollupType)get_store().add_element_user(ROLLUPTYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RollupType" element
     */
    public void removeRollupType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLLUPTYPE$0, i);
        }
    }
}
