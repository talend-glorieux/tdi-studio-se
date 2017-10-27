/*
 * An XML document type.
 * Localname: EntityRole
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.EntityRoleDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one EntityRole(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class EntityRoleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.EntityRoleDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityRoleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYROLE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "EntityRole");
    
    
    /**
     * Gets the "EntityRole" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityRole.Enum getEntityRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.contracts.EntityRole.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityRole" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityRole xgetEntityRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityRole target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityRole)get_store().find_element_user(ENTITYROLE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityRole" element
     */
    public boolean isNilEntityRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityRole target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityRole)get_store().find_element_user(ENTITYROLE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EntityRole" element
     */
    public void setEntityRole(com.microsoft.schemas.xrm._2011.contracts.EntityRole.Enum entityRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYROLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYROLE$0);
            }
            target.setEnumValue(entityRole);
        }
    }
    
    /**
     * Sets (as xml) the "EntityRole" element
     */
    public void xsetEntityRole(com.microsoft.schemas.xrm._2011.contracts.EntityRole entityRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityRole target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityRole)get_store().find_element_user(ENTITYROLE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityRole)get_store().add_element_user(ENTITYROLE$0);
            }
            target.set(entityRole);
        }
    }
    
    /**
     * Nils the "EntityRole" element
     */
    public void setNilEntityRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityRole target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityRole)get_store().find_element_user(ENTITYROLE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityRole)get_store().add_element_user(ENTITYROLE$0);
            }
            target.setNil();
        }
    }
}
