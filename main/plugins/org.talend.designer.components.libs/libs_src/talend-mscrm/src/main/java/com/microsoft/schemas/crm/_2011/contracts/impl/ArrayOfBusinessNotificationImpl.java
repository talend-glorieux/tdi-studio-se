/*
 * XML Type:  ArrayOfBusinessNotification
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfBusinessNotification(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfBusinessNotificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfBusinessNotificationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSNOTIFICATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "BusinessNotification");
    
    
    /**
     * Gets array of all "BusinessNotification" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.BusinessNotification[] getBusinessNotificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BUSINESSNOTIFICATION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.BusinessNotification[] result = new com.microsoft.schemas.crm._2011.contracts.BusinessNotification[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "BusinessNotification" element
     */
    public com.microsoft.schemas.crm._2011.contracts.BusinessNotification getBusinessNotificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.BusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.BusinessNotification)get_store().find_element_user(BUSINESSNOTIFICATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "BusinessNotification" element
     */
    public boolean isNilBusinessNotificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.BusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.BusinessNotification)get_store().find_element_user(BUSINESSNOTIFICATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "BusinessNotification" element
     */
    public int sizeOfBusinessNotificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSNOTIFICATION$0);
        }
    }
    
    /**
     * Sets array of all "BusinessNotification" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBusinessNotificationArray(com.microsoft.schemas.crm._2011.contracts.BusinessNotification[] businessNotificationArray)
    {
        check_orphaned();
        arraySetterHelper(businessNotificationArray, BUSINESSNOTIFICATION$0);
    }
    
    /**
     * Sets ith "BusinessNotification" element
     */
    public void setBusinessNotificationArray(int i, com.microsoft.schemas.crm._2011.contracts.BusinessNotification businessNotification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.BusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.BusinessNotification)get_store().find_element_user(BUSINESSNOTIFICATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(businessNotification);
        }
    }
    
    /**
     * Nils the ith "BusinessNotification" element
     */
    public void setNilBusinessNotificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.BusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.BusinessNotification)get_store().find_element_user(BUSINESSNOTIFICATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BusinessNotification" element
     */
    public com.microsoft.schemas.crm._2011.contracts.BusinessNotification insertNewBusinessNotification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.BusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.BusinessNotification)get_store().insert_element_user(BUSINESSNOTIFICATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BusinessNotification" element
     */
    public com.microsoft.schemas.crm._2011.contracts.BusinessNotification addNewBusinessNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.BusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.BusinessNotification)get_store().add_element_user(BUSINESSNOTIFICATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "BusinessNotification" element
     */
    public void removeBusinessNotification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSNOTIFICATION$0, i);
        }
    }
}
