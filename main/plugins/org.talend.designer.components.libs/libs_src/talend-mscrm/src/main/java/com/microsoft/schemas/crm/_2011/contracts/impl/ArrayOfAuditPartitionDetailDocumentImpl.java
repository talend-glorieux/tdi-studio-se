/*
 * An XML document type.
 * Localname: ArrayOfAuditPartitionDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfAuditPartitionDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfAuditPartitionDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAuditPartitionDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFAUDITPARTITIONDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAuditPartitionDetail");
    
    
    /**
     * Gets the "ArrayOfAuditPartitionDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail getArrayOfAuditPartitionDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail)get_store().find_element_user(ARRAYOFAUDITPARTITIONDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfAuditPartitionDetail" element
     */
    public boolean isNilArrayOfAuditPartitionDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail)get_store().find_element_user(ARRAYOFAUDITPARTITIONDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfAuditPartitionDetail" element
     */
    public void setArrayOfAuditPartitionDetail(com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail arrayOfAuditPartitionDetail)
    {
        generatedSetterHelperImpl(arrayOfAuditPartitionDetail, ARRAYOFAUDITPARTITIONDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfAuditPartitionDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail addNewArrayOfAuditPartitionDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail)get_store().add_element_user(ARRAYOFAUDITPARTITIONDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfAuditPartitionDetail" element
     */
    public void setNilArrayOfAuditPartitionDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail)get_store().find_element_user(ARRAYOFAUDITPARTITIONDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditPartitionDetail)get_store().add_element_user(ARRAYOFAUDITPARTITIONDETAIL$0);
            }
            target.setNil();
        }
    }
}
