/*
 * An XML document type.
 * Localname: RolePrivilege
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.RolePrivilegeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one RolePrivilege(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class RolePrivilegeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.RolePrivilegeDocument
{
    private static final long serialVersionUID = 1L;
    
    public RolePrivilegeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLEPRIVILEGE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "RolePrivilege");
    
    
    /**
     * Gets the "RolePrivilege" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RolePrivilege getRolePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilege)get_store().find_element_user(ROLEPRIVILEGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RolePrivilege" element
     */
    public boolean isNilRolePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilege)get_store().find_element_user(ROLEPRIVILEGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RolePrivilege" element
     */
    public void setRolePrivilege(com.microsoft.schemas.crm._2011.contracts.RolePrivilege rolePrivilege)
    {
        generatedSetterHelperImpl(rolePrivilege, ROLEPRIVILEGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RolePrivilege" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RolePrivilege addNewRolePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilege)get_store().add_element_user(ROLEPRIVILEGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "RolePrivilege" element
     */
    public void setNilRolePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilege)get_store().find_element_user(ROLEPRIVILEGE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.RolePrivilege)get_store().add_element_user(ROLEPRIVILEGE$0);
            }
            target.setNil();
        }
    }
}
