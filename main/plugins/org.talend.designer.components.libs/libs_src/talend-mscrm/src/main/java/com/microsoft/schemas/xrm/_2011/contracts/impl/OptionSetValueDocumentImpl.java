/*
 * An XML document type.
 * Localname: OptionSetValue
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.OptionSetValueDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one OptionSetValue(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class OptionSetValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.OptionSetValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public OptionSetValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTIONSETVALUE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "OptionSetValue");
    
    
    /**
     * Gets the "OptionSetValue" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OptionSetValue getOptionSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OptionSetValue target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OptionSetValue)get_store().find_element_user(OPTIONSETVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OptionSetValue" element
     */
    public boolean isNilOptionSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OptionSetValue target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OptionSetValue)get_store().find_element_user(OPTIONSETVALUE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OptionSetValue" element
     */
    public void setOptionSetValue(com.microsoft.schemas.xrm._2011.contracts.OptionSetValue optionSetValue)
    {
        generatedSetterHelperImpl(optionSetValue, OPTIONSETVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OptionSetValue" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OptionSetValue addNewOptionSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OptionSetValue target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OptionSetValue)get_store().add_element_user(OPTIONSETVALUE$0);
            return target;
        }
    }
    
    /**
     * Nils the "OptionSetValue" element
     */
    public void setNilOptionSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OptionSetValue target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OptionSetValue)get_store().find_element_user(OPTIONSETVALUE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.OptionSetValue)get_store().add_element_user(OPTIONSETVALUE$0);
            }
            target.setNil();
        }
    }
}
