/*
 * An XML document type.
 * Localname: DoubleAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one DoubleAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class DoubleAttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public DoubleAttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOUBLEATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "DoubleAttributeMetadata");
    
    
    /**
     * Gets the "DoubleAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata getDoubleAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata)get_store().find_element_user(DOUBLEATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DoubleAttributeMetadata" element
     */
    public boolean isNilDoubleAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata)get_store().find_element_user(DOUBLEATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DoubleAttributeMetadata" element
     */
    public void setDoubleAttributeMetadata(com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata doubleAttributeMetadata)
    {
        generatedSetterHelperImpl(doubleAttributeMetadata, DOUBLEATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DoubleAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata addNewDoubleAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata)get_store().add_element_user(DOUBLEATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "DoubleAttributeMetadata" element
     */
    public void setNilDoubleAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata)get_store().find_element_user(DOUBLEATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.DoubleAttributeMetadata)get_store().add_element_user(DOUBLEATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
