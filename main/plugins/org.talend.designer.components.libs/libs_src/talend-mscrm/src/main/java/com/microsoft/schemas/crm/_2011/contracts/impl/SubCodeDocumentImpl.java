/*
 * An XML document type.
 * Localname: SubCode
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.SubCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one SubCode(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class SubCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.SubCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBCODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SubCode");
    
    
    /**
     * Gets the "SubCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SubCode.Enum getSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2011.contracts.SubCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SubCode xgetSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SubCode)get_store().find_element_user(SUBCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "SubCode" element
     */
    public boolean isNilSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SubCode)get_store().find_element_user(SUBCODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SubCode" element
     */
    public void setSubCode(com.microsoft.schemas.crm._2011.contracts.SubCode.Enum subCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBCODE$0);
            }
            target.setEnumValue(subCode);
        }
    }
    
    /**
     * Sets (as xml) the "SubCode" element
     */
    public void xsetSubCode(com.microsoft.schemas.crm._2011.contracts.SubCode subCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SubCode)get_store().find_element_user(SUBCODE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.SubCode)get_store().add_element_user(SUBCODE$0);
            }
            target.set(subCode);
        }
    }
    
    /**
     * Nils the "SubCode" element
     */
    public void setNilSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SubCode)get_store().find_element_user(SUBCODE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.SubCode)get_store().add_element_user(SUBCODE$0);
            }
            target.setNil();
        }
    }
}
