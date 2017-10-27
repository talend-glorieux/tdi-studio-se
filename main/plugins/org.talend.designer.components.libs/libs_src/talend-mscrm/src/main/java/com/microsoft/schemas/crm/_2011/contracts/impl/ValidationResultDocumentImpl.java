/*
 * An XML document type.
 * Localname: ValidationResult
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ValidationResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ValidationResult(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ValidationResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ValidationResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValidationResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATIONRESULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ValidationResult");
    
    
    /**
     * Gets the "ValidationResult" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ValidationResult getValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ValidationResult)get_store().find_element_user(VALIDATIONRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ValidationResult" element
     */
    public boolean isNilValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ValidationResult)get_store().find_element_user(VALIDATIONRESULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ValidationResult" element
     */
    public void setValidationResult(com.microsoft.schemas.crm._2011.contracts.ValidationResult validationResult)
    {
        generatedSetterHelperImpl(validationResult, VALIDATIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ValidationResult" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ValidationResult addNewValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ValidationResult)get_store().add_element_user(VALIDATIONRESULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ValidationResult" element
     */
    public void setNilValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ValidationResult target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ValidationResult)get_store().find_element_user(VALIDATIONRESULT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ValidationResult)get_store().add_element_user(VALIDATIONRESULT$0);
            }
            target.setNil();
        }
    }
}
