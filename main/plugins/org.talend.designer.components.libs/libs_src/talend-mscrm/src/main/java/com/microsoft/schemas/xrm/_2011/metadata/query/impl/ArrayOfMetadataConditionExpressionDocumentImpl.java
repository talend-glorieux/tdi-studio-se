/*
 * An XML document type.
 * Localname: ArrayOfMetadataConditionExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataConditionExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * A document containing one ArrayOfMetadataConditionExpression(@http://schemas.microsoft.com/xrm/2011/Metadata/Query) element.
 *
 * This is a complex type.
 */
public class ArrayOfMetadataConditionExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataConditionExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfMetadataConditionExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFMETADATACONDITIONEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "ArrayOfMetadataConditionExpression");
    
    
    /**
     * Gets the "ArrayOfMetadataConditionExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataConditionExpression getArrayOfMetadataConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataConditionExpression)get_store().find_element_user(ARRAYOFMETADATACONDITIONEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfMetadataConditionExpression" element
     */
    public boolean isNilArrayOfMetadataConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataConditionExpression)get_store().find_element_user(ARRAYOFMETADATACONDITIONEXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfMetadataConditionExpression" element
     */
    public void setArrayOfMetadataConditionExpression(com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataConditionExpression arrayOfMetadataConditionExpression)
    {
        generatedSetterHelperImpl(arrayOfMetadataConditionExpression, ARRAYOFMETADATACONDITIONEXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfMetadataConditionExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataConditionExpression addNewArrayOfMetadataConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataConditionExpression)get_store().add_element_user(ARRAYOFMETADATACONDITIONEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfMetadataConditionExpression" element
     */
    public void setNilArrayOfMetadataConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataConditionExpression)get_store().find_element_user(ARRAYOFMETADATACONDITIONEXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.ArrayOfMetadataConditionExpression)get_store().add_element_user(ARRAYOFMETADATACONDITIONEXPRESSION$0);
            }
            target.setNil();
        }
    }
}
