/*
 * XML Type:  SearchResults
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.SearchResults
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML SearchResults(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class SearchResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.SearchResults
{
    private static final long serialVersionUID = 1L;
    
    public SearchResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPOSALS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Proposals");
    private static final javax.xml.namespace.QName TRACEINFO$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "TraceInfo");
    
    
    /**
     * Gets the "Proposals" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal getProposals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal)get_store().find_element_user(PROPOSALS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Proposals" element
     */
    public boolean isNilProposals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal)get_store().find_element_user(PROPOSALS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Proposals" element
     */
    public boolean isSetProposals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPOSALS$0) != 0;
        }
    }
    
    /**
     * Sets the "Proposals" element
     */
    public void setProposals(com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal proposals)
    {
        generatedSetterHelperImpl(proposals, PROPOSALS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Proposals" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal addNewProposals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal)get_store().add_element_user(PROPOSALS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Proposals" element
     */
    public void setNilProposals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal)get_store().find_element_user(PROPOSALS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal)get_store().add_element_user(PROPOSALS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Proposals" element
     */
    public void unsetProposals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPOSALS$0, 0);
        }
    }
    
    /**
     * Gets the "TraceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TraceInfo getTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().find_element_user(TRACEINFO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "TraceInfo" element
     */
    public boolean isNilTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().find_element_user(TRACEINFO$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "TraceInfo" element
     */
    public boolean isSetTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACEINFO$2) != 0;
        }
    }
    
    /**
     * Sets the "TraceInfo" element
     */
    public void setTraceInfo(com.microsoft.schemas.crm._2011.contracts.TraceInfo traceInfo)
    {
        generatedSetterHelperImpl(traceInfo, TRACEINFO$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TraceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TraceInfo addNewTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().add_element_user(TRACEINFO$2);
            return target;
        }
    }
    
    /**
     * Nils the "TraceInfo" element
     */
    public void setNilTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().find_element_user(TRACEINFO$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.TraceInfo)get_store().add_element_user(TRACEINFO$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TraceInfo" element
     */
    public void unsetTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACEINFO$2, 0);
        }
    }
}
