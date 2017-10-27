/*
 * XML Type:  ArrayOfIntegerFormat
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfIntegerFormat
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfIntegerFormat(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfIntegerFormatImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfIntegerFormat
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfIntegerFormatImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTEGERFORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IntegerFormat");
    
    
    /**
     * Gets array of all "IntegerFormat" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.IntegerFormat.Enum[] getIntegerFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INTEGERFORMAT$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.IntegerFormat.Enum[] result = new com.microsoft.schemas.xrm._2011.metadata.IntegerFormat.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "IntegerFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.IntegerFormat.Enum getIntegerFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "IntegerFormat" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.IntegerFormat[] xgetIntegerFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INTEGERFORMAT$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.IntegerFormat[] result = new com.microsoft.schemas.xrm._2011.metadata.IntegerFormat[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "IntegerFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.IntegerFormat xgetIntegerFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.IntegerFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat)get_store().find_element_user(INTEGERFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "IntegerFormat" element
     */
    public int sizeOfIntegerFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTEGERFORMAT$0);
        }
    }
    
    /**
     * Sets array of all "IntegerFormat" element
     */
    public void setIntegerFormatArray(com.microsoft.schemas.xrm._2011.metadata.IntegerFormat.Enum[] integerFormatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(integerFormatArray, INTEGERFORMAT$0);
        }
    }
    
    /**
     * Sets ith "IntegerFormat" element
     */
    public void setIntegerFormatArray(int i, com.microsoft.schemas.xrm._2011.metadata.IntegerFormat.Enum integerFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(integerFormat);
        }
    }
    
    /**
     * Sets (as xml) array of all "IntegerFormat" element
     */
    public void xsetIntegerFormatArray(com.microsoft.schemas.xrm._2011.metadata.IntegerFormat[]integerFormatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(integerFormatArray, INTEGERFORMAT$0);
        }
    }
    
    /**
     * Sets (as xml) ith "IntegerFormat" element
     */
    public void xsetIntegerFormatArray(int i, com.microsoft.schemas.xrm._2011.metadata.IntegerFormat integerFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.IntegerFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat)get_store().find_element_user(INTEGERFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(integerFormat);
        }
    }
    
    /**
     * Inserts the value as the ith "IntegerFormat" element
     */
    public void insertIntegerFormat(int i, com.microsoft.schemas.xrm._2011.metadata.IntegerFormat.Enum integerFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INTEGERFORMAT$0, i);
            target.setEnumValue(integerFormat);
        }
    }
    
    /**
     * Appends the value as the last "IntegerFormat" element
     */
    public void addIntegerFormat(com.microsoft.schemas.xrm._2011.metadata.IntegerFormat.Enum integerFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTEGERFORMAT$0);
            target.setEnumValue(integerFormat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IntegerFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.IntegerFormat insertNewIntegerFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.IntegerFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat)get_store().insert_element_user(INTEGERFORMAT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IntegerFormat" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.IntegerFormat addNewIntegerFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.IntegerFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.IntegerFormat)get_store().add_element_user(INTEGERFORMAT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "IntegerFormat" element
     */
    public void removeIntegerFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTEGERFORMAT$0, i);
        }
    }
}
