/*
 * An XML document type.
 * Localname: ArrayOfQueryExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ArrayOfQueryExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one ArrayOfQueryExpression(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfQueryExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ArrayOfQueryExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfQueryExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFQUERYEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ArrayOfQueryExpression");
    
    
    /**
     * Gets the "ArrayOfQueryExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfQueryExpression getArrayOfQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfQueryExpression)get_store().find_element_user(ARRAYOFQUERYEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfQueryExpression" element
     */
    public boolean isNilArrayOfQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfQueryExpression)get_store().find_element_user(ARRAYOFQUERYEXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfQueryExpression" element
     */
    public void setArrayOfQueryExpression(com.microsoft.schemas.xrm._2011.contracts.ArrayOfQueryExpression arrayOfQueryExpression)
    {
        generatedSetterHelperImpl(arrayOfQueryExpression, ARRAYOFQUERYEXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfQueryExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfQueryExpression addNewArrayOfQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfQueryExpression)get_store().add_element_user(ARRAYOFQUERYEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfQueryExpression" element
     */
    public void setNilArrayOfQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfQueryExpression)get_store().find_element_user(ARRAYOFQUERYEXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfQueryExpression)get_store().add_element_user(ARRAYOFQUERYEXPRESSION$0);
            }
            target.setNil();
        }
    }
}
