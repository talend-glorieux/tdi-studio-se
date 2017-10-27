/*
 * XML Type:  ComponentDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ComponentDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ComponentDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ComponentDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ComponentDetail
{
    private static final long serialVersionUID = 1L;
    
    public ComponentDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "DisplayName");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Id");
    private static final javax.xml.namespace.QName PARENTDISPLAYNAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ParentDisplayName");
    private static final javax.xml.namespace.QName PARENTID$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ParentId");
    private static final javax.xml.namespace.QName PARENTSCHEMANAME$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ParentSchemaName");
    private static final javax.xml.namespace.QName SCHEMANAME$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SchemaName");
    private static final javax.xml.namespace.QName SOLUTION$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Solution");
    private static final javax.xml.namespace.QName TYPE$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Type");
    
    
    /**
     * Gets the "DisplayName" element
     */
    public java.lang.String getDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DisplayName" element
     */
    public org.apache.xmlbeans.XmlString xgetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DisplayName" element
     */
    public boolean isNilDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DisplayName" element
     */
    public boolean isSetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "DisplayName" element
     */
    public void setDisplayName(java.lang.String displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYNAME$0);
            }
            target.setStringValue(displayName);
        }
    }
    
    /**
     * Sets (as xml) the "DisplayName" element
     */
    public void xsetDisplayName(org.apache.xmlbeans.XmlString displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYNAME$0);
            }
            target.set(displayName);
        }
    }
    
    /**
     * Nils the "DisplayName" element
     */
    public void setNilDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYNAME$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DisplayName" element
     */
    public void unsetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYNAME$0, 0);
        }
    }
    
    /**
     * Gets the "Id" element
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Id" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Id" element
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$2) != 0;
        }
    }
    
    /**
     * Sets the "Id" element
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "Id" element
     */
    public void xsetId(com.microsoft.schemas._2003._10.serialization.Guid id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "Id" element
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$2, 0);
        }
    }
    
    /**
     * Gets the "ParentDisplayName" element
     */
    public java.lang.String getParentDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTDISPLAYNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParentDisplayName" element
     */
    public org.apache.xmlbeans.XmlString xgetParentDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTDISPLAYNAME$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ParentDisplayName" element
     */
    public boolean isNilParentDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTDISPLAYNAME$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ParentDisplayName" element
     */
    public boolean isSetParentDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTDISPLAYNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "ParentDisplayName" element
     */
    public void setParentDisplayName(java.lang.String parentDisplayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTDISPLAYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTDISPLAYNAME$4);
            }
            target.setStringValue(parentDisplayName);
        }
    }
    
    /**
     * Sets (as xml) the "ParentDisplayName" element
     */
    public void xsetParentDisplayName(org.apache.xmlbeans.XmlString parentDisplayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTDISPLAYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARENTDISPLAYNAME$4);
            }
            target.set(parentDisplayName);
        }
    }
    
    /**
     * Nils the "ParentDisplayName" element
     */
    public void setNilParentDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTDISPLAYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARENTDISPLAYNAME$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ParentDisplayName" element
     */
    public void unsetParentDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTDISPLAYNAME$4, 0);
        }
    }
    
    /**
     * Gets the "ParentId" element
     */
    public java.lang.String getParentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParentId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetParentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(PARENTID$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ParentId" element
     */
    public boolean isSetParentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTID$6) != 0;
        }
    }
    
    /**
     * Sets the "ParentId" element
     */
    public void setParentId(java.lang.String parentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTID$6);
            }
            target.setStringValue(parentId);
        }
    }
    
    /**
     * Sets (as xml) the "ParentId" element
     */
    public void xsetParentId(com.microsoft.schemas._2003._10.serialization.Guid parentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(PARENTID$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(PARENTID$6);
            }
            target.set(parentId);
        }
    }
    
    /**
     * Unsets the "ParentId" element
     */
    public void unsetParentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTID$6, 0);
        }
    }
    
    /**
     * Gets the "ParentSchemaName" element
     */
    public java.lang.String getParentSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTSCHEMANAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParentSchemaName" element
     */
    public org.apache.xmlbeans.XmlString xgetParentSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTSCHEMANAME$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ParentSchemaName" element
     */
    public boolean isNilParentSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTSCHEMANAME$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ParentSchemaName" element
     */
    public boolean isSetParentSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTSCHEMANAME$8) != 0;
        }
    }
    
    /**
     * Sets the "ParentSchemaName" element
     */
    public void setParentSchemaName(java.lang.String parentSchemaName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTSCHEMANAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTSCHEMANAME$8);
            }
            target.setStringValue(parentSchemaName);
        }
    }
    
    /**
     * Sets (as xml) the "ParentSchemaName" element
     */
    public void xsetParentSchemaName(org.apache.xmlbeans.XmlString parentSchemaName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTSCHEMANAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARENTSCHEMANAME$8);
            }
            target.set(parentSchemaName);
        }
    }
    
    /**
     * Nils the "ParentSchemaName" element
     */
    public void setNilParentSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTSCHEMANAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARENTSCHEMANAME$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ParentSchemaName" element
     */
    public void unsetParentSchemaName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTSCHEMANAME$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMANAME$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$10, 0);
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
            return get_store().count_elements(SCHEMANAME$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMANAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEMANAME$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCHEMANAME$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCHEMANAME$10);
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
            get_store().remove_element(SCHEMANAME$10, 0);
        }
    }
    
    /**
     * Gets the "Solution" element
     */
    public java.lang.String getSolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOLUTION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Solution" element
     */
    public org.apache.xmlbeans.XmlString xgetSolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOLUTION$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Solution" element
     */
    public boolean isNilSolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOLUTION$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Solution" element
     */
    public boolean isSetSolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOLUTION$12) != 0;
        }
    }
    
    /**
     * Sets the "Solution" element
     */
    public void setSolution(java.lang.String solution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOLUTION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOLUTION$12);
            }
            target.setStringValue(solution);
        }
    }
    
    /**
     * Sets (as xml) the "Solution" element
     */
    public void xsetSolution(org.apache.xmlbeans.XmlString solution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOLUTION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOLUTION$12);
            }
            target.set(solution);
        }
    }
    
    /**
     * Nils the "Solution" element
     */
    public void setNilSolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOLUTION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOLUTION$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Solution" element
     */
    public void unsetSolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOLUTION$12, 0);
        }
    }
    
    /**
     * Gets the "Type" element
     */
    public int getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" element
     */
    public org.apache.xmlbeans.XmlInt xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TYPE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "Type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$14) != 0;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(int type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$14);
            }
            target.setIntValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlInt type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TYPE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TYPE$14);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "Type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$14, 0);
        }
    }
}
