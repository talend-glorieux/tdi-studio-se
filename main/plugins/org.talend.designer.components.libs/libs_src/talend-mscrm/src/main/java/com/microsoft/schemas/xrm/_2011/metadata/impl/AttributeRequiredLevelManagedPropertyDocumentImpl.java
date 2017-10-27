/*
 * An XML document type.
 * Localname: AttributeRequiredLevelManagedProperty
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one AttributeRequiredLevelManagedProperty(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class AttributeRequiredLevelManagedPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributeRequiredLevelManagedPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEREQUIREDLEVELMANAGEDPROPERTY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "AttributeRequiredLevelManagedProperty");
    
    
    /**
     * Gets the "AttributeRequiredLevelManagedProperty" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty getAttributeRequiredLevelManagedProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty)get_store().find_element_user(ATTRIBUTEREQUIREDLEVELMANAGEDPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeRequiredLevelManagedProperty" element
     */
    public boolean isNilAttributeRequiredLevelManagedProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty)get_store().find_element_user(ATTRIBUTEREQUIREDLEVELMANAGEDPROPERTY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AttributeRequiredLevelManagedProperty" element
     */
    public void setAttributeRequiredLevelManagedProperty(com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty attributeRequiredLevelManagedProperty)
    {
        generatedSetterHelperImpl(attributeRequiredLevelManagedProperty, ATTRIBUTEREQUIREDLEVELMANAGEDPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AttributeRequiredLevelManagedProperty" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty addNewAttributeRequiredLevelManagedProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty)get_store().add_element_user(ATTRIBUTEREQUIREDLEVELMANAGEDPROPERTY$0);
            return target;
        }
    }
    
    /**
     * Nils the "AttributeRequiredLevelManagedProperty" element
     */
    public void setNilAttributeRequiredLevelManagedProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty)get_store().find_element_user(ATTRIBUTEREQUIREDLEVELMANAGEDPROPERTY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty)get_store().add_element_user(ATTRIBUTEREQUIREDLEVELMANAGEDPROPERTY$0);
            }
            target.setNil();
        }
    }
}
