/*
 * XML Type:  ArrayOfArrayOfAppointmentProposal
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentProposal
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfAppointmentProposal(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfAppointmentProposalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAppointmentProposal
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfAppointmentProposalImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFAPPOINTMENTPROPOSAL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAppointmentProposal");
    
    
    /**
     * Gets array of all "ArrayOfAppointmentProposal" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal[] getArrayOfAppointmentProposalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFAPPOINTMENTPROPOSAL$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfAppointmentProposal" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal getArrayOfAppointmentProposalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal)get_store().find_element_user(ARRAYOFAPPOINTMENTPROPOSAL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfAppointmentProposal" element
     */
    public boolean isNilArrayOfAppointmentProposalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal)get_store().find_element_user(ARRAYOFAPPOINTMENTPROPOSAL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfAppointmentProposal" element
     */
    public int sizeOfArrayOfAppointmentProposalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFAPPOINTMENTPROPOSAL$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfAppointmentProposal" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfAppointmentProposalArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal[] arrayOfAppointmentProposalArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfAppointmentProposalArray, ARRAYOFAPPOINTMENTPROPOSAL$0);
    }
    
    /**
     * Sets ith "ArrayOfAppointmentProposal" element
     */
    public void setArrayOfAppointmentProposalArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal arrayOfAppointmentProposal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal)get_store().find_element_user(ARRAYOFAPPOINTMENTPROPOSAL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfAppointmentProposal);
        }
    }
    
    /**
     * Nils the ith "ArrayOfAppointmentProposal" element
     */
    public void setNilArrayOfAppointmentProposalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal)get_store().find_element_user(ARRAYOFAPPOINTMENTPROPOSAL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfAppointmentProposal" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal insertNewArrayOfAppointmentProposal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal)get_store().insert_element_user(ARRAYOFAPPOINTMENTPROPOSAL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfAppointmentProposal" element
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
     * Removes the ith "ArrayOfAppointmentProposal" element
     */
    public void removeArrayOfAppointmentProposal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFAPPOINTMENTPROPOSAL$0, i);
        }
    }
}
