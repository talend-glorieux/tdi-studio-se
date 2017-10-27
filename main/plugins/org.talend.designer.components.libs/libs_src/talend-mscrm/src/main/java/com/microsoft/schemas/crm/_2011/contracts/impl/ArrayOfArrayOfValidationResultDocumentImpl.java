/*
 * An XML document type.
 * Localname: ArrayOfArrayOfValidationResult
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfValidationResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfValidationResult(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfValidationResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfValidationResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfValidationResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFVALIDATIONRESULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfValidationResult");
    
    
    /**
     * Gets the "ArrayOfArrayOfValidationResult" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfValidationResult getArrayOfArrayOfValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfValidationResult)get_store().find_element_user(ARRAYOFARRAYOFVALIDATIONRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfValidationResult" element
     */
    public boolean isNilArrayOfArrayOfValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfValidationResult)get_store().find_element_user(ARRAYOFARRAYOFVALIDATIONRESULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfValidationResult" element
     */
    public void setArrayOfArrayOfValidationResult(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfValidationResult arrayOfArrayOfValidationResult)
    {
        generatedSetterHelperImpl(arrayOfArrayOfValidationResult, ARRAYOFARRAYOFVALIDATIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfValidationResult" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfValidationResult addNewArrayOfArrayOfValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfValidationResult)get_store().add_element_user(ARRAYOFARRAYOFVALIDATIONRESULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfValidationResult" element
     */
    public void setNilArrayOfArrayOfValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfValidationResult)get_store().find_element_user(ARRAYOFARRAYOFVALIDATIONRESULT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfValidationResult)get_store().add_element_user(ARRAYOFARRAYOFVALIDATIONRESULT$0);
            }
            target.setNil();
        }
    }
}
