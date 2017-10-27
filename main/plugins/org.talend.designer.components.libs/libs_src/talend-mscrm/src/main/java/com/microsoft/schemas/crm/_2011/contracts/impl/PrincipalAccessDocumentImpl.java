/*
 * An XML document type.
 * Localname: PrincipalAccess
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.PrincipalAccessDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one PrincipalAccess(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class PrincipalAccessDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.PrincipalAccessDocument
{
    private static final long serialVersionUID = 1L;
    
    public PrincipalAccessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRINCIPALACCESS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "PrincipalAccess");
    
    
    /**
     * Gets the "PrincipalAccess" element
     */
    public com.microsoft.schemas.crm._2011.contracts.PrincipalAccess getPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrincipalAccess)get_store().find_element_user(PRINCIPALACCESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PrincipalAccess" element
     */
    public boolean isNilPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrincipalAccess)get_store().find_element_user(PRINCIPALACCESS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PrincipalAccess" element
     */
    public void setPrincipalAccess(com.microsoft.schemas.crm._2011.contracts.PrincipalAccess principalAccess)
    {
        generatedSetterHelperImpl(principalAccess, PRINCIPALACCESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PrincipalAccess" element
     */
    public com.microsoft.schemas.crm._2011.contracts.PrincipalAccess addNewPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrincipalAccess)get_store().add_element_user(PRINCIPALACCESS$0);
            return target;
        }
    }
    
    /**
     * Nils the "PrincipalAccess" element
     */
    public void setNilPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrincipalAccess)get_store().find_element_user(PRINCIPALACCESS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.PrincipalAccess)get_store().add_element_user(PRINCIPALACCESS$0);
            }
            target.setNil();
        }
    }
}
