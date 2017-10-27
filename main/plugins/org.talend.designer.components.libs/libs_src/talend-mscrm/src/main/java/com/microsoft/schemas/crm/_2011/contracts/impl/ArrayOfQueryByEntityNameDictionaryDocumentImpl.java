/*
 * An XML document type.
 * Localname: ArrayOfQueryByEntityNameDictionary
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionaryDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfQueryByEntityNameDictionary(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfQueryByEntityNameDictionaryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionaryDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfQueryByEntityNameDictionaryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFQUERYBYENTITYNAMEDICTIONARY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfQueryByEntityNameDictionary");
    
    
    /**
     * Gets the "ArrayOfQueryByEntityNameDictionary" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary getArrayOfQueryByEntityNameDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary)get_store().find_element_user(ARRAYOFQUERYBYENTITYNAMEDICTIONARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfQueryByEntityNameDictionary" element
     */
    public boolean isNilArrayOfQueryByEntityNameDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary)get_store().find_element_user(ARRAYOFQUERYBYENTITYNAMEDICTIONARY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfQueryByEntityNameDictionary" element
     */
    public void setArrayOfQueryByEntityNameDictionary(com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary arrayOfQueryByEntityNameDictionary)
    {
        generatedSetterHelperImpl(arrayOfQueryByEntityNameDictionary, ARRAYOFQUERYBYENTITYNAMEDICTIONARY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfQueryByEntityNameDictionary" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary addNewArrayOfQueryByEntityNameDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary)get_store().add_element_user(ARRAYOFQUERYBYENTITYNAMEDICTIONARY$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfQueryByEntityNameDictionary" element
     */
    public void setNilArrayOfQueryByEntityNameDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary)get_store().find_element_user(ARRAYOFQUERYBYENTITYNAMEDICTIONARY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfQueryByEntityNameDictionary)get_store().add_element_user(ARRAYOFQUERYBYENTITYNAMEDICTIONARY$0);
            }
            target.setNil();
        }
    }
}
