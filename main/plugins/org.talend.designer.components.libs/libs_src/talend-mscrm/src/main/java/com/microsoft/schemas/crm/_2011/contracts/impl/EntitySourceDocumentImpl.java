/*
 * An XML document type.
 * Localname: EntitySource
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.EntitySourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one EntitySource(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class EntitySourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.EntitySourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntitySourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYSOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "EntitySource");
    
    
    /**
     * Gets the "EntitySource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.EntitySource.Enum getEntitySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYSOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2011.contracts.EntitySource.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntitySource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.EntitySource xgetEntitySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.EntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.EntitySource)get_store().find_element_user(ENTITYSOURCE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EntitySource" element
     */
    public boolean isNilEntitySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.EntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.EntitySource)get_store().find_element_user(ENTITYSOURCE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EntitySource" element
     */
    public void setEntitySource(com.microsoft.schemas.crm._2011.contracts.EntitySource.Enum entitySource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYSOURCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYSOURCE$0);
            }
            target.setEnumValue(entitySource);
        }
    }
    
    /**
     * Sets (as xml) the "EntitySource" element
     */
    public void xsetEntitySource(com.microsoft.schemas.crm._2011.contracts.EntitySource entitySource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.EntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.EntitySource)get_store().find_element_user(ENTITYSOURCE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.EntitySource)get_store().add_element_user(ENTITYSOURCE$0);
            }
            target.set(entitySource);
        }
    }
    
    /**
     * Nils the "EntitySource" element
     */
    public void setNilEntitySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.EntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.EntitySource)get_store().find_element_user(ENTITYSOURCE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.EntitySource)get_store().add_element_user(ENTITYSOURCE$0);
            }
            target.setNil();
        }
    }
}
