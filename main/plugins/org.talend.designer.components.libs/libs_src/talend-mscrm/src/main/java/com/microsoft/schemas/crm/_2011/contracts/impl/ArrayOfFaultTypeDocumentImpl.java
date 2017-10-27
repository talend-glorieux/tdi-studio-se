/*
 * An XML document type.
 * Localname: ArrayOfFaultType
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfFaultType(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfFaultTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfFaultTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFFAULTTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfFaultType");
    
    
    /**
     * Gets the "ArrayOfFaultType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType getArrayOfFaultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType)get_store().find_element_user(ARRAYOFFAULTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfFaultType" element
     */
    public boolean isNilArrayOfFaultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType)get_store().find_element_user(ARRAYOFFAULTTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfFaultType" element
     */
    public void setArrayOfFaultType(com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType arrayOfFaultType)
    {
        generatedSetterHelperImpl(arrayOfFaultType, ARRAYOFFAULTTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfFaultType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType addNewArrayOfFaultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType)get_store().add_element_user(ARRAYOFFAULTTYPE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfFaultType" element
     */
    public void setNilArrayOfFaultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType)get_store().find_element_user(ARRAYOFFAULTTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfFaultType)get_store().add_element_user(ARRAYOFFAULTTYPE$0);
            }
            target.setNil();
        }
    }
}
