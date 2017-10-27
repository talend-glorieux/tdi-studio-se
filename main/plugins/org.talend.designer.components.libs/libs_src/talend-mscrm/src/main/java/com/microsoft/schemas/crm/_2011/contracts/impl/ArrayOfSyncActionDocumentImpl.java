/*
 * An XML document type.
 * Localname: ArrayOfSyncAction
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncActionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfSyncAction(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfSyncActionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncActionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSyncActionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSYNCACTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfSyncAction");
    
    
    /**
     * Gets the "ArrayOfSyncAction" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction getArrayOfSyncAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction)get_store().find_element_user(ARRAYOFSYNCACTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfSyncAction" element
     */
    public boolean isNilArrayOfSyncAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction)get_store().find_element_user(ARRAYOFSYNCACTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfSyncAction" element
     */
    public void setArrayOfSyncAction(com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction arrayOfSyncAction)
    {
        generatedSetterHelperImpl(arrayOfSyncAction, ARRAYOFSYNCACTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfSyncAction" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction addNewArrayOfSyncAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction)get_store().add_element_user(ARRAYOFSYNCACTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfSyncAction" element
     */
    public void setNilArrayOfSyncAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction)get_store().find_element_user(ARRAYOFSYNCACTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfSyncAction)get_store().add_element_user(ARRAYOFSYNCACTION$0);
            }
            target.setNil();
        }
    }
}
