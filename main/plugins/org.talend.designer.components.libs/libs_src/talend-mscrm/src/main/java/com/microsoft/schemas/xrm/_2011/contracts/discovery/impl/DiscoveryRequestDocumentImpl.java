/*
 * An XML document type.
 * Localname: DiscoveryRequest
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * A document containing one DiscoveryRequest(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery) element.
 *
 * This is a complex type.
 */
public class DiscoveryRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiscoveryRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCOVERYREQUEST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "DiscoveryRequest");
    
    
    /**
     * Gets the "DiscoveryRequest" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryRequest getDiscoveryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryRequest)get_store().find_element_user(DISCOVERYREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DiscoveryRequest" element
     */
    public boolean isNilDiscoveryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryRequest)get_store().find_element_user(DISCOVERYREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DiscoveryRequest" element
     */
    public void setDiscoveryRequest(com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryRequest discoveryRequest)
    {
        generatedSetterHelperImpl(discoveryRequest, DISCOVERYREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DiscoveryRequest" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryRequest addNewDiscoveryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryRequest)get_store().add_element_user(DISCOVERYREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "DiscoveryRequest" element
     */
    public void setNilDiscoveryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryRequest target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryRequest)get_store().find_element_user(DISCOVERYREQUEST$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryRequest)get_store().add_element_user(DISCOVERYREQUEST$0);
            }
            target.setNil();
        }
    }
}
