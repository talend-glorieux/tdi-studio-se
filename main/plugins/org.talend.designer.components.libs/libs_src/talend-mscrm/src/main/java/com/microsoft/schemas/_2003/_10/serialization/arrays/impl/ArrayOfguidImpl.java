/*
 * XML Type:  ArrayOfguid
 * Namespace: http://schemas.microsoft.com/2003/10/Serialization/Arrays
 * Java type: com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas._2003._10.serialization.arrays.impl;
/**
 * An XML ArrayOfguid(@http://schemas.microsoft.com/2003/10/Serialization/Arrays).
 *
 * This is a complex type.
 */
public class ArrayOfguidImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfguidImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GUID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "guid");
    
    
    /**
     * Gets array of all "guid" elements
     */
    public java.lang.String[] getGuidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GUID$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "guid" element
     */
    public java.lang.String getGuidArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GUID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "guid" elements
     */
    public com.microsoft.schemas._2003._10.serialization.Guid[] xgetGuidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GUID$0, targetList);
            com.microsoft.schemas._2003._10.serialization.Guid[] result = new com.microsoft.schemas._2003._10.serialization.Guid[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "guid" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetGuidArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(GUID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "guid" element
     */
    public int sizeOfGuidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GUID$0);
        }
    }
    
    /**
     * Sets array of all "guid" element
     */
    public void setGuidArray(java.lang.String[] guidArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(guidArray, GUID$0);
        }
    }
    
    /**
     * Sets ith "guid" element
     */
    public void setGuidArray(int i, java.lang.String guid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GUID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(guid);
        }
    }
    
    /**
     * Sets (as xml) array of all "guid" element
     */
    public void xsetGuidArray(com.microsoft.schemas._2003._10.serialization.Guid[]guidArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(guidArray, GUID$0);
        }
    }
    
    /**
     * Sets (as xml) ith "guid" element
     */
    public void xsetGuidArray(int i, com.microsoft.schemas._2003._10.serialization.Guid guid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(GUID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(guid);
        }
    }
    
    /**
     * Inserts the value as the ith "guid" element
     */
    public void insertGuid(int i, java.lang.String guid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(GUID$0, i);
            target.setStringValue(guid);
        }
    }
    
    /**
     * Appends the value as the last "guid" element
     */
    public void addGuid(java.lang.String guid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GUID$0);
            target.setStringValue(guid);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "guid" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid insertNewGuid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().insert_element_user(GUID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "guid" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid addNewGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(GUID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "guid" element
     */
    public void removeGuid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GUID$0, i);
        }
    }
}
