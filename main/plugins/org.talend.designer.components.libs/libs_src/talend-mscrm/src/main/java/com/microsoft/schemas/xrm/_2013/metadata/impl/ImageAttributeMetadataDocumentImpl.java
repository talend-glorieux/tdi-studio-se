/*
 * An XML document type.
 * Localname: ImageAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2013/Metadata
 * Java type: com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2013.metadata.impl;
/**
 * A document containing one ImageAttributeMetadata(@http://schemas.microsoft.com/xrm/2013/Metadata) element.
 *
 * This is a complex type.
 */
public class ImageAttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImageAttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMAGEATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2013/Metadata", "ImageAttributeMetadata");
    
    
    /**
     * Gets the "ImageAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata getImageAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata)get_store().find_element_user(IMAGEATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ImageAttributeMetadata" element
     */
    public boolean isNilImageAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata)get_store().find_element_user(IMAGEATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ImageAttributeMetadata" element
     */
    public void setImageAttributeMetadata(com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata imageAttributeMetadata)
    {
        generatedSetterHelperImpl(imageAttributeMetadata, IMAGEATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ImageAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata addNewImageAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata)get_store().add_element_user(IMAGEATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "ImageAttributeMetadata" element
     */
    public void setNilImageAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata)get_store().find_element_user(IMAGEATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata)get_store().add_element_user(IMAGEATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
