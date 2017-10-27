/*
 * An XML document type.
 * Localname: BigIntAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.BigIntAttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one BigIntAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class BigIntAttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.BigIntAttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public BigIntAttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BIGINTATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "BigIntAttributeMetadata");
    
    
    /**
     * Gets the "BigIntAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.BigIntAttributeMetadata getBigIntAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.BigIntAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.BigIntAttributeMetadata)get_store().find_element_user(BIGINTATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "BigIntAttributeMetadata" element
     */
    public boolean isNilBigIntAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.BigIntAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.BigIntAttributeMetadata)get_store().find_element_user(BIGINTATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "BigIntAttributeMetadata" element
     */
    public void setBigIntAttributeMetadata(com.microsoft.schemas.xrm._2011.metadata.BigIntAttributeMetadata bigIntAttributeMetadata)
    {
        generatedSetterHelperImpl(bigIntAttributeMetadata, BIGINTATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BigIntAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.BigIntAttributeMetadata addNewBigIntAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.BigIntAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.BigIntAttributeMetadata)get_store().add_element_user(BIGINTATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "BigIntAttributeMetadata" element
     */
    public void setNilBigIntAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.BigIntAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.BigIntAttributeMetadata)get_store().find_element_user(BIGINTATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.BigIntAttributeMetadata)get_store().add_element_user(BIGINTATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
