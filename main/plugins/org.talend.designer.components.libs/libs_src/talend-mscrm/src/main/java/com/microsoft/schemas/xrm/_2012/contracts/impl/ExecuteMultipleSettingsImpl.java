/*
 * XML Type:  ExecuteMultipleSettings
 * Namespace: http://schemas.microsoft.com/xrm/2012/Contracts
 * Java type: com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2012.contracts.impl;
/**
 * An XML ExecuteMultipleSettings(@http://schemas.microsoft.com/xrm/2012/Contracts).
 *
 * This is a complex type.
 */
public class ExecuteMultipleSettingsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleSettings
{
    private static final long serialVersionUID = 1L;
    
    public ExecuteMultipleSettingsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTINUEONERROR$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2012/Contracts", "ContinueOnError");
    private static final javax.xml.namespace.QName RETURNRESPONSES$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2012/Contracts", "ReturnResponses");
    
    
    /**
     * Gets the "ContinueOnError" element
     */
    public boolean getContinueOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTINUEONERROR$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContinueOnError" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetContinueOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CONTINUEONERROR$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContinueOnError" element
     */
    public boolean isSetContinueOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTINUEONERROR$0) != 0;
        }
    }
    
    /**
     * Sets the "ContinueOnError" element
     */
    public void setContinueOnError(boolean continueOnError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTINUEONERROR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTINUEONERROR$0);
            }
            target.setBooleanValue(continueOnError);
        }
    }
    
    /**
     * Sets (as xml) the "ContinueOnError" element
     */
    public void xsetContinueOnError(org.apache.xmlbeans.XmlBoolean continueOnError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CONTINUEONERROR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CONTINUEONERROR$0);
            }
            target.set(continueOnError);
        }
    }
    
    /**
     * Unsets the "ContinueOnError" element
     */
    public void unsetContinueOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTINUEONERROR$0, 0);
        }
    }
    
    /**
     * Gets the "ReturnResponses" element
     */
    public boolean getReturnResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURNRESPONSES$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReturnResponses" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetReturnResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RETURNRESPONSES$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReturnResponses" element
     */
    public boolean isSetReturnResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RETURNRESPONSES$2) != 0;
        }
    }
    
    /**
     * Sets the "ReturnResponses" element
     */
    public void setReturnResponses(boolean returnResponses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURNRESPONSES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURNRESPONSES$2);
            }
            target.setBooleanValue(returnResponses);
        }
    }
    
    /**
     * Sets (as xml) the "ReturnResponses" element
     */
    public void xsetReturnResponses(org.apache.xmlbeans.XmlBoolean returnResponses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RETURNRESPONSES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RETURNRESPONSES$2);
            }
            target.set(returnResponses);
        }
    }
    
    /**
     * Unsets the "ReturnResponses" element
     */
    public void unsetReturnResponses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RETURNRESPONSES$2, 0);
        }
    }
}
