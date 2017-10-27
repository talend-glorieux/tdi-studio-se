/*
 * XML Type:  ArrayOfdecimal
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdecimal
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * An XML ArrayOfdecimal(@http://schemas.microsoft.com/2003/10/Serialization/Arrays).
 *
 * This is a complex type.
 */
public class ArrayOfdecimalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdecimal
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfdecimalImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECIMAL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "decimal");
    
    
    /**
     * Gets array of all "decimal" elements
     */
    public java.math.BigDecimal[] getDecimalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DECIMAL$0, targetList);
            java.math.BigDecimal[] result = new java.math.BigDecimal[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigDecimalValue();
            return result;
        }
    }
    
    /**
     * Gets ith "decimal" element
     */
    public java.math.BigDecimal getDecimalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMAL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "decimal" elements
     */
    public org.apache.xmlbeans.XmlDecimal[] xgetDecimalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DECIMAL$0, targetList);
            org.apache.xmlbeans.XmlDecimal[] result = new org.apache.xmlbeans.XmlDecimal[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "decimal" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetDecimalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(DECIMAL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "decimal" element
     */
    public int sizeOfDecimalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECIMAL$0);
        }
    }
    
    /**
     * Sets array of all "decimal" element
     */
    public void setDecimalArray(java.math.BigDecimal[] decimalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(decimalArray, DECIMAL$0);
        }
    }
    
    /**
     * Sets ith "decimal" element
     */
    public void setDecimalArray(int i, java.math.BigDecimal decimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMAL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBigDecimalValue(decimal);
        }
    }
    
    /**
     * Sets (as xml) array of all "decimal" element
     */
    public void xsetDecimalArray(org.apache.xmlbeans.XmlDecimal[]decimalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(decimalArray, DECIMAL$0);
        }
    }
    
    /**
     * Sets (as xml) ith "decimal" element
     */
    public void xsetDecimalArray(int i, org.apache.xmlbeans.XmlDecimal decimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(DECIMAL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(decimal);
        }
    }
    
    /**
     * Inserts the value as the ith "decimal" element
     */
    public void insertDecimal(int i, java.math.BigDecimal decimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DECIMAL$0, i);
            target.setBigDecimalValue(decimal);
        }
    }
    
    /**
     * Appends the value as the last "decimal" element
     */
    public void addDecimal(java.math.BigDecimal decimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECIMAL$0);
            target.setBigDecimalValue(decimal);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "decimal" element
     */
    public org.apache.xmlbeans.XmlDecimal insertNewDecimal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().insert_element_user(DECIMAL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "decimal" element
     */
    public org.apache.xmlbeans.XmlDecimal addNewDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(DECIMAL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "decimal" element
     */
    public void removeDecimal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECIMAL$0, i);
        }
    }
}
