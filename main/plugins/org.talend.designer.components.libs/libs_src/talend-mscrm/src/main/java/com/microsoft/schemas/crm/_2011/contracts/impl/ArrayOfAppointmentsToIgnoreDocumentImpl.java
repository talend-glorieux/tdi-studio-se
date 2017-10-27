/*
 * An XML document type.
 * Localname: ArrayOfAppointmentsToIgnore
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnoreDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfAppointmentsToIgnore(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfAppointmentsToIgnoreDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnoreDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAppointmentsToIgnoreDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFAPPOINTMENTSTOIGNORE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAppointmentsToIgnore");
    
    
    /**
     * Gets the "ArrayOfAppointmentsToIgnore" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore getArrayOfAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore)get_store().find_element_user(ARRAYOFAPPOINTMENTSTOIGNORE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfAppointmentsToIgnore" element
     */
    public boolean isNilArrayOfAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore)get_store().find_element_user(ARRAYOFAPPOINTMENTSTOIGNORE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfAppointmentsToIgnore" element
     */
    public void setArrayOfAppointmentsToIgnore(com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore arrayOfAppointmentsToIgnore)
    {
        generatedSetterHelperImpl(arrayOfAppointmentsToIgnore, ARRAYOFAPPOINTMENTSTOIGNORE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfAppointmentsToIgnore" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore addNewArrayOfAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore)get_store().add_element_user(ARRAYOFAPPOINTMENTSTOIGNORE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfAppointmentsToIgnore" element
     */
    public void setNilArrayOfAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore)get_store().find_element_user(ARRAYOFAPPOINTMENTSTOIGNORE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentsToIgnore)get_store().add_element_user(ARRAYOFAPPOINTMENTSTOIGNORE$0);
            }
            target.setNil();
        }
    }
}
