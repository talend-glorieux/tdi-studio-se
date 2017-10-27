/*
 * An XML document type.
 * Localname: ArrayOfArrayOfMissingComponent
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfMissingComponentDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfMissingComponent(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfMissingComponentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfMissingComponentDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfMissingComponentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFMISSINGCOMPONENT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfMissingComponent");
    
    
    /**
     * Gets the "ArrayOfArrayOfMissingComponent" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfMissingComponent getArrayOfArrayOfMissingComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfMissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfMissingComponent)get_store().find_element_user(ARRAYOFARRAYOFMISSINGCOMPONENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfMissingComponent" element
     */
    public boolean isNilArrayOfArrayOfMissingComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfMissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfMissingComponent)get_store().find_element_user(ARRAYOFARRAYOFMISSINGCOMPONENT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfMissingComponent" element
     */
    public void setArrayOfArrayOfMissingComponent(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfMissingComponent arrayOfArrayOfMissingComponent)
    {
        generatedSetterHelperImpl(arrayOfArrayOfMissingComponent, ARRAYOFARRAYOFMISSINGCOMPONENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfMissingComponent" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfMissingComponent addNewArrayOfArrayOfMissingComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfMissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfMissingComponent)get_store().add_element_user(ARRAYOFARRAYOFMISSINGCOMPONENT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfMissingComponent" element
     */
    public void setNilArrayOfArrayOfMissingComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfMissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfMissingComponent)get_store().find_element_user(ARRAYOFARRAYOFMISSINGCOMPONENT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfMissingComponent)get_store().add_element_user(ARRAYOFARRAYOFMISSINGCOMPONENT$0);
            }
            target.setNil();
        }
    }
}
