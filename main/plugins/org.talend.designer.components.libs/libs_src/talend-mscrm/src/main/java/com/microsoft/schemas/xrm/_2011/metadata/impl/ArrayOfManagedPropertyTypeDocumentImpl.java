/*
 * An XML document type.
 * Localname: ArrayOfManagedPropertyType
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfManagedPropertyType(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfManagedPropertyTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfManagedPropertyTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFMANAGEDPROPERTYTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfManagedPropertyType");
    
    
    /**
     * Gets the "ArrayOfManagedPropertyType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyType getArrayOfManagedPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyType)get_store().find_element_user(ARRAYOFMANAGEDPROPERTYTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfManagedPropertyType" element
     */
    public boolean isNilArrayOfManagedPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyType)get_store().find_element_user(ARRAYOFMANAGEDPROPERTYTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfManagedPropertyType" element
     */
    public void setArrayOfManagedPropertyType(com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyType arrayOfManagedPropertyType)
    {
        generatedSetterHelperImpl(arrayOfManagedPropertyType, ARRAYOFMANAGEDPROPERTYTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfManagedPropertyType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyType addNewArrayOfManagedPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyType)get_store().add_element_user(ARRAYOFMANAGEDPROPERTYTYPE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfManagedPropertyType" element
     */
    public void setNilArrayOfManagedPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyType)get_store().find_element_user(ARRAYOFMANAGEDPROPERTYTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyType)get_store().add_element_user(ARRAYOFMANAGEDPROPERTYTYPE$0);
            }
            target.setNil();
        }
    }
}
