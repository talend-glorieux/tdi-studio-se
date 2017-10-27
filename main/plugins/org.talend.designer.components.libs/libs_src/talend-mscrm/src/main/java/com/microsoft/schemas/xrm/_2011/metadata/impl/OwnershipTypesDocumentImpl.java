/*
 * An XML document type.
 * Localname: OwnershipTypes
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.OwnershipTypesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * A document containing one OwnershipTypes(@http://schemas.microsoft.com/xrm/2011/Metadata) element.
 *
 * This is a complex type.
 */
public class OwnershipTypesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.OwnershipTypesDocument
{
    private static final long serialVersionUID = 1L;
    
    public OwnershipTypesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OWNERSHIPTYPES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "OwnershipTypes");
    
    
    /**
     * Gets the "OwnershipTypes" element
     */
    public java.util.List getOwnershipTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERSHIPTYPES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "OwnershipTypes" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes xgetOwnershipTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes)get_store().find_element_user(OWNERSHIPTYPES$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OwnershipTypes" element
     */
    public boolean isNilOwnershipTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes)get_store().find_element_user(OWNERSHIPTYPES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OwnershipTypes" element
     */
    public void setOwnershipTypes(java.util.List ownershipTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERSHIPTYPES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNERSHIPTYPES$0);
            }
            target.setListValue(ownershipTypes);
        }
    }
    
    /**
     * Sets (as xml) the "OwnershipTypes" element
     */
    public void xsetOwnershipTypes(com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes ownershipTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes)get_store().find_element_user(OWNERSHIPTYPES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes)get_store().add_element_user(OWNERSHIPTYPES$0);
            }
            target.set(ownershipTypes);
        }
    }
    
    /**
     * Nils the "OwnershipTypes" element
     */
    public void setNilOwnershipTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes)get_store().find_element_user(OWNERSHIPTYPES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.OwnershipTypes)get_store().add_element_user(OWNERSHIPTYPES$0);
            }
            target.setNil();
        }
    }
}
