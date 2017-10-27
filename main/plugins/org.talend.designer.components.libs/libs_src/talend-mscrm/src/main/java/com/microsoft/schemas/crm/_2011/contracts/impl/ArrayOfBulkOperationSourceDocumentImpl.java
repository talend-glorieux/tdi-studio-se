/*
 * An XML document type.
 * Localname: ArrayOfBulkOperationSource
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfBulkOperationSource(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfBulkOperationSourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfBulkOperationSourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFBULKOPERATIONSOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfBulkOperationSource");
    
    
    /**
     * Gets the "ArrayOfBulkOperationSource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource getArrayOfBulkOperationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource)get_store().find_element_user(ARRAYOFBULKOPERATIONSOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfBulkOperationSource" element
     */
    public boolean isNilArrayOfBulkOperationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource)get_store().find_element_user(ARRAYOFBULKOPERATIONSOURCE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfBulkOperationSource" element
     */
    public void setArrayOfBulkOperationSource(com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource arrayOfBulkOperationSource)
    {
        generatedSetterHelperImpl(arrayOfBulkOperationSource, ARRAYOFBULKOPERATIONSOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfBulkOperationSource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource addNewArrayOfBulkOperationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource)get_store().add_element_user(ARRAYOFBULKOPERATIONSOURCE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfBulkOperationSource" element
     */
    public void setNilArrayOfBulkOperationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource)get_store().find_element_user(ARRAYOFBULKOPERATIONSOURCE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBulkOperationSource)get_store().add_element_user(ARRAYOFBULKOPERATIONSOURCE$0);
            }
            target.setNil();
        }
    }
}
