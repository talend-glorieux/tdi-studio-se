/*
 * An XML document type.
 * Localname: DeletedMetadataFilters
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataFiltersDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * A document containing one DeletedMetadataFilters(@http://schemas.microsoft.com/xrm/2011/Metadata/Query) element.
 *
 * This is a complex type.
 */
public class DeletedMetadataFiltersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataFiltersDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeletedMetadataFiltersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEDMETADATAFILTERS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "DeletedMetadataFilters");
    
    
    /**
     * Gets the "DeletedMetadataFilters" element
     */
    public java.util.List getDeletedMetadataFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETEDMETADATAFILTERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeletedMetadataFilters" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataFilters xgetDeletedMetadataFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataFilters target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataFilters)get_store().find_element_user(DELETEDMETADATAFILTERS$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DeletedMetadataFilters" element
     */
    public boolean isNilDeletedMetadataFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataFilters target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataFilters)get_store().find_element_user(DELETEDMETADATAFILTERS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DeletedMetadataFilters" element
     */
    public void setDeletedMetadataFilters(java.util.List deletedMetadataFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETEDMETADATAFILTERS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELETEDMETADATAFILTERS$0);
            }
            target.setListValue(deletedMetadataFilters);
        }
    }
    
    /**
     * Sets (as xml) the "DeletedMetadataFilters" element
     */
    public void xsetDeletedMetadataFilters(com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataFilters deletedMetadataFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataFilters target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataFilters)get_store().find_element_user(DELETEDMETADATAFILTERS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataFilters)get_store().add_element_user(DELETEDMETADATAFILTERS$0);
            }
            target.set(deletedMetadataFilters);
        }
    }
    
    /**
     * Nils the "DeletedMetadataFilters" element
     */
    public void setNilDeletedMetadataFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataFilters target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataFilters)get_store().find_element_user(DELETEDMETADATAFILTERS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataFilters)get_store().add_element_user(DELETEDMETADATAFILTERS$0);
            }
            target.setNil();
        }
    }
}
