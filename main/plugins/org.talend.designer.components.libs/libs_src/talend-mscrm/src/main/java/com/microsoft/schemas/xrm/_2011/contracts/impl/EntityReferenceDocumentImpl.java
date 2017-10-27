/*
 * An XML document type.
 * Localname: EntityReference
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.EntityReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one EntityReference(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class EntityReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.EntityReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYREFERENCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "EntityReference");
    
    
    /**
     * Gets the "EntityReference" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityReference getEntityReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().find_element_user(ENTITYREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityReference" element
     */
    public boolean isNilEntityReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().find_element_user(ENTITYREFERENCE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EntityReference" element
     */
    public void setEntityReference(com.microsoft.schemas.xrm._2011.contracts.EntityReference entityReference)
    {
        generatedSetterHelperImpl(entityReference, ENTITYREFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EntityReference" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityReference addNewEntityReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().add_element_user(ENTITYREFERENCE$0);
            return target;
        }
    }
    
    /**
     * Nils the "EntityReference" element
     */
    public void setNilEntityReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().find_element_user(ENTITYREFERENCE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().add_element_user(ENTITYREFERENCE$0);
            }
            target.setNil();
        }
    }
}
