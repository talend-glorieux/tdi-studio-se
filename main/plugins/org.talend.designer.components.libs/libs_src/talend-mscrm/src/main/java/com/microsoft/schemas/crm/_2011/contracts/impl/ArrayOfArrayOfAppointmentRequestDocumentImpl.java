/*
 * An XML document type.
 * Localname: ArrayOfArrayOfAppointmentRequest
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfAppointmentRequest(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfAppointmentRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfAppointmentRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFAPPOINTMENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfAppointmentRequest");
    
    
    /**
     * Gets the "ArrayOfArrayOfAppointmentRequest" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentRequest getArrayOfArrayOfAppointmentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentRequest)get_store().find_element_user(ARRAYOFARRAYOFAPPOINTMENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfAppointmentRequest" element
     */
    public boolean isNilArrayOfArrayOfAppointmentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentRequest)get_store().find_element_user(ARRAYOFARRAYOFAPPOINTMENTREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfAppointmentRequest" element
     */
    public void setArrayOfArrayOfAppointmentRequest(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentRequest arrayOfArrayOfAppointmentRequest)
    {
        generatedSetterHelperImpl(arrayOfArrayOfAppointmentRequest, ARRAYOFARRAYOFAPPOINTMENTREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfAppointmentRequest" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentRequest addNewArrayOfArrayOfAppointmentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentRequest)get_store().add_element_user(ARRAYOFARRAYOFAPPOINTMENTREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfAppointmentRequest" element
     */
    public void setNilArrayOfArrayOfAppointmentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentRequest)get_store().find_element_user(ARRAYOFARRAYOFAPPOINTMENTREQUEST$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentRequest)get_store().add_element_user(ARRAYOFARRAYOFAPPOINTMENTREQUEST$0);
            }
            target.setNil();
        }
    }
}
