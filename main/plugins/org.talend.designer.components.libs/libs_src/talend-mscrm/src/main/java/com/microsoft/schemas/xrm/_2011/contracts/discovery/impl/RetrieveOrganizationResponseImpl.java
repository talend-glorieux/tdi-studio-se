/*
 * XML Type:  RetrieveOrganizationResponse
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * An XML RetrieveOrganizationResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery).
 *
 * This is a complex type.
 */
public class RetrieveOrganizationResponseImpl extends com.microsoft.schemas.xrm._2011.contracts.discovery.impl.DiscoveryResponseImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationResponse
{
    private static final long serialVersionUID = 1L;
    
    public RetrieveOrganizationResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "Detail");
    
    
    /**
     * Gets the "Detail" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail getDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail)get_store().find_element_user(DETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Detail" element
     */
    public boolean isNilDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail)get_store().find_element_user(DETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Detail" element
     */
    public boolean isSetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAIL$0) != 0;
        }
    }
    
    /**
     * Sets the "Detail" element
     */
    public void setDetail(com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail detail)
    {
        generatedSetterHelperImpl(detail, DETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Detail" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail addNewDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail)get_store().add_element_user(DETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "Detail" element
     */
    public void setNilDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail)get_store().find_element_user(DETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail)get_store().add_element_user(DETAIL$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Detail" element
     */
    public void unsetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAIL$0, 0);
        }
    }
}
