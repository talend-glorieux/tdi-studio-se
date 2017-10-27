/*
 * XML Type:  OrganizationServiceFault
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML OrganizationServiceFault(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class OrganizationServiceFaultImpl extends com.microsoft.schemas.xrm._2011.contracts.impl.BaseServiceFaultImpl implements com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationServiceFaultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INNERFAULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "InnerFault");
    private static final javax.xml.namespace.QName TRACETEXT$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "TraceText");
    
    
    /**
     * Gets the "InnerFault" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault getInnerFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault)get_store().find_element_user(INNERFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "InnerFault" element
     */
    public boolean isNilInnerFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault)get_store().find_element_user(INNERFAULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "InnerFault" element
     */
    public boolean isSetInnerFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INNERFAULT$0) != 0;
        }
    }
    
    /**
     * Sets the "InnerFault" element
     */
    public void setInnerFault(com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault innerFault)
    {
        generatedSetterHelperImpl(innerFault, INNERFAULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InnerFault" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault addNewInnerFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault)get_store().add_element_user(INNERFAULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "InnerFault" element
     */
    public void setNilInnerFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault)get_store().find_element_user(INNERFAULT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault)get_store().add_element_user(INNERFAULT$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "InnerFault" element
     */
    public void unsetInnerFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INNERFAULT$0, 0);
        }
    }
    
    /**
     * Gets the "TraceText" element
     */
    public java.lang.String getTraceText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACETEXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TraceText" element
     */
    public org.apache.xmlbeans.XmlString xgetTraceText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACETEXT$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TraceText" element
     */
    public boolean isNilTraceText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACETEXT$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "TraceText" element
     */
    public boolean isSetTraceText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACETEXT$2) != 0;
        }
    }
    
    /**
     * Sets the "TraceText" element
     */
    public void setTraceText(java.lang.String traceText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACETEXT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRACETEXT$2);
            }
            target.setStringValue(traceText);
        }
    }
    
    /**
     * Sets (as xml) the "TraceText" element
     */
    public void xsetTraceText(org.apache.xmlbeans.XmlString traceText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACETEXT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRACETEXT$2);
            }
            target.set(traceText);
        }
    }
    
    /**
     * Nils the "TraceText" element
     */
    public void setNilTraceText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACETEXT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRACETEXT$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TraceText" element
     */
    public void unsetTraceText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACETEXT$2, 0);
        }
    }
}
