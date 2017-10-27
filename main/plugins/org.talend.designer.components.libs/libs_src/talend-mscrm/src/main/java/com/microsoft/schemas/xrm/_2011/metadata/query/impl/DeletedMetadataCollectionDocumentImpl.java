/*
 * An XML document type.
 * Localname: DeletedMetadataCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * A document containing one DeletedMetadataCollection(@http://schemas.microsoft.com/xrm/2011/Metadata/Query) element.
 *
 * This is a complex type.
 */
public class DeletedMetadataCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeletedMetadataCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEDMETADATACOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "DeletedMetadataCollection");
    
    
    /**
     * Gets the "DeletedMetadataCollection" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataCollection getDeletedMetadataCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataCollection)get_store().find_element_user(DELETEDMETADATACOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DeletedMetadataCollection" element
     */
    public boolean isNilDeletedMetadataCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataCollection)get_store().find_element_user(DELETEDMETADATACOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DeletedMetadataCollection" element
     */
    public void setDeletedMetadataCollection(com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataCollection deletedMetadataCollection)
    {
        generatedSetterHelperImpl(deletedMetadataCollection, DELETEDMETADATACOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeletedMetadataCollection" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataCollection addNewDeletedMetadataCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataCollection)get_store().add_element_user(DELETEDMETADATACOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "DeletedMetadataCollection" element
     */
    public void setNilDeletedMetadataCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataCollection)get_store().find_element_user(DELETEDMETADATACOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataCollection)get_store().add_element_user(DELETEDMETADATACOLLECTION$0);
            }
            target.setNil();
        }
    }
}
