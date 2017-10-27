/*
 * An XML document type.
 * Localname: DiscoveryResponse
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * A document containing one DiscoveryResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery) element.
 *
 * This is a complex type.
 */
public class DiscoveryResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiscoveryResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCOVERYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "DiscoveryResponse");
    
    
    /**
     * Gets the "DiscoveryResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryResponse getDiscoveryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryResponse)get_store().find_element_user(DISCOVERYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DiscoveryResponse" element
     */
    public boolean isNilDiscoveryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryResponse)get_store().find_element_user(DISCOVERYRESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DiscoveryResponse" element
     */
    public void setDiscoveryResponse(com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryResponse discoveryResponse)
    {
        generatedSetterHelperImpl(discoveryResponse, DISCOVERYRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DiscoveryResponse" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryResponse addNewDiscoveryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryResponse)get_store().add_element_user(DISCOVERYRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "DiscoveryResponse" element
     */
    public void setNilDiscoveryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryResponse target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryResponse)get_store().find_element_user(DISCOVERYRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryResponse)get_store().add_element_user(DISCOVERYRESPONSE$0);
            }
            target.setNil();
        }
    }
}
