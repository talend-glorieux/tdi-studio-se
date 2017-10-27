/*
 * An XML document type.
 * Localname: ArrayOfBusinessNotification
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotificationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfBusinessNotification(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfBusinessNotificationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotificationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfBusinessNotificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFBUSINESSNOTIFICATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfBusinessNotification");
    
    
    /**
     * Gets the "ArrayOfBusinessNotification" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification getArrayOfBusinessNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification)get_store().find_element_user(ARRAYOFBUSINESSNOTIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfBusinessNotification" element
     */
    public boolean isNilArrayOfBusinessNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification)get_store().find_element_user(ARRAYOFBUSINESSNOTIFICATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfBusinessNotification" element
     */
    public void setArrayOfBusinessNotification(com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification arrayOfBusinessNotification)
    {
        generatedSetterHelperImpl(arrayOfBusinessNotification, ARRAYOFBUSINESSNOTIFICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfBusinessNotification" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification addNewArrayOfBusinessNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification)get_store().add_element_user(ARRAYOFBUSINESSNOTIFICATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfBusinessNotification" element
     */
    public void setNilArrayOfBusinessNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification)get_store().find_element_user(ARRAYOFBUSINESSNOTIFICATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfBusinessNotification)get_store().add_element_user(ARRAYOFBUSINESSNOTIFICATION$0);
            }
            target.setNil();
        }
    }
}
