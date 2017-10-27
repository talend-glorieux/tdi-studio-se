/*
 * An XML document type.
 * Localname: ArrayOfArrayOfErrorInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfErrorInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfErrorInfo(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfErrorInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfErrorInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfErrorInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFERRORINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfErrorInfo");
    
    
    /**
     * Gets the "ArrayOfArrayOfErrorInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfErrorInfo getArrayOfArrayOfErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfErrorInfo)get_store().find_element_user(ARRAYOFARRAYOFERRORINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfErrorInfo" element
     */
    public boolean isNilArrayOfArrayOfErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfErrorInfo)get_store().find_element_user(ARRAYOFARRAYOFERRORINFO$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfErrorInfo" element
     */
    public void setArrayOfArrayOfErrorInfo(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfErrorInfo arrayOfArrayOfErrorInfo)
    {
        generatedSetterHelperImpl(arrayOfArrayOfErrorInfo, ARRAYOFARRAYOFERRORINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfErrorInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfErrorInfo addNewArrayOfArrayOfErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfErrorInfo)get_store().add_element_user(ARRAYOFARRAYOFERRORINFO$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfErrorInfo" element
     */
    public void setNilArrayOfArrayOfErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfErrorInfo)get_store().find_element_user(ARRAYOFARRAYOFERRORINFO$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfErrorInfo)get_store().add_element_user(ARRAYOFARRAYOFERRORINFO$0);
            }
            target.setNil();
        }
    }
}
