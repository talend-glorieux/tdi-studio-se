/*
 * An XML document type.
 * Localname: EndpointCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * A document containing one EndpointCollection(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery) element.
 *
 * This is a complex type.
 */
public class EndpointCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public EndpointCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDPOINTCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "EndpointCollection");
    
    
    /**
     * Gets the "EndpointCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection getEndpointCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection)get_store().find_element_user(ENDPOINTCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EndpointCollection" element
     */
    public boolean isNilEndpointCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection)get_store().find_element_user(ENDPOINTCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EndpointCollection" element
     */
    public void setEndpointCollection(com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection endpointCollection)
    {
        generatedSetterHelperImpl(endpointCollection, ENDPOINTCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EndpointCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection addNewEndpointCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection)get_store().add_element_user(ENDPOINTCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "EndpointCollection" element
     */
    public void setNilEndpointCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection)get_store().find_element_user(ENDPOINTCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection)get_store().add_element_user(ENDPOINTCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
