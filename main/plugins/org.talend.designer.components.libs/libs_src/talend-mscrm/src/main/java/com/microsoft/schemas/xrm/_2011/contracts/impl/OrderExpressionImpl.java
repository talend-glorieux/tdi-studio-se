/*
 * XML Type:  OrderExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.OrderExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML OrderExpression(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class OrderExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.OrderExpression
{
    private static final long serialVersionUID = 1L;
    
    public OrderExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTENAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "AttributeName");
    private static final javax.xml.namespace.QName ORDERTYPE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "OrderType");
    
    
    /**
     * Gets the "AttributeName" element
     */
    public java.lang.String getAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttributeName" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeName" element
     */
    public boolean isNilAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTENAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AttributeName" element
     */
    public boolean isSetAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTENAME$0) != 0;
        }
    }
    
    /**
     * Sets the "AttributeName" element
     */
    public void setAttributeName(java.lang.String attributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTENAME$0);
            }
            target.setStringValue(attributeName);
        }
    }
    
    /**
     * Sets (as xml) the "AttributeName" element
     */
    public void xsetAttributeName(org.apache.xmlbeans.XmlString attributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTENAME$0);
            }
            target.set(attributeName);
        }
    }
    
    /**
     * Nils the "AttributeName" element
     */
    public void setNilAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTENAME$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AttributeName" element
     */
    public void unsetAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTENAME$0, 0);
        }
    }
    
    /**
     * Gets the "OrderType" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OrderType.Enum getOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPE$2, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.OrderType)get_store().find_element_user(ORDERTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "OrderType" element
     */
    public boolean isSetOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERTYPE$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERTYPE$2);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.OrderType)get_store().find_element_user(ORDERTYPE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.OrderType)get_store().add_element_user(ORDERTYPE$2);
            }
            target.set(orderType);
        }
    }
    
    /**
     * Unsets the "OrderType" element
     */
    public void unsetOrderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERTYPE$2, 0);
        }
    }
}
