/*
 * XML Type:  ArrayOfQuickFindConfiguration
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk
 * Java type: org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_xrm_sdk.impl;
/**
 * An XML ArrayOfQuickFindConfiguration(@http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk).
 *
 * This is a complex type.
 */
public class ArrayOfQuickFindConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.microsoft_xrm_sdk.ArrayOfQuickFindConfiguration
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfQuickFindConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUICKFINDCONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk", "QuickFindConfiguration");
    
    
    /**
     * Gets array of all "QuickFindConfiguration" elements
     */
    public org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration[] getQuickFindConfigurationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUICKFINDCONFIGURATION$0, targetList);
            org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration[] result = new org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "QuickFindConfiguration" element
     */
    public org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration getQuickFindConfigurationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration)get_store().find_element_user(QUICKFINDCONFIGURATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "QuickFindConfiguration" element
     */
    public boolean isNilQuickFindConfigurationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration)get_store().find_element_user(QUICKFINDCONFIGURATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "QuickFindConfiguration" element
     */
    public int sizeOfQuickFindConfigurationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUICKFINDCONFIGURATION$0);
        }
    }
    
    /**
     * Sets array of all "QuickFindConfiguration" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setQuickFindConfigurationArray(org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration[] quickFindConfigurationArray)
    {
        check_orphaned();
        arraySetterHelper(quickFindConfigurationArray, QUICKFINDCONFIGURATION$0);
    }
    
    /**
     * Sets ith "QuickFindConfiguration" element
     */
    public void setQuickFindConfigurationArray(int i, org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration quickFindConfiguration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration)get_store().find_element_user(QUICKFINDCONFIGURATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(quickFindConfiguration);
        }
    }
    
    /**
     * Nils the ith "QuickFindConfiguration" element
     */
    public void setNilQuickFindConfigurationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration)get_store().find_element_user(QUICKFINDCONFIGURATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuickFindConfiguration" element
     */
    public org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration insertNewQuickFindConfiguration(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration target = null;
            target = (org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration)get_store().insert_element_user(QUICKFINDCONFIGURATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuickFindConfiguration" element
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
     * Removes the ith "QuickFindConfiguration" element
     */
    public void removeQuickFindConfiguration(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUICKFINDCONFIGURATION$0, i);
        }
    }
}
