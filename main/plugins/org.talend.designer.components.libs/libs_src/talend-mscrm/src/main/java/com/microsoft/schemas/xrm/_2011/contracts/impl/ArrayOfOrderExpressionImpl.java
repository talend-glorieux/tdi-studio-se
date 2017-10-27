/*
 * XML Type:  ArrayOfOrderExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML ArrayOfOrderExpression(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfOrderExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOrderExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDEREXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "OrderExpression");
    
    
    /**
     * Gets array of all "OrderExpression" elements
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrderExpression[] getOrderExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORDEREXPRESSION$0, targetList);
            com.microsoft.schemas.xrm._2011.contracts.OrderExpression[] result = new com.microsoft.schemas.xrm._2011.contracts.OrderExpression[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrderExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrderExpression getOrderExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrderExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrderExpression)get_store().find_element_user(ORDEREXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrderExpression" element
     */
    public boolean isNilOrderExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrderExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrderExpression)get_store().find_element_user(ORDEREXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrderExpression" element
     */
    public int sizeOfOrderExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDEREXPRESSION$0);
        }
    }
    
    /**
     * Sets array of all "OrderExpression" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOrderExpressionArray(com.microsoft.schemas.xrm._2011.contracts.OrderExpression[] orderExpressionArray)
    {
        check_orphaned();
        arraySetterHelper(orderExpressionArray, ORDEREXPRESSION$0);
    }
    
    /**
     * Sets ith "OrderExpression" element
     */
    public void setOrderExpressionArray(int i, com.microsoft.schemas.xrm._2011.contracts.OrderExpression orderExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrderExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrderExpression)get_store().find_element_user(ORDEREXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(orderExpression);
        }
    }
    
    /**
     * Nils the ith "OrderExpression" element
     */
    public void setNilOrderExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrderExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrderExpression)get_store().find_element_user(ORDEREXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrderExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrderExpression insertNewOrderExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrderExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrderExpression)get_store().insert_element_user(ORDEREXPRESSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrderExpression" element
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
     * Removes the ith "OrderExpression" element
     */
    public void removeOrderExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDEREXPRESSION$0, i);
        }
    }
}
