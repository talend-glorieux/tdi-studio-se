/*
 * An XML document type.
 * Localname: CascadeConfiguration
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.CascadeConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one CascadeConfiguration(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class CascadeConfigurationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.CascadeConfigurationDocument
{
    private static final long serialVersionUID = 1L;
    
    public CascadeConfigurationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CASCADECONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CascadeConfiguration");
    
    
    /**
     * Gets the "CascadeConfiguration" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration getCascadeConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration)get_store().find_element_user(CASCADECONFIGURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CascadeConfiguration" element
     */
    public boolean isNilCascadeConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration)get_store().find_element_user(CASCADECONFIGURATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CascadeConfiguration" element
     */
    public void setCascadeConfiguration(com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration cascadeConfiguration)
    {
        generatedSetterHelperImpl(cascadeConfiguration, CASCADECONFIGURATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CascadeConfiguration" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration addNewCascadeConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration)get_store().add_element_user(CASCADECONFIGURATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "CascadeConfiguration" element
     */
    public void setNilCascadeConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration)get_store().find_element_user(CASCADECONFIGURATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration)get_store().add_element_user(CASCADECONFIGURATION$0);
            }
            target.setNil();
        }
    }
}
