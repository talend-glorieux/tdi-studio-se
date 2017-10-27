/*
 * An XML document type.
 * Localname: ArrayOfArrayOfAttributeAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAttributeAuditDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfAttributeAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfAttributeAuditDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAttributeAuditDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfAttributeAuditDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFATTRIBUTEAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfAttributeAuditDetail");
    
    
    /**
     * Gets the "ArrayOfArrayOfAttributeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAttributeAuditDetail getArrayOfArrayOfAttributeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAttributeAuditDetail)get_store().find_element_user(ARRAYOFARRAYOFATTRIBUTEAUDITDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfAttributeAuditDetail" element
     */
    public boolean isNilArrayOfArrayOfAttributeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAttributeAuditDetail)get_store().find_element_user(ARRAYOFARRAYOFATTRIBUTEAUDITDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfAttributeAuditDetail" element
     */
    public void setArrayOfArrayOfAttributeAuditDetail(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAttributeAuditDetail arrayOfArrayOfAttributeAuditDetail)
    {
        generatedSetterHelperImpl(arrayOfArrayOfAttributeAuditDetail, ARRAYOFARRAYOFATTRIBUTEAUDITDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfAttributeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAttributeAuditDetail addNewArrayOfArrayOfAttributeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAttributeAuditDetail)get_store().add_element_user(ARRAYOFARRAYOFATTRIBUTEAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfAttributeAuditDetail" element
     */
    public void setNilArrayOfArrayOfAttributeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAttributeAuditDetail)get_store().find_element_user(ARRAYOFARRAYOFATTRIBUTEAUDITDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAttributeAuditDetail)get_store().add_element_user(ARRAYOFARRAYOFATTRIBUTEAUDITDETAIL$0);
            }
            target.setNil();
        }
    }
}
