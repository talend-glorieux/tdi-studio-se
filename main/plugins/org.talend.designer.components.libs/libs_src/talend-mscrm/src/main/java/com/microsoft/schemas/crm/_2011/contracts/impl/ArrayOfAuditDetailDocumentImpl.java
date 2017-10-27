/*
 * An XML document type.
 * Localname: ArrayOfAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfAuditDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAuditDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAuditDetail");
    
    
    /**
     * Gets the "ArrayOfAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail getArrayOfAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail)get_store().find_element_user(ARRAYOFAUDITDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfAuditDetail" element
     */
    public boolean isNilArrayOfAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail)get_store().find_element_user(ARRAYOFAUDITDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfAuditDetail" element
     */
    public void setArrayOfAuditDetail(com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail arrayOfAuditDetail)
    {
        generatedSetterHelperImpl(arrayOfAuditDetail, ARRAYOFAUDITDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail addNewArrayOfAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail)get_store().add_element_user(ARRAYOFAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfAuditDetail" element
     */
    public void setNilArrayOfAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail)get_store().find_element_user(ARRAYOFAUDITDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail)get_store().add_element_user(ARRAYOFAUDITDETAIL$0);
            }
            target.setNil();
        }
    }
}
