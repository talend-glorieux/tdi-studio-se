/*
 * An XML document type.
 * Localname: ArrayOfAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfAttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfAttributeMetadata");
    
    
    /**
     * Gets the "ArrayOfAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata getArrayOfAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata)get_store().find_element_user(ARRAYOFATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfAttributeMetadata" element
     */
    public boolean isNilArrayOfAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata)get_store().find_element_user(ARRAYOFATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfAttributeMetadata" element
     */
    public void setArrayOfAttributeMetadata(com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata arrayOfAttributeMetadata)
    {
        generatedSetterHelperImpl(arrayOfAttributeMetadata, ARRAYOFATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata addNewArrayOfAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata)get_store().add_element_user(ARRAYOFATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfAttributeMetadata" element
     */
    public void setNilArrayOfAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata)get_store().find_element_user(ARRAYOFATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfAttributeMetadata)get_store().add_element_user(ARRAYOFATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
