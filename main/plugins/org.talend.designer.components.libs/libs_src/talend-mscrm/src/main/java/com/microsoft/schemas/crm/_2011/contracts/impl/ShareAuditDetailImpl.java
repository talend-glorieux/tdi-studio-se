/*
 * XML Type:  ShareAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ShareAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ShareAuditDetailImpl extends com.microsoft.schemas.crm._2011.contracts.impl.AuditDetailImpl implements com.microsoft.schemas.crm._2011.contracts.ShareAuditDetail
{
    private static final long serialVersionUID = 1L;
    
    public ShareAuditDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NEWPRIVILEGES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "NewPrivileges");
    private static final javax.xml.namespace.QName OLDPRIVILEGES$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "OldPrivileges");
    private static final javax.xml.namespace.QName PRINCIPAL$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Principal");
    
    
    /**
     * Gets the "NewPrivileges" element
     */
    public java.util.List getNewPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWPRIVILEGES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "NewPrivileges" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AccessRights xgetNewPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().find_element_user(NEWPRIVILEGES$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "NewPrivileges" element
     */
    public boolean isSetNewPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEWPRIVILEGES$0) != 0;
        }
    }
    
    /**
     * Sets the "NewPrivileges" element
     */
    public void setNewPrivileges(java.util.List newPrivileges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWPRIVILEGES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEWPRIVILEGES$0);
            }
            target.setListValue(newPrivileges);
        }
    }
    
    /**
     * Sets (as xml) the "NewPrivileges" element
     */
    public void xsetNewPrivileges(com.microsoft.schemas.crm._2011.contracts.AccessRights newPrivileges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().find_element_user(NEWPRIVILEGES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().add_element_user(NEWPRIVILEGES$0);
            }
            target.set(newPrivileges);
        }
    }
    
    /**
     * Unsets the "NewPrivileges" element
     */
    public void unsetNewPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEWPRIVILEGES$0, 0);
        }
    }
    
    /**
     * Gets the "OldPrivileges" element
     */
    public java.util.List getOldPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OLDPRIVILEGES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "OldPrivileges" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AccessRights xgetOldPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().find_element_user(OLDPRIVILEGES$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "OldPrivileges" element
     */
    public boolean isSetOldPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OLDPRIVILEGES$2) != 0;
        }
    }
    
    /**
     * Sets the "OldPrivileges" element
     */
    public void setOldPrivileges(java.util.List oldPrivileges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OLDPRIVILEGES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OLDPRIVILEGES$2);
            }
            target.setListValue(oldPrivileges);
        }
    }
    
    /**
     * Sets (as xml) the "OldPrivileges" element
     */
    public void xsetOldPrivileges(com.microsoft.schemas.crm._2011.contracts.AccessRights oldPrivileges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().find_element_user(OLDPRIVILEGES$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().add_element_user(OLDPRIVILEGES$2);
            }
            target.set(oldPrivileges);
        }
    }
    
    /**
     * Unsets the "OldPrivileges" element
     */
    public void unsetOldPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OLDPRIVILEGES$2, 0);
        }
    }
    
    /**
     * Gets the "Principal" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityReference getPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().find_element_user(PRINCIPAL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Principal" element
     */
    public boolean isNilPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().find_element_user(PRINCIPAL$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Principal" element
     */
    public boolean isSetPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRINCIPAL$4) != 0;
        }
    }
    
    /**
     * Sets the "Principal" element
     */
    public void setPrincipal(com.microsoft.schemas.xrm._2011.contracts.EntityReference principal)
    {
        generatedSetterHelperImpl(principal, PRINCIPAL$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Principal" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityReference addNewPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().add_element_user(PRINCIPAL$4);
            return target;
        }
    }
    
    /**
     * Nils the "Principal" element
     */
    public void setNilPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityReference target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().find_element_user(PRINCIPAL$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().add_element_user(PRINCIPAL$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Principal" element
     */
    public void unsetPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRINCIPAL$4, 0);
        }
    }
}
