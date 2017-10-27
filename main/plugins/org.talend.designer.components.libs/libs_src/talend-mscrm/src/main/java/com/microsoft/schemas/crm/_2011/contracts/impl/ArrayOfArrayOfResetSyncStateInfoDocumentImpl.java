/*
 * An XML document type.
 * Localname: ArrayOfArrayOfResetSyncStateInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResetSyncStateInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfResetSyncStateInfo(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfResetSyncStateInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResetSyncStateInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfResetSyncStateInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFRESETSYNCSTATEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfResetSyncStateInfo");
    
    
    /**
     * Gets the "ArrayOfArrayOfResetSyncStateInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResetSyncStateInfo getArrayOfArrayOfResetSyncStateInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResetSyncStateInfo)get_store().find_element_user(ARRAYOFARRAYOFRESETSYNCSTATEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfResetSyncStateInfo" element
     */
    public boolean isNilArrayOfArrayOfResetSyncStateInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResetSyncStateInfo)get_store().find_element_user(ARRAYOFARRAYOFRESETSYNCSTATEINFO$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfResetSyncStateInfo" element
     */
    public void setArrayOfArrayOfResetSyncStateInfo(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResetSyncStateInfo arrayOfArrayOfResetSyncStateInfo)
    {
        generatedSetterHelperImpl(arrayOfArrayOfResetSyncStateInfo, ARRAYOFARRAYOFRESETSYNCSTATEINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfResetSyncStateInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResetSyncStateInfo addNewArrayOfArrayOfResetSyncStateInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResetSyncStateInfo)get_store().add_element_user(ARRAYOFARRAYOFRESETSYNCSTATEINFO$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfResetSyncStateInfo" element
     */
    public void setNilArrayOfArrayOfResetSyncStateInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResetSyncStateInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResetSyncStateInfo)get_store().find_element_user(ARRAYOFARRAYOFRESETSYNCSTATEINFO$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfResetSyncStateInfo)get_store().add_element_user(ARRAYOFARRAYOFRESETSYNCSTATEINFO$0);
            }
            target.setNil();
        }
    }
}
