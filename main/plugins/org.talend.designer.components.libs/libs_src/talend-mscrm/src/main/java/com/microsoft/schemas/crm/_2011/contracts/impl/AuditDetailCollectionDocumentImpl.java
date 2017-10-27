/*
 * An XML document type.
 * Localname: AuditDetailCollection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AuditDetailCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one AuditDetailCollection(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class AuditDetailCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.AuditDetailCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuditDetailCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDITDETAILCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AuditDetailCollection");
    
    
    /**
     * Gets the "AuditDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection getAuditDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection)get_store().find_element_user(AUDITDETAILCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AuditDetailCollection" element
     */
    public boolean isNilAuditDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection)get_store().find_element_user(AUDITDETAILCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AuditDetailCollection" element
     */
    public void setAuditDetailCollection(com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection auditDetailCollection)
    {
        generatedSetterHelperImpl(auditDetailCollection, AUDITDETAILCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AuditDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection addNewAuditDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection)get_store().add_element_user(AUDITDETAILCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "AuditDetailCollection" element
     */
    public void setNilAuditDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection)get_store().find_element_user(AUDITDETAILCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection)get_store().add_element_user(AUDITDETAILCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
