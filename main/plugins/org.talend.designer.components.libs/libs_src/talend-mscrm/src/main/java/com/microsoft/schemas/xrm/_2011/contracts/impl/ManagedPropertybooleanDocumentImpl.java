/*
 * An XML document type.
 * Localname: ManagedPropertyboolean
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ManagedPropertybooleanDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one ManagedPropertyboolean(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ManagedPropertybooleanDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ManagedPropertybooleanDocument
{
    private static final long serialVersionUID = 1L;
    
    public ManagedPropertybooleanDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANAGEDPROPERTYBOOLEAN$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ManagedPropertyboolean");
    
    
    /**
     * Gets the "ManagedPropertyboolean" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean getManagedPropertyboolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean)get_store().find_element_user(MANAGEDPROPERTYBOOLEAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ManagedPropertyboolean" element
     */
    public boolean isNilManagedPropertyboolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean)get_store().find_element_user(MANAGEDPROPERTYBOOLEAN$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ManagedPropertyboolean" element
     */
    public void setManagedPropertyboolean(com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean managedPropertyboolean)
    {
        generatedSetterHelperImpl(managedPropertyboolean, MANAGEDPROPERTYBOOLEAN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ManagedPropertyboolean" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean addNewManagedPropertyboolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean)get_store().add_element_user(MANAGEDPROPERTYBOOLEAN$0);
            return target;
        }
    }
    
    /**
     * Nils the "ManagedPropertyboolean" element
     */
    public void setNilManagedPropertyboolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean)get_store().find_element_user(MANAGEDPROPERTYBOOLEAN$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ManagedPropertyboolean)get_store().add_element_user(MANAGEDPROPERTYBOOLEAN$0);
            }
            target.setNil();
        }
    }
}
