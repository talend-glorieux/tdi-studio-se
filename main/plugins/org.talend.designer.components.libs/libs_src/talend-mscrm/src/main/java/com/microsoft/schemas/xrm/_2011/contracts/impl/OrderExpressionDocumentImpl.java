/*
 * An XML document type.
 * Localname: OrderExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.OrderExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one OrderExpression(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class OrderExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.OrderExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDEREXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "OrderExpression");
    
    
    /**
     * Gets the "OrderExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrderExpression getOrderExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrderExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrderExpression)get_store().find_element_user(ORDEREXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderExpression" element
     */
    public boolean isNilOrderExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrderExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrderExpression)get_store().find_element_user(ORDEREXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderExpression" element
     */
    public void setOrderExpression(com.microsoft.schemas.xrm._2011.contracts.OrderExpression orderExpression)
    {
        generatedSetterHelperImpl(orderExpression, ORDEREXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrderExpression addNewOrderExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrderExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrderExpression)get_store().add_element_user(ORDEREXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrderExpression" element
     */
    public void setNilOrderExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrderExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrderExpression)get_store().find_element_user(ORDEREXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.OrderExpression)get_store().add_element_user(ORDEREXPRESSION$0);
            }
            target.setNil();
        }
    }
}
