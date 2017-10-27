/*
 * An XML document type.
 * Localname: ArrayOfMissingComponent
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponentDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfMissingComponent(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfMissingComponentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponentDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfMissingComponentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFMISSINGCOMPONENT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfMissingComponent");
    
    
    /**
     * Gets the "ArrayOfMissingComponent" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent getArrayOfMissingComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent)get_store().find_element_user(ARRAYOFMISSINGCOMPONENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfMissingComponent" element
     */
    public boolean isNilArrayOfMissingComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent)get_store().find_element_user(ARRAYOFMISSINGCOMPONENT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfMissingComponent" element
     */
    public void setArrayOfMissingComponent(com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent arrayOfMissingComponent)
    {
        generatedSetterHelperImpl(arrayOfMissingComponent, ARRAYOFMISSINGCOMPONENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfMissingComponent" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent addNewArrayOfMissingComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent)get_store().add_element_user(ARRAYOFMISSINGCOMPONENT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfMissingComponent" element
     */
    public void setNilArrayOfMissingComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent)get_store().find_element_user(ARRAYOFMISSINGCOMPONENT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent)get_store().add_element_user(ARRAYOFMISSINGCOMPONENT$0);
            }
            target.setNil();
        }
    }
}
