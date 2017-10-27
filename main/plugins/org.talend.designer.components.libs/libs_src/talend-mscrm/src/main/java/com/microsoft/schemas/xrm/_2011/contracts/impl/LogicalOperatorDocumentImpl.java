/*
 * An XML document type.
 * Localname: LogicalOperator
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.LogicalOperatorDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one LogicalOperator(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class LogicalOperatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.LogicalOperatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public LogicalOperatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOGICALOPERATOR$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "LogicalOperator");
    
    
    /**
     * Gets the "LogicalOperator" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LogicalOperator.Enum getLogicalOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALOPERATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.contracts.LogicalOperator.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "LogicalOperator" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LogicalOperator xgetLogicalOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LogicalOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LogicalOperator)get_store().find_element_user(LOGICALOPERATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "LogicalOperator" element
     */
    public boolean isNilLogicalOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LogicalOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LogicalOperator)get_store().find_element_user(LOGICALOPERATOR$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LogicalOperator" element
     */
    public void setLogicalOperator(com.microsoft.schemas.xrm._2011.contracts.LogicalOperator.Enum logicalOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALOPERATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGICALOPERATOR$0);
            }
            target.setEnumValue(logicalOperator);
        }
    }
    
    /**
     * Sets (as xml) the "LogicalOperator" element
     */
    public void xsetLogicalOperator(com.microsoft.schemas.xrm._2011.contracts.LogicalOperator logicalOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LogicalOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LogicalOperator)get_store().find_element_user(LOGICALOPERATOR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.LogicalOperator)get_store().add_element_user(LOGICALOPERATOR$0);
            }
            target.set(logicalOperator);
        }
    }
    
    /**
     * Nils the "LogicalOperator" element
     */
    public void setNilLogicalOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LogicalOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LogicalOperator)get_store().find_element_user(LOGICALOPERATOR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.LogicalOperator)get_store().add_element_user(LOGICALOPERATOR$0);
            }
            target.setNil();
        }
    }
}
