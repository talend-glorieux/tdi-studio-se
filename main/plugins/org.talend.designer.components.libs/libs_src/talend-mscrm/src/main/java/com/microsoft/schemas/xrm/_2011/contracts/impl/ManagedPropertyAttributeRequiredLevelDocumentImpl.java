/*
 * An XML document type.
 * Localname: ManagedPropertyAttributeRequiredLevel
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyAttributeRequiredLevelDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one ManagedPropertyAttributeRequiredLevel(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ManagedPropertyAttributeRequiredLevelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyAttributeRequiredLevelDocument
{
    private static final long serialVersionUID = 1L;
    
    public ManagedPropertyAttributeRequiredLevelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANAGEDPROPERTYATTRIBUTEREQUIREDLEVEL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ManagedPropertyAttributeRequiredLevel");
    
    
    /**
     * Gets the "ManagedPropertyAttributeRequiredLevel" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyAttributeRequiredLevel getManagedPropertyAttributeRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyAttributeRequiredLevel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyAttributeRequiredLevel)get_store().find_element_user(MANAGEDPROPERTYATTRIBUTEREQUIREDLEVEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ManagedPropertyAttributeRequiredLevel" element
     */
    public boolean isNilManagedPropertyAttributeRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyAttributeRequiredLevel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyAttributeRequiredLevel)get_store().find_element_user(MANAGEDPROPERTYATTRIBUTEREQUIREDLEVEL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ManagedPropertyAttributeRequiredLevel" element
     */
    public void setManagedPropertyAttributeRequiredLevel(com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyAttributeRequiredLevel managedPropertyAttributeRequiredLevel)
    {
        generatedSetterHelperImpl(managedPropertyAttributeRequiredLevel, MANAGEDPROPERTYATTRIBUTEREQUIREDLEVEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ManagedPropertyAttributeRequiredLevel" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyAttributeRequiredLevel addNewManagedPropertyAttributeRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyAttributeRequiredLevel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyAttributeRequiredLevel)get_store().add_element_user(MANAGEDPROPERTYATTRIBUTEREQUIREDLEVEL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ManagedPropertyAttributeRequiredLevel" element
     */
    public void setNilManagedPropertyAttributeRequiredLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyAttributeRequiredLevel target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyAttributeRequiredLevel)get_store().find_element_user(MANAGEDPROPERTYATTRIBUTEREQUIREDLEVEL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyAttributeRequiredLevel)get_store().add_element_user(MANAGEDPROPERTYATTRIBUTEREQUIREDLEVEL$0);
            }
            target.setNil();
        }
    }
}
