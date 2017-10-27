/*
 * XML Type:  ImageAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2013/Metadata
 * Java type: com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2013.metadata.impl;
/**
 * An XML ImageAttributeMetadata(@http://schemas.microsoft.com/xrm/2013/Metadata).
 *
 * This is a complex type.
 */
public class ImageAttributeMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.AttributeMetadataImpl implements com.microsoft.schemas.xrm._2013.metadata.ImageAttributeMetadata
{
    private static final long serialVersionUID = 1L;
    
    public ImageAttributeMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISPRIMARYIMAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2013/Metadata", "IsPrimaryImage");
    private static final javax.xml.namespace.QName MAXHEIGHT$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2013/Metadata", "MaxHeight");
    private static final javax.xml.namespace.QName MAXWIDTH$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2013/Metadata", "MaxWidth");
    
    
    /**
     * Gets the "IsPrimaryImage" element
     */
    public boolean getIsPrimaryImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPRIMARYIMAGE$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsPrimaryImage" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsPrimaryImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIMARYIMAGE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsPrimaryImage" element
     */
    public boolean isNilIsPrimaryImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIMARYIMAGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsPrimaryImage" element
     */
    public boolean isSetIsPrimaryImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISPRIMARYIMAGE$0) != 0;
        }
    }
    
    /**
     * Sets the "IsPrimaryImage" element
     */
    public void setIsPrimaryImage(boolean isPrimaryImage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPRIMARYIMAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISPRIMARYIMAGE$0);
            }
            target.setBooleanValue(isPrimaryImage);
        }
    }
    
    /**
     * Sets (as xml) the "IsPrimaryImage" element
     */
    public void xsetIsPrimaryImage(org.apache.xmlbeans.XmlBoolean isPrimaryImage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIMARYIMAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISPRIMARYIMAGE$0);
            }
            target.set(isPrimaryImage);
        }
    }
    
    /**
     * Nils the "IsPrimaryImage" element
     */
    public void setNilIsPrimaryImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIMARYIMAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISPRIMARYIMAGE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsPrimaryImage" element
     */
    public void unsetIsPrimaryImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISPRIMARYIMAGE$0, 0);
        }
    }
    
    /**
     * Gets the "MaxHeight" element
     */
    public short getMaxHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXHEIGHT$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxHeight" element
     */
    public org.apache.xmlbeans.XmlShort xgetMaxHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(MAXHEIGHT$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "MaxHeight" element
     */
    public boolean isNilMaxHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(MAXHEIGHT$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "MaxHeight" element
     */
    public boolean isSetMaxHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXHEIGHT$2) != 0;
        }
    }
    
    /**
     * Sets the "MaxHeight" element
     */
    public void setMaxHeight(short maxHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXHEIGHT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXHEIGHT$2);
            }
            target.setShortValue(maxHeight);
        }
    }
    
    /**
     * Sets (as xml) the "MaxHeight" element
     */
    public void xsetMaxHeight(org.apache.xmlbeans.XmlShort maxHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(MAXHEIGHT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(MAXHEIGHT$2);
            }
            target.set(maxHeight);
        }
    }
    
    /**
     * Nils the "MaxHeight" element
     */
    public void setNilMaxHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(MAXHEIGHT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(MAXHEIGHT$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "MaxHeight" element
     */
    public void unsetMaxHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXHEIGHT$2, 0);
        }
    }
    
    /**
     * Gets the "MaxWidth" element
     */
    public short getMaxWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXWIDTH$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxWidth" element
     */
    public org.apache.xmlbeans.XmlShort xgetMaxWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(MAXWIDTH$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "MaxWidth" element
     */
    public boolean isNilMaxWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(MAXWIDTH$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "MaxWidth" element
     */
    public boolean isSetMaxWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXWIDTH$4) != 0;
        }
    }
    
    /**
     * Sets the "MaxWidth" element
     */
    public void setMaxWidth(short maxWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXWIDTH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXWIDTH$4);
            }
            target.setShortValue(maxWidth);
        }
    }
    
    /**
     * Sets (as xml) the "MaxWidth" element
     */
    public void xsetMaxWidth(org.apache.xmlbeans.XmlShort maxWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(MAXWIDTH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(MAXWIDTH$4);
            }
            target.set(maxWidth);
        }
    }
    
    /**
     * Nils the "MaxWidth" element
     */
    public void setNilMaxWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(MAXWIDTH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(MAXWIDTH$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "MaxWidth" element
     */
    public void unsetMaxWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXWIDTH$4, 0);
        }
    }
}
