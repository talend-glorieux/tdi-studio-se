/*
 * An XML document type.
 * Localname: ArrayOfValidationResult
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfValidationResult(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfValidationResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfValidationResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFVALIDATIONRESULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfValidationResult");
    
    
    /**
     * Gets the "ArrayOfValidationResult" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult getArrayOfValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult)get_store().find_element_user(ARRAYOFVALIDATIONRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfValidationResult" element
     */
    public boolean isNilArrayOfValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult)get_store().find_element_user(ARRAYOFVALIDATIONRESULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfValidationResult" element
     */
    public void setArrayOfValidationResult(com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult arrayOfValidationResult)
    {
        generatedSetterHelperImpl(arrayOfValidationResult, ARRAYOFVALIDATIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfValidationResult" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult addNewArrayOfValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult)get_store().add_element_user(ARRAYOFVALIDATIONRESULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfValidationResult" element
     */
    public void setNilArrayOfValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult)get_store().find_element_user(ARRAYOFVALIDATIONRESULT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfValidationResult)get_store().add_element_user(ARRAYOFVALIDATIONRESULT$0);
            }
            target.setNil();
        }
    }
}
