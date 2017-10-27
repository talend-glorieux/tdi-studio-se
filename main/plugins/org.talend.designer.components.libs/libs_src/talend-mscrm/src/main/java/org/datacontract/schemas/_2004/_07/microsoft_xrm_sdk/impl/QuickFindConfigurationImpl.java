/*
 * XML Type:  QuickFindConfiguration
 * Namespace: http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk
 * Java type: org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.microsoft_xrm_sdk.impl;
/**
 * An XML QuickFindConfiguration(@http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk).
 *
 * This is a complex type.
 */
public class QuickFindConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.microsoft_xrm_sdk.QuickFindConfiguration
{
    private static final long serialVersionUID = 1L;
    
    public QuickFindConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk", "EntityName");
    
    
    /**
     * Gets the "EntityName" element
     */
    public java.lang.String getEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityName" element
     */
    public org.apache.xmlbeans.XmlString xgetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityName" element
     */
    public boolean isNilEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EntityName" element
     */
    public boolean isSetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "EntityName" element
     */
    public void setEntityName(java.lang.String entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYNAME$0);
            }
            target.setStringValue(entityName);
        }
    }
    
    /**
     * Sets (as xml) the "EntityName" element
     */
    public void xsetEntityName(org.apache.xmlbeans.XmlString entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYNAME$0);
            }
            target.set(entityName);
        }
    }
    
    /**
     * Nils the "EntityName" element
     */
    public void setNilEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYNAME$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EntityName" element
     */
    public void unsetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYNAME$0, 0);
        }
    }
}
