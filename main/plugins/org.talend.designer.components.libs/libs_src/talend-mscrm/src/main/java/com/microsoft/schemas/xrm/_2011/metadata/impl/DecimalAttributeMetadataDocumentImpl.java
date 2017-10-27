/*
 * An XML document type.
 * Localname: DecimalAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.DecimalAttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one DecimalAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class DecimalAttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.DecimalAttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public DecimalAttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECIMALATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "DecimalAttributeMetadata");
    
    
    /**
     * Gets the "DecimalAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.DecimalAttributeMetadata getDecimalAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DecimalAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DecimalAttributeMetadata)get_store().find_element_user(DECIMALATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DecimalAttributeMetadata" element
     */
    public boolean isNilDecimalAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DecimalAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DecimalAttributeMetadata)get_store().find_element_user(DECIMALATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DecimalAttributeMetadata" element
     */
    public void setDecimalAttributeMetadata(com.microsoft.schemas.xrm._2011.metadata.DecimalAttributeMetadata decimalAttributeMetadata)
    {
        generatedSetterHelperImpl(decimalAttributeMetadata, DECIMALATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DecimalAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.DecimalAttributeMetadata addNewDecimalAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DecimalAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DecimalAttributeMetadata)get_store().add_element_user(DECIMALATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "DecimalAttributeMetadata" element
     */
    public void setNilDecimalAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DecimalAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DecimalAttributeMetadata)get_store().find_element_user(DECIMALATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.DecimalAttributeMetadata)get_store().add_element_user(DECIMALATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
