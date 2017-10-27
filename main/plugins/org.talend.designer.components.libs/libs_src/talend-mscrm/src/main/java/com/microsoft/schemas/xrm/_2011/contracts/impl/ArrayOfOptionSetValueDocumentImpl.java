/*
 * An XML document type.
 * Localname: ArrayOfOptionSetValue
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ArrayOfOptionSetValueDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one ArrayOfOptionSetValue(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfOptionSetValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ArrayOfOptionSetValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOptionSetValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFOPTIONSETVALUE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ArrayOfOptionSetValue");
    
    
    /**
     * Gets the "ArrayOfOptionSetValue" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfOptionSetValue getArrayOfOptionSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfOptionSetValue target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOptionSetValue)get_store().find_element_user(ARRAYOFOPTIONSETVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfOptionSetValue" element
     */
    public boolean isNilArrayOfOptionSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfOptionSetValue target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOptionSetValue)get_store().find_element_user(ARRAYOFOPTIONSETVALUE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfOptionSetValue" element
     */
    public void setArrayOfOptionSetValue(com.microsoft.schemas.xrm._2011.contracts.ArrayOfOptionSetValue arrayOfOptionSetValue)
    {
        generatedSetterHelperImpl(arrayOfOptionSetValue, ARRAYOFOPTIONSETVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfOptionSetValue" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfOptionSetValue addNewArrayOfOptionSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfOptionSetValue target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOptionSetValue)get_store().add_element_user(ARRAYOFOPTIONSETVALUE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfOptionSetValue" element
     */
    public void setNilArrayOfOptionSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfOptionSetValue target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOptionSetValue)get_store().find_element_user(ARRAYOFOPTIONSETVALUE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOptionSetValue)get_store().add_element_user(ARRAYOFOPTIONSETVALUE$0);
            }
            target.setNil();
        }
    }
}
