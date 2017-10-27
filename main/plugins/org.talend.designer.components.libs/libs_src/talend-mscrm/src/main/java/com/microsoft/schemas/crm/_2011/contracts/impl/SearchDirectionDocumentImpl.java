/*
 * An XML document type.
 * Localname: SearchDirection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.SearchDirectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one SearchDirection(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class SearchDirectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.SearchDirectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public SearchDirectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHDIRECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SearchDirection");
    
    
    /**
     * Gets the "SearchDirection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SearchDirection.Enum getSearchDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHDIRECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2011.contracts.SearchDirection.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SearchDirection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SearchDirection xgetSearchDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchDirection)get_store().find_element_user(SEARCHDIRECTION$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SearchDirection" element
     */
    public boolean isNilSearchDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchDirection)get_store().find_element_user(SEARCHDIRECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SearchDirection" element
     */
    public void setSearchDirection(com.microsoft.schemas.crm._2011.contracts.SearchDirection.Enum searchDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHDIRECTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHDIRECTION$0);
            }
            target.setEnumValue(searchDirection);
        }
    }
    
    /**
     * Sets (as xml) the "SearchDirection" element
     */
    public void xsetSearchDirection(com.microsoft.schemas.crm._2011.contracts.SearchDirection searchDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchDirection)get_store().find_element_user(SEARCHDIRECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.SearchDirection)get_store().add_element_user(SEARCHDIRECTION$0);
            }
            target.set(searchDirection);
        }
    }
    
    /**
     * Nils the "SearchDirection" element
     */
    public void setNilSearchDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchDirection)get_store().find_element_user(SEARCHDIRECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.SearchDirection)get_store().add_element_user(SEARCHDIRECTION$0);
            }
            target.setNil();
        }
    }
}
