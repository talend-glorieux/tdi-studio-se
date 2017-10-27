/*
 * An XML document type.
 * Localname: ArrayOfPropagationOwnershipOptions
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfPropagationOwnershipOptions(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfPropagationOwnershipOptionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfPropagationOwnershipOptionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfPropagationOwnershipOptions");
    
    
    /**
     * Gets the "ArrayOfPropagationOwnershipOptions" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions getArrayOfPropagationOwnershipOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions)get_store().find_element_user(ARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfPropagationOwnershipOptions" element
     */
    public boolean isNilArrayOfPropagationOwnershipOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions)get_store().find_element_user(ARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfPropagationOwnershipOptions" element
     */
    public void setArrayOfPropagationOwnershipOptions(com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions arrayOfPropagationOwnershipOptions)
    {
        generatedSetterHelperImpl(arrayOfPropagationOwnershipOptions, ARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfPropagationOwnershipOptions" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions addNewArrayOfPropagationOwnershipOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions)get_store().add_element_user(ARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfPropagationOwnershipOptions" element
     */
    public void setNilArrayOfPropagationOwnershipOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions)get_store().find_element_user(ARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions)get_store().add_element_user(ARRAYOFPROPAGATIONOWNERSHIPOPTIONS$0);
            }
            target.setNil();
        }
    }
}
