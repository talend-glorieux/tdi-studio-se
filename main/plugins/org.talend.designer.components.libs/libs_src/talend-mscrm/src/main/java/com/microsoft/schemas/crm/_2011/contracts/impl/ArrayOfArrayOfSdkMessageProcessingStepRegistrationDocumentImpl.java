/*
 * An XML document type.
 * Localname: ArrayOfArrayOfSdkMessageProcessingStepRegistration
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepRegistrationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfSdkMessageProcessingStepRegistration(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfSdkMessageProcessingStepRegistrationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepRegistrationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfSdkMessageProcessingStepRegistrationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfSdkMessageProcessingStepRegistration");
    
    
    /**
     * Gets the "ArrayOfArrayOfSdkMessageProcessingStepRegistration" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepRegistration getArrayOfArrayOfSdkMessageProcessingStepRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepRegistration)get_store().find_element_user(ARRAYOFARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfSdkMessageProcessingStepRegistration" element
     */
    public boolean isNilArrayOfArrayOfSdkMessageProcessingStepRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepRegistration)get_store().find_element_user(ARRAYOFARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfSdkMessageProcessingStepRegistration" element
     */
    public void setArrayOfArrayOfSdkMessageProcessingStepRegistration(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepRegistration arrayOfArrayOfSdkMessageProcessingStepRegistration)
    {
        generatedSetterHelperImpl(arrayOfArrayOfSdkMessageProcessingStepRegistration, ARRAYOFARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfSdkMessageProcessingStepRegistration" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepRegistration addNewArrayOfArrayOfSdkMessageProcessingStepRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepRegistration)get_store().add_element_user(ARRAYOFARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfSdkMessageProcessingStepRegistration" element
     */
    public void setNilArrayOfArrayOfSdkMessageProcessingStepRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepRegistration)get_store().find_element_user(ARRAYOFARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepRegistration)get_store().add_element_user(ARRAYOFARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0);
            }
            target.setNil();
        }
    }
}
