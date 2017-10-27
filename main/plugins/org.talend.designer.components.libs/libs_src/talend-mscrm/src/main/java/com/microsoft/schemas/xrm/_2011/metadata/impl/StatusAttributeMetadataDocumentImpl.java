/*
 * An XML document type.
 * Localname: StatusAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.StatusAttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one StatusAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class StatusAttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.StatusAttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatusAttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "StatusAttributeMetadata");
    
    
    /**
     * Gets the "StatusAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StatusAttributeMetadata getStatusAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StatusAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StatusAttributeMetadata)get_store().find_element_user(STATUSATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "StatusAttributeMetadata" element
     */
    public boolean isNilStatusAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StatusAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StatusAttributeMetadata)get_store().find_element_user(STATUSATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "StatusAttributeMetadata" element
     */
    public void setStatusAttributeMetadata(com.microsoft.schemas.xrm._2011.metadata.StatusAttributeMetadata statusAttributeMetadata)
    {
        generatedSetterHelperImpl(statusAttributeMetadata, STATUSATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StatusAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StatusAttributeMetadata addNewStatusAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StatusAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StatusAttributeMetadata)get_store().add_element_user(STATUSATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "StatusAttributeMetadata" element
     */
    public void setNilStatusAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StatusAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StatusAttributeMetadata)get_store().find_element_user(STATUSATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.StatusAttributeMetadata)get_store().add_element_user(STATUSATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
