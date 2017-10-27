/*
 * XML Type:  ArrayOfMetadataConditionExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataConditionExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * An XML ArrayOfMetadataConditionExpression(@http://schemas.microsoft.com/xrm/2011/Metadata/Query).
 *
 * This is a complex type.
 */
public class ArrayOfMetadataConditionExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataConditionExpression
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfMetadataConditionExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATACONDITIONEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataConditionExpression");
    
    
    /**
     * Gets array of all "MetadataConditionExpression" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression[] getMetadataConditionExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATACONDITIONEXPRESSION$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression[] result = new com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataConditionExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression getMetadataConditionExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression)get_store().find_element_user(METADATACONDITIONEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "MetadataConditionExpression" element
     */
    public boolean isNilMetadataConditionExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression)get_store().find_element_user(METADATACONDITIONEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "MetadataConditionExpression" element
     */
    public int sizeOfMetadataConditionExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATACONDITIONEXPRESSION$0);
        }
    }
    
    /**
     * Sets array of all "MetadataConditionExpression" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMetadataConditionExpressionArray(com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression[] metadataConditionExpressionArray)
    {
        check_orphaned();
        arraySetterHelper(metadataConditionExpressionArray, METADATACONDITIONEXPRESSION$0);
    }
    
    /**
     * Sets ith "MetadataConditionExpression" element
     */
    public void setMetadataConditionExpressionArray(int i, com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression metadataConditionExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression)get_store().find_element_user(METADATACONDITIONEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataConditionExpression);
        }
    }
    
    /**
     * Nils the ith "MetadataConditionExpression" element
     */
    public void setNilMetadataConditionExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression)get_store().find_element_user(METADATACONDITIONEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataConditionExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression insertNewMetadataConditionExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression)get_store().insert_element_user(METADATACONDITIONEXPRESSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataConditionExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression addNewMetadataConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression)get_store().add_element_user(METADATACONDITIONEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataConditionExpression" element
     */
    public void removeMetadataConditionExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATACONDITIONEXPRESSION$0, i);
        }
    }
}
