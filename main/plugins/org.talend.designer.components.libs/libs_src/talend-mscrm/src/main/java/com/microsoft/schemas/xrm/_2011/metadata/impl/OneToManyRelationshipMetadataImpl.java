/*
 * XML Type:  OneToManyRelationshipMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML OneToManyRelationshipMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class OneToManyRelationshipMetadataImpl extends com.microsoft.schemas.xrm._2011.metadata.impl.RelationshipMetadataBaseImpl implements com.microsoft.schemas.xrm._2011.metadata.OneToManyRelationshipMetadata
{
    private static final long serialVersionUID = 1L;
    
    public OneToManyRelationshipMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSOCIATEDMENUCONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "AssociatedMenuConfiguration");
    private static final javax.xml.namespace.QName CASCADECONFIGURATION$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CascadeConfiguration");
    private static final javax.xml.namespace.QName ISHIERARCHICAL$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "IsHierarchical");
    private static final javax.xml.namespace.QName REFERENCEDATTRIBUTE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ReferencedAttribute");
    private static final javax.xml.namespace.QName REFERENCEDENTITY$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ReferencedEntity");
    private static final javax.xml.namespace.QName REFERENCINGATTRIBUTE$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ReferencingAttribute");
    private static final javax.xml.namespace.QName REFERENCINGENTITY$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ReferencingEntity");
    
    
    /**
     * Gets the "AssociatedMenuConfiguration" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration getAssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().find_element_user(ASSOCIATEDMENUCONFIGURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AssociatedMenuConfiguration" element
     */
    public boolean isNilAssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().find_element_user(ASSOCIATEDMENUCONFIGURATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AssociatedMenuConfiguration" element
     */
    public boolean isSetAssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSOCIATEDMENUCONFIGURATION$0) != 0;
        }
    }
    
    /**
     * Sets the "AssociatedMenuConfiguration" element
     */
    public void setAssociatedMenuConfiguration(com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration associatedMenuConfiguration)
    {
        generatedSetterHelperImpl(associatedMenuConfiguration, ASSOCIATEDMENUCONFIGURATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AssociatedMenuConfiguration" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration addNewAssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().add_element_user(ASSOCIATEDMENUCONFIGURATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "AssociatedMenuConfiguration" element
     */
    public void setNilAssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().find_element_user(ASSOCIATEDMENUCONFIGURATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration)get_store().add_element_user(ASSOCIATEDMENUCONFIGURATION$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AssociatedMenuConfiguration" element
     */
    public void unsetAssociatedMenuConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSOCIATEDMENUCONFIGURATION$0, 0);
        }
    }
    
    /**
     * Gets the "CascadeConfiguration" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration getCascadeConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration)get_store().find_element_user(CASCADECONFIGURATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CascadeConfiguration" element
     */
    public boolean isNilCascadeConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration)get_store().find_element_user(CASCADECONFIGURATION$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CascadeConfiguration" element
     */
    public boolean isSetCascadeConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CASCADECONFIGURATION$2) != 0;
        }
    }
    
    /**
     * Sets the "CascadeConfiguration" element
     */
    public void setCascadeConfiguration(com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration cascadeConfiguration)
    {
        generatedSetterHelperImpl(cascadeConfiguration, CASCADECONFIGURATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CascadeConfiguration" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration addNewCascadeConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration)get_store().add_element_user(CASCADECONFIGURATION$2);
            return target;
        }
    }
    
    /**
     * Nils the "CascadeConfiguration" element
     */
    public void setNilCascadeConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration)get_store().find_element_user(CASCADECONFIGURATION$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration)get_store().add_element_user(CASCADECONFIGURATION$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CascadeConfiguration" element
     */
    public void unsetCascadeConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CASCADECONFIGURATION$2, 0);
        }
    }
    
    /**
     * Gets the "IsHierarchical" element
     */
    public boolean getIsHierarchical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISHIERARCHICAL$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsHierarchical" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsHierarchical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISHIERARCHICAL$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "IsHierarchical" element
     */
    public boolean isNilIsHierarchical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISHIERARCHICAL$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "IsHierarchical" element
     */
    public boolean isSetIsHierarchical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISHIERARCHICAL$4) != 0;
        }
    }
    
    /**
     * Sets the "IsHierarchical" element
     */
    public void setIsHierarchical(boolean isHierarchical)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISHIERARCHICAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISHIERARCHICAL$4);
            }
            target.setBooleanValue(isHierarchical);
        }
    }
    
    /**
     * Sets (as xml) the "IsHierarchical" element
     */
    public void xsetIsHierarchical(org.apache.xmlbeans.XmlBoolean isHierarchical)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISHIERARCHICAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISHIERARCHICAL$4);
            }
            target.set(isHierarchical);
        }
    }
    
    /**
     * Nils the "IsHierarchical" element
     */
    public void setNilIsHierarchical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISHIERARCHICAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISHIERARCHICAL$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "IsHierarchical" element
     */
    public void unsetIsHierarchical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISHIERARCHICAL$4, 0);
        }
    }
    
    /**
     * Gets the "ReferencedAttribute" element
     */
    public java.lang.String getReferencedAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEDATTRIBUTE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReferencedAttribute" element
     */
    public org.apache.xmlbeans.XmlString xgetReferencedAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCEDATTRIBUTE$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ReferencedAttribute" element
     */
    public boolean isNilReferencedAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCEDATTRIBUTE$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ReferencedAttribute" element
     */
    public boolean isSetReferencedAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCEDATTRIBUTE$6) != 0;
        }
    }
    
    /**
     * Sets the "ReferencedAttribute" element
     */
    public void setReferencedAttribute(java.lang.String referencedAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEDATTRIBUTE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCEDATTRIBUTE$6);
            }
            target.setStringValue(referencedAttribute);
        }
    }
    
    /**
     * Sets (as xml) the "ReferencedAttribute" element
     */
    public void xsetReferencedAttribute(org.apache.xmlbeans.XmlString referencedAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCEDATTRIBUTE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCEDATTRIBUTE$6);
            }
            target.set(referencedAttribute);
        }
    }
    
    /**
     * Nils the "ReferencedAttribute" element
     */
    public void setNilReferencedAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCEDATTRIBUTE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCEDATTRIBUTE$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ReferencedAttribute" element
     */
    public void unsetReferencedAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCEDATTRIBUTE$6, 0);
        }
    }
    
    /**
     * Gets the "ReferencedEntity" element
     */
    public java.lang.String getReferencedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEDENTITY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReferencedEntity" element
     */
    public org.apache.xmlbeans.XmlString xgetReferencedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCEDENTITY$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ReferencedEntity" element
     */
    public boolean isNilReferencedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCEDENTITY$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ReferencedEntity" element
     */
    public boolean isSetReferencedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCEDENTITY$8) != 0;
        }
    }
    
    /**
     * Sets the "ReferencedEntity" element
     */
    public void setReferencedEntity(java.lang.String referencedEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEDENTITY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCEDENTITY$8);
            }
            target.setStringValue(referencedEntity);
        }
    }
    
    /**
     * Sets (as xml) the "ReferencedEntity" element
     */
    public void xsetReferencedEntity(org.apache.xmlbeans.XmlString referencedEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCEDENTITY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCEDENTITY$8);
            }
            target.set(referencedEntity);
        }
    }
    
    /**
     * Nils the "ReferencedEntity" element
     */
    public void setNilReferencedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCEDENTITY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCEDENTITY$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ReferencedEntity" element
     */
    public void unsetReferencedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCEDENTITY$8, 0);
        }
    }
    
    /**
     * Gets the "ReferencingAttribute" element
     */
    public java.lang.String getReferencingAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCINGATTRIBUTE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReferencingAttribute" element
     */
    public org.apache.xmlbeans.XmlString xgetReferencingAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCINGATTRIBUTE$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ReferencingAttribute" element
     */
    public boolean isNilReferencingAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCINGATTRIBUTE$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ReferencingAttribute" element
     */
    public boolean isSetReferencingAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCINGATTRIBUTE$10) != 0;
        }
    }
    
    /**
     * Sets the "ReferencingAttribute" element
     */
    public void setReferencingAttribute(java.lang.String referencingAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCINGATTRIBUTE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCINGATTRIBUTE$10);
            }
            target.setStringValue(referencingAttribute);
        }
    }
    
    /**
     * Sets (as xml) the "ReferencingAttribute" element
     */
    public void xsetReferencingAttribute(org.apache.xmlbeans.XmlString referencingAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCINGATTRIBUTE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCINGATTRIBUTE$10);
            }
            target.set(referencingAttribute);
        }
    }
    
    /**
     * Nils the "ReferencingAttribute" element
     */
    public void setNilReferencingAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCINGATTRIBUTE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCINGATTRIBUTE$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ReferencingAttribute" element
     */
    public void unsetReferencingAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCINGATTRIBUTE$10, 0);
        }
    }
    
    /**
     * Gets the "ReferencingEntity" element
     */
    public java.lang.String getReferencingEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCINGENTITY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReferencingEntity" element
     */
    public org.apache.xmlbeans.XmlString xgetReferencingEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCINGENTITY$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ReferencingEntity" element
     */
    public boolean isNilReferencingEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCINGENTITY$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ReferencingEntity" element
     */
    public boolean isSetReferencingEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCINGENTITY$12) != 0;
        }
    }
    
    /**
     * Sets the "ReferencingEntity" element
     */
    public void setReferencingEntity(java.lang.String referencingEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCINGENTITY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCINGENTITY$12);
            }
            target.setStringValue(referencingEntity);
        }
    }
    
    /**
     * Sets (as xml) the "ReferencingEntity" element
     */
    public void xsetReferencingEntity(org.apache.xmlbeans.XmlString referencingEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCINGENTITY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCINGENTITY$12);
            }
            target.set(referencingEntity);
        }
    }
    
    /**
     * Nils the "ReferencingEntity" element
     */
    public void setNilReferencingEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCINGENTITY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCINGENTITY$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ReferencingEntity" element
     */
    public void unsetReferencingEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCINGENTITY$12, 0);
        }
    }
}
