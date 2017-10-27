/*
 * An XML document type.
 * Localname: OrganizationRequestCollection
 * Namespace: http://schemas.microsoft.com/xrm/2012/Contracts
 * Java type: com.microsoft.schemas.xrm._2012.contracts.OrganizationRequestCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2012.contracts.impl;
/**
 * A document containing one OrganizationRequestCollection(@http://schemas.microsoft.com/xrm/2012/Contracts) element.
 *
 * This is a complex type.
 */
public class OrganizationRequestCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2012.contracts.OrganizationRequestCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationRequestCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONREQUESTCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2012/Contracts", "OrganizationRequestCollection");
    
    
    /**
     * Gets the "OrganizationRequestCollection" element
     */
    public com.microsoft.schemas.xrm._2012.contracts.OrganizationRequestCollection getOrganizationRequestCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2012.contracts.OrganizationRequestCollection target = null;
            target = (com.microsoft.schemas.xrm._2012.contracts.OrganizationRequestCollection)get_store().find_element_user(ORGANIZATIONREQUESTCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationRequestCollection" element
     */
    public boolean isNilOrganizationRequestCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2012.contracts.OrganizationRequestCollection target = null;
            target = (com.microsoft.schemas.xrm._2012.contracts.OrganizationRequestCollection)get_store().find_element_user(ORGANIZATIONREQUESTCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationRequestCollection" element
     */
    public void setOrganizationRequestCollection(com.microsoft.schemas.xrm._2012.contracts.OrganizationRequestCollection organizationRequestCollection)
    {
        generatedSetterHelperImpl(organizationRequestCollection, ORGANIZATIONREQUESTCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrganizationRequestCollection" element
     */
    public com.microsoft.schemas.xrm._2012.contracts.OrganizationRequestCollection addNewOrganizationRequestCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2012.contracts.OrganizationRequestCollection target = null;
            target = (com.microsoft.schemas.xrm._2012.contracts.OrganizationRequestCollection)get_store().add_element_user(ORGANIZATIONREQUESTCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrganizationRequestCollection" element
     */
    public void setNilOrganizationRequestCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2012.contracts.OrganizationRequestCollection target = null;
            target = (com.microsoft.schemas.xrm._2012.contracts.OrganizationRequestCollection)get_store().find_element_user(ORGANIZATIONREQUESTCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2012.contracts.OrganizationRequestCollection)get_store().add_element_user(ORGANIZATIONREQUESTCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
