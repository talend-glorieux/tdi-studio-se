/*
 * XML Type:  ArrayOfBusinessNotificationParameter
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages
 * Java type: org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.impl;
/**
 * An XML ArrayOfBusinessNotificationParameter(@http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages).
 *
 * This is a complex type.
 */
public class ArrayOfBusinessNotificationParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfBusinessNotificationParameterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSNOTIFICATIONPARAMETER$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", "BusinessNotificationParameter");
    
    
    /**
     * Gets array of all "BusinessNotificationParameter" elements
     */
    public org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter[] getBusinessNotificationParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BUSINESSNOTIFICATIONPARAMETER$0, targetList);
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter[] result = new org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "BusinessNotificationParameter" element
     */
    public org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter getBusinessNotificationParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter)get_store().find_element_user(BUSINESSNOTIFICATIONPARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "BusinessNotificationParameter" element
     */
    public boolean isNilBusinessNotificationParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter)get_store().find_element_user(BUSINESSNOTIFICATIONPARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "BusinessNotificationParameter" element
     */
    public int sizeOfBusinessNotificationParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSNOTIFICATIONPARAMETER$0);
        }
    }
    
    /**
     * Sets array of all "BusinessNotificationParameter" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBusinessNotificationParameterArray(org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter[] businessNotificationParameterArray)
    {
        check_orphaned();
        arraySetterHelper(businessNotificationParameterArray, BUSINESSNOTIFICATIONPARAMETER$0);
    }
    
    /**
     * Sets ith "BusinessNotificationParameter" element
     */
    public void setBusinessNotificationParameterArray(int i, org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter businessNotificationParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter)get_store().find_element_user(BUSINESSNOTIFICATIONPARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(businessNotificationParameter);
        }
    }
    
    /**
     * Nils the ith "BusinessNotificationParameter" element
     */
    public void setNilBusinessNotificationParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter)get_store().find_element_user(BUSINESSNOTIFICATIONPARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BusinessNotificationParameter" element
     */
    public org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter insertNewBusinessNotificationParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter)get_store().insert_element_user(BUSINESSNOTIFICATIONPARAMETER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BusinessNotificationParameter" element
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
     * Removes the ith "BusinessNotificationParameter" element
     */
    public void removeBusinessNotificationParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSNOTIFICATIONPARAMETER$0, i);
        }
    }
}
