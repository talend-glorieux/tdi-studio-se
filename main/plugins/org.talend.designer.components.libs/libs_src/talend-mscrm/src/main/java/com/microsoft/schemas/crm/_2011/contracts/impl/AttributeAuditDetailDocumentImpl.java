/*
 * An XML document type.
 * Localname: AttributeAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one AttributeAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class AttributeAuditDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributeAuditDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AttributeAuditDetail");
    
    
    /**
     * Gets the "AttributeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail getAttributeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail)get_store().find_element_user(ATTRIBUTEAUDITDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeAuditDetail" element
     */
    public boolean isNilAttributeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail)get_store().find_element_user(ATTRIBUTEAUDITDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AttributeAuditDetail" element
     */
    public void setAttributeAuditDetail(com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail attributeAuditDetail)
    {
        generatedSetterHelperImpl(attributeAuditDetail, ATTRIBUTEAUDITDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AttributeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail addNewAttributeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail)get_store().add_element_user(ATTRIBUTEAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "AttributeAuditDetail" element
     */
    public void setNilAttributeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail)get_store().find_element_user(ATTRIBUTEAUDITDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail)get_store().add_element_user(ATTRIBUTEAUDITDETAIL$0);
            }
            target.setNil();
        }
    }
}
