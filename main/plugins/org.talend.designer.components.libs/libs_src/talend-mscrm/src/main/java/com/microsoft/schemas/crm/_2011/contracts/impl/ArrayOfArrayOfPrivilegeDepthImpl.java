/*
 * XML Type:  ArrayOfArrayOfPrivilegeDepth
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrivilegeDepth
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfPrivilegeDepth(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfPrivilegeDepthImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrivilegeDepth
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfPrivilegeDepthImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPRIVILEGEDEPTH$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfPrivilegeDepth");
    
    
    /**
     * Gets array of all "ArrayOfPrivilegeDepth" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth[] getArrayOfPrivilegeDepthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFPRIVILEGEDEPTH$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfPrivilegeDepth" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth getArrayOfPrivilegeDepthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth)get_store().find_element_user(ARRAYOFPRIVILEGEDEPTH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfPrivilegeDepth" element
     */
    public boolean isNilArrayOfPrivilegeDepthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth)get_store().find_element_user(ARRAYOFPRIVILEGEDEPTH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfPrivilegeDepth" element
     */
    public int sizeOfArrayOfPrivilegeDepthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFPRIVILEGEDEPTH$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfPrivilegeDepth" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfPrivilegeDepthArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth[] arrayOfPrivilegeDepthArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfPrivilegeDepthArray, ARRAYOFPRIVILEGEDEPTH$0);
    }
    
    /**
     * Sets ith "ArrayOfPrivilegeDepth" element
     */
    public void setArrayOfPrivilegeDepthArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth arrayOfPrivilegeDepth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth)get_store().find_element_user(ARRAYOFPRIVILEGEDEPTH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfPrivilegeDepth);
        }
    }
    
    /**
     * Nils the ith "ArrayOfPrivilegeDepth" element
     */
    public void setNilArrayOfPrivilegeDepthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth)get_store().find_element_user(ARRAYOFPRIVILEGEDEPTH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfPrivilegeDepth" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth insertNewArrayOfPrivilegeDepth(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth)get_store().insert_element_user(ARRAYOFPRIVILEGEDEPTH$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfPrivilegeDepth" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth addNewArrayOfPrivilegeDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth)get_store().add_element_user(ARRAYOFPRIVILEGEDEPTH$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfPrivilegeDepth" element
     */
    public void removeArrayOfPrivilegeDepth(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFPRIVILEGEDEPTH$0, i);
        }
    }
}
