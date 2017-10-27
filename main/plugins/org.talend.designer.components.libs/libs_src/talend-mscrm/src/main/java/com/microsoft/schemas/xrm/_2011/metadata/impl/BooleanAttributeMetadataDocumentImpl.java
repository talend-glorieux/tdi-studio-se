/*
 * An XML document type.
 * Localname: BooleanAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.BooleanAttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one BooleanAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class BooleanAttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.BooleanAttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public BooleanAttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOOLEANATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "BooleanAttributeMetadata");
    
    
    /**
     * Gets the "BooleanAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.BooleanAttributeMetadata getBooleanAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.BooleanAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.BooleanAttributeMetadata)get_store().find_element_user(BOOLEANATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "BooleanAttributeMetadata" element
     */
    public boolean isNilBooleanAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.BooleanAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.BooleanAttributeMetadata)get_store().find_element_user(BOOLEANATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "BooleanAttributeMetadata" element
     */
    public void setBooleanAttributeMetadata(com.microsoft.schemas.xrm._2011.metadata.BooleanAttributeMetadata booleanAttributeMetadata)
    {
        generatedSetterHelperImpl(booleanAttributeMetadata, BOOLEANATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BooleanAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.BooleanAttributeMetadata addNewBooleanAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.BooleanAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.BooleanAttributeMetadata)get_store().add_element_user(BOOLEANATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "BooleanAttributeMetadata" element
     */
    public void setNilBooleanAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.BooleanAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.BooleanAttributeMetadata)get_store().find_element_user(BOOLEANATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.BooleanAttributeMetadata)get_store().add_element_user(BOOLEANATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
