/*
 * An XML document type.
 * Localname: FaultType
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.FaultTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one FaultType(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class FaultTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.FaultTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public FaultTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAULTTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "FaultType");
    
    
    /**
     * Gets the "FaultType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.FaultType.Enum getFaultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2011.contracts.FaultType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FaultType" element
     */
    public com.microsoft.schemas.crm._2011.contracts.FaultType xgetFaultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.FaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.FaultType)get_store().find_element_user(FAULTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "FaultType" element
     */
    public boolean isNilFaultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.FaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.FaultType)get_store().find_element_user(FAULTTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FaultType" element
     */
    public void setFaultType(com.microsoft.schemas.crm._2011.contracts.FaultType.Enum faultType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAULTTYPE$0);
            }
            target.setEnumValue(faultType);
        }
    }
    
    /**
     * Sets (as xml) the "FaultType" element
     */
    public void xsetFaultType(com.microsoft.schemas.crm._2011.contracts.FaultType faultType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.FaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.FaultType)get_store().find_element_user(FAULTTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.FaultType)get_store().add_element_user(FAULTTYPE$0);
            }
            target.set(faultType);
        }
    }
    
    /**
     * Nils the "FaultType" element
     */
    public void setNilFaultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.FaultType target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.FaultType)get_store().find_element_user(FAULTTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.FaultType)get_store().add_element_user(FAULTTYPE$0);
            }
            target.setNil();
        }
    }
}
