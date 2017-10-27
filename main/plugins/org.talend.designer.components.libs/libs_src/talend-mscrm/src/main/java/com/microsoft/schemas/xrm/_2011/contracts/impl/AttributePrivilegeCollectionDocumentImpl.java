/*
 * An XML document type.
 * Localname: AttributePrivilegeCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.AttributePrivilegeCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one AttributePrivilegeCollection(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class AttributePrivilegeCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.AttributePrivilegeCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributePrivilegeCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEPRIVILEGECOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "AttributePrivilegeCollection");
    
    
    /**
     * Gets the "AttributePrivilegeCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.AttributePrivilegeCollection getAttributePrivilegeCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributePrivilegeCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributePrivilegeCollection)get_store().find_element_user(ATTRIBUTEPRIVILEGECOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributePrivilegeCollection" element
     */
    public boolean isNilAttributePrivilegeCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributePrivilegeCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributePrivilegeCollection)get_store().find_element_user(ATTRIBUTEPRIVILEGECOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AttributePrivilegeCollection" element
     */
    public void setAttributePrivilegeCollection(com.microsoft.schemas.xrm._2011.contracts.AttributePrivilegeCollection attributePrivilegeCollection)
    {
        generatedSetterHelperImpl(attributePrivilegeCollection, ATTRIBUTEPRIVILEGECOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AttributePrivilegeCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.AttributePrivilegeCollection addNewAttributePrivilegeCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributePrivilegeCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributePrivilegeCollection)get_store().add_element_user(ATTRIBUTEPRIVILEGECOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "AttributePrivilegeCollection" element
     */
    public void setNilAttributePrivilegeCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributePrivilegeCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributePrivilegeCollection)get_store().find_element_user(ATTRIBUTEPRIVILEGECOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.AttributePrivilegeCollection)get_store().add_element_user(ATTRIBUTEPRIVILEGECOLLECTION$0);
            }
            target.setNil();
        }
    }
}
