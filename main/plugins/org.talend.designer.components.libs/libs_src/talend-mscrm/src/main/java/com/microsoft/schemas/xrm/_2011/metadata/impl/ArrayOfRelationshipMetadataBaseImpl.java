/*
 * XML Type:  ArrayOfRelationshipMetadataBase
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfRelationshipMetadataBase(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfRelationshipMetadataBaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRelationshipMetadataBaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIPMETADATABASE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "RelationshipMetadataBase");
    
    
    /**
     * Gets array of all "RelationshipMetadataBase" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase[] getRelationshipMetadataBaseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATIONSHIPMETADATABASE$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase[] result = new com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RelationshipMetadataBase" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase getRelationshipMetadataBaseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase)get_store().find_element_user(RELATIONSHIPMETADATABASE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "RelationshipMetadataBase" element
     */
    public boolean isNilRelationshipMetadataBaseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase)get_store().find_element_user(RELATIONSHIPMETADATABASE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "RelationshipMetadataBase" element
     */
    public int sizeOfRelationshipMetadataBaseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONSHIPMETADATABASE$0);
        }
    }
    
    /**
     * Sets array of all "RelationshipMetadataBase" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRelationshipMetadataBaseArray(com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase[] relationshipMetadataBaseArray)
    {
        check_orphaned();
        arraySetterHelper(relationshipMetadataBaseArray, RELATIONSHIPMETADATABASE$0);
    }
    
    /**
     * Sets ith "RelationshipMetadataBase" element
     */
    public void setRelationshipMetadataBaseArray(int i, com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase relationshipMetadataBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase)get_store().find_element_user(RELATIONSHIPMETADATABASE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relationshipMetadataBase);
        }
    }
    
    /**
     * Nils the ith "RelationshipMetadataBase" element
     */
    public void setNilRelationshipMetadataBaseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase)get_store().find_element_user(RELATIONSHIPMETADATABASE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelationshipMetadataBase" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase insertNewRelationshipMetadataBase(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase)get_store().insert_element_user(RELATIONSHIPMETADATABASE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelationshipMetadataBase" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase addNewRelationshipMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase)get_store().add_element_user(RELATIONSHIPMETADATABASE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RelationshipMetadataBase" element
     */
    public void removeRelationshipMetadataBase(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONSHIPMETADATABASE$0, i);
        }
    }
}
