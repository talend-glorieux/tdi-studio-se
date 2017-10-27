/*
 * An XML document type.
 * Localname: AccessRights
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AccessRightsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one AccessRights(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class AccessRightsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.AccessRightsDocument
{
    private static final long serialVersionUID = 1L;
    
    public AccessRightsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCESSRIGHTS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AccessRights");
    
    
    /**
     * Gets the "AccessRights" element
     */
    public java.util.List getAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSRIGHTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccessRights" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AccessRights xgetAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().find_element_user(ACCESSRIGHTS$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AccessRights" element
     */
    public boolean isNilAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().find_element_user(ACCESSRIGHTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AccessRights" element
     */
    public void setAccessRights(java.util.List accessRights)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSRIGHTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSRIGHTS$0);
            }
            target.setListValue(accessRights);
        }
    }
    
    /**
     * Sets (as xml) the "AccessRights" element
     */
    public void xsetAccessRights(com.microsoft.schemas.crm._2011.contracts.AccessRights accessRights)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().find_element_user(ACCESSRIGHTS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().add_element_user(ACCESSRIGHTS$0);
            }
            target.set(accessRights);
        }
    }
    
    /**
     * Nils the "AccessRights" element
     */
    public void setNilAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().find_element_user(ACCESSRIGHTS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().add_element_user(ACCESSRIGHTS$0);
            }
            target.setNil();
        }
    }
}
