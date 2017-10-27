/*
 * XML Type:  ValidationResult
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ValidationResult
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ValidationResult(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ValidationResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ValidationResult
{
    private static final long serialVersionUID = 1L;
    
    public ValidationResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ActivityId");
    private static final javax.xml.namespace.QName TRACEINFO$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "TraceInfo");
    private static final javax.xml.namespace.QName VALIDATIONSUCCESS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ValidationSuccess");
    
    
    /**
     * Gets the "ActivityId" element
     */
    public java.lang.String getActivityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ActivityId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetActivityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ACTIVITYID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ActivityId" element
     */
    public boolean isSetActivityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYID$0) != 0;
        }
    }
    
    /**
     * Sets the "ActivityId" element
     */
    public void setActivityId(java.lang.String activityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYID$0);
            }
            target.setStringValue(activityId);
        }
    }
    
    /**
     * Sets (as xml) the "ActivityId" element
     */
    public void xsetActivityId(com.microsoft.schemas._2003._10.serialization.Guid activityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ACTIVITYID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(ACTIVITYID$0);
            }
            target.set(activityId);
        }
    }
    
    /**
     * Unsets the "ActivityId" element
     */
    public void unsetActivityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYID$0, 0);
        }
    }
    
    /**
     * Gets the "TraceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TraceInfo getTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().find_element_user(TRACEINFO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "TraceInfo" element
     */
    public boolean isNilTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().find_element_user(TRACEINFO$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "TraceInfo" element
     */
    public boolean isSetTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACEINFO$2) != 0;
        }
    }
    
    /**
     * Sets the "TraceInfo" element
     */
    public void setTraceInfo(com.microsoft.schemas.crm._2011.contracts.TraceInfo traceInfo)
    {
        generatedSetterHelperImpl(traceInfo, TRACEINFO$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TraceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TraceInfo addNewTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().add_element_user(TRACEINFO$2);
            return target;
        }
    }
    
    /**
     * Nils the "TraceInfo" element
     */
    public void setNilTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().find_element_user(TRACEINFO$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().add_element_user(TRACEINFO$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TraceInfo" element
     */
    public void unsetTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACEINFO$2, 0);
        }
    }
    
    /**
     * Gets the "ValidationSuccess" element
     */
    public boolean getValidationSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATIONSUCCESS$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValidationSuccess" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetValidationSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VALIDATIONSUCCESS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ValidationSuccess" element
     */
    public boolean isSetValidationSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATIONSUCCESS$4) != 0;
        }
    }
    
    /**
     * Sets the "ValidationSuccess" element
     */
    public void setValidationSuccess(boolean validationSuccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATIONSUCCESS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDATIONSUCCESS$4);
            }
            target.setBooleanValue(validationSuccess);
        }
    }
    
    /**
     * Sets (as xml) the "ValidationSuccess" element
     */
    public void xsetValidationSuccess(org.apache.xmlbeans.XmlBoolean validationSuccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VALIDATIONSUCCESS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(VALIDATIONSUCCESS$4);
            }
            target.set(validationSuccess);
        }
    }
    
    /**
     * Unsets the "ValidationSuccess" element
     */
    public void unsetValidationSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATIONSUCCESS$4, 0);
        }
    }
}
