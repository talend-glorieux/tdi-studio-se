/*
 * XML Type:  BaseServiceFault
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.BaseServiceFault
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML BaseServiceFault(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class BaseServiceFaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.BaseServiceFault
{
    private static final long serialVersionUID = 1L;
    
    public BaseServiceFaultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORCODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ErrorCode");
    private static final javax.xml.namespace.QName ERRORDETAILS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ErrorDetails");
    private static final javax.xml.namespace.QName MESSAGE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Message");
    private static final javax.xml.namespace.QName TIMESTAMP$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Timestamp");
    
    
    /**
     * Gets the "ErrorCode" element
     */
    public int getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ERRORCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ErrorCode" element
     */
    public boolean isSetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "ErrorCode" element
     */
    public void setErrorCode(int errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORCODE$0);
            }
            target.setIntValue(errorCode);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorCode" element
     */
    public void xsetErrorCode(org.apache.xmlbeans.XmlInt errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ERRORCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ERRORCODE$0);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Unsets the "ErrorCode" element
     */
    public void unsetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORCODE$0, 0);
        }
    }
    
    /**
     * Gets the "ErrorDetails" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection getErrorDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection)get_store().find_element_user(ERRORDETAILS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ErrorDetails" element
     */
    public boolean isNilErrorDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection)get_store().find_element_user(ERRORDETAILS$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ErrorDetails" element
     */
    public boolean isSetErrorDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORDETAILS$2) != 0;
        }
    }
    
    /**
     * Sets the "ErrorDetails" element
     */
    public void setErrorDetails(com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection errorDetails)
    {
        generatedSetterHelperImpl(errorDetails, ERRORDETAILS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ErrorDetails" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection addNewErrorDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection)get_store().add_element_user(ERRORDETAILS$2);
            return target;
        }
    }
    
    /**
     * Nils the "ErrorDetails" element
     */
    public void setNilErrorDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection)get_store().find_element_user(ERRORDETAILS$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection)get_store().add_element_user(ERRORDETAILS$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ErrorDetails" element
     */
    public void unsetErrorDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORDETAILS$2, 0);
        }
    }
    
    /**
     * Gets the "Message" element
     */
    public java.lang.String getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$4, 0);
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
            return get_store().count_elements(MESSAGE$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$4);
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
            get_store().remove_element(MESSAGE$4, 0);
        }
    }
    
    /**
     * Gets the "Timestamp" element
     */
    public java.util.Calendar getTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Timestamp" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMESTAMP$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Timestamp" element
     */
    public boolean isSetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMESTAMP$6) != 0;
        }
    }
    
    /**
     * Sets the "Timestamp" element
     */
    public void setTimestamp(java.util.Calendar timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMESTAMP$6);
            }
            target.setCalendarValue(timestamp);
        }
    }
    
    /**
     * Sets (as xml) the "Timestamp" element
     */
    public void xsetTimestamp(org.apache.xmlbeans.XmlDateTime timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMESTAMP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TIMESTAMP$6);
            }
            target.set(timestamp);
        }
    }
    
    /**
     * Unsets the "Timestamp" element
     */
    public void unsetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMESTAMP$6, 0);
        }
    }
}
