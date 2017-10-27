/*
 * XML Type:  Relationship
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.Relationship
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML Relationship(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class RelationshipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.Relationship
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMARYENTITYROLE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "PrimaryEntityRole");
    private static final javax.xml.namespace.QName SCHEMANAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "SchemaName");
    
    
    /**
     * Gets the "PrimaryEntityRole" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityRole.Enum getPrimaryEntityRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYENTITYROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.contracts.EntityRole.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrimaryEntityRole" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityRole xgetPrimaryEntityRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityRole target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityRole)get_store().find_element_user(PRIMARYENTITYROLE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PrimaryEntityRole" element
     */
    public boolean isNilPrimaryEntityRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityRole target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityRole)get_store().find_element_user(PRIMARYENTITYROLE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PrimaryEntityRole" element
     */
    public boolean isSetPrimaryEntityRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYENTITYROLE$0) != 0;
        }
    }
    
    /**
     * Sets the "PrimaryEntityRole" element
     */
    public void setPrimaryEntityRole(com.microsoft.schemas.xrm._2011.contracts.EntityRole.Enum primaryEntityRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYENTITYROLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYENTITYROLE$0);
            }
            target.setEnumValue(primaryEntityRole);
        }
    }
    
    /**
     * Sets (as xml) the "PrimaryEntityRole" element
     */
    public void xsetPrimaryEntityRole(com.microsoft.schemas.xrm._2011.contracts.EntityRole primaryEntityRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityRole target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityRole)get_store().find_element_user(PRIMARYENTITYROLE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityRole)get_store().add_element_user(PRIMARYENTITYROLE$0);
            }
            target.set(primaryEntityRole);
        }
    }
    
    /**
     * Nils the "PrimaryEntityRole" element
     */
    public void setNilPrimaryEntityRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityRole target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityRole)get_store().find_element_user(PRIMARYENTITYROLE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityRole)get_store().add_element_user(PRIMARYENTITYROLE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PrimaryEntityRole" element
     */
    public void unsetPrimaryEntityRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYENTITYROLE$0, 0);
        }
    }
    
    /**
     * Gets the "SchemaName" element
     */
    public java.lang.String getSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMANAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SchemaName" element
     */
    public org.apache.xmlbeans.XmlString xgetSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SchemaName" element
     */
    public boolean isNilSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SchemaName" element
     */
    public boolean isSetSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEMANAME$2) != 0;
        }
    }
    
    /**
     * Sets the "SchemaName" element
     */
    public void setSchemaName(java.lang.String schemaName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMANAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEMANAME$2);
            }
            target.setStringValue(schemaName);
        }
    }
    
    /**
     * Sets (as xml) the "SchemaName" element
     */
    public void xsetSchemaName(org.apache.xmlbeans.XmlString schemaName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCHEMANAME$2);
            }
            target.set(schemaName);
        }
    }
    
    /**
     * Nils the "SchemaName" element
     */
    public void setNilSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCHEMANAME$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SchemaName" element
     */
    public void unsetSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEMANAME$2, 0);
        }
    }
}
