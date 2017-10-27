/*
 * An XML document type.
 * Localname: EntityFilters
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.EntityFiltersDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one EntityFilters(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class EntityFiltersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.EntityFiltersDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityFiltersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYFILTERS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "EntityFilters");
    
    
    /**
     * Gets the "EntityFilters" element
     */
    public java.util.List getEntityFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYFILTERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityFilters" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.EntityFilters xgetEntityFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EntityFilters target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EntityFilters)get_store().find_element_user(ENTITYFILTERS$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityFilters" element
     */
    public boolean isNilEntityFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EntityFilters target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EntityFilters)get_store().find_element_user(ENTITYFILTERS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EntityFilters" element
     */
    public void setEntityFilters(java.util.List entityFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYFILTERS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYFILTERS$0);
            }
            target.setListValue(entityFilters);
        }
    }
    
    /**
     * Sets (as xml) the "EntityFilters" element
     */
    public void xsetEntityFilters(com.microsoft.schemas.xrm._2011.metadata.EntityFilters entityFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EntityFilters target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EntityFilters)get_store().find_element_user(ENTITYFILTERS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.EntityFilters)get_store().add_element_user(ENTITYFILTERS$0);
            }
            target.set(entityFilters);
        }
    }
    
    /**
     * Nils the "EntityFilters" element
     */
    public void setNilEntityFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.EntityFilters target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.EntityFilters)get_store().find_element_user(ENTITYFILTERS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.EntityFilters)get_store().add_element_user(ENTITYFILTERS$0);
            }
            target.setNil();
        }
    }
}
