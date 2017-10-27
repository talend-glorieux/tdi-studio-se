/*
 * XML Type:  ArrayOfImeMode
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfImeMode
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfImeMode(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfImeModeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfImeMode
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfImeModeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMEMODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ImeMode");
    
    
    /**
     * Gets array of all "ImeMode" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum[] getImeModeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IMEMODE$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum[] result = new com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ImeMode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum getImeModeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMEMODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "ImeMode" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.ImeMode[] xgetImeModeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IMEMODE$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.ImeMode[] result = new com.microsoft.schemas.xrm._2011.metadata.ImeMode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ImeMode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ImeMode xgetImeModeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().find_element_user(IMEMODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ImeMode" element
     */
    public int sizeOfImeModeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMEMODE$0);
        }
    }
    
    /**
     * Sets array of all "ImeMode" element
     */
    public void setImeModeArray(com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum[] imeModeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(imeModeArray, IMEMODE$0);
        }
    }
    
    /**
     * Sets ith "ImeMode" element
     */
    public void setImeModeArray(int i, com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum imeMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMEMODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(imeMode);
        }
    }
    
    /**
     * Sets (as xml) array of all "ImeMode" element
     */
    public void xsetImeModeArray(com.microsoft.schemas.xrm._2011.metadata.ImeMode[]imeModeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(imeModeArray, IMEMODE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "ImeMode" element
     */
    public void xsetImeModeArray(int i, com.microsoft.schemas.xrm._2011.metadata.ImeMode imeMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().find_element_user(IMEMODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(imeMode);
        }
    }
    
    /**
     * Inserts the value as the ith "ImeMode" element
     */
    public void insertImeMode(int i, com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum imeMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(IMEMODE$0, i);
            target.setEnumValue(imeMode);
        }
    }
    
    /**
     * Appends the value as the last "ImeMode" element
     */
    public void addImeMode(com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum imeMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMEMODE$0);
            target.setEnumValue(imeMode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ImeMode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ImeMode insertNewImeMode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().insert_element_user(IMEMODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ImeMode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ImeMode addNewImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().add_element_user(IMEMODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ImeMode" element
     */
    public void removeImeMode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMEMODE$0, i);
        }
    }
}
