/*
 * An XML document type.
 * Localname: RelationshipQueryCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.RelationshipQueryCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one RelationshipQueryCollection(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class RelationshipQueryCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.RelationshipQueryCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipQueryCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIPQUERYCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "RelationshipQueryCollection");
    
    
    /**
     * Gets the "RelationshipQueryCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.RelationshipQueryCollection getRelationshipQueryCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.RelationshipQueryCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.RelationshipQueryCollection)get_store().find_element_user(RELATIONSHIPQUERYCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RelationshipQueryCollection" element
     */
    public boolean isNilRelationshipQueryCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.RelationshipQueryCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.RelationshipQueryCollection)get_store().find_element_user(RELATIONSHIPQUERYCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RelationshipQueryCollection" element
     */
    public void setRelationshipQueryCollection(com.microsoft.schemas.xrm._2011.contracts.RelationshipQueryCollection relationshipQueryCollection)
    {
        generatedSetterHelperImpl(relationshipQueryCollection, RELATIONSHIPQUERYCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RelationshipQueryCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.RelationshipQueryCollection addNewRelationshipQueryCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.RelationshipQueryCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.RelationshipQueryCollection)get_store().add_element_user(RELATIONSHIPQUERYCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "RelationshipQueryCollection" element
     */
    public void setNilRelationshipQueryCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.RelationshipQueryCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.RelationshipQueryCollection)get_store().find_element_user(RELATIONSHIPQUERYCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.RelationshipQueryCollection)get_store().add_element_user(RELATIONSHIPQUERYCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
