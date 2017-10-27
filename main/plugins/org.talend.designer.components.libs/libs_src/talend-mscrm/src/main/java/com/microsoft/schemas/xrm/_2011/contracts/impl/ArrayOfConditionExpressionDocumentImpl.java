/*
 * An XML document type.
 * Localname: ArrayOfConditionExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one ArrayOfConditionExpression(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfConditionExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfConditionExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFCONDITIONEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ArrayOfConditionExpression");
    
    
    /**
     * Gets the "ArrayOfConditionExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression getArrayOfConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression)get_store().find_element_user(ARRAYOFCONDITIONEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfConditionExpression" element
     */
    public boolean isNilArrayOfConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression)get_store().find_element_user(ARRAYOFCONDITIONEXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfConditionExpression" element
     */
    public void setArrayOfConditionExpression(com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression arrayOfConditionExpression)
    {
        generatedSetterHelperImpl(arrayOfConditionExpression, ARRAYOFCONDITIONEXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfConditionExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression addNewArrayOfConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression)get_store().add_element_user(ARRAYOFCONDITIONEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfConditionExpression" element
     */
    public void setNilArrayOfConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression)get_store().find_element_user(ARRAYOFCONDITIONEXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression)get_store().add_element_user(ARRAYOFCONDITIONEXPRESSION$0);
            }
            target.setNil();
        }
    }
}
