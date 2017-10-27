/*
 * An XML document type.
 * Localname: StatusOptionMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.StatusOptionMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one StatusOptionMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class StatusOptionMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.StatusOptionMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatusOptionMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSOPTIONMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "StatusOptionMetadata");
    
    
    /**
     * Gets the "StatusOptionMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StatusOptionMetadata getStatusOptionMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StatusOptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StatusOptionMetadata)get_store().find_element_user(STATUSOPTIONMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "StatusOptionMetadata" element
     */
    public boolean isNilStatusOptionMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StatusOptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StatusOptionMetadata)get_store().find_element_user(STATUSOPTIONMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "StatusOptionMetadata" element
     */
    public void setStatusOptionMetadata(com.microsoft.schemas.xrm._2011.metadata.StatusOptionMetadata statusOptionMetadata)
    {
        generatedSetterHelperImpl(statusOptionMetadata, STATUSOPTIONMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StatusOptionMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StatusOptionMetadata addNewStatusOptionMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StatusOptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StatusOptionMetadata)get_store().add_element_user(STATUSOPTIONMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "StatusOptionMetadata" element
     */
    public void setNilStatusOptionMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StatusOptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StatusOptionMetadata)get_store().find_element_user(STATUSOPTIONMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.StatusOptionMetadata)get_store().add_element_user(STATUSOPTIONMETADATA$0);
            }
            target.setNil();
        }
    }
}
