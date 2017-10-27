/*
 * An XML document type.
 * Localname: ArrayOfManagedPropertyMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfManagedPropertyMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfManagedPropertyMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfManagedPropertyMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFMANAGEDPROPERTYMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfManagedPropertyMetadata");
    
    
    /**
     * Gets the "ArrayOfManagedPropertyMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyMetadata getArrayOfManagedPropertyMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyMetadata)get_store().find_element_user(ARRAYOFMANAGEDPROPERTYMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfManagedPropertyMetadata" element
     */
    public boolean isNilArrayOfManagedPropertyMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyMetadata)get_store().find_element_user(ARRAYOFMANAGEDPROPERTYMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfManagedPropertyMetadata" element
     */
    public void setArrayOfManagedPropertyMetadata(com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyMetadata arrayOfManagedPropertyMetadata)
    {
        generatedSetterHelperImpl(arrayOfManagedPropertyMetadata, ARRAYOFMANAGEDPROPERTYMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfManagedPropertyMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyMetadata addNewArrayOfManagedPropertyMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyMetadata)get_store().add_element_user(ARRAYOFMANAGEDPROPERTYMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfManagedPropertyMetadata" element
     */
    public void setNilArrayOfManagedPropertyMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyMetadata)get_store().find_element_user(ARRAYOFMANAGEDPROPERTYMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyMetadata)get_store().add_element_user(ARRAYOFMANAGEDPROPERTYMETADATA$0);
            }
            target.setNil();
        }
    }
}
