/*
 * XML Type:  ArrayOfProposalParty
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfProposalParty(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfProposalPartyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfProposalPartyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPOSALPARTY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ProposalParty");
    
    
    /**
     * Gets array of all "ProposalParty" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ProposalParty[] getProposalPartyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPOSALPARTY$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ProposalParty[] result = new com.microsoft.schemas.crm._2011.contracts.ProposalParty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProposalParty" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ProposalParty getProposalPartyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ProposalParty)get_store().find_element_user(PROPOSALPARTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ProposalParty" element
     */
    public boolean isNilProposalPartyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ProposalParty)get_store().find_element_user(PROPOSALPARTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ProposalParty" element
     */
    public int sizeOfProposalPartyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPOSALPARTY$0);
        }
    }
    
    /**
     * Sets array of all "ProposalParty" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProposalPartyArray(com.microsoft.schemas.crm._2011.contracts.ProposalParty[] proposalPartyArray)
    {
        check_orphaned();
        arraySetterHelper(proposalPartyArray, PROPOSALPARTY$0);
    }
    
    /**
     * Sets ith "ProposalParty" element
     */
    public void setProposalPartyArray(int i, com.microsoft.schemas.crm._2011.contracts.ProposalParty proposalParty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ProposalParty)get_store().find_element_user(PROPOSALPARTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(proposalParty);
        }
    }
    
    /**
     * Nils the ith "ProposalParty" element
     */
    public void setNilProposalPartyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ProposalParty)get_store().find_element_user(PROPOSALPARTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProposalParty" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ProposalParty insertNewProposalParty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ProposalParty)get_store().insert_element_user(PROPOSALPARTY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProposalParty" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ProposalParty addNewProposalParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ProposalParty)get_store().add_element_user(PROPOSALPARTY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProposalParty" element
     */
    public void removeProposalParty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPOSALPARTY$0, i);
        }
    }
}
