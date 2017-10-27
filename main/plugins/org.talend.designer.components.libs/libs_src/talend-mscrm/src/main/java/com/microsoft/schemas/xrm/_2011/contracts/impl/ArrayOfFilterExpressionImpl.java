/*
 * XML Type:  ArrayOfFilterExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML ArrayOfFilterExpression(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfFilterExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfFilterExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTEREXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "FilterExpression");
    
    
    /**
     * Gets array of all "FilterExpression" elements
     */
    public com.microsoft.schemas.xrm._2011.contracts.FilterExpression[] getFilterExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILTEREXPRESSION$0, targetList);
            com.microsoft.schemas.xrm._2011.contracts.FilterExpression[] result = new com.microsoft.schemas.xrm._2011.contracts.FilterExpression[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "FilterExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.FilterExpression getFilterExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().find_element_user(FILTEREXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "FilterExpression" element
     */
    public boolean isNilFilterExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().find_element_user(FILTEREXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "FilterExpression" element
     */
    public int sizeOfFilterExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTEREXPRESSION$0);
        }
    }
    
    /**
     * Sets array of all "FilterExpression" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFilterExpressionArray(com.microsoft.schemas.xrm._2011.contracts.FilterExpression[] filterExpressionArray)
    {
        check_orphaned();
        arraySetterHelper(filterExpressionArray, FILTEREXPRESSION$0);
    }
    
    /**
     * Sets ith "FilterExpression" element
     */
    public void setFilterExpressionArray(int i, com.microsoft.schemas.xrm._2011.contracts.FilterExpression filterExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().find_element_user(FILTEREXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(filterExpression);
        }
    }
    
    /**
     * Nils the ith "FilterExpression" element
     */
    public void setNilFilterExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().find_element_user(FILTEREXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FilterExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.FilterExpression insertNewFilterExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().insert_element_user(FILTEREXPRESSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FilterExpression" element
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
     * Removes the ith "FilterExpression" element
     */
    public void removeFilterExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTEREXPRESSION$0, i);
        }
    }
}
