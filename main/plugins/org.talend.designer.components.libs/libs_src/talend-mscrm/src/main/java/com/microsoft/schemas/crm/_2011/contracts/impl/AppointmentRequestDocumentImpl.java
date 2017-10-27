/*
 * An XML document type.
 * Localname: AppointmentRequest
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AppointmentRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one AppointmentRequest(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class AppointmentRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.AppointmentRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public AppointmentRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPOINTMENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AppointmentRequest");
    
    
    /**
     * Gets the "AppointmentRequest" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AppointmentRequest getAppointmentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest)get_store().find_element_user(APPOINTMENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AppointmentRequest" element
     */
    public boolean isNilAppointmentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest)get_store().find_element_user(APPOINTMENTREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AppointmentRequest" element
     */
    public void setAppointmentRequest(com.microsoft.schemas.crm._2011.contracts.AppointmentRequest appointmentRequest)
    {
        generatedSetterHelperImpl(appointmentRequest, APPOINTMENTREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AppointmentRequest" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AppointmentRequest addNewAppointmentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest)get_store().add_element_user(APPOINTMENTREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "AppointmentRequest" element
     */
    public void setNilAppointmentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest)get_store().find_element_user(APPOINTMENTREQUEST$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest)get_store().add_element_user(APPOINTMENTREQUEST$0);
            }
            target.setNil();
        }
    }
}
