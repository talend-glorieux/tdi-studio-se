/*
 * An XML document type.
 * Localname: ArrayOfOptionMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfOptionMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfOptionMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOptionMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFOPTIONMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfOptionMetadata");
    
    
    /**
     * Gets the "ArrayOfOptionMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata getArrayOfOptionMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata)get_store().find_element_user(ARRAYOFOPTIONMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfOptionMetadata" element
     */
    public boolean isNilArrayOfOptionMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata)get_store().find_element_user(ARRAYOFOPTIONMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfOptionMetadata" element
     */
    public void setArrayOfOptionMetadata(com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata arrayOfOptionMetadata)
    {
        generatedSetterHelperImpl(arrayOfOptionMetadata, ARRAYOFOPTIONMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfOptionMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata addNewArrayOfOptionMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata)get_store().add_element_user(ARRAYOFOPTIONMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfOptionMetadata" element
     */
    public void setNilArrayOfOptionMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata)get_store().find_element_user(ARRAYOFOPTIONMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata)get_store().add_element_user(ARRAYOFOPTIONMETADATA$0);
            }
            target.setNil();
        }
    }
}
