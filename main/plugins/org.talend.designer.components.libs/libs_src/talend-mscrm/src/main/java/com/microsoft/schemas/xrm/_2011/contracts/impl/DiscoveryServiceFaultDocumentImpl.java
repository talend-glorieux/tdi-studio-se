/*
 * An XML document type.
 * Localname: DiscoveryServiceFault
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFaultDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one DiscoveryServiceFault(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class DiscoveryServiceFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiscoveryServiceFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCOVERYSERVICEFAULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "DiscoveryServiceFault");
    
    
    /**
     * Gets the "DiscoveryServiceFault" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault getDiscoveryServiceFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault)get_store().find_element_user(DISCOVERYSERVICEFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DiscoveryServiceFault" element
     */
    public boolean isNilDiscoveryServiceFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault)get_store().find_element_user(DISCOVERYSERVICEFAULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DiscoveryServiceFault" element
     */
    public void setDiscoveryServiceFault(com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault discoveryServiceFault)
    {
        generatedSetterHelperImpl(discoveryServiceFault, DISCOVERYSERVICEFAULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DiscoveryServiceFault" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault addNewDiscoveryServiceFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault)get_store().add_element_user(DISCOVERYSERVICEFAULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "DiscoveryServiceFault" element
     */
    public void setNilDiscoveryServiceFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault)get_store().find_element_user(DISCOVERYSERVICEFAULT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault)get_store().add_element_user(DISCOVERYSERVICEFAULT$0);
            }
            target.setNil();
        }
    }
}
