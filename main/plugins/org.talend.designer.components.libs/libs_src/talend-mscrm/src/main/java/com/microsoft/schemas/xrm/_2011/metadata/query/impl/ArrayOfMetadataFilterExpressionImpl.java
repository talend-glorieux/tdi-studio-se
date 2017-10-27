/*
 * XML Type:  ArrayOfMetadataFilterExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataFilterExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * An XML ArrayOfMetadataFilterExpression(@http://schemas.microsoft.com/xrm/2011/Metadata/Query).
 *
 * This is a complex type.
 */
public class ArrayOfMetadataFilterExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataFilterExpression
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfMetadataFilterExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAFILTEREXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataFilterExpression");
    
    
    /**
     * Gets array of all "MetadataFilterExpression" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression[] getMetadataFilterExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAFILTEREXPRESSION$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression[] result = new com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataFilterExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression getMetadataFilterExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression)get_store().find_element_user(METADATAFILTEREXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "MetadataFilterExpression" element
     */
    public boolean isNilMetadataFilterExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression)get_store().find_element_user(METADATAFILTEREXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "MetadataFilterExpression" element
     */
    public int sizeOfMetadataFilterExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAFILTEREXPRESSION$0);
        }
    }
    
    /**
     * Sets array of all "MetadataFilterExpression" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMetadataFilterExpressionArray(com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression[] metadataFilterExpressionArray)
    {
        check_orphaned();
        arraySetterHelper(metadataFilterExpressionArray, METADATAFILTEREXPRESSION$0);
    }
    
    /**
     * Sets ith "MetadataFilterExpression" element
     */
    public void setMetadataFilterExpressionArray(int i, com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression metadataFilterExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression)get_store().find_element_user(METADATAFILTEREXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataFilterExpression);
        }
    }
    
    /**
     * Nils the ith "MetadataFilterExpression" element
     */
    public void setNilMetadataFilterExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression)get_store().find_element_user(METADATAFILTEREXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataFilterExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression insertNewMetadataFilterExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression)get_store().insert_element_user(METADATAFILTEREXPRESSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataFilterExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression addNewMetadataFilterExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression)get_store().add_element_user(METADATAFILTEREXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataFilterExpression" element
     */
    public void removeMetadataFilterExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAFILTEREXPRESSION$0, i);
        }
    }
}
