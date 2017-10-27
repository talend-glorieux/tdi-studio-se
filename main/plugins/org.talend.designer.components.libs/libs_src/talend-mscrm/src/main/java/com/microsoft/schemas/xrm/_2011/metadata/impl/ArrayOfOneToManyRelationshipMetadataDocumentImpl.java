/*
 * An XML document type.
 * Localname: ArrayOfOneToManyRelationshipMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfOneToManyRelationshipMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfOneToManyRelationshipMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOneToManyRelationshipMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFONETOMANYRELATIONSHIPMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfOneToManyRelationshipMetadata");
    
    
    /**
     * Gets the "ArrayOfOneToManyRelationshipMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata getArrayOfOneToManyRelationshipMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata)get_store().find_element_user(ARRAYOFONETOMANYRELATIONSHIPMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfOneToManyRelationshipMetadata" element
     */
    public boolean isNilArrayOfOneToManyRelationshipMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata)get_store().find_element_user(ARRAYOFONETOMANYRELATIONSHIPMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfOneToManyRelationshipMetadata" element
     */
    public void setArrayOfOneToManyRelationshipMetadata(com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata arrayOfOneToManyRelationshipMetadata)
    {
        generatedSetterHelperImpl(arrayOfOneToManyRelationshipMetadata, ARRAYOFONETOMANYRELATIONSHIPMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfOneToManyRelationshipMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata addNewArrayOfOneToManyRelationshipMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata)get_store().add_element_user(ARRAYOFONETOMANYRELATIONSHIPMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfOneToManyRelationshipMetadata" element
     */
    public void setNilArrayOfOneToManyRelationshipMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata)get_store().find_element_user(ARRAYOFONETOMANYRELATIONSHIPMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOneToManyRelationshipMetadata)get_store().add_element_user(ARRAYOFONETOMANYRELATIONSHIPMETADATA$0);
            }
            target.setNil();
        }
    }
}
