/*
 * An XML document type.
 * Localname: ArrayOfComponentDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfComponentDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfComponentDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfComponentDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFCOMPONENTDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfComponentDetail");
    
    
    /**
     * Gets the "ArrayOfComponentDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail getArrayOfComponentDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail)get_store().find_element_user(ARRAYOFCOMPONENTDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfComponentDetail" element
     */
    public boolean isNilArrayOfComponentDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail)get_store().find_element_user(ARRAYOFCOMPONENTDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfComponentDetail" element
     */
    public void setArrayOfComponentDetail(com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail arrayOfComponentDetail)
    {
        generatedSetterHelperImpl(arrayOfComponentDetail, ARRAYOFCOMPONENTDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfComponentDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail addNewArrayOfComponentDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail)get_store().add_element_user(ARRAYOFCOMPONENTDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfComponentDetail" element
     */
    public void setNilArrayOfComponentDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail)get_store().find_element_user(ARRAYOFCOMPONENTDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfComponentDetail)get_store().add_element_user(ARRAYOFCOMPONENTDETAIL$0);
            }
            target.setNil();
        }
    }
}
