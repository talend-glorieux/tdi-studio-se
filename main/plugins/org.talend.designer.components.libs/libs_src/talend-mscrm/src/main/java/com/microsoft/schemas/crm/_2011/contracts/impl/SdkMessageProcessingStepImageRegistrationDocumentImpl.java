/*
 * An XML document type.
 * Localname: SdkMessageProcessingStepImageRegistration
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistrationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one SdkMessageProcessingStepImageRegistration(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class SdkMessageProcessingStepImageRegistrationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistrationDocument
{
    private static final long serialVersionUID = 1L;
    
    public SdkMessageProcessingStepImageRegistrationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SdkMessageProcessingStepImageRegistration");
    
    
    /**
     * Gets the "SdkMessageProcessingStepImageRegistration" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration getSdkMessageProcessingStepImageRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SdkMessageProcessingStepImageRegistration" element
     */
    public boolean isNilSdkMessageProcessingStepImageRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SdkMessageProcessingStepImageRegistration" element
     */
    public void setSdkMessageProcessingStepImageRegistration(com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration sdkMessageProcessingStepImageRegistration)
    {
        generatedSetterHelperImpl(sdkMessageProcessingStepImageRegistration, SDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SdkMessageProcessingStepImageRegistration" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration addNewSdkMessageProcessingStepImageRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "SdkMessageProcessingStepImageRegistration" element
     */
    public void setNilSdkMessageProcessingStepImageRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.SdkMessageProcessingStepImageRegistration)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0);
            }
            target.setNil();
        }
    }
}
