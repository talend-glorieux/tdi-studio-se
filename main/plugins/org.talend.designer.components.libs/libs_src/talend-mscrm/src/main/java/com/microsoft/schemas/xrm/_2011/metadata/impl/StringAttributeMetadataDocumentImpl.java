/*
 * An XML document type.
 * Localname: StringAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one StringAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class StringAttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public StringAttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRINGATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "StringAttributeMetadata");
    
    
    /**
     * Gets the "StringAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata getStringAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata)get_store().find_element_user(STRINGATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "StringAttributeMetadata" element
     */
    public boolean isNilStringAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata)get_store().find_element_user(STRINGATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "StringAttributeMetadata" element
     */
    public void setStringAttributeMetadata(com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata stringAttributeMetadata)
    {
        generatedSetterHelperImpl(stringAttributeMetadata, STRINGATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StringAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata addNewStringAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata)get_store().add_element_user(STRINGATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "StringAttributeMetadata" element
     */
    public void setNilStringAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata)get_store().find_element_user(STRINGATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.StringAttributeMetadata)get_store().add_element_user(STRINGATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
