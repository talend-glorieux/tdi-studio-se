/*
 * XML Type:  ArrayOfManagedPropertyMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfManagedPropertyMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfManagedPropertyMetadataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyMetadata
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfManagedPropertyMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANAGEDPROPERTYMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ManagedPropertyMetadata");
    
    
    /**
     * Gets array of all "ManagedPropertyMetadata" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata[] getManagedPropertyMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MANAGEDPROPERTYMETADATA$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata[] result = new com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ManagedPropertyMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata getManagedPropertyMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata)get_store().find_element_user(MANAGEDPROPERTYMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ManagedPropertyMetadata" element
     */
    public boolean isNilManagedPropertyMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata)get_store().find_element_user(MANAGEDPROPERTYMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ManagedPropertyMetadata" element
     */
    public int sizeOfManagedPropertyMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANAGEDPROPERTYMETADATA$0);
        }
    }
    
    /**
     * Sets array of all "ManagedPropertyMetadata" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setManagedPropertyMetadataArray(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata[] managedPropertyMetadataArray)
    {
        check_orphaned();
        arraySetterHelper(managedPropertyMetadataArray, MANAGEDPROPERTYMETADATA$0);
    }
    
    /**
     * Sets ith "ManagedPropertyMetadata" element
     */
    public void setManagedPropertyMetadataArray(int i, com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata managedPropertyMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata)get_store().find_element_user(MANAGEDPROPERTYMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(managedPropertyMetadata);
        }
    }
    
    /**
     * Nils the ith "ManagedPropertyMetadata" element
     */
    public void setNilManagedPropertyMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata)get_store().find_element_user(MANAGEDPROPERTYMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ManagedPropertyMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata insertNewManagedPropertyMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata)get_store().insert_element_user(MANAGEDPROPERTYMETADATA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ManagedPropertyMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata addNewManagedPropertyMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata)get_store().add_element_user(MANAGEDPROPERTYMETADATA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ManagedPropertyMetadata" element
     */
    public void removeManagedPropertyMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANAGEDPROPERTYMETADATA$0, i);
        }
    }
}
