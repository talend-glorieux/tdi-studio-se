/*
 * XML Type:  ArrayOfArrayOfComponentDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfComponentDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfComponentDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfComponentDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfComponentDetail
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfComponentDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFCOMPONENTDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfComponentDetail");
    
    
    /**
     * Gets array of all "ArrayOfComponentDetail" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail[] getArrayOfComponentDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFCOMPONENTDETAIL$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfComponentDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail getArrayOfComponentDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail)get_store().find_element_user(ARRAYOFCOMPONENTDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfComponentDetail" element
     */
    public boolean isNilArrayOfComponentDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail)get_store().find_element_user(ARRAYOFCOMPONENTDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfComponentDetail" element
     */
    public int sizeOfArrayOfComponentDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFCOMPONENTDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfComponentDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfComponentDetailArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail[] arrayOfComponentDetailArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfComponentDetailArray, ARRAYOFCOMPONENTDETAIL$0);
    }
    
    /**
     * Sets ith "ArrayOfComponentDetail" element
     */
    public void setArrayOfComponentDetailArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail arrayOfComponentDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail)get_store().find_element_user(ARRAYOFCOMPONENTDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfComponentDetail);
        }
    }
    
    /**
     * Nils the ith "ArrayOfComponentDetail" element
     */
    public void setNilArrayOfComponentDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail)get_store().find_element_user(ARRAYOFCOMPONENTDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfComponentDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail insertNewArrayOfComponentDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail)get_store().insert_element_user(ARRAYOFCOMPONENTDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfComponentDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail addNewArrayOfComponentDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail)get_store().add_element_user(ARRAYOFCOMPONENTDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfComponentDetail" element
     */
    public void removeArrayOfComponentDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFCOMPONENTDETAIL$0, i);
        }
    }
}
