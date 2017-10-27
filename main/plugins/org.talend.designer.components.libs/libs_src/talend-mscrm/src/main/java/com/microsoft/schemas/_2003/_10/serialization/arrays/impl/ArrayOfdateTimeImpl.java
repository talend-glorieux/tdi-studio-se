/*
 * XML Type:  ArrayOfdateTime
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdateTime
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * An XML ArrayOfdateTime(@http://schemas.microsoft.com/2003/10/Serialization/Arrays).
 *
 * This is a complex type.
 */
public class ArrayOfdateTimeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdateTime
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfdateTimeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATETIME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "dateTime");
    
    
    /**
     * Gets array of all "dateTime" elements
     */
    public java.util.Calendar[] getDateTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATETIME$0, targetList);
            java.util.Calendar[] result = new java.util.Calendar[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getCalendarValue();
            return result;
        }
    }
    
    /**
     * Gets ith "dateTime" element
     */
    public java.util.Calendar getDateTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "dateTime" elements
     */
    public org.apache.xmlbeans.XmlDateTime[] xgetDateTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATETIME$0, targetList);
            org.apache.xmlbeans.XmlDateTime[] result = new org.apache.xmlbeans.XmlDateTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "dateTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATETIME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dateTime" element
     */
    public int sizeOfDateTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATETIME$0);
        }
    }
    
    /**
     * Sets array of all "dateTime" element
     */
    public void setDateTimeArray(java.util.Calendar[] dateTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dateTimeArray, DATETIME$0);
        }
    }
    
    /**
     * Sets ith "dateTime" element
     */
    public void setDateTimeArray(int i, java.util.Calendar dateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setCalendarValue(dateTime);
        }
    }
    
    /**
     * Sets (as xml) array of all "dateTime" element
     */
    public void xsetDateTimeArray(org.apache.xmlbeans.XmlDateTime[]dateTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dateTimeArray, DATETIME$0);
        }
    }
    
    /**
     * Sets (as xml) ith "dateTime" element
     */
    public void xsetDateTimeArray(int i, org.apache.xmlbeans.XmlDateTime dateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATETIME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dateTime);
        }
    }
    
    /**
     * Inserts the value as the ith "dateTime" element
     */
    public void insertDateTime(int i, java.util.Calendar dateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DATETIME$0, i);
            target.setCalendarValue(dateTime);
        }
    }
    
    /**
     * Appends the value as the last "dateTime" element
     */
    public void addDateTime(java.util.Calendar dateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATETIME$0);
            target.setCalendarValue(dateTime);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dateTime" element
     */
    public org.apache.xmlbeans.XmlDateTime insertNewDateTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().insert_element_user(DATETIME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dateTime" element
     */
    public org.apache.xmlbeans.XmlDateTime addNewDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATETIME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dateTime" element
     */
    public void removeDateTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATETIME$0, i);
        }
    }
}
