/*
 * An XML document type.
 * Localname: ArrayOfArrayOfCacheItem
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfCacheItemDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfCacheItem(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfCacheItemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfCacheItemDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfCacheItemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFCACHEITEM$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfCacheItem");
    
    
    /**
     * Gets the "ArrayOfArrayOfCacheItem" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfCacheItem getArrayOfArrayOfCacheItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfCacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfCacheItem)get_store().find_element_user(ARRAYOFARRAYOFCACHEITEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfCacheItem" element
     */
    public boolean isNilArrayOfArrayOfCacheItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfCacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfCacheItem)get_store().find_element_user(ARRAYOFARRAYOFCACHEITEM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfCacheItem" element
     */
    public void setArrayOfArrayOfCacheItem(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfCacheItem arrayOfArrayOfCacheItem)
    {
        generatedSetterHelperImpl(arrayOfArrayOfCacheItem, ARRAYOFARRAYOFCACHEITEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfCacheItem" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfCacheItem addNewArrayOfArrayOfCacheItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfCacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfCacheItem)get_store().add_element_user(ARRAYOFARRAYOFCACHEITEM$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfCacheItem" element
     */
    public void setNilArrayOfArrayOfCacheItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfCacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfCacheItem)get_store().find_element_user(ARRAYOFARRAYOFCACHEITEM$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfCacheItem)get_store().add_element_user(ARRAYOFARRAYOFCACHEITEM$0);
            }
            target.setNil();
        }
    }
}
