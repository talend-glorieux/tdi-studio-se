/*
 * XML Type:  AppointmentRequest
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AppointmentRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML AppointmentRequest(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class AppointmentRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.AppointmentRequest
{
    private static final long serialVersionUID = 1L;
    
    public AppointmentRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANCHOROFFSET$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AnchorOffset");
    private static final javax.xml.namespace.QName APPOINTMENTSTOIGNORE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AppointmentsToIgnore");
    private static final javax.xml.namespace.QName CONSTRAINTS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Constraints");
    private static final javax.xml.namespace.QName DIRECTION$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Direction");
    private static final javax.xml.namespace.QName DURATION$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Duration");
    private static final javax.xml.namespace.QName NUMBEROFRESULTS$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "NumberOfResults");
    private static final javax.xml.namespace.QName OBJECTIVES$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Objectives");
    private static final javax.xml.namespace.QName RECURRENCEDURATION$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "RecurrenceDuration");
    private static final javax.xml.namespace.QName RECURRENCETIMEZONECODE$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "RecurrenceTimeZoneCode");
    private static final javax.xml.namespace.QName REQUIREDRESOURCES$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "RequiredResources");
    private static final javax.xml.namespace.QName SEARCHRECURRENCERULE$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SearchRecurrenceRule");
    private static final javax.xml.namespace.QName SEARCHRECURRENCESTART$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SearchRecurrenceStart");
    private static final javax.xml.namespace.QName SEARCHWINDOWEND$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SearchWindowEnd");
    private static final javax.xml.namespace.QName SEARCHWINDOWSTART$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SearchWindowStart");
    private static final javax.xml.namespace.QName SERVICEID$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ServiceId");
    private static final javax.xml.namespace.QName SITES$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Sites");
    private static final javax.xml.namespace.QName USERTIMEZONECODE$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "UserTimeZoneCode");
    
    
    /**
     * Gets the "AnchorOffset" element
     */
    public int getAnchorOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANCHOROFFSET$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "AnchorOffset" element
     */
    public org.apache.xmlbeans.XmlInt xgetAnchorOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ANCHOROFFSET$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AnchorOffset" element
     */
    public boolean isSetAnchorOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANCHOROFFSET$0) != 0;
        }
    }
    
    /**
     * Sets the "AnchorOffset" element
     */
    public void setAnchorOffset(int anchorOffset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANCHOROFFSET$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANCHOROFFSET$0);
            }
            target.setIntValue(anchorOffset);
        }
    }
    
    /**
     * Sets (as xml) the "AnchorOffset" element
     */
    public void xsetAnchorOffset(org.apache.xmlbeans.XmlInt anchorOffset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ANCHOROFFSET$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ANCHOROFFSET$0);
            }
            target.set(anchorOffset);
        }
    }
    
    /**
     * Unsets the "AnchorOffset" element
     */
    public void unsetAnchorOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANCHOROFFSET$0, 0);
        }
    }
    
    /**
     * Gets the "AppointmentsToIgnore" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore getAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore)get_store().find_element_user(APPOINTMENTSTOIGNORE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AppointmentsToIgnore" element
     */
    public boolean isNilAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore)get_store().find_element_user(APPOINTMENTSTOIGNORE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AppointmentsToIgnore" element
     */
    public boolean isSetAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPOINTMENTSTOIGNORE$2) != 0;
        }
    }
    
    /**
     * Sets the "AppointmentsToIgnore" element
     */
    public void setAppointmentsToIgnore(com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore appointmentsToIgnore)
    {
        generatedSetterHelperImpl(appointmentsToIgnore, APPOINTMENTSTOIGNORE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AppointmentsToIgnore" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore addNewAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore)get_store().add_element_user(APPOINTMENTSTOIGNORE$2);
            return target;
        }
    }
    
    /**
     * Nils the "AppointmentsToIgnore" element
     */
    public void setNilAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore)get_store().find_element_user(APPOINTMENTSTOIGNORE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore)get_store().add_element_user(APPOINTMENTSTOIGNORE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AppointmentsToIgnore" element
     */
    public void unsetAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPOINTMENTSTOIGNORE$2, 0);
        }
    }
    
    /**
     * Gets the "Constraints" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation getConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation)get_store().find_element_user(CONSTRAINTS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Constraints" element
     */
    public boolean isNilConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation)get_store().find_element_user(CONSTRAINTS$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Constraints" element
     */
    public boolean isSetConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSTRAINTS$4) != 0;
        }
    }
    
    /**
     * Sets the "Constraints" element
     */
    public void setConstraints(com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation constraints)
    {
        generatedSetterHelperImpl(constraints, CONSTRAINTS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Constraints" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation addNewConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation)get_store().add_element_user(CONSTRAINTS$4);
            return target;
        }
    }
    
    /**
     * Nils the "Constraints" element
     */
    public void setNilConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation)get_store().find_element_user(CONSTRAINTS$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation)get_store().add_element_user(CONSTRAINTS$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Constraints" element
     */
    public void unsetConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSTRAINTS$4, 0);
        }
    }
    
    /**
     * Gets the "Direction" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SearchDirection.Enum getDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2011.contracts.SearchDirection.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Direction" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SearchDirection xgetDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchDirection)get_store().find_element_user(DIRECTION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Direction" element
     */
    public boolean isSetDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTION$6) != 0;
        }
    }
    
    /**
     * Sets the "Direction" element
     */
    public void setDirection(com.microsoft.schemas.crm._2011.contracts.SearchDirection.Enum direction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTION$6);
            }
            target.setEnumValue(direction);
        }
    }
    
    /**
     * Sets (as xml) the "Direction" element
     */
    public void xsetDirection(com.microsoft.schemas.crm._2011.contracts.SearchDirection direction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchDirection)get_store().find_element_user(DIRECTION$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.SearchDirection)get_store().add_element_user(DIRECTION$6);
            }
            target.set(direction);
        }
    }
    
    /**
     * Unsets the "Direction" element
     */
    public void unsetDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTION$6, 0);
        }
    }
    
    /**
     * Gets the "Duration" element
     */
    public int getDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Duration" element
     */
    public org.apache.xmlbeans.XmlInt xgetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DURATION$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Duration" element
     */
    public boolean isSetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DURATION$8) != 0;
        }
    }
    
    /**
     * Sets the "Duration" element
     */
    public void setDuration(int duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATION$8);
            }
            target.setIntValue(duration);
        }
    }
    
    /**
     * Sets (as xml) the "Duration" element
     */
    public void xsetDuration(org.apache.xmlbeans.XmlInt duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DURATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DURATION$8);
            }
            target.set(duration);
        }
    }
    
    /**
     * Unsets the "Duration" element
     */
    public void unsetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DURATION$8, 0);
        }
    }
    
    /**
     * Gets the "NumberOfResults" element
     */
    public int getNumberOfResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFRESULTS$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfResults" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberOfResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFRESULTS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberOfResults" element
     */
    public boolean isSetNumberOfResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFRESULTS$10) != 0;
        }
    }
    
    /**
     * Sets the "NumberOfResults" element
     */
    public void setNumberOfResults(int numberOfResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFRESULTS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFRESULTS$10);
            }
            target.setIntValue(numberOfResults);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfResults" element
     */
    public void xsetNumberOfResults(org.apache.xmlbeans.XmlInt numberOfResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFRESULTS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFRESULTS$10);
            }
            target.set(numberOfResults);
        }
    }
    
    /**
     * Unsets the "NumberOfResults" element
     */
    public void unsetNumberOfResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFRESULTS$10, 0);
        }
    }
    
    /**
     * Gets the "Objectives" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation getObjectives()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation)get_store().find_element_user(OBJECTIVES$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Objectives" element
     */
    public boolean isNilObjectives()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation)get_store().find_element_user(OBJECTIVES$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Objectives" element
     */
    public boolean isSetObjectives()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTIVES$12) != 0;
        }
    }
    
    /**
     * Sets the "Objectives" element
     */
    public void setObjectives(com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation objectives)
    {
        generatedSetterHelperImpl(objectives, OBJECTIVES$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Objectives" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation addNewObjectives()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation)get_store().add_element_user(OBJECTIVES$12);
            return target;
        }
    }
    
    /**
     * Nils the "Objectives" element
     */
    public void setNilObjectives()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation)get_store().find_element_user(OBJECTIVES$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation)get_store().add_element_user(OBJECTIVES$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Objectives" element
     */
    public void unsetObjectives()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTIVES$12, 0);
        }
    }
    
    /**
     * Gets the "RecurrenceDuration" element
     */
    public int getRecurrenceDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECURRENCEDURATION$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RecurrenceDuration" element
     */
    public org.apache.xmlbeans.XmlInt xgetRecurrenceDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECURRENCEDURATION$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "RecurrenceDuration" element
     */
    public boolean isSetRecurrenceDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECURRENCEDURATION$14) != 0;
        }
    }
    
    /**
     * Sets the "RecurrenceDuration" element
     */
    public void setRecurrenceDuration(int recurrenceDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECURRENCEDURATION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECURRENCEDURATION$14);
            }
            target.setIntValue(recurrenceDuration);
        }
    }
    
    /**
     * Sets (as xml) the "RecurrenceDuration" element
     */
    public void xsetRecurrenceDuration(org.apache.xmlbeans.XmlInt recurrenceDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECURRENCEDURATION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RECURRENCEDURATION$14);
            }
            target.set(recurrenceDuration);
        }
    }
    
    /**
     * Unsets the "RecurrenceDuration" element
     */
    public void unsetRecurrenceDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECURRENCEDURATION$14, 0);
        }
    }
    
    /**
     * Gets the "RecurrenceTimeZoneCode" element
     */
    public int getRecurrenceTimeZoneCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECURRENCETIMEZONECODE$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RecurrenceTimeZoneCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetRecurrenceTimeZoneCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECURRENCETIMEZONECODE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "RecurrenceTimeZoneCode" element
     */
    public boolean isSetRecurrenceTimeZoneCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECURRENCETIMEZONECODE$16) != 0;
        }
    }
    
    /**
     * Sets the "RecurrenceTimeZoneCode" element
     */
    public void setRecurrenceTimeZoneCode(int recurrenceTimeZoneCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECURRENCETIMEZONECODE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECURRENCETIMEZONECODE$16);
            }
            target.setIntValue(recurrenceTimeZoneCode);
        }
    }
    
    /**
     * Sets (as xml) the "RecurrenceTimeZoneCode" element
     */
    public void xsetRecurrenceTimeZoneCode(org.apache.xmlbeans.XmlInt recurrenceTimeZoneCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECURRENCETIMEZONECODE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RECURRENCETIMEZONECODE$16);
            }
            target.set(recurrenceTimeZoneCode);
        }
    }
    
    /**
     * Unsets the "RecurrenceTimeZoneCode" element
     */
    public void unsetRecurrenceTimeZoneCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECURRENCETIMEZONECODE$16, 0);
        }
    }
    
    /**
     * Gets the "RequiredResources" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource getRequiredResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource)get_store().find_element_user(REQUIREDRESOURCES$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RequiredResources" element
     */
    public boolean isNilRequiredResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource)get_store().find_element_user(REQUIREDRESOURCES$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RequiredResources" element
     */
    public boolean isSetRequiredResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUIREDRESOURCES$18) != 0;
        }
    }
    
    /**
     * Sets the "RequiredResources" element
     */
    public void setRequiredResources(com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource requiredResources)
    {
        generatedSetterHelperImpl(requiredResources, REQUIREDRESOURCES$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RequiredResources" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource addNewRequiredResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource)get_store().add_element_user(REQUIREDRESOURCES$18);
            return target;
        }
    }
    
    /**
     * Nils the "RequiredResources" element
     */
    public void setNilRequiredResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource)get_store().find_element_user(REQUIREDRESOURCES$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource)get_store().add_element_user(REQUIREDRESOURCES$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RequiredResources" element
     */
    public void unsetRequiredResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUIREDRESOURCES$18, 0);
        }
    }
    
    /**
     * Gets the "SearchRecurrenceRule" element
     */
    public java.lang.String getSearchRecurrenceRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHRECURRENCERULE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SearchRecurrenceRule" element
     */
    public org.apache.xmlbeans.XmlString xgetSearchRecurrenceRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHRECURRENCERULE$20, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SearchRecurrenceRule" element
     */
    public boolean isNilSearchRecurrenceRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHRECURRENCERULE$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SearchRecurrenceRule" element
     */
    public boolean isSetSearchRecurrenceRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEARCHRECURRENCERULE$20) != 0;
        }
    }
    
    /**
     * Sets the "SearchRecurrenceRule" element
     */
    public void setSearchRecurrenceRule(java.lang.String searchRecurrenceRule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHRECURRENCERULE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHRECURRENCERULE$20);
            }
            target.setStringValue(searchRecurrenceRule);
        }
    }
    
    /**
     * Sets (as xml) the "SearchRecurrenceRule" element
     */
    public void xsetSearchRecurrenceRule(org.apache.xmlbeans.XmlString searchRecurrenceRule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHRECURRENCERULE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEARCHRECURRENCERULE$20);
            }
            target.set(searchRecurrenceRule);
        }
    }
    
    /**
     * Nils the "SearchRecurrenceRule" element
     */
    public void setNilSearchRecurrenceRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHRECURRENCERULE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEARCHRECURRENCERULE$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SearchRecurrenceRule" element
     */
    public void unsetSearchRecurrenceRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEARCHRECURRENCERULE$20, 0);
        }
    }
    
    /**
     * Gets the "SearchRecurrenceStart" element
     */
    public java.util.Calendar getSearchRecurrenceStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHRECURRENCESTART$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "SearchRecurrenceStart" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetSearchRecurrenceStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SEARCHRECURRENCESTART$22, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SearchRecurrenceStart" element
     */
    public boolean isNilSearchRecurrenceStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SEARCHRECURRENCESTART$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SearchRecurrenceStart" element
     */
    public boolean isSetSearchRecurrenceStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEARCHRECURRENCESTART$22) != 0;
        }
    }
    
    /**
     * Sets the "SearchRecurrenceStart" element
     */
    public void setSearchRecurrenceStart(java.util.Calendar searchRecurrenceStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHRECURRENCESTART$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHRECURRENCESTART$22);
            }
            target.setCalendarValue(searchRecurrenceStart);
        }
    }
    
    /**
     * Sets (as xml) the "SearchRecurrenceStart" element
     */
    public void xsetSearchRecurrenceStart(org.apache.xmlbeans.XmlDateTime searchRecurrenceStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SEARCHRECURRENCESTART$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SEARCHRECURRENCESTART$22);
            }
            target.set(searchRecurrenceStart);
        }
    }
    
    /**
     * Nils the "SearchRecurrenceStart" element
     */
    public void setNilSearchRecurrenceStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SEARCHRECURRENCESTART$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SEARCHRECURRENCESTART$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SearchRecurrenceStart" element
     */
    public void unsetSearchRecurrenceStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEARCHRECURRENCESTART$22, 0);
        }
    }
    
    /**
     * Gets the "SearchWindowEnd" element
     */
    public java.util.Calendar getSearchWindowEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHWINDOWEND$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "SearchWindowEnd" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetSearchWindowEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SEARCHWINDOWEND$24, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SearchWindowEnd" element
     */
    public boolean isNilSearchWindowEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SEARCHWINDOWEND$24, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SearchWindowEnd" element
     */
    public boolean isSetSearchWindowEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEARCHWINDOWEND$24) != 0;
        }
    }
    
    /**
     * Sets the "SearchWindowEnd" element
     */
    public void setSearchWindowEnd(java.util.Calendar searchWindowEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHWINDOWEND$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHWINDOWEND$24);
            }
            target.setCalendarValue(searchWindowEnd);
        }
    }
    
    /**
     * Sets (as xml) the "SearchWindowEnd" element
     */
    public void xsetSearchWindowEnd(org.apache.xmlbeans.XmlDateTime searchWindowEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SEARCHWINDOWEND$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SEARCHWINDOWEND$24);
            }
            target.set(searchWindowEnd);
        }
    }
    
    /**
     * Nils the "SearchWindowEnd" element
     */
    public void setNilSearchWindowEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SEARCHWINDOWEND$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SEARCHWINDOWEND$24);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SearchWindowEnd" element
     */
    public void unsetSearchWindowEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEARCHWINDOWEND$24, 0);
        }
    }
    
    /**
     * Gets the "SearchWindowStart" element
     */
    public java.util.Calendar getSearchWindowStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHWINDOWSTART$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "SearchWindowStart" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetSearchWindowStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SEARCHWINDOWSTART$26, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SearchWindowStart" element
     */
    public boolean isNilSearchWindowStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SEARCHWINDOWSTART$26, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SearchWindowStart" element
     */
    public boolean isSetSearchWindowStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEARCHWINDOWSTART$26) != 0;
        }
    }
    
    /**
     * Sets the "SearchWindowStart" element
     */
    public void setSearchWindowStart(java.util.Calendar searchWindowStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHWINDOWSTART$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHWINDOWSTART$26);
            }
            target.setCalendarValue(searchWindowStart);
        }
    }
    
    /**
     * Sets (as xml) the "SearchWindowStart" element
     */
    public void xsetSearchWindowStart(org.apache.xmlbeans.XmlDateTime searchWindowStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SEARCHWINDOWSTART$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SEARCHWINDOWSTART$26);
            }
            target.set(searchWindowStart);
        }
    }
    
    /**
     * Nils the "SearchWindowStart" element
     */
    public void setNilSearchWindowStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SEARCHWINDOWSTART$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SEARCHWINDOWSTART$26);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SearchWindowStart" element
     */
    public void unsetSearchWindowStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEARCHWINDOWSTART$26, 0);
        }
    }
    
    /**
     * Gets the "ServiceId" element
     */
    public java.lang.String getServiceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEID$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ServiceId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetServiceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(SERVICEID$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "ServiceId" element
     */
    public boolean isSetServiceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEID$28) != 0;
        }
    }
    
    /**
     * Sets the "ServiceId" element
     */
    public void setServiceId(java.lang.String serviceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEID$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICEID$28);
            }
            target.setStringValue(serviceId);
        }
    }
    
    /**
     * Sets (as xml) the "ServiceId" element
     */
    public void xsetServiceId(com.microsoft.schemas._2003._10.serialization.Guid serviceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(SERVICEID$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(SERVICEID$28);
            }
            target.set(serviceId);
        }
    }
    
    /**
     * Unsets the "ServiceId" element
     */
    public void unsetServiceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEID$28, 0);
        }
    }
    
    /**
     * Gets the "Sites" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid getSites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().find_element_user(SITES$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Sites" element
     */
    public boolean isNilSites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().find_element_user(SITES$30, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Sites" element
     */
    public boolean isSetSites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITES$30) != 0;
        }
    }
    
    /**
     * Sets the "Sites" element
     */
    public void setSites(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid sites)
    {
        generatedSetterHelperImpl(sites, SITES$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Sites" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid addNewSites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().add_element_user(SITES$30);
            return target;
        }
    }
    
    /**
     * Nils the "Sites" element
     */
    public void setNilSites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().find_element_user(SITES$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid)get_store().add_element_user(SITES$30);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Sites" element
     */
    public void unsetSites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITES$30, 0);
        }
    }
    
    /**
     * Gets the "UserTimeZoneCode" element
     */
    public int getUserTimeZoneCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERTIMEZONECODE$32, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserTimeZoneCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetUserTimeZoneCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(USERTIMEZONECODE$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "UserTimeZoneCode" element
     */
    public boolean isSetUserTimeZoneCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERTIMEZONECODE$32) != 0;
        }
    }
    
    /**
     * Sets the "UserTimeZoneCode" element
     */
    public void setUserTimeZoneCode(int userTimeZoneCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERTIMEZONECODE$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERTIMEZONECODE$32);
            }
            target.setIntValue(userTimeZoneCode);
        }
    }
    
    /**
     * Sets (as xml) the "UserTimeZoneCode" element
     */
    public void xsetUserTimeZoneCode(org.apache.xmlbeans.XmlInt userTimeZoneCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(USERTIMEZONECODE$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(USERTIMEZONECODE$32);
            }
            target.set(userTimeZoneCode);
        }
    }
    
    /**
     * Unsets the "UserTimeZoneCode" element
     */
    public void unsetUserTimeZoneCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERTIMEZONECODE$32, 0);
        }
    }
}
