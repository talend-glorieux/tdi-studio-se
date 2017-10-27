/*
 * XML Type:  OrganizationRequest
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML OrganizationRequest(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class OrganizationRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Parameters");
    private static final javax.xml.namespace.QName REQUESTID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "RequestId");
    private static final javax.xml.namespace.QName REQUESTNAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "RequestName");
    
    
    /**
     * Gets the "Parameters" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ParameterCollection getParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ParameterCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ParameterCollection)get_store().find_element_user(PARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Parameters" element
     */
    public boolean isNilParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ParameterCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ParameterCollection)get_store().find_element_user(PARAMETERS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Parameters" element
     */
    public boolean isSetParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERS$0) != 0;
        }
    }
    
    /**
     * Sets the "Parameters" element
     */
    public void setParameters(com.microsoft.schemas.xrm._2011.contracts.ParameterCollection parameters)
    {
        generatedSetterHelperImpl(parameters, PARAMETERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Parameters" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ParameterCollection addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ParameterCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ParameterCollection)get_store().add_element_user(PARAMETERS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Parameters" element
     */
    public void setNilParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ParameterCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ParameterCollection)get_store().find_element_user(PARAMETERS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ParameterCollection)get_store().add_element_user(PARAMETERS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Parameters" element
     */
    public void unsetParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERS$0, 0);
        }
    }
    
    /**
     * Gets the "RequestId" element
     */
    public java.lang.String getRequestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RequestId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetRequestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(REQUESTID$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RequestId" element
     */
    public boolean isNilRequestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(REQUESTID$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RequestId" element
     */
    public boolean isSetRequestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTID$2) != 0;
        }
    }
    
    /**
     * Sets the "RequestId" element
     */
    public void setRequestId(java.lang.String requestId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTID$2);
            }
            target.setStringValue(requestId);
        }
    }
    
    /**
     * Sets (as xml) the "RequestId" element
     */
    public void xsetRequestId(com.microsoft.schemas._2003._10.serialization.Guid requestId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(REQUESTID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(REQUESTID$2);
            }
            target.set(requestId);
        }
    }
    
    /**
     * Nils the "RequestId" element
     */
    public void setNilRequestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(REQUESTID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(REQUESTID$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RequestId" element
     */
    public void unsetRequestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTID$2, 0);
        }
    }
    
    /**
     * Gets the "RequestName" element
     */
    public java.lang.String getRequestName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RequestName" element
     */
    public org.apache.xmlbeans.XmlString xgetRequestName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTNAME$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "RequestName" element
     */
    public boolean isNilRequestName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTNAME$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "RequestName" element
     */
    public boolean isSetRequestName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "RequestName" element
     */
    public void setRequestName(java.lang.String requestName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTNAME$4);
            }
            target.setStringValue(requestName);
        }
    }
    
    /**
     * Sets (as xml) the "RequestName" element
     */
    public void xsetRequestName(org.apache.xmlbeans.XmlString requestName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTNAME$4);
            }
            target.set(requestName);
        }
    }
    
    /**
     * Nils the "RequestName" element
     */
    public void setNilRequestName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTNAME$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "RequestName" element
     */
    public void unsetRequestName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTNAME$4, 0);
        }
    }
}
