/*
 * An XML document type.
 * Localname: ArrayOfInputArgumentCollection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfInputArgumentCollection(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfInputArgumentCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfInputArgumentCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFINPUTARGUMENTCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfInputArgumentCollection");
    
    
    /**
     * Gets the "ArrayOfInputArgumentCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection getArrayOfInputArgumentCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection)get_store().find_element_user(ARRAYOFINPUTARGUMENTCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfInputArgumentCollection" element
     */
    public boolean isNilArrayOfInputArgumentCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection)get_store().find_element_user(ARRAYOFINPUTARGUMENTCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfInputArgumentCollection" element
     */
    public void setArrayOfInputArgumentCollection(com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection arrayOfInputArgumentCollection)
    {
        generatedSetterHelperImpl(arrayOfInputArgumentCollection, ARRAYOFINPUTARGUMENTCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfInputArgumentCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection addNewArrayOfInputArgumentCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection)get_store().add_element_user(ARRAYOFINPUTARGUMENTCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfInputArgumentCollection" element
     */
    public void setNilArrayOfInputArgumentCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection)get_store().find_element_user(ARRAYOFINPUTARGUMENTCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection)get_store().add_element_user(ARRAYOFINPUTARGUMENTCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
