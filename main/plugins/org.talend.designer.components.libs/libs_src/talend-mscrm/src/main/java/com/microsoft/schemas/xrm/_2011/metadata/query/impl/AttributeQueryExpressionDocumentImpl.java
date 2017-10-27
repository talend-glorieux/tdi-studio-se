/*
 * An XML document type.
 * Localname: AttributeQueryExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * A document containing one AttributeQueryExpression(@http://schemas.microsoft.com/xrm/2011/Metadata/Query) element.
 *
 * This is a complex type.
 */
public class AttributeQueryExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributeQueryExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEQUERYEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "AttributeQueryExpression");
    
    
    /**
     * Gets the "AttributeQueryExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression getAttributeQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression)get_store().find_element_user(ATTRIBUTEQUERYEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeQueryExpression" element
     */
    public boolean isNilAttributeQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression)get_store().find_element_user(ATTRIBUTEQUERYEXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AttributeQueryExpression" element
     */
    public void setAttributeQueryExpression(com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression attributeQueryExpression)
    {
        generatedSetterHelperImpl(attributeQueryExpression, ATTRIBUTEQUERYEXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AttributeQueryExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression addNewAttributeQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression)get_store().add_element_user(ATTRIBUTEQUERYEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Nils the "AttributeQueryExpression" element
     */
    public void setNilAttributeQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression)get_store().find_element_user(ATTRIBUTEQUERYEXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression)get_store().add_element_user(ATTRIBUTEQUERYEXPRESSION$0);
            }
            target.setNil();
        }
    }
}
