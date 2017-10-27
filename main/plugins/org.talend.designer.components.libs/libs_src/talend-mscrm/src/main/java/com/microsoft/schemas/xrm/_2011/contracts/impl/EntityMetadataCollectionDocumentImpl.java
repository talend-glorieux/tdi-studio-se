/*
 * An XML document type.
 * Localname: EntityMetadataCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.EntityMetadataCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one EntityMetadataCollection(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class EntityMetadataCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.EntityMetadataCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityMetadataCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYMETADATACOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "EntityMetadataCollection");
    
    
    /**
     * Gets the "EntityMetadataCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityMetadataCollection getEntityMetadataCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityMetadataCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityMetadataCollection)get_store().find_element_user(ENTITYMETADATACOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityMetadataCollection" element
     */
    public boolean isNilEntityMetadataCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityMetadataCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityMetadataCollection)get_store().find_element_user(ENTITYMETADATACOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EntityMetadataCollection" element
     */
    public void setEntityMetadataCollection(com.microsoft.schemas.xrm._2011.contracts.EntityMetadataCollection entityMetadataCollection)
    {
        generatedSetterHelperImpl(entityMetadataCollection, ENTITYMETADATACOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EntityMetadataCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityMetadataCollection addNewEntityMetadataCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityMetadataCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityMetadataCollection)get_store().add_element_user(ENTITYMETADATACOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "EntityMetadataCollection" element
     */
    public void setNilEntityMetadataCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityMetadataCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityMetadataCollection)get_store().find_element_user(ENTITYMETADATACOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityMetadataCollection)get_store().add_element_user(ENTITYMETADATACOLLECTION$0);
            }
            target.setNil();
        }
    }
}
