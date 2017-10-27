/*
 * An XML document type.
 * Localname: SyncAction
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.SyncActionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one SyncAction(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class SyncActionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.SyncActionDocument
{
    private static final long serialVersionUID = 1L;
    
    public SyncActionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYNCACTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SyncAction");
    
    
    /**
     * Gets the "SyncAction" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SyncAction.Enum getSyncAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYNCACTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2011.contracts.SyncAction.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SyncAction" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SyncAction xgetSyncAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SyncAction)get_store().find_element_user(SYNCACTION$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SyncAction" element
     */
    public boolean isNilSyncAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SyncAction)get_store().find_element_user(SYNCACTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SyncAction" element
     */
    public void setSyncAction(com.microsoft.schemas.crm._2011.contracts.SyncAction.Enum syncAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYNCACTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYNCACTION$0);
            }
            target.setEnumValue(syncAction);
        }
    }
    
    /**
     * Sets (as xml) the "SyncAction" element
     */
    public void xsetSyncAction(com.microsoft.schemas.crm._2011.contracts.SyncAction syncAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SyncAction)get_store().find_element_user(SYNCACTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.SyncAction)get_store().add_element_user(SYNCACTION$0);
            }
            target.set(syncAction);
        }
    }
    
    /**
     * Nils the "SyncAction" element
     */
    public void setNilSyncAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SyncAction)get_store().find_element_user(SYNCACTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.SyncAction)get_store().add_element_user(SYNCACTION$0);
            }
            target.setNil();
        }
    }
}
