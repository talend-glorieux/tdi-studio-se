/*
 * An XML document type.
 * Localname: BulkOperationSource
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.BulkOperationSourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one BulkOperationSource(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class BulkOperationSourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.BulkOperationSourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public BulkOperationSourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BULKOPERATIONSOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "BulkOperationSource");
    
    
    /**
     * Gets the "BulkOperationSource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.BulkOperationSource.Enum getBulkOperationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BULKOPERATIONSOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2011.contracts.BulkOperationSource.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "BulkOperationSource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.BulkOperationSource xgetBulkOperationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.BulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.BulkOperationSource)get_store().find_element_user(BULKOPERATIONSOURCE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "BulkOperationSource" element
     */
    public boolean isNilBulkOperationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.BulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.BulkOperationSource)get_store().find_element_user(BULKOPERATIONSOURCE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "BulkOperationSource" element
     */
    public void setBulkOperationSource(com.microsoft.schemas.crm._2011.contracts.BulkOperationSource.Enum bulkOperationSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BULKOPERATIONSOURCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BULKOPERATIONSOURCE$0);
            }
            target.setEnumValue(bulkOperationSource);
        }
    }
    
    /**
     * Sets (as xml) the "BulkOperationSource" element
     */
    public void xsetBulkOperationSource(com.microsoft.schemas.crm._2011.contracts.BulkOperationSource bulkOperationSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.BulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.BulkOperationSource)get_store().find_element_user(BULKOPERATIONSOURCE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.BulkOperationSource)get_store().add_element_user(BULKOPERATIONSOURCE$0);
            }
            target.set(bulkOperationSource);
        }
    }
    
    /**
     * Nils the "BulkOperationSource" element
     */
    public void setNilBulkOperationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.BulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.BulkOperationSource)get_store().find_element_user(BULKOPERATIONSOURCE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.BulkOperationSource)get_store().add_element_user(BULKOPERATIONSOURCE$0);
            }
            target.setNil();
        }
    }
}
