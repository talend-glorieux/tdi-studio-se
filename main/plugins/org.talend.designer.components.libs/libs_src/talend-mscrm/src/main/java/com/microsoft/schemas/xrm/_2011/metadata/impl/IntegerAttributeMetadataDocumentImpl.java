/*
 * An XML document type.
 * Localname: IntegerAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one IntegerAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class IntegerAttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public IntegerAttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTEGERATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IntegerAttributeMetadata");
    
    
    /**
     * Gets the "IntegerAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata getIntegerAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata)get_store().find_element_user(INTEGERATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IntegerAttributeMetadata" element
     */
    public boolean isNilIntegerAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata)get_store().find_element_user(INTEGERATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "IntegerAttributeMetadata" element
     */
    public void setIntegerAttributeMetadata(com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata integerAttributeMetadata)
    {
        generatedSetterHelperImpl(integerAttributeMetadata, INTEGERATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IntegerAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata addNewIntegerAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata)get_store().add_element_user(INTEGERATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "IntegerAttributeMetadata" element
     */
    public void setNilIntegerAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata)get_store().find_element_user(INTEGERATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.IntegerAttributeMetadata)get_store().add_element_user(INTEGERATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
