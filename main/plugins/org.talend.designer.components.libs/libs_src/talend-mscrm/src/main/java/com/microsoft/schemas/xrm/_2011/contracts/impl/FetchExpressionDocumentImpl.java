/*
 * An XML document type.
 * Localname: FetchExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.FetchExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one FetchExpression(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class FetchExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.FetchExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public FetchExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FETCHEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "FetchExpression");
    
    
    /**
     * Gets the "FetchExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.FetchExpression getFetchExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FetchExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FetchExpression)get_store().find_element_user(FETCHEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FetchExpression" element
     */
    public boolean isNilFetchExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FetchExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FetchExpression)get_store().find_element_user(FETCHEXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FetchExpression" element
     */
    public void setFetchExpression(com.microsoft.schemas.xrm._2011.contracts.FetchExpression fetchExpression)
    {
        generatedSetterHelperImpl(fetchExpression, FETCHEXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FetchExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.FetchExpression addNewFetchExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FetchExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FetchExpression)get_store().add_element_user(FETCHEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Nils the "FetchExpression" element
     */
    public void setNilFetchExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FetchExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FetchExpression)get_store().find_element_user(FETCHEXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.FetchExpression)get_store().add_element_user(FETCHEXPRESSION$0);
            }
            target.setNil();
        }
    }
}
