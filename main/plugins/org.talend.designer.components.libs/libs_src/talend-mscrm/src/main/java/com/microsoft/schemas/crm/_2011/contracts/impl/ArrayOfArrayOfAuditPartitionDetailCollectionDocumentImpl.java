/*
 * An XML document type.
 * Localname: ArrayOfArrayOfAuditPartitionDetailCollection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetailCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfAuditPartitionDetailCollection(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfAuditPartitionDetailCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetailCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfAuditPartitionDetailCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFAUDITPARTITIONDETAILCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfAuditPartitionDetailCollection");
    
    
    /**
     * Gets the "ArrayOfArrayOfAuditPartitionDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetailCollection getArrayOfArrayOfAuditPartitionDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetailCollection)get_store().find_element_user(ARRAYOFARRAYOFAUDITPARTITIONDETAILCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfAuditPartitionDetailCollection" element
     */
    public boolean isNilArrayOfArrayOfAuditPartitionDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetailCollection)get_store().find_element_user(ARRAYOFARRAYOFAUDITPARTITIONDETAILCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfAuditPartitionDetailCollection" element
     */
    public void setArrayOfArrayOfAuditPartitionDetailCollection(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetailCollection arrayOfArrayOfAuditPartitionDetailCollection)
    {
        generatedSetterHelperImpl(arrayOfArrayOfAuditPartitionDetailCollection, ARRAYOFARRAYOFAUDITPARTITIONDETAILCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfAuditPartitionDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetailCollection addNewArrayOfArrayOfAuditPartitionDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetailCollection)get_store().add_element_user(ARRAYOFARRAYOFAUDITPARTITIONDETAILCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfAuditPartitionDetailCollection" element
     */
    public void setNilArrayOfArrayOfAuditPartitionDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetailCollection)get_store().find_element_user(ARRAYOFARRAYOFAUDITPARTITIONDETAILCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetailCollection)get_store().add_element_user(ARRAYOFARRAYOFAUDITPARTITIONDETAILCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
