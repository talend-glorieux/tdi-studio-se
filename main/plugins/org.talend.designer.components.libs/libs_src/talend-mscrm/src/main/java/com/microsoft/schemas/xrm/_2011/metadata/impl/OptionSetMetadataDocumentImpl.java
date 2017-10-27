/*
 * An XML document type.
 * Localname: OptionSetMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one OptionSetMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class OptionSetMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public OptionSetMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTIONSETMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "OptionSetMetadata");
    
    
    /**
     * Gets the "OptionSetMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata getOptionSetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata)get_store().find_element_user(OPTIONSETMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OptionSetMetadata" element
     */
    public boolean isNilOptionSetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata)get_store().find_element_user(OPTIONSETMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OptionSetMetadata" element
     */
    public void setOptionSetMetadata(com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata optionSetMetadata)
    {
        generatedSetterHelperImpl(optionSetMetadata, OPTIONSETMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OptionSetMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata addNewOptionSetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata)get_store().add_element_user(OPTIONSETMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "OptionSetMetadata" element
     */
    public void setNilOptionSetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata)get_store().find_element_user(OPTIONSETMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata)get_store().add_element_user(OPTIONSETMETADATA$0);
            }
            target.setNil();
        }
    }
}
