/*
 * XML Type:  ArrayOfQueryExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ArrayOfQueryExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML ArrayOfQueryExpression(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfQueryExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ArrayOfQueryExpression
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfQueryExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "QueryExpression");
    
    
    /**
     * Gets array of all "QueryExpression" elements
     */
    public com.microsoft.schemas.xrm._2011.contracts.QueryExpression[] getQueryExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUERYEXPRESSION$0, targetList);
            com.microsoft.schemas.xrm._2011.contracts.QueryExpression[] result = new com.microsoft.schemas.xrm._2011.contracts.QueryExpression[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "QueryExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.QueryExpression getQueryExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QueryExpression)get_store().find_element_user(QUERYEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "QueryExpression" element
     */
    public boolean isNilQueryExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QueryExpression)get_store().find_element_user(QUERYEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "QueryExpression" element
     */
    public int sizeOfQueryExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYEXPRESSION$0);
        }
    }
    
    /**
     * Sets array of all "QueryExpression" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setQueryExpressionArray(com.microsoft.schemas.xrm._2011.contracts.QueryExpression[] queryExpressionArray)
    {
        check_orphaned();
        arraySetterHelper(queryExpressionArray, QUERYEXPRESSION$0);
    }
    
    /**
     * Sets ith "QueryExpression" element
     */
    public void setQueryExpressionArray(int i, com.microsoft.schemas.xrm._2011.contracts.QueryExpression queryExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QueryExpression)get_store().find_element_user(QUERYEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(queryExpression);
        }
    }
    
    /**
     * Nils the ith "QueryExpression" element
     */
    public void setNilQueryExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QueryExpression)get_store().find_element_user(QUERYEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QueryExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.QueryExpression insertNewQueryExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QueryExpression)get_store().insert_element_user(QUERYEXPRESSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QueryExpression" element
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
     * Removes the ith "QueryExpression" element
     */
    public void removeQueryExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYEXPRESSION$0, i);
        }
    }
}
