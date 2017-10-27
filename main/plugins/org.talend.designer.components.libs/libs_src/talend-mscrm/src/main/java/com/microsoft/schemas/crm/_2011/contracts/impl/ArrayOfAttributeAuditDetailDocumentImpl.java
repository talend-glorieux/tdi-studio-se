/*
 * An XML document type.
 * Localname: ArrayOfAttributeAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfAttributeAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfAttributeAuditDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAttributeAuditDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFATTRIBUTEAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAttributeAuditDetail");
    
    
    /**
     * Gets the "ArrayOfAttributeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail getArrayOfAttributeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail)get_store().find_element_user(ARRAYOFATTRIBUTEAUDITDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfAttributeAuditDetail" element
     */
    public boolean isNilArrayOfAttributeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail)get_store().find_element_user(ARRAYOFATTRIBUTEAUDITDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfAttributeAuditDetail" element
     */
    public void setArrayOfAttributeAuditDetail(com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail arrayOfAttributeAuditDetail)
    {
        generatedSetterHelperImpl(arrayOfAttributeAuditDetail, ARRAYOFATTRIBUTEAUDITDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfAttributeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail addNewArrayOfAttributeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail)get_store().add_element_user(ARRAYOFATTRIBUTEAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfAttributeAuditDetail" element
     */
    public void setNilArrayOfAttributeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail)get_store().find_element_user(ARRAYOFATTRIBUTEAUDITDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail)get_store().add_element_user(ARRAYOFATTRIBUTEAUDITDETAIL$0);
            }
            target.setNil();
        }
    }
}
