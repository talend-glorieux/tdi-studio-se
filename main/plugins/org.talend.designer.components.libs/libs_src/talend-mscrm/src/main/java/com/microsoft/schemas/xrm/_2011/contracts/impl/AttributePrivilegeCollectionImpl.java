/*
 * XML Type:  AttributePrivilegeCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.AttributePrivilegeCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML AttributePrivilegeCollection(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class AttributePrivilegeCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.AttributePrivilegeCollection
{
    private static final long serialVersionUID = 1L;
    
    public AttributePrivilegeCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEPRIVILEGE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "AttributePrivilege");
    
    
    /**
     * Gets array of all "AttributePrivilege" elements
     */
    public com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege[] getAttributePrivilegeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTEPRIVILEGE$0, targetList);
            com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege[] result = new com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttributePrivilege" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege getAttributePrivilegeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege)get_store().find_element_user(ATTRIBUTEPRIVILEGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AttributePrivilege" element
     */
    public boolean isNilAttributePrivilegeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege)get_store().find_element_user(ATTRIBUTEPRIVILEGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AttributePrivilege" element
     */
    public int sizeOfAttributePrivilegeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEPRIVILEGE$0);
        }
    }
    
    /**
     * Sets array of all "AttributePrivilege" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributePrivilegeArray(com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege[] attributePrivilegeArray)
    {
        check_orphaned();
        arraySetterHelper(attributePrivilegeArray, ATTRIBUTEPRIVILEGE$0);
    }
    
    /**
     * Sets ith "AttributePrivilege" element
     */
    public void setAttributePrivilegeArray(int i, com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege attributePrivilege)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege)get_store().find_element_user(ATTRIBUTEPRIVILEGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attributePrivilege);
        }
    }
    
    /**
     * Nils the ith "AttributePrivilege" element
     */
    public void setNilAttributePrivilegeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege)get_store().find_element_user(ATTRIBUTEPRIVILEGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttributePrivilege" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege insertNewAttributePrivilege(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege)get_store().insert_element_user(ATTRIBUTEPRIVILEGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttributePrivilege" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege addNewAttributePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributePrivilege)get_store().add_element_user(ATTRIBUTEPRIVILEGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttributePrivilege" element
     */
    public void removeAttributePrivilege(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEPRIVILEGE$0, i);
        }
    }
}
