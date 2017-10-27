/*
 * An XML document type.
 * Localname: PicklistAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.PicklistAttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one PicklistAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class PicklistAttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.PicklistAttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public PicklistAttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PICKLISTATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "PicklistAttributeMetadata");
    
    
    /**
     * Gets the "PicklistAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.PicklistAttributeMetadata getPicklistAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.PicklistAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.PicklistAttributeMetadata)get_store().find_element_user(PICKLISTATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PicklistAttributeMetadata" element
     */
    public boolean isNilPicklistAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.PicklistAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.PicklistAttributeMetadata)get_store().find_element_user(PICKLISTATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PicklistAttributeMetadata" element
     */
    public void setPicklistAttributeMetadata(com.microsoft.schemas.xrm._2011.metadata.PicklistAttributeMetadata picklistAttributeMetadata)
    {
        generatedSetterHelperImpl(picklistAttributeMetadata, PICKLISTATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PicklistAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.PicklistAttributeMetadata addNewPicklistAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.PicklistAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.PicklistAttributeMetadata)get_store().add_element_user(PICKLISTATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "PicklistAttributeMetadata" element
     */
    public void setNilPicklistAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.PicklistAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.PicklistAttributeMetadata)get_store().find_element_user(PICKLISTATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.PicklistAttributeMetadata)get_store().add_element_user(PICKLISTATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
