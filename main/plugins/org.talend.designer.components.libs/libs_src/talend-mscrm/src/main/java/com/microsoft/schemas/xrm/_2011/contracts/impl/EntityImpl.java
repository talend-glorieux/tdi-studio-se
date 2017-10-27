/*
 * XML Type:  Entity
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.Entity
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML Entity(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class EntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.Entity
{
    private static final long serialVersionUID = 1L;
    
    public EntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Attributes");
    private static final javax.xml.namespace.QName ENTITYSTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "EntityState");
    private static final javax.xml.namespace.QName FORMATTEDVALUES$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "FormattedValues");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Id");
    private static final javax.xml.namespace.QName LOGICALNAME$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "LogicalName");
    private static final javax.xml.namespace.QName RELATEDENTITIES$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "RelatedEntities");
    private static final javax.xml.namespace.QName ROWVERSION$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "RowVersion");
    
    
    /**
     * Gets the "Attributes" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.AttributeCollection getAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributeCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributeCollection)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Attributes" element
     */
    public boolean isNilAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributeCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributeCollection)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Attributes" element
     */
    public boolean isSetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$0) != 0;
        }
    }
    
    /**
     * Sets the "Attributes" element
     */
    public void setAttributes(com.microsoft.schemas.xrm._2011.contracts.AttributeCollection attributes)
    {
        generatedSetterHelperImpl(attributes, ATTRIBUTES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.AttributeCollection addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributeCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributeCollection)get_store().add_element_user(ATTRIBUTES$0);
            return target;
        }
    }
    
    /**
     * Nils the "Attributes" element
     */
    public void setNilAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributeCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributeCollection)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.AttributeCollection)get_store().add_element_user(ATTRIBUTES$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Attributes" element
     */
    public void unsetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$0, 0);
        }
    }
    
    /**
     * Gets the "EntityState" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityState.Enum getEntityState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYSTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.contracts.EntityState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityState" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityState xgetEntityState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityState target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityState)get_store().find_element_user(ENTITYSTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityState" element
     */
    public boolean isNilEntityState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityState target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityState)get_store().find_element_user(ENTITYSTATE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EntityState" element
     */
    public boolean isSetEntityState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYSTATE$2) != 0;
        }
    }
    
    /**
     * Sets the "EntityState" element
     */
    public void setEntityState(com.microsoft.schemas.xrm._2011.contracts.EntityState.Enum entityState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYSTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYSTATE$2);
            }
            target.setEnumValue(entityState);
        }
    }
    
    /**
     * Sets (as xml) the "EntityState" element
     */
    public void xsetEntityState(com.microsoft.schemas.xrm._2011.contracts.EntityState entityState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityState target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityState)get_store().find_element_user(ENTITYSTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityState)get_store().add_element_user(ENTITYSTATE$2);
            }
            target.set(entityState);
        }
    }
    
    /**
     * Nils the "EntityState" element
     */
    public void setNilEntityState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityState target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityState)get_store().find_element_user(ENTITYSTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityState)get_store().add_element_user(ENTITYSTATE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EntityState" element
     */
    public void unsetEntityState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYSTATE$2, 0);
        }
    }
    
    /**
     * Gets the "FormattedValues" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection getFormattedValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection)get_store().find_element_user(FORMATTEDVALUES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FormattedValues" element
     */
    public boolean isNilFormattedValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection)get_store().find_element_user(FORMATTEDVALUES$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "FormattedValues" element
     */
    public boolean isSetFormattedValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMATTEDVALUES$4) != 0;
        }
    }
    
    /**
     * Sets the "FormattedValues" element
     */
    public void setFormattedValues(com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection formattedValues)
    {
        generatedSetterHelperImpl(formattedValues, FORMATTEDVALUES$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FormattedValues" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection addNewFormattedValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection)get_store().add_element_user(FORMATTEDVALUES$4);
            return target;
        }
    }
    
    /**
     * Nils the "FormattedValues" element
     */
    public void setNilFormattedValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection)get_store().find_element_user(FORMATTEDVALUES$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection)get_store().add_element_user(FORMATTEDVALUES$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "FormattedValues" element
     */
    public void unsetFormattedValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMATTEDVALUES$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$6, 0);
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
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ID$6, 0);
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
            return get_store().count_elements(ID$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$6);
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
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(ID$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(ID$6);
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
            get_store().remove_element(ID$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALNAME$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$8, 0);
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
            return get_store().count_elements(LOGICALNAME$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGICALNAME$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGICALNAME$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGICALNAME$8);
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
            get_store().remove_element(LOGICALNAME$8, 0);
        }
    }
    
    /**
     * Gets the "RelatedEntities" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection getRelatedEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection)get_store().find_element_user(RELATEDENTITIES$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RelatedEntities" element
     */
    public boolean isNilRelatedEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection)get_store().find_element_user(RELATEDENTITIES$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RelatedEntities" element
     */
    public boolean isSetRelatedEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDENTITIES$10) != 0;
        }
    }
    
    /**
     * Sets the "RelatedEntities" element
     */
    public void setRelatedEntities(com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection relatedEntities)
    {
        generatedSetterHelperImpl(relatedEntities, RELATEDENTITIES$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RelatedEntities" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection addNewRelatedEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection)get_store().add_element_user(RELATEDENTITIES$10);
            return target;
        }
    }
    
    /**
     * Nils the "RelatedEntities" element
     */
    public void setNilRelatedEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection)get_store().find_element_user(RELATEDENTITIES$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection)get_store().add_element_user(RELATEDENTITIES$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RelatedEntities" element
     */
    public void unsetRelatedEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDENTITIES$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWVERSION$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROWVERSION$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROWVERSION$12, 0);
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
            return get_store().count_elements(ROWVERSION$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWVERSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROWVERSION$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROWVERSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROWVERSION$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROWVERSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROWVERSION$12);
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
            get_store().remove_element(ROWVERSION$12, 0);
        }
    }
}
