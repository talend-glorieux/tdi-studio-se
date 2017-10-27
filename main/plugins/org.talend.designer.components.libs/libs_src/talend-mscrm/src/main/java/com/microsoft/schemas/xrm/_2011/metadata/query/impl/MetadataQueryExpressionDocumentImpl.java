/*
 * An XML document type.
 * Localname: MetadataQueryExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * A document containing one MetadataQueryExpression(@http://schemas.microsoft.com/xrm/2011/Metadata/Query) element.
 *
 * This is a complex type.
 */
public class MetadataQueryExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataQueryExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAQUERYEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataQueryExpression");
    
    
    /**
     * Gets the "MetadataQueryExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryExpression getMetadataQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryExpression)get_store().find_element_user(METADATAQUERYEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "MetadataQueryExpression" element
     */
    public boolean isNilMetadataQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryExpression)get_store().find_element_user(METADATAQUERYEXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "MetadataQueryExpression" element
     */
    public void setMetadataQueryExpression(com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryExpression metadataQueryExpression)
    {
        generatedSetterHelperImpl(metadataQueryExpression, METADATAQUERYEXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MetadataQueryExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryExpression addNewMetadataQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryExpression)get_store().add_element_user(METADATAQUERYEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Nils the "MetadataQueryExpression" element
     */
    public void setNilMetadataQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryExpression)get_store().find_element_user(METADATAQUERYEXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryExpression)get_store().add_element_user(METADATAQUERYEXPRESSION$0);
            }
            target.setNil();
        }
    }
}
