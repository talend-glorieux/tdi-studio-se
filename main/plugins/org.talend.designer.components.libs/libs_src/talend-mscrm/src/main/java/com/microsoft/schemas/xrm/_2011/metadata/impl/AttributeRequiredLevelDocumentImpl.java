/*
 * An XML document type.
 * Localname: AttributeRequiredLevel
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one AttributeRequiredLevel(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class AttributeRequiredLevelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributeRequiredLevelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEREQUIREDLEVEL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "AttributeRequiredLevel");
    
    
    /**
     * Gets the "AttributeRequiredLevel" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel.Enum getAttributeRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEREQUIREDLEVEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttributeRequiredLevel" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel xgetAttributeRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel)get_store().find_element_user(ATTRIBUTEREQUIREDLEVEL$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeRequiredLevel" element
     */
    public boolean isNilAttributeRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel)get_store().find_element_user(ATTRIBUTEREQUIREDLEVEL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AttributeRequiredLevel" element
     */
    public void setAttributeRequiredLevel(com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel.Enum attributeRequiredLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEREQUIREDLEVEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTEREQUIREDLEVEL$0);
            }
            target.setEnumValue(attributeRequiredLevel);
        }
    }
    
    /**
     * Sets (as xml) the "AttributeRequiredLevel" element
     */
    public void xsetAttributeRequiredLevel(com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel attributeRequiredLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel)get_store().find_element_user(ATTRIBUTEREQUIREDLEVEL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel)get_store().add_element_user(ATTRIBUTEREQUIREDLEVEL$0);
            }
            target.set(attributeRequiredLevel);
        }
    }
    
    /**
     * Nils the "AttributeRequiredLevel" element
     */
    public void setNilAttributeRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel)get_store().find_element_user(ATTRIBUTEREQUIREDLEVEL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel)get_store().add_element_user(ATTRIBUTEREQUIREDLEVEL$0);
            }
            target.setNil();
        }
    }
}
