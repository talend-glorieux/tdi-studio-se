/*
 * An XML document type.
 * Localname: RibbonLocationFilters
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.RibbonLocationFiltersDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one RibbonLocationFilters(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class RibbonLocationFiltersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.RibbonLocationFiltersDocument
{
    private static final long serialVersionUID = 1L;
    
    public RibbonLocationFiltersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RIBBONLOCATIONFILTERS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "RibbonLocationFilters");
    
    
    /**
     * Gets the "RibbonLocationFilters" element
     */
    public java.util.List getRibbonLocationFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIBBONLOCATIONFILTERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "RibbonLocationFilters" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters xgetRibbonLocationFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters)get_store().find_element_user(RIBBONLOCATIONFILTERS$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RibbonLocationFilters" element
     */
    public boolean isNilRibbonLocationFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters)get_store().find_element_user(RIBBONLOCATIONFILTERS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RibbonLocationFilters" element
     */
    public void setRibbonLocationFilters(java.util.List ribbonLocationFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIBBONLOCATIONFILTERS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RIBBONLOCATIONFILTERS$0);
            }
            target.setListValue(ribbonLocationFilters);
        }
    }
    
    /**
     * Sets (as xml) the "RibbonLocationFilters" element
     */
    public void xsetRibbonLocationFilters(com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters ribbonLocationFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters)get_store().find_element_user(RIBBONLOCATIONFILTERS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters)get_store().add_element_user(RIBBONLOCATIONFILTERS$0);
            }
            target.set(ribbonLocationFilters);
        }
    }
    
    /**
     * Nils the "RibbonLocationFilters" element
     */
    public void setNilRibbonLocationFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters)get_store().find_element_user(RIBBONLOCATIONFILTERS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.RibbonLocationFilters)get_store().add_element_user(RIBBONLOCATIONFILTERS$0);
            }
            target.setNil();
        }
    }
}
