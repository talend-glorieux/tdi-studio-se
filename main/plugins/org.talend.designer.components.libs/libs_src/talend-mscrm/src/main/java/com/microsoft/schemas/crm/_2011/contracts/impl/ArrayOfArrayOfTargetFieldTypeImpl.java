/*
 * XML Type:  ArrayOfArrayOfTargetFieldType
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTargetFieldType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfTargetFieldType(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfTargetFieldTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTargetFieldType
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfTargetFieldTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFTARGETFIELDTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfTargetFieldType");
    
    
    /**
     * Gets array of all "ArrayOfTargetFieldType" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType[] getArrayOfTargetFieldTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFTARGETFIELDTYPE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfTargetFieldType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType getArrayOfTargetFieldTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType)get_store().find_element_user(ARRAYOFTARGETFIELDTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfTargetFieldType" element
     */
    public boolean isNilArrayOfTargetFieldTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType)get_store().find_element_user(ARRAYOFTARGETFIELDTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfTargetFieldType" element
     */
    public int sizeOfArrayOfTargetFieldTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFTARGETFIELDTYPE$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfTargetFieldType" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfTargetFieldTypeArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType[] arrayOfTargetFieldTypeArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfTargetFieldTypeArray, ARRAYOFTARGETFIELDTYPE$0);
    }
    
    /**
     * Sets ith "ArrayOfTargetFieldType" element
     */
    public void setArrayOfTargetFieldTypeArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType arrayOfTargetFieldType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType)get_store().find_element_user(ARRAYOFTARGETFIELDTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfTargetFieldType);
        }
    }
    
    /**
     * Nils the ith "ArrayOfTargetFieldType" element
     */
    public void setNilArrayOfTargetFieldTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType)get_store().find_element_user(ARRAYOFTARGETFIELDTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfTargetFieldType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType insertNewArrayOfTargetFieldType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType)get_store().insert_element_user(ARRAYOFTARGETFIELDTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfTargetFieldType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType addNewArrayOfTargetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTargetFieldType)get_store().add_element_user(ARRAYOFTARGETFIELDTYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfTargetFieldType" element
     */
    public void removeArrayOfTargetFieldType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFTARGETFIELDTYPE$0, i);
        }
    }
}
