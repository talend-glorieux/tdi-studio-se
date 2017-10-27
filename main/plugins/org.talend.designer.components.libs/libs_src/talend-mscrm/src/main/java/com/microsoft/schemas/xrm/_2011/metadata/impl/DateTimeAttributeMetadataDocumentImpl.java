/*
 * An XML document type.
 * Localname: DateTimeAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.DateTimeAttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one DateTimeAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class DateTimeAttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.DateTimeAttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public DateTimeAttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATETIMEATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "DateTimeAttributeMetadata");
    
    
    /**
     * Gets the "DateTimeAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.DateTimeAttributeMetadata getDateTimeAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DateTimeAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeAttributeMetadata)get_store().find_element_user(DATETIMEATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DateTimeAttributeMetadata" element
     */
    public boolean isNilDateTimeAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DateTimeAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeAttributeMetadata)get_store().find_element_user(DATETIMEATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DateTimeAttributeMetadata" element
     */
    public void setDateTimeAttributeMetadata(com.microsoft.schemas.xrm._2011.metadata.DateTimeAttributeMetadata dateTimeAttributeMetadata)
    {
        generatedSetterHelperImpl(dateTimeAttributeMetadata, DATETIMEATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DateTimeAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.DateTimeAttributeMetadata addNewDateTimeAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DateTimeAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeAttributeMetadata)get_store().add_element_user(DATETIMEATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "DateTimeAttributeMetadata" element
     */
    public void setNilDateTimeAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DateTimeAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeAttributeMetadata)get_store().find_element_user(DATETIMEATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.DateTimeAttributeMetadata)get_store().add_element_user(DATETIMEATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
