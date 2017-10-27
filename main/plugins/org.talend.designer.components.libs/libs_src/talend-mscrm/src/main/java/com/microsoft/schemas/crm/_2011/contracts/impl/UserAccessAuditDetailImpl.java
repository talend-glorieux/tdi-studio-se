/*
 * XML Type:  UserAccessAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML UserAccessAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class UserAccessAuditDetailImpl extends com.microsoft.schemas.crm._2011.contracts.impl.AuditDetailImpl implements com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail
{
    private static final long serialVersionUID = 1L;
    
    public UserAccessAuditDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCESSTIME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AccessTime");
    private static final javax.xml.namespace.QName INTERVAL$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Interval");
    
    
    /**
     * Gets the "AccessTime" element
     */
    public java.util.Calendar getAccessTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccessTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetAccessTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ACCESSTIME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AccessTime" element
     */
    public boolean isSetAccessTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCESSTIME$0) != 0;
        }
    }
    
    /**
     * Sets the "AccessTime" element
     */
    public void setAccessTime(java.util.Calendar accessTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSTIME$0);
            }
            target.setCalendarValue(accessTime);
        }
    }
    
    /**
     * Sets (as xml) the "AccessTime" element
     */
    public void xsetAccessTime(org.apache.xmlbeans.XmlDateTime accessTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ACCESSTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ACCESSTIME$0);
            }
            target.set(accessTime);
        }
    }
    
    /**
     * Unsets the "AccessTime" element
     */
    public void unsetAccessTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCESSTIME$0, 0);
        }
    }
    
    /**
     * Gets the "Interval" element
     */
    public int getInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVAL$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Interval" element
     */
    public org.apache.xmlbeans.XmlInt xgetInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INTERVAL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Interval" element
     */
    public boolean isSetInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERVAL$2) != 0;
        }
    }
    
    /**
     * Sets the "Interval" element
     */
    public void setInterval(int interval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERVAL$2);
            }
            target.setIntValue(interval);
        }
    }
    
    /**
     * Sets (as xml) the "Interval" element
     */
    public void xsetInterval(org.apache.xmlbeans.XmlInt interval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INTERVAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INTERVAL$2);
            }
            target.set(interval);
        }
    }
    
    /**
     * Unsets the "Interval" element
     */
    public void unsetInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERVAL$2, 0);
        }
    }
}
