/*
 * An XML document type.
 * Localname: Money
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.MoneyDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one Money(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class MoneyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.MoneyDocument
{
    private static final long serialVersionUID = 1L;
    
    public MoneyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MONEY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Money");
    
    
    /**
     * Gets the "Money" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Money getMoney()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Money target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Money)get_store().find_element_user(MONEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Money" element
     */
    public boolean isNilMoney()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Money target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Money)get_store().find_element_user(MONEY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Money" element
     */
    public void setMoney(com.microsoft.schemas.xrm._2011.contracts.Money money)
    {
        generatedSetterHelperImpl(money, MONEY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Money" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Money addNewMoney()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Money target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Money)get_store().add_element_user(MONEY$0);
            return target;
        }
    }
    
    /**
     * Nils the "Money" element
     */
    public void setNilMoney()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Money target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Money)get_store().find_element_user(MONEY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Money)get_store().add_element_user(MONEY$0);
            }
            target.setNil();
        }
    }
}
