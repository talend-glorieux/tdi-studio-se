/*
 * XML Type:  AuditPartitionDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML AuditPartitionDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class AuditPartitionDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.AuditPartitionDetail
{
    private static final long serialVersionUID = 1L;
    
    public AuditPartitionDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDDATE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "EndDate");
    private static final javax.xml.namespace.QName PARTITIONNUMBER$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "PartitionNumber");
    private static final javax.xml.namespace.QName SIZE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Size");
    private static final javax.xml.namespace.QName STARTDATE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "StartDate");
    
    
    /**
     * Gets the "EndDate" element
     */
    public java.util.Calendar getEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EndDate" element
     */
    public boolean isNilEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDDATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EndDate" element
     */
    public boolean isSetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDDATE$0) != 0;
        }
    }
    
    /**
     * Sets the "EndDate" element
     */
    public void setEndDate(java.util.Calendar endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$0);
            }
            target.setCalendarValue(endDate);
        }
    }
    
    /**
     * Sets (as xml) the "EndDate" element
     */
    public void xsetEndDate(org.apache.xmlbeans.XmlDateTime endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDDATE$0);
            }
            target.set(endDate);
        }
    }
    
    /**
     * Nils the "EndDate" element
     */
    public void setNilEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDDATE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EndDate" element
     */
    public void unsetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDDATE$0, 0);
        }
    }
    
    /**
     * Gets the "PartitionNumber" element
     */
    public int getPartitionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTITIONNUMBER$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "PartitionNumber" element
     */
    public org.apache.xmlbeans.XmlInt xgetPartitionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PARTITIONNUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "PartitionNumber" element
     */
    public boolean isSetPartitionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTITIONNUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "PartitionNumber" element
     */
    public void setPartitionNumber(int partitionNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTITIONNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTITIONNUMBER$2);
            }
            target.setIntValue(partitionNumber);
        }
    }
    
    /**
     * Sets (as xml) the "PartitionNumber" element
     */
    public void xsetPartitionNumber(org.apache.xmlbeans.XmlInt partitionNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PARTITIONNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PARTITIONNUMBER$2);
            }
            target.set(partitionNumber);
        }
    }
    
    /**
     * Unsets the "PartitionNumber" element
     */
    public void unsetPartitionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTITIONNUMBER$2, 0);
        }
    }
    
    /**
     * Gets the "Size" element
     */
    public long getSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZE$4, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "Size" element
     */
    public org.apache.xmlbeans.XmlLong xgetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SIZE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Size" element
     */
    public boolean isSetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIZE$4) != 0;
        }
    }
    
    /**
     * Sets the "Size" element
     */
    public void setSize(long size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIZE$4);
            }
            target.setLongValue(size);
        }
    }
    
    /**
     * Sets (as xml) the "Size" element
     */
    public void xsetSize(org.apache.xmlbeans.XmlLong size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SIZE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(SIZE$4);
            }
            target.set(size);
        }
    }
    
    /**
     * Unsets the "Size" element
     */
    public void unsetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIZE$4, 0);
        }
    }
    
    /**
     * Gets the "StartDate" element
     */
    public java.util.Calendar getStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "StartDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTDATE$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "StartDate" element
     */
    public boolean isNilStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTDATE$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "StartDate" element
     */
    public boolean isSetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "StartDate" element
     */
    public void setStartDate(java.util.Calendar startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$6);
            }
            target.setCalendarValue(startDate);
        }
    }
    
    /**
     * Sets (as xml) the "StartDate" element
     */
    public void xsetStartDate(org.apache.xmlbeans.XmlDateTime startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(STARTDATE$6);
            }
            target.set(startDate);
        }
    }
    
    /**
     * Nils the "StartDate" element
     */
    public void setNilStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(STARTDATE$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "StartDate" element
     */
    public void unsetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTDATE$6, 0);
        }
    }
}
