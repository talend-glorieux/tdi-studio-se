/*
 * An XML document type.
 * Localname: ArrayOfArrayOfSearchDirection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchDirectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfSearchDirection(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfSearchDirectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchDirectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfSearchDirectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFSEARCHDIRECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfSearchDirection");
    
    
    /**
     * Gets the "ArrayOfArrayOfSearchDirection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchDirection getArrayOfArrayOfSearchDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchDirection)get_store().find_element_user(ARRAYOFARRAYOFSEARCHDIRECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfSearchDirection" element
     */
    public boolean isNilArrayOfArrayOfSearchDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchDirection)get_store().find_element_user(ARRAYOFARRAYOFSEARCHDIRECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfSearchDirection" element
     */
    public void setArrayOfArrayOfSearchDirection(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchDirection arrayOfArrayOfSearchDirection)
    {
        generatedSetterHelperImpl(arrayOfArrayOfSearchDirection, ARRAYOFARRAYOFSEARCHDIRECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfSearchDirection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchDirection addNewArrayOfArrayOfSearchDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchDirection)get_store().add_element_user(ARRAYOFARRAYOFSEARCHDIRECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfSearchDirection" element
     */
    public void setNilArrayOfArrayOfSearchDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchDirection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchDirection)get_store().find_element_user(ARRAYOFARRAYOFSEARCHDIRECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSearchDirection)get_store().add_element_user(ARRAYOFARRAYOFSEARCHDIRECTION$0);
            }
            target.setNil();
        }
    }
}
