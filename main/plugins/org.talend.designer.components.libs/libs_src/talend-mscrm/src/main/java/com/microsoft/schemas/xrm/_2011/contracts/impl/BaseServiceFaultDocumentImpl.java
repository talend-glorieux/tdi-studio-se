/*
 * An XML document type.
 * Localname: BaseServiceFault
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.BaseServiceFaultDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one BaseServiceFault(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class BaseServiceFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.BaseServiceFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public BaseServiceFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASESERVICEFAULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "BaseServiceFault");
    
    
    /**
     * Gets the "BaseServiceFault" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BaseServiceFault getBaseServiceFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BaseServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BaseServiceFault)get_store().find_element_user(BASESERVICEFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "BaseServiceFault" element
     */
    public boolean isNilBaseServiceFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BaseServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BaseServiceFault)get_store().find_element_user(BASESERVICEFAULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "BaseServiceFault" element
     */
    public void setBaseServiceFault(com.microsoft.schemas.xrm._2011.contracts.BaseServiceFault baseServiceFault)
    {
        generatedSetterHelperImpl(baseServiceFault, BASESERVICEFAULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BaseServiceFault" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.BaseServiceFault addNewBaseServiceFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BaseServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BaseServiceFault)get_store().add_element_user(BASESERVICEFAULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "BaseServiceFault" element
     */
    public void setNilBaseServiceFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.BaseServiceFault target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.BaseServiceFault)get_store().find_element_user(BASESERVICEFAULT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.BaseServiceFault)get_store().add_element_user(BASESERVICEFAULT$0);
            }
            target.setNil();
        }
    }
}
