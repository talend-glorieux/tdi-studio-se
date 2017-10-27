/*
 * An XML document type.
 * Localname: ArrayOfArrayOfInputArgumentCollection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfInputArgumentCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfInputArgumentCollection(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfInputArgumentCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfInputArgumentCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfInputArgumentCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFINPUTARGUMENTCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfInputArgumentCollection");
    
    
    /**
     * Gets the "ArrayOfArrayOfInputArgumentCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfInputArgumentCollection getArrayOfArrayOfInputArgumentCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfInputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfInputArgumentCollection)get_store().find_element_user(ARRAYOFARRAYOFINPUTARGUMENTCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfInputArgumentCollection" element
     */
    public boolean isNilArrayOfArrayOfInputArgumentCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfInputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfInputArgumentCollection)get_store().find_element_user(ARRAYOFARRAYOFINPUTARGUMENTCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfInputArgumentCollection" element
     */
    public void setArrayOfArrayOfInputArgumentCollection(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfInputArgumentCollection arrayOfArrayOfInputArgumentCollection)
    {
        generatedSetterHelperImpl(arrayOfArrayOfInputArgumentCollection, ARRAYOFARRAYOFINPUTARGUMENTCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfInputArgumentCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfInputArgumentCollection addNewArrayOfArrayOfInputArgumentCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfInputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfInputArgumentCollection)get_store().add_element_user(ARRAYOFARRAYOFINPUTARGUMENTCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfInputArgumentCollection" element
     */
    public void setNilArrayOfArrayOfInputArgumentCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfInputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfInputArgumentCollection)get_store().find_element_user(ARRAYOFARRAYOFINPUTARGUMENTCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfInputArgumentCollection)get_store().add_element_user(ARRAYOFARRAYOFINPUTARGUMENTCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
