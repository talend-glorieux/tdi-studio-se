/*
 * XML Type:  ArrayOfArrayOfSdkMessageProcessingStepImageRegistration
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepImageRegistration
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfSdkMessageProcessingStepImageRegistration(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfSdkMessageProcessingStepImageRegistrationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepImageRegistration
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfSdkMessageProcessingStepImageRegistrationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfSdkMessageProcessingStepImageRegistration");
    
    
    /**
     * Gets array of all "ArrayOfSdkMessageProcessingStepImageRegistration" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration[] getArrayOfSdkMessageProcessingStepImageRegistrationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfSdkMessageProcessingStepImageRegistration" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration getArrayOfSdkMessageProcessingStepImageRegistrationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().find_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfSdkMessageProcessingStepImageRegistration" element
     */
    public boolean isNilArrayOfSdkMessageProcessingStepImageRegistrationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().find_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfSdkMessageProcessingStepImageRegistration" element
     */
    public int sizeOfArrayOfSdkMessageProcessingStepImageRegistrationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfSdkMessageProcessingStepImageRegistration" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfSdkMessageProcessingStepImageRegistrationArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration[] arrayOfSdkMessageProcessingStepImageRegistrationArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfSdkMessageProcessingStepImageRegistrationArray, ARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0);
    }
    
    /**
     * Sets ith "ArrayOfSdkMessageProcessingStepImageRegistration" element
     */
    public void setArrayOfSdkMessageProcessingStepImageRegistrationArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration arrayOfSdkMessageProcessingStepImageRegistration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().find_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfSdkMessageProcessingStepImageRegistration);
        }
    }
    
    /**
     * Nils the ith "ArrayOfSdkMessageProcessingStepImageRegistration" element
     */
    public void setNilArrayOfSdkMessageProcessingStepImageRegistrationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().find_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfSdkMessageProcessingStepImageRegistration" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration insertNewArrayOfSdkMessageProcessingStepImageRegistration(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().insert_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfSdkMessageProcessingStepImageRegistration" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration addNewArrayOfSdkMessageProcessingStepImageRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().add_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfSdkMessageProcessingStepImageRegistration" element
     */
    public void removeArrayOfSdkMessageProcessingStepImageRegistration(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, i);
        }
    }
}
