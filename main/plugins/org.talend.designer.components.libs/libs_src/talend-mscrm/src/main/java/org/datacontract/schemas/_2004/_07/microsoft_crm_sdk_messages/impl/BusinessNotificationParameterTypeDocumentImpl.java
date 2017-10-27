/*
 * An XML document type.
 * Localname: BusinessNotificationParameterType
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages
 * Java type: org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.impl;
/**
 * A document containing one BusinessNotificationParameterType(@http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages) element.
 *
 * This is a complex type.
 */
public class BusinessNotificationParameterTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public BusinessNotificationParameterTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSNOTIFICATIONPARAMETERTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", "BusinessNotificationParameterType");
    
    
    /**
     * Gets the "BusinessNotificationParameterType" element
     */
    public org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType.Enum getBusinessNotificationParameterType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSNOTIFICATIONPARAMETERTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "BusinessNotificationParameterType" element
     */
    public org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType xgetBusinessNotificationParameterType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType)get_store().find_element_user(BUSINESSNOTIFICATIONPARAMETERTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "BusinessNotificationParameterType" element
     */
    public boolean isNilBusinessNotificationParameterType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType)get_store().find_element_user(BUSINESSNOTIFICATIONPARAMETERTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "BusinessNotificationParameterType" element
     */
    public void setBusinessNotificationParameterType(org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType.Enum businessNotificationParameterType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSNOTIFICATIONPARAMETERTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSNOTIFICATIONPARAMETERTYPE$0);
            }
            target.setEnumValue(businessNotificationParameterType);
        }
    }
    
    /**
     * Sets (as xml) the "BusinessNotificationParameterType" element
     */
    public void xsetBusinessNotificationParameterType(org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType businessNotificationParameterType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType)get_store().find_element_user(BUSINESSNOTIFICATIONPARAMETERTYPE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType)get_store().add_element_user(BUSINESSNOTIFICATIONPARAMETERTYPE$0);
            }
            target.set(businessNotificationParameterType);
        }
    }
    
    /**
     * Nils the "BusinessNotificationParameterType" element
     */
    public void setNilBusinessNotificationParameterType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType)get_store().find_element_user(BUSINESSNOTIFICATIONPARAMETERTYPE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType)get_store().add_element_user(BUSINESSNOTIFICATIONPARAMETERTYPE$0);
            }
            target.setNil();
        }
    }
}
