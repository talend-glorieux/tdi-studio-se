/*
 * XML Type:  ArrayOfRelationshipAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfRelationshipAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfRelationshipAuditDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfRelationshipAuditDetail
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRelationshipAuditDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIPAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "RelationshipAuditDetail");
    
    
    /**
     * Gets array of all "RelationshipAuditDetail" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail[] getRelationshipAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATIONSHIPAUDITDETAIL$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail[] result = new com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RelationshipAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail getRelationshipAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail)get_store().find_element_user(RELATIONSHIPAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "RelationshipAuditDetail" element
     */
    public boolean isNilRelationshipAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail)get_store().find_element_user(RELATIONSHIPAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "RelationshipAuditDetail" element
     */
    public int sizeOfRelationshipAuditDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONSHIPAUDITDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "RelationshipAuditDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRelationshipAuditDetailArray(com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail[] relationshipAuditDetailArray)
    {
        check_orphaned();
        arraySetterHelper(relationshipAuditDetailArray, RELATIONSHIPAUDITDETAIL$0);
    }
    
    /**
     * Sets ith "RelationshipAuditDetail" element
     */
    public void setRelationshipAuditDetailArray(int i, com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail relationshipAuditDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail)get_store().find_element_user(RELATIONSHIPAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relationshipAuditDetail);
        }
    }
    
    /**
     * Nils the ith "RelationshipAuditDetail" element
     */
    public void setNilRelationshipAuditDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail)get_store().find_element_user(RELATIONSHIPAUDITDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelationshipAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail insertNewRelationshipAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail)get_store().insert_element_user(RELATIONSHIPAUDITDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelationshipAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail addNewRelationshipAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RelationshipAuditDetail)get_store().add_element_user(RELATIONSHIPAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RelationshipAuditDetail" element
     */
    public void removeRelationshipAuditDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONSHIPAUDITDETAIL$0, i);
        }
    }
}
