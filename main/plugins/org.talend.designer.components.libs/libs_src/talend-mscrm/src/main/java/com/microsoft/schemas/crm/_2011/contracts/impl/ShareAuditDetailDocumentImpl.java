/*
 * An XML document type.
 * Localname: ShareAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ShareAuditDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ShareAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ShareAuditDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ShareAuditDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ShareAuditDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHAREAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ShareAuditDetail");
    
    
    /**
     * Gets the "ShareAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail getShareAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail)get_store().find_element_user(SHAREAUDITDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ShareAuditDetail" element
     */
    public boolean isNilShareAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail)get_store().find_element_user(SHAREAUDITDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ShareAuditDetail" element
     */
    public void setShareAuditDetail(com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail shareAuditDetail)
    {
        generatedSetterHelperImpl(shareAuditDetail, SHAREAUDITDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ShareAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail addNewShareAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail)get_store().add_element_user(SHAREAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ShareAuditDetail" element
     */
    public void setNilShareAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail)get_store().find_element_user(SHAREAUDITDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail)get_store().add_element_user(SHAREAUDITDETAIL$0);
            }
            target.setNil();
        }
    }
}
