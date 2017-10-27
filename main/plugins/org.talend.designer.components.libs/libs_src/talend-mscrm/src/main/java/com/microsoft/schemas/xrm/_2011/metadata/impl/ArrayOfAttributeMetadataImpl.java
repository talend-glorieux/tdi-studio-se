/*
 * XML Type:  ArrayOfAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfAttributeMetadataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAttributeMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "AttributeMetadata");
    
    
    /**
     * Gets array of all "AttributeMetadata" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata[] getAttributeMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTEMETADATA$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata[] result = new com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata getAttributeMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata)get_store().find_element_user(ATTRIBUTEMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AttributeMetadata" element
     */
    public boolean isNilAttributeMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata)get_store().find_element_user(ATTRIBUTEMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AttributeMetadata" element
     */
    public int sizeOfAttributeMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEMETADATA$0);
        }
    }
    
    /**
     * Sets array of all "AttributeMetadata" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeMetadataArray(com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata[] attributeMetadataArray)
    {
        check_orphaned();
        arraySetterHelper(attributeMetadataArray, ATTRIBUTEMETADATA$0);
    }
    
    /**
     * Sets ith "AttributeMetadata" element
     */
    public void setAttributeMetadataArray(int i, com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata attributeMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata)get_store().find_element_user(ATTRIBUTEMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attributeMetadata);
        }
    }
    
    /**
     * Nils the ith "AttributeMetadata" element
     */
    public void setNilAttributeMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata)get_store().find_element_user(ATTRIBUTEMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata insertNewAttributeMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata)get_store().insert_element_user(ATTRIBUTEMETADATA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata addNewAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata)get_store().add_element_user(ATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttributeMetadata" element
     */
    public void removeAttributeMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEMETADATA$0, i);
        }
    }
}
