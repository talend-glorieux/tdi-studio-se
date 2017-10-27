/*
 * An XML document type.
 * Localname: ArrayOfManagedPropertyOperation
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyOperationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfManagedPropertyOperation(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfManagedPropertyOperationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyOperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfManagedPropertyOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFMANAGEDPROPERTYOPERATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfManagedPropertyOperation");
    
    
    /**
     * Gets the "ArrayOfManagedPropertyOperation" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyOperation getArrayOfManagedPropertyOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyOperation target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyOperation)get_store().find_element_user(ARRAYOFMANAGEDPROPERTYOPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfManagedPropertyOperation" element
     */
    public boolean isNilArrayOfManagedPropertyOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyOperation target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyOperation)get_store().find_element_user(ARRAYOFMANAGEDPROPERTYOPERATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfManagedPropertyOperation" element
     */
    public void setArrayOfManagedPropertyOperation(com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyOperation arrayOfManagedPropertyOperation)
    {
        generatedSetterHelperImpl(arrayOfManagedPropertyOperation, ARRAYOFMANAGEDPROPERTYOPERATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfManagedPropertyOperation" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyOperation addNewArrayOfManagedPropertyOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyOperation target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyOperation)get_store().add_element_user(ARRAYOFMANAGEDPROPERTYOPERATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfManagedPropertyOperation" element
     */
    public void setNilArrayOfManagedPropertyOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyOperation target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyOperation)get_store().find_element_user(ARRAYOFMANAGEDPROPERTYOPERATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyOperation)get_store().add_element_user(ARRAYOFMANAGEDPROPERTYOPERATION$0);
            }
            target.setNil();
        }
    }
}
