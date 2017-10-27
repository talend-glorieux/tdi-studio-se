/*
 * An XML document type.
 * Localname: ArrayOfProposalParty
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalPartyDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfProposalParty(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfProposalPartyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalPartyDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfProposalPartyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPROPOSALPARTY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfProposalParty");
    
    
    /**
     * Gets the "ArrayOfProposalParty" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty getArrayOfProposalParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty)get_store().find_element_user(ARRAYOFPROPOSALPARTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfProposalParty" element
     */
    public boolean isNilArrayOfProposalParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty)get_store().find_element_user(ARRAYOFPROPOSALPARTY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfProposalParty" element
     */
    public void setArrayOfProposalParty(com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty arrayOfProposalParty)
    {
        generatedSetterHelperImpl(arrayOfProposalParty, ARRAYOFPROPOSALPARTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfProposalParty" element
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
     * Nils the "ArrayOfProposalParty" element
     */
    public void setNilArrayOfProposalParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty)get_store().find_element_user(ARRAYOFPROPOSALPARTY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty)get_store().add_element_user(ARRAYOFPROPOSALPARTY$0);
            }
            target.setNil();
        }
    }
}
