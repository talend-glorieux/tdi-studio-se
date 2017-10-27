/*
 * An XML document type.
 * Localname: ArrayOfArrayOfUserAccessAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfUserAccessAuditDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfUserAccessAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfUserAccessAuditDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfUserAccessAuditDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfUserAccessAuditDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFUSERACCESSAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfUserAccessAuditDetail");
    
    
    /**
     * Gets the "ArrayOfArrayOfUserAccessAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfUserAccessAuditDetail getArrayOfArrayOfUserAccessAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfUserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfUserAccessAuditDetail)get_store().find_element_user(ARRAYOFARRAYOFUSERACCESSAUDITDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfUserAccessAuditDetail" element
     */
    public boolean isNilArrayOfArrayOfUserAccessAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfUserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfUserAccessAuditDetail)get_store().find_element_user(ARRAYOFARRAYOFUSERACCESSAUDITDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfUserAccessAuditDetail" element
     */
    public void setArrayOfArrayOfUserAccessAuditDetail(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfUserAccessAuditDetail arrayOfArrayOfUserAccessAuditDetail)
    {
        generatedSetterHelperImpl(arrayOfArrayOfUserAccessAuditDetail, ARRAYOFARRAYOFUSERACCESSAUDITDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfUserAccessAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfUserAccessAuditDetail addNewArrayOfArrayOfUserAccessAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfUserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfUserAccessAuditDetail)get_store().add_element_user(ARRAYOFARRAYOFUSERACCESSAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfUserAccessAuditDetail" element
     */
    public void setNilArrayOfArrayOfUserAccessAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfUserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfUserAccessAuditDetail)get_store().find_element_user(ARRAYOFARRAYOFUSERACCESSAUDITDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfUserAccessAuditDetail)get_store().add_element_user(ARRAYOFARRAYOFUSERACCESSAUDITDETAIL$0);
            }
            target.setNil();
        }
    }
}
