/*
 * XML Type:  EntityReferenceCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML EntityReferenceCollection(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class EntityReferenceCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection
{
    private static final long serialVersionUID = 1L;
    
    public EntityReferenceCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYREFERENCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "EntityReference");
    
    
    /**
     * Gets array of all "EntityReference" elements
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityReference[] getEntityReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITYREFERENCE$0, targetList);
            com.microsoft.schemas.xrm._2011.contracts.EntityReference[] result = new com.microsoft.schemas.xrm._2011.contracts.EntityReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "EntityReference" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityReference getEntityReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().find_element_user(ENTITYREFERENCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "EntityReference" element
     */
    public boolean isNilEntityReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().find_element_user(ENTITYREFERENCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "EntityReference" element
     */
    public int sizeOfEntityReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYREFERENCE$0);
        }
    }
    
    /**
     * Sets array of all "EntityReference" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEntityReferenceArray(com.microsoft.schemas.xrm._2011.contracts.EntityReference[] entityReferenceArray)
    {
        check_orphaned();
        arraySetterHelper(entityReferenceArray, ENTITYREFERENCE$0);
    }
    
    /**
     * Sets ith "EntityReference" element
     */
    public void setEntityReferenceArray(int i, com.microsoft.schemas.xrm._2011.contracts.EntityReference entityReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().find_element_user(ENTITYREFERENCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entityReference);
        }
    }
    
    /**
     * Nils the ith "EntityReference" element
     */
    public void setNilEntityReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().find_element_user(ENTITYREFERENCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "EntityReference" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityReference insertNewEntityReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().insert_element_user(ENTITYREFERENCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "EntityReference" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityReference addNewEntityReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().add_element_user(ENTITYREFERENCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "EntityReference" element
     */
    public void removeEntityReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYREFERENCE$0, i);
        }
    }
}
