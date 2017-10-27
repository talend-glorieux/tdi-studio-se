/*
 * XML Type:  ExecuteMultipleResponseItem
 * Namespace: http://schemas.microsoft.com/xrm/2012/Contracts
 * Java type: com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2012.contracts.impl;
/**
 * An XML ExecuteMultipleResponseItem(@http://schemas.microsoft.com/xrm/2012/Contracts).
 *
 * This is a complex type.
 */
public class ExecuteMultipleResponseItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2012.contracts.ExecuteMultipleResponseItem
{
    private static final long serialVersionUID = 1L;
    
    public ExecuteMultipleResponseItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2012/Contracts", "Fault");
    private static final javax.xml.namespace.QName REQUESTINDEX$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2012/Contracts", "RequestIndex");
    private static final javax.xml.namespace.QName RESPONSE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2012/Contracts", "Response");
    
    
    /**
     * Gets the "Fault" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault getFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault)get_store().find_element_user(FAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Fault" element
     */
    public boolean isNilFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault)get_store().find_element_user(FAULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Fault" element
     */
    public boolean isSetFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAULT$0) != 0;
        }
    }
    
    /**
     * Sets the "Fault" element
     */
    public void setFault(com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault fault)
    {
        generatedSetterHelperImpl(fault, FAULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Fault" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault addNewFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault)get_store().add_element_user(FAULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "Fault" element
     */
    public void setNilFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault)get_store().find_element_user(FAULT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault)get_store().add_element_user(FAULT$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Fault" element
     */
    public void unsetFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAULT$0, 0);
        }
    }
    
    /**
     * Gets the "RequestIndex" element
     */
    public int getRequestIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTINDEX$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RequestIndex" element
     */
    public org.apache.xmlbeans.XmlInt xgetRequestIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(REQUESTINDEX$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "RequestIndex" element
     */
    public boolean isSetRequestIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTINDEX$2) != 0;
        }
    }
    
    /**
     * Sets the "RequestIndex" element
     */
    public void setRequestIndex(int requestIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTINDEX$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTINDEX$2);
            }
            target.setIntValue(requestIndex);
        }
    }
    
    /**
     * Sets (as xml) the "RequestIndex" element
     */
    public void xsetRequestIndex(org.apache.xmlbeans.XmlInt requestIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(REQUESTINDEX$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(REQUESTINDEX$2);
            }
            target.set(requestIndex);
        }
    }
    
    /**
     * Unsets the "RequestIndex" element
     */
    public void unsetRequestIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTINDEX$2, 0);
        }
    }
    
    /**
     * Gets the "Response" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse getResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse)get_store().find_element_user(RESPONSE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Response" element
     */
    public boolean isNilResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse)get_store().find_element_user(RESPONSE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Response" element
     */
    public boolean isSetResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSE$4) != 0;
        }
    }
    
    /**
     * Sets the "Response" element
     */
    public void setResponse(com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse response)
    {
        generatedSetterHelperImpl(response, RESPONSE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Response" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse addNewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse)get_store().add_element_user(RESPONSE$4);
            return target;
        }
    }
    
    /**
     * Nils the "Response" element
     */
    public void setNilResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse)get_store().find_element_user(RESPONSE$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse)get_store().add_element_user(RESPONSE$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Response" element
     */
    public void unsetResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSE$4, 0);
        }
    }
}
