/*
 * An XML document type.
 * Localname: ManagedPropertyType
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one ManagedPropertyType(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class ManagedPropertyTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ManagedPropertyTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANAGEDPROPERTYTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ManagedPropertyType");
    
    
    /**
     * Gets the "ManagedPropertyType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType.Enum getManagedPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEDPROPERTYTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ManagedPropertyType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType xgetManagedPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType)get_store().find_element_user(MANAGEDPROPERTYTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ManagedPropertyType" element
     */
    public boolean isNilManagedPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType)get_store().find_element_user(MANAGEDPROPERTYTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ManagedPropertyType" element
     */
    public void setManagedPropertyType(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType.Enum managedPropertyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEDPROPERTYTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANAGEDPROPERTYTYPE$0);
            }
            target.setEnumValue(managedPropertyType);
        }
    }
    
    /**
     * Sets (as xml) the "ManagedPropertyType" element
     */
    public void xsetManagedPropertyType(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType managedPropertyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType)get_store().find_element_user(MANAGEDPROPERTYTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType)get_store().add_element_user(MANAGEDPROPERTYTYPE$0);
            }
            target.set(managedPropertyType);
        }
    }
    
    /**
     * Nils the "ManagedPropertyType" element
     */
    public void setNilManagedPropertyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType)get_store().find_element_user(MANAGEDPROPERTYTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyType)get_store().add_element_user(MANAGEDPROPERTYTYPE$0);
            }
            target.setNil();
        }
    }
}
