/*
 * XML Type:  BooleanOptionSetMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML BooleanOptionSetMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class BooleanOptionSetMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.OptionSetMetadataBaseImpl implements com.microsoft.schemas.xrm._2011.metadata.BooleanOptionSetMetadata
{
    private static final long serialVersionUID = 1L;
    
    public BooleanOptionSetMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FALSEOPTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "FalseOption");
    private static final javax.xml.namespace.QName TRUEOPTION$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "TrueOption");
    
    
    /**
     * Gets the "FalseOption" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionMetadata getFalseOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().find_element_user(FALSEOPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FalseOption" element
     */
    public boolean isNilFalseOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().find_element_user(FALSEOPTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "FalseOption" element
     */
    public boolean isSetFalseOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FALSEOPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "FalseOption" element
     */
    public void setFalseOption(com.microsoft.schemas.xrm._2011.metadata.OptionMetadata falseOption)
    {
        generatedSetterHelperImpl(falseOption, FALSEOPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FalseOption" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionMetadata addNewFalseOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().add_element_user(FALSEOPTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "FalseOption" element
     */
    public void setNilFalseOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().find_element_user(FALSEOPTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().add_element_user(FALSEOPTION$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "FalseOption" element
     */
    public void unsetFalseOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FALSEOPTION$0, 0);
        }
    }
    
    /**
     * Gets the "TrueOption" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionMetadata getTrueOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().find_element_user(TRUEOPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "TrueOption" element
     */
    public boolean isNilTrueOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().find_element_user(TRUEOPTION$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "TrueOption" element
     */
    public boolean isSetTrueOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRUEOPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "TrueOption" element
     */
    public void setTrueOption(com.microsoft.schemas.xrm._2011.metadata.OptionMetadata trueOption)
    {
        generatedSetterHelperImpl(trueOption, TRUEOPTION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TrueOption" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionMetadata addNewTrueOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().add_element_user(TRUEOPTION$2);
            return target;
        }
    }
    
    /**
     * Nils the "TrueOption" element
     */
    public void setNilTrueOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().find_element_user(TRUEOPTION$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.OptionMetadata)get_store().add_element_user(TRUEOPTION$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TrueOption" element
     */
    public void unsetTrueOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRUEOPTION$2, 0);
        }
    }
}
