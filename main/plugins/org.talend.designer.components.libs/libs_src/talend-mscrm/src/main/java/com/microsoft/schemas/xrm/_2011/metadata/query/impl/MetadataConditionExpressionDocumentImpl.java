/*
 * An XML document type.
 * Localname: MetadataConditionExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * A document containing one MetadataConditionExpression(@http://schemas.microsoft.com/xrm/2011/Metadata/Query) element.
 *
 * This is a complex type.
 */
public class MetadataConditionExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataConditionExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATACONDITIONEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataConditionExpression");
    
    
    /**
     * Gets the "MetadataConditionExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression getMetadataConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression)get_store().find_element_user(METADATACONDITIONEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "MetadataConditionExpression" element
     */
    public boolean isNilMetadataConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression)get_store().find_element_user(METADATACONDITIONEXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "MetadataConditionExpression" element
     */
    public void setMetadataConditionExpression(com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression metadataConditionExpression)
    {
        generatedSetterHelperImpl(metadataConditionExpression, METADATACONDITIONEXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MetadataConditionExpression" element
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
     * Nils the "MetadataConditionExpression" element
     */
    public void setNilMetadataConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression)get_store().find_element_user(METADATACONDITIONEXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression)get_store().add_element_user(METADATACONDITIONEXPRESSION$0);
            }
            target.setNil();
        }
    }
}
