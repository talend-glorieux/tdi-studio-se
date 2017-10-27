/*
 * An XML document type.
 * Localname: ArrayOfArrayOfTimeCode
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfTimeCode(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfTimeCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfTimeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFTIMECODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfTimeCode");
    
    
    /**
     * Gets the "ArrayOfArrayOfTimeCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeCode getArrayOfArrayOfTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeCode)get_store().find_element_user(ARRAYOFARRAYOFTIMECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfTimeCode" element
     */
    public boolean isNilArrayOfArrayOfTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeCode)get_store().find_element_user(ARRAYOFARRAYOFTIMECODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfTimeCode" element
     */
    public void setArrayOfArrayOfTimeCode(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeCode arrayOfArrayOfTimeCode)
    {
        generatedSetterHelperImpl(arrayOfArrayOfTimeCode, ARRAYOFARRAYOFTIMECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfTimeCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeCode addNewArrayOfArrayOfTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeCode)get_store().add_element_user(ARRAYOFARRAYOFTIMECODE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfTimeCode" element
     */
    public void setNilArrayOfArrayOfTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeCode)get_store().find_element_user(ARRAYOFARRAYOFTIMECODE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfTimeCode)get_store().add_element_user(ARRAYOFARRAYOFTIMECODE$0);
            }
            target.setNil();
        }
    }
}
