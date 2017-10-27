/*
 * An XML document type.
 * Localname: QueryExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.QueryExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one QueryExpression(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class QueryExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.QueryExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public QueryExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "QueryExpression");
    
    
    /**
     * Gets the "QueryExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.QueryExpression getQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QueryExpression)get_store().find_element_user(QUERYEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "QueryExpression" element
     */
    public boolean isNilQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QueryExpression)get_store().find_element_user(QUERYEXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "QueryExpression" element
     */
    public void setQueryExpression(com.microsoft.schemas.xrm._2011.contracts.QueryExpression queryExpression)
    {
        generatedSetterHelperImpl(queryExpression, QUERYEXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "QueryExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.QueryExpression addNewQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QueryExpression)get_store().add_element_user(QUERYEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Nils the "QueryExpression" element
     */
    public void setNilQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QueryExpression)get_store().find_element_user(QUERYEXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.QueryExpression)get_store().add_element_user(QUERYEXPRESSION$0);
            }
            target.setNil();
        }
    }
}
