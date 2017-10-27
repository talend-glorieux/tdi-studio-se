/*
 * An XML document type.
 * Localname: ArrayOfArrayOfRequiredResource
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRequiredResourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfRequiredResource(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfRequiredResourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRequiredResourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfRequiredResourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFREQUIREDRESOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfRequiredResource");
    
    
    /**
     * Gets the "ArrayOfArrayOfRequiredResource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRequiredResource getArrayOfArrayOfRequiredResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRequiredResource)get_store().find_element_user(ARRAYOFARRAYOFREQUIREDRESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfRequiredResource" element
     */
    public boolean isNilArrayOfArrayOfRequiredResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRequiredResource)get_store().find_element_user(ARRAYOFARRAYOFREQUIREDRESOURCE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfRequiredResource" element
     */
    public void setArrayOfArrayOfRequiredResource(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRequiredResource arrayOfArrayOfRequiredResource)
    {
        generatedSetterHelperImpl(arrayOfArrayOfRequiredResource, ARRAYOFARRAYOFREQUIREDRESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfRequiredResource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRequiredResource addNewArrayOfArrayOfRequiredResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRequiredResource)get_store().add_element_user(ARRAYOFARRAYOFREQUIREDRESOURCE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfRequiredResource" element
     */
    public void setNilArrayOfArrayOfRequiredResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRequiredResource)get_store().find_element_user(ARRAYOFARRAYOFREQUIREDRESOURCE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRequiredResource)get_store().add_element_user(ARRAYOFARRAYOFREQUIREDRESOURCE$0);
            }
            target.setNil();
        }
    }
}
