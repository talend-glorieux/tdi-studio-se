/*
 * An XML document type.
 * Localname: AppointmentProposal
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AppointmentProposalDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one AppointmentProposal(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class AppointmentProposalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.AppointmentProposalDocument
{
    private static final long serialVersionUID = 1L;
    
    public AppointmentProposalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPOINTMENTPROPOSAL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AppointmentProposal");
    
    
    /**
     * Gets the "AppointmentProposal" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AppointmentProposal getAppointmentProposal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal)get_store().find_element_user(APPOINTMENTPROPOSAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AppointmentProposal" element
     */
    public boolean isNilAppointmentProposal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal)get_store().find_element_user(APPOINTMENTPROPOSAL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AppointmentProposal" element
     */
    public void setAppointmentProposal(com.microsoft.schemas.crm._2011.contracts.AppointmentProposal appointmentProposal)
    {
        generatedSetterHelperImpl(appointmentProposal, APPOINTMENTPROPOSAL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AppointmentProposal" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AppointmentProposal addNewAppointmentProposal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal)get_store().add_element_user(APPOINTMENTPROPOSAL$0);
            return target;
        }
    }
    
    /**
     * Nils the "AppointmentProposal" element
     */
    public void setNilAppointmentProposal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal)get_store().find_element_user(APPOINTMENTPROPOSAL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal)get_store().add_element_user(APPOINTMENTPROPOSAL$0);
            }
            target.setNil();
        }
    }
}
