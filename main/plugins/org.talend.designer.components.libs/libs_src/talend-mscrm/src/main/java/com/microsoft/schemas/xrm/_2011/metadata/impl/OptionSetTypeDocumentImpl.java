/*
 * An XML document type.
 * Localname: OptionSetType
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.OptionSetTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one OptionSetType(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class OptionSetTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.OptionSetTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public OptionSetTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTIONSETTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "OptionSetType");
    
    
    /**
     * Gets the "OptionSetType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionSetType.Enum getOptionSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTIONSETTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.OptionSetType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OptionSetType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OptionSetType xgetOptionSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetType)get_store().find_element_user(OPTIONSETTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OptionSetType" element
     */
    public boolean isNilOptionSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetType)get_store().find_element_user(OPTIONSETTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OptionSetType" element
     */
    public void setOptionSetType(com.microsoft.schemas.xrm._2011.metadata.OptionSetType.Enum optionSetType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTIONSETTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPTIONSETTYPE$0);
            }
            target.setEnumValue(optionSetType);
        }
    }
    
    /**
     * Sets (as xml) the "OptionSetType" element
     */
    public void xsetOptionSetType(com.microsoft.schemas.xrm._2011.metadata.OptionSetType optionSetType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetType)get_store().find_element_user(OPTIONSETTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetType)get_store().add_element_user(OPTIONSETTYPE$0);
            }
            target.set(optionSetType);
        }
    }
    
    /**
     * Nils the "OptionSetType" element
     */
    public void setNilOptionSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OptionSetType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetType)get_store().find_element_user(OPTIONSETTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.OptionSetType)get_store().add_element_user(OPTIONSETTYPE$0);
            }
            target.setNil();
        }
    }
}
