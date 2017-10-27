/*
 * XML Type:  PrincipalAccess
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.PrincipalAccess
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML PrincipalAccess(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class PrincipalAccessImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.PrincipalAccess
{
    private static final long serialVersionUID = 1L;
    
    public PrincipalAccessImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCESSMASK$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AccessMask");
    private static final javax.xml.namespace.QName PRINCIPAL$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Principal");
    
    
    /**
     * Gets the "AccessMask" element
     */
    public java.util.List getAccessMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSMASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccessMask" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AccessRights xgetAccessMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().find_element_user(ACCESSMASK$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AccessMask" element
     */
    public boolean isSetAccessMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCESSMASK$0) != 0;
        }
    }
    
    /**
     * Sets the "AccessMask" element
     */
    public void setAccessMask(java.util.List accessMask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSMASK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSMASK$0);
            }
            target.setListValue(accessMask);
        }
    }
    
    /**
     * Sets (as xml) the "AccessMask" element
     */
    public void xsetAccessMask(com.microsoft.schemas.crm._2011.contracts.AccessRights accessMask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().find_element_user(ACCESSMASK$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().add_element_user(ACCESSMASK$0);
            }
            target.set(accessMask);
        }
    }
    
    /**
     * Unsets the "AccessMask" element
     */
    public void unsetAccessMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCESSMASK$0, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().find_element_user(PRINCIPAL$2, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().find_element_user(PRINCIPAL$2, 0);
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
            return get_store().count_elements(PRINCIPAL$2) != 0;
        }
    }
    
    /**
     * Sets the "Principal" element
     */
    public void setPrincipal(com.microsoft.schemas.xrm._2011.contracts.EntityReference principal)
    {
        generatedSetterHelperImpl(principal, PRINCIPAL$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().add_element_user(PRINCIPAL$2);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().find_element_user(PRINCIPAL$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityReference)get_store().add_element_user(PRINCIPAL$2);
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
            get_store().remove_element(PRINCIPAL$2, 0);
        }
    }
}
