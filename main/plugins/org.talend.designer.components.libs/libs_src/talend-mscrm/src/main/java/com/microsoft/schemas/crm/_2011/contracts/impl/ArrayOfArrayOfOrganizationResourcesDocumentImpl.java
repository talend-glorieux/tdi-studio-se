/*
 * An XML document type.
 * Localname: ArrayOfArrayOfOrganizationResources
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfOrganizationResourcesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfOrganizationResources(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfOrganizationResourcesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfOrganizationResourcesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfOrganizationResourcesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFORGANIZATIONRESOURCES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfOrganizationResources");
    
    
    /**
     * Gets the "ArrayOfArrayOfOrganizationResources" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfOrganizationResources getArrayOfArrayOfOrganizationResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfOrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfOrganizationResources)get_store().find_element_user(ARRAYOFARRAYOFORGANIZATIONRESOURCES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfOrganizationResources" element
     */
    public boolean isNilArrayOfArrayOfOrganizationResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfOrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfOrganizationResources)get_store().find_element_user(ARRAYOFARRAYOFORGANIZATIONRESOURCES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfOrganizationResources" element
     */
    public void setArrayOfArrayOfOrganizationResources(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfOrganizationResources arrayOfArrayOfOrganizationResources)
    {
        generatedSetterHelperImpl(arrayOfArrayOfOrganizationResources, ARRAYOFARRAYOFORGANIZATIONRESOURCES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfOrganizationResources" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfOrganizationResources addNewArrayOfArrayOfOrganizationResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfOrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfOrganizationResources)get_store().add_element_user(ARRAYOFARRAYOFORGANIZATIONRESOURCES$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfOrganizationResources" element
     */
    public void setNilArrayOfArrayOfOrganizationResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfOrganizationResources target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfOrganizationResources)get_store().find_element_user(ARRAYOFARRAYOFORGANIZATIONRESOURCES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfOrganizationResources)get_store().add_element_user(ARRAYOFARRAYOFORGANIZATIONRESOURCES$0);
            }
            target.setNil();
        }
    }
}
