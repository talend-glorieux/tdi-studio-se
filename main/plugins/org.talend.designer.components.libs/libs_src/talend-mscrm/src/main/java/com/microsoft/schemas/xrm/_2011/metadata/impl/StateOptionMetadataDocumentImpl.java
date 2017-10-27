/*
 * An XML document type.
 * Localname: StateOptionMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.StateOptionMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one StateOptionMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class StateOptionMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.StateOptionMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public StateOptionMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATEOPTIONMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "StateOptionMetadata");
    
    
    /**
     * Gets the "StateOptionMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StateOptionMetadata getStateOptionMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StateOptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StateOptionMetadata)get_store().find_element_user(STATEOPTIONMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "StateOptionMetadata" element
     */
    public boolean isNilStateOptionMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StateOptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StateOptionMetadata)get_store().find_element_user(STATEOPTIONMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "StateOptionMetadata" element
     */
    public void setStateOptionMetadata(com.microsoft.schemas.xrm._2011.metadata.StateOptionMetadata stateOptionMetadata)
    {
        generatedSetterHelperImpl(stateOptionMetadata, STATEOPTIONMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StateOptionMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StateOptionMetadata addNewStateOptionMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StateOptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StateOptionMetadata)get_store().add_element_user(STATEOPTIONMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "StateOptionMetadata" element
     */
    public void setNilStateOptionMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StateOptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StateOptionMetadata)get_store().find_element_user(STATEOPTIONMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.StateOptionMetadata)get_store().add_element_user(STATEOPTIONMETADATA$0);
            }
            target.setNil();
        }
    }
}
