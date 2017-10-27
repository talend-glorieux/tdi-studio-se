/*
 * An XML document type.
 * Localname: ArrayOfEntityMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfEntityMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfEntityMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfEntityMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfEntityMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfEntityMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFENTITYMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfEntityMetadata");
    
    
    /**
     * Gets the "ArrayOfEntityMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfEntityMetadata getArrayOfEntityMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfEntityMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfEntityMetadata)get_store().find_element_user(ARRAYOFENTITYMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfEntityMetadata" element
     */
    public boolean isNilArrayOfEntityMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfEntityMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfEntityMetadata)get_store().find_element_user(ARRAYOFENTITYMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfEntityMetadata" element
     */
    public void setArrayOfEntityMetadata(com.microsoft.schemas.xrm._2011.metadata.ArrayOfEntityMetadata arrayOfEntityMetadata)
    {
        generatedSetterHelperImpl(arrayOfEntityMetadata, ARRAYOFENTITYMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfEntityMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfEntityMetadata addNewArrayOfEntityMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfEntityMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfEntityMetadata)get_store().add_element_user(ARRAYOFENTITYMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfEntityMetadata" element
     */
    public void setNilArrayOfEntityMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfEntityMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfEntityMetadata)get_store().find_element_user(ARRAYOFENTITYMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfEntityMetadata)get_store().add_element_user(ARRAYOFENTITYMETADATA$0);
            }
            target.setNil();
        }
    }
}
