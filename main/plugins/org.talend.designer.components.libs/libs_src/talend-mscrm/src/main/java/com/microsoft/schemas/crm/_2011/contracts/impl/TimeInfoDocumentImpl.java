/*
 * An XML document type.
 * Localname: TimeInfo
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.TimeInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one TimeInfo(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class TimeInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.TimeInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "TimeInfo");
    
    
    /**
     * Gets the "TimeInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TimeInfo getTimeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TimeInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TimeInfo)get_store().find_element_user(TIMEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "TimeInfo" element
     */
    public boolean isNilTimeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TimeInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TimeInfo)get_store().find_element_user(TIMEINFO$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "TimeInfo" element
     */
    public void setTimeInfo(com.microsoft.schemas.crm._2011.contracts.TimeInfo timeInfo)
    {
        generatedSetterHelperImpl(timeInfo, TIMEINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeInfo" element
     */
    public com.microsoft.schemas.crm._2011.contracts.TimeInfo addNewTimeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TimeInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TimeInfo)get_store().add_element_user(TIMEINFO$0);
            return target;
        }
    }
    
    /**
     * Nils the "TimeInfo" element
     */
    public void setNilTimeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.TimeInfo target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.TimeInfo)get_store().find_element_user(TIMEINFO$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.TimeInfo)get_store().add_element_user(TIMEINFO$0);
            }
            target.setNil();
        }
    }
}
