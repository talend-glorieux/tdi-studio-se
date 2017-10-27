/*
 * An XML document type.
 * Localname: AppointmentsToIgnore
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AppointmentsToIgnoreDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one AppointmentsToIgnore(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class AppointmentsToIgnoreDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.AppointmentsToIgnoreDocument
{
    private static final long serialVersionUID = 1L;
    
    public AppointmentsToIgnoreDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPOINTMENTSTOIGNORE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AppointmentsToIgnore");
    
    
    /**
     * Gets the "AppointmentsToIgnore" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AppointmentsToIgnore getAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentsToIgnore)get_store().find_element_user(APPOINTMENTSTOIGNORE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AppointmentsToIgnore" element
     */
    public boolean isNilAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentsToIgnore)get_store().find_element_user(APPOINTMENTSTOIGNORE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AppointmentsToIgnore" element
     */
    public void setAppointmentsToIgnore(com.microsoft.schemas.crm._2011.contracts.AppointmentsToIgnore appointmentsToIgnore)
    {
        generatedSetterHelperImpl(appointmentsToIgnore, APPOINTMENTSTOIGNORE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AppointmentsToIgnore" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AppointmentsToIgnore addNewAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentsToIgnore)get_store().add_element_user(APPOINTMENTSTOIGNORE$0);
            return target;
        }
    }
    
    /**
     * Nils the "AppointmentsToIgnore" element
     */
    public void setNilAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentsToIgnore)get_store().find_element_user(APPOINTMENTSTOIGNORE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.AppointmentsToIgnore)get_store().add_element_user(APPOINTMENTSTOIGNORE$0);
            }
            target.setNil();
        }
    }
}
