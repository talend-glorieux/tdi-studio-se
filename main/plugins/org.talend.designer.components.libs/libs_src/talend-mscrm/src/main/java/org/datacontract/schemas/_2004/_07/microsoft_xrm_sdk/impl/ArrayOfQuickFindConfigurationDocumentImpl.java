/*
 * An XML document type.
 * Localname: ArrayOfQuickFindConfiguration
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk
 * Java type: org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_xrm_sdk.impl;
/**
 * A document containing one ArrayOfQuickFindConfiguration(@http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk) element.
 *
 * This is a complex type.
 */
public class ArrayOfQuickFindConfigurationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfigurationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfQuickFindConfigurationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFQUICKFINDCONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk", "ArrayOfQuickFindConfiguration");
    
    
    /**
     * Gets the "ArrayOfQuickFindConfiguration" element
     */
    public org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration getArrayOfQuickFindConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration)get_store().find_element_user(ARRAYOFQUICKFINDCONFIGURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfQuickFindConfiguration" element
     */
    public boolean isNilArrayOfQuickFindConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration)get_store().find_element_user(ARRAYOFQUICKFINDCONFIGURATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfQuickFindConfiguration" element
     */
    public void setArrayOfQuickFindConfiguration(org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration arrayOfQuickFindConfiguration)
    {
        generatedSetterHelperImpl(arrayOfQuickFindConfiguration, ARRAYOFQUICKFINDCONFIGURATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArrayOfQuickFindConfiguration" element
     */
    public org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration addNewArrayOfQuickFindConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration)get_store().add_element_user(ARRAYOFQUICKFINDCONFIGURATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfQuickFindConfiguration" element
     */
    public void setNilArrayOfQuickFindConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration)get_store().find_element_user(ARRAYOFQUICKFINDCONFIGURATION$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration)get_store().add_element_user(ARRAYOFQUICKFINDCONFIGURATION$0);
            }
            target.setNil();
        }
    }
}
