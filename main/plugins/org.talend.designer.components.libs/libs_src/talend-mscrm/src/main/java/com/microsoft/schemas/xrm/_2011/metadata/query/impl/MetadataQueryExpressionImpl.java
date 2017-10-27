/*
 * XML Type:  MetadataQueryExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * An XML MetadataQueryExpression(@http://schemas.microsoft.com/xrm/2011/Metadata/Query).
 *
 * This is a complex type.
 */
public class MetadataQueryExpressionImpl extends com.microsoft.schemas.xrm._2011.metadata.query.impl.MetadataQueryBaseImpl implements com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryExpression
{
    private static final long serialVersionUID = 1L;
    
    public MetadataQueryExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CRITERIA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "Criteria");
    private static final javax.xml.namespace.QName PROPERTIES$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "Properties");
    
    
    /**
     * Gets the "Criteria" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression getCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression)get_store().find_element_user(CRITERIA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Criteria" element
     */
    public boolean isNilCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression)get_store().find_element_user(CRITERIA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Criteria" element
     */
    public boolean isSetCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CRITERIA$0) != 0;
        }
    }
    
    /**
     * Sets the "Criteria" element
     */
    public void setCriteria(com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression criteria)
    {
        generatedSetterHelperImpl(criteria, CRITERIA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Criteria" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression addNewCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression)get_store().add_element_user(CRITERIA$0);
            return target;
        }
    }
    
    /**
     * Nils the "Criteria" element
     */
    public void setNilCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression)get_store().find_element_user(CRITERIA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataFilterExpression)get_store().add_element_user(CRITERIA$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Criteria" element
     */
    public void unsetCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CRITERIA$0, 0);
        }
    }
    
    /**
     * Gets the "Properties" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression getProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression)get_store().find_element_user(PROPERTIES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Properties" element
     */
    public boolean isNilProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression)get_store().find_element_user(PROPERTIES$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Properties" element
     */
    public boolean isSetProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTIES$2) != 0;
        }
    }
    
    /**
     * Sets the "Properties" element
     */
    public void setProperties(com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression properties)
    {
        generatedSetterHelperImpl(properties, PROPERTIES$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Properties" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression)get_store().add_element_user(PROPERTIES$2);
            return target;
        }
    }
    
    /**
     * Nils the "Properties" element
     */
    public void setNilProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression)get_store().find_element_user(PROPERTIES$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataPropertiesExpression)get_store().add_element_user(PROPERTIES$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Properties" element
     */
    public void unsetProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTIES$2, 0);
        }
    }
}
