/*
 * An XML document type.
 * Localname: ArrayOfManyToManyRelationshipMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfManyToManyRelationshipMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfManyToManyRelationshipMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfManyToManyRelationshipMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFMANYTOMANYRELATIONSHIPMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfManyToManyRelationshipMetadata");
    
    
    /**
     * Gets the "ArrayOfManyToManyRelationshipMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata getArrayOfManyToManyRelationshipMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata)get_store().find_element_user(ARRAYOFMANYTOMANYRELATIONSHIPMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfManyToManyRelationshipMetadata" element
     */
    public boolean isNilArrayOfManyToManyRelationshipMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata)get_store().find_element_user(ARRAYOFMANYTOMANYRELATIONSHIPMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfManyToManyRelationshipMetadata" element
     */
    public void setArrayOfManyToManyRelationshipMetadata(com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata arrayOfManyToManyRelationshipMetadata)
    {
        generatedSetterHelperImpl(arrayOfManyToManyRelationshipMetadata, ARRAYOFMANYTOMANYRELATIONSHIPMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfManyToManyRelationshipMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata addNewArrayOfManyToManyRelationshipMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata)get_store().add_element_user(ARRAYOFMANYTOMANYRELATIONSHIPMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfManyToManyRelationshipMetadata" element
     */
    public void setNilArrayOfManyToManyRelationshipMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata)get_store().find_element_user(ARRAYOFMANYTOMANYRELATIONSHIPMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfManyToManyRelationshipMetadata)get_store().add_element_user(ARRAYOFMANYTOMANYRELATIONSHIPMETADATA$0);
            }
            target.setNil();
        }
    }
}
