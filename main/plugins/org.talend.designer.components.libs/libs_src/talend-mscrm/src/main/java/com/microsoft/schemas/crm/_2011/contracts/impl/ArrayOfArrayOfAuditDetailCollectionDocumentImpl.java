/*
 * An XML document type.
 * Localname: ArrayOfArrayOfAuditDetailCollection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetailCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfAuditDetailCollection(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfAuditDetailCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetailCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfAuditDetailCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFAUDITDETAILCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfAuditDetailCollection");
    
    
    /**
     * Gets the "ArrayOfArrayOfAuditDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetailCollection getArrayOfArrayOfAuditDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetailCollection)get_store().find_element_user(ARRAYOFARRAYOFAUDITDETAILCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfAuditDetailCollection" element
     */
    public boolean isNilArrayOfArrayOfAuditDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetailCollection)get_store().find_element_user(ARRAYOFARRAYOFAUDITDETAILCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfAuditDetailCollection" element
     */
    public void setArrayOfArrayOfAuditDetailCollection(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetailCollection arrayOfArrayOfAuditDetailCollection)
    {
        generatedSetterHelperImpl(arrayOfArrayOfAuditDetailCollection, ARRAYOFARRAYOFAUDITDETAILCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfAuditDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetailCollection addNewArrayOfArrayOfAuditDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetailCollection)get_store().add_element_user(ARRAYOFARRAYOFAUDITDETAILCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfAuditDetailCollection" element
     */
    public void setNilArrayOfArrayOfAuditDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetailCollection)get_store().find_element_user(ARRAYOFARRAYOFAUDITDETAILCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAuditDetailCollection)get_store().add_element_user(ARRAYOFARRAYOFAUDITDETAILCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
