/*
 * An XML document type.
 * Localname: TimeCode
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.TimeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one TimeCode(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class TimeCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.TimeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMECODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "TimeCode");
    
    
    /**
     * Gets the "TimeCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TimeCode.Enum getTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2011.contracts.TimeCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TimeCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TimeCode xgetTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TimeCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TimeCode)get_store().find_element_user(TIMECODE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TimeCode" element
     */
    public boolean isNilTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TimeCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TimeCode)get_store().find_element_user(TIMECODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "TimeCode" element
     */
    public void setTimeCode(com.microsoft.schemas.crm._2011.contracts.TimeCode.Enum timeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMECODE$0);
            }
            target.setEnumValue(timeCode);
        }
    }
    
    /**
     * Sets (as xml) the "TimeCode" element
     */
    public void xsetTimeCode(com.microsoft.schemas.crm._2011.contracts.TimeCode timeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TimeCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TimeCode)get_store().find_element_user(TIMECODE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.TimeCode)get_store().add_element_user(TIMECODE$0);
            }
            target.set(timeCode);
        }
    }
    
    /**
     * Nils the "TimeCode" element
     */
    public void setNilTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TimeCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TimeCode)get_store().find_element_user(TIMECODE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.TimeCode)get_store().add_element_user(TIMECODE$0);
            }
            target.setNil();
        }
    }
}
