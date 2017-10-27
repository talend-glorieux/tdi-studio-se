/*
 * An XML document type.
 * Localname: ArrayOfAppointmentRequest
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfAppointmentRequest(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfAppointmentRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAppointmentRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFAPPOINTMENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAppointmentRequest");
    
    
    /**
     * Gets the "ArrayOfAppointmentRequest" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest getArrayOfAppointmentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest)get_store().find_element_user(ARRAYOFAPPOINTMENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfAppointmentRequest" element
     */
    public boolean isNilArrayOfAppointmentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest)get_store().find_element_user(ARRAYOFAPPOINTMENTREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfAppointmentRequest" element
     */
    public void setArrayOfAppointmentRequest(com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest arrayOfAppointmentRequest)
    {
        generatedSetterHelperImpl(arrayOfAppointmentRequest, ARRAYOFAPPOINTMENTREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfAppointmentRequest" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest addNewArrayOfAppointmentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest)get_store().add_element_user(ARRAYOFAPPOINTMENTREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfAppointmentRequest" element
     */
    public void setNilArrayOfAppointmentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest)get_store().find_element_user(ARRAYOFAPPOINTMENTREQUEST$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest)get_store().add_element_user(ARRAYOFAPPOINTMENTREQUEST$0);
            }
            target.setNil();
        }
    }
}
