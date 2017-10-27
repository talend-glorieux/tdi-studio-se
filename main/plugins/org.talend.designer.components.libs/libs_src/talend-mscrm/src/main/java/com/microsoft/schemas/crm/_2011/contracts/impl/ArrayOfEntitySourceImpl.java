/*
 * XML Type:  ArrayOfEntitySource
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfEntitySource(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfEntitySourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfEntitySourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYSOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "EntitySource");
    
    
    /**
     * Gets array of all "EntitySource" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.EntitySource.Enum[] getEntitySourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITYSOURCE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.EntitySource.Enum[] result = new com.microsoft.schemas.crm._2011.contracts.EntitySource.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.crm._2011.contracts.EntitySource.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "EntitySource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.EntitySource.Enum getEntitySourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYSOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.crm._2011.contracts.EntitySource.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "EntitySource" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.EntitySource[] xgetEntitySourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITYSOURCE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.EntitySource[] result = new com.microsoft.schemas.crm._2011.contracts.EntitySource[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "EntitySource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.EntitySource xgetEntitySourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.EntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.EntitySource)get_store().find_element_user(ENTITYSOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "EntitySource" element
     */
    public int sizeOfEntitySourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYSOURCE$0);
        }
    }
    
    /**
     * Sets array of all "EntitySource" element
     */
    public void setEntitySourceArray(com.microsoft.schemas.crm._2011.contracts.EntitySource.Enum[] entitySourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entitySourceArray, ENTITYSOURCE$0);
        }
    }
    
    /**
     * Sets ith "EntitySource" element
     */
    public void setEntitySourceArray(int i, com.microsoft.schemas.crm._2011.contracts.EntitySource.Enum entitySource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYSOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(entitySource);
        }
    }
    
    /**
     * Sets (as xml) array of all "EntitySource" element
     */
    public void xsetEntitySourceArray(com.microsoft.schemas.crm._2011.contracts.EntitySource[]entitySourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entitySourceArray, ENTITYSOURCE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "EntitySource" element
     */
    public void xsetEntitySourceArray(int i, com.microsoft.schemas.crm._2011.contracts.EntitySource entitySource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.EntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.EntitySource)get_store().find_element_user(ENTITYSOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entitySource);
        }
    }
    
    /**
     * Inserts the value as the ith "EntitySource" element
     */
    public void insertEntitySource(int i, com.microsoft.schemas.crm._2011.contracts.EntitySource.Enum entitySource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ENTITYSOURCE$0, i);
            target.setEnumValue(entitySource);
        }
    }
    
    /**
     * Appends the value as the last "EntitySource" element
     */
    public void addEntitySource(com.microsoft.schemas.crm._2011.contracts.EntitySource.Enum entitySource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYSOURCE$0);
            target.setEnumValue(entitySource);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "EntitySource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.EntitySource insertNewEntitySource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.EntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.EntitySource)get_store().insert_element_user(ENTITYSOURCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "EntitySource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.EntitySource addNewEntitySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.EntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.EntitySource)get_store().add_element_user(ENTITYSOURCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "EntitySource" element
     */
    public void removeEntitySource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYSOURCE$0, i);
        }
    }
}
