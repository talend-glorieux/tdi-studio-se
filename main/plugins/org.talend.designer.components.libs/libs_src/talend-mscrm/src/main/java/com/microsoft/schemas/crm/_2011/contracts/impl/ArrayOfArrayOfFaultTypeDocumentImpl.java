/*
 * An XML document type.
 * Localname: ArrayOfArrayOfFaultType
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfFaultTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfFaultType(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfFaultTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfFaultTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfFaultTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFFAULTTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfFaultType");
    
    
    /**
     * Gets the "ArrayOfArrayOfFaultType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfFaultType getArrayOfArrayOfFaultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfFaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfFaultType)get_store().find_element_user(ARRAYOFARRAYOFFAULTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfFaultType" element
     */
    public boolean isNilArrayOfArrayOfFaultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfFaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfFaultType)get_store().find_element_user(ARRAYOFARRAYOFFAULTTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfFaultType" element
     */
    public void setArrayOfArrayOfFaultType(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfFaultType arrayOfArrayOfFaultType)
    {
        generatedSetterHelperImpl(arrayOfArrayOfFaultType, ARRAYOFARRAYOFFAULTTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfFaultType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfFaultType addNewArrayOfArrayOfFaultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfFaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfFaultType)get_store().add_element_user(ARRAYOFARRAYOFFAULTTYPE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfFaultType" element
     */
    public void setNilArrayOfArrayOfFaultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfFaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfFaultType)get_store().find_element_user(ARRAYOFARRAYOFFAULTTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfFaultType)get_store().add_element_user(ARRAYOFARRAYOFFAULTTYPE$0);
            }
            target.setNil();
        }
    }
}
