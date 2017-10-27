/*
 * An XML document type.
 * Localname: ArrayOfRequiredResource
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfRequiredResource(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfRequiredResourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRequiredResourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFREQUIREDRESOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfRequiredResource");
    
    
    /**
     * Gets the "ArrayOfRequiredResource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource getArrayOfRequiredResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource)get_store().find_element_user(ARRAYOFREQUIREDRESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfRequiredResource" element
     */
    public boolean isNilArrayOfRequiredResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource)get_store().find_element_user(ARRAYOFREQUIREDRESOURCE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfRequiredResource" element
     */
    public void setArrayOfRequiredResource(com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource arrayOfRequiredResource)
    {
        generatedSetterHelperImpl(arrayOfRequiredResource, ARRAYOFREQUIREDRESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfRequiredResource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource addNewArrayOfRequiredResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource)get_store().add_element_user(ARRAYOFREQUIREDRESOURCE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfRequiredResource" element
     */
    public void setNilArrayOfRequiredResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource)get_store().find_element_user(ARRAYOFREQUIREDRESOURCE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRequiredResource)get_store().add_element_user(ARRAYOFREQUIREDRESOURCE$0);
            }
            target.setNil();
        }
    }
}
