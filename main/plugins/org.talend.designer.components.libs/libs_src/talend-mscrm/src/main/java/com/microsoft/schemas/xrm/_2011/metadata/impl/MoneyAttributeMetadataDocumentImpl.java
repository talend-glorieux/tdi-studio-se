/*
 * An XML document type.
 * Localname: MoneyAttributeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.MoneyAttributeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one MoneyAttributeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class MoneyAttributeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.MoneyAttributeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public MoneyAttributeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MONEYATTRIBUTEMETADATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "MoneyAttributeMetadata");
    
    
    /**
     * Gets the "MoneyAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.MoneyAttributeMetadata getMoneyAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.MoneyAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.MoneyAttributeMetadata)get_store().find_element_user(MONEYATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "MoneyAttributeMetadata" element
     */
    public boolean isNilMoneyAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.MoneyAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.MoneyAttributeMetadata)get_store().find_element_user(MONEYATTRIBUTEMETADATA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "MoneyAttributeMetadata" element
     */
    public void setMoneyAttributeMetadata(com.microsoft.schemas.xrm._2011.metadata.MoneyAttributeMetadata moneyAttributeMetadata)
    {
        generatedSetterHelperImpl(moneyAttributeMetadata, MONEYATTRIBUTEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MoneyAttributeMetadata" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.MoneyAttributeMetadata addNewMoneyAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.MoneyAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.MoneyAttributeMetadata)get_store().add_element_user(MONEYATTRIBUTEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Nils the "MoneyAttributeMetadata" element
     */
    public void setNilMoneyAttributeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.MoneyAttributeMetadata target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.MoneyAttributeMetadata)get_store().find_element_user(MONEYATTRIBUTEMETADATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.MoneyAttributeMetadata)get_store().add_element_user(MONEYATTRIBUTEMETADATA$0);
            }
            target.setNil();
        }
    }
}
