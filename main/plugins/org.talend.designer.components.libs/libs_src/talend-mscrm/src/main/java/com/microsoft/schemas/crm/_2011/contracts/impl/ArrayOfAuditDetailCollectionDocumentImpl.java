/*
 * An XML document type.
 * Localname: ArrayOfAuditDetailCollection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfAuditDetailCollection(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfAuditDetailCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAuditDetailCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFAUDITDETAILCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAuditDetailCollection");
    
    
    /**
     * Gets the "ArrayOfAuditDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection getArrayOfAuditDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection)get_store().find_element_user(ARRAYOFAUDITDETAILCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfAuditDetailCollection" element
     */
    public boolean isNilArrayOfAuditDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection)get_store().find_element_user(ARRAYOFAUDITDETAILCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfAuditDetailCollection" element
     */
    public void setArrayOfAuditDetailCollection(com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection arrayOfAuditDetailCollection)
    {
        generatedSetterHelperImpl(arrayOfAuditDetailCollection, ARRAYOFAUDITDETAILCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfAuditDetailCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection addNewArrayOfAuditDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection)get_store().add_element_user(ARRAYOFAUDITDETAILCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfAuditDetailCollection" element
     */
    public void setNilArrayOfAuditDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection)get_store().find_element_user(ARRAYOFAUDITDETAILCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetailCollection)get_store().add_element_user(ARRAYOFAUDITDETAILCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
