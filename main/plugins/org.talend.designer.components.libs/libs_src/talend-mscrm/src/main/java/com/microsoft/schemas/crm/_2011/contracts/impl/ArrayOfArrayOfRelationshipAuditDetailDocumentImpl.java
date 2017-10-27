/*
 * An XML document type.
 * Localname: ArrayOfArrayOfRelationshipAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRelationshipAuditDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfRelationshipAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfRelationshipAuditDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRelationshipAuditDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfRelationshipAuditDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFRELATIONSHIPAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfRelationshipAuditDetail");
    
    
    /**
     * Gets the "ArrayOfArrayOfRelationshipAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRelationshipAuditDetail getArrayOfArrayOfRelationshipAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRelationshipAuditDetail)get_store().find_element_user(ARRAYOFARRAYOFRELATIONSHIPAUDITDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfRelationshipAuditDetail" element
     */
    public boolean isNilArrayOfArrayOfRelationshipAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRelationshipAuditDetail)get_store().find_element_user(ARRAYOFARRAYOFRELATIONSHIPAUDITDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfRelationshipAuditDetail" element
     */
    public void setArrayOfArrayOfRelationshipAuditDetail(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRelationshipAuditDetail arrayOfArrayOfRelationshipAuditDetail)
    {
        generatedSetterHelperImpl(arrayOfArrayOfRelationshipAuditDetail, ARRAYOFARRAYOFRELATIONSHIPAUDITDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfRelationshipAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRelationshipAuditDetail addNewArrayOfArrayOfRelationshipAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRelationshipAuditDetail)get_store().add_element_user(ARRAYOFARRAYOFRELATIONSHIPAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfRelationshipAuditDetail" element
     */
    public void setNilArrayOfArrayOfRelationshipAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRelationshipAuditDetail)get_store().find_element_user(ARRAYOFARRAYOFRELATIONSHIPAUDITDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRelationshipAuditDetail)get_store().add_element_user(ARRAYOFARRAYOFRELATIONSHIPAUDITDETAIL$0);
            }
            target.setNil();
        }
    }
}
