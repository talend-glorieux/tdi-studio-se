/*
 * An XML document type.
 * Localname: AuditPartitionDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one AuditPartitionDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class AuditPartitionDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuditPartitionDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDITPARTITIONDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AuditPartitionDetail");
    
    
    /**
     * Gets the "AuditPartitionDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail getAuditPartitionDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail)get_store().find_element_user(AUDITPARTITIONDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AuditPartitionDetail" element
     */
    public boolean isNilAuditPartitionDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail)get_store().find_element_user(AUDITPARTITIONDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AuditPartitionDetail" element
     */
    public void setAuditPartitionDetail(com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail auditPartitionDetail)
    {
        generatedSetterHelperImpl(auditPartitionDetail, AUDITPARTITIONDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AuditPartitionDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail addNewAuditPartitionDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail)get_store().add_element_user(AUDITPARTITIONDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "AuditPartitionDetail" element
     */
    public void setNilAuditPartitionDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail)get_store().find_element_user(AUDITPARTITIONDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail)get_store().add_element_user(AUDITPARTITIONDETAIL$0);
            }
            target.setNil();
        }
    }
}
