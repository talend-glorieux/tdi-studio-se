/*
 * An XML document type.
 * Localname: PrivilegeType
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.PrivilegeTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one PrivilegeType(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class PrivilegeTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.PrivilegeTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public PrivilegeTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIVILEGETYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "PrivilegeType");
    
    
    /**
     * Gets the "PrivilegeType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.PrivilegeType.Enum getPrivilegeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVILEGETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.PrivilegeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrivilegeType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.PrivilegeType xgetPrivilegeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.PrivilegeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.PrivilegeType)get_store().find_element_user(PRIVILEGETYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PrivilegeType" element
     */
    public boolean isNilPrivilegeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.PrivilegeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.PrivilegeType)get_store().find_element_user(PRIVILEGETYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PrivilegeType" element
     */
    public void setPrivilegeType(com.microsoft.schemas.xrm._2011.metadata.PrivilegeType.Enum privilegeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVILEGETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIVILEGETYPE$0);
            }
            target.setEnumValue(privilegeType);
        }
    }
    
    /**
     * Sets (as xml) the "PrivilegeType" element
     */
    public void xsetPrivilegeType(com.microsoft.schemas.xrm._2011.metadata.PrivilegeType privilegeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.PrivilegeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.PrivilegeType)get_store().find_element_user(PRIVILEGETYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.PrivilegeType)get_store().add_element_user(PRIVILEGETYPE$0);
            }
            target.set(privilegeType);
        }
    }
    
    /**
     * Nils the "PrivilegeType" element
     */
    public void setNilPrivilegeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.PrivilegeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.PrivilegeType)get_store().find_element_user(PRIVILEGETYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.PrivilegeType)get_store().add_element_user(PRIVILEGETYPE$0);
            }
            target.setNil();
        }
    }
}
