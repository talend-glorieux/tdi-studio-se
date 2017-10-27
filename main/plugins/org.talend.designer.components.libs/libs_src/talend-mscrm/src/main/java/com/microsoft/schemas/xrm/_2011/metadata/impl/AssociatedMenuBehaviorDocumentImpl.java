/*
 * An XML document type.
 * Localname: AssociatedMenuBehavior
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehaviorDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one AssociatedMenuBehavior(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class AssociatedMenuBehaviorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehaviorDocument
{
    private static final long serialVersionUID = 1L;
    
    public AssociatedMenuBehaviorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSOCIATEDMENUBEHAVIOR$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "AssociatedMenuBehavior");
    
    
    /**
     * Gets the "AssociatedMenuBehavior" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior.Enum getAssociatedMenuBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSOCIATEDMENUBEHAVIOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "AssociatedMenuBehavior" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior xgetAssociatedMenuBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior)get_store().find_element_user(ASSOCIATEDMENUBEHAVIOR$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AssociatedMenuBehavior" element
     */
    public boolean isNilAssociatedMenuBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior)get_store().find_element_user(ASSOCIATEDMENUBEHAVIOR$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AssociatedMenuBehavior" element
     */
    public void setAssociatedMenuBehavior(com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior.Enum associatedMenuBehavior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSOCIATEDMENUBEHAVIOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSOCIATEDMENUBEHAVIOR$0);
            }
            target.setEnumValue(associatedMenuBehavior);
        }
    }
    
    /**
     * Sets (as xml) the "AssociatedMenuBehavior" element
     */
    public void xsetAssociatedMenuBehavior(com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior associatedMenuBehavior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior)get_store().find_element_user(ASSOCIATEDMENUBEHAVIOR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior)get_store().add_element_user(ASSOCIATEDMENUBEHAVIOR$0);
            }
            target.set(associatedMenuBehavior);
        }
    }
    
    /**
     * Nils the "AssociatedMenuBehavior" element
     */
    public void setNilAssociatedMenuBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior)get_store().find_element_user(ASSOCIATEDMENUBEHAVIOR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuBehavior)get_store().add_element_user(ASSOCIATEDMENUBEHAVIOR$0);
            }
            target.setNil();
        }
    }
}
