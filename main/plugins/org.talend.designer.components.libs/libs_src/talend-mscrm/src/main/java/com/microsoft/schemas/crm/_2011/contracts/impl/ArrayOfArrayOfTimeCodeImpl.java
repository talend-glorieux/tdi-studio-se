/*
 * XML Type:  ArrayOfArrayOfTimeCode
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeCode
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfTimeCode(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfTimeCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeCode
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfTimeCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFTIMECODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfTimeCode");
    
    
    /**
     * Gets array of all "ArrayOfTimeCode" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode[] getArrayOfTimeCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFTIMECODE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfTimeCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode getArrayOfTimeCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode)get_store().find_element_user(ARRAYOFTIMECODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfTimeCode" element
     */
    public boolean isNilArrayOfTimeCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode)get_store().find_element_user(ARRAYOFTIMECODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfTimeCode" element
     */
    public int sizeOfArrayOfTimeCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFTIMECODE$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfTimeCode" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfTimeCodeArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode[] arrayOfTimeCodeArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfTimeCodeArray, ARRAYOFTIMECODE$0);
    }
    
    /**
     * Sets ith "ArrayOfTimeCode" element
     */
    public void setArrayOfTimeCodeArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode arrayOfTimeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode)get_store().find_element_user(ARRAYOFTIMECODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfTimeCode);
        }
    }
    
    /**
     * Nils the ith "ArrayOfTimeCode" element
     */
    public void setNilArrayOfTimeCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode)get_store().find_element_user(ARRAYOFTIMECODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfTimeCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode insertNewArrayOfTimeCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode)get_store().insert_element_user(ARRAYOFTIMECODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfTimeCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode addNewArrayOfTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode)get_store().add_element_user(ARRAYOFTIMECODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfTimeCode" element
     */
    public void removeArrayOfTimeCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFTIMECODE$0, i);
        }
    }
}
