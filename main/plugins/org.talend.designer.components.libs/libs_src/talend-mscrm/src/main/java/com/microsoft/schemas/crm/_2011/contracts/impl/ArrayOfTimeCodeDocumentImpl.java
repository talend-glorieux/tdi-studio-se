/*
 * An XML document type.
 * Localname: ArrayOfTimeCode
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfTimeCode(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfTimeCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfTimeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFTIMECODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfTimeCode");
    
    
    /**
     * Gets the "ArrayOfTimeCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode getArrayOfTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode)get_store().find_element_user(ARRAYOFTIMECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfTimeCode" element
     */
    public boolean isNilArrayOfTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode)get_store().find_element_user(ARRAYOFTIMECODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfTimeCode" element
     */
    public void setArrayOfTimeCode(com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode arrayOfTimeCode)
    {
        generatedSetterHelperImpl(arrayOfTimeCode, ARRAYOFTIMECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfTimeCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode addNewArrayOfTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode)get_store().add_element_user(ARRAYOFTIMECODE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfTimeCode" element
     */
    public void setNilArrayOfTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode)get_store().find_element_user(ARRAYOFTIMECODE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfTimeCode)get_store().add_element_user(ARRAYOFTIMECODE$0);
            }
            target.setNil();
        }
    }
}
