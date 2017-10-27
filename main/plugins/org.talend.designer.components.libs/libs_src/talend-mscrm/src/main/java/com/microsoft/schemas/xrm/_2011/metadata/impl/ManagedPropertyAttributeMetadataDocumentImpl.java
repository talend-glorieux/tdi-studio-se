/*
 * An XML document type.
 * Localname: ManagedPropertyAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ManagedPropertyAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ManagedPropertyAttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public ManagedPropertyAttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANAGEDPROPERTYATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ManagedPropertyAttributeMetadata");
    
    
    /**
     * Gets the "ManagedPropertyAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata getManagedPropertyAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata)get_store().find_element_user(MANAGEDPROPERTYATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ManagedPropertyAttributeMetadata" element
     */
    public boolean isNilManagedPropertyAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata)get_store().find_element_user(MANAGEDPROPERTYATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ManagedPropertyAttributeMetadata" element
     */
    public void setManagedPropertyAttributeMetadata(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata managedPropertyAttributeMetadata)
    {
        generatedSetterHelperImpl(managedPropertyAttributeMetadata, MANAGEDPROPERTYATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ManagedPropertyAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata addNewManagedPropertyAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata)get_store().add_element_user(MANAGEDPROPERTYATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "ManagedPropertyAttributeMetadata" element
     */
    public void setNilManagedPropertyAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata)get_store().find_element_user(MANAGEDPROPERTYATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyAttributeMetadata)get_store().add_element_user(MANAGEDPROPERTYATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
