/*
 * XML Type:  ArrayOfArrayOfProposalParty
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfProposalParty
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfProposalParty(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfProposalPartyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfProposalParty
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfProposalPartyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPROPOSALPARTY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfProposalParty");
    
    
    /**
     * Gets array of all "ArrayOfProposalParty" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty[] getArrayOfProposalPartyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFPROPOSALPARTY$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfProposalParty" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty getArrayOfProposalPartyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty)get_store().find_element_user(ARRAYOFPROPOSALPARTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfProposalParty" element
     */
    public boolean isNilArrayOfProposalPartyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty)get_store().find_element_user(ARRAYOFPROPOSALPARTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfProposalParty" element
     */
    public int sizeOfArrayOfProposalPartyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFPROPOSALPARTY$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfProposalParty" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfProposalPartyArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty[] arrayOfProposalPartyArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfProposalPartyArray, ARRAYOFPROPOSALPARTY$0);
    }
    
    /**
     * Sets ith "ArrayOfProposalParty" element
     */
    public void setArrayOfProposalPartyArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty arrayOfProposalParty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty)get_store().find_element_user(ARRAYOFPROPOSALPARTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfProposalParty);
        }
    }
    
    /**
     * Nils the ith "ArrayOfProposalParty" element
     */
    public void setNilArrayOfProposalPartyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty)get_store().find_element_user(ARRAYOFPROPOSALPARTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfProposalParty" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty insertNewArrayOfProposalParty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty)get_store().insert_element_user(ARRAYOFPROPOSALPARTY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfProposalParty" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty addNewArrayOfProposalParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty)get_store().add_element_user(ARRAYOFPROPOSALPARTY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfProposalParty" element
     */
    public void removeArrayOfProposalParty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFPROPOSALPARTY$0, i);
        }
    }
}
