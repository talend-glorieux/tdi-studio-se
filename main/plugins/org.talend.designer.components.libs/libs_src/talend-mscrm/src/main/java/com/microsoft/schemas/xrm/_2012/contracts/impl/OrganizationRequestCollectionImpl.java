/*
 * XML Type:  OrganizationRequestCollection
 * Namespace: http://schemas.microsoft.com/xrm/2012/Contracts
 * Java type: com.microsoft.schemas.xrm._2012.contracts.OrganizationRequestCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2012.contracts.impl;
/**
 * An XML OrganizationRequestCollection(@http://schemas.microsoft.com/xrm/2012/Contracts).
 *
 * This is a complex type.
 */
public class OrganizationRequestCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2012.contracts.OrganizationRequestCollection
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationRequestCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2012/Contracts", "OrganizationRequest");
    
    
    /**
     * Gets array of all "OrganizationRequest" elements
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest[] getOrganizationRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONREQUEST$0, targetList);
            com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest[] result = new com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganizationRequest" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest getOrganizationRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest)get_store().find_element_user(ORGANIZATIONREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrganizationRequest" element
     */
    public boolean isNilOrganizationRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest)get_store().find_element_user(ORGANIZATIONREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrganizationRequest" element
     */
    public int sizeOfOrganizationRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONREQUEST$0);
        }
    }
    
    /**
     * Sets array of all "OrganizationRequest" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOrganizationRequestArray(com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest[] organizationRequestArray)
    {
        check_orphaned();
        arraySetterHelper(organizationRequestArray, ORGANIZATIONREQUEST$0);
    }
    
    /**
     * Sets ith "OrganizationRequest" element
     */
    public void setOrganizationRequestArray(int i, com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest organizationRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest)get_store().find_element_user(ORGANIZATIONREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationRequest);
        }
    }
    
    /**
     * Nils the ith "OrganizationRequest" element
     */
    public void setNilOrganizationRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest)get_store().find_element_user(ORGANIZATIONREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationRequest" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest insertNewOrganizationRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest)get_store().insert_element_user(ORGANIZATIONREQUEST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationRequest" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest addNewOrganizationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest)get_store().add_element_user(ORGANIZATIONREQUEST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganizationRequest" element
     */
    public void removeOrganizationRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONREQUEST$0, i);
        }
    }
}
