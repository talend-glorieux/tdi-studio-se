/*
 * XML Type:  ArrayOfCascadeType
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfCascadeType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfCascadeType(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfCascadeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfCascadeType
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfCascadeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CASCADETYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CascadeType");
    
    
    /**
     * Gets array of all "CascadeType" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum[] getCascadeTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CASCADETYPE$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum[] result = new com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "CascadeType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum getCascadeTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASCADETYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "CascadeType" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType[] xgetCascadeTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CASCADETYPE$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.CascadeType[] result = new com.microsoft.schemas.xrm._2011.metadata.CascadeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "CascadeType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType xgetCascadeTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(CASCADETYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CascadeType" element
     */
    public int sizeOfCascadeTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CASCADETYPE$0);
        }
    }
    
    /**
     * Sets array of all "CascadeType" element
     */
    public void setCascadeTypeArray(com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum[] cascadeTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cascadeTypeArray, CASCADETYPE$0);
        }
    }
    
    /**
     * Sets ith "CascadeType" element
     */
    public void setCascadeTypeArray(int i, com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum cascadeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASCADETYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(cascadeType);
        }
    }
    
    /**
     * Sets (as xml) array of all "CascadeType" element
     */
    public void xsetCascadeTypeArray(com.microsoft.schemas.xrm._2011.metadata.CascadeType[]cascadeTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cascadeTypeArray, CASCADETYPE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "CascadeType" element
     */
    public void xsetCascadeTypeArray(int i, com.microsoft.schemas.xrm._2011.metadata.CascadeType cascadeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(CASCADETYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cascadeType);
        }
    }
    
    /**
     * Inserts the value as the ith "CascadeType" element
     */
    public void insertCascadeType(int i, com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum cascadeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CASCADETYPE$0, i);
            target.setEnumValue(cascadeType);
        }
    }
    
    /**
     * Appends the value as the last "CascadeType" element
     */
    public void addCascadeType(com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum cascadeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CASCADETYPE$0);
            target.setEnumValue(cascadeType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CascadeType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType insertNewCascadeType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().insert_element_user(CASCADETYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CascadeType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType addNewCascadeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().add_element_user(CASCADETYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "CascadeType" element
     */
    public void removeCascadeType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CASCADETYPE$0, i);
        }
    }
}
