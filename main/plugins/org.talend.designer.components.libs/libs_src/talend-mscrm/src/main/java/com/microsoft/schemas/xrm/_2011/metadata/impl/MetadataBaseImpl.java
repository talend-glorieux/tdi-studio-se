/*
 * XML Type:  MetadataBase
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.MetadataBase
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML MetadataBase(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class MetadataBaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.MetadataBase
{
    private static final long serialVersionUID = 1L;
    
    public MetadataBaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "MetadataId");
    private static final javax.xml.namespace.QName HASCHANGED$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "HasChanged");
    
    
    /**
     * Gets the "MetadataId" element
     */
    public java.lang.String getMetadataId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATAID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MetadataId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetMetadataId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(METADATAID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "MetadataId" element
     */
    public boolean isNilMetadataId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(METADATAID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "MetadataId" element
     */
    public boolean isSetMetadataId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAID$0) != 0;
        }
    }
    
    /**
     * Sets the "MetadataId" element
     */
    public void setMetadataId(java.lang.String metadataId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATAID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METADATAID$0);
            }
            target.setStringValue(metadataId);
        }
    }
    
    /**
     * Sets (as xml) the "MetadataId" element
     */
    public void xsetMetadataId(com.microsoft.schemas._2003._10.serialization.Guid metadataId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(METADATAID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(METADATAID$0);
            }
            target.set(metadataId);
        }
    }
    
    /**
     * Nils the "MetadataId" element
     */
    public void setNilMetadataId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(METADATAID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(METADATAID$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "MetadataId" element
     */
    public void unsetMetadataId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAID$0, 0);
        }
    }
    
    /**
     * Gets the "HasChanged" element
     */
    public boolean getHasChanged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASCHANGED$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "HasChanged" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasChanged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASCHANGED$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "HasChanged" element
     */
    public boolean isNilHasChanged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASCHANGED$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "HasChanged" element
     */
    public boolean isSetHasChanged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASCHANGED$2) != 0;
        }
    }
    
    /**
     * Sets the "HasChanged" element
     */
    public void setHasChanged(boolean hasChanged)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASCHANGED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASCHANGED$2);
            }
            target.setBooleanValue(hasChanged);
        }
    }
    
    /**
     * Sets (as xml) the "HasChanged" element
     */
    public void xsetHasChanged(org.apache.xmlbeans.XmlBoolean hasChanged)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASCHANGED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASCHANGED$2);
            }
            target.set(hasChanged);
        }
    }
    
    /**
     * Nils the "HasChanged" element
     */
    public void setNilHasChanged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASCHANGED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASCHANGED$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "HasChanged" element
     */
    public void unsetHasChanged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASCHANGED$2, 0);
        }
    }
}
