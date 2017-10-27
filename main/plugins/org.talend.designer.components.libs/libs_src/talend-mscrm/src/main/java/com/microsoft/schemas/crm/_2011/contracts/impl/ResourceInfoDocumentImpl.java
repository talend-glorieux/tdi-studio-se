/*
 * An XML document type.
 * Localname: ResourceInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ResourceInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ResourceInfo(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ResourceInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ResourceInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ResourceInfo");
    
    
    /**
     * Gets the "ResourceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ResourceInfo getResourceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ResourceInfo)get_store().find_element_user(RESOURCEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ResourceInfo" element
     */
    public boolean isNilResourceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ResourceInfo)get_store().find_element_user(RESOURCEINFO$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ResourceInfo" element
     */
    public void setResourceInfo(com.microsoft.schemas.crm._2011.contracts.ResourceInfo resourceInfo)
    {
        generatedSetterHelperImpl(resourceInfo, RESOURCEINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ResourceInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ResourceInfo addNewResourceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ResourceInfo)get_store().add_element_user(RESOURCEINFO$0);
            return target;
        }
    }
    
    /**
     * Nils the "ResourceInfo" element
     */
    public void setNilResourceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ResourceInfo)get_store().find_element_user(RESOURCEINFO$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ResourceInfo)get_store().add_element_user(RESOURCEINFO$0);
            }
            target.setNil();
        }
    }
}
