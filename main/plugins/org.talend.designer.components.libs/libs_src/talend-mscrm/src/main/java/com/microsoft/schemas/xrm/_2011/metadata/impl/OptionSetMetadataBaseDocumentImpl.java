/*
 * An XML document type.
 * Localname: OptionSetMetadataBase
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBaseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one OptionSetMetadataBase(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class OptionSetMetadataBaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBaseDocument
{
    private static final long serialVersionUID = 1L;
    
    public OptionSetMetadataBaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTIONSETMETADATABASE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "OptionSetMetadataBase");
    
    
    /**
     * Gets the "OptionSetMetadataBase" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase getOptionSetMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase)get_store().find_element_user(OPTIONSETMETADATABASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OptionSetMetadataBase" element
     */
    public boolean isNilOptionSetMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase)get_store().find_element_user(OPTIONSETMETADATABASE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OptionSetMetadataBase" element
     */
    public void setOptionSetMetadataBase(com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase optionSetMetadataBase)
    {
        generatedSetterHelperImpl(optionSetMetadataBase, OPTIONSETMETADATABASE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OptionSetMetadataBase" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase addNewOptionSetMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase)get_store().add_element_user(OPTIONSETMETADATABASE$0);
            return target;
        }
    }
    
    /**
     * Nils the "OptionSetMetadataBase" element
     */
    public void setNilOptionSetMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase)get_store().find_element_user(OPTIONSETMETADATABASE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadataBase)get_store().add_element_user(OPTIONSETMETADATABASE$0);
            }
            target.setNil();
        }
    }
}
