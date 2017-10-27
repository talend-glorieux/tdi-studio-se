/*
 * An XML document type.
 * Localname: ArrayOfSdkMessageProcessingStepRegistration
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistrationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfSdkMessageProcessingStepRegistration(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfSdkMessageProcessingStepRegistrationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistrationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSdkMessageProcessingStepRegistrationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfSdkMessageProcessingStepRegistration");
    
    
    /**
     * Gets the "ArrayOfSdkMessageProcessingStepRegistration" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration getArrayOfSdkMessageProcessingStepRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration)get_store().find_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfSdkMessageProcessingStepRegistration" element
     */
    public boolean isNilArrayOfSdkMessageProcessingStepRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration)get_store().find_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfSdkMessageProcessingStepRegistration" element
     */
    public void setArrayOfSdkMessageProcessingStepRegistration(com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration arrayOfSdkMessageProcessingStepRegistration)
    {
        generatedSetterHelperImpl(arrayOfSdkMessageProcessingStepRegistration, ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfSdkMessageProcessingStepRegistration" element
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
     * Nils the "ArrayOfSdkMessageProcessingStepRegistration" element
     */
    public void setNilArrayOfSdkMessageProcessingStepRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration)get_store().find_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepRegistration)get_store().add_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0);
            }
            target.setNil();
        }
    }
}
