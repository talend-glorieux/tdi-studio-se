/*
 * XML Type:  ArrayOfArrayOfBusinessNotification
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBusinessNotification
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfBusinessNotification(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfBusinessNotificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBusinessNotification
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfBusinessNotificationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFBUSINESSNOTIFICATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfBusinessNotification");
    
    
    /**
     * Gets array of all "ArrayOfBusinessNotification" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification[] getArrayOfBusinessNotificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFBUSINESSNOTIFICATION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfBusinessNotification" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification getArrayOfBusinessNotificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification)get_store().find_element_user(ARRAYOFBUSINESSNOTIFICATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfBusinessNotification" element
     */
    public boolean isNilArrayOfBusinessNotificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification)get_store().find_element_user(ARRAYOFBUSINESSNOTIFICATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfBusinessNotification" element
     */
    public int sizeOfArrayOfBusinessNotificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFBUSINESSNOTIFICATION$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfBusinessNotification" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfBusinessNotificationArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification[] arrayOfBusinessNotificationArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfBusinessNotificationArray, ARRAYOFBUSINESSNOTIFICATION$0);
    }
    
    /**
     * Sets ith "ArrayOfBusinessNotification" element
     */
    public void setArrayOfBusinessNotificationArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification arrayOfBusinessNotification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification)get_store().find_element_user(ARRAYOFBUSINESSNOTIFICATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfBusinessNotification);
        }
    }
    
    /**
     * Nils the ith "ArrayOfBusinessNotification" element
     */
    public void setNilArrayOfBusinessNotificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification)get_store().find_element_user(ARRAYOFBUSINESSNOTIFICATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfBusinessNotification" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification insertNewArrayOfBusinessNotification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification)get_store().insert_element_user(ARRAYOFBUSINESSNOTIFICATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfBusinessNotification" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification addNewArrayOfBusinessNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification)get_store().add_element_user(ARRAYOFBUSINESSNOTIFICATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfBusinessNotification" element
     */
    public void removeArrayOfBusinessNotification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFBUSINESSNOTIFICATION$0, i);
        }
    }
}
