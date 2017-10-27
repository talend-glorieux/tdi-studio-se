/*
 * An XML document type.
 * Localname: Entity
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.EntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one Entity(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class EntityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.EntityDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Entity");
    
    
    /**
     * Gets the "Entity" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Entity getEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(ENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Entity" element
     */
    public boolean isNilEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(ENTITY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Entity" element
     */
    public void setEntity(com.microsoft.schemas.xrm._2011.contracts.Entity entity)
    {
        generatedSetterHelperImpl(entity, ENTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Entity" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Entity addNewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().add_element_user(ENTITY$0);
            return target;
        }
    }
    
    /**
     * Nils the "Entity" element
     */
    public void setNilEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(ENTITY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().add_element_user(ENTITY$0);
            }
            target.setNil();
        }
    }
}
