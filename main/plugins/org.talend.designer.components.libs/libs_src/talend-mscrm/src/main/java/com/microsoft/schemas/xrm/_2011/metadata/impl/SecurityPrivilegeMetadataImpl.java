/*
 * XML Type:  SecurityPrivilegeMetadata
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML SecurityPrivilegeMetadata(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class SecurityPrivilegeMetadataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.SecurityPrivilegeMetadata
{
    private static final long serialVersionUID = 1L;
    
    public SecurityPrivilegeMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANBEBASIC$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanBeBasic");
    private static final javax.xml.namespace.QName CANBEDEEP$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanBeDeep");
    private static final javax.xml.namespace.QName CANBEGLOBAL$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanBeGlobal");
    private static final javax.xml.namespace.QName CANBELOCAL$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "CanBeLocal");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Name");
    private static final javax.xml.namespace.QName PRIVILEGEID$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "PrivilegeId");
    private static final javax.xml.namespace.QName PRIVILEGETYPE$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "PrivilegeType");
    
    
    /**
     * Gets the "CanBeBasic" element
     */
    public boolean getCanBeBasic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANBEBASIC$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "CanBeBasic" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCanBeBasic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBEBASIC$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "CanBeBasic" element
     */
    public boolean isSetCanBeBasic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANBEBASIC$0) != 0;
        }
    }
    
    /**
     * Sets the "CanBeBasic" element
     */
    public void setCanBeBasic(boolean canBeBasic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANBEBASIC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANBEBASIC$0);
            }
            target.setBooleanValue(canBeBasic);
        }
    }
    
    /**
     * Sets (as xml) the "CanBeBasic" element
     */
    public void xsetCanBeBasic(org.apache.xmlbeans.XmlBoolean canBeBasic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBEBASIC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CANBEBASIC$0);
            }
            target.set(canBeBasic);
        }
    }
    
    /**
     * Unsets the "CanBeBasic" element
     */
    public void unsetCanBeBasic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANBEBASIC$0, 0);
        }
    }
    
    /**
     * Gets the "CanBeDeep" element
     */
    public boolean getCanBeDeep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANBEDEEP$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "CanBeDeep" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCanBeDeep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBEDEEP$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CanBeDeep" element
     */
    public boolean isSetCanBeDeep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANBEDEEP$2) != 0;
        }
    }
    
    /**
     * Sets the "CanBeDeep" element
     */
    public void setCanBeDeep(boolean canBeDeep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANBEDEEP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANBEDEEP$2);
            }
            target.setBooleanValue(canBeDeep);
        }
    }
    
    /**
     * Sets (as xml) the "CanBeDeep" element
     */
    public void xsetCanBeDeep(org.apache.xmlbeans.XmlBoolean canBeDeep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBEDEEP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CANBEDEEP$2);
            }
            target.set(canBeDeep);
        }
    }
    
    /**
     * Unsets the "CanBeDeep" element
     */
    public void unsetCanBeDeep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANBEDEEP$2, 0);
        }
    }
    
    /**
     * Gets the "CanBeGlobal" element
     */
    public boolean getCanBeGlobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANBEGLOBAL$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "CanBeGlobal" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCanBeGlobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBEGLOBAL$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "CanBeGlobal" element
     */
    public boolean isSetCanBeGlobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANBEGLOBAL$4) != 0;
        }
    }
    
    /**
     * Sets the "CanBeGlobal" element
     */
    public void setCanBeGlobal(boolean canBeGlobal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANBEGLOBAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANBEGLOBAL$4);
            }
            target.setBooleanValue(canBeGlobal);
        }
    }
    
    /**
     * Sets (as xml) the "CanBeGlobal" element
     */
    public void xsetCanBeGlobal(org.apache.xmlbeans.XmlBoolean canBeGlobal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBEGLOBAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CANBEGLOBAL$4);
            }
            target.set(canBeGlobal);
        }
    }
    
    /**
     * Unsets the "CanBeGlobal" element
     */
    public void unsetCanBeGlobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANBEGLOBAL$4, 0);
        }
    }
    
    /**
     * Gets the "CanBeLocal" element
     */
    public boolean getCanBeLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANBELOCAL$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "CanBeLocal" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCanBeLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBELOCAL$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "CanBeLocal" element
     */
    public boolean isSetCanBeLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANBELOCAL$6) != 0;
        }
    }
    
    /**
     * Sets the "CanBeLocal" element
     */
    public void setCanBeLocal(boolean canBeLocal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANBELOCAL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANBELOCAL$6);
            }
            target.setBooleanValue(canBeLocal);
        }
    }
    
    /**
     * Sets (as xml) the "CanBeLocal" element
     */
    public void xsetCanBeLocal(org.apache.xmlbeans.XmlBoolean canBeLocal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANBELOCAL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CANBELOCAL$6);
            }
            target.set(canBeLocal);
        }
    }
    
    /**
     * Unsets the "CanBeLocal" element
     */
    public void unsetCanBeLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANBELOCAL$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$8, 0);
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
            return get_store().count_elements(NAME$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$8);
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
            get_store().remove_element(NAME$8, 0);
        }
    }
    
    /**
     * Gets the "PrivilegeId" element
     */
    public java.lang.String getPrivilegeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVILEGEID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrivilegeId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetPrivilegeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(PRIVILEGEID$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "PrivilegeId" element
     */
    public boolean isSetPrivilegeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIVILEGEID$10) != 0;
        }
    }
    
    /**
     * Sets the "PrivilegeId" element
     */
    public void setPrivilegeId(java.lang.String privilegeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVILEGEID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIVILEGEID$10);
            }
            target.setStringValue(privilegeId);
        }
    }
    
    /**
     * Sets (as xml) the "PrivilegeId" element
     */
    public void xsetPrivilegeId(com.microsoft.schemas._2003._10.serialization.Guid privilegeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(PRIVILEGEID$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(PRIVILEGEID$10);
            }
            target.set(privilegeId);
        }
    }
    
    /**
     * Unsets the "PrivilegeId" element
     */
    public void unsetPrivilegeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIVILEGEID$10, 0);
        }
    }
    
    /**
     * Gets the "PrivilegeType" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.PrivilegeType.Enum getPrivilegeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVILEGETYPE$12, 0);
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
            target = (com.microsoft.schemas.xrm._2011.metadata.PrivilegeType)get_store().find_element_user(PRIVILEGETYPE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "PrivilegeType" element
     */
    public boolean isSetPrivilegeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIVILEGETYPE$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVILEGETYPE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIVILEGETYPE$12);
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
            target = (com.microsoft.schemas.xrm._2011.metadata.PrivilegeType)get_store().find_element_user(PRIVILEGETYPE$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.PrivilegeType)get_store().add_element_user(PRIVILEGETYPE$12);
            }
            target.set(privilegeType);
        }
    }
    
    /**
     * Unsets the "PrivilegeType" element
     */
    public void unsetPrivilegeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIVILEGETYPE$12, 0);
        }
    }
}
