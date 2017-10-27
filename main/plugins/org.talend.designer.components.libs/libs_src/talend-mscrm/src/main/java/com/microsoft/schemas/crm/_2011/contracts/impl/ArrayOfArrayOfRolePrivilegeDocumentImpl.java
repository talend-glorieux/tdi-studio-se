/*
 * An XML document type.
 * Localname: ArrayOfArrayOfRolePrivilege
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilegeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfRolePrivilege(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfRolePrivilegeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilegeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfRolePrivilegeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFROLEPRIVILEGE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfRolePrivilege");
    
    
    /**
     * Gets the "ArrayOfArrayOfRolePrivilege" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilege getArrayOfArrayOfRolePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilege)get_store().find_element_user(ARRAYOFARRAYOFROLEPRIVILEGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfRolePrivilege" element
     */
    public boolean isNilArrayOfArrayOfRolePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilege)get_store().find_element_user(ARRAYOFARRAYOFROLEPRIVILEGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfRolePrivilege" element
     */
    public void setArrayOfArrayOfRolePrivilege(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilege arrayOfArrayOfRolePrivilege)
    {
        generatedSetterHelperImpl(arrayOfArrayOfRolePrivilege, ARRAYOFARRAYOFROLEPRIVILEGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfRolePrivilege" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilege addNewArrayOfArrayOfRolePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilege)get_store().add_element_user(ARRAYOFARRAYOFROLEPRIVILEGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfRolePrivilege" element
     */
    public void setNilArrayOfArrayOfRolePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilege)get_store().find_element_user(ARRAYOFARRAYOFROLEPRIVILEGE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfRolePrivilege)get_store().add_element_user(ARRAYOFARRAYOFROLEPRIVILEGE$0);
            }
            target.setNil();
        }
    }
}
