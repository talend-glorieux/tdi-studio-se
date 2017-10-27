/*
 * An XML document type.
 * Localname: AttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.AttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one AttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class AttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.AttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "AttributeMetadata");
    
    
    /**
     * Gets the "AttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata getAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata)get_store().find_element_user(ATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeMetadata" element
     */
    public boolean isNilAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata)get_store().find_element_user(ATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AttributeMetadata" element
     */
    public void setAttributeMetadata(com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata attributeMetadata)
    {
        generatedSetterHelperImpl(attributeMetadata, ATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata addNewAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata)get_store().add_element_user(ATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "AttributeMetadata" element
     */
    public void setNilAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata)get_store().find_element_user(ATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AttributeMetadata)get_store().add_element_user(ATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
