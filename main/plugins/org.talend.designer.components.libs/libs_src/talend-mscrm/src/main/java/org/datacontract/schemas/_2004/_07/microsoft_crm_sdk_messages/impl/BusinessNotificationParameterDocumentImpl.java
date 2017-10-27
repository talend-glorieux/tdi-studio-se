/*
 * An XML document type.
 * Localname: BusinessNotificationParameter
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages
 * Java type: org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.impl;
/**
 * A document containing one BusinessNotificationParameter(@http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages) element.
 *
 * This is a complex type.
 */
public class BusinessNotificationParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public BusinessNotificationParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSNOTIFICATIONPARAMETER$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", "BusinessNotificationParameter");
    
    
    /**
     * Gets the "BusinessNotificationParameter" element
     */
    public org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter getBusinessNotificationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter)get_store().find_element_user(BUSINESSNOTIFICATIONPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "BusinessNotificationParameter" element
     */
    public boolean isNilBusinessNotificationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter)get_store().find_element_user(BUSINESSNOTIFICATIONPARAMETER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "BusinessNotificationParameter" element
     */
    public void setBusinessNotificationParameter(org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter businessNotificationParameter)
    {
        generatedSetterHelperImpl(businessNotificationParameter, BUSINESSNOTIFICATIONPARAMETER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BusinessNotificationParameter" element
     */
    public org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter addNewBusinessNotificationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter)get_store().add_element_user(BUSINESSNOTIFICATIONPARAMETER$0);
            return target;
        }
    }
    
    /**
     * Nils the "BusinessNotificationParameter" element
     */
    public void setNilBusinessNotificationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter)get_store().find_element_user(BUSINESSNOTIFICATIONPARAMETER$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter)get_store().add_element_user(BUSINESSNOTIFICATIONPARAMETER$0);
            }
            target.setNil();
        }
    }
}
