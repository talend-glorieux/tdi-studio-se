/*
 * An XML document type.
 * Localname: ProposalParty
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ProposalPartyDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ProposalParty(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ProposalPartyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ProposalPartyDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProposalPartyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPOSALPARTY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ProposalParty");
    
    
    /**
     * Gets the "ProposalParty" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ProposalParty getProposalParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ProposalParty)get_store().find_element_user(PROPOSALPARTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProposalParty" element
     */
    public boolean isNilProposalParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ProposalParty)get_store().find_element_user(PROPOSALPARTY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ProposalParty" element
     */
    public void setProposalParty(com.microsoft.schemas.crm._2011.contracts.ProposalParty proposalParty)
    {
        generatedSetterHelperImpl(proposalParty, PROPOSALPARTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProposalParty" element
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
     * Nils the "ProposalParty" element
     */
    public void setNilProposalParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ProposalParty)get_store().find_element_user(PROPOSALPARTY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ProposalParty)get_store().add_element_user(PROPOSALPARTY$0);
            }
            target.setNil();
        }
    }
}
