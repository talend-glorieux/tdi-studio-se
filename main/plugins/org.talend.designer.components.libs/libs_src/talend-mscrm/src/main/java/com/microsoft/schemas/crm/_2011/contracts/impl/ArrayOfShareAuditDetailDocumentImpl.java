/*
 * An XML document type.
 * Localname: ArrayOfShareAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfShareAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfShareAuditDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfShareAuditDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSHAREAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfShareAuditDetail");
    
    
    /**
     * Gets the "ArrayOfShareAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail getArrayOfShareAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail)get_store().find_element_user(ARRAYOFSHAREAUDITDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfShareAuditDetail" element
     */
    public boolean isNilArrayOfShareAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail)get_store().find_element_user(ARRAYOFSHAREAUDITDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfShareAuditDetail" element
     */
    public void setArrayOfShareAuditDetail(com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail arrayOfShareAuditDetail)
    {
        generatedSetterHelperImpl(arrayOfShareAuditDetail, ARRAYOFSHAREAUDITDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfShareAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail addNewArrayOfShareAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail)get_store().add_element_user(ARRAYOFSHAREAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfShareAuditDetail" element
     */
    public void setNilArrayOfShareAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail)get_store().find_element_user(ARRAYOFSHAREAUDITDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfShareAuditDetail)get_store().add_element_user(ARRAYOFSHAREAUDITDETAIL$0);
            }
            target.setNil();
        }
    }
}
