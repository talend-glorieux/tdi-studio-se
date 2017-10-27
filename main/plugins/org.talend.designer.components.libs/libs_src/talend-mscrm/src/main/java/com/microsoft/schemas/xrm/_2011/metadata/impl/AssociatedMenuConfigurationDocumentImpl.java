/*
 * An XML document type.
 * Localname: AssociatedMenuConfiguration
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one AssociatedMenuConfiguration(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class AssociatedMenuConfigurationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfigurationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AssociatedMenuConfigurationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSOCIATEDMENUCONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "AssociatedMenuConfiguration");
    
    
    /**
     * Gets the "AssociatedMenuConfiguration" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration getAssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().find_element_user(ASSOCIATEDMENUCONFIGURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AssociatedMenuConfiguration" element
     */
    public boolean isNilAssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().find_element_user(ASSOCIATEDMENUCONFIGURATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AssociatedMenuConfiguration" element
     */
    public void setAssociatedMenuConfiguration(com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration associatedMenuConfiguration)
    {
        generatedSetterHelperImpl(associatedMenuConfiguration, ASSOCIATEDMENUCONFIGURATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AssociatedMenuConfiguration" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration addNewAssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().add_element_user(ASSOCIATEDMENUCONFIGURATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "AssociatedMenuConfiguration" element
     */
    public void setNilAssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().find_element_user(ASSOCIATEDMENUCONFIGURATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().add_element_user(ASSOCIATEDMENUCONFIGURATION$0);
            }
            target.setNil();
        }
    }
}
