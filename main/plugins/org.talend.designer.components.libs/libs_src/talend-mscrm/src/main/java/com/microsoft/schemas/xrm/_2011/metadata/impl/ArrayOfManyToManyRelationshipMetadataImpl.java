/*
 * XML Type:  ArrayOfManyToManyRelationshipMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfManyToManyRelationshipMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfManyToManyRelationshipMetadataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfManyToManyRelationshipMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANYTOMANYRELATIONSHIPMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ManyToManyRelationshipMetadata");
    
    
    /**
     * Gets array of all "ManyToManyRelationshipMetadata" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata[] getManyToManyRelationshipMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MANYTOMANYRELATIONSHIPMETADATA$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata[] result = new com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ManyToManyRelationshipMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata getManyToManyRelationshipMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata)get_store().find_element_user(MANYTOMANYRELATIONSHIPMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ManyToManyRelationshipMetadata" element
     */
    public boolean isNilManyToManyRelationshipMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata)get_store().find_element_user(MANYTOMANYRELATIONSHIPMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ManyToManyRelationshipMetadata" element
     */
    public int sizeOfManyToManyRelationshipMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANYTOMANYRELATIONSHIPMETADATA$0);
        }
    }
    
    /**
     * Sets array of all "ManyToManyRelationshipMetadata" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setManyToManyRelationshipMetadataArray(com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata[] manyToManyRelationshipMetadataArray)
    {
        check_orphaned();
        arraySetterHelper(manyToManyRelationshipMetadataArray, MANYTOMANYRELATIONSHIPMETADATA$0);
    }
    
    /**
     * Sets ith "ManyToManyRelationshipMetadata" element
     */
    public void setManyToManyRelationshipMetadataArray(int i, com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata manyToManyRelationshipMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata)get_store().find_element_user(MANYTOMANYRELATIONSHIPMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(manyToManyRelationshipMetadata);
        }
    }
    
    /**
     * Nils the ith "ManyToManyRelationshipMetadata" element
     */
    public void setNilManyToManyRelationshipMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata)get_store().find_element_user(MANYTOMANYRELATIONSHIPMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ManyToManyRelationshipMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata insertNewManyToManyRelationshipMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata)get_store().insert_element_user(MANYTOMANYRELATIONSHIPMETADATA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ManyToManyRelationshipMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata addNewManyToManyRelationshipMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata)get_store().add_element_user(MANYTOMANYRELATIONSHIPMETADATA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ManyToManyRelationshipMetadata" element
     */
    public void removeManyToManyRelationshipMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANYTOMANYRELATIONSHIPMETADATA$0, i);
        }
    }
}
