/*
 * XML Type:  EntityQueryExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.EntityQueryExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * An XML EntityQueryExpression(@http://schemas.microsoft.com/xrm/2011/Metadata/Query).
 *
 * This is a complex type.
 */
public class EntityQueryExpressionImpl extends com.microsoft.schemas.xrm._2011.metadata.query.impl.MetadataQueryExpressionImpl implements com.microsoft.schemas.xrm._2011.metadata.query.EntityQueryExpression
{
    private static final long serialVersionUID = 1L;
    
    public EntityQueryExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEQUERY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "AttributeQuery");
    private static final javax.xml.namespace.QName LABELQUERY$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "LabelQuery");
    private static final javax.xml.namespace.QName RELATIONSHIPQUERY$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "RelationshipQuery");
    
    
    /**
     * Gets the "AttributeQuery" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression getAttributeQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression)get_store().find_element_user(ATTRIBUTEQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeQuery" element
     */
    public boolean isNilAttributeQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression)get_store().find_element_user(ATTRIBUTEQUERY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AttributeQuery" element
     */
    public boolean isSetAttributeQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEQUERY$0) != 0;
        }
    }
    
    /**
     * Sets the "AttributeQuery" element
     */
    public void setAttributeQuery(com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression attributeQuery)
    {
        generatedSetterHelperImpl(attributeQuery, ATTRIBUTEQUERY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AttributeQuery" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression addNewAttributeQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression)get_store().add_element_user(ATTRIBUTEQUERY$0);
            return target;
        }
    }
    
    /**
     * Nils the "AttributeQuery" element
     */
    public void setNilAttributeQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression)get_store().find_element_user(ATTRIBUTEQUERY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.AttributeQueryExpression)get_store().add_element_user(ATTRIBUTEQUERY$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AttributeQuery" element
     */
    public void unsetAttributeQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEQUERY$0, 0);
        }
    }
    
    /**
     * Gets the "LabelQuery" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression getLabelQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression)get_store().find_element_user(LABELQUERY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LabelQuery" element
     */
    public boolean isNilLabelQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression)get_store().find_element_user(LABELQUERY$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LabelQuery" element
     */
    public boolean isSetLabelQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LABELQUERY$2) != 0;
        }
    }
    
    /**
     * Sets the "LabelQuery" element
     */
    public void setLabelQuery(com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression labelQuery)
    {
        generatedSetterHelperImpl(labelQuery, LABELQUERY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LabelQuery" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression addNewLabelQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression)get_store().add_element_user(LABELQUERY$2);
            return target;
        }
    }
    
    /**
     * Nils the "LabelQuery" element
     */
    public void setNilLabelQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression)get_store().find_element_user(LABELQUERY$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.LabelQueryExpression)get_store().add_element_user(LABELQUERY$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LabelQuery" element
     */
    public void unsetLabelQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LABELQUERY$2, 0);
        }
    }
    
    /**
     * Gets the "RelationshipQuery" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression getRelationshipQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression)get_store().find_element_user(RELATIONSHIPQUERY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RelationshipQuery" element
     */
    public boolean isNilRelationshipQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression)get_store().find_element_user(RELATIONSHIPQUERY$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RelationshipQuery" element
     */
    public boolean isSetRelationshipQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONSHIPQUERY$4) != 0;
        }
    }
    
    /**
     * Sets the "RelationshipQuery" element
     */
    public void setRelationshipQuery(com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression relationshipQuery)
    {
        generatedSetterHelperImpl(relationshipQuery, RELATIONSHIPQUERY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RelationshipQuery" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression addNewRelationshipQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression)get_store().add_element_user(RELATIONSHIPQUERY$4);
            return target;
        }
    }
    
    /**
     * Nils the "RelationshipQuery" element
     */
    public void setNilRelationshipQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression)get_store().find_element_user(RELATIONSHIPQUERY$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.RelationshipQueryExpression)get_store().add_element_user(RELATIONSHIPQUERY$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RelationshipQuery" element
     */
    public void unsetRelationshipQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONSHIPQUERY$4, 0);
        }
    }
}
