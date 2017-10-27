/*
 * An XML document type.
 * Localname: EntityQueryExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.EntityQueryExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * A document containing one EntityQueryExpression(@http://schemas.microsoft.com/xrm/2011/Metadata/Query) element.
 *
 * This is a complex type.
 */
public class EntityQueryExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.EntityQueryExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityQueryExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYQUERYEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "EntityQueryExpression");
    
    
    /**
     * Gets the "EntityQueryExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.EntityQueryExpression getEntityQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.EntityQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.EntityQueryExpression)get_store().find_element_user(ENTITYQUERYEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityQueryExpression" element
     */
    public boolean isNilEntityQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.EntityQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.EntityQueryExpression)get_store().find_element_user(ENTITYQUERYEXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EntityQueryExpression" element
     */
    public void setEntityQueryExpression(com.microsoft.schemas.xrm._2011.metadata.query.EntityQueryExpression entityQueryExpression)
    {
        generatedSetterHelperImpl(entityQueryExpression, ENTITYQUERYEXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EntityQueryExpression" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.EntityQueryExpression addNewEntityQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.EntityQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.EntityQueryExpression)get_store().add_element_user(ENTITYQUERYEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Nils the "EntityQueryExpression" element
     */
    public void setNilEntityQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.EntityQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.EntityQueryExpression)get_store().find_element_user(ENTITYQUERYEXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.EntityQueryExpression)get_store().add_element_user(ENTITYQUERYEXPRESSION$0);
            }
            target.setNil();
        }
    }
}
