/*
 * An XML document type.
 * Localname: BusinessNotification
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.BusinessNotificationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one BusinessNotification(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class BusinessNotificationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.BusinessNotificationDocument
{
    private static final long serialVersionUID = 1L;
    
    public BusinessNotificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSNOTIFICATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "BusinessNotification");
    
    
    /**
     * Gets the "BusinessNotification" element
     */
    public com.microsoft.schemas.crm._2011.contracts.BusinessNotification getBusinessNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.BusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.BusinessNotification)get_store().find_element_user(BUSINESSNOTIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "BusinessNotification" element
     */
    public boolean isNilBusinessNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.BusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.BusinessNotification)get_store().find_element_user(BUSINESSNOTIFICATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "BusinessNotification" element
     */
    public void setBusinessNotification(com.microsoft.schemas.crm._2011.contracts.BusinessNotification businessNotification)
    {
        generatedSetterHelperImpl(businessNotification, BUSINESSNOTIFICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BusinessNotification" element
     */
    public com.microsoft.schemas.crm._2011.contracts.BusinessNotification addNewBusinessNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.BusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.BusinessNotification)get_store().add_element_user(BUSINESSNOTIFICATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "BusinessNotification" element
     */
    public void setNilBusinessNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.BusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.BusinessNotification)get_store().find_element_user(BUSINESSNOTIFICATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.BusinessNotification)get_store().add_element_user(BUSINESSNOTIFICATION$0);
            }
            target.setNil();
        }
    }
}
