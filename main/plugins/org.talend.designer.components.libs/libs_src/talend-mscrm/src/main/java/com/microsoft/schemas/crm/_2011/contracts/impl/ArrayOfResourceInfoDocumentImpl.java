/*
 * An XML document type.
 * Localname: ArrayOfResourceInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfResourceInfo(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfResourceInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfResourceInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFRESOURCEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfResourceInfo");
    
    
    /**
     * Gets the "ArrayOfResourceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo getArrayOfResourceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo)get_store().find_element_user(ARRAYOFRESOURCEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfResourceInfo" element
     */
    public boolean isNilArrayOfResourceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo)get_store().find_element_user(ARRAYOFRESOURCEINFO$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfResourceInfo" element
     */
    public void setArrayOfResourceInfo(com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo arrayOfResourceInfo)
    {
        generatedSetterHelperImpl(arrayOfResourceInfo, ARRAYOFRESOURCEINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfResourceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo addNewArrayOfResourceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo)get_store().add_element_user(ARRAYOFRESOURCEINFO$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfResourceInfo" element
     */
    public void setNilArrayOfResourceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo)get_store().find_element_user(ARRAYOFRESOURCEINFO$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResourceInfo)get_store().add_element_user(ARRAYOFRESOURCEINFO$0);
            }
            target.setNil();
        }
    }
}
