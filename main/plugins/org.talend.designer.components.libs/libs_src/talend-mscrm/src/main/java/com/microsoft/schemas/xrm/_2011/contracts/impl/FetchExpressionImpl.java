/*
 * XML Type:  FetchExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.FetchExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML FetchExpression(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class FetchExpressionImpl extends com.microsoft.schemas.xrm._2011.contracts.impl.QueryBaseImpl implements com.microsoft.schemas.xrm._2011.contracts.FetchExpression
{
    private static final long serialVersionUID = 1L;
    
    public FetchExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Query");
    
    
    /**
     * Gets the "Query" element
     */
    public java.lang.String getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Query" element
     */
    public org.apache.xmlbeans.XmlString xgetQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERY$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Query" element
     */
    public boolean isNilQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Query" element
     */
    public boolean isSetQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERY$0) != 0;
        }
    }
    
    /**
     * Sets the "Query" element
     */
    public void setQuery(java.lang.String query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERY$0);
            }
            target.setStringValue(query);
        }
    }
    
    /**
     * Sets (as xml) the "Query" element
     */
    public void xsetQuery(org.apache.xmlbeans.XmlString query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERY$0);
            }
            target.set(query);
        }
    }
    
    /**
     * Nils the "Query" element
     */
    public void setNilQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERY$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Query" element
     */
    public void unsetQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERY$0, 0);
        }
    }
}
