/*
 * An XML document type.
 * Localname: ArrayOfRelationshipAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfRelationshipAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfRelationshipAuditDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRelationshipAuditDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFRELATIONSHIPAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfRelationshipAuditDetail");
    
    
    /**
     * Gets the "ArrayOfRelationshipAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail getArrayOfRelationshipAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail)get_store().find_element_user(ARRAYOFRELATIONSHIPAUDITDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfRelationshipAuditDetail" element
     */
    public boolean isNilArrayOfRelationshipAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail)get_store().find_element_user(ARRAYOFRELATIONSHIPAUDITDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfRelationshipAuditDetail" element
     */
    public void setArrayOfRelationshipAuditDetail(com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail arrayOfRelationshipAuditDetail)
    {
        generatedSetterHelperImpl(arrayOfRelationshipAuditDetail, ARRAYOFRELATIONSHIPAUDITDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfRelationshipAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail addNewArrayOfRelationshipAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail)get_store().add_element_user(ARRAYOFRELATIONSHIPAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfRelationshipAuditDetail" element
     */
    public void setNilArrayOfRelationshipAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail)get_store().find_element_user(ARRAYOFRELATIONSHIPAUDITDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail)get_store().add_element_user(ARRAYOFRELATIONSHIPAUDITDETAIL$0);
            }
            target.setNil();
        }
    }
}
