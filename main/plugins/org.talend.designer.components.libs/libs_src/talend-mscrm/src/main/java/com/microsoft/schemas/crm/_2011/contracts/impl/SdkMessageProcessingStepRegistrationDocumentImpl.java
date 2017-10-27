/*
 * An XML document type.
 * Localname: SdkMessageProcessingStepRegistration
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistrationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one SdkMessageProcessingStepRegistration(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class SdkMessageProcessingStepRegistrationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistrationDocument
{
    private static final long serialVersionUID = 1L;
    
    public SdkMessageProcessingStepRegistrationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SDKMESSAGEPROCESSINGSTEPREGISTRATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SdkMessageProcessingStepRegistration");
    
    
    /**
     * Gets the "SdkMessageProcessingStepRegistration" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration getSdkMessageProcessingStepRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SdkMessageProcessingStepRegistration" element
     */
    public boolean isNilSdkMessageProcessingStepRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SdkMessageProcessingStepRegistration" element
     */
    public void setSdkMessageProcessingStepRegistration(com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration sdkMessageProcessingStepRegistration)
    {
        generatedSetterHelperImpl(sdkMessageProcessingStepRegistration, SDKMESSAGEPROCESSINGSTEPREGISTRATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SdkMessageProcessingStepRegistration" element
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
     * Nils the "SdkMessageProcessingStepRegistration" element
     */
    public void setNilSdkMessageProcessingStepRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepRegistration)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0);
            }
            target.setNil();
        }
    }
}
