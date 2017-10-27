/*
 * XML Type:  EnumAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.EnumAttributeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML EnumAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class EnumAttributeMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.AttributeMetadataImpl implements com.microsoft.schemas.xrm._2011.metadata.EnumAttributeMetadata
{
    private static final long serialVersionUID = 1L;
    
    public EnumAttributeMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFAULTFORMVALUE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "DefaultFormValue");
    private static final javax.xml.namespace.QName OPTIONSET$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "OptionSet");
    
    
    /**
     * Gets the "DefaultFormValue" element
     */
    public int getDefaultFormValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTFORMVALUE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DefaultFormValue" element
     */
    public org.apache.xmlbeans.XmlInt xgetDefaultFormValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEFAULTFORMVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DefaultFormValue" element
     */
    public boolean isNilDefaultFormValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEFAULTFORMVALUE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DefaultFormValue" element
     */
    public boolean isSetDefaultFormValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTFORMVALUE$0) != 0;
        }
    }
    
    /**
     * Sets the "DefaultFormValue" element
     */
    public void setDefaultFormValue(int defaultFormValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTFORMVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTFORMVALUE$0);
            }
            target.setIntValue(defaultFormValue);
        }
    }
    
    /**
     * Sets (as xml) the "DefaultFormValue" element
     */
    public void xsetDefaultFormValue(org.apache.xmlbeans.XmlInt defaultFormValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEFAULTFORMVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEFAULTFORMVALUE$0);
            }
            target.set(defaultFormValue);
        }
    }
    
    /**
     * Nils the "DefaultFormValue" element
     */
    public void setNilDefaultFormValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEFAULTFORMVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEFAULTFORMVALUE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DefaultFormValue" element
     */
    public void unsetDefaultFormValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTFORMVALUE$0, 0);
        }
    }
    
    /**
     * Gets the "OptionSet" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata getOptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata)get_store().find_element_user(OPTIONSET$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OptionSet" element
     */
    public boolean isNilOptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata)get_store().find_element_user(OPTIONSET$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "OptionSet" element
     */
    public boolean isSetOptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTIONSET$2) != 0;
        }
    }
    
    /**
     * Sets the "OptionSet" element
     */
    public void setOptionSet(com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata optionSet)
    {
        generatedSetterHelperImpl(optionSet, OPTIONSET$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OptionSet" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata addNewOptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata)get_store().add_element_user(OPTIONSET$2);
            return target;
        }
    }
    
    /**
     * Nils the "OptionSet" element
     */
    public void setNilOptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata)get_store().find_element_user(OPTIONSET$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetMetadata)get_store().add_element_user(OPTIONSET$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "OptionSet" element
     */
    public void unsetOptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTIONSET$2, 0);
        }
    }
}
