/*
 * XML Type:  ArrayOfArrayOfAttributeAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAttributeAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfAttributeAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfAttributeAuditDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAttributeAuditDetail
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfAttributeAuditDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFATTRIBUTEAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAttributeAuditDetail");
    
    
    /**
     * Gets array of all "ArrayOfAttributeAuditDetail" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail[] getArrayOfAttributeAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFATTRIBUTEAUDITDETAIL$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfAttributeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail getArrayOfAttributeAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail)get_store().find_element_user(ARRAYOFATTRIBUTEAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfAttributeAuditDetail" element
     */
    public boolean isNilArrayOfAttributeAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail)get_store().find_element_user(ARRAYOFATTRIBUTEAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfAttributeAuditDetail" element
     */
    public int sizeOfArrayOfAttributeAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFATTRIBUTEAUDITDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfAttributeAuditDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfAttributeAuditDetailArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail[] arrayOfAttributeAuditDetailArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfAttributeAuditDetailArray, ARRAYOFATTRIBUTEAUDITDETAIL$0);
    }
    
    /**
     * Sets ith "ArrayOfAttributeAuditDetail" element
     */
    public void setArrayOfAttributeAuditDetailArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail arrayOfAttributeAuditDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail)get_store().find_element_user(ARRAYOFATTRIBUTEAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfAttributeAuditDetail);
        }
    }
    
    /**
     * Nils the ith "ArrayOfAttributeAuditDetail" element
     */
    public void setNilArrayOfAttributeAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail)get_store().find_element_user(ARRAYOFATTRIBUTEAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfAttributeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail insertNewArrayOfAttributeAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail)get_store().insert_element_user(ARRAYOFATTRIBUTEAUDITDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfAttributeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail addNewArrayOfAttributeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail)get_store().add_element_user(ARRAYOFATTRIBUTEAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfAttributeAuditDetail" element
     */
    public void removeArrayOfAttributeAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFATTRIBUTEAUDITDETAIL$0, i);
        }
    }
}
