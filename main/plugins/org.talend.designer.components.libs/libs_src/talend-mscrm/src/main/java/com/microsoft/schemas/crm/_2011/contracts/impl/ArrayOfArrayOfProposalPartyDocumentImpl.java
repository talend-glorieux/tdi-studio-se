/*
 * An XML document type.
 * Localname: ArrayOfArrayOfProposalParty
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfProposalPartyDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfProposalParty(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfProposalPartyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfProposalPartyDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfProposalPartyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFPROPOSALPARTY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfProposalParty");
    
    
    /**
     * Gets the "ArrayOfArrayOfProposalParty" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfProposalParty getArrayOfArrayOfProposalParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfProposalParty)get_store().find_element_user(ARRAYOFARRAYOFPROPOSALPARTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfProposalParty" element
     */
    public boolean isNilArrayOfArrayOfProposalParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfProposalParty)get_store().find_element_user(ARRAYOFARRAYOFPROPOSALPARTY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfProposalParty" element
     */
    public void setArrayOfArrayOfProposalParty(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfProposalParty arrayOfArrayOfProposalParty)
    {
        generatedSetterHelperImpl(arrayOfArrayOfProposalParty, ARRAYOFARRAYOFPROPOSALPARTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfProposalParty" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfProposalParty addNewArrayOfArrayOfProposalParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfProposalParty)get_store().add_element_user(ARRAYOFARRAYOFPROPOSALPARTY$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfProposalParty" element
     */
    public void setNilArrayOfArrayOfProposalParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfProposalParty)get_store().find_element_user(ARRAYOFARRAYOFPROPOSALPARTY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfProposalParty)get_store().add_element_user(ARRAYOFARRAYOFPROPOSALPARTY$0);
            }
            target.setNil();
        }
    }
}
