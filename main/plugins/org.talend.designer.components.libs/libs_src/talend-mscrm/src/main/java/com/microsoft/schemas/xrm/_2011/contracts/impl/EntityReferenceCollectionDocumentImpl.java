/*
 * An XML document type.
 * Localname: EntityReferenceCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one EntityReferenceCollection(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class EntityReferenceCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityReferenceCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYREFERENCECOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "EntityReferenceCollection");
    
    
    /**
     * Gets the "EntityReferenceCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection getEntityReferenceCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection)get_store().find_element_user(ENTITYREFERENCECOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityReferenceCollection" element
     */
    public boolean isNilEntityReferenceCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection)get_store().find_element_user(ENTITYREFERENCECOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EntityReferenceCollection" element
     */
    public void setEntityReferenceCollection(com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection entityReferenceCollection)
    {
        generatedSetterHelperImpl(entityReferenceCollection, ENTITYREFERENCECOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EntityReferenceCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection addNewEntityReferenceCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection)get_store().add_element_user(ENTITYREFERENCECOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "EntityReferenceCollection" element
     */
    public void setNilEntityReferenceCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection)get_store().find_element_user(ENTITYREFERENCECOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityReferenceCollection)get_store().add_element_user(ENTITYREFERENCECOLLECTION$0);
            }
            target.setNil();
        }
    }
}
