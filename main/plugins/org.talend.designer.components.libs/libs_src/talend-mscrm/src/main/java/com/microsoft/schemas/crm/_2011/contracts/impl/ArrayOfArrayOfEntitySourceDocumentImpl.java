/*
 * An XML document type.
 * Localname: ArrayOfArrayOfEntitySource
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfEntitySourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfEntitySource(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfEntitySourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfEntitySourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfEntitySourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFENTITYSOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfEntitySource");
    
    
    /**
     * Gets the "ArrayOfArrayOfEntitySource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfEntitySource getArrayOfArrayOfEntitySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfEntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfEntitySource)get_store().find_element_user(ARRAYOFARRAYOFENTITYSOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfEntitySource" element
     */
    public boolean isNilArrayOfArrayOfEntitySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfEntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfEntitySource)get_store().find_element_user(ARRAYOFARRAYOFENTITYSOURCE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfEntitySource" element
     */
    public void setArrayOfArrayOfEntitySource(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfEntitySource arrayOfArrayOfEntitySource)
    {
        generatedSetterHelperImpl(arrayOfArrayOfEntitySource, ARRAYOFARRAYOFENTITYSOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfEntitySource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfEntitySource addNewArrayOfArrayOfEntitySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfEntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfEntitySource)get_store().add_element_user(ARRAYOFARRAYOFENTITYSOURCE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfEntitySource" element
     */
    public void setNilArrayOfArrayOfEntitySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfEntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfEntitySource)get_store().find_element_user(ARRAYOFARRAYOFENTITYSOURCE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfEntitySource)get_store().add_element_user(ARRAYOFARRAYOFENTITYSOURCE$0);
            }
            target.setNil();
        }
    }
}
