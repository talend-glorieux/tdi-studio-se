/*
 * XML Type:  AppointmentProposal
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AppointmentProposal
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML AppointmentProposal(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class AppointmentProposalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.AppointmentProposal
{
    private static final long serialVersionUID = 1L;
    
    public AppointmentProposalImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName END$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "End");
    private static final javax.xml.namespace.QName PROPOSALPARTIES$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ProposalParties");
    private static final javax.xml.namespace.QName SITEID$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SiteId");
    private static final javax.xml.namespace.QName SITENAME$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SiteName");
    private static final javax.xml.namespace.QName START$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Start");
    
    
    /**
     * Gets the "End" element
     */
    public java.util.Calendar getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(END$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "End" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(END$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "End" element
     */
    public boolean isNilEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(END$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "End" element
     */
    public boolean isSetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(END$0) != 0;
        }
    }
    
    /**
     * Sets the "End" element
     */
    public void setEnd(java.util.Calendar end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(END$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(END$0);
            }
            target.setCalendarValue(end);
        }
    }
    
    /**
     * Sets (as xml) the "End" element
     */
    public void xsetEnd(org.apache.xmlbeans.XmlDateTime end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(END$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(END$0);
            }
            target.set(end);
        }
    }
    
    /**
     * Nils the "End" element
     */
    public void setNilEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(END$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(END$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "End" element
     */
    public void unsetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(END$0, 0);
        }
    }
    
    /**
     * Gets the "ProposalParties" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty getProposalParties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty)get_store().find_element_user(PROPOSALPARTIES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ProposalParties" element
     */
    public boolean isNilProposalParties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty)get_store().find_element_user(PROPOSALPARTIES$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ProposalParties" element
     */
    public boolean isSetProposalParties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPOSALPARTIES$2) != 0;
        }
    }
    
    /**
     * Sets the "ProposalParties" element
     */
    public void setProposalParties(com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty proposalParties)
    {
        generatedSetterHelperImpl(proposalParties, PROPOSALPARTIES$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProposalParties" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty addNewProposalParties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty)get_store().add_element_user(PROPOSALPARTIES$2);
            return target;
        }
    }
    
    /**
     * Nils the "ProposalParties" element
     */
    public void setNilProposalParties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty)get_store().find_element_user(PROPOSALPARTIES$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfProposalParty)get_store().add_element_user(PROPOSALPARTIES$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ProposalParties" element
     */
    public void unsetProposalParties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPOSALPARTIES$2, 0);
        }
    }
    
    /**
     * Gets the "SiteId" element
     */
    public java.lang.String getSiteId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SiteId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetSiteId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(SITEID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "SiteId" element
     */
    public boolean isSetSiteId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITEID$4) != 0;
        }
    }
    
    /**
     * Sets the "SiteId" element
     */
    public void setSiteId(java.lang.String siteId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITEID$4);
            }
            target.setStringValue(siteId);
        }
    }
    
    /**
     * Sets (as xml) the "SiteId" element
     */
    public void xsetSiteId(com.microsoft.schemas._2003._10.serialization.Guid siteId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(SITEID$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(SITEID$4);
            }
            target.set(siteId);
        }
    }
    
    /**
     * Unsets the "SiteId" element
     */
    public void unsetSiteId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITEID$4, 0);
        }
    }
    
    /**
     * Gets the "SiteName" element
     */
    public java.lang.String getSiteName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITENAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SiteName" element
     */
    public org.apache.xmlbeans.XmlString xgetSiteName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITENAME$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SiteName" element
     */
    public boolean isNilSiteName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITENAME$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "SiteName" element
     */
    public boolean isSetSiteName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITENAME$6) != 0;
        }
    }
    
    /**
     * Sets the "SiteName" element
     */
    public void setSiteName(java.lang.String siteName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITENAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITENAME$6);
            }
            target.setStringValue(siteName);
        }
    }
    
    /**
     * Sets (as xml) the "SiteName" element
     */
    public void xsetSiteName(org.apache.xmlbeans.XmlString siteName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITENAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SITENAME$6);
            }
            target.set(siteName);
        }
    }
    
    /**
     * Nils the "SiteName" element
     */
    public void setNilSiteName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITENAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SITENAME$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SiteName" element
     */
    public void unsetSiteName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITENAME$6, 0);
        }
    }
    
    /**
     * Gets the "Start" element
     */
    public java.util.Calendar getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Start" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(START$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Start" element
     */
    public boolean isNilStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(START$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Start" element
     */
    public boolean isSetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(START$8) != 0;
        }
    }
    
    /**
     * Sets the "Start" element
     */
    public void setStart(java.util.Calendar start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(START$8);
            }
            target.setCalendarValue(start);
        }
    }
    
    /**
     * Sets (as xml) the "Start" element
     */
    public void xsetStart(org.apache.xmlbeans.XmlDateTime start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(START$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(START$8);
            }
            target.set(start);
        }
    }
    
    /**
     * Nils the "Start" element
     */
    public void setNilStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(START$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(START$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Start" element
     */
    public void unsetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(START$8, 0);
        }
    }
}
