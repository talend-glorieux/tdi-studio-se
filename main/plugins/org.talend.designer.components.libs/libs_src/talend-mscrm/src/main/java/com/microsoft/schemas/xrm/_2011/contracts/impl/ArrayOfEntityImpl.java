/*
 * XML Type:  ArrayOfEntity
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML ArrayOfEntity(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfEntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Entity");
    
    
    /**
     * Gets array of all "Entity" elements
     */
    public com.microsoft.schemas.xrm._2011.contracts.Entity[] getEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITY$0, targetList);
            com.microsoft.schemas.xrm._2011.contracts.Entity[] result = new com.microsoft.schemas.xrm._2011.contracts.Entity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Entity" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Entity getEntityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(ENTITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Entity" element
     */
    public boolean isNilEntityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(ENTITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Entity" element
     */
    public int sizeOfEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITY$0);
        }
    }
    
    /**
     * Sets array of all "Entity" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEntityArray(com.microsoft.schemas.xrm._2011.contracts.Entity[] entityArray)
    {
        check_orphaned();
        arraySetterHelper(entityArray, ENTITY$0);
    }
    
    /**
     * Sets ith "Entity" element
     */
    public void setEntityArray(int i, com.microsoft.schemas.xrm._2011.contracts.Entity entity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(ENTITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entity);
        }
    }
    
    /**
     * Nils the ith "Entity" element
     */
    public void setNilEntityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(ENTITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Entity" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Entity insertNewEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().insert_element_user(ENTITY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Entity" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Entity addNewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().add_element_user(ENTITY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Entity" element
     */
    public void removeEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITY$0, i);
        }
    }
}
