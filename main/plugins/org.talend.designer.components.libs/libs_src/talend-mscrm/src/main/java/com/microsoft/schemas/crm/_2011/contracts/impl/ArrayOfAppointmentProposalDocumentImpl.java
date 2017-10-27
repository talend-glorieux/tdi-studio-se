/*
 * An XML document type.
 * Localname: ArrayOfAppointmentProposal
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfAppointmentProposal(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfAppointmentProposalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAppointmentProposalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFAPPOINTMENTPROPOSAL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAppointmentProposal");
    
    
    /**
     * Gets the "ArrayOfAppointmentProposal" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal getArrayOfAppointmentProposal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal)get_store().find_element_user(ARRAYOFAPPOINTMENTPROPOSAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfAppointmentProposal" element
     */
    public boolean isNilArrayOfAppointmentProposal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal)get_store().find_element_user(ARRAYOFAPPOINTMENTPROPOSAL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfAppointmentProposal" element
     */
    public void setArrayOfAppointmentProposal(com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal arrayOfAppointmentProposal)
    {
        generatedSetterHelperImpl(arrayOfAppointmentProposal, ARRAYOFAPPOINTMENTPROPOSAL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfAppointmentProposal" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal addNewArrayOfAppointmentProposal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal)get_store().add_element_user(ARRAYOFAPPOINTMENTPROPOSAL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfAppointmentProposal" element
     */
    public void setNilArrayOfAppointmentProposal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal)get_store().find_element_user(ARRAYOFAPPOINTMENTPROPOSAL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal)get_store().add_element_user(ARRAYOFAPPOINTMENTPROPOSAL$0);
            }
            target.setNil();
        }
    }
}
