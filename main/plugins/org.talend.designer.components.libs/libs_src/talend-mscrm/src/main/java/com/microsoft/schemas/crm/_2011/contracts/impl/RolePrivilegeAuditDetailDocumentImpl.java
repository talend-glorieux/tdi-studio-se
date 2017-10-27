/*
 * An XML document type.
 * Localname: RolePrivilegeAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one RolePrivilegeAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class RolePrivilegeAuditDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public RolePrivilegeAuditDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLEPRIVILEGEAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "RolePrivilegeAuditDetail");
    
    
    /**
     * Gets the "RolePrivilegeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail getRolePrivilegeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail)get_store().find_element_user(ROLEPRIVILEGEAUDITDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RolePrivilegeAuditDetail" element
     */
    public boolean isNilRolePrivilegeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail)get_store().find_element_user(ROLEPRIVILEGEAUDITDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RolePrivilegeAuditDetail" element
     */
    public void setRolePrivilegeAuditDetail(com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail rolePrivilegeAuditDetail)
    {
        generatedSetterHelperImpl(rolePrivilegeAuditDetail, ROLEPRIVILEGEAUDITDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RolePrivilegeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail addNewRolePrivilegeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail)get_store().add_element_user(ROLEPRIVILEGEAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "RolePrivilegeAuditDetail" element
     */
    public void setNilRolePrivilegeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail)get_store().find_element_user(ROLEPRIVILEGEAUDITDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail)get_store().add_element_user(ROLEPRIVILEGEAUDITDETAIL$0);
            }
            target.setNil();
        }
    }
}
