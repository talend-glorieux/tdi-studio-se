/*
 * XML Type:  AssociatedMenuConfiguration
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML AssociatedMenuConfiguration(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class AssociatedMenuConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuConfiguration
{
    private static final long serialVersionUID = 1L;
    
    public AssociatedMenuConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEHAVIOR$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Behavior");
    private static final javax.xml.namespace.QName GROUP$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Group");
    private static final javax.xml.namespace.QName LABEL$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Label");
    private static final javax.xml.namespace.QName ORDER$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "Order");
    
    
    /**
     * Gets the "Behavior" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior.Enum getBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEHAVIOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Behavior" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior xgetBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior)get_store().find_element_user(BEHAVIOR$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Behavior" element
     */
    public boolean isNilBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior)get_store().find_element_user(BEHAVIOR$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Behavior" element
     */
    public boolean isSetBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEHAVIOR$0) != 0;
        }
    }
    
    /**
     * Sets the "Behavior" element
     */
    public void setBehavior(com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior.Enum behavior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEHAVIOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEHAVIOR$0);
            }
            target.setEnumValue(behavior);
        }
    }
    
    /**
     * Sets (as xml) the "Behavior" element
     */
    public void xsetBehavior(com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior behavior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior)get_store().find_element_user(BEHAVIOR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior)get_store().add_element_user(BEHAVIOR$0);
            }
            target.set(behavior);
        }
    }
    
    /**
     * Nils the "Behavior" element
     */
    public void setNilBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior)get_store().find_element_user(BEHAVIOR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior)get_store().add_element_user(BEHAVIOR$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Behavior" element
     */
    public void unsetBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEHAVIOR$0, 0);
        }
    }
    
    /**
     * Gets the "Group" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup.Enum getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUP$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Group" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup xgetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup)get_store().find_element_user(GROUP$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Group" element
     */
    public boolean isNilGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup)get_store().find_element_user(GROUP$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Group" element
     */
    public boolean isSetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$2) != 0;
        }
    }
    
    /**
     * Sets the "Group" element
     */
    public void setGroup(com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup.Enum group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUP$2);
            }
            target.setEnumValue(group);
        }
    }
    
    /**
     * Sets (as xml) the "Group" element
     */
    public void xsetGroup(com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup)get_store().find_element_user(GROUP$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup)get_store().add_element_user(GROUP$2);
            }
            target.set(group);
        }
    }
    
    /**
     * Nils the "Group" element
     */
    public void setNilGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup)get_store().find_element_user(GROUP$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup)get_store().add_element_user(GROUP$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Group" element
     */
    public void unsetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$2, 0);
        }
    }
    
    /**
     * Gets the "Label" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(LABEL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Label" element
     */
    public boolean isNilLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(LABEL$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Label" element
     */
    public boolean isSetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LABEL$4) != 0;
        }
    }
    
    /**
     * Sets the "Label" element
     */
    public void setLabel(com.microsoft.schemas.xrm._2011.contracts.Label label)
    {
        generatedSetterHelperImpl(label, LABEL$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Label" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Label addNewLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(LABEL$4);
            return target;
        }
    }
    
    /**
     * Nils the "Label" element
     */
    public void setNilLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Label target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().find_element_user(LABEL$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Label)get_store().add_element_user(LABEL$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Label" element
     */
    public void unsetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LABEL$4, 0);
        }
    }
    
    /**
     * Gets the "Order" element
     */
    public int getOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDER$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Order" element
     */
    public org.apache.xmlbeans.XmlInt xgetOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDER$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Order" element
     */
    public boolean isNilOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDER$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Order" element
     */
    public boolean isSetOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDER$6) != 0;
        }
    }
    
    /**
     * Sets the "Order" element
     */
    public void setOrder(int order)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDER$6);
            }
            target.setIntValue(order);
        }
    }
    
    /**
     * Sets (as xml) the "Order" element
     */
    public void xsetOrder(org.apache.xmlbeans.XmlInt order)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ORDER$6);
            }
            target.set(order);
        }
    }
    
    /**
     * Nils the "Order" element
     */
    public void setNilOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ORDER$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Order" element
     */
    public void unsetOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDER$6, 0);
        }
    }
}
