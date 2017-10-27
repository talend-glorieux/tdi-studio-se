/*
 * XML Type:  ArrayOfOptionMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfOptionMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfOptionMetadataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOptionMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTIONMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "OptionMetadata");
    
    
    /**
     * Gets array of all "OptionMetadata" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionMetadata[] getOptionMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPTIONMETADATA$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata[] result = new com.microsoft.schemas.xrm._2011.metadata.OptionMetadata[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OptionMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionMetadata getOptionMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().find_element_user(OPTIONMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OptionMetadata" element
     */
    public boolean isNilOptionMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().find_element_user(OPTIONMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OptionMetadata" element
     */
    public int sizeOfOptionMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTIONMETADATA$0);
        }
    }
    
    /**
     * Sets array of all "OptionMetadata" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOptionMetadataArray(com.microsoft.schemas.xrm._2011.metadata.OptionMetadata[] optionMetadataArray)
    {
        check_orphaned();
        arraySetterHelper(optionMetadataArray, OPTIONMETADATA$0);
    }
    
    /**
     * Sets ith "OptionMetadata" element
     */
    public void setOptionMetadataArray(int i, com.microsoft.schemas.xrm._2011.metadata.OptionMetadata optionMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().find_element_user(OPTIONMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(optionMetadata);
        }
    }
    
    /**
     * Nils the ith "OptionMetadata" element
     */
    public void setNilOptionMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().find_element_user(OPTIONMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OptionMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionMetadata insertNewOptionMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().insert_element_user(OPTIONMETADATA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OptionMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionMetadata addNewOptionMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().add_element_user(OPTIONMETADATA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OptionMetadata" element
     */
    public void removeOptionMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTIONMETADATA$0, i);
        }
    }
}
