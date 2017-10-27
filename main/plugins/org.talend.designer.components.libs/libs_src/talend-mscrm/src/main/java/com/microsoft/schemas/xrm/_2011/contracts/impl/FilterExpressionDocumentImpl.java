/*
 * An XML document type.
 * Localname: FilterExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.FilterExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one FilterExpression(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class FilterExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.FilterExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public FilterExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTEREXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "FilterExpression");
    
    
    /**
     * Gets the "FilterExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.FilterExpression getFilterExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().find_element_user(FILTEREXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FilterExpression" element
     */
    public boolean isNilFilterExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().find_element_user(FILTEREXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FilterExpression" element
     */
    public void setFilterExpression(com.microsoft.schemas.xrm._2011.contracts.FilterExpression filterExpression)
    {
        generatedSetterHelperImpl(filterExpression, FILTEREXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FilterExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.FilterExpression addNewFilterExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().add_element_user(FILTEREXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Nils the "FilterExpression" element
     */
    public void setNilFilterExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().find_element_user(FILTEREXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().add_element_user(FILTEREXPRESSION$0);
            }
            target.setNil();
        }
    }
}
