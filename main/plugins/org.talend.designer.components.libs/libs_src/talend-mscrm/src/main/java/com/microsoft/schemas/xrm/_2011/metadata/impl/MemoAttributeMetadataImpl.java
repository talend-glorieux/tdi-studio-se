/*
 * XML Type:  MemoAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML MemoAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class MemoAttributeMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.AttributeMetadataImpl implements com.microsoft.schemas.xrm._2011.metadata.MemoAttributeMetadata
{
    private static final long serialVersionUID = 1L;
    
    public MemoAttributeMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Format");
    private static final javax.xml.namespace.QName IMEMODE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ImeMode");
    private static final javax.xml.namespace.QName MAXLENGTH$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "MaxLength");
    private static final javax.xml.namespace.QName ISLOCALIZABLE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsLocalizable");
    
    
    /**
     * Gets the "Format" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum getFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Format" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.StringFormat xgetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().find_element_user(FORMAT$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Format" element
     */
    public boolean isNilFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().find_element_user(FORMAT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Format" element
     */
    public boolean isSetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMAT$0) != 0;
        }
    }
    
    /**
     * Sets the "Format" element
     */
    public void setFormat(com.microsoft.schemas.xrm._2011.metadata.StringFormat.Enum format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMAT$0);
            }
            target.setEnumValue(format);
        }
    }
    
    /**
     * Sets (as xml) the "Format" element
     */
    public void xsetFormat(com.microsoft.schemas.xrm._2011.metadata.StringFormat format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().add_element_user(FORMAT$0);
            }
            target.set(format);
        }
    }
    
    /**
     * Nils the "Format" element
     */
    public void setNilFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.StringFormat target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.StringFormat)get_store().add_element_user(FORMAT$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Format" element
     */
    public void unsetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMAT$0, 0);
        }
    }
    
    /**
     * Gets the "ImeMode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum getImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMEMODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImeMode" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ImeMode xgetImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().find_element_user(IMEMODE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ImeMode" element
     */
    public boolean isNilImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().find_element_user(IMEMODE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ImeMode" element
     */
    public boolean isSetImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMEMODE$2) != 0;
        }
    }
    
    /**
     * Sets the "ImeMode" element
     */
    public void setImeMode(com.microsoft.schemas.xrm._2011.metadata.ImeMode.Enum imeMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMEMODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMEMODE$2);
            }
            target.setEnumValue(imeMode);
        }
    }
    
    /**
     * Sets (as xml) the "ImeMode" element
     */
    public void xsetImeMode(com.microsoft.schemas.xrm._2011.metadata.ImeMode imeMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().find_element_user(IMEMODE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().add_element_user(IMEMODE$2);
            }
            target.set(imeMode);
        }
    }
    
    /**
     * Nils the "ImeMode" element
     */
    public void setNilImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ImeMode target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().find_element_user(IMEMODE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.ImeMode)get_store().add_element_user(IMEMODE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ImeMode" element
     */
    public void unsetImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMEMODE$2, 0);
        }
    }
    
    /**
     * Gets the "MaxLength" element
     */
    public int getMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXLENGTH$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxLength" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXLENGTH$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "MaxLength" element
     */
    public boolean isNilMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXLENGTH$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "MaxLength" element
     */
    public boolean isSetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXLENGTH$4) != 0;
        }
    }
    
    /**
     * Sets the "MaxLength" element
     */
    public void setMaxLength(int maxLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXLENGTH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXLENGTH$4);
            }
            target.setIntValue(maxLength);
        }
    }
    
    /**
     * Sets (as xml) the "MaxLength" element
     */
    public void xsetMaxLength(org.apache.xmlbeans.XmlInt maxLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXLENGTH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXLENGTH$4);
            }
            target.set(maxLength);
        }
    }
    
    /**
     * Nils the "MaxLength" element
     */
    public void setNilMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXLENGTH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXLENGTH$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "MaxLength" element
     */
    public void unsetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXLENGTH$4, 0);
        }
    }
    
    /**
     * Gets the "IsLocalizable" element
     */
    public boolean getIsLocalizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISLOCALIZABLE$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsLocalizable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsLocalizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISLOCALIZABLE$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsLocalizable" element
     */
    public boolean isNilIsLocalizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISLOCALIZABLE$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsLocalizable" element
     */
    public boolean isSetIsLocalizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISLOCALIZABLE$6) != 0;
        }
    }
    
    /**
     * Sets the "IsLocalizable" element
     */
    public void setIsLocalizable(boolean isLocalizable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISLOCALIZABLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISLOCALIZABLE$6);
            }
            target.setBooleanValue(isLocalizable);
        }
    }
    
    /**
     * Sets (as xml) the "IsLocalizable" element
     */
    public void xsetIsLocalizable(org.apache.xmlbeans.XmlBoolean isLocalizable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISLOCALIZABLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISLOCALIZABLE$6);
            }
            target.set(isLocalizable);
        }
    }
    
    /**
     * Nils the "IsLocalizable" element
     */
    public void setNilIsLocalizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISLOCALIZABLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISLOCALIZABLE$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsLocalizable" element
     */
    public void unsetIsLocalizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISLOCALIZABLE$6, 0);
        }
    }
}
