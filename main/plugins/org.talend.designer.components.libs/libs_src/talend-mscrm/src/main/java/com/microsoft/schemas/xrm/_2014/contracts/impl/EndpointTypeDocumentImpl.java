/*
 * An XML document type.
 * Localname: EndpointType
 * Namespace: http://schemas.microsoft.com/xrm/2014/Contracts
 * Java type: com.microsoft.schemas.xrm._2014.contracts.EndpointTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2014.contracts.impl;
/**
 * A document containing one EndpointType(@http://schemas.microsoft.com/xrm/2014/Contracts) element.
 *
 * This is a complex type.
 */
public class EndpointTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2014.contracts.EndpointTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public EndpointTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDPOINTTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2014/Contracts", "EndpointType");
    
    
    /**
     * Gets the "EndpointType" element
     */
    public com.microsoft.schemas.xrm._2014.contracts.EndpointType.Enum getEndpointType()
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
            return (com.microsoft.schemas.xrm._2014.contracts.EndpointType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndpointType" element
     */
    public com.microsoft.schemas.xrm._2014.contracts.EndpointType xgetEndpointType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2014.contracts.EndpointType target = null;
            target = (com.microsoft.schemas.xrm._2014.contracts.EndpointType)get_store().find_element_user(ENDPOINTTYPE$0, 0);
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
            com.microsoft.schemas.xrm._2014.contracts.EndpointType target = null;
            target = (com.microsoft.schemas.xrm._2014.contracts.EndpointType)get_store().find_element_user(ENDPOINTTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EndpointType" element
     */
    public void setEndpointType(com.microsoft.schemas.xrm._2014.contracts.EndpointType.Enum endpointType)
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
    public void xsetEndpointType(com.microsoft.schemas.xrm._2014.contracts.EndpointType endpointType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2014.contracts.EndpointType target = null;
            target = (com.microsoft.schemas.xrm._2014.contracts.EndpointType)get_store().find_element_user(ENDPOINTTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2014.contracts.EndpointType)get_store().add_element_user(ENDPOINTTYPE$0);
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
            com.microsoft.schemas.xrm._2014.contracts.EndpointType target = null;
            target = (com.microsoft.schemas.xrm._2014.contracts.EndpointType)get_store().find_element_user(ENDPOINTTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2014.contracts.EndpointType)get_store().add_element_user(ENDPOINTTYPE$0);
            }
            target.setNil();
        }
    }
}
