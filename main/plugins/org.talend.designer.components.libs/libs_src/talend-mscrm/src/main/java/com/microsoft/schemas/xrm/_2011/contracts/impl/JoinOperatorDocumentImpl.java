/*
 * An XML document type.
 * Localname: JoinOperator
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.JoinOperatorDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one JoinOperator(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class JoinOperatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.JoinOperatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public JoinOperatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOINOPERATOR$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "JoinOperator");
    
    
    /**
     * Gets the "JoinOperator" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.JoinOperator.Enum getJoinOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOINOPERATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.contracts.JoinOperator.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "JoinOperator" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.JoinOperator xgetJoinOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.JoinOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.JoinOperator)get_store().find_element_user(JOINOPERATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "JoinOperator" element
     */
    public boolean isNilJoinOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.JoinOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.JoinOperator)get_store().find_element_user(JOINOPERATOR$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "JoinOperator" element
     */
    public void setJoinOperator(com.microsoft.schemas.xrm._2011.contracts.JoinOperator.Enum joinOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOINOPERATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOINOPERATOR$0);
            }
            target.setEnumValue(joinOperator);
        }
    }
    
    /**
     * Sets (as xml) the "JoinOperator" element
     */
    public void xsetJoinOperator(com.microsoft.schemas.xrm._2011.contracts.JoinOperator joinOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.JoinOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.JoinOperator)get_store().find_element_user(JOINOPERATOR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.JoinOperator)get_store().add_element_user(JOINOPERATOR$0);
            }
            target.set(joinOperator);
        }
    }
    
    /**
     * Nils the "JoinOperator" element
     */
    public void setNilJoinOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.JoinOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.JoinOperator)get_store().find_element_user(JOINOPERATOR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.JoinOperator)get_store().add_element_user(JOINOPERATOR$0);
            }
            target.setNil();
        }
    }
}
