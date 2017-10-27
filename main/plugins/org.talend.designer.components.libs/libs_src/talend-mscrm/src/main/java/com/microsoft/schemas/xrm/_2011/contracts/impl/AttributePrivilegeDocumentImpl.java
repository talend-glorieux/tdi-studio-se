/*
 * An XML document type.
 * Localname: AttributePrivilege
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.AttributePrivilegeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one AttributePrivilege(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class AttributePrivilegeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.AttributePrivilegeDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributePrivilegeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEPRIVILEGE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "AttributePrivilege");
    
    
    /**
     * Gets the "AttributePrivilege" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege getAttributePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege)get_store().find_element_user(ATTRIBUTEPRIVILEGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributePrivilege" element
     */
    public boolean isNilAttributePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege)get_store().find_element_user(ATTRIBUTEPRIVILEGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AttributePrivilege" element
     */
    public void setAttributePrivilege(com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege attributePrivilege)
    {
        generatedSetterHelperImpl(attributePrivilege, ATTRIBUTEPRIVILEGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AttributePrivilege" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege addNewAttributePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege)get_store().add_element_user(ATTRIBUTEPRIVILEGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "AttributePrivilege" element
     */
    public void setNilAttributePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege)get_store().find_element_user(ATTRIBUTEPRIVILEGE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege)get_store().add_element_user(ATTRIBUTEPRIVILEGE$0);
            }
            target.setNil();
        }
    }
}
