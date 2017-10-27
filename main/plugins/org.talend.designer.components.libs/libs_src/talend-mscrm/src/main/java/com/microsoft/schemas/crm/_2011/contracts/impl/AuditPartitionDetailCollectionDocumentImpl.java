/*
 * An XML document type.
 * Localname: AuditPartitionDetailCollection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one AuditPartitionDetailCollection(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class AuditPartitionDetailCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuditPartitionDetailCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDITPARTITIONDETAILCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AuditPartitionDetailCollection");
    
    
    /**
     * Gets the "AuditPartitionDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection getAuditPartitionDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection)get_store().find_element_user(AUDITPARTITIONDETAILCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AuditPartitionDetailCollection" element
     */
    public boolean isNilAuditPartitionDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection)get_store().find_element_user(AUDITPARTITIONDETAILCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AuditPartitionDetailCollection" element
     */
    public void setAuditPartitionDetailCollection(com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection auditPartitionDetailCollection)
    {
        generatedSetterHelperImpl(auditPartitionDetailCollection, AUDITPARTITIONDETAILCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AuditPartitionDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection addNewAuditPartitionDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection)get_store().add_element_user(AUDITPARTITIONDETAILCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "AuditPartitionDetailCollection" element
     */
    public void setNilAuditPartitionDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection)get_store().find_element_user(AUDITPARTITIONDETAILCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetailCollection)get_store().add_element_user(AUDITPARTITIONDETAILCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
