/*
 * An XML document type.
 * Localname: ArrayOfArrayOfQueryByEntityNameDictionary
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionaryDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfQueryByEntityNameDictionary(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfQueryByEntityNameDictionaryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionaryDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfQueryByEntityNameDictionaryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFQUERYBYENTITYNAMEDICTIONARY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfQueryByEntityNameDictionary");
    
    
    /**
     * Gets the "ArrayOfArrayOfQueryByEntityNameDictionary" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary getArrayOfArrayOfQueryByEntityNameDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary)get_store().find_element_user(ARRAYOFARRAYOFQUERYBYENTITYNAMEDICTIONARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfQueryByEntityNameDictionary" element
     */
    public boolean isNilArrayOfArrayOfQueryByEntityNameDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary)get_store().find_element_user(ARRAYOFARRAYOFQUERYBYENTITYNAMEDICTIONARY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfQueryByEntityNameDictionary" element
     */
    public void setArrayOfArrayOfQueryByEntityNameDictionary(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary arrayOfArrayOfQueryByEntityNameDictionary)
    {
        generatedSetterHelperImpl(arrayOfArrayOfQueryByEntityNameDictionary, ARRAYOFARRAYOFQUERYBYENTITYNAMEDICTIONARY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfQueryByEntityNameDictionary" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary addNewArrayOfArrayOfQueryByEntityNameDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary)get_store().add_element_user(ARRAYOFARRAYOFQUERYBYENTITYNAMEDICTIONARY$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfQueryByEntityNameDictionary" element
     */
    public void setNilArrayOfArrayOfQueryByEntityNameDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary)get_store().find_element_user(ARRAYOFARRAYOFQUERYBYENTITYNAMEDICTIONARY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfQueryByEntityNameDictionary)get_store().add_element_user(ARRAYOFARRAYOFQUERYBYENTITYNAMEDICTIONARY$0);
            }
            target.setNil();
        }
    }
}
