/*
 * An XML document type.
 * Localname: ArrayOfArrayOfBusinessNotification
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBusinessNotificationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one ArrayOfArrayOfBusinessNotification(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfBusinessNotificationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBusinessNotificationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfBusinessNotificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFBUSINESSNOTIFICATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfArrayOfBusinessNotification");
    
    
    /**
     * Gets the "ArrayOfArrayOfBusinessNotification" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBusinessNotification getArrayOfArrayOfBusinessNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBusinessNotification)get_store().find_element_user(ARRAYOFARRAYOFBUSINESSNOTIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfBusinessNotification" element
     */
    public boolean isNilArrayOfArrayOfBusinessNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBusinessNotification)get_store().find_element_user(ARRAYOFARRAYOFBUSINESSNOTIFICATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfBusinessNotification" element
     */
    public void setArrayOfArrayOfBusinessNotification(com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBusinessNotification arrayOfArrayOfBusinessNotification)
    {
        generatedSetterHelperImpl(arrayOfArrayOfBusinessNotification, ARRAYOFARRAYOFBUSINESSNOTIFICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfBusinessNotification" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBusinessNotification addNewArrayOfArrayOfBusinessNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBusinessNotification)get_store().add_element_user(ARRAYOFARRAYOFBUSINESSNOTIFICATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfBusinessNotification" element
     */
    public void setNilArrayOfArrayOfBusinessNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBusinessNotification target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBusinessNotification)get_store().find_element_user(ARRAYOFARRAYOFBUSINESSNOTIFICATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfBusinessNotification)get_store().add_element_user(ARRAYOFARRAYOFBUSINESSNOTIFICATION$0);
            }
            target.setNil();
        }
    }
}
