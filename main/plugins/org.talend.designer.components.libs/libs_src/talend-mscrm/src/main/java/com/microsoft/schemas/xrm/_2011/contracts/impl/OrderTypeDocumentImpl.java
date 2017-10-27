/*
 * An XML document type.
 * Localname: OrderType
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.OrderTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one OrderType(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class OrderTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.OrderTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "OrderType");
    
    
    /**
     * Gets the "OrderType" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrderType.Enum getOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.contracts.OrderType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderType" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrderType xgetOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrderType target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrderType)get_store().find_element_user(ORDERTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "OrderType" element
     */
    public boolean isNilOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrderType target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrderType)get_store().find_element_user(ORDERTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrderType" element
     */
    public void setOrderType(com.microsoft.schemas.xrm._2011.contracts.OrderType.Enum orderType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERTYPE$0);
            }
            target.setEnumValue(orderType);
        }
    }
    
    /**
     * Sets (as xml) the "OrderType" element
     */
    public void xsetOrderType(com.microsoft.schemas.xrm._2011.contracts.OrderType orderType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrderType target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrderType)get_store().find_element_user(ORDERTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.OrderType)get_store().add_element_user(ORDERTYPE$0);
            }
            target.set(orderType);
        }
    }
    
    /**
     * Nils the "OrderType" element
     */
    public void setNilOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OrderType target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OrderType)get_store().find_element_user(ORDERTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.OrderType)get_store().add_element_user(ORDERTYPE$0);
            }
            target.setNil();
        }
    }
}
