/*
 * An XML document type.
 * Localname: StateAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.StateAttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one StateAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class StateAttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.StateAttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public StateAttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATEATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "StateAttributeMetadata");
    
    
    /**
     * Gets the "StateAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StateAttributeMetadata getStateAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StateAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StateAttributeMetadata)get_store().find_element_user(STATEATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "StateAttributeMetadata" element
     */
    public boolean isNilStateAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StateAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StateAttributeMetadata)get_store().find_element_user(STATEATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "StateAttributeMetadata" element
     */
    public void setStateAttributeMetadata(com.microsoft.schemas.xrm._2011.metadata.StateAttributeMetadata stateAttributeMetadata)
    {
        generatedSetterHelperImpl(stateAttributeMetadata, STATEATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StateAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StateAttributeMetadata addNewStateAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StateAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StateAttributeMetadata)get_store().add_element_user(STATEATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "StateAttributeMetadata" element
     */
    public void setNilStateAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StateAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StateAttributeMetadata)get_store().find_element_user(STATEATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.StateAttributeMetadata)get_store().add_element_user(STATEATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
