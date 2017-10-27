/*
 * An XML document type.
 * Localname: ArrayOfArrayOfAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfAuditDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfAuditDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfAuditDetail");
    
    
    /**
     * Gets the "ArrayOfArrayOfAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetail getArrayOfArrayOfAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetail)get_store().find_element_user(ARRAYOFARRAYOFAUDITDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfAuditDetail" element
     */
    public boolean isNilArrayOfArrayOfAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetail)get_store().find_element_user(ARRAYOFARRAYOFAUDITDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfAuditDetail" element
     */
    public void setArrayOfArrayOfAuditDetail(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetail arrayOfArrayOfAuditDetail)
    {
        generatedSetterHelperImpl(arrayOfArrayOfAuditDetail, ARRAYOFARRAYOFAUDITDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetail addNewArrayOfArrayOfAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetail)get_store().add_element_user(ARRAYOFARRAYOFAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfAuditDetail" element
     */
    public void setNilArrayOfArrayOfAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetail)get_store().find_element_user(ARRAYOFARRAYOFAUDITDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetail)get_store().add_element_user(ARRAYOFARRAYOFAUDITDETAIL$0);
            }
            target.setNil();
        }
    }
}
