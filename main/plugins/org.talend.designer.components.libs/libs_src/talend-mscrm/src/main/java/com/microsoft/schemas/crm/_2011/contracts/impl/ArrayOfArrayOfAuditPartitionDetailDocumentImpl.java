/*
 * An XML document type.
 * Localname: ArrayOfArrayOfAuditPartitionDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfAuditPartitionDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfAuditPartitionDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfAuditPartitionDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFAUDITPARTITIONDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfAuditPartitionDetail");
    
    
    /**
     * Gets the "ArrayOfArrayOfAuditPartitionDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetail getArrayOfArrayOfAuditPartitionDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetail)get_store().find_element_user(ARRAYOFARRAYOFAUDITPARTITIONDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfAuditPartitionDetail" element
     */
    public boolean isNilArrayOfArrayOfAuditPartitionDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetail)get_store().find_element_user(ARRAYOFARRAYOFAUDITPARTITIONDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfAuditPartitionDetail" element
     */
    public void setArrayOfArrayOfAuditPartitionDetail(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetail arrayOfArrayOfAuditPartitionDetail)
    {
        generatedSetterHelperImpl(arrayOfArrayOfAuditPartitionDetail, ARRAYOFARRAYOFAUDITPARTITIONDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfAuditPartitionDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetail addNewArrayOfArrayOfAuditPartitionDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetail)get_store().add_element_user(ARRAYOFARRAYOFAUDITPARTITIONDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfAuditPartitionDetail" element
     */
    public void setNilArrayOfArrayOfAuditPartitionDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetail)get_store().find_element_user(ARRAYOFARRAYOFAUDITPARTITIONDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditPartitionDetail)get_store().add_element_user(ARRAYOFARRAYOFAUDITPARTITIONDETAIL$0);
            }
            target.setNil();
        }
    }
}
