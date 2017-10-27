/*
 * XML Type:  ArrayOfDateTimeFormat
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfDateTimeFormat
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfDateTimeFormat(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfDateTimeFormatImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfDateTimeFormat
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfDateTimeFormatImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATETIMEFORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "DateTimeFormat");
    
    
    /**
     * Gets array of all "DateTimeFormat" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat.Enum[] getDateTimeFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATETIMEFORMAT$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat.Enum[] result = new com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "DateTimeFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat.Enum getDateTimeFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIMEFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "DateTimeFormat" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat[] xgetDateTimeFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATETIMEFORMAT$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat[] result = new com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "DateTimeFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat xgetDateTimeFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat)get_store().find_element_user(DATETIMEFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DateTimeFormat" element
     */
    public int sizeOfDateTimeFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATETIMEFORMAT$0);
        }
    }
    
    /**
     * Sets array of all "DateTimeFormat" element
     */
    public void setDateTimeFormatArray(com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat.Enum[] dateTimeFormatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dateTimeFormatArray, DATETIMEFORMAT$0);
        }
    }
    
    /**
     * Sets ith "DateTimeFormat" element
     */
    public void setDateTimeFormatArray(int i, com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat.Enum dateTimeFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIMEFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(dateTimeFormat);
        }
    }
    
    /**
     * Sets (as xml) array of all "DateTimeFormat" element
     */
    public void xsetDateTimeFormatArray(com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat[]dateTimeFormatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dateTimeFormatArray, DATETIMEFORMAT$0);
        }
    }
    
    /**
     * Sets (as xml) ith "DateTimeFormat" element
     */
    public void xsetDateTimeFormatArray(int i, com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat dateTimeFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat)get_store().find_element_user(DATETIMEFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dateTimeFormat);
        }
    }
    
    /**
     * Inserts the value as the ith "DateTimeFormat" element
     */
    public void insertDateTimeFormat(int i, com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat.Enum dateTimeFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DATETIMEFORMAT$0, i);
            target.setEnumValue(dateTimeFormat);
        }
    }
    
    /**
     * Appends the value as the last "DateTimeFormat" element
     */
    public void addDateTimeFormat(com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat.Enum dateTimeFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATETIMEFORMAT$0);
            target.setEnumValue(dateTimeFormat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DateTimeFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat insertNewDateTimeFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat)get_store().insert_element_user(DATETIMEFORMAT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DateTimeFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat addNewDateTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeFormat)get_store().add_element_user(DATETIMEFORMAT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DateTimeFormat" element
     */
    public void removeDateTimeFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATETIMEFORMAT$0, i);
        }
    }
}
