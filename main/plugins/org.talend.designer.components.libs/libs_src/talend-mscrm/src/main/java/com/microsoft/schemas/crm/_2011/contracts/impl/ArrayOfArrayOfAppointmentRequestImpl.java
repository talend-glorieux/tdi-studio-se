/*
 * XML Type:  ArrayOfArrayOfAppointmentRequest
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfAppointmentRequest(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfAppointmentRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentRequest
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfAppointmentRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFAPPOINTMENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAppointmentRequest");
    
    
    /**
     * Gets array of all "ArrayOfAppointmentRequest" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest[] getArrayOfAppointmentRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFAPPOINTMENTREQUEST$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfAppointmentRequest" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest getArrayOfAppointmentRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest)get_store().find_element_user(ARRAYOFAPPOINTMENTREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfAppointmentRequest" element
     */
    public boolean isNilArrayOfAppointmentRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest)get_store().find_element_user(ARRAYOFAPPOINTMENTREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfAppointmentRequest" element
     */
    public int sizeOfArrayOfAppointmentRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFAPPOINTMENTREQUEST$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfAppointmentRequest" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfAppointmentRequestArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest[] arrayOfAppointmentRequestArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfAppointmentRequestArray, ARRAYOFAPPOINTMENTREQUEST$0);
    }
    
    /**
     * Sets ith "ArrayOfAppointmentRequest" element
     */
    public void setArrayOfAppointmentRequestArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest arrayOfAppointmentRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest)get_store().find_element_user(ARRAYOFAPPOINTMENTREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfAppointmentRequest);
        }
    }
    
    /**
     * Nils the ith "ArrayOfAppointmentRequest" element
     */
    public void setNilArrayOfAppointmentRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest)get_store().find_element_user(ARRAYOFAPPOINTMENTREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfAppointmentRequest" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest insertNewArrayOfAppointmentRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentRequest)get_store().insert_element_user(ARRAYOFAPPOINTMENTREQUEST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfAppointmentRequest" element
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
     * Removes the ith "ArrayOfAppointmentRequest" element
     */
    public void removeArrayOfAppointmentRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFAPPOINTMENTREQUEST$0, i);
        }
    }
}
