/*
 * An XML document type.
 * Localname: ArrayOfArrayOfAppointmentsToIgnore
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnoreDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfAppointmentsToIgnore(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfAppointmentsToIgnoreDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnoreDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfAppointmentsToIgnoreDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFAPPOINTMENTSTOIGNORE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfAppointmentsToIgnore");
    
    
    /**
     * Gets the "ArrayOfArrayOfAppointmentsToIgnore" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore getArrayOfArrayOfAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore)get_store().find_element_user(ARRAYOFARRAYOFAPPOINTMENTSTOIGNORE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfAppointmentsToIgnore" element
     */
    public boolean isNilArrayOfArrayOfAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore)get_store().find_element_user(ARRAYOFARRAYOFAPPOINTMENTSTOIGNORE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfAppointmentsToIgnore" element
     */
    public void setArrayOfArrayOfAppointmentsToIgnore(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore arrayOfArrayOfAppointmentsToIgnore)
    {
        generatedSetterHelperImpl(arrayOfArrayOfAppointmentsToIgnore, ARRAYOFARRAYOFAPPOINTMENTSTOIGNORE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfAppointmentsToIgnore" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore addNewArrayOfArrayOfAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore)get_store().add_element_user(ARRAYOFARRAYOFAPPOINTMENTSTOIGNORE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfAppointmentsToIgnore" element
     */
    public void setNilArrayOfArrayOfAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore)get_store().find_element_user(ARRAYOFARRAYOFAPPOINTMENTSTOIGNORE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentsToIgnore)get_store().add_element_user(ARRAYOFARRAYOFAPPOINTMENTSTOIGNORE$0);
            }
            target.setNil();
        }
    }
}
