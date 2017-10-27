/*
 * An XML document type.
 * Localname: RequiredResource
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.RequiredResourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one RequiredResource(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class RequiredResourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.RequiredResourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequiredResourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUIREDRESOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "RequiredResource");
    
    
    /**
     * Gets the "RequiredResource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RequiredResource getRequiredResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RequiredResource)get_store().find_element_user(REQUIREDRESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RequiredResource" element
     */
    public boolean isNilRequiredResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RequiredResource)get_store().find_element_user(REQUIREDRESOURCE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RequiredResource" element
     */
    public void setRequiredResource(com.microsoft.schemas.crm._2011.contracts.RequiredResource requiredResource)
    {
        generatedSetterHelperImpl(requiredResource, REQUIREDRESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RequiredResource" element
     */
    public com.microsoft.schemas.crm._2011.contracts.RequiredResource addNewRequiredResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RequiredResource)get_store().add_element_user(REQUIREDRESOURCE$0);
            return target;
        }
    }
    
    /**
     * Nils the "RequiredResource" element
     */
    public void setNilRequiredResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.RequiredResource target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.RequiredResource)get_store().find_element_user(REQUIREDRESOURCE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.RequiredResource)get_store().add_element_user(REQUIREDRESOURCE$0);
            }
            target.setNil();
        }
    }
}
