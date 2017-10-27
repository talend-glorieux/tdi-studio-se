/*
 * An XML document type.
 * Localname: ArrayOfArrayOfPropagationOwnershipOptions
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPropagationOwnershipOptionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfPropagationOwnershipOptions(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfPropagationOwnershipOptionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPropagationOwnershipOptionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfPropagationOwnershipOptionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfPropagationOwnershipOptions");
    
    
    /**
     * Gets the "ArrayOfArrayOfPropagationOwnershipOptions" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPropagationOwnershipOptions getArrayOfArrayOfPropagationOwnershipOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPropagationOwnershipOptions)get_store().find_element_user(ARRAYOFARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfPropagationOwnershipOptions" element
     */
    public boolean isNilArrayOfArrayOfPropagationOwnershipOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPropagationOwnershipOptions)get_store().find_element_user(ARRAYOFARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfPropagationOwnershipOptions" element
     */
    public void setArrayOfArrayOfPropagationOwnershipOptions(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPropagationOwnershipOptions arrayOfArrayOfPropagationOwnershipOptions)
    {
        generatedSetterHelperImpl(arrayOfArrayOfPropagationOwnershipOptions, ARRAYOFARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfPropagationOwnershipOptions" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPropagationOwnershipOptions addNewArrayOfArrayOfPropagationOwnershipOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPropagationOwnershipOptions)get_store().add_element_user(ARRAYOFARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfPropagationOwnershipOptions" element
     */
    public void setNilArrayOfArrayOfPropagationOwnershipOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPropagationOwnershipOptions)get_store().find_element_user(ARRAYOFARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPropagationOwnershipOptions)get_store().add_element_user(ARRAYOFARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0);
            }
            target.setNil();
        }
    }
}
