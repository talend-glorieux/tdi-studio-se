/*
 * An XML document type.
 * Localname: EntityState
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.EntityStateDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one EntityState(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class EntityStateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.EntityStateDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityStateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYSTATE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "EntityState");
    
    
    /**
     * Gets the "EntityState" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityState.Enum getEntityState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYSTATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.contracts.EntityState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityState" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityState xgetEntityState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityState target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityState)get_store().find_element_user(ENTITYSTATE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityState" element
     */
    public boolean isNilEntityState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityState target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityState)get_store().find_element_user(ENTITYSTATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EntityState" element
     */
    public void setEntityState(com.microsoft.schemas.xrm._2011.contracts.EntityState.Enum entityState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYSTATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYSTATE$0);
            }
            target.setEnumValue(entityState);
        }
    }
    
    /**
     * Sets (as xml) the "EntityState" element
     */
    public void xsetEntityState(com.microsoft.schemas.xrm._2011.contracts.EntityState entityState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityState target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityState)get_store().find_element_user(ENTITYSTATE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityState)get_store().add_element_user(ENTITYSTATE$0);
            }
            target.set(entityState);
        }
    }
    
    /**
     * Nils the "EntityState" element
     */
    public void setNilEntityState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityState target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityState)get_store().find_element_user(ENTITYSTATE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityState)get_store().add_element_user(ENTITYSTATE$0);
            }
            target.setNil();
        }
    }
}
