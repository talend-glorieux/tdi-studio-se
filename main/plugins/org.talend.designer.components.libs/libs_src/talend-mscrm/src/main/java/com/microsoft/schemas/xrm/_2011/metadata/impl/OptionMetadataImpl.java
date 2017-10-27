/*
 * XML Type:  OptionMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.OptionMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML OptionMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class OptionMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.MetadataBaseImpl implements com.microsoft.schemas.xrm._2011.metadata.OptionMetadata
{
    private static final long serialVersionUID = 1L;
    
    public OptionMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Description");
    private static final javax.xml.namespace.QName ISMANAGED$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsManaged");
    private static final javax.xml.namespace.QName LABEL$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Label");
    private static final javax.xml.namespace.QName VALUE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Value");
    
    
    /**
     * Gets the "Description" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Description" element
     */
    public boolean isNilDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(com.microsoft.schemas.xrm._2011.contracts.Label description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Description" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "Description" element
     */
    public void setNilDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(DESCRIPTION$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets the "IsManaged" element
     */
    public boolean getIsManaged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMANAGED$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsManaged" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsManaged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsManaged" element
     */
    public boolean isNilIsManaged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsManaged" element
     */
    public boolean isSetIsManaged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISMANAGED$2) != 0;
        }
    }
    
    /**
     * Sets the "IsManaged" element
     */
    public void setIsManaged(boolean isManaged)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMANAGED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISMANAGED$2);
            }
            target.setBooleanValue(isManaged);
        }
    }
    
    /**
     * Sets (as xml) the "IsManaged" element
     */
    public void xsetIsManaged(org.apache.xmlbeans.XmlBoolean isManaged)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISMANAGED$2);
            }
            target.set(isManaged);
        }
    }
    
    /**
     * Nils the "IsManaged" element
     */
    public void setNilIsManaged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMANAGED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISMANAGED$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsManaged" element
     */
    public void unsetIsManaged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISMANAGED$2, 0);
        }
    }
    
    /**
     * Gets the "Label" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(LABEL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Label" element
     */
    public boolean isNilLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(LABEL$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Label" element
     */
    public boolean isSetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LABEL$4) != 0;
        }
    }
    
    /**
     * Sets the "Label" element
     */
    public void setLabel(com.microsoft.schemas.xrm._2011.contracts.Label label)
    {
        generatedSetterHelperImpl(label, LABEL$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Label" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label addNewLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(LABEL$4);
            return target;
        }
    }
    
    /**
     * Nils the "Label" element
     */
    public void setNilLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(LABEL$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(LABEL$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Label" element
     */
    public void unsetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LABEL$4, 0);
        }
    }
    
    /**
     * Gets the "Value" element
     */
    public int getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Value" element
     */
    public org.apache.xmlbeans.XmlInt xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VALUE$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Value" element
     */
    public boolean isNilValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VALUE$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Value" element
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$6) != 0;
        }
    }
    
    /**
     * Sets the "Value" element
     */
    public void setValue(int value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$6);
            }
            target.setIntValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "Value" element
     */
    public void xsetValue(org.apache.xmlbeans.XmlInt value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VALUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(VALUE$6);
            }
            target.set(value);
        }
    }
    
    /**
     * Nils the "Value" element
     */
    public void setNilValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VALUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(VALUE$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Value" element
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$6, 0);
        }
    }
}
