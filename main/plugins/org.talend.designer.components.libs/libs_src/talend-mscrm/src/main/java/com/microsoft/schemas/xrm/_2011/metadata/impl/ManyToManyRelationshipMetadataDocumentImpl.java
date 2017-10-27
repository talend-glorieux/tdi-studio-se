/*
 * An XML document type.
 * Localname: ManyToManyRelationshipMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ManyToManyRelationshipMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ManyToManyRelationshipMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public ManyToManyRelationshipMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANYTOMANYRELATIONSHIPMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ManyToManyRelationshipMetadata");
    
    
    /**
     * Gets the "ManyToManyRelationshipMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata getManyToManyRelationshipMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata)get_store().find_element_user(MANYTOMANYRELATIONSHIPMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ManyToManyRelationshipMetadata" element
     */
    public boolean isNilManyToManyRelationshipMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata)get_store().find_element_user(MANYTOMANYRELATIONSHIPMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ManyToManyRelationshipMetadata" element
     */
    public void setManyToManyRelationshipMetadata(com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata manyToManyRelationshipMetadata)
    {
        generatedSetterHelperImpl(manyToManyRelationshipMetadata, MANYTOMANYRELATIONSHIPMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ManyToManyRelationshipMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata addNewManyToManyRelationshipMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata)get_store().add_element_user(MANYTOMANYRELATIONSHIPMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "ManyToManyRelationshipMetadata" element
     */
    public void setNilManyToManyRelationshipMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata)get_store().find_element_user(MANYTOMANYRELATIONSHIPMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata)get_store().add_element_user(MANYTOMANYRELATIONSHIPMETADATA$0);
            }
            target.setNil();
        }
    }
}
