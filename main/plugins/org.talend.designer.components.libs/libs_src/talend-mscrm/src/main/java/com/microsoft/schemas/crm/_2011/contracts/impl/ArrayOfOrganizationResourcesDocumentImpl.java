/*
 * An XML document type.
 * Localname: ArrayOfOrganizationResources
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResourcesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfOrganizationResources(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfOrganizationResourcesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResourcesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOrganizationResourcesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFORGANIZATIONRESOURCES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfOrganizationResources");
    
    
    /**
     * Gets the "ArrayOfOrganizationResources" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources getArrayOfOrganizationResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources)get_store().find_element_user(ARRAYOFORGANIZATIONRESOURCES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfOrganizationResources" element
     */
    public boolean isNilArrayOfOrganizationResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources)get_store().find_element_user(ARRAYOFORGANIZATIONRESOURCES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfOrganizationResources" element
     */
    public void setArrayOfOrganizationResources(com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources arrayOfOrganizationResources)
    {
        generatedSetterHelperImpl(arrayOfOrganizationResources, ARRAYOFORGANIZATIONRESOURCES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfOrganizationResources" element
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
     * Nils the "ArrayOfOrganizationResources" element
     */
    public void setNilArrayOfOrganizationResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources)get_store().find_element_user(ARRAYOFORGANIZATIONRESOURCES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfOrganizationResources)get_store().add_element_user(ARRAYOFORGANIZATIONRESOURCES$0);
            }
            target.setNil();
        }
    }
}
