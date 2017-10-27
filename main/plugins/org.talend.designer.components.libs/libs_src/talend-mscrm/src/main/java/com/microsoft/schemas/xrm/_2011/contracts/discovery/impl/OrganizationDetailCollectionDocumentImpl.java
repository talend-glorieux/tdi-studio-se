/*
 * An XML document type.
 * Localname: OrganizationDetailCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * A document containing one OrganizationDetailCollection(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery) element.
 *
 * This is a complex type.
 */
public class OrganizationDetailCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationDetailCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONDETAILCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "OrganizationDetailCollection");
    
    
    /**
     * Gets the "OrganizationDetailCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection getOrganizationDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection)get_store().find_element_user(ORGANIZATIONDETAILCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationDetailCollection" element
     */
    public boolean isNilOrganizationDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection)get_store().find_element_user(ORGANIZATIONDETAILCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationDetailCollection" element
     */
    public void setOrganizationDetailCollection(com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection organizationDetailCollection)
    {
        generatedSetterHelperImpl(organizationDetailCollection, ORGANIZATIONDETAILCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrganizationDetailCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection addNewOrganizationDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection)get_store().add_element_user(ORGANIZATIONDETAILCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrganizationDetailCollection" element
     */
    public void setNilOrganizationDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection)get_store().find_element_user(ORGANIZATIONDETAILCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetailCollection)get_store().add_element_user(ORGANIZATIONDETAILCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
