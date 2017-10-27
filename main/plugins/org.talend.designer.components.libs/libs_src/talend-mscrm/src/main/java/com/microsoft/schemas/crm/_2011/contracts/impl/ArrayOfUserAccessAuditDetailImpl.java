/*
 * XML Type:  ArrayOfUserAccessAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfUserAccessAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfUserAccessAuditDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfUserAccessAuditDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERACCESSAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "UserAccessAuditDetail");
    
    
    /**
     * Gets array of all "UserAccessAuditDetail" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail[] getUserAccessAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USERACCESSAUDITDETAIL$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail[] result = new com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "UserAccessAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail getUserAccessAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail)get_store().find_element_user(USERACCESSAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "UserAccessAuditDetail" element
     */
    public boolean isNilUserAccessAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail)get_store().find_element_user(USERACCESSAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "UserAccessAuditDetail" element
     */
    public int sizeOfUserAccessAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERACCESSAUDITDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "UserAccessAuditDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setUserAccessAuditDetailArray(com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail[] userAccessAuditDetailArray)
    {
        check_orphaned();
        arraySetterHelper(userAccessAuditDetailArray, USERACCESSAUDITDETAIL$0);
    }
    
    /**
     * Sets ith "UserAccessAuditDetail" element
     */
    public void setUserAccessAuditDetailArray(int i, com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail userAccessAuditDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail)get_store().find_element_user(USERACCESSAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(userAccessAuditDetail);
        }
    }
    
    /**
     * Nils the ith "UserAccessAuditDetail" element
     */
    public void setNilUserAccessAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail)get_store().find_element_user(USERACCESSAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UserAccessAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail insertNewUserAccessAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail)get_store().insert_element_user(USERACCESSAUDITDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UserAccessAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail addNewUserAccessAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.UserAccessAuditDetail)get_store().add_element_user(USERACCESSAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "UserAccessAuditDetail" element
     */
    public void removeUserAccessAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERACCESSAUDITDETAIL$0, i);
        }
    }
}
