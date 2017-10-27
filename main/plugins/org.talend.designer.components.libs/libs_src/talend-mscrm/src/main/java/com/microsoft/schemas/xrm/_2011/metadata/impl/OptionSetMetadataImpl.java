/*
 * XML Type:  OptionSetMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML OptionSetMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class OptionSetMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.OptionSetMetadataBaseImpl implements com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata
{
    private static final long serialVersionUID = 1L;
    
    public OptionSetMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTIONS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Options");
    
    
    /**
     * Gets the "Options" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata getOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata)get_store().find_element_user(OPTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Options" element
     */
    public boolean isNilOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata)get_store().find_element_user(OPTIONS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Options" element
     */
    public boolean isSetOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTIONS$0) != 0;
        }
    }
    
    /**
     * Sets the "Options" element
     */
    public void setOptions(com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata options)
    {
        generatedSetterHelperImpl(options, OPTIONS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Options" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata addNewOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata)get_store().add_element_user(OPTIONS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Options" element
     */
    public void setNilOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata)get_store().find_element_user(OPTIONS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ArrayOfOptionMetadata)get_store().add_element_user(OPTIONS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Options" element
     */
    public void unsetOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTIONS$0, 0);
        }
    }
}
