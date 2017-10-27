/*
 * An XML document type.
 * Localname: AuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AuditDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one AuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class AuditDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.AuditDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuditDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AuditDetail");
    
    
    /**
     * Gets the "AuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditDetail getAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetail)get_store().find_element_user(AUDITDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AuditDetail" element
     */
    public boolean isNilAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetail)get_store().find_element_user(AUDITDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AuditDetail" element
     */
    public void setAuditDetail(com.microsoft.schemas.crm._2011.contracts.AuditDetail auditDetail)
    {
        generatedSetterHelperImpl(auditDetail, AUDITDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditDetail addNewAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetail)get_store().add_element_user(AUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "AuditDetail" element
     */
    public void setNilAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetail)get_store().find_element_user(AUDITDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.AuditDetail)get_store().add_element_user(AUDITDETAIL$0);
            }
            target.setNil();
        }
    }
}
