/*
 * An XML document type.
 * Localname: EntityMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.EntityMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one EntityMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class EntityMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.EntityMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "EntityMetadata");
    
    
    /**
     * Gets the "EntityMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.EntityMetadata getEntityMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EntityMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata)get_store().find_element_user(ENTITYMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityMetadata" element
     */
    public boolean isNilEntityMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EntityMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata)get_store().find_element_user(ENTITYMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EntityMetadata" element
     */
    public void setEntityMetadata(com.microsoft.schemas.xrm._2011.metadata.EntityMetadata entityMetadata)
    {
        generatedSetterHelperImpl(entityMetadata, ENTITYMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EntityMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.EntityMetadata addNewEntityMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EntityMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata)get_store().add_element_user(ENTITYMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "EntityMetadata" element
     */
    public void setNilEntityMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EntityMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata)get_store().find_element_user(ENTITYMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.EntityMetadata)get_store().add_element_user(ENTITYMETADATA$0);
            }
            target.setNil();
        }
    }
}
