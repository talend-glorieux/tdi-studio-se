/*
 * An XML document type.
 * Localname: ArrayOfSdkMessageProcessingStepImageRegistration
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistrationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfSdkMessageProcessingStepImageRegistration(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfSdkMessageProcessingStepImageRegistrationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistrationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSdkMessageProcessingStepImageRegistrationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfSdkMessageProcessingStepImageRegistration");
    
    
    /**
     * Gets the "ArrayOfSdkMessageProcessingStepImageRegistration" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration getArrayOfSdkMessageProcessingStepImageRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().find_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfSdkMessageProcessingStepImageRegistration" element
     */
    public boolean isNilArrayOfSdkMessageProcessingStepImageRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().find_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfSdkMessageProcessingStepImageRegistration" element
     */
    public void setArrayOfSdkMessageProcessingStepImageRegistration(com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration arrayOfSdkMessageProcessingStepImageRegistration)
    {
        generatedSetterHelperImpl(arrayOfSdkMessageProcessingStepImageRegistration, ARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfSdkMessageProcessingStepImageRegistration" element
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
     * Nils the "ArrayOfSdkMessageProcessingStepImageRegistration" element
     */
    public void setNilArrayOfSdkMessageProcessingStepImageRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().find_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().add_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0);
            }
            target.setNil();
        }
    }
}
