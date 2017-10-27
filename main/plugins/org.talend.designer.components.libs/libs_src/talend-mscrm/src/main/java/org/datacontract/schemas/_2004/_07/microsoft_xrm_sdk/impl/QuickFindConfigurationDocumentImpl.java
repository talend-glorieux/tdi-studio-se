/*
 * An XML document type.
 * Localname: QuickFindConfiguration
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk
 * Java type: org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_xrm_sdk.impl;
/**
 * A document containing one QuickFindConfiguration(@http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk) element.
 *
 * This is a complex type.
 */
public class QuickFindConfigurationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfigurationDocument
{
    private static final long serialVersionUID = 1L;
    
    public QuickFindConfigurationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUICKFINDCONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk", "QuickFindConfiguration");
    
    
    /**
     * Gets the "QuickFindConfiguration" element
     */
    public org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration getQuickFindConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration)get_store().find_element_user(QUICKFINDCONFIGURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "QuickFindConfiguration" element
     */
    public boolean isNilQuickFindConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration)get_store().find_element_user(QUICKFINDCONFIGURATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "QuickFindConfiguration" element
     */
    public void setQuickFindConfiguration(org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration quickFindConfiguration)
    {
        generatedSetterHelperImpl(quickFindConfiguration, QUICKFINDCONFIGURATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "QuickFindConfiguration" element
     */
    public org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration addNewQuickFindConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration)get_store().add_element_user(QUICKFINDCONFIGURATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "QuickFindConfiguration" element
     */
    public void setNilQuickFindConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration)get_store().find_element_user(QUICKFINDCONFIGURATION$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration)get_store().add_element_user(QUICKFINDCONFIGURATION$0);
            }
            target.setNil();
        }
    }
}
