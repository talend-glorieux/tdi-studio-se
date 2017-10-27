/*
 * An XML document type.
 * Localname: RelationshipMetadataBase
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBaseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one RelationshipMetadataBase(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class RelationshipMetadataBaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBaseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipMetadataBaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIPMETADATABASE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "RelationshipMetadataBase");
    
    
    /**
     * Gets the "RelationshipMetadataBase" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase getRelationshipMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase)get_store().find_element_user(RELATIONSHIPMETADATABASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RelationshipMetadataBase" element
     */
    public boolean isNilRelationshipMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase)get_store().find_element_user(RELATIONSHIPMETADATABASE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RelationshipMetadataBase" element
     */
    public void setRelationshipMetadataBase(com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase relationshipMetadataBase)
    {
        generatedSetterHelperImpl(relationshipMetadataBase, RELATIONSHIPMETADATABASE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RelationshipMetadataBase" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase addNewRelationshipMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase)get_store().add_element_user(RELATIONSHIPMETADATABASE$0);
            return target;
        }
    }
    
    /**
     * Nils the "RelationshipMetadataBase" element
     */
    public void setNilRelationshipMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase)get_store().find_element_user(RELATIONSHIPMETADATABASE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.RelationshipMetadataBase)get_store().add_element_user(RELATIONSHIPMETADATABASE$0);
            }
            target.setNil();
        }
    }
}
