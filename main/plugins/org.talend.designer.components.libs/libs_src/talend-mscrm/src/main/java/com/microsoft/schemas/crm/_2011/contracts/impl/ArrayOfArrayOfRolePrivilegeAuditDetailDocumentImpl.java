/*
 * An XML document type.
 * Localname: ArrayOfArrayOfRolePrivilegeAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilegeAuditDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfRolePrivilegeAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfRolePrivilegeAuditDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilegeAuditDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfRolePrivilegeAuditDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFROLEPRIVILEGEAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfRolePrivilegeAuditDetail");
    
    
    /**
     * Gets the "ArrayOfArrayOfRolePrivilegeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilegeAuditDetail getArrayOfArrayOfRolePrivilegeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilegeAuditDetail)get_store().find_element_user(ARRAYOFARRAYOFROLEPRIVILEGEAUDITDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfRolePrivilegeAuditDetail" element
     */
    public boolean isNilArrayOfArrayOfRolePrivilegeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilegeAuditDetail)get_store().find_element_user(ARRAYOFARRAYOFROLEPRIVILEGEAUDITDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfRolePrivilegeAuditDetail" element
     */
    public void setArrayOfArrayOfRolePrivilegeAuditDetail(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilegeAuditDetail arrayOfArrayOfRolePrivilegeAuditDetail)
    {
        generatedSetterHelperImpl(arrayOfArrayOfRolePrivilegeAuditDetail, ARRAYOFARRAYOFROLEPRIVILEGEAUDITDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfRolePrivilegeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilegeAuditDetail addNewArrayOfArrayOfRolePrivilegeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilegeAuditDetail)get_store().add_element_user(ARRAYOFARRAYOFROLEPRIVILEGEAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfRolePrivilegeAuditDetail" element
     */
    public void setNilArrayOfArrayOfRolePrivilegeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilegeAuditDetail)get_store().find_element_user(ARRAYOFARRAYOFROLEPRIVILEGEAUDITDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilegeAuditDetail)get_store().add_element_user(ARRAYOFARRAYOFROLEPRIVILEGEAUDITDETAIL$0);
            }
            target.setNil();
        }
    }
}
