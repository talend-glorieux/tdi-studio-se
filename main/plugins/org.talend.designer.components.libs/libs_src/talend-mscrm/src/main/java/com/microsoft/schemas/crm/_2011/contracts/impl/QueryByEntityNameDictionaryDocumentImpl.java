/*
 * An XML document type.
 * Localname: QueryByEntityNameDictionary
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionaryDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one QueryByEntityNameDictionary(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class QueryByEntityNameDictionaryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionaryDocument
{
    private static final long serialVersionUID = 1L;
    
    public QueryByEntityNameDictionaryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYBYENTITYNAMEDICTIONARY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "QueryByEntityNameDictionary");
    
    
    /**
     * Gets the "QueryByEntityNameDictionary" element
     */
    public com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary getQueryByEntityNameDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary)get_store().find_element_user(QUERYBYENTITYNAMEDICTIONARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "QueryByEntityNameDictionary" element
     */
    public boolean isNilQueryByEntityNameDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary)get_store().find_element_user(QUERYBYENTITYNAMEDICTIONARY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "QueryByEntityNameDictionary" element
     */
    public void setQueryByEntityNameDictionary(com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary queryByEntityNameDictionary)
    {
        generatedSetterHelperImpl(queryByEntityNameDictionary, QUERYBYENTITYNAMEDICTIONARY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "QueryByEntityNameDictionary" element
     */
    public com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary addNewQueryByEntityNameDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary)get_store().add_element_user(QUERYBYENTITYNAMEDICTIONARY$0);
            return target;
        }
    }
    
    /**
     * Nils the "QueryByEntityNameDictionary" element
     */
    public void setNilQueryByEntityNameDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary)get_store().find_element_user(QUERYBYENTITYNAMEDICTIONARY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary)get_store().add_element_user(QUERYBYENTITYNAMEDICTIONARY$0);
            }
            target.setNil();
        }
    }
}
