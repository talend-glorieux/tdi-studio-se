/*
 * XML Type:  AppointmentsToIgnore
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AppointmentsToIgnore
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML AppointmentsToIgnore(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class AppointmentsToIgnoreImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.AppointmentsToIgnore
{
    private static final long serialVersionUID = 1L;
    
    public AppointmentsToIgnoreImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPOINTMENTS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Appointments");
    private static final javax.xml.namespace.QName RESOURCEID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ResourceId");
    
    
    /**
     * Gets the "Appointments" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid getAppointments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().find_element_user(APPOINTMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Appointments" element
     */
    public boolean isNilAppointments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().find_element_user(APPOINTMENTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Appointments" element
     */
    public boolean isSetAppointments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPOINTMENTS$0) != 0;
        }
    }
    
    /**
     * Sets the "Appointments" element
     */
    public void setAppointments(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid appointments)
    {
        generatedSetterHelperImpl(appointments, APPOINTMENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Appointments" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid addNewAppointments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().add_element_user(APPOINTMENTS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Appointments" element
     */
    public void setNilAppointments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().find_element_user(APPOINTMENTS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().add_element_user(APPOINTMENTS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Appointments" element
     */
    public void unsetAppointments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPOINTMENTS$0, 0);
        }
    }
    
    /**
     * Gets the "ResourceId" element
     */
    public java.lang.String getResourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResourceId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetResourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(RESOURCEID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ResourceId" element
     */
    public boolean isSetResourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEID$2) != 0;
        }
    }
    
    /**
     * Sets the "ResourceId" element
     */
    public void setResourceId(java.lang.String resourceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCEID$2);
            }
            target.setStringValue(resourceId);
        }
    }
    
    /**
     * Sets (as xml) the "ResourceId" element
     */
    public void xsetResourceId(com.microsoft.schemas._2003._10.serialization.Guid resourceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(RESOURCEID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(RESOURCEID$2);
            }
            target.set(resourceId);
        }
    }
    
    /**
     * Unsets the "ResourceId" element
     */
    public void unsetResourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEID$2, 0);
        }
    }
}
