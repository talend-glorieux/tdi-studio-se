/*
 * An XML document type.
 * Localname: CascadeType
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.CascadeTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one CascadeType(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class CascadeTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.CascadeTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CascadeTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CASCADETYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CascadeType");
    
    
    /**
     * Gets the "CascadeType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum getCascadeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASCADETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CascadeType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType xgetCascadeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(CASCADETYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CascadeType" element
     */
    public boolean isNilCascadeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(CASCADETYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CascadeType" element
     */
    public void setCascadeType(com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum cascadeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASCADETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CASCADETYPE$0);
            }
            target.setEnumValue(cascadeType);
        }
    }
    
    /**
     * Sets (as xml) the "CascadeType" element
     */
    public void xsetCascadeType(com.microsoft.schemas.xrm._2011.metadata.CascadeType cascadeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(CASCADETYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().add_element_user(CASCADETYPE$0);
            }
            target.set(cascadeType);
        }
    }
    
    /**
     * Nils the "CascadeType" element
     */
    public void setNilCascadeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(CASCADETYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().add_element_user(CASCADETYPE$0);
            }
            target.setNil();
        }
    }
}
