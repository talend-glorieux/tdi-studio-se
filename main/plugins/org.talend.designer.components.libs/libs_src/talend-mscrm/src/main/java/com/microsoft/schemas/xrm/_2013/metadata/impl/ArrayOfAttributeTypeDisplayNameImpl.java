/*
 * XML Type:  ArrayOfAttributeTypeDisplayName
 * Namespace: http://schemas.microsoft.com/xrm/2013/Metadata
 * Java type: com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2013.metadata.impl;
/**
 * An XML ArrayOfAttributeTypeDisplayName(@http://schemas.microsoft.com/xrm/2013/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfAttributeTypeDisplayNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2013.metadata.ArrayOfAttributeTypeDisplayName
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAttributeTypeDisplayNameImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTETYPEDISPLAYNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2013/Metadata", "AttributeTypeDisplayName");
    
    
    /**
     * Gets array of all "AttributeTypeDisplayName" elements
     */
    public com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName[] getAttributeTypeDisplayNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTETYPEDISPLAYNAME$0, targetList);
            com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName[] result = new com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttributeTypeDisplayName" element
     */
    public com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName getAttributeTypeDisplayNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName)get_store().find_element_user(ATTRIBUTETYPEDISPLAYNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AttributeTypeDisplayName" element
     */
    public boolean isNilAttributeTypeDisplayNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName)get_store().find_element_user(ATTRIBUTETYPEDISPLAYNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AttributeTypeDisplayName" element
     */
    public int sizeOfAttributeTypeDisplayNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTETYPEDISPLAYNAME$0);
        }
    }
    
    /**
     * Sets array of all "AttributeTypeDisplayName" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeTypeDisplayNameArray(com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName[] attributeTypeDisplayNameArray)
    {
        check_orphaned();
        arraySetterHelper(attributeTypeDisplayNameArray, ATTRIBUTETYPEDISPLAYNAME$0);
    }
    
    /**
     * Sets ith "AttributeTypeDisplayName" element
     */
    public void setAttributeTypeDisplayNameArray(int i, com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName attributeTypeDisplayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName)get_store().find_element_user(ATTRIBUTETYPEDISPLAYNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attributeTypeDisplayName);
        }
    }
    
    /**
     * Nils the ith "AttributeTypeDisplayName" element
     */
    public void setNilAttributeTypeDisplayNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName)get_store().find_element_user(ATTRIBUTETYPEDISPLAYNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttributeTypeDisplayName" element
     */
    public com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName insertNewAttributeTypeDisplayName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName)get_store().insert_element_user(ATTRIBUTETYPEDISPLAYNAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttributeTypeDisplayName" element
     */
    public com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName addNewAttributeTypeDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.AttributeTypeDisplayName)get_store().add_element_user(ATTRIBUTETYPEDISPLAYNAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttributeTypeDisplayName" element
     */
    public void removeAttributeTypeDisplayName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTETYPEDISPLAYNAME$0, i);
        }
    }
}
