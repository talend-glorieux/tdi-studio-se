/*
 * An XML document type.
 * Localname: ArrayOfMetadataFilterExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataFilterExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * A document containing one ArrayOfMetadataFilterExpression(@http://schemas.microsoft.com/xrm/2011/Metadata/Query) element.
 *
 * This is a complex type.
 */
public class ArrayOfMetadataFilterExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataFilterExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfMetadataFilterExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFMETADATAFILTEREXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "ArrayOfMetadataFilterExpression");
    
    
    /**
     * Gets the "ArrayOfMetadataFilterExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataFilterExpression getArrayOfMetadataFilterExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataFilterExpression)get_store().find_element_user(ARRAYOFMETADATAFILTEREXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfMetadataFilterExpression" element
     */
    public boolean isNilArrayOfMetadataFilterExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataFilterExpression)get_store().find_element_user(ARRAYOFMETADATAFILTEREXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfMetadataFilterExpression" element
     */
    public void setArrayOfMetadataFilterExpression(com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataFilterExpression arrayOfMetadataFilterExpression)
    {
        generatedSetterHelperImpl(arrayOfMetadataFilterExpression, ARRAYOFMETADATAFILTEREXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfMetadataFilterExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataFilterExpression addNewArrayOfMetadataFilterExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataFilterExpression)get_store().add_element_user(ARRAYOFMETADATAFILTEREXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfMetadataFilterExpression" element
     */
    public void setNilArrayOfMetadataFilterExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataFilterExpression)get_store().find_element_user(ARRAYOFMETADATAFILTEREXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataFilterExpression)get_store().add_element_user(ARRAYOFMETADATAFILTEREXPRESSION$0);
            }
            target.setNil();
        }
    }
}
