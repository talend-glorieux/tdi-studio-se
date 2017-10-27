/*
 * An XML document type.
 * Localname: ArrayOfRelationshipMetadataBase
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBaseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ArrayOfRelationshipMetadataBase(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ArrayOfRelationshipMetadataBaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBaseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRelationshipMetadataBaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFRELATIONSHIPMETADATABASE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ArrayOfRelationshipMetadataBase");
    
    
    /**
     * Gets the "ArrayOfRelationshipMetadataBase" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase getArrayOfRelationshipMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase)get_store().find_element_user(ARRAYOFRELATIONSHIPMETADATABASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfRelationshipMetadataBase" element
     */
    public boolean isNilArrayOfRelationshipMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase)get_store().find_element_user(ARRAYOFRELATIONSHIPMETADATABASE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfRelationshipMetadataBase" element
     */
    public void setArrayOfRelationshipMetadataBase(com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase arrayOfRelationshipMetadataBase)
    {
        generatedSetterHelperImpl(arrayOfRelationshipMetadataBase, ARRAYOFRELATIONSHIPMETADATABASE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfRelationshipMetadataBase" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase addNewArrayOfRelationshipMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase)get_store().add_element_user(ARRAYOFRELATIONSHIPMETADATABASE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfRelationshipMetadataBase" element
     */
    public void setNilArrayOfRelationshipMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase)get_store().find_element_user(ARRAYOFRELATIONSHIPMETADATABASE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfRelationshipMetadataBase)get_store().add_element_user(ARRAYOFRELATIONSHIPMETADATABASE$0);
            }
            target.setNil();
        }
    }
}
