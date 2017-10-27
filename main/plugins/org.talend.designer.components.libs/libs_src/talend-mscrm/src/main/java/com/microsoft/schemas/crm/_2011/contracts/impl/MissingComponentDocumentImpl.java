/*
 * An XML document type.
 * Localname: MissingComponent
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.MissingComponentDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one MissingComponent(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class MissingComponentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.MissingComponentDocument
{
    private static final long serialVersionUID = 1L;
    
    public MissingComponentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MISSINGCOMPONENT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "MissingComponent");
    
    
    /**
     * Gets the "MissingComponent" element
     */
    public com.microsoft.schemas.crm._2011.contracts.MissingComponent getMissingComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.MissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.MissingComponent)get_store().find_element_user(MISSINGCOMPONENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "MissingComponent" element
     */
    public boolean isNilMissingComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.MissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.MissingComponent)get_store().find_element_user(MISSINGCOMPONENT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "MissingComponent" element
     */
    public void setMissingComponent(com.microsoft.schemas.crm._2011.contracts.MissingComponent missingComponent)
    {
        generatedSetterHelperImpl(missingComponent, MISSINGCOMPONENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MissingComponent" element
     */
    public com.microsoft.schemas.crm._2011.contracts.MissingComponent addNewMissingComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.MissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.MissingComponent)get_store().add_element_user(MISSINGCOMPONENT$0);
            return target;
        }
    }
    
    /**
     * Nils the "MissingComponent" element
     */
    public void setNilMissingComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.MissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.MissingComponent)get_store().find_element_user(MISSINGCOMPONENT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.MissingComponent)get_store().add_element_user(MISSINGCOMPONENT$0);
            }
            target.setNil();
        }
    }
}
