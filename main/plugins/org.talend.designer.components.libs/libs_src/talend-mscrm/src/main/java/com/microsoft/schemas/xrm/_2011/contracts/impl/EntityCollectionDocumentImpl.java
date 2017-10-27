/*
 * An XML document type.
 * Localname: EntityCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.EntityCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one EntityCollection(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class EntityCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.EntityCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "EntityCollection");
    
    
    /**
     * Gets the "EntityCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityCollection getEntityCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().find_element_user(ENTITYCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityCollection" element
     */
    public boolean isNilEntityCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().find_element_user(ENTITYCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EntityCollection" element
     */
    public void setEntityCollection(com.microsoft.schemas.xrm._2011.contracts.EntityCollection entityCollection)
    {
        generatedSetterHelperImpl(entityCollection, ENTITYCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EntityCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityCollection addNewEntityCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().add_element_user(ENTITYCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "EntityCollection" element
     */
    public void setNilEntityCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().find_element_user(ENTITYCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().add_element_user(ENTITYCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
