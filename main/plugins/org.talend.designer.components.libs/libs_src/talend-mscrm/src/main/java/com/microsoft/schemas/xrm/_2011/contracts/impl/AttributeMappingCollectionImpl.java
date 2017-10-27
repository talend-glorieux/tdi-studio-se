/*
 * XML Type:  AttributeMappingCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.AttributeMappingCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML AttributeMappingCollection(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class AttributeMappingCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.AttributeMappingCollection
{
    private static final long serialVersionUID = 1L;
    
    public AttributeMappingCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEMAPPING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "AttributeMapping");
    
    
    /**
     * Gets array of all "AttributeMapping" elements
     */
    public com.microsoft.schemas.xrm._2014.contracts.AttributeMapping[] getAttributeMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTEMAPPING$0, targetList);
            com.microsoft.schemas.xrm._2014.contracts.AttributeMapping[] result = new com.microsoft.schemas.xrm._2014.contracts.AttributeMapping[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttributeMapping" element
     */
    public com.microsoft.schemas.xrm._2014.contracts.AttributeMapping getAttributeMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2014.contracts.AttributeMapping target = null;
            target = (com.microsoft.schemas.xrm._2014.contracts.AttributeMapping)get_store().find_element_user(ATTRIBUTEMAPPING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AttributeMapping" element
     */
    public boolean isNilAttributeMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2014.contracts.AttributeMapping target = null;
            target = (com.microsoft.schemas.xrm._2014.contracts.AttributeMapping)get_store().find_element_user(ATTRIBUTEMAPPING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AttributeMapping" element
     */
    public int sizeOfAttributeMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEMAPPING$0);
        }
    }
    
    /**
     * Sets array of all "AttributeMapping" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeMappingArray(com.microsoft.schemas.xrm._2014.contracts.AttributeMapping[] attributeMappingArray)
    {
        check_orphaned();
        arraySetterHelper(attributeMappingArray, ATTRIBUTEMAPPING$0);
    }
    
    /**
     * Sets ith "AttributeMapping" element
     */
    public void setAttributeMappingArray(int i, com.microsoft.schemas.xrm._2014.contracts.AttributeMapping attributeMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2014.contracts.AttributeMapping target = null;
            target = (com.microsoft.schemas.xrm._2014.contracts.AttributeMapping)get_store().find_element_user(ATTRIBUTEMAPPING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attributeMapping);
        }
    }
    
    /**
     * Nils the ith "AttributeMapping" element
     */
    public void setNilAttributeMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2014.contracts.AttributeMapping target = null;
            target = (com.microsoft.schemas.xrm._2014.contracts.AttributeMapping)get_store().find_element_user(ATTRIBUTEMAPPING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttributeMapping" element
     */
    public com.microsoft.schemas.xrm._2014.contracts.AttributeMapping insertNewAttributeMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2014.contracts.AttributeMapping target = null;
            target = (com.microsoft.schemas.xrm._2014.contracts.AttributeMapping)get_store().insert_element_user(ATTRIBUTEMAPPING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttributeMapping" element
     */
    public com.microsoft.schemas.xrm._2014.contracts.AttributeMapping addNewAttributeMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2014.contracts.AttributeMapping target = null;
            target = (com.microsoft.schemas.xrm._2014.contracts.AttributeMapping)get_store().add_element_user(ATTRIBUTEMAPPING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttributeMapping" element
     */
    public void removeAttributeMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEMAPPING$0, i);
        }
    }
}
