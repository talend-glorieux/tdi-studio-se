/*
 * An XML document type.
 * Localname: ArrayOfEntitySource
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfEntitySource(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfEntitySourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfEntitySourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFENTITYSOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfEntitySource");
    
    
    /**
     * Gets the "ArrayOfEntitySource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource getArrayOfEntitySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource)get_store().find_element_user(ARRAYOFENTITYSOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfEntitySource" element
     */
    public boolean isNilArrayOfEntitySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource)get_store().find_element_user(ARRAYOFENTITYSOURCE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfEntitySource" element
     */
    public void setArrayOfEntitySource(com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource arrayOfEntitySource)
    {
        generatedSetterHelperImpl(arrayOfEntitySource, ARRAYOFENTITYSOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfEntitySource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource addNewArrayOfEntitySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource)get_store().add_element_user(ARRAYOFENTITYSOURCE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfEntitySource" element
     */
    public void setNilArrayOfEntitySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource)get_store().find_element_user(ARRAYOFENTITYSOURCE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfEntitySource)get_store().add_element_user(ARRAYOFENTITYSOURCE$0);
            }
            target.setNil();
        }
    }
}
