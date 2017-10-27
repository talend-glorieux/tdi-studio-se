/*
 * XML Type:  AuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML AuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class AuditDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.AuditDetail
{
    private static final long serialVersionUID = 1L;
    
    public AuditDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDITRECORD$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AuditRecord");
    
    
    /**
     * Gets the "AuditRecord" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Entity getAuditRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(AUDITRECORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AuditRecord" element
     */
    public boolean isNilAuditRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(AUDITRECORD$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AuditRecord" element
     */
    public boolean isSetAuditRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUDITRECORD$0) != 0;
        }
    }
    
    /**
     * Sets the "AuditRecord" element
     */
    public void setAuditRecord(com.microsoft.schemas.xrm._2011.contracts.Entity auditRecord)
    {
        generatedSetterHelperImpl(auditRecord, AUDITRECORD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AuditRecord" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Entity addNewAuditRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().add_element_user(AUDITRECORD$0);
            return target;
        }
    }
    
    /**
     * Nils the "AuditRecord" element
     */
    public void setNilAuditRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Entity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().find_element_user(AUDITRECORD$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Entity)get_store().add_element_user(AUDITRECORD$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AuditRecord" element
     */
    public void unsetAuditRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUDITRECORD$0, 0);
        }
    }
}
