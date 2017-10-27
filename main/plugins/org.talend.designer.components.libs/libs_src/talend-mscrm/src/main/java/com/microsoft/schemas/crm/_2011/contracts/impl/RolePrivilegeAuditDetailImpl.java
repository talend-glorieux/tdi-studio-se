/*
 * XML Type:  RolePrivilegeAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML RolePrivilegeAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class RolePrivilegeAuditDetailImpl extends com.microsoft.schemas.crm._2011.contracts.impl.AuditDetailImpl implements com.microsoft.schemas.crm._2011.contracts.RolePrivilegeAuditDetail
{
    private static final long serialVersionUID = 1L;
    
    public RolePrivilegeAuditDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVALIDNEWPRIVILEGES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "InvalidNewPrivileges");
    private static final javax.xml.namespace.QName NEWROLEPRIVILEGES$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "NewRolePrivileges");
    private static final javax.xml.namespace.QName OLDROLEPRIVILEGES$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "OldRolePrivileges");
    
    
    /**
     * Gets the "InvalidNewPrivileges" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid getInvalidNewPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().find_element_user(INVALIDNEWPRIVILEGES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "InvalidNewPrivileges" element
     */
    public boolean isNilInvalidNewPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().find_element_user(INVALIDNEWPRIVILEGES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "InvalidNewPrivileges" element
     */
    public boolean isSetInvalidNewPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVALIDNEWPRIVILEGES$0) != 0;
        }
    }
    
    /**
     * Sets the "InvalidNewPrivileges" element
     */
    public void setInvalidNewPrivileges(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid invalidNewPrivileges)
    {
        generatedSetterHelperImpl(invalidNewPrivileges, INVALIDNEWPRIVILEGES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InvalidNewPrivileges" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid addNewInvalidNewPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().add_element_user(INVALIDNEWPRIVILEGES$0);
            return target;
        }
    }
    
    /**
     * Nils the "InvalidNewPrivileges" element
     */
    public void setNilInvalidNewPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().find_element_user(INVALIDNEWPRIVILEGES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().add_element_user(INVALIDNEWPRIVILEGES$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "InvalidNewPrivileges" element
     */
    public void unsetInvalidNewPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVALIDNEWPRIVILEGES$0, 0);
        }
    }
    
    /**
     * Gets the "NewRolePrivileges" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege getNewRolePrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().find_element_user(NEWROLEPRIVILEGES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "NewRolePrivileges" element
     */
    public boolean isNilNewRolePrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().find_element_user(NEWROLEPRIVILEGES$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "NewRolePrivileges" element
     */
    public boolean isSetNewRolePrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEWROLEPRIVILEGES$2) != 0;
        }
    }
    
    /**
     * Sets the "NewRolePrivileges" element
     */
    public void setNewRolePrivileges(com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege newRolePrivileges)
    {
        generatedSetterHelperImpl(newRolePrivileges, NEWROLEPRIVILEGES$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "NewRolePrivileges" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege addNewNewRolePrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().add_element_user(NEWROLEPRIVILEGES$2);
            return target;
        }
    }
    
    /**
     * Nils the "NewRolePrivileges" element
     */
    public void setNilNewRolePrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().find_element_user(NEWROLEPRIVILEGES$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().add_element_user(NEWROLEPRIVILEGES$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "NewRolePrivileges" element
     */
    public void unsetNewRolePrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEWROLEPRIVILEGES$2, 0);
        }
    }
    
    /**
     * Gets the "OldRolePrivileges" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege getOldRolePrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().find_element_user(OLDROLEPRIVILEGES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OldRolePrivileges" element
     */
    public boolean isNilOldRolePrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().find_element_user(OLDROLEPRIVILEGES$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OldRolePrivileges" element
     */
    public boolean isSetOldRolePrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OLDROLEPRIVILEGES$4) != 0;
        }
    }
    
    /**
     * Sets the "OldRolePrivileges" element
     */
    public void setOldRolePrivileges(com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege oldRolePrivileges)
    {
        generatedSetterHelperImpl(oldRolePrivileges, OLDROLEPRIVILEGES$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OldRolePrivileges" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege addNewOldRolePrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().add_element_user(OLDROLEPRIVILEGES$4);
            return target;
        }
    }
    
    /**
     * Nils the "OldRolePrivileges" element
     */
    public void setNilOldRolePrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().find_element_user(OLDROLEPRIVILEGES$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().add_element_user(OLDROLEPRIVILEGES$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OldRolePrivileges" element
     */
    public void unsetOldRolePrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OLDROLEPRIVILEGES$4, 0);
        }
    }
}
