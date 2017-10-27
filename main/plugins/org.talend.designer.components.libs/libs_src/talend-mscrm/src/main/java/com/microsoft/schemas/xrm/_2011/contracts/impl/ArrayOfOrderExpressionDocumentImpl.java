/*
 * An XML document type.
 * Localname: ArrayOfOrderExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one ArrayOfOrderExpression(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfOrderExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOrderExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFORDEREXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ArrayOfOrderExpression");
    
    
    /**
     * Gets the "ArrayOfOrderExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression getArrayOfOrderExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression)get_store().find_element_user(ARRAYOFORDEREXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfOrderExpression" element
     */
    public boolean isNilArrayOfOrderExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression)get_store().find_element_user(ARRAYOFORDEREXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfOrderExpression" element
     */
    public void setArrayOfOrderExpression(com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression arrayOfOrderExpression)
    {
        generatedSetterHelperImpl(arrayOfOrderExpression, ARRAYOFORDEREXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfOrderExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression addNewArrayOfOrderExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression)get_store().add_element_user(ARRAYOFORDEREXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfOrderExpression" element
     */
    public void setNilArrayOfOrderExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression)get_store().find_element_user(ARRAYOFORDEREXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression)get_store().add_element_user(ARRAYOFORDEREXPRESSION$0);
            }
            target.setNil();
        }
    }
}
