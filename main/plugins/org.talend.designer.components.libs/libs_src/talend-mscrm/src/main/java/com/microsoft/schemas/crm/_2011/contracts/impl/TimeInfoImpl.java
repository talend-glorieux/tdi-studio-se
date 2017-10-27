/*
 * XML Type:  TimeInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.TimeInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML TimeInfo(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class TimeInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.TimeInfo
{
    private static final long serialVersionUID = 1L;
    
    public TimeInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYSTATUSCODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ActivityStatusCode");
    private static final javax.xml.namespace.QName CALENDARID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "CalendarId");
    private static final javax.xml.namespace.QName DISPLAYTEXT$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "DisplayText");
    private static final javax.xml.namespace.QName EFFORT$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Effort");
    private static final javax.xml.namespace.QName END$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "End");
    private static final javax.xml.namespace.QName ISACTIVITY$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "IsActivity");
    private static final javax.xml.namespace.QName SOURCEID$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SourceId");
    private static final javax.xml.namespace.QName SOURCETYPECODE$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SourceTypeCode");
    private static final javax.xml.namespace.QName START$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Start");
    private static final javax.xml.namespace.QName SUBCODE$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SubCode");
    private static final javax.xml.namespace.QName TIMECODE$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "TimeCode");
    
    
    /**
     * Gets the "ActivityStatusCode" element
     */
    public int getActivityStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYSTATUSCODE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ActivityStatusCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetActivityStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACTIVITYSTATUSCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ActivityStatusCode" element
     */
    public boolean isSetActivityStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYSTATUSCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "ActivityStatusCode" element
     */
    public void setActivityStatusCode(int activityStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYSTATUSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYSTATUSCODE$0);
            }
            target.setIntValue(activityStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "ActivityStatusCode" element
     */
    public void xsetActivityStatusCode(org.apache.xmlbeans.XmlInt activityStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACTIVITYSTATUSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ACTIVITYSTATUSCODE$0);
            }
            target.set(activityStatusCode);
        }
    }
    
    /**
     * Unsets the "ActivityStatusCode" element
     */
    public void unsetActivityStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYSTATUSCODE$0, 0);
        }
    }
    
    /**
     * Gets the "CalendarId" element
     */
    public java.lang.String getCalendarId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALENDARID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CalendarId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetCalendarId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(CALENDARID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CalendarId" element
     */
    public boolean isSetCalendarId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALENDARID$2) != 0;
        }
    }
    
    /**
     * Sets the "CalendarId" element
     */
    public void setCalendarId(java.lang.String calendarId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALENDARID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALENDARID$2);
            }
            target.setStringValue(calendarId);
        }
    }
    
    /**
     * Sets (as xml) the "CalendarId" element
     */
    public void xsetCalendarId(com.microsoft.schemas._2003._10.serialization.Guid calendarId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(CALENDARID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(CALENDARID$2);
            }
            target.set(calendarId);
        }
    }
    
    /**
     * Unsets the "CalendarId" element
     */
    public void unsetCalendarId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALENDARID$2, 0);
        }
    }
    
    /**
     * Gets the "DisplayText" element
     */
    public java.lang.String getDisplayText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYTEXT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DisplayText" element
     */
    public org.apache.xmlbeans.XmlString xgetDisplayText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYTEXT$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DisplayText" element
     */
    public boolean isNilDisplayText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYTEXT$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DisplayText" element
     */
    public boolean isSetDisplayText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYTEXT$4) != 0;
        }
    }
    
    /**
     * Sets the "DisplayText" element
     */
    public void setDisplayText(java.lang.String displayText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYTEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYTEXT$4);
            }
            target.setStringValue(displayText);
        }
    }
    
    /**
     * Sets (as xml) the "DisplayText" element
     */
    public void xsetDisplayText(org.apache.xmlbeans.XmlString displayText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYTEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYTEXT$4);
            }
            target.set(displayText);
        }
    }
    
    /**
     * Nils the "DisplayText" element
     */
    public void setNilDisplayText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYTEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYTEXT$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DisplayText" element
     */
    public void unsetDisplayText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYTEXT$4, 0);
        }
    }
    
    /**
     * Gets the "Effort" element
     */
    public double getEffort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFORT$6, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "Effort" element
     */
    public org.apache.xmlbeans.XmlDouble xgetEffort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EFFORT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Effort" element
     */
    public boolean isSetEffort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFORT$6) != 0;
        }
    }
    
    /**
     * Sets the "Effort" element
     */
    public void setEffort(double effort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFORT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFORT$6);
            }
            target.setDoubleValue(effort);
        }
    }
    
    /**
     * Sets (as xml) the "Effort" element
     */
    public void xsetEffort(org.apache.xmlbeans.XmlDouble effort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EFFORT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(EFFORT$6);
            }
            target.set(effort);
        }
    }
    
    /**
     * Unsets the "Effort" element
     */
    public void unsetEffort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFORT$6, 0);
        }
    }
    
    /**
     * Gets the "End" element
     */
    public java.util.Calendar getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(END$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "End" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(END$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "End" element
     */
    public boolean isNilEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(END$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "End" element
     */
    public boolean isSetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(END$8) != 0;
        }
    }
    
    /**
     * Sets the "End" element
     */
    public void setEnd(java.util.Calendar end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(END$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(END$8);
            }
            target.setCalendarValue(end);
        }
    }
    
    /**
     * Sets (as xml) the "End" element
     */
    public void xsetEnd(org.apache.xmlbeans.XmlDateTime end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(END$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(END$8);
            }
            target.set(end);
        }
    }
    
    /**
     * Nils the "End" element
     */
    public void setNilEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(END$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(END$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "End" element
     */
    public void unsetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(END$8, 0);
        }
    }
    
    /**
     * Gets the "IsActivity" element
     */
    public boolean getIsActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVITY$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsActivity" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVITY$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsActivity" element
     */
    public boolean isSetIsActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISACTIVITY$10) != 0;
        }
    }
    
    /**
     * Sets the "IsActivity" element
     */
    public void setIsActivity(boolean isActivity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVITY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISACTIVITY$10);
            }
            target.setBooleanValue(isActivity);
        }
    }
    
    /**
     * Sets (as xml) the "IsActivity" element
     */
    public void xsetIsActivity(org.apache.xmlbeans.XmlBoolean isActivity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVITY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISACTIVITY$10);
            }
            target.set(isActivity);
        }
    }
    
    /**
     * Unsets the "IsActivity" element
     */
    public void unsetIsActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISACTIVITY$10, 0);
        }
    }
    
    /**
     * Gets the "SourceId" element
     */
    public java.lang.String getSourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetSourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(SOURCEID$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "SourceId" element
     */
    public boolean isSetSourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEID$12) != 0;
        }
    }
    
    /**
     * Sets the "SourceId" element
     */
    public void setSourceId(java.lang.String sourceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEID$12);
            }
            target.setStringValue(sourceId);
        }
    }
    
    /**
     * Sets (as xml) the "SourceId" element
     */
    public void xsetSourceId(com.microsoft.schemas._2003._10.serialization.Guid sourceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(SOURCEID$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(SOURCEID$12);
            }
            target.set(sourceId);
        }
    }
    
    /**
     * Unsets the "SourceId" element
     */
    public void unsetSourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEID$12, 0);
        }
    }
    
    /**
     * Gets the "SourceTypeCode" element
     */
    public int getSourceTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETYPECODE$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceTypeCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetSourceTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPECODE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "SourceTypeCode" element
     */
    public boolean isSetSourceTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCETYPECODE$14) != 0;
        }
    }
    
    /**
     * Sets the "SourceTypeCode" element
     */
    public void setSourceTypeCode(int sourceTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETYPECODE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCETYPECODE$14);
            }
            target.setIntValue(sourceTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "SourceTypeCode" element
     */
    public void xsetSourceTypeCode(org.apache.xmlbeans.XmlInt sourceTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPECODE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SOURCETYPECODE$14);
            }
            target.set(sourceTypeCode);
        }
    }
    
    /**
     * Unsets the "SourceTypeCode" element
     */
    public void unsetSourceTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCETYPECODE$14, 0);
        }
    }
    
    /**
     * Gets the "Start" element
     */
    public java.util.Calendar getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Start" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(START$16, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Start" element
     */
    public boolean isNilStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(START$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Start" element
     */
    public boolean isSetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(START$16) != 0;
        }
    }
    
    /**
     * Sets the "Start" element
     */
    public void setStart(java.util.Calendar start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(START$16);
            }
            target.setCalendarValue(start);
        }
    }
    
    /**
     * Sets (as xml) the "Start" element
     */
    public void xsetStart(org.apache.xmlbeans.XmlDateTime start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(START$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(START$16);
            }
            target.set(start);
        }
    }
    
    /**
     * Nils the "Start" element
     */
    public void setNilStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(START$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(START$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Start" element
     */
    public void unsetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(START$16, 0);
        }
    }
    
    /**
     * Gets the "SubCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SubCode.Enum getSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBCODE$18, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2011.contracts.SubCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SubCode xgetSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SubCode)get_store().find_element_user(SUBCODE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "SubCode" element
     */
    public boolean isSetSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBCODE$18) != 0;
        }
    }
    
    /**
     * Sets the "SubCode" element
     */
    public void setSubCode(com.microsoft.schemas.crm._2011.contracts.SubCode.Enum subCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBCODE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBCODE$18);
            }
            target.setEnumValue(subCode);
        }
    }
    
    /**
     * Sets (as xml) the "SubCode" element
     */
    public void xsetSubCode(com.microsoft.schemas.crm._2011.contracts.SubCode subCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SubCode)get_store().find_element_user(SUBCODE$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.SubCode)get_store().add_element_user(SUBCODE$18);
            }
            target.set(subCode);
        }
    }
    
    /**
     * Unsets the "SubCode" element
     */
    public void unsetSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBCODE$18, 0);
        }
    }
    
    /**
     * Gets the "TimeCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TimeCode.Enum getTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMECODE$20, 0);
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
            target = (com.microsoft.schemas.crm._2011.contracts.TimeCode)get_store().find_element_user(TIMECODE$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "TimeCode" element
     */
    public boolean isSetTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMECODE$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMECODE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMECODE$20);
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
            target = (com.microsoft.schemas.crm._2011.contracts.TimeCode)get_store().find_element_user(TIMECODE$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.TimeCode)get_store().add_element_user(TIMECODE$20);
            }
            target.set(timeCode);
        }
    }
    
    /**
     * Unsets the "TimeCode" element
     */
    public void unsetTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMECODE$20, 0);
        }
    }
}
