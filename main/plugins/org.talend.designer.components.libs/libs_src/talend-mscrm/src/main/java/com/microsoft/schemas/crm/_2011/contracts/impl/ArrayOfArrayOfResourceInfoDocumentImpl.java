/*
 * An XML document type.
 * Localname: ArrayOfArrayOfResourceInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResourceInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfResourceInfo(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfResourceInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResourceInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfResourceInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFRESOURCEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfResourceInfo");
    
    
    /**
     * Gets the "ArrayOfArrayOfResourceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResourceInfo getArrayOfArrayOfResourceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResourceInfo)get_store().find_element_user(ARRAYOFARRAYOFRESOURCEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfResourceInfo" element
     */
    public boolean isNilArrayOfArrayOfResourceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResourceInfo)get_store().find_element_user(ARRAYOFARRAYOFRESOURCEINFO$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfResourceInfo" element
     */
    public void setArrayOfArrayOfResourceInfo(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResourceInfo arrayOfArrayOfResourceInfo)
    {
        generatedSetterHelperImpl(arrayOfArrayOfResourceInfo, ARRAYOFARRAYOFRESOURCEINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfResourceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResourceInfo addNewArrayOfArrayOfResourceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResourceInfo)get_store().add_element_user(ARRAYOFARRAYOFRESOURCEINFO$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfResourceInfo" element
     */
    public void setNilArrayOfArrayOfResourceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResourceInfo)get_store().find_element_user(ARRAYOFARRAYOFRESOURCEINFO$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResourceInfo)get_store().add_element_user(ARRAYOFARRAYOFRESOURCEINFO$0);
            }
            target.setNil();
        }
    }
}
