/*
 * An XML document type.
 * Localname: OneToManyRelationshipMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one OneToManyRelationshipMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class OneToManyRelationshipMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public OneToManyRelationshipMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ONETOMANYRELATIONSHIPMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "OneToManyRelationshipMetadata");
    
    
    /**
     * Gets the "OneToManyRelationshipMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata getOneToManyRelationshipMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata)get_store().find_element_user(ONETOMANYRELATIONSHIPMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OneToManyRelationshipMetadata" element
     */
    public boolean isNilOneToManyRelationshipMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata)get_store().find_element_user(ONETOMANYRELATIONSHIPMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OneToManyRelationshipMetadata" element
     */
    public void setOneToManyRelationshipMetadata(com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata oneToManyRelationshipMetadata)
    {
        generatedSetterHelperImpl(oneToManyRelationshipMetadata, ONETOMANYRELATIONSHIPMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OneToManyRelationshipMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata addNewOneToManyRelationshipMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata)get_store().add_element_user(ONETOMANYRELATIONSHIPMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "OneToManyRelationshipMetadata" element
     */
    public void setNilOneToManyRelationshipMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata)get_store().find_element_user(ONETOMANYRELATIONSHIPMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata)get_store().add_element_user(ONETOMANYRELATIONSHIPMETADATA$0);
            }
            target.setNil();
        }
    }
}
