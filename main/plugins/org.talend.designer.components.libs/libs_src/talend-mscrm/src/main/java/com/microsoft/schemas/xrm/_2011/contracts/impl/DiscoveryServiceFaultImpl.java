/*
 * XML Type:  DiscoveryServiceFault
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML DiscoveryServiceFault(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class DiscoveryServiceFaultImpl extends com.microsoft.schemas.xrm._2011.contracts.impl.BaseServiceFaultImpl implements com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault
{
    private static final long serialVersionUID = 1L;
    
    public DiscoveryServiceFaultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INNERFAULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "InnerFault");
    
    
    /**
     * Gets the "InnerFault" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault getInnerFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault)get_store().find_element_user(INNERFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "InnerFault" element
     */
    public boolean isNilInnerFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault)get_store().find_element_user(INNERFAULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "InnerFault" element
     */
    public boolean isSetInnerFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INNERFAULT$0) != 0;
        }
    }
    
    /**
     * Sets the "InnerFault" element
     */
    public void setInnerFault(com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault innerFault)
    {
        generatedSetterHelperImpl(innerFault, INNERFAULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InnerFault" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault addNewInnerFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault)get_store().add_element_user(INNERFAULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "InnerFault" element
     */
    public void setNilInnerFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault)get_store().find_element_user(INNERFAULT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.DiscoveryServiceFault)get_store().add_element_user(INNERFAULT$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "InnerFault" element
     */
    public void unsetInnerFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INNERFAULT$0, 0);
        }
    }
}
