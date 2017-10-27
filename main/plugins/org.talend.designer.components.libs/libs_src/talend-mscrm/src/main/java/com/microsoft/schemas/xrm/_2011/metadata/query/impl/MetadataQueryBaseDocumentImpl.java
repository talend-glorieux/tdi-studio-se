/*
 * An XML document type.
 * Localname: MetadataQueryBase
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryBaseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * A document containing one MetadataQueryBase(@http://schemas.microsoft.com/xrm/2011/Metadata/Query) element.
 *
 * This is a complex type.
 */
public class MetadataQueryBaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryBaseDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataQueryBaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAQUERYBASE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataQueryBase");
    
    
    /**
     * Gets the "MetadataQueryBase" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryBase getMetadataQueryBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryBase)get_store().find_element_user(METADATAQUERYBASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "MetadataQueryBase" element
     */
    public boolean isNilMetadataQueryBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryBase)get_store().find_element_user(METADATAQUERYBASE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "MetadataQueryBase" element
     */
    public void setMetadataQueryBase(com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryBase metadataQueryBase)
    {
        generatedSetterHelperImpl(metadataQueryBase, METADATAQUERYBASE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MetadataQueryBase" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryBase addNewMetadataQueryBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryBase)get_store().add_element_user(METADATAQUERYBASE$0);
            return target;
        }
    }
    
    /**
     * Nils the "MetadataQueryBase" element
     */
    public void setNilMetadataQueryBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryBase target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryBase)get_store().find_element_user(METADATAQUERYBASE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataQueryBase)get_store().add_element_user(METADATAQUERYBASE$0);
            }
            target.setNil();
        }
    }
}
