/*
 * An XML document type.
 * Localname: AliasedValue
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.AliasedValueDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one AliasedValue(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class AliasedValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.AliasedValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public AliasedValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALIASEDVALUE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "AliasedValue");
    
    
    /**
     * Gets the "AliasedValue" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.AliasedValue getAliasedValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AliasedValue target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AliasedValue)get_store().find_element_user(ALIASEDVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AliasedValue" element
     */
    public boolean isNilAliasedValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AliasedValue target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AliasedValue)get_store().find_element_user(ALIASEDVALUE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AliasedValue" element
     */
    public void setAliasedValue(com.microsoft.schemas.xrm._2011.contracts.AliasedValue aliasedValue)
    {
        generatedSetterHelperImpl(aliasedValue, ALIASEDVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AliasedValue" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.AliasedValue addNewAliasedValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AliasedValue target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AliasedValue)get_store().add_element_user(ALIASEDVALUE$0);
            return target;
        }
    }
    
    /**
     * Nils the "AliasedValue" element
     */
    public void setNilAliasedValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AliasedValue target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AliasedValue)get_store().find_element_user(ALIASEDVALUE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.AliasedValue)get_store().add_element_user(ALIASEDVALUE$0);
            }
            target.setNil();
        }
    }
}
