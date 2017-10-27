/*
 * XML Type:  ArrayOfConditionExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML ArrayOfConditionExpression(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfConditionExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfConditionExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITIONEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ConditionExpression");
    
    
    /**
     * Gets array of all "ConditionExpression" elements
     */
    public com.microsoft.schemas.xrm._2011.contracts.ConditionExpression[] getConditionExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONDITIONEXPRESSION$0, targetList);
            com.microsoft.schemas.xrm._2011.contracts.ConditionExpression[] result = new com.microsoft.schemas.xrm._2011.contracts.ConditionExpression[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConditionExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ConditionExpression getConditionExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ConditionExpression)get_store().find_element_user(CONDITIONEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ConditionExpression" element
     */
    public boolean isNilConditionExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ConditionExpression)get_store().find_element_user(CONDITIONEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ConditionExpression" element
     */
    public int sizeOfConditionExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDITIONEXPRESSION$0);
        }
    }
    
    /**
     * Sets array of all "ConditionExpression" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setConditionExpressionArray(com.microsoft.schemas.xrm._2011.contracts.ConditionExpression[] conditionExpressionArray)
    {
        check_orphaned();
        arraySetterHelper(conditionExpressionArray, CONDITIONEXPRESSION$0);
    }
    
    /**
     * Sets ith "ConditionExpression" element
     */
    public void setConditionExpressionArray(int i, com.microsoft.schemas.xrm._2011.contracts.ConditionExpression conditionExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ConditionExpression)get_store().find_element_user(CONDITIONEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conditionExpression);
        }
    }
    
    /**
     * Nils the ith "ConditionExpression" element
     */
    public void setNilConditionExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ConditionExpression)get_store().find_element_user(CONDITIONEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConditionExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ConditionExpression insertNewConditionExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ConditionExpression)get_store().insert_element_user(CONDITIONEXPRESSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConditionExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ConditionExpression addNewConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ConditionExpression)get_store().add_element_user(CONDITIONEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ConditionExpression" element
     */
    public void removeConditionExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDITIONEXPRESSION$0, i);
        }
    }
}
