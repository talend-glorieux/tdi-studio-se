/*
 * An XML document type.
 * Localname: EndpointCollection
 * Namespace: http://schemas.microsoft.com/xrm/2014/Contracts
 * Java type: com.microsoft.schemas.xrm._2014.contracts.EndpointCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2014.contracts.impl;
/**
 * A document containing one EndpointCollection(@http://schemas.microsoft.com/xrm/2014/Contracts) element.
 *
 * This is a complex type.
 */
public class EndpointCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2014.contracts.EndpointCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public EndpointCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDPOINTCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2014/Contracts", "EndpointCollection");
    
    
    /**
     * Gets the "EndpointCollection" element
     */
    public com.microsoft.schemas.xrm._2014.contracts.EndpointCollection getEndpointCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2014.contracts.EndpointCollection target = null;
            target = (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection)get_store().find_element_user(ENDPOINTCOLLECTION$0, 0);
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
            com.microsoft.schemas.xrm._2014.contracts.EndpointCollection target = null;
            target = (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection)get_store().find_element_user(ENDPOINTCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EndpointCollection" element
     */
    public void setEndpointCollection(com.microsoft.schemas.xrm._2014.contracts.EndpointCollection endpointCollection)
    {
        generatedSetterHelperImpl(endpointCollection, ENDPOINTCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EndpointCollection" element
     */
    public com.microsoft.schemas.xrm._2014.contracts.EndpointCollection addNewEndpointCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2014.contracts.EndpointCollection target = null;
            target = (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection)get_store().add_element_user(ENDPOINTCOLLECTION$0);
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
            com.microsoft.schemas.xrm._2014.contracts.EndpointCollection target = null;
            target = (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection)get_store().find_element_user(ENDPOINTCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2014.contracts.EndpointCollection)get_store().add_element_user(ENDPOINTCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
