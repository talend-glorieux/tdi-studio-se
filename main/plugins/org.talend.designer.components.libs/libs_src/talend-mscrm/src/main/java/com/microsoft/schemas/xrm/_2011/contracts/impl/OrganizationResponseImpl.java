/*
 * XML Type:  OrganizationResponse
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML OrganizationResponse(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class OrganizationResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSENAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ResponseName");
    private static final javax.xml.namespace.QName RESULTS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Results");
    
    
    /**
     * Gets the "ResponseName" element
     */
    public java.lang.String getResponseName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResponseName" element
     */
    public org.apache.xmlbeans.XmlString xgetResponseName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ResponseName" element
     */
    public boolean isNilResponseName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSENAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ResponseName" element
     */
    public boolean isSetResponseName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSENAME$0) != 0;
        }
    }
    
    /**
     * Sets the "ResponseName" element
     */
    public void setResponseName(java.lang.String responseName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSENAME$0);
            }
            target.setStringValue(responseName);
        }
    }
    
    /**
     * Sets (as xml) the "ResponseName" element
     */
    public void xsetResponseName(org.apache.xmlbeans.XmlString responseName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSENAME$0);
            }
            target.set(responseName);
        }
    }
    
    /**
     * Nils the "ResponseName" element
     */
    public void setNilResponseName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSENAME$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ResponseName" element
     */
    public void unsetResponseName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSENAME$0, 0);
        }
    }
    
    /**
     * Gets the "Results" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ParameterCollection getResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ParameterCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ParameterCollection)get_store().find_element_user(RESULTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Results" element
     */
    public boolean isNilResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ParameterCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ParameterCollection)get_store().find_element_user(RESULTS$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Results" element
     */
    public boolean isSetResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESULTS$2) != 0;
        }
    }
    
    /**
     * Sets the "Results" element
     */
    public void setResults(com.microsoft.schemas.xrm._2011.contracts.ParameterCollection results)
    {
        generatedSetterHelperImpl(results, RESULTS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Results" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ParameterCollection addNewResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ParameterCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ParameterCollection)get_store().add_element_user(RESULTS$2);
            return target;
        }
    }
    
    /**
     * Nils the "Results" element
     */
    public void setNilResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ParameterCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ParameterCollection)get_store().find_element_user(RESULTS$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ParameterCollection)get_store().add_element_user(RESULTS$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Results" element
     */
    public void unsetResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESULTS$2, 0);
        }
    }
}
