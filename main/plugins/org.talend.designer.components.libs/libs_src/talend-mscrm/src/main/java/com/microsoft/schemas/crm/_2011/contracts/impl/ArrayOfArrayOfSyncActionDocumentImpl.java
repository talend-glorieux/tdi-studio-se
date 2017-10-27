/*
 * An XML document type.
 * Localname: ArrayOfArrayOfSyncAction
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSyncActionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfSyncAction(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfSyncActionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSyncActionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfSyncActionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFSYNCACTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfSyncAction");
    
    
    /**
     * Gets the "ArrayOfArrayOfSyncAction" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSyncAction getArrayOfArrayOfSyncAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSyncAction)get_store().find_element_user(ARRAYOFARRAYOFSYNCACTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfSyncAction" element
     */
    public boolean isNilArrayOfArrayOfSyncAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSyncAction)get_store().find_element_user(ARRAYOFARRAYOFSYNCACTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfSyncAction" element
     */
    public void setArrayOfArrayOfSyncAction(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSyncAction arrayOfArrayOfSyncAction)
    {
        generatedSetterHelperImpl(arrayOfArrayOfSyncAction, ARRAYOFARRAYOFSYNCACTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfSyncAction" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSyncAction addNewArrayOfArrayOfSyncAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSyncAction)get_store().add_element_user(ARRAYOFARRAYOFSYNCACTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfSyncAction" element
     */
    public void setNilArrayOfArrayOfSyncAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSyncAction target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSyncAction)get_store().find_element_user(ARRAYOFARRAYOFSYNCACTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfSyncAction)get_store().add_element_user(ARRAYOFARRAYOFSYNCACTION$0);
            }
            target.setNil();
        }
    }
}
