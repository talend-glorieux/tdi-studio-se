/*
 * XML Type:  ArrayOfOrganizationResources
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfOrganizationResources(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfOrganizationResourcesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOrganizationResourcesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONRESOURCES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "OrganizationResources");
    
    
    /**
     * Gets array of all "OrganizationResources" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.OrganizationResources[] getOrganizationResourcesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONRESOURCES$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.OrganizationResources[] result = new com.microsoft.schemas.crm._2011.contracts.OrganizationResources[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganizationResources" element
     */
    public com.microsoft.schemas.crm._2011.contracts.OrganizationResources getOrganizationResourcesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.OrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.OrganizationResources)get_store().find_element_user(ORGANIZATIONRESOURCES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrganizationResources" element
     */
    public boolean isNilOrganizationResourcesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.OrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.OrganizationResources)get_store().find_element_user(ORGANIZATIONRESOURCES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrganizationResources" element
     */
    public int sizeOfOrganizationResourcesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONRESOURCES$0);
        }
    }
    
    /**
     * Sets array of all "OrganizationResources" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOrganizationResourcesArray(com.microsoft.schemas.crm._2011.contracts.OrganizationResources[] organizationResourcesArray)
    {
        check_orphaned();
        arraySetterHelper(organizationResourcesArray, ORGANIZATIONRESOURCES$0);
    }
    
    /**
     * Sets ith "OrganizationResources" element
     */
    public void setOrganizationResourcesArray(int i, com.microsoft.schemas.crm._2011.contracts.OrganizationResources organizationResources)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.OrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.OrganizationResources)get_store().find_element_user(ORGANIZATIONRESOURCES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationResources);
        }
    }
    
    /**
     * Nils the ith "OrganizationResources" element
     */
    public void setNilOrganizationResourcesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.OrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.OrganizationResources)get_store().find_element_user(ORGANIZATIONRESOURCES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationResources" element
     */
    public com.microsoft.schemas.crm._2011.contracts.OrganizationResources insertNewOrganizationResources(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.OrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.OrganizationResources)get_store().insert_element_user(ORGANIZATIONRESOURCES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationResources" element
     */
    public com.microsoft.schemas.crm._2011.contracts.OrganizationResources addNewOrganizationResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.OrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.OrganizationResources)get_store().add_element_user(ORGANIZATIONRESOURCES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganizationResources" element
     */
    public void removeOrganizationResources(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONRESOURCES$0, i);
        }
    }
}
