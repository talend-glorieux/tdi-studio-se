/*
 * An XML document type.
 * Localname: ArrayOfUserAccessAuditDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfUserAccessAuditDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfUserAccessAuditDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfUserAccessAuditDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFUSERACCESSAUDITDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfUserAccessAuditDetail");
    
    
    /**
     * Gets the "ArrayOfUserAccessAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail getArrayOfUserAccessAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail)get_store().find_element_user(ARRAYOFUSERACCESSAUDITDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfUserAccessAuditDetail" element
     */
    public boolean isNilArrayOfUserAccessAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail)get_store().find_element_user(ARRAYOFUSERACCESSAUDITDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfUserAccessAuditDetail" element
     */
    public void setArrayOfUserAccessAuditDetail(com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail arrayOfUserAccessAuditDetail)
    {
        generatedSetterHelperImpl(arrayOfUserAccessAuditDetail, ARRAYOFUSERACCESSAUDITDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfUserAccessAuditDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail addNewArrayOfUserAccessAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail)get_store().add_element_user(ARRAYOFUSERACCESSAUDITDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfUserAccessAuditDetail" element
     */
    public void setNilArrayOfUserAccessAuditDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail)get_store().find_element_user(ARRAYOFUSERACCESSAUDITDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfUserAccessAuditDetail)get_store().add_element_user(ARRAYOFUSERACCESSAUDITDETAIL$0);
            }
            target.setNil();
        }
    }
}
