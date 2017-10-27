/*
 * An XML document type.
 * Localname: QueryByAttribute
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.QueryByAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one QueryByAttribute(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class QueryByAttributeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.QueryByAttributeDocument
{
    private static final long serialVersionUID = 1L;
    
    public QueryByAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYBYATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "QueryByAttribute");
    
    
    /**
     * Gets the "QueryByAttribute" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.QueryByAttribute getQueryByAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QueryByAttribute target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QueryByAttribute)get_store().find_element_user(QUERYBYATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "QueryByAttribute" element
     */
    public boolean isNilQueryByAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QueryByAttribute target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QueryByAttribute)get_store().find_element_user(QUERYBYATTRIBUTE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "QueryByAttribute" element
     */
    public void setQueryByAttribute(com.microsoft.schemas.xrm._2011.contracts.QueryByAttribute queryByAttribute)
    {
        generatedSetterHelperImpl(queryByAttribute, QUERYBYATTRIBUTE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "QueryByAttribute" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.QueryByAttribute addNewQueryByAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QueryByAttribute target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QueryByAttribute)get_store().add_element_user(QUERYBYATTRIBUTE$0);
            return target;
        }
    }
    
    /**
     * Nils the "QueryByAttribute" element
     */
    public void setNilQueryByAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QueryByAttribute target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QueryByAttribute)get_store().find_element_user(QUERYBYATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.QueryByAttribute)get_store().add_element_user(QUERYBYATTRIBUTE$0);
            }
            target.setNil();
        }
    }
}
