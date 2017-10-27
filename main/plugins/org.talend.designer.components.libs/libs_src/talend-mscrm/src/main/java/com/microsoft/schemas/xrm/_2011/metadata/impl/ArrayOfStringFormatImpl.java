/*
 * XML Type:  ArrayOfStringFormat
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfStringFormat
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfStringFormat(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfStringFormatImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfStringFormat
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfStringFormatImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRINGFORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "StringFormat");
    
    
    /**
     * Gets array of all "StringFormat" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum[] getStringFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRINGFORMAT$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum[] result = new com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "StringFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum getStringFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "StringFormat" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.StringFormat[] xgetStringFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRINGFORMAT$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.StringFormat[] result = new com.microsoft.schemas.xrm._2011.metadata.StringFormat[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "StringFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StringFormat xgetStringFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().find_element_user(STRINGFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StringFormat" element
     */
    public int sizeOfStringFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRINGFORMAT$0);
        }
    }
    
    /**
     * Sets array of all "StringFormat" element
     */
    public void setStringFormatArray(com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum[] stringFormatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stringFormatArray, STRINGFORMAT$0);
        }
    }
    
    /**
     * Sets ith "StringFormat" element
     */
    public void setStringFormatArray(int i, com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum stringFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(stringFormat);
        }
    }
    
    /**
     * Sets (as xml) array of all "StringFormat" element
     */
    public void xsetStringFormatArray(com.microsoft.schemas.xrm._2011.metadata.StringFormat[]stringFormatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stringFormatArray, STRINGFORMAT$0);
        }
    }
    
    /**
     * Sets (as xml) ith "StringFormat" element
     */
    public void xsetStringFormatArray(int i, com.microsoft.schemas.xrm._2011.metadata.StringFormat stringFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().find_element_user(STRINGFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stringFormat);
        }
    }
    
    /**
     * Inserts the value as the ith "StringFormat" element
     */
    public void insertStringFormat(int i, com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum stringFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STRINGFORMAT$0, i);
            target.setEnumValue(stringFormat);
        }
    }
    
    /**
     * Appends the value as the last "StringFormat" element
     */
    public void addStringFormat(com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum stringFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRINGFORMAT$0);
            target.setEnumValue(stringFormat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StringFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StringFormat insertNewStringFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().insert_element_user(STRINGFORMAT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StringFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StringFormat addNewStringFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().add_element_user(STRINGFORMAT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "StringFormat" element
     */
    public void removeStringFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRINGFORMAT$0, i);
        }
    }
}
