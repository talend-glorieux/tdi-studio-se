/*
 * XML Type:  ArrayOfAttributeAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfAttributeAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfAttributeAuditDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfAttributeAuditDetail
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAttributeAuditDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AttributeAuditDetail");
    
    
    /**
     * Gets array of all "AttributeAuditDetail" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail[] getAttributeAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTEAUDITDETAIL$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail[] result = new com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttributeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail getAttributeAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail)get_store().find_element_user(ATTRIBUTEAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AttributeAuditDetail" element
     */
    public boolean isNilAttributeAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail)get_store().find_element_user(ATTRIBUTEAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AttributeAuditDetail" element
     */
    public int sizeOfAttributeAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEAUDITDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "AttributeAuditDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeAuditDetailArray(com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail[] attributeAuditDetailArray)
    {
        check_orphaned();
        arraySetterHelper(attributeAuditDetailArray, ATTRIBUTEAUDITDETAIL$0);
    }
    
    /**
     * Sets ith "AttributeAuditDetail" element
     */
    public void setAttributeAuditDetailArray(int i, com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail attributeAuditDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail)get_store().find_element_user(ATTRIBUTEAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attributeAuditDetail);
        }
    }
    
    /**
     * Nils the ith "AttributeAuditDetail" element
     */
    public void setNilAttributeAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail)get_store().find_element_user(ATTRIBUTEAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttributeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail insertNewAttributeAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail)get_store().insert_element_user(ATTRIBUTEAUDITDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttributeAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail addNewAttributeAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AttributeAuditDetail)get_store().add_element_user(ATTRIBUTEAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttributeAuditDetail" element
     */
    public void removeAttributeAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEAUDITDETAIL$0, i);
        }
    }
}
