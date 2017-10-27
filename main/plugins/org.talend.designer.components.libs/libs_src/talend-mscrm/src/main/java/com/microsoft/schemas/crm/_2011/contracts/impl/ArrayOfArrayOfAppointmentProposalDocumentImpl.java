/*
 * An XML document type.
 * Localname: ArrayOfArrayOfAppointmentProposal
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentProposalDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfAppointmentProposal(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfAppointmentProposalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentProposalDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfAppointmentProposalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFAPPOINTMENTPROPOSAL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfAppointmentProposal");
    
    
    /**
     * Gets the "ArrayOfArrayOfAppointmentProposal" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentProposal getArrayOfArrayOfAppointmentProposal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentProposal)get_store().find_element_user(ARRAYOFARRAYOFAPPOINTMENTPROPOSAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfAppointmentProposal" element
     */
    public boolean isNilArrayOfArrayOfAppointmentProposal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentProposal)get_store().find_element_user(ARRAYOFARRAYOFAPPOINTMENTPROPOSAL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfAppointmentProposal" element
     */
    public void setArrayOfArrayOfAppointmentProposal(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentProposal arrayOfArrayOfAppointmentProposal)
    {
        generatedSetterHelperImpl(arrayOfArrayOfAppointmentProposal, ARRAYOFARRAYOFAPPOINTMENTPROPOSAL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfAppointmentProposal" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentProposal addNewArrayOfArrayOfAppointmentProposal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentProposal)get_store().add_element_user(ARRAYOFARRAYOFAPPOINTMENTPROPOSAL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfAppointmentProposal" element
     */
    public void setNilArrayOfArrayOfAppointmentProposal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentProposal)get_store().find_element_user(ARRAYOFARRAYOFAPPOINTMENTPROPOSAL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentProposal)get_store().add_element_user(ARRAYOFARRAYOFAPPOINTMENTPROPOSAL$0);
            }
            target.setNil();
        }
    }
}
