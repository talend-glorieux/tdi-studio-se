/*
 * An XML document type.
 * Localname: ArrayOfArrayOfSdkMessageProcessingStepImageRegistration
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepImageRegistrationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfSdkMessageProcessingStepImageRegistration(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfSdkMessageProcessingStepImageRegistrationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepImageRegistrationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfSdkMessageProcessingStepImageRegistrationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfSdkMessageProcessingStepImageRegistration");
    
    
    /**
     * Gets the "ArrayOfArrayOfSdkMessageProcessingStepImageRegistration" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepImageRegistration getArrayOfArrayOfSdkMessageProcessingStepImageRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepImageRegistration)get_store().find_element_user(ARRAYOFARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfSdkMessageProcessingStepImageRegistration" element
     */
    public boolean isNilArrayOfArrayOfSdkMessageProcessingStepImageRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepImageRegistration)get_store().find_element_user(ARRAYOFARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfSdkMessageProcessingStepImageRegistration" element
     */
    public void setArrayOfArrayOfSdkMessageProcessingStepImageRegistration(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepImageRegistration arrayOfArrayOfSdkMessageProcessingStepImageRegistration)
    {
        generatedSetterHelperImpl(arrayOfArrayOfSdkMessageProcessingStepImageRegistration, ARRAYOFARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfSdkMessageProcessingStepImageRegistration" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepImageRegistration addNewArrayOfArrayOfSdkMessageProcessingStepImageRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepImageRegistration)get_store().add_element_user(ARRAYOFARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfSdkMessageProcessingStepImageRegistration" element
     */
    public void setNilArrayOfArrayOfSdkMessageProcessingStepImageRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepImageRegistration)get_store().find_element_user(ARRAYOFARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSdkMessageProcessingStepImageRegistration)get_store().add_element_user(ARRAYOFARRAYOFSDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0);
            }
            target.setNil();
        }
    }
}
