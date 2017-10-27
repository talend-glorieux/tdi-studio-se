/*
 * An XML document type.
 * Localname: EnumAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.EnumAttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one EnumAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class EnumAttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.EnumAttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnumAttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENUMATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "EnumAttributeMetadata");
    
    
    /**
     * Gets the "EnumAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.EnumAttributeMetadata getEnumAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EnumAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EnumAttributeMetadata)get_store().find_element_user(ENUMATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EnumAttributeMetadata" element
     */
    public boolean isNilEnumAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EnumAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EnumAttributeMetadata)get_store().find_element_user(ENUMATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EnumAttributeMetadata" element
     */
    public void setEnumAttributeMetadata(com.microsoft.schemas.xrm._2011.metadata.EnumAttributeMetadata enumAttributeMetadata)
    {
        generatedSetterHelperImpl(enumAttributeMetadata, ENUMATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnumAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.EnumAttributeMetadata addNewEnumAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EnumAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EnumAttributeMetadata)get_store().add_element_user(ENUMATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "EnumAttributeMetadata" element
     */
    public void setNilEnumAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EnumAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EnumAttributeMetadata)get_store().find_element_user(ENUMATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.EnumAttributeMetadata)get_store().add_element_user(ENUMATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
