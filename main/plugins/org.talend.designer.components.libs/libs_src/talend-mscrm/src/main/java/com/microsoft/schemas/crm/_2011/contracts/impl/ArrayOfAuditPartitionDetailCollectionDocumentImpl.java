/*
 * An XML document type.
 * Localname: ArrayOfAuditPartitionDetailCollection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfAuditPartitionDetailCollection(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfAuditPartitionDetailCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAuditPartitionDetailCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFAUDITPARTITIONDETAILCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAuditPartitionDetailCollection");
    
    
    /**
     * Gets the "ArrayOfAuditPartitionDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection getArrayOfAuditPartitionDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection)get_store().find_element_user(ARRAYOFAUDITPARTITIONDETAILCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfAuditPartitionDetailCollection" element
     */
    public boolean isNilArrayOfAuditPartitionDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection)get_store().find_element_user(ARRAYOFAUDITPARTITIONDETAILCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfAuditPartitionDetailCollection" element
     */
    public void setArrayOfAuditPartitionDetailCollection(com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection arrayOfAuditPartitionDetailCollection)
    {
        generatedSetterHelperImpl(arrayOfAuditPartitionDetailCollection, ARRAYOFAUDITPARTITIONDETAILCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfAuditPartitionDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection addNewArrayOfAuditPartitionDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection)get_store().add_element_user(ARRAYOFAUDITPARTITIONDETAILCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfAuditPartitionDetailCollection" element
     */
    public void setNilArrayOfAuditPartitionDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection)get_store().find_element_user(ARRAYOFAUDITPARTITIONDETAILCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailCollection)get_store().add_element_user(ARRAYOFAUDITPARTITIONDETAILCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
