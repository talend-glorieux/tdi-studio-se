/*
 * XML Type:  BusinessNotification
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.BusinessNotification
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML BusinessNotification(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class BusinessNotificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.BusinessNotification
{
    private static final long serialVersionUID = 1L;
    
    public BusinessNotificationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Message");
    private static final javax.xml.namespace.QName PARAMETERS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Parameters");
    private static final javax.xml.namespace.QName SEVERITY$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Severity");
    
    
    /**
     * Gets the "Message" element
     */
    public java.lang.String getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Message" element
     */
    public org.apache.xmlbeans.XmlString xgetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Message" element
     */
    public boolean isNilMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Message" element
     */
    public boolean isSetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGE$0) != 0;
        }
    }
    
    /**
     * Sets the "Message" element
     */
    public void setMessage(java.lang.String message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$0);
            }
            target.setStringValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "Message" element
     */
    public void xsetMessage(org.apache.xmlbeans.XmlString message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$0);
            }
            target.set(message);
        }
    }
    
    /**
     * Nils the "Message" element
     */
    public void setNilMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Message" element
     */
    public void unsetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGE$0, 0);
        }
    }
    
    /**
     * Gets the "Parameters" element
     */
    public org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter getParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter)get_store().find_element_user(PARAMETERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Parameters" element
     */
    public boolean isNilParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter)get_store().find_element_user(PARAMETERS$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Parameters" element
     */
    public boolean isSetParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERS$2) != 0;
        }
    }
    
    /**
     * Sets the "Parameters" element
     */
    public void setParameters(org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter parameters)
    {
        generatedSetterHelperImpl(parameters, PARAMETERS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Parameters" element
     */
    public org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter)get_store().add_element_user(PARAMETERS$2);
            return target;
        }
    }
    
    /**
     * Nils the "Parameters" element
     */
    public void setNilParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter)get_store().find_element_user(PARAMETERS$2, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.ArrayOfBusinessNotificationParameter)get_store().add_element_user(PARAMETERS$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Parameters" element
     */
    public void unsetParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERS$2, 0);
        }
    }
    
    /**
     * Gets the "Severity" element
     */
    public org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity.Enum getSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Severity" element
     */
    public org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity xgetSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity)get_store().find_element_user(SEVERITY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Severity" element
     */
    public boolean isSetSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEVERITY$4) != 0;
        }
    }
    
    /**
     * Sets the "Severity" element
     */
    public void setSeverity(org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity.Enum severity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEVERITY$4);
            }
            target.setEnumValue(severity);
        }
    }
    
    /**
     * Sets (as xml) the "Severity" element
     */
    public void xsetSeverity(org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity severity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity)get_store().find_element_user(SEVERITY$4, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.microsoft_crm_sdk_messages.BusinessNotificationSeverity)get_store().add_element_user(SEVERITY$4);
            }
            target.set(severity);
        }
    }
    
    /**
     * Unsets the "Severity" element
     */
    public void unsetSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEVERITY$4, 0);
        }
    }
}
