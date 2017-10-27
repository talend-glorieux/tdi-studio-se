/*
 * An XML document type.
 * Localname: ArrayOfErrorInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfErrorInfo(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfErrorInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfErrorInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFERRORINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfErrorInfo");
    
    
    /**
     * Gets the "ArrayOfErrorInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo getArrayOfErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo)get_store().find_element_user(ARRAYOFERRORINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfErrorInfo" element
     */
    public boolean isNilArrayOfErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo)get_store().find_element_user(ARRAYOFERRORINFO$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfErrorInfo" element
     */
    public void setArrayOfErrorInfo(com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo arrayOfErrorInfo)
    {
        generatedSetterHelperImpl(arrayOfErrorInfo, ARRAYOFERRORINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfErrorInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo addNewArrayOfErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo)get_store().add_element_user(ARRAYOFERRORINFO$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfErrorInfo" element
     */
    public void setNilArrayOfErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo)get_store().find_element_user(ARRAYOFERRORINFO$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfErrorInfo)get_store().add_element_user(ARRAYOFERRORINFO$0);
            }
            target.setNil();
        }
    }
}
