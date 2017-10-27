/*
 * An XML document type.
 * Localname: LookupAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.LookupAttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one LookupAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class LookupAttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.LookupAttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public LookupAttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOOKUPATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "LookupAttributeMetadata");
    
    
    /**
     * Gets the "LookupAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.LookupAttributeMetadata getLookupAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.LookupAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.LookupAttributeMetadata)get_store().find_element_user(LOOKUPATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LookupAttributeMetadata" element
     */
    public boolean isNilLookupAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.LookupAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.LookupAttributeMetadata)get_store().find_element_user(LOOKUPATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LookupAttributeMetadata" element
     */
    public void setLookupAttributeMetadata(com.microsoft.schemas.xrm._2011.metadata.LookupAttributeMetadata lookupAttributeMetadata)
    {
        generatedSetterHelperImpl(lookupAttributeMetadata, LOOKUPATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LookupAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.LookupAttributeMetadata addNewLookupAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.LookupAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.LookupAttributeMetadata)get_store().add_element_user(LOOKUPATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "LookupAttributeMetadata" element
     */
    public void setNilLookupAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.LookupAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.LookupAttributeMetadata)get_store().find_element_user(LOOKUPATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.LookupAttributeMetadata)get_store().add_element_user(LOOKUPATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
