/*
 * XML Type:  CascadeConfiguration
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML CascadeConfiguration(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class CascadeConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.CascadeConfiguration
{
    private static final long serialVersionUID = 1L;
    
    public CascadeConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSIGN$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Assign");
    private static final javax.xml.namespace.QName DELETE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Delete");
    private static final javax.xml.namespace.QName MERGE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Merge");
    private static final javax.xml.namespace.QName REPARENT$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Reparent");
    private static final javax.xml.namespace.QName SHARE$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Share");
    private static final javax.xml.namespace.QName UNSHARE$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Unshare");
    
    
    /**
     * Gets the "Assign" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum getAssign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGN$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Assign" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType xgetAssign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(ASSIGN$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Assign" element
     */
    public boolean isNilAssign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(ASSIGN$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Assign" element
     */
    public boolean isSetAssign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSIGN$0) != 0;
        }
    }
    
    /**
     * Sets the "Assign" element
     */
    public void setAssign(com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum assign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGN$0);
            }
            target.setEnumValue(assign);
        }
    }
    
    /**
     * Sets (as xml) the "Assign" element
     */
    public void xsetAssign(com.microsoft.schemas.xrm._2011.metadata.CascadeType assign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(ASSIGN$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().add_element_user(ASSIGN$0);
            }
            target.set(assign);
        }
    }
    
    /**
     * Nils the "Assign" element
     */
    public void setNilAssign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(ASSIGN$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().add_element_user(ASSIGN$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Assign" element
     */
    public void unsetAssign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSIGN$0, 0);
        }
    }
    
    /**
     * Gets the "Delete" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum getDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Delete" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType xgetDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(DELETE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Delete" element
     */
    public boolean isNilDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(DELETE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Delete" element
     */
    public boolean isSetDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELETE$2) != 0;
        }
    }
    
    /**
     * Sets the "Delete" element
     */
    public void setDelete(com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum delete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELETE$2);
            }
            target.setEnumValue(delete);
        }
    }
    
    /**
     * Sets (as xml) the "Delete" element
     */
    public void xsetDelete(com.microsoft.schemas.xrm._2011.metadata.CascadeType delete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(DELETE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().add_element_user(DELETE$2);
            }
            target.set(delete);
        }
    }
    
    /**
     * Nils the "Delete" element
     */
    public void setNilDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(DELETE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().add_element_user(DELETE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Delete" element
     */
    public void unsetDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELETE$2, 0);
        }
    }
    
    /**
     * Gets the "Merge" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum getMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MERGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Merge" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType xgetMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(MERGE$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Merge" element
     */
    public boolean isNilMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(MERGE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Merge" element
     */
    public boolean isSetMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MERGE$4) != 0;
        }
    }
    
    /**
     * Sets the "Merge" element
     */
    public void setMerge(com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum merge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MERGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MERGE$4);
            }
            target.setEnumValue(merge);
        }
    }
    
    /**
     * Sets (as xml) the "Merge" element
     */
    public void xsetMerge(com.microsoft.schemas.xrm._2011.metadata.CascadeType merge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(MERGE$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().add_element_user(MERGE$4);
            }
            target.set(merge);
        }
    }
    
    /**
     * Nils the "Merge" element
     */
    public void setNilMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(MERGE$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().add_element_user(MERGE$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Merge" element
     */
    public void unsetMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MERGE$4, 0);
        }
    }
    
    /**
     * Gets the "Reparent" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum getReparent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPARENT$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Reparent" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType xgetReparent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(REPARENT$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Reparent" element
     */
    public boolean isNilReparent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(REPARENT$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Reparent" element
     */
    public boolean isSetReparent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPARENT$6) != 0;
        }
    }
    
    /**
     * Sets the "Reparent" element
     */
    public void setReparent(com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum reparent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPARENT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPARENT$6);
            }
            target.setEnumValue(reparent);
        }
    }
    
    /**
     * Sets (as xml) the "Reparent" element
     */
    public void xsetReparent(com.microsoft.schemas.xrm._2011.metadata.CascadeType reparent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(REPARENT$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().add_element_user(REPARENT$6);
            }
            target.set(reparent);
        }
    }
    
    /**
     * Nils the "Reparent" element
     */
    public void setNilReparent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(REPARENT$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().add_element_user(REPARENT$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Reparent" element
     */
    public void unsetReparent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPARENT$6, 0);
        }
    }
    
    /**
     * Gets the "Share" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum getShare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHARE$8, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Share" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType xgetShare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(SHARE$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Share" element
     */
    public boolean isNilShare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(SHARE$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Share" element
     */
    public boolean isSetShare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHARE$8) != 0;
        }
    }
    
    /**
     * Sets the "Share" element
     */
    public void setShare(com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum share)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHARE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHARE$8);
            }
            target.setEnumValue(share);
        }
    }
    
    /**
     * Sets (as xml) the "Share" element
     */
    public void xsetShare(com.microsoft.schemas.xrm._2011.metadata.CascadeType share)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(SHARE$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().add_element_user(SHARE$8);
            }
            target.set(share);
        }
    }
    
    /**
     * Nils the "Share" element
     */
    public void setNilShare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(SHARE$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().add_element_user(SHARE$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Share" element
     */
    public void unsetShare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHARE$8, 0);
        }
    }
    
    /**
     * Gets the "Unshare" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum getUnshare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSHARE$10, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Unshare" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.CascadeType xgetUnshare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(UNSHARE$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Unshare" element
     */
    public boolean isNilUnshare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(UNSHARE$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Unshare" element
     */
    public boolean isSetUnshare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNSHARE$10) != 0;
        }
    }
    
    /**
     * Sets the "Unshare" element
     */
    public void setUnshare(com.microsoft.schemas.xrm._2011.metadata.CascadeType.Enum unshare)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSHARE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNSHARE$10);
            }
            target.setEnumValue(unshare);
        }
    }
    
    /**
     * Sets (as xml) the "Unshare" element
     */
    public void xsetUnshare(com.microsoft.schemas.xrm._2011.metadata.CascadeType unshare)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(UNSHARE$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().add_element_user(UNSHARE$10);
            }
            target.set(unshare);
        }
    }
    
    /**
     * Nils the "Unshare" element
     */
    public void setNilUnshare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.CascadeType target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().find_element_user(UNSHARE$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.CascadeType)get_store().add_element_user(UNSHARE$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Unshare" element
     */
    public void unsetUnshare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNSHARE$10, 0);
        }
    }
}
