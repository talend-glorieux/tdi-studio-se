/*
 * An XML document type.
 * Localname: ArrayOfFilterExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one ArrayOfFilterExpression(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfFilterExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfFilterExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFFILTEREXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ArrayOfFilterExpression");
    
    
    /**
     * Gets the "ArrayOfFilterExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression getArrayOfFilterExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression)get_store().find_element_user(ARRAYOFFILTEREXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfFilterExpression" element
     */
    public boolean isNilArrayOfFilterExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression)get_store().find_element_user(ARRAYOFFILTEREXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfFilterExpression" element
     */
    public void setArrayOfFilterExpression(com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression arrayOfFilterExpression)
    {
        generatedSetterHelperImpl(arrayOfFilterExpression, ARRAYOFFILTEREXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfFilterExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression addNewArrayOfFilterExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression)get_store().add_element_user(ARRAYOFFILTEREXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfFilterExpression" element
     */
    public void setNilArrayOfFilterExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression)get_store().find_element_user(ARRAYOFFILTEREXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression)get_store().add_element_user(ARRAYOFFILTEREXPRESSION$0);
            }
            target.setNil();
        }
    }
}
