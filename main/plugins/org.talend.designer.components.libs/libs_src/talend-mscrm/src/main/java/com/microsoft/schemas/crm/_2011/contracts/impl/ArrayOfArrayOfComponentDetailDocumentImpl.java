/*
 * An XML document type.
 * Localname: ArrayOfArrayOfComponentDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfComponentDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfComponentDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfComponentDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfComponentDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfComponentDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFCOMPONENTDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfComponentDetail");
    
    
    /**
     * Gets the "ArrayOfArrayOfComponentDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfComponentDetail getArrayOfArrayOfComponentDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfComponentDetail)get_store().find_element_user(ARRAYOFARRAYOFCOMPONENTDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfComponentDetail" element
     */
    public boolean isNilArrayOfArrayOfComponentDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfComponentDetail)get_store().find_element_user(ARRAYOFARRAYOFCOMPONENTDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfComponentDetail" element
     */
    public void setArrayOfArrayOfComponentDetail(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfComponentDetail arrayOfArrayOfComponentDetail)
    {
        generatedSetterHelperImpl(arrayOfArrayOfComponentDetail, ARRAYOFARRAYOFCOMPONENTDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfComponentDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfComponentDetail addNewArrayOfArrayOfComponentDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfComponentDetail)get_store().add_element_user(ARRAYOFARRAYOFCOMPONENTDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfComponentDetail" element
     */
    public void setNilArrayOfArrayOfComponentDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfComponentDetail)get_store().find_element_user(ARRAYOFARRAYOFCOMPONENTDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfComponentDetail)get_store().add_element_user(ARRAYOFARRAYOFCOMPONENTDETAIL$0);
            }
            target.setNil();
        }
    }
}
