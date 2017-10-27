/*
 * An XML document type.
 * Localname: LabelQueryExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * A document containing one LabelQueryExpression(@http://schemas.microsoft.com/xrm/2011/Metadata/Query) element.
 *
 * This is a complex type.
 */
public class LabelQueryExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public LabelQueryExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABELQUERYEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "LabelQueryExpression");
    
    
    /**
     * Gets the "LabelQueryExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression getLabelQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression)get_store().find_element_user(LABELQUERYEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LabelQueryExpression" element
     */
    public boolean isNilLabelQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression)get_store().find_element_user(LABELQUERYEXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LabelQueryExpression" element
     */
    public void setLabelQueryExpression(com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression labelQueryExpression)
    {
        generatedSetterHelperImpl(labelQueryExpression, LABELQUERYEXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LabelQueryExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression addNewLabelQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression)get_store().add_element_user(LABELQUERYEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Nils the "LabelQueryExpression" element
     */
    public void setNilLabelQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression)get_store().find_element_user(LABELQUERYEXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression)get_store().add_element_user(LABELQUERYEXPRESSION$0);
            }
            target.setNil();
        }
    }
}
