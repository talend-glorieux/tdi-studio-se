/*
 * XML Type:  BusinessNotificationParameter
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages
 * Java type: org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.impl;
/**
 * An XML BusinessNotificationParameter(@http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages).
 *
 * This is a complex type.
 */
public class BusinessNotificationParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameter
{
    private static final long serialVersionUID = 1L;
    
    public BusinessNotificationParameterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATA$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", "Data");
    private static final javax.xml.namespace.QName PARAMETERTYPE$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", "ParameterType");
    
    
    /**
     * Gets the "Data" element
     */
    public java.lang.String getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Data" element
     */
    public org.apache.xmlbeans.XmlString xgetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Data" element
     */
    public boolean isNilData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Data" element
     */
    public boolean isSetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATA$0) != 0;
        }
    }
    
    /**
     * Sets the "Data" element
     */
    public void setData(java.lang.String data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATA$0);
            }
            target.setStringValue(data);
        }
    }
    
    /**
     * Sets (as xml) the "Data" element
     */
    public void xsetData(org.apache.xmlbeans.XmlString data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATA$0);
            }
            target.set(data);
        }
    }
    
    /**
     * Nils the "Data" element
     */
    public void setNilData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATA$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Data" element
     */
    public void unsetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATA$0, 0);
        }
    }
    
    /**
     * Gets the "ParameterType" element
     */
    public org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType.Enum getParameterType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParameterType" element
     */
    public org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType xgetParameterType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType)get_store().find_element_user(PARAMETERTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ParameterType" element
     */
    public boolean isSetParameterType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERTYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "ParameterType" element
     */
    public void setParameterType(org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType.Enum parameterType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMETERTYPE$2);
            }
            target.setEnumValue(parameterType);
        }
    }
    
    /**
     * Sets (as xml) the "ParameterType" element
     */
    public void xsetParameterType(org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType parameterType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType)get_store().find_element_user(PARAMETERTYPE$2, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationParameterType)get_store().add_element_user(PARAMETERTYPE$2);
            }
            target.set(parameterType);
        }
    }
    
    /**
     * Unsets the "ParameterType" element
     */
    public void unsetParameterType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERTYPE$2, 0);
        }
    }
}
