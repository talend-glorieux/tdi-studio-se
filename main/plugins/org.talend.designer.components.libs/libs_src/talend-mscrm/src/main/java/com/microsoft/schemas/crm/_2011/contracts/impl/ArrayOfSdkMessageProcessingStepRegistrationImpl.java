/*
 * XML Type:  ArrayOfSdkMessageProcessingStepRegistration
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfSdkMessageProcessingStepRegistration(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfSdkMessageProcessingStepRegistrationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSdkMessageProcessingStepRegistrationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SDKMESSAGEPROCESSINGSTEPREGISTRATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SdkMessageProcessingStepRegistration");
    
    
    /**
     * Gets array of all "SdkMessageProcessingStepRegistration" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration[] getSdkMessageProcessingStepRegistrationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration[] result = new com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SdkMessageProcessingStepRegistration" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration getSdkMessageProcessingStepRegistrationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "SdkMessageProcessingStepRegistration" element
     */
    public boolean isNilSdkMessageProcessingStepRegistrationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "SdkMessageProcessingStepRegistration" element
     */
    public int sizeOfSdkMessageProcessingStepRegistrationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0);
        }
    }
    
    /**
     * Sets array of all "SdkMessageProcessingStepRegistration" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSdkMessageProcessingStepRegistrationArray(com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration[] sdkMessageProcessingStepRegistrationArray)
    {
        check_orphaned();
        arraySetterHelper(sdkMessageProcessingStepRegistrationArray, SDKMESSAGEPROCESSINGSTEPREGISTRATION$0);
    }
    
    /**
     * Sets ith "SdkMessageProcessingStepRegistration" element
     */
    public void setSdkMessageProcessingStepRegistrationArray(int i, com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration sdkMessageProcessingStepRegistration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sdkMessageProcessingStepRegistration);
        }
    }
    
    /**
     * Nils the ith "SdkMessageProcessingStepRegistration" element
     */
    public void setNilSdkMessageProcessingStepRegistrationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SdkMessageProcessingStepRegistration" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration insertNewSdkMessageProcessingStepRegistration(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration)get_store().insert_element_user(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SdkMessageProcessingStepRegistration" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration addNewSdkMessageProcessingStepRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SdkMessageProcessingStepRegistration" element
     */
    public void removeSdkMessageProcessingStepRegistration(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0, i);
        }
    }
}
