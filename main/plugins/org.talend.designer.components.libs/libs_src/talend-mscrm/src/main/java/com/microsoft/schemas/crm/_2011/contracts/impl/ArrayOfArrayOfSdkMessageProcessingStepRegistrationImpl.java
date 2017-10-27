/*
 * XML Type:  ArrayOfArrayOfSdkMessageProcessingStepRegistration
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepRegistration
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfSdkMessageProcessingStepRegistration(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfSdkMessageProcessingStepRegistrationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepRegistration
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfSdkMessageProcessingStepRegistrationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfSdkMessageProcessingStepRegistration");
    
    
    /**
     * Gets array of all "ArrayOfSdkMessageProcessingStepRegistration" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration[] getArrayOfSdkMessageProcessingStepRegistrationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfSdkMessageProcessingStepRegistration" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration getArrayOfSdkMessageProcessingStepRegistrationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration)get_store().find_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfSdkMessageProcessingStepRegistration" element
     */
    public boolean isNilArrayOfSdkMessageProcessingStepRegistrationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration)get_store().find_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfSdkMessageProcessingStepRegistration" element
     */
    public int sizeOfArrayOfSdkMessageProcessingStepRegistrationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfSdkMessageProcessingStepRegistration" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfSdkMessageProcessingStepRegistrationArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration[] arrayOfSdkMessageProcessingStepRegistrationArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfSdkMessageProcessingStepRegistrationArray, ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0);
    }
    
    /**
     * Sets ith "ArrayOfSdkMessageProcessingStepRegistration" element
     */
    public void setArrayOfSdkMessageProcessingStepRegistrationArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration arrayOfSdkMessageProcessingStepRegistration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration)get_store().find_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfSdkMessageProcessingStepRegistration);
        }
    }
    
    /**
     * Nils the ith "ArrayOfSdkMessageProcessingStepRegistration" element
     */
    public void setNilArrayOfSdkMessageProcessingStepRegistrationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration)get_store().find_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfSdkMessageProcessingStepRegistration" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration insertNewArrayOfSdkMessageProcessingStepRegistration(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration)get_store().insert_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfSdkMessageProcessingStepRegistration" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration addNewArrayOfSdkMessageProcessingStepRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration)get_store().add_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfSdkMessageProcessingStepRegistration" element
     */
    public void removeArrayOfSdkMessageProcessingStepRegistration(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, i);
        }
    }
}
