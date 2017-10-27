/*
 * An XML document type.
 * Localname: EntityNameAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.EntityNameAttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one EntityNameAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class EntityNameAttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.EntityNameAttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityNameAttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYNAMEATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "EntityNameAttributeMetadata");
    
    
    /**
     * Gets the "EntityNameAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.EntityNameAttributeMetadata getEntityNameAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EntityNameAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EntityNameAttributeMetadata)get_store().find_element_user(ENTITYNAMEATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityNameAttributeMetadata" element
     */
    public boolean isNilEntityNameAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EntityNameAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EntityNameAttributeMetadata)get_store().find_element_user(ENTITYNAMEATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EntityNameAttributeMetadata" element
     */
    public void setEntityNameAttributeMetadata(com.microsoft.schemas.xrm._2011.metadata.EntityNameAttributeMetadata entityNameAttributeMetadata)
    {
        generatedSetterHelperImpl(entityNameAttributeMetadata, ENTITYNAMEATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EntityNameAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.EntityNameAttributeMetadata addNewEntityNameAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EntityNameAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EntityNameAttributeMetadata)get_store().add_element_user(ENTITYNAMEATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "EntityNameAttributeMetadata" element
     */
    public void setNilEntityNameAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EntityNameAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EntityNameAttributeMetadata)get_store().find_element_user(ENTITYNAMEATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.EntityNameAttributeMetadata)get_store().add_element_user(ENTITYNAMEATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
