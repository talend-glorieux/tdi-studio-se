/*
 * An XML document type.
 * Localname: ArrayOfArrayOfBulkOperationSource
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBulkOperationSourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfBulkOperationSource(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfBulkOperationSourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBulkOperationSourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfBulkOperationSourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFBULKOPERATIONSOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfBulkOperationSource");
    
    
    /**
     * Gets the "ArrayOfArrayOfBulkOperationSource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBulkOperationSource getArrayOfArrayOfBulkOperationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBulkOperationSource)get_store().find_element_user(ARRAYOFARRAYOFBULKOPERATIONSOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfBulkOperationSource" element
     */
    public boolean isNilArrayOfArrayOfBulkOperationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBulkOperationSource)get_store().find_element_user(ARRAYOFARRAYOFBULKOPERATIONSOURCE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfBulkOperationSource" element
     */
    public void setArrayOfArrayOfBulkOperationSource(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBulkOperationSource arrayOfArrayOfBulkOperationSource)
    {
        generatedSetterHelperImpl(arrayOfArrayOfBulkOperationSource, ARRAYOFARRAYOFBULKOPERATIONSOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfBulkOperationSource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBulkOperationSource addNewArrayOfArrayOfBulkOperationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBulkOperationSource)get_store().add_element_user(ARRAYOFARRAYOFBULKOPERATIONSOURCE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfBulkOperationSource" element
     */
    public void setNilArrayOfArrayOfBulkOperationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBulkOperationSource)get_store().find_element_user(ARRAYOFARRAYOFBULKOPERATIONSOURCE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBulkOperationSource)get_store().add_element_user(ARRAYOFARRAYOFBULKOPERATIONSOURCE$0);
            }
            target.setNil();
        }
    }
}
