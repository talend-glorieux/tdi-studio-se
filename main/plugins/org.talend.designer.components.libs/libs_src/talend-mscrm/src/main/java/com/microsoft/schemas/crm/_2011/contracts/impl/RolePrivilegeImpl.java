/*
 * XML Type:  RolePrivilege
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.RolePrivilege
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML RolePrivilege(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class RolePrivilegeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.RolePrivilege
{
    private static final long serialVersionUID = 1L;
    
    public RolePrivilegeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSUNITID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "BusinessUnitId");
    private static final javax.xml.namespace.QName DEPTH$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Depth");
    private static final javax.xml.namespace.QName PRIVILEGEID$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "PrivilegeId");
    
    
    /**
     * Gets the "BusinessUnitId" element
     */
    public java.lang.String getBusinessUnitId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSUNITID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BusinessUnitId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetBusinessUnitId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(BUSINESSUNITID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "BusinessUnitId" element
     */
    public boolean isSetBusinessUnitId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSUNITID$0) != 0;
        }
    }
    
    /**
     * Sets the "BusinessUnitId" element
     */
    public void setBusinessUnitId(java.lang.String businessUnitId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSUNITID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSUNITID$0);
            }
            target.setStringValue(businessUnitId);
        }
    }
    
    /**
     * Sets (as xml) the "BusinessUnitId" element
     */
    public void xsetBusinessUnitId(com.microsoft.schemas._2003._10.serialization.Guid businessUnitId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(BUSINESSUNITID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(BUSINESSUNITID$0);
            }
            target.set(businessUnitId);
        }
    }
    
    /**
     * Unsets the "BusinessUnitId" element
     */
    public void unsetBusinessUnitId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSUNITID$0, 0);
        }
    }
    
    /**
     * Gets the "Depth" element
     */
    public com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth.Enum getDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPTH$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Depth" element
     */
    public com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth xgetDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth)get_store().find_element_user(DEPTH$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Depth" element
     */
    public boolean isSetDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPTH$2) != 0;
        }
    }
    
    /**
     * Sets the "Depth" element
     */
    public void setDepth(com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth.Enum depth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPTH$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPTH$2);
            }
            target.setEnumValue(depth);
        }
    }
    
    /**
     * Sets (as xml) the "Depth" element
     */
    public void xsetDepth(com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth depth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth)get_store().find_element_user(DEPTH$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth)get_store().add_element_user(DEPTH$2);
            }
            target.set(depth);
        }
    }
    
    /**
     * Unsets the "Depth" element
     */
    public void unsetDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPTH$2, 0);
        }
    }
    
    /**
     * Gets the "PrivilegeId" element
     */
    public java.lang.String getPrivilegeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVILEGEID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrivilegeId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetPrivilegeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(PRIVILEGEID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "PrivilegeId" element
     */
    public boolean isSetPrivilegeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIVILEGEID$4) != 0;
        }
    }
    
    /**
     * Sets the "PrivilegeId" element
     */
    public void setPrivilegeId(java.lang.String privilegeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVILEGEID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIVILEGEID$4);
            }
            target.setStringValue(privilegeId);
        }
    }
    
    /**
     * Sets (as xml) the "PrivilegeId" element
     */
    public void xsetPrivilegeId(com.microsoft.schemas._2003._10.serialization.Guid privilegeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(PRIVILEGEID$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(PRIVILEGEID$4);
            }
            target.set(privilegeId);
        }
    }
    
    /**
     * Unsets the "PrivilegeId" element
     */
    public void unsetPrivilegeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIVILEGEID$4, 0);
        }
    }
}
