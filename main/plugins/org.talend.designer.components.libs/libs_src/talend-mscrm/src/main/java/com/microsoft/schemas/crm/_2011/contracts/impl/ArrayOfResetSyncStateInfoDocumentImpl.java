/*
 * An XML document type.
 * Localname: ArrayOfResetSyncStateInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfResetSyncStateInfo(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfResetSyncStateInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfResetSyncStateInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFRESETSYNCSTATEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfResetSyncStateInfo");
    
    
    /**
     * Gets the "ArrayOfResetSyncStateInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo getArrayOfResetSyncStateInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo)get_store().find_element_user(ARRAYOFRESETSYNCSTATEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfResetSyncStateInfo" element
     */
    public boolean isNilArrayOfResetSyncStateInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo)get_store().find_element_user(ARRAYOFRESETSYNCSTATEINFO$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfResetSyncStateInfo" element
     */
    public void setArrayOfResetSyncStateInfo(com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo arrayOfResetSyncStateInfo)
    {
        generatedSetterHelperImpl(arrayOfResetSyncStateInfo, ARRAYOFRESETSYNCSTATEINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfResetSyncStateInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo addNewArrayOfResetSyncStateInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo)get_store().add_element_user(ARRAYOFRESETSYNCSTATEINFO$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfResetSyncStateInfo" element
     */
    public void setNilArrayOfResetSyncStateInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo)get_store().find_element_user(ARRAYOFRESETSYNCSTATEINFO$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfResetSyncStateInfo)get_store().add_element_user(ARRAYOFRESETSYNCSTATEINFO$0);
            }
            target.setNil();
        }
    }
}
