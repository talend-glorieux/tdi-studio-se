/*
 * An XML document type.
 * Localname: ArrayOfArrayOfShareAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfShareAuditDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfShareAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfShareAuditDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfShareAuditDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfShareAuditDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFSHAREAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfShareAuditDetail");
    
    
    /**
     * Gets the "ArrayOfArrayOfShareAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfShareAuditDetail getArrayOfArrayOfShareAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfShareAuditDetail)get_store().find_element_user(ARRAYOFARRAYOFSHAREAUDITDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfShareAuditDetail" element
     */
    public boolean isNilArrayOfArrayOfShareAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfShareAuditDetail)get_store().find_element_user(ARRAYOFARRAYOFSHAREAUDITDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfShareAuditDetail" element
     */
    public void setArrayOfArrayOfShareAuditDetail(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfShareAuditDetail arrayOfArrayOfShareAuditDetail)
    {
        generatedSetterHelperImpl(arrayOfArrayOfShareAuditDetail, ARRAYOFARRAYOFSHAREAUDITDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfShareAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfShareAuditDetail addNewArrayOfArrayOfShareAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfShareAuditDetail)get_store().add_element_user(ARRAYOFARRAYOFSHAREAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfShareAuditDetail" element
     */
    public void setNilArrayOfArrayOfShareAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfShareAuditDetail)get_store().find_element_user(ARRAYOFARRAYOFSHAREAUDITDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfShareAuditDetail)get_store().add_element_user(ARRAYOFARRAYOFSHAREAUDITDETAIL$0);
            }
            target.setNil();
        }
    }
}
