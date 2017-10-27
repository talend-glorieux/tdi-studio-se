/*
 * An XML document type.
 * Localname: PrivilegeDepth
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.PrivilegeDepthDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one PrivilegeDepth(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class PrivilegeDepthDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.PrivilegeDepthDocument
{
    private static final long serialVersionUID = 1L;
    
    public PrivilegeDepthDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIVILEGEDEPTH$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "PrivilegeDepth");
    
    
    /**
     * Gets the "PrivilegeDepth" element
     */
    public com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth.Enum getPrivilegeDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVILEGEDEPTH$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrivilegeDepth" element
     */
    public com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth xgetPrivilegeDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth)get_store().find_element_user(PRIVILEGEDEPTH$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PrivilegeDepth" element
     */
    public boolean isNilPrivilegeDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth)get_store().find_element_user(PRIVILEGEDEPTH$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PrivilegeDepth" element
     */
    public void setPrivilegeDepth(com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth.Enum privilegeDepth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVILEGEDEPTH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIVILEGEDEPTH$0);
            }
            target.setEnumValue(privilegeDepth);
        }
    }
    
    /**
     * Sets (as xml) the "PrivilegeDepth" element
     */
    public void xsetPrivilegeDepth(com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth privilegeDepth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth)get_store().find_element_user(PRIVILEGEDEPTH$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth)get_store().add_element_user(PRIVILEGEDEPTH$0);
            }
            target.set(privilegeDepth);
        }
    }
    
    /**
     * Nils the "PrivilegeDepth" element
     */
    public void setNilPrivilegeDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth)get_store().find_element_user(PRIVILEGEDEPTH$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth)get_store().add_element_user(PRIVILEGEDEPTH$0);
            }
            target.setNil();
        }
    }
}
