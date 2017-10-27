/*
 * XML Type:  EntityMetadataCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.EntityMetadataCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML EntityMetadataCollection(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class EntityMetadataCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.EntityMetadataCollection
{
    private static final long serialVersionUID = 1L;
    
    public EntityMetadataCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "EntityMetadata");
    
    
    /**
     * Gets array of all "EntityMetadata" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.EntityMetadata[] getEntityMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITYMETADATA$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.EntityMetadata[] result = new com.microsoft.schemas.xrm._2011.metadata.EntityMetadata[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "EntityMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.EntityMetadata getEntityMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EntityMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata)get_store().find_element_user(ENTITYMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "EntityMetadata" element
     */
    public boolean isNilEntityMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EntityMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata)get_store().find_element_user(ENTITYMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "EntityMetadata" element
     */
    public int sizeOfEntityMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYMETADATA$0);
        }
    }
    
    /**
     * Sets array of all "EntityMetadata" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEntityMetadataArray(com.microsoft.schemas.xrm._2011.metadata.EntityMetadata[] entityMetadataArray)
    {
        check_orphaned();
        arraySetterHelper(entityMetadataArray, ENTITYMETADATA$0);
    }
    
    /**
     * Sets ith "EntityMetadata" element
     */
    public void setEntityMetadataArray(int i, com.microsoft.schemas.xrm._2011.metadata.EntityMetadata entityMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EntityMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata)get_store().find_element_user(ENTITYMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entityMetadata);
        }
    }
    
    /**
     * Nils the ith "EntityMetadata" element
     */
    public void setNilEntityMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EntityMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata)get_store().find_element_user(ENTITYMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "EntityMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.EntityMetadata insertNewEntityMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EntityMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata)get_store().insert_element_user(ENTITYMETADATA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "EntityMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.EntityMetadata addNewEntityMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EntityMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata)get_store().add_element_user(ENTITYMETADATA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "EntityMetadata" element
     */
    public void removeEntityMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYMETADATA$0, i);
        }
    }
}
