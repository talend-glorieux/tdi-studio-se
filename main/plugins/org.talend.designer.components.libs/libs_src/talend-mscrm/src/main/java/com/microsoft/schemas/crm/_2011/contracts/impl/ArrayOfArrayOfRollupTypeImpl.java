/*
 * XML Type:  ArrayOfArrayOfRollupType
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRollupType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfRollupType(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfRollupTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRollupType
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfRollupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFROLLUPTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfRollupType");
    
    
    /**
     * Gets array of all "ArrayOfRollupType" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType[] getArrayOfRollupTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFROLLUPTYPE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfRollupType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType getArrayOfRollupTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType)get_store().find_element_user(ARRAYOFROLLUPTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfRollupType" element
     */
    public boolean isNilArrayOfRollupTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType)get_store().find_element_user(ARRAYOFROLLUPTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfRollupType" element
     */
    public int sizeOfArrayOfRollupTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFROLLUPTYPE$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfRollupType" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfRollupTypeArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType[] arrayOfRollupTypeArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfRollupTypeArray, ARRAYOFROLLUPTYPE$0);
    }
    
    /**
     * Sets ith "ArrayOfRollupType" element
     */
    public void setArrayOfRollupTypeArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType arrayOfRollupType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType)get_store().find_element_user(ARRAYOFROLLUPTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfRollupType);
        }
    }
    
    /**
     * Nils the ith "ArrayOfRollupType" element
     */
    public void setNilArrayOfRollupTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType)get_store().find_element_user(ARRAYOFROLLUPTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfRollupType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType insertNewArrayOfRollupType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType)get_store().insert_element_user(ARRAYOFROLLUPTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfRollupType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType addNewArrayOfRollupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRollupType)get_store().add_element_user(ARRAYOFROLLUPTYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfRollupType" element
     */
    public void removeArrayOfRollupType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFROLLUPTYPE$0, i);
        }
    }
}
