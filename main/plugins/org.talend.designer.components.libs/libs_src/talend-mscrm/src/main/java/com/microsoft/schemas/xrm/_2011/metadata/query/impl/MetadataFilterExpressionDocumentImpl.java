/*
 * An XML document type.
 * Localname: MetadataFilterExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * A document containing one MetadataFilterExpression(@http://schemas.microsoft.com/xrm/2011/Metadata/Query) element.
 *
 * This is a complex type.
 */
public class MetadataFilterExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataFilterExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAFILTEREXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataFilterExpression");
    
    
    /**
     * Gets the "MetadataFilterExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression getMetadataFilterExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression)get_store().find_element_user(METADATAFILTEREXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "MetadataFilterExpression" element
     */
    public boolean isNilMetadataFilterExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression)get_store().find_element_user(METADATAFILTEREXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "MetadataFilterExpression" element
     */
    public void setMetadataFilterExpression(com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression metadataFilterExpression)
    {
        generatedSetterHelperImpl(metadataFilterExpression, METADATAFILTEREXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MetadataFilterExpression" element
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
     * Nils the "MetadataFilterExpression" element
     */
    public void setNilMetadataFilterExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression)get_store().find_element_user(METADATAFILTEREXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression)get_store().add_element_user(METADATAFILTEREXPRESSION$0);
            }
            target.setNil();
        }
    }
}
