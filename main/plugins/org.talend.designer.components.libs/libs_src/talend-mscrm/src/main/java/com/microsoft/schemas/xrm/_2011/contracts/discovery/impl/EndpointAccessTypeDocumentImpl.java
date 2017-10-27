/*
 * An XML document type.
 * Localname: EndpointAccessType
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * A document containing one EndpointAccessType(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery) element.
 *
 * This is a complex type.
 */
public class EndpointAccessTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public EndpointAccessTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDPOINTACCESSTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "EndpointAccessType");
    
    
    /**
     * Gets the "EndpointAccessType" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType.Enum getEndpointAccessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINTACCESSTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndpointAccessType" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType xgetEndpointAccessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType)get_store().find_element_user(ENDPOINTACCESSTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EndpointAccessType" element
     */
    public boolean isNilEndpointAccessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType)get_store().find_element_user(ENDPOINTACCESSTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EndpointAccessType" element
     */
    public void setEndpointAccessType(com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType.Enum endpointAccessType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINTACCESSTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPOINTACCESSTYPE$0);
            }
            target.setEnumValue(endpointAccessType);
        }
    }
    
    /**
     * Sets (as xml) the "EndpointAccessType" element
     */
    public void xsetEndpointAccessType(com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType endpointAccessType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType)get_store().find_element_user(ENDPOINTACCESSTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType)get_store().add_element_user(ENDPOINTACCESSTYPE$0);
            }
            target.set(endpointAccessType);
        }
    }
    
    /**
     * Nils the "EndpointAccessType" element
     */
    public void setNilEndpointAccessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType)get_store().find_element_user(ENDPOINTACCESSTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointAccessType)get_store().add_element_user(ENDPOINTACCESSTYPE$0);
            }
            target.setNil();
        }
    }
}
