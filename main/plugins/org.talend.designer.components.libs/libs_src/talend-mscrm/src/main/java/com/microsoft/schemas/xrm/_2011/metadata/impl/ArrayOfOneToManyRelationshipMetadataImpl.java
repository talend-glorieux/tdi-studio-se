/*
 * XML Type:  ArrayOfOneToManyRelationshipMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfOneToManyRelationshipMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfOneToManyRelationshipMetadataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOneToManyRelationshipMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ONETOMANYRELATIONSHIPMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "OneToManyRelationshipMetadata");
    
    
    /**
     * Gets array of all "OneToManyRelationshipMetadata" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata[] getOneToManyRelationshipMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ONETOMANYRELATIONSHIPMETADATA$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata[] result = new com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OneToManyRelationshipMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata getOneToManyRelationshipMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata)get_store().find_element_user(ONETOMANYRELATIONSHIPMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OneToManyRelationshipMetadata" element
     */
    public boolean isNilOneToManyRelationshipMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata)get_store().find_element_user(ONETOMANYRELATIONSHIPMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OneToManyRelationshipMetadata" element
     */
    public int sizeOfOneToManyRelationshipMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ONETOMANYRELATIONSHIPMETADATA$0);
        }
    }
    
    /**
     * Sets array of all "OneToManyRelationshipMetadata" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOneToManyRelationshipMetadataArray(com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata[] oneToManyRelationshipMetadataArray)
    {
        check_orphaned();
        arraySetterHelper(oneToManyRelationshipMetadataArray, ONETOMANYRELATIONSHIPMETADATA$0);
    }
    
    /**
     * Sets ith "OneToManyRelationshipMetadata" element
     */
    public void setOneToManyRelationshipMetadataArray(int i, com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata oneToManyRelationshipMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata)get_store().find_element_user(ONETOMANYRELATIONSHIPMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(oneToManyRelationshipMetadata);
        }
    }
    
    /**
     * Nils the ith "OneToManyRelationshipMetadata" element
     */
    public void setNilOneToManyRelationshipMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata)get_store().find_element_user(ONETOMANYRELATIONSHIPMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OneToManyRelationshipMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata insertNewOneToManyRelationshipMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata)get_store().insert_element_user(ONETOMANYRELATIONSHIPMETADATA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OneToManyRelationshipMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata addNewOneToManyRelationshipMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata)get_store().add_element_user(ONETOMANYRELATIONSHIPMETADATA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OneToManyRelationshipMetadata" element
     */
    public void removeOneToManyRelationshipMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ONETOMANYRELATIONSHIPMETADATA$0, i);
        }
    }
}
