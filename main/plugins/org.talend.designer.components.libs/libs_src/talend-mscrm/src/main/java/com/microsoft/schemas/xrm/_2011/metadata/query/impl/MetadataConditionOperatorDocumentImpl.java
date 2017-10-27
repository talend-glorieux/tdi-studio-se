/*
 * An XML document type.
 * Localname: MetadataConditionOperator
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperatorDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * A document containing one MetadataConditionOperator(@http://schemas.microsoft.com/xrm/2011/Metadata/Query) element.
 *
 * This is a complex type.
 */
public class MetadataConditionOperatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataConditionOperatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATACONDITIONOPERATOR$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataConditionOperator");
    
    
    /**
     * Gets the "MetadataConditionOperator" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator.Enum getMetadataConditionOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATACONDITIONOPERATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "MetadataConditionOperator" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator xgetMetadataConditionOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator)get_store().find_element_user(METADATACONDITIONOPERATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "MetadataConditionOperator" element
     */
    public boolean isNilMetadataConditionOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator)get_store().find_element_user(METADATACONDITIONOPERATOR$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "MetadataConditionOperator" element
     */
    public void setMetadataConditionOperator(com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator.Enum metadataConditionOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATACONDITIONOPERATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METADATACONDITIONOPERATOR$0);
            }
            target.setEnumValue(metadataConditionOperator);
        }
    }
    
    /**
     * Sets (as xml) the "MetadataConditionOperator" element
     */
    public void xsetMetadataConditionOperator(com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator metadataConditionOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator)get_store().find_element_user(METADATACONDITIONOPERATOR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator)get_store().add_element_user(METADATACONDITIONOPERATOR$0);
            }
            target.set(metadataConditionOperator);
        }
    }
    
    /**
     * Nils the "MetadataConditionOperator" element
     */
    public void setNilMetadataConditionOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator)get_store().find_element_user(METADATACONDITIONOPERATOR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator)get_store().add_element_user(METADATACONDITIONOPERATOR$0);
            }
            target.setNil();
        }
    }
}
