/*
 * An XML document type.
 * Localname: ComponentDetail
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ComponentDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ComponentDetail(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ComponentDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ComponentDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ComponentDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENTDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ComponentDetail");
    
    
    /**
     * Gets the "ComponentDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ComponentDetail getComponentDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().find_element_user(COMPONENTDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ComponentDetail" element
     */
    public boolean isNilComponentDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().find_element_user(COMPONENTDETAIL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ComponentDetail" element
     */
    public void setComponentDetail(com.microsoft.schemas.crm._2011.contracts.ComponentDetail componentDetail)
    {
        generatedSetterHelperImpl(componentDetail, COMPONENTDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ComponentDetail" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ComponentDetail addNewComponentDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().add_element_user(COMPONENTDETAIL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ComponentDetail" element
     */
    public void setNilComponentDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ComponentDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().find_element_user(COMPONENTDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ComponentDetail)get_store().add_element_user(COMPONENTDETAIL$0);
            }
            target.setNil();
        }
    }
}
