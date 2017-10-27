/*
 * An XML document type.
 * Localname: RelationshipQueryExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * A document containing one RelationshipQueryExpression(@http://schemas.microsoft.com/xrm/2011/Metadata/Query) element.
 *
 * This is a complex type.
 */
public class RelationshipQueryExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipQueryExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIPQUERYEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "RelationshipQueryExpression");
    
    
    /**
     * Gets the "RelationshipQueryExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression getRelationshipQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression)get_store().find_element_user(RELATIONSHIPQUERYEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RelationshipQueryExpression" element
     */
    public boolean isNilRelationshipQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression)get_store().find_element_user(RELATIONSHIPQUERYEXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RelationshipQueryExpression" element
     */
    public void setRelationshipQueryExpression(com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression relationshipQueryExpression)
    {
        generatedSetterHelperImpl(relationshipQueryExpression, RELATIONSHIPQUERYEXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RelationshipQueryExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression addNewRelationshipQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression)get_store().add_element_user(RELATIONSHIPQUERYEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Nils the "RelationshipQueryExpression" element
     */
    public void setNilRelationshipQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression)get_store().find_element_user(RELATIONSHIPQUERYEXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression)get_store().add_element_user(RELATIONSHIPQUERYEXPRESSION$0);
            }
            target.setNil();
        }
    }
}
