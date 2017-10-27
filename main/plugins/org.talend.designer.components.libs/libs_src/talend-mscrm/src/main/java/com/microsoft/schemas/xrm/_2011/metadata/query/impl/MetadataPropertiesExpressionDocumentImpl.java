/*
 * An XML document type.
 * Localname: MetadataPropertiesExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * A document containing one MetadataPropertiesExpression(@http://schemas.microsoft.com/xrm/2011/Metadata/Query) element.
 *
 * This is a complex type.
 */
public class MetadataPropertiesExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataPropertiesExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAPROPERTIESEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataPropertiesExpression");
    
    
    /**
     * Gets the "MetadataPropertiesExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression getMetadataPropertiesExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression)get_store().find_element_user(METADATAPROPERTIESEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "MetadataPropertiesExpression" element
     */
    public boolean isNilMetadataPropertiesExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression)get_store().find_element_user(METADATAPROPERTIESEXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "MetadataPropertiesExpression" element
     */
    public void setMetadataPropertiesExpression(com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression metadataPropertiesExpression)
    {
        generatedSetterHelperImpl(metadataPropertiesExpression, METADATAPROPERTIESEXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MetadataPropertiesExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression addNewMetadataPropertiesExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression)get_store().add_element_user(METADATAPROPERTIESEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Nils the "MetadataPropertiesExpression" element
     */
    public void setNilMetadataPropertiesExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression)get_store().find_element_user(METADATAPROPERTIESEXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression)get_store().add_element_user(METADATAPROPERTIESEXPRESSION$0);
            }
            target.setNil();
        }
    }
}
