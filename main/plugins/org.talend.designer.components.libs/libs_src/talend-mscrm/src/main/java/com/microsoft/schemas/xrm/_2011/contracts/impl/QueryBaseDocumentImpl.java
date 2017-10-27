/*
 * An XML document type.
 * Localname: QueryBase
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.QueryBaseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one QueryBase(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class QueryBaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.QueryBaseDocument
{
    private static final long serialVersionUID = 1L;
    
    public QueryBaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYBASE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "QueryBase");
    
    
    /**
     * Gets the "QueryBase" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.QueryBase getQueryBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QueryBase target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QueryBase)get_store().find_element_user(QUERYBASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "QueryBase" element
     */
    public boolean isNilQueryBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QueryBase target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QueryBase)get_store().find_element_user(QUERYBASE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "QueryBase" element
     */
    public void setQueryBase(com.microsoft.schemas.xrm._2011.contracts.QueryBase queryBase)
    {
        generatedSetterHelperImpl(queryBase, QUERYBASE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "QueryBase" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.QueryBase addNewQueryBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QueryBase target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QueryBase)get_store().add_element_user(QUERYBASE$0);
            return target;
        }
    }
    
    /**
     * Nils the "QueryBase" element
     */
    public void setNilQueryBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QueryBase target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QueryBase)get_store().find_element_user(QUERYBASE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.QueryBase)get_store().add_element_user(QUERYBASE$0);
            }
            target.setNil();
        }
    }
}
