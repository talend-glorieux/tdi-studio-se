/*
 * An XML document type.
 * Localname: RelationshipAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one RelationshipAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class RelationshipAuditDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipAuditDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIPAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "RelationshipAuditDetail");
    
    
    /**
     * Gets the "RelationshipAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail getRelationshipAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail)get_store().find_element_user(RELATIONSHIPAUDITDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RelationshipAuditDetail" element
     */
    public boolean isNilRelationshipAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail)get_store().find_element_user(RELATIONSHIPAUDITDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RelationshipAuditDetail" element
     */
    public void setRelationshipAuditDetail(com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail relationshipAuditDetail)
    {
        generatedSetterHelperImpl(relationshipAuditDetail, RELATIONSHIPAUDITDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RelationshipAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail addNewRelationshipAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail)get_store().add_element_user(RELATIONSHIPAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "RelationshipAuditDetail" element
     */
    public void setNilRelationshipAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail)get_store().find_element_user(RELATIONSHIPAUDITDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail)get_store().add_element_user(RELATIONSHIPAUDITDETAIL$0);
            }
            target.setNil();
        }
    }
}
