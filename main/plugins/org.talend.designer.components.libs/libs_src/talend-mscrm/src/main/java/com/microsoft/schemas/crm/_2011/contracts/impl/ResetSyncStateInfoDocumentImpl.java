/*
 * An XML document type.
 * Localname: ResetSyncStateInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ResetSyncStateInfo(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ResetSyncStateInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResetSyncStateInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESETSYNCSTATEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ResetSyncStateInfo");
    
    
    /**
     * Gets the "ResetSyncStateInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo getResetSyncStateInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo)get_store().find_element_user(RESETSYNCSTATEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ResetSyncStateInfo" element
     */
    public boolean isNilResetSyncStateInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo)get_store().find_element_user(RESETSYNCSTATEINFO$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ResetSyncStateInfo" element
     */
    public void setResetSyncStateInfo(com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo resetSyncStateInfo)
    {
        generatedSetterHelperImpl(resetSyncStateInfo, RESETSYNCSTATEINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ResetSyncStateInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo addNewResetSyncStateInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo)get_store().add_element_user(RESETSYNCSTATEINFO$0);
            return target;
        }
    }
    
    /**
     * Nils the "ResetSyncStateInfo" element
     */
    public void setNilResetSyncStateInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo)get_store().find_element_user(RESETSYNCSTATEINFO$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ResetSyncStateInfo)get_store().add_element_user(RESETSYNCSTATEINFO$0);
            }
            target.setNil();
        }
    }
}
