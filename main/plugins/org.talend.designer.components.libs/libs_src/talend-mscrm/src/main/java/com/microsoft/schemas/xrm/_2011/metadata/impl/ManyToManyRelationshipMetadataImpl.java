/*
 * XML Type:  ManyToManyRelationshipMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ManyToManyRelationshipMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ManyToManyRelationshipMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.RelationshipMetadataBaseImpl implements com.microsoft.schemas.xrm._2011.metadata.ManyToManyRelationshipMetadata
{
    private static final long serialVersionUID = 1L;
    
    public ManyToManyRelationshipMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITY1ASSOCIATEDMENUCONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Entity1AssociatedMenuConfiguration");
    private static final javax.xml.namespace.QName ENTITY1INTERSECTATTRIBUTE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Entity1IntersectAttribute");
    private static final javax.xml.namespace.QName ENTITY1LOGICALNAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Entity1LogicalName");
    private static final javax.xml.namespace.QName ENTITY2ASSOCIATEDMENUCONFIGURATION$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Entity2AssociatedMenuConfiguration");
    private static final javax.xml.namespace.QName ENTITY2INTERSECTATTRIBUTE$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Entity2IntersectAttribute");
    private static final javax.xml.namespace.QName ENTITY2LOGICALNAME$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Entity2LogicalName");
    private static final javax.xml.namespace.QName INTERSECTENTITYNAME$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IntersectEntityName");
    
    
    /**
     * Gets the "Entity1AssociatedMenuConfiguration" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration getEntity1AssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().find_element_user(ENTITY1ASSOCIATEDMENUCONFIGURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Entity1AssociatedMenuConfiguration" element
     */
    public boolean isNilEntity1AssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().find_element_user(ENTITY1ASSOCIATEDMENUCONFIGURATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Entity1AssociatedMenuConfiguration" element
     */
    public boolean isSetEntity1AssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITY1ASSOCIATEDMENUCONFIGURATION$0) != 0;
        }
    }
    
    /**
     * Sets the "Entity1AssociatedMenuConfiguration" element
     */
    public void setEntity1AssociatedMenuConfiguration(com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration entity1AssociatedMenuConfiguration)
    {
        generatedSetterHelperImpl(entity1AssociatedMenuConfiguration, ENTITY1ASSOCIATEDMENUCONFIGURATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Entity1AssociatedMenuConfiguration" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration addNewEntity1AssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().add_element_user(ENTITY1ASSOCIATEDMENUCONFIGURATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "Entity1AssociatedMenuConfiguration" element
     */
    public void setNilEntity1AssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().find_element_user(ENTITY1ASSOCIATEDMENUCONFIGURATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().add_element_user(ENTITY1ASSOCIATEDMENUCONFIGURATION$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Entity1AssociatedMenuConfiguration" element
     */
    public void unsetEntity1AssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITY1ASSOCIATEDMENUCONFIGURATION$0, 0);
        }
    }
    
    /**
     * Gets the "Entity1IntersectAttribute" element
     */
    public java.lang.String getEntity1IntersectAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITY1INTERSECTATTRIBUTE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Entity1IntersectAttribute" element
     */
    public org.apache.xmlbeans.XmlString xgetEntity1IntersectAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY1INTERSECTATTRIBUTE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Entity1IntersectAttribute" element
     */
    public boolean isNilEntity1IntersectAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY1INTERSECTATTRIBUTE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Entity1IntersectAttribute" element
     */
    public boolean isSetEntity1IntersectAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITY1INTERSECTATTRIBUTE$2) != 0;
        }
    }
    
    /**
     * Sets the "Entity1IntersectAttribute" element
     */
    public void setEntity1IntersectAttribute(java.lang.String entity1IntersectAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITY1INTERSECTATTRIBUTE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITY1INTERSECTATTRIBUTE$2);
            }
            target.setStringValue(entity1IntersectAttribute);
        }
    }
    
    /**
     * Sets (as xml) the "Entity1IntersectAttribute" element
     */
    public void xsetEntity1IntersectAttribute(org.apache.xmlbeans.XmlString entity1IntersectAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY1INTERSECTATTRIBUTE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITY1INTERSECTATTRIBUTE$2);
            }
            target.set(entity1IntersectAttribute);
        }
    }
    
    /**
     * Nils the "Entity1IntersectAttribute" element
     */
    public void setNilEntity1IntersectAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY1INTERSECTATTRIBUTE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITY1INTERSECTATTRIBUTE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Entity1IntersectAttribute" element
     */
    public void unsetEntity1IntersectAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITY1INTERSECTATTRIBUTE$2, 0);
        }
    }
    
    /**
     * Gets the "Entity1LogicalName" element
     */
    public java.lang.String getEntity1LogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITY1LOGICALNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Entity1LogicalName" element
     */
    public org.apache.xmlbeans.XmlString xgetEntity1LogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY1LOGICALNAME$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Entity1LogicalName" element
     */
    public boolean isNilEntity1LogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY1LOGICALNAME$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Entity1LogicalName" element
     */
    public boolean isSetEntity1LogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITY1LOGICALNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "Entity1LogicalName" element
     */
    public void setEntity1LogicalName(java.lang.String entity1LogicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITY1LOGICALNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITY1LOGICALNAME$4);
            }
            target.setStringValue(entity1LogicalName);
        }
    }
    
    /**
     * Sets (as xml) the "Entity1LogicalName" element
     */
    public void xsetEntity1LogicalName(org.apache.xmlbeans.XmlString entity1LogicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY1LOGICALNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITY1LOGICALNAME$4);
            }
            target.set(entity1LogicalName);
        }
    }
    
    /**
     * Nils the "Entity1LogicalName" element
     */
    public void setNilEntity1LogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY1LOGICALNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITY1LOGICALNAME$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Entity1LogicalName" element
     */
    public void unsetEntity1LogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITY1LOGICALNAME$4, 0);
        }
    }
    
    /**
     * Gets the "Entity2AssociatedMenuConfiguration" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration getEntity2AssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().find_element_user(ENTITY2ASSOCIATEDMENUCONFIGURATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Entity2AssociatedMenuConfiguration" element
     */
    public boolean isNilEntity2AssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().find_element_user(ENTITY2ASSOCIATEDMENUCONFIGURATION$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Entity2AssociatedMenuConfiguration" element
     */
    public boolean isSetEntity2AssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITY2ASSOCIATEDMENUCONFIGURATION$6) != 0;
        }
    }
    
    /**
     * Sets the "Entity2AssociatedMenuConfiguration" element
     */
    public void setEntity2AssociatedMenuConfiguration(com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration entity2AssociatedMenuConfiguration)
    {
        generatedSetterHelperImpl(entity2AssociatedMenuConfiguration, ENTITY2ASSOCIATEDMENUCONFIGURATION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Entity2AssociatedMenuConfiguration" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration addNewEntity2AssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().add_element_user(ENTITY2ASSOCIATEDMENUCONFIGURATION$6);
            return target;
        }
    }
    
    /**
     * Nils the "Entity2AssociatedMenuConfiguration" element
     */
    public void setNilEntity2AssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().find_element_user(ENTITY2ASSOCIATEDMENUCONFIGURATION$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().add_element_user(ENTITY2ASSOCIATEDMENUCONFIGURATION$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Entity2AssociatedMenuConfiguration" element
     */
    public void unsetEntity2AssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITY2ASSOCIATEDMENUCONFIGURATION$6, 0);
        }
    }
    
    /**
     * Gets the "Entity2IntersectAttribute" element
     */
    public java.lang.String getEntity2IntersectAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITY2INTERSECTATTRIBUTE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Entity2IntersectAttribute" element
     */
    public org.apache.xmlbeans.XmlString xgetEntity2IntersectAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY2INTERSECTATTRIBUTE$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Entity2IntersectAttribute" element
     */
    public boolean isNilEntity2IntersectAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY2INTERSECTATTRIBUTE$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Entity2IntersectAttribute" element
     */
    public boolean isSetEntity2IntersectAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITY2INTERSECTATTRIBUTE$8) != 0;
        }
    }
    
    /**
     * Sets the "Entity2IntersectAttribute" element
     */
    public void setEntity2IntersectAttribute(java.lang.String entity2IntersectAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITY2INTERSECTATTRIBUTE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITY2INTERSECTATTRIBUTE$8);
            }
            target.setStringValue(entity2IntersectAttribute);
        }
    }
    
    /**
     * Sets (as xml) the "Entity2IntersectAttribute" element
     */
    public void xsetEntity2IntersectAttribute(org.apache.xmlbeans.XmlString entity2IntersectAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY2INTERSECTATTRIBUTE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITY2INTERSECTATTRIBUTE$8);
            }
            target.set(entity2IntersectAttribute);
        }
    }
    
    /**
     * Nils the "Entity2IntersectAttribute" element
     */
    public void setNilEntity2IntersectAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY2INTERSECTATTRIBUTE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITY2INTERSECTATTRIBUTE$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Entity2IntersectAttribute" element
     */
    public void unsetEntity2IntersectAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITY2INTERSECTATTRIBUTE$8, 0);
        }
    }
    
    /**
     * Gets the "Entity2LogicalName" element
     */
    public java.lang.String getEntity2LogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITY2LOGICALNAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Entity2LogicalName" element
     */
    public org.apache.xmlbeans.XmlString xgetEntity2LogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY2LOGICALNAME$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Entity2LogicalName" element
     */
    public boolean isNilEntity2LogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY2LOGICALNAME$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Entity2LogicalName" element
     */
    public boolean isSetEntity2LogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITY2LOGICALNAME$10) != 0;
        }
    }
    
    /**
     * Sets the "Entity2LogicalName" element
     */
    public void setEntity2LogicalName(java.lang.String entity2LogicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITY2LOGICALNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITY2LOGICALNAME$10);
            }
            target.setStringValue(entity2LogicalName);
        }
    }
    
    /**
     * Sets (as xml) the "Entity2LogicalName" element
     */
    public void xsetEntity2LogicalName(org.apache.xmlbeans.XmlString entity2LogicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY2LOGICALNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITY2LOGICALNAME$10);
            }
            target.set(entity2LogicalName);
        }
    }
    
    /**
     * Nils the "Entity2LogicalName" element
     */
    public void setNilEntity2LogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY2LOGICALNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITY2LOGICALNAME$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Entity2LogicalName" element
     */
    public void unsetEntity2LogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITY2LOGICALNAME$10, 0);
        }
    }
    
    /**
     * Gets the "IntersectEntityName" element
     */
    public java.lang.String getIntersectEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERSECTENTITYNAME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IntersectEntityName" element
     */
    public org.apache.xmlbeans.XmlString xgetIntersectEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERSECTENTITYNAME$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IntersectEntityName" element
     */
    public boolean isNilIntersectEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERSECTENTITYNAME$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IntersectEntityName" element
     */
    public boolean isSetIntersectEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERSECTENTITYNAME$12) != 0;
        }
    }
    
    /**
     * Sets the "IntersectEntityName" element
     */
    public void setIntersectEntityName(java.lang.String intersectEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERSECTENTITYNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERSECTENTITYNAME$12);
            }
            target.setStringValue(intersectEntityName);
        }
    }
    
    /**
     * Sets (as xml) the "IntersectEntityName" element
     */
    public void xsetIntersectEntityName(org.apache.xmlbeans.XmlString intersectEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERSECTENTITYNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTERSECTENTITYNAME$12);
            }
            target.set(intersectEntityName);
        }
    }
    
    /**
     * Nils the "IntersectEntityName" element
     */
    public void setNilIntersectEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERSECTENTITYNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTERSECTENTITYNAME$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IntersectEntityName" element
     */
    public void unsetIntersectEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERSECTENTITYNAME$12, 0);
        }
    }
}
