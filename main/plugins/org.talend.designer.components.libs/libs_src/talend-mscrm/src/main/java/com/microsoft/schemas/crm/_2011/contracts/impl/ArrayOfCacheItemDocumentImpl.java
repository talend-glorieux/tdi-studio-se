/*
 * An XML document type.
 * Localname: ArrayOfCacheItem
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItemDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfCacheItem(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfCacheItemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItemDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfCacheItemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFCACHEITEM$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfCacheItem");
    
    
    /**
     * Gets the "ArrayOfCacheItem" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem getArrayOfCacheItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem)get_store().find_element_user(ARRAYOFCACHEITEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfCacheItem" element
     */
    public boolean isNilArrayOfCacheItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem)get_store().find_element_user(ARRAYOFCACHEITEM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfCacheItem" element
     */
    public void setArrayOfCacheItem(com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem arrayOfCacheItem)
    {
        generatedSetterHelperImpl(arrayOfCacheItem, ARRAYOFCACHEITEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfCacheItem" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem addNewArrayOfCacheItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem)get_store().add_element_user(ARRAYOFCACHEITEM$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfCacheItem" element
     */
    public void setNilArrayOfCacheItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem)get_store().find_element_user(ARRAYOFCACHEITEM$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfCacheItem)get_store().add_element_user(ARRAYOFCACHEITEM$0);
            }
            target.setNil();
        }
    }
}
