/*
 * XML Type:  ArrayOfAppointmentRequest
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfAppointmentRequest(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfAppointmentRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAppointmentRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPOINTMENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AppointmentRequest");
    
    
    /**
     * Gets array of all "AppointmentRequest" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.AppointmentRequest[] getAppointmentRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(APPOINTMENTREQUEST$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.AppointmentRequest[] result = new com.microsoft.schemas.crm._2011.contracts.AppointmentRequest[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AppointmentRequest" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AppointmentRequest getAppointmentRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest)get_store().find_element_user(APPOINTMENTREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AppointmentRequest" element
     */
    public boolean isNilAppointmentRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest)get_store().find_element_user(APPOINTMENTREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AppointmentRequest" element
     */
    public int sizeOfAppointmentRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPOINTMENTREQUEST$0);
        }
    }
    
    /**
     * Sets array of all "AppointmentRequest" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAppointmentRequestArray(com.microsoft.schemas.crm._2011.contracts.AppointmentRequest[] appointmentRequestArray)
    {
        check_orphaned();
        arraySetterHelper(appointmentRequestArray, APPOINTMENTREQUEST$0);
    }
    
    /**
     * Sets ith "AppointmentRequest" element
     */
    public void setAppointmentRequestArray(int i, com.microsoft.schemas.crm._2011.contracts.AppointmentRequest appointmentRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest)get_store().find_element_user(APPOINTMENTREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(appointmentRequest);
        }
    }
    
    /**
     * Nils the ith "AppointmentRequest" element
     */
    public void setNilAppointmentRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest)get_store().find_element_user(APPOINTMENTREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AppointmentRequest" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AppointmentRequest insertNewAppointmentRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentRequest)get_store().insert_element_user(APPOINTMENTREQUEST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AppointmentRequest" element
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
     * Removes the ith "AppointmentRequest" element
     */
    public void removeAppointmentRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPOINTMENTREQUEST$0, i);
        }
    }
}
