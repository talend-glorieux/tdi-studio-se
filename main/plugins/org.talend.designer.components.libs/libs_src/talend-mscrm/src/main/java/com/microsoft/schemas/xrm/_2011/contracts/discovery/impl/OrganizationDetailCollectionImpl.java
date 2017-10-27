/*
 * XML Type:  OrganizationDetailCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * An XML OrganizationDetailCollection(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery).
 *
 * This is a complex type.
 */
public class OrganizationDetailCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationDetailCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "OrganizationDetail");
    
    
    /**
     * Gets array of all "OrganizationDetail" elements
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail[] getOrganizationDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONDETAIL$0, targetList);
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail[] result = new com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganizationDetail" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail getOrganizationDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail)get_store().find_element_user(ORGANIZATIONDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrganizationDetail" element
     */
    public boolean isNilOrganizationDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail)get_store().find_element_user(ORGANIZATIONDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrganizationDetail" element
     */
    public int sizeOfOrganizationDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "OrganizationDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOrganizationDetailArray(com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail[] organizationDetailArray)
    {
        check_orphaned();
        arraySetterHelper(organizationDetailArray, ORGANIZATIONDETAIL$0);
    }
    
    /**
     * Sets ith "OrganizationDetail" element
     */
    public void setOrganizationDetailArray(int i, com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail organizationDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail)get_store().find_element_user(ORGANIZATIONDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationDetail);
        }
    }
    
    /**
     * Nils the ith "OrganizationDetail" element
     */
    public void setNilOrganizationDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail)get_store().find_element_user(ORGANIZATIONDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationDetail" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail insertNewOrganizationDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail)get_store().insert_element_user(ORGANIZATIONDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationDetail" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail addNewOrganizationDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail)get_store().add_element_user(ORGANIZATIONDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganizationDetail" element
     */
    public void removeOrganizationDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONDETAIL$0, i);
        }
    }
}
