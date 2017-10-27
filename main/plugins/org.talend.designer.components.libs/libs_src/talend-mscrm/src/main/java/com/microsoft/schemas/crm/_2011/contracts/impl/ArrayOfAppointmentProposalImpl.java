/*
 * XML Type:  ArrayOfAppointmentProposal
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfAppointmentProposal(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfAppointmentProposalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAppointmentProposalImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPOINTMENTPROPOSAL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AppointmentProposal");
    
    
    /**
     * Gets array of all "AppointmentProposal" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.AppointmentProposal[] getAppointmentProposalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(APPOINTMENTPROPOSAL$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.AppointmentProposal[] result = new com.microsoft.schemas.crm._2011.contracts.AppointmentProposal[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AppointmentProposal" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AppointmentProposal getAppointmentProposalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal)get_store().find_element_user(APPOINTMENTPROPOSAL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AppointmentProposal" element
     */
    public boolean isNilAppointmentProposalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal)get_store().find_element_user(APPOINTMENTPROPOSAL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AppointmentProposal" element
     */
    public int sizeOfAppointmentProposalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPOINTMENTPROPOSAL$0);
        }
    }
    
    /**
     * Sets array of all "AppointmentProposal" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAppointmentProposalArray(com.microsoft.schemas.crm._2011.contracts.AppointmentProposal[] appointmentProposalArray)
    {
        check_orphaned();
        arraySetterHelper(appointmentProposalArray, APPOINTMENTPROPOSAL$0);
    }
    
    /**
     * Sets ith "AppointmentProposal" element
     */
    public void setAppointmentProposalArray(int i, com.microsoft.schemas.crm._2011.contracts.AppointmentProposal appointmentProposal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal)get_store().find_element_user(APPOINTMENTPROPOSAL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(appointmentProposal);
        }
    }
    
    /**
     * Nils the ith "AppointmentProposal" element
     */
    public void setNilAppointmentProposalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal)get_store().find_element_user(APPOINTMENTPROPOSAL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AppointmentProposal" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AppointmentProposal insertNewAppointmentProposal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AppointmentProposal)get_store().insert_element_user(APPOINTMENTPROPOSAL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AppointmentProposal" element
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
     * Removes the ith "AppointmentProposal" element
     */
    public void removeAppointmentProposal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPOINTMENTPROPOSAL$0, i);
        }
    }
}
