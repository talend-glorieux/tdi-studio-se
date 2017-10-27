/*
 * An XML document type.
 * Localname: ArrayOfArrayOfPrincipalAccess
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrincipalAccessDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfPrincipalAccess(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfPrincipalAccessDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrincipalAccessDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfPrincipalAccessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFPRINCIPALACCESS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfPrincipalAccess");
    
    
    /**
     * Gets the "ArrayOfArrayOfPrincipalAccess" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrincipalAccess getArrayOfArrayOfPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrincipalAccess)get_store().find_element_user(ARRAYOFARRAYOFPRINCIPALACCESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfPrincipalAccess" element
     */
    public boolean isNilArrayOfArrayOfPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrincipalAccess)get_store().find_element_user(ARRAYOFARRAYOFPRINCIPALACCESS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfPrincipalAccess" element
     */
    public void setArrayOfArrayOfPrincipalAccess(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrincipalAccess arrayOfArrayOfPrincipalAccess)
    {
        generatedSetterHelperImpl(arrayOfArrayOfPrincipalAccess, ARRAYOFARRAYOFPRINCIPALACCESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfPrincipalAccess" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrincipalAccess addNewArrayOfArrayOfPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrincipalAccess)get_store().add_element_user(ARRAYOFARRAYOFPRINCIPALACCESS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfPrincipalAccess" element
     */
    public void setNilArrayOfArrayOfPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrincipalAccess)get_store().find_element_user(ARRAYOFARRAYOFPRINCIPALACCESS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfPrincipalAccess)get_store().add_element_user(ARRAYOFARRAYOFPRINCIPALACCESS$0);
            }
            target.setNil();
        }
    }
}
