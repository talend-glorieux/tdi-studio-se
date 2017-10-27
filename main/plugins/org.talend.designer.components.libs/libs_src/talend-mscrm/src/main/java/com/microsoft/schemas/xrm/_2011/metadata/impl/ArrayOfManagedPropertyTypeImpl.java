/*
 * XML Type:  ArrayOfManagedPropertyType
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfManagedPropertyType(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfManagedPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfManagedPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANAGEDPROPERTYTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ManagedPropertyType");
    
    
    /**
     * Gets array of all "ManagedPropertyType" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType.Enum[] getManagedPropertyTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MANAGEDPROPERTYTYPE$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType.Enum[] result = new com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ManagedPropertyType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType.Enum getManagedPropertyTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEDPROPERTYTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "ManagedPropertyType" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType[] xgetManagedPropertyTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MANAGEDPROPERTYTYPE$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType[] result = new com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ManagedPropertyType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType xgetManagedPropertyTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType)get_store().find_element_user(MANAGEDPROPERTYTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ManagedPropertyType" element
     */
    public int sizeOfManagedPropertyTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANAGEDPROPERTYTYPE$0);
        }
    }
    
    /**
     * Sets array of all "ManagedPropertyType" element
     */
    public void setManagedPropertyTypeArray(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType.Enum[] managedPropertyTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(managedPropertyTypeArray, MANAGEDPROPERTYTYPE$0);
        }
    }
    
    /**
     * Sets ith "ManagedPropertyType" element
     */
    public void setManagedPropertyTypeArray(int i, com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType.Enum managedPropertyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEDPROPERTYTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(managedPropertyType);
        }
    }
    
    /**
     * Sets (as xml) array of all "ManagedPropertyType" element
     */
    public void xsetManagedPropertyTypeArray(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType[]managedPropertyTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(managedPropertyTypeArray, MANAGEDPROPERTYTYPE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "ManagedPropertyType" element
     */
    public void xsetManagedPropertyTypeArray(int i, com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType managedPropertyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType)get_store().find_element_user(MANAGEDPROPERTYTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(managedPropertyType);
        }
    }
    
    /**
     * Inserts the value as the ith "ManagedPropertyType" element
     */
    public void insertManagedPropertyType(int i, com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType.Enum managedPropertyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MANAGEDPROPERTYTYPE$0, i);
            target.setEnumValue(managedPropertyType);
        }
    }
    
    /**
     * Appends the value as the last "ManagedPropertyType" element
     */
    public void addManagedPropertyType(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType.Enum managedPropertyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANAGEDPROPERTYTYPE$0);
            target.setEnumValue(managedPropertyType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ManagedPropertyType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType insertNewManagedPropertyType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType)get_store().insert_element_user(MANAGEDPROPERTYTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ManagedPropertyType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType addNewManagedPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType)get_store().add_element_user(MANAGEDPROPERTYTYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ManagedPropertyType" element
     */
    public void removeManagedPropertyType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANAGEDPROPERTYTYPE$0, i);
        }
    }
}
