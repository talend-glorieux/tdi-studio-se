/*
 * An XML document type.
 * Localname: ArrayOfSearchDirection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfSearchDirection(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfSearchDirectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSearchDirectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSEARCHDIRECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfSearchDirection");
    
    
    /**
     * Gets the "ArrayOfSearchDirection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection getArrayOfSearchDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection)get_store().find_element_user(ARRAYOFSEARCHDIRECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfSearchDirection" element
     */
    public boolean isNilArrayOfSearchDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection)get_store().find_element_user(ARRAYOFSEARCHDIRECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfSearchDirection" element
     */
    public void setArrayOfSearchDirection(com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection arrayOfSearchDirection)
    {
        generatedSetterHelperImpl(arrayOfSearchDirection, ARRAYOFSEARCHDIRECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfSearchDirection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection addNewArrayOfSearchDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection)get_store().add_element_user(ARRAYOFSEARCHDIRECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfSearchDirection" element
     */
    public void setNilArrayOfSearchDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection)get_store().find_element_user(ARRAYOFSEARCHDIRECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSearchDirection)get_store().add_element_user(ARRAYOFSEARCHDIRECTION$0);
            }
            target.setNil();
        }
    }
}
