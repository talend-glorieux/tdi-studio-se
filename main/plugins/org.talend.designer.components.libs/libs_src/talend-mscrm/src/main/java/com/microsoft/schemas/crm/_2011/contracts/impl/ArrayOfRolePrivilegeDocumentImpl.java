/*
 * An XML document type.
 * Localname: ArrayOfRolePrivilege
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfRolePrivilege(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfRolePrivilegeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilegeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfRolePrivilegeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFROLEPRIVILEGE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfRolePrivilege");
    
    
    /**
     * Gets the "ArrayOfRolePrivilege" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege getArrayOfRolePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().find_element_user(ARRAYOFROLEPRIVILEGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfRolePrivilege" element
     */
    public boolean isNilArrayOfRolePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().find_element_user(ARRAYOFROLEPRIVILEGE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfRolePrivilege" element
     */
    public void setArrayOfRolePrivilege(com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege arrayOfRolePrivilege)
    {
        generatedSetterHelperImpl(arrayOfRolePrivilege, ARRAYOFROLEPRIVILEGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfRolePrivilege" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege addNewArrayOfRolePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().add_element_user(ARRAYOFROLEPRIVILEGE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfRolePrivilege" element
     */
    public void setNilArrayOfRolePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().find_element_user(ARRAYOFROLEPRIVILEGE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfRolePrivilege)get_store().add_element_user(ARRAYOFROLEPRIVILEGE$0);
            }
            target.setNil();
        }
    }
}
