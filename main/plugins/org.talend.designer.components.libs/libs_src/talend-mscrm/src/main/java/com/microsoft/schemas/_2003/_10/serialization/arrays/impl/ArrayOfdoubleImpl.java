/*
 * XML Type:  ArrayOfdouble
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * An XML ArrayOfdouble(@http://schemas.microsoft.com/2003/10/Serialization/Arrays).
 *
 * This is a complex type.
 */
public class ArrayOfdoubleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfdoubleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOUBLE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "double");
    
    
    /**
     * Gets array of all "double" elements
     */
    public double[] getDoubleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOUBLE$0, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "double" element
     */
    public double getDoubleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "double" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetDoubleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOUBLE$0, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "double" element
     */
    public org.apache.xmlbeans.XmlDouble xgetDoubleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DOUBLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "double" element
     */
    public int sizeOfDoubleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOUBLE$0);
        }
    }
    
    /**
     * Sets array of all "double" element
     */
    public void setDoubleArray(double[] xdoubleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xdoubleArray, DOUBLE$0);
        }
    }
    
    /**
     * Sets ith "double" element
     */
    public void setDoubleArray(int i, double xdouble)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(xdouble);
        }
    }
    
    /**
     * Sets (as xml) array of all "double" element
     */
    public void xsetDoubleArray(org.apache.xmlbeans.XmlDouble[]xdoubleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xdoubleArray, DOUBLE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "double" element
     */
    public void xsetDoubleArray(int i, org.apache.xmlbeans.XmlDouble xdouble)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DOUBLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xdouble);
        }
    }
    
    /**
     * Inserts the value as the ith "double" element
     */
    public void insertDouble(int i, double xdouble)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DOUBLE$0, i);
            target.setDoubleValue(xdouble);
        }
    }
    
    /**
     * Appends the value as the last "double" element
     */
    public void addDouble(double xdouble)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOUBLE$0);
            target.setDoubleValue(xdouble);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "double" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewDouble(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(DOUBLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "double" element
     */
    public org.apache.xmlbeans.XmlDouble addNewDouble()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(DOUBLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "double" element
     */
    public void removeDouble(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOUBLE$0, i);
        }
    }
}
