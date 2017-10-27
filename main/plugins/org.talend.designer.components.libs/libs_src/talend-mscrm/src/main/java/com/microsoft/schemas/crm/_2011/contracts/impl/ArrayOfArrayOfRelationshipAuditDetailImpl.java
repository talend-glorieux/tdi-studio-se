/*
 * XML Type:  ArrayOfArrayOfRelationshipAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRelationshipAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfRelationshipAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfRelationshipAuditDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRelationshipAuditDetail
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfRelationshipAuditDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFRELATIONSHIPAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfRelationshipAuditDetail");
    
    
    /**
     * Gets array of all "ArrayOfRelationshipAuditDetail" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail[] getArrayOfRelationshipAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFRELATIONSHIPAUDITDETAIL$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfRelationshipAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail getArrayOfRelationshipAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail)get_store().find_element_user(ARRAYOFRELATIONSHIPAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfRelationshipAuditDetail" element
     */
    public boolean isNilArrayOfRelationshipAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail)get_store().find_element_user(ARRAYOFRELATIONSHIPAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfRelationshipAuditDetail" element
     */
    public int sizeOfArrayOfRelationshipAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFRELATIONSHIPAUDITDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfRelationshipAuditDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfRelationshipAuditDetailArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail[] arrayOfRelationshipAuditDetailArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfRelationshipAuditDetailArray, ARRAYOFRELATIONSHIPAUDITDETAIL$0);
    }
    
    /**
     * Sets ith "ArrayOfRelationshipAuditDetail" element
     */
    public void setArrayOfRelationshipAuditDetailArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail arrayOfRelationshipAuditDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail)get_store().find_element_user(ARRAYOFRELATIONSHIPAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfRelationshipAuditDetail);
        }
    }
    
    /**
     * Nils the ith "ArrayOfRelationshipAuditDetail" element
     */
    public void setNilArrayOfRelationshipAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail)get_store().find_element_user(ARRAYOFRELATIONSHIPAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfRelationshipAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail insertNewArrayOfRelationshipAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail)get_store().insert_element_user(ARRAYOFRELATIONSHIPAUDITDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfRelationshipAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail addNewArrayOfRelationshipAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail)get_store().add_element_user(ARRAYOFRELATIONSHIPAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfRelationshipAuditDetail" element
     */
    public void removeArrayOfRelationshipAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFRELATIONSHIPAUDITDETAIL$0, i);
        }
    }
}
