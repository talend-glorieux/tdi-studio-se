/*
 * XML Type:  ArrayOfArrayOfOrganizationResources
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfOrganizationResources
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfOrganizationResources(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfOrganizationResourcesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfOrganizationResources
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfOrganizationResourcesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFORGANIZATIONRESOURCES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfOrganizationResources");
    
    
    /**
     * Gets array of all "ArrayOfOrganizationResources" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources[] getArrayOfOrganizationResourcesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFORGANIZATIONRESOURCES$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfOrganizationResources" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources getArrayOfOrganizationResourcesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources)get_store().find_element_user(ARRAYOFORGANIZATIONRESOURCES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfOrganizationResources" element
     */
    public boolean isNilArrayOfOrganizationResourcesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources)get_store().find_element_user(ARRAYOFORGANIZATIONRESOURCES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfOrganizationResources" element
     */
    public int sizeOfArrayOfOrganizationResourcesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFORGANIZATIONRESOURCES$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfOrganizationResources" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfOrganizationResourcesArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources[] arrayOfOrganizationResourcesArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfOrganizationResourcesArray, ARRAYOFORGANIZATIONRESOURCES$0);
    }
    
    /**
     * Sets ith "ArrayOfOrganizationResources" element
     */
    public void setArrayOfOrganizationResourcesArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources arrayOfOrganizationResources)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources)get_store().find_element_user(ARRAYOFORGANIZATIONRESOURCES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfOrganizationResources);
        }
    }
    
    /**
     * Nils the ith "ArrayOfOrganizationResources" element
     */
    public void setNilArrayOfOrganizationResourcesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources)get_store().find_element_user(ARRAYOFORGANIZATIONRESOURCES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfOrganizationResources" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources insertNewArrayOfOrganizationResources(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources)get_store().insert_element_user(ARRAYOFORGANIZATIONRESOURCES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfOrganizationResources" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources addNewArrayOfOrganizationResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources)get_store().add_element_user(ARRAYOFORGANIZATIONRESOURCES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfOrganizationResources" element
     */
    public void removeArrayOfOrganizationResources(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFORGANIZATIONRESOURCES$0, i);
        }
    }
}
