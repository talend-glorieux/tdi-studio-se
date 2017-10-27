/*
 * An XML document type.
 * Localname: CacheItem
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.CacheItemDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one CacheItem(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class CacheItemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.CacheItemDocument
{
    private static final long serialVersionUID = 1L;
    
    public CacheItemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CACHEITEM$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "CacheItem");
    
    
    /**
     * Gets the "CacheItem" element
     */
    public com.microsoft.schemas.crm._2011.contracts.CacheItem getCacheItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.CacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.CacheItem)get_store().find_element_user(CACHEITEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CacheItem" element
     */
    public boolean isNilCacheItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.CacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.CacheItem)get_store().find_element_user(CACHEITEM$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CacheItem" element
     */
    public void setCacheItem(com.microsoft.schemas.crm._2011.contracts.CacheItem cacheItem)
    {
        generatedSetterHelperImpl(cacheItem, CACHEITEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CacheItem" element
     */
    public com.microsoft.schemas.crm._2011.contracts.CacheItem addNewCacheItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.CacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.CacheItem)get_store().add_element_user(CACHEITEM$0);
            return target;
        }
    }
    
    /**
     * Nils the "CacheItem" element
     */
    public void setNilCacheItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.CacheItem target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.CacheItem)get_store().find_element_user(CACHEITEM$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.CacheItem)get_store().add_element_user(CACHEITEM$0);
            }
            target.setNil();
        }
    }
}
