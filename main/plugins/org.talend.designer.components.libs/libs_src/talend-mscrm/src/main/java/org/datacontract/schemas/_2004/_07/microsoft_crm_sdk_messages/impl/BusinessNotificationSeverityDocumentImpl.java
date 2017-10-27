/*
 * An XML document type.
 * Localname: BusinessNotificationSeverity
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages
 * Java type: org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverityDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.impl;
/**
 * A document containing one BusinessNotificationSeverity(@http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages) element.
 *
 * This is a complex type.
 */
public class BusinessNotificationSeverityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverityDocument
{
    private static final long serialVersionUID = 1L;
    
    public BusinessNotificationSeverityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSNOTIFICATIONSEVERITY$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", "BusinessNotificationSeverity");
    
    
    /**
     * Gets the "BusinessNotificationSeverity" element
     */
    public org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity.Enum getBusinessNotificationSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSNOTIFICATIONSEVERITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "BusinessNotificationSeverity" element
     */
    public org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity xgetBusinessNotificationSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity)get_store().find_element_user(BUSINESSNOTIFICATIONSEVERITY$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "BusinessNotificationSeverity" element
     */
    public boolean isNilBusinessNotificationSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity)get_store().find_element_user(BUSINESSNOTIFICATIONSEVERITY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "BusinessNotificationSeverity" element
     */
    public void setBusinessNotificationSeverity(org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity.Enum businessNotificationSeverity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSNOTIFICATIONSEVERITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSNOTIFICATIONSEVERITY$0);
            }
            target.setEnumValue(businessNotificationSeverity);
        }
    }
    
    /**
     * Sets (as xml) the "BusinessNotificationSeverity" element
     */
    public void xsetBusinessNotificationSeverity(org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity businessNotificationSeverity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity)get_store().find_element_user(BUSINESSNOTIFICATIONSEVERITY$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity)get_store().add_element_user(BUSINESSNOTIFICATIONSEVERITY$0);
            }
            target.set(businessNotificationSeverity);
        }
    }
    
    /**
     * Nils the "BusinessNotificationSeverity" element
     */
    public void setNilBusinessNotificationSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity)get_store().find_element_user(BUSINESSNOTIFICATIONSEVERITY$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity)get_store().add_element_user(BUSINESSNOTIFICATIONSEVERITY$0);
            }
            target.setNil();
        }
    }
}
