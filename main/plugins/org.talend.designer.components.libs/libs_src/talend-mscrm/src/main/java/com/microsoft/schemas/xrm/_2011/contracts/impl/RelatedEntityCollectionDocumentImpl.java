/*
 * An XML document type.
 * Localname: RelatedEntityCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one RelatedEntityCollection(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class RelatedEntityCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelatedEntityCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDENTITYCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "RelatedEntityCollection");
    
    
    /**
     * Gets the "RelatedEntityCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection getRelatedEntityCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection)get_store().find_element_user(RELATEDENTITYCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RelatedEntityCollection" element
     */
    public boolean isNilRelatedEntityCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection)get_store().find_element_user(RELATEDENTITYCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RelatedEntityCollection" element
     */
    public void setRelatedEntityCollection(com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection relatedEntityCollection)
    {
        generatedSetterHelperImpl(relatedEntityCollection, RELATEDENTITYCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RelatedEntityCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection addNewRelatedEntityCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection)get_store().add_element_user(RELATEDENTITYCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "RelatedEntityCollection" element
     */
    public void setNilRelatedEntityCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection)get_store().find_element_user(RELATEDENTITYCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection)get_store().add_element_user(RELATEDENTITYCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
