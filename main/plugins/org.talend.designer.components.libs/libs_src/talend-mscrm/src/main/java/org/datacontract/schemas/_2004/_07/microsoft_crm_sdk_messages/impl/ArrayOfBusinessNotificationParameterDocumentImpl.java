/*
 * An XML document type.
 * Localname: ArrayOfBusinessNotificationParameter
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages
 * Java type: org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.impl;
/**
 * A document containing one ArrayOfBusinessNotificationParameter(@http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages) element.
 *
 * This is a complex type.
 */
public class ArrayOfBusinessNotificationParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfBusinessNotificationParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFBUSINESSNOTIFICATIONPARAMETER$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", "ArrayOfBusinessNotificationParameter");
    
    
    /**
     * Gets the "ArrayOfBusinessNotificationParameter" element
     */
    public org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter getArrayOfBusinessNotificationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter)get_store().find_element_user(ARRAYOFBUSINESSNOTIFICATIONPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfBusinessNotificationParameter" element
     */
    public boolean isNilArrayOfBusinessNotificationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter)get_store().find_element_user(ARRAYOFBUSINESSNOTIFICATIONPARAMETER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfBusinessNotificationParameter" element
     */
    public void setArrayOfBusinessNotificationParameter(org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter arrayOfBusinessNotificationParameter)
    {
        generatedSetterHelperImpl(arrayOfBusinessNotificationParameter, ARRAYOFBUSINESSNOTIFICATIONPARAMETER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfBusinessNotificationParameter" element
     */
    public org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter addNewArrayOfBusinessNotificationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter)get_store().add_element_user(ARRAYOFBUSINESSNOTIFICATIONPARAMETER$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfBusinessNotificationParameter" element
     */
    public void setNilArrayOfBusinessNotificationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter)get_store().find_element_user(ARRAYOFBUSINESSNOTIFICATIONPARAMETER$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter)get_store().add_element_user(ARRAYOFBUSINESSNOTIFICATIONPARAMETER$0);
            }
            target.setNil();
        }
    }
}
