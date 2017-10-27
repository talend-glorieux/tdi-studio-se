/*
 * An XML document type.
 * Localname: ArrayOfRolePrivilegeAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfRolePrivilegeAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfRolePrivilegeAuditDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRolePrivilegeAuditDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFROLEPRIVILEGEAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfRolePrivilegeAuditDetail");
    
    
    /**
     * Gets the "ArrayOfRolePrivilegeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail getArrayOfRolePrivilegeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail)get_store().find_element_user(ARRAYOFROLEPRIVILEGEAUDITDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfRolePrivilegeAuditDetail" element
     */
    public boolean isNilArrayOfRolePrivilegeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail)get_store().find_element_user(ARRAYOFROLEPRIVILEGEAUDITDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfRolePrivilegeAuditDetail" element
     */
    public void setArrayOfRolePrivilegeAuditDetail(com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail arrayOfRolePrivilegeAuditDetail)
    {
        generatedSetterHelperImpl(arrayOfRolePrivilegeAuditDetail, ARRAYOFROLEPRIVILEGEAUDITDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfRolePrivilegeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail addNewArrayOfRolePrivilegeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail)get_store().add_element_user(ARRAYOFROLEPRIVILEGEAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfRolePrivilegeAuditDetail" element
     */
    public void setNilArrayOfRolePrivilegeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail)get_store().find_element_user(ARRAYOFROLEPRIVILEGEAUDITDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeAuditDetail)get_store().add_element_user(ARRAYOFROLEPRIVILEGEAUDITDETAIL$0);
            }
            target.setNil();
        }
    }
}
