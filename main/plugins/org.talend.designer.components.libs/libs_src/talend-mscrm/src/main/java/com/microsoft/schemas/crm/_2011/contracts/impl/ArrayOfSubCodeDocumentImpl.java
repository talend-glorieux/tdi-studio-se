/*
 * An XML document type.
 * Localname: ArrayOfSubCode
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfSubCode(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfSubCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSubCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSUBCODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfSubCode");
    
    
    /**
     * Gets the "ArrayOfSubCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode getArrayOfSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode)get_store().find_element_user(ARRAYOFSUBCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfSubCode" element
     */
    public boolean isNilArrayOfSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode)get_store().find_element_user(ARRAYOFSUBCODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfSubCode" element
     */
    public void setArrayOfSubCode(com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode arrayOfSubCode)
    {
        generatedSetterHelperImpl(arrayOfSubCode, ARRAYOFSUBCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfSubCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode addNewArrayOfSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode)get_store().add_element_user(ARRAYOFSUBCODE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfSubCode" element
     */
    public void setNilArrayOfSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode)get_store().find_element_user(ARRAYOFSUBCODE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode)get_store().add_element_user(ARRAYOFSUBCODE$0);
            }
            target.setNil();
        }
    }
}
