/*
 * An XML document type.
 * Localname: AssociatedMenuGroup
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroupDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one AssociatedMenuGroup(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class AssociatedMenuGroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public AssociatedMenuGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSOCIATEDMENUGROUP$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "AssociatedMenuGroup");
    
    
    /**
     * Gets the "AssociatedMenuGroup" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup.Enum getAssociatedMenuGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSOCIATEDMENUGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "AssociatedMenuGroup" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup xgetAssociatedMenuGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup)get_store().find_element_user(ASSOCIATEDMENUGROUP$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AssociatedMenuGroup" element
     */
    public boolean isNilAssociatedMenuGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup)get_store().find_element_user(ASSOCIATEDMENUGROUP$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AssociatedMenuGroup" element
     */
    public void setAssociatedMenuGroup(com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup.Enum associatedMenuGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSOCIATEDMENUGROUP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSOCIATEDMENUGROUP$0);
            }
            target.setEnumValue(associatedMenuGroup);
        }
    }
    
    /**
     * Sets (as xml) the "AssociatedMenuGroup" element
     */
    public void xsetAssociatedMenuGroup(com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup associatedMenuGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup)get_store().find_element_user(ASSOCIATEDMENUGROUP$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup)get_store().add_element_user(ASSOCIATEDMENUGROUP$0);
            }
            target.set(associatedMenuGroup);
        }
    }
    
    /**
     * Nils the "AssociatedMenuGroup" element
     */
    public void setNilAssociatedMenuGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup)get_store().find_element_user(ASSOCIATEDMENUGROUP$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.AssociatedMenuGroup)get_store().add_element_user(ASSOCIATEDMENUGROUP$0);
            }
            target.setNil();
        }
    }
}
