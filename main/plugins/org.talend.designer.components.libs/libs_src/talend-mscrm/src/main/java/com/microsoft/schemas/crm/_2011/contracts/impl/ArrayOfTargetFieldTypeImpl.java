/*
 * XML Type:  ArrayOfTargetFieldType
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfTargetFieldType(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfTargetFieldTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfTargetFieldTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETFIELDTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "TargetFieldType");
    
    
    /**
     * Gets array of all "TargetFieldType" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.TargetFieldType.Enum[] getTargetFieldTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TARGETFIELDTYPE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.TargetFieldType.Enum[] result = new com.microsoft.schemas.crm._2011.contracts.TargetFieldType.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.crm._2011.contracts.TargetFieldType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "TargetFieldType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TargetFieldType.Enum getTargetFieldTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETFIELDTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.crm._2011.contracts.TargetFieldType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "TargetFieldType" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.TargetFieldType[] xgetTargetFieldTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TARGETFIELDTYPE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.TargetFieldType[] result = new com.microsoft.schemas.crm._2011.contracts.TargetFieldType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "TargetFieldType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TargetFieldType xgetTargetFieldTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TargetFieldType)get_store().find_element_user(TARGETFIELDTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "TargetFieldType" element
     */
    public int sizeOfTargetFieldTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETFIELDTYPE$0);
        }
    }
    
    /**
     * Sets array of all "TargetFieldType" element
     */
    public void setTargetFieldTypeArray(com.microsoft.schemas.crm._2011.contracts.TargetFieldType.Enum[] targetFieldTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(targetFieldTypeArray, TARGETFIELDTYPE$0);
        }
    }
    
    /**
     * Sets ith "TargetFieldType" element
     */
    public void setTargetFieldTypeArray(int i, com.microsoft.schemas.crm._2011.contracts.TargetFieldType.Enum targetFieldType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETFIELDTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(targetFieldType);
        }
    }
    
    /**
     * Sets (as xml) array of all "TargetFieldType" element
     */
    public void xsetTargetFieldTypeArray(com.microsoft.schemas.crm._2011.contracts.TargetFieldType[]targetFieldTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(targetFieldTypeArray, TARGETFIELDTYPE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "TargetFieldType" element
     */
    public void xsetTargetFieldTypeArray(int i, com.microsoft.schemas.crm._2011.contracts.TargetFieldType targetFieldType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TargetFieldType)get_store().find_element_user(TARGETFIELDTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(targetFieldType);
        }
    }
    
    /**
     * Inserts the value as the ith "TargetFieldType" element
     */
    public void insertTargetFieldType(int i, com.microsoft.schemas.crm._2011.contracts.TargetFieldType.Enum targetFieldType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TARGETFIELDTYPE$0, i);
            target.setEnumValue(targetFieldType);
        }
    }
    
    /**
     * Appends the value as the last "TargetFieldType" element
     */
    public void addTargetFieldType(com.microsoft.schemas.crm._2011.contracts.TargetFieldType.Enum targetFieldType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETFIELDTYPE$0);
            target.setEnumValue(targetFieldType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TargetFieldType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TargetFieldType insertNewTargetFieldType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TargetFieldType)get_store().insert_element_user(TARGETFIELDTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TargetFieldType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TargetFieldType addNewTargetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TargetFieldType)get_store().add_element_user(TARGETFIELDTYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "TargetFieldType" element
     */
    public void removeTargetFieldType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETFIELDTYPE$0, i);
        }
    }
}
