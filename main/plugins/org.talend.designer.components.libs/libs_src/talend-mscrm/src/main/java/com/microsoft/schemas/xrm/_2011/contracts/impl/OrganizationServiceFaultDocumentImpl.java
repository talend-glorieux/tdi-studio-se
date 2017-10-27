/*
 * An XML document type.
 * Localname: OrganizationServiceFault
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one OrganizationServiceFault(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class OrganizationServiceFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationServiceFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONSERVICEFAULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "OrganizationServiceFault");
    
    
    /**
     * Gets the "OrganizationServiceFault" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault getOrganizationServiceFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault)get_store().find_element_user(ORGANIZATIONSERVICEFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationServiceFault" element
     */
    public boolean isNilOrganizationServiceFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault)get_store().find_element_user(ORGANIZATIONSERVICEFAULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationServiceFault" element
     */
    public void setOrganizationServiceFault(com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault organizationServiceFault)
    {
        generatedSetterHelperImpl(organizationServiceFault, ORGANIZATIONSERVICEFAULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrganizationServiceFault" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault addNewOrganizationServiceFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault)get_store().add_element_user(ORGANIZATIONSERVICEFAULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrganizationServiceFault" element
     */
    public void setNilOrganizationServiceFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault)get_store().find_element_user(ORGANIZATIONSERVICEFAULT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault)get_store().add_element_user(ORGANIZATIONSERVICEFAULT$0);
            }
            target.setNil();
        }
    }
}
