/*
 * XML Type:  KeyValuePairOfEndpointTypestringztYlk6OT
 * Namespace: http://schemas.datacontract.org/2004/07/System.Collections.Generic
 * Java type: org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.system_collections_generic.impl;
/**
 * An XML KeyValuePairOfEndpointTypestringztYlk6OT(@http://schemas.datacontract.org/2004/07/System.Collections.Generic).
 *
 * This is a complex type.
 */
public class KeyValuePairOfEndpointTypestringztYlk6OTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT
{
    private static final long serialVersionUID = 1L;
    
    public KeyValuePairOfEndpointTypestringztYlk6OTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEY$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "key");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "value");
    
    
    /**
     * Gets the "key" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType.Enum getKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "key" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType xgetKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType)get_store().find_element_user(KEY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "key" element
     */
    public void setKey(com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType.Enum key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEY$0);
            }
            target.setEnumValue(key);
        }
    }
    
    /**
     * Sets (as xml) the "key" element
     */
    public void xsetKey(com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType)get_store().find_element_user(KEY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType)get_store().add_element_user(KEY$0);
            }
            target.set(key);
        }
    }
    
    /**
     * Gets the "value" element
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" element
     */
    public org.apache.xmlbeans.XmlString xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "value" element
     */
    public boolean isNilValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$2);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" element
     */
    public void xsetValue(org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$2);
            }
            target.set(value);
        }
    }
    
    /**
     * Nils the "value" element
     */
    public void setNilValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$2);
            }
            target.setNil();
        }
    }
}
