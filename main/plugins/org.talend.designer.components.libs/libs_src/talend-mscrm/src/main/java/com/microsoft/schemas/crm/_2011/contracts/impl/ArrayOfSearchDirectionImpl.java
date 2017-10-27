/*
 * XML Type:  ArrayOfSearchDirection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfSearchDirection(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfSearchDirectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSearchDirectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHDIRECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SearchDirection");
    
    
    /**
     * Gets array of all "SearchDirection" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.SearchDirection.Enum[] getSearchDirectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SEARCHDIRECTION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.SearchDirection.Enum[] result = new com.microsoft.schemas.crm._2011.contracts.SearchDirection.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.crm._2011.contracts.SearchDirection.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "SearchDirection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SearchDirection.Enum getSearchDirectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHDIRECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.crm._2011.contracts.SearchDirection.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "SearchDirection" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.SearchDirection[] xgetSearchDirectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SEARCHDIRECTION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.SearchDirection[] result = new com.microsoft.schemas.crm._2011.contracts.SearchDirection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "SearchDirection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SearchDirection xgetSearchDirectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchDirection)get_store().find_element_user(SEARCHDIRECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SearchDirection" element
     */
    public int sizeOfSearchDirectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEARCHDIRECTION$0);
        }
    }
    
    /**
     * Sets array of all "SearchDirection" element
     */
    public void setSearchDirectionArray(com.microsoft.schemas.crm._2011.contracts.SearchDirection.Enum[] searchDirectionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(searchDirectionArray, SEARCHDIRECTION$0);
        }
    }
    
    /**
     * Sets ith "SearchDirection" element
     */
    public void setSearchDirectionArray(int i, com.microsoft.schemas.crm._2011.contracts.SearchDirection.Enum searchDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHDIRECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(searchDirection);
        }
    }
    
    /**
     * Sets (as xml) array of all "SearchDirection" element
     */
    public void xsetSearchDirectionArray(com.microsoft.schemas.crm._2011.contracts.SearchDirection[]searchDirectionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(searchDirectionArray, SEARCHDIRECTION$0);
        }
    }
    
    /**
     * Sets (as xml) ith "SearchDirection" element
     */
    public void xsetSearchDirectionArray(int i, com.microsoft.schemas.crm._2011.contracts.SearchDirection searchDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchDirection)get_store().find_element_user(SEARCHDIRECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(searchDirection);
        }
    }
    
    /**
     * Inserts the value as the ith "SearchDirection" element
     */
    public void insertSearchDirection(int i, com.microsoft.schemas.crm._2011.contracts.SearchDirection.Enum searchDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SEARCHDIRECTION$0, i);
            target.setEnumValue(searchDirection);
        }
    }
    
    /**
     * Appends the value as the last "SearchDirection" element
     */
    public void addSearchDirection(com.microsoft.schemas.crm._2011.contracts.SearchDirection.Enum searchDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHDIRECTION$0);
            target.setEnumValue(searchDirection);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SearchDirection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SearchDirection insertNewSearchDirection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchDirection)get_store().insert_element_user(SEARCHDIRECTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SearchDirection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SearchDirection addNewSearchDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SearchDirection)get_store().add_element_user(SEARCHDIRECTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SearchDirection" element
     */
    public void removeSearchDirection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEARCHDIRECTION$0, i);
        }
    }
}
