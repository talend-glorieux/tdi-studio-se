/*
 * An XML document type.
 * Localname: SecurityTypes
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.SecurityTypesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one SecurityTypes(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class SecurityTypesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.SecurityTypesDocument
{
    private static final long serialVersionUID = 1L;
    
    public SecurityTypesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITYTYPES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "SecurityTypes");
    
    
    /**
     * Gets the "SecurityTypes" element
     */
    public java.util.List getSecurityTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYTYPES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "SecurityTypes" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.SecurityTypes xgetSecurityTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityTypes)get_store().find_element_user(SECURITYTYPES$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SecurityTypes" element
     */
    public boolean isNilSecurityTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityTypes)get_store().find_element_user(SECURITYTYPES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SecurityTypes" element
     */
    public void setSecurityTypes(java.util.List securityTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYTYPES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECURITYTYPES$0);
            }
            target.setListValue(securityTypes);
        }
    }
    
    /**
     * Sets (as xml) the "SecurityTypes" element
     */
    public void xsetSecurityTypes(com.microsoft.schemas.xrm._2011.metadata.SecurityTypes securityTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityTypes)get_store().find_element_user(SECURITYTYPES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.SecurityTypes)get_store().add_element_user(SECURITYTYPES$0);
            }
            target.set(securityTypes);
        }
    }
    
    /**
     * Nils the "SecurityTypes" element
     */
    public void setNilSecurityTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.SecurityTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.SecurityTypes)get_store().find_element_user(SECURITYTYPES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.SecurityTypes)get_store().add_element_user(SECURITYTYPES$0);
            }
            target.setNil();
        }
    }
}
