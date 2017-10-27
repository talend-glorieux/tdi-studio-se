/*
 * An XML document type.
 * Localname: ManagedPropertyMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ManagedPropertyMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ManagedPropertyMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public ManagedPropertyMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANAGEDPROPERTYMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ManagedPropertyMetadata");
    
    
    /**
     * Gets the "ManagedPropertyMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata getManagedPropertyMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata)get_store().find_element_user(MANAGEDPROPERTYMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ManagedPropertyMetadata" element
     */
    public boolean isNilManagedPropertyMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata)get_store().find_element_user(MANAGEDPROPERTYMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ManagedPropertyMetadata" element
     */
    public void setManagedPropertyMetadata(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata managedPropertyMetadata)
    {
        generatedSetterHelperImpl(managedPropertyMetadata, MANAGEDPROPERTYMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ManagedPropertyMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata addNewManagedPropertyMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata)get_store().add_element_user(MANAGEDPROPERTYMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "ManagedPropertyMetadata" element
     */
    public void setNilManagedPropertyMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata)get_store().find_element_user(MANAGEDPROPERTYMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyMetadata)get_store().add_element_user(MANAGEDPROPERTYMETADATA$0);
            }
            target.setNil();
        }
    }
}
