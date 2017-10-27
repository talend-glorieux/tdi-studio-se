/*
 * An XML document type.
 * Localname: AttributeMapping
 * Namespace: http://schemas.microsoft.com/xrm/2014/Contracts
 * Java type: com.microsoft.schemas.xrm._2014.contracts.AttributeMappingDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2014.contracts.impl;
/**
 * A document containing one AttributeMapping(@http://schemas.microsoft.com/xrm/2014/Contracts) element.
 *
 * This is a complex type.
 */
public class AttributeMappingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2014.contracts.AttributeMappingDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributeMappingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEMAPPING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2014/Contracts", "AttributeMapping");
    
    
    /**
     * Gets the "AttributeMapping" element
     */
    public com.microsoft.schemas.xrm._2014.contracts.AttributeMapping getAttributeMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2014.contracts.AttributeMapping target = null;
            target = (com.microsoft.schemas.xrm._2014.contracts.AttributeMapping)get_store().find_element_user(ATTRIBUTEMAPPING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeMapping" element
     */
    public boolean isNilAttributeMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2014.contracts.AttributeMapping target = null;
            target = (com.microsoft.schemas.xrm._2014.contracts.AttributeMapping)get_store().find_element_user(ATTRIBUTEMAPPING$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AttributeMapping" element
     */
    public void setAttributeMapping(com.microsoft.schemas.xrm._2014.contracts.AttributeMapping attributeMapping)
    {
        generatedSetterHelperImpl(attributeMapping, ATTRIBUTEMAPPING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AttributeMapping" element
     */
    public com.microsoft.schemas.xrm._2014.contracts.AttributeMapping addNewAttributeMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2014.contracts.AttributeMapping target = null;
            target = (com.microsoft.schemas.xrm._2014.contracts.AttributeMapping)get_store().add_element_user(ATTRIBUTEMAPPING$0);
            return target;
        }
    }
    
    /**
     * Nils the "AttributeMapping" element
     */
    public void setNilAttributeMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2014.contracts.AttributeMapping target = null;
            target = (com.microsoft.schemas.xrm._2014.contracts.AttributeMapping)get_store().find_element_user(ATTRIBUTEMAPPING$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2014.contracts.AttributeMapping)get_store().add_element_user(ATTRIBUTEMAPPING$0);
            }
            target.setNil();
        }
    }
}
