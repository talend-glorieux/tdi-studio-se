/*
 * An XML document type.
 * Localname: MetadataBase
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.MetadataBaseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one MetadataBase(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class MetadataBaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.MetadataBaseDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataBaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATABASE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "MetadataBase");
    
    
    /**
     * Gets the "MetadataBase" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.MetadataBase getMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.MetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.MetadataBase)get_store().find_element_user(METADATABASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "MetadataBase" element
     */
    public boolean isNilMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.MetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.MetadataBase)get_store().find_element_user(METADATABASE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "MetadataBase" element
     */
    public void setMetadataBase(com.microsoft.schemas.xrm._2011.metadata.MetadataBase metadataBase)
    {
        generatedSetterHelperImpl(metadataBase, METADATABASE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MetadataBase" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.MetadataBase addNewMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.MetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.MetadataBase)get_store().add_element_user(METADATABASE$0);
            return target;
        }
    }
    
    /**
     * Nils the "MetadataBase" element
     */
    public void setNilMetadataBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.MetadataBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.MetadataBase)get_store().find_element_user(METADATABASE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.MetadataBase)get_store().add_element_user(METADATABASE$0);
            }
            target.setNil();
        }
    }
}
