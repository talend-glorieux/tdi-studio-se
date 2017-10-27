/*
 * XML Type:  ArrayOfComponentDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfComponentDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfComponentDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfComponentDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENTDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ComponentDetail");
    
    
    /**
     * Gets array of all "ComponentDetail" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ComponentDetail[] getComponentDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPONENTDETAIL$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail[] result = new com.microsoft.schemas.crm._2011.contracts.ComponentDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ComponentDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ComponentDetail getComponentDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().find_element_user(COMPONENTDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ComponentDetail" element
     */
    public boolean isNilComponentDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().find_element_user(COMPONENTDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ComponentDetail" element
     */
    public int sizeOfComponentDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENTDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "ComponentDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setComponentDetailArray(com.microsoft.schemas.crm._2011.contracts.ComponentDetail[] componentDetailArray)
    {
        check_orphaned();
        arraySetterHelper(componentDetailArray, COMPONENTDETAIL$0);
    }
    
    /**
     * Sets ith "ComponentDetail" element
     */
    public void setComponentDetailArray(int i, com.microsoft.schemas.crm._2011.contracts.ComponentDetail componentDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().find_element_user(COMPONENTDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(componentDetail);
        }
    }
    
    /**
     * Nils the ith "ComponentDetail" element
     */
    public void setNilComponentDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().find_element_user(COMPONENTDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ComponentDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ComponentDetail insertNewComponentDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().insert_element_user(COMPONENTDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ComponentDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ComponentDetail addNewComponentDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().add_element_user(COMPONENTDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ComponentDetail" element
     */
    public void removeComponentDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENTDETAIL$0, i);
        }
    }
}
