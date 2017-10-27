/*
 * XML Type:  EntityReference
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.EntityReference
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML EntityReference(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class EntityReferenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.EntityReference
{
    private static final long serialVersionUID = 1L;
    
    public EntityReferenceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Id");
    private static final javax.xml.namespace.QName LOGICALNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "LogicalName");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Name");
    private static final javax.xml.namespace.QName ROWVERSION$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "RowVersion");
    
    
    /**
     * Gets the "Id" element
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
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
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ID$0, 0);
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
            return get_store().count_elements(ID$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
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
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(ID$0);
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
            get_store().remove_element(ID$0, 0);
        }
    }
    
    /**
     * Gets the "LogicalName" element
     */
    public java.lang.String getLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LogicalName" element
     */
    public org.apache.xmlbeans.XmlString xgetLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "LogicalName" element
     */
    public boolean isNilLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LogicalName" element
     */
    public boolean isSetLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGICALNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "LogicalName" element
     */
    public void setLogicalName(java.lang.String logicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGICALNAME$2);
            }
            target.setStringValue(logicalName);
        }
    }
    
    /**
     * Sets (as xml) the "LogicalName" element
     */
    public void xsetLogicalName(org.apache.xmlbeans.XmlString logicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGICALNAME$2);
            }
            target.set(logicalName);
        }
    }
    
    /**
     * Nils the "LogicalName" element
     */
    public void setNilLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGICALNAME$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LogicalName" element
     */
    public void unsetLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGICALNAME$2, 0);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Name" element
     */
    public boolean isNilName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$4) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$4);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Nils the "Name" element
     */
    public void setNilName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$4, 0);
        }
    }
    
    /**
     * Gets the "RowVersion" element
     */
    public java.lang.String getRowVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWVERSION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RowVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetRowVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROWVERSION$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RowVersion" element
     */
    public boolean isNilRowVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROWVERSION$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RowVersion" element
     */
    public boolean isSetRowVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROWVERSION$6) != 0;
        }
    }
    
    /**
     * Sets the "RowVersion" element
     */
    public void setRowVersion(java.lang.String rowVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWVERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROWVERSION$6);
            }
            target.setStringValue(rowVersion);
        }
    }
    
    /**
     * Sets (as xml) the "RowVersion" element
     */
    public void xsetRowVersion(org.apache.xmlbeans.XmlString rowVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROWVERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROWVERSION$6);
            }
            target.set(rowVersion);
        }
    }
    
    /**
     * Nils the "RowVersion" element
     */
    public void setNilRowVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROWVERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROWVERSION$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RowVersion" element
     */
    public void unsetRowVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROWVERSION$6, 0);
        }
    }
}
