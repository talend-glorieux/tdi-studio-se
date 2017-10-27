/*
 * An XML document type.
 * Localname: EndpointType
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * A document containing one EndpointType(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery) element.
 *
 * This is a complex type.
 */
public class EndpointTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public EndpointTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDPOINTTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "EndpointType");
    
    
    /**
     * Gets the "EndpointType" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType.Enum getEndpointType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndpointType" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType xgetEndpointType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType)get_store().find_element_user(ENDPOINTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EndpointType" element
     */
    public boolean isNilEndpointType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType)get_store().find_element_user(ENDPOINTTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EndpointType" element
     */
    public void setEndpointType(com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType.Enum endpointType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPOINTTYPE$0);
            }
            target.setEnumValue(endpointType);
        }
    }
    
    /**
     * Sets (as xml) the "EndpointType" element
     */
    public void xsetEndpointType(com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType endpointType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType)get_store().find_element_user(ENDPOINTTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType)get_store().add_element_user(ENDPOINTTYPE$0);
            }
            target.set(endpointType);
        }
    }
    
    /**
     * Nils the "EndpointType" element
     */
    public void setNilEndpointType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType)get_store().find_element_user(ENDPOINTTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType)get_store().add_element_user(ENDPOINTTYPE$0);
            }
            target.setNil();
        }
    }
}
