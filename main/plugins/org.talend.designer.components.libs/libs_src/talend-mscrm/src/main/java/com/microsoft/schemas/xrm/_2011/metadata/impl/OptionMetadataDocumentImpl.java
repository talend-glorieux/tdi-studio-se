/*
 * An XML document type.
 * Localname: OptionMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.OptionMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one OptionMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class OptionMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.OptionMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public OptionMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTIONMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "OptionMetadata");
    
    
    /**
     * Gets the "OptionMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionMetadata getOptionMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().find_element_user(OPTIONMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OptionMetadata" element
     */
    public boolean isNilOptionMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().find_element_user(OPTIONMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OptionMetadata" element
     */
    public void setOptionMetadata(com.microsoft.schemas.xrm._2011.metadata.OptionMetadata optionMetadata)
    {
        generatedSetterHelperImpl(optionMetadata, OPTIONMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OptionMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionMetadata addNewOptionMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().add_element_user(OPTIONMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "OptionMetadata" element
     */
    public void setNilOptionMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().find_element_user(OPTIONMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().add_element_user(OPTIONMETADATA$0);
            }
            target.setNil();
        }
    }
}
