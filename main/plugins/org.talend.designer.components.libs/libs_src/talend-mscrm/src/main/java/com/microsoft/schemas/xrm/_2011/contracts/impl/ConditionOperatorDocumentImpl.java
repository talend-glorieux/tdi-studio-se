/*
 * An XML document type.
 * Localname: ConditionOperator
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ConditionOperatorDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one ConditionOperator(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ConditionOperatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ConditionOperatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConditionOperatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITIONOPERATOR$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ConditionOperator");
    
    
    /**
     * Gets the "ConditionOperator" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ConditionOperator.Enum getConditionOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONDITIONOPERATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConditionOperator" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ConditionOperator xgetConditionOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ConditionOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator)get_store().find_element_user(CONDITIONOPERATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ConditionOperator" element
     */
    public boolean isNilConditionOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ConditionOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator)get_store().find_element_user(CONDITIONOPERATOR$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ConditionOperator" element
     */
    public void setConditionOperator(com.microsoft.schemas.xrm._2011.contracts.ConditionOperator.Enum conditionOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONDITIONOPERATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONDITIONOPERATOR$0);
            }
            target.setEnumValue(conditionOperator);
        }
    }
    
    /**
     * Sets (as xml) the "ConditionOperator" element
     */
    public void xsetConditionOperator(com.microsoft.schemas.xrm._2011.contracts.ConditionOperator conditionOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ConditionOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator)get_store().find_element_user(CONDITIONOPERATOR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator)get_store().add_element_user(CONDITIONOPERATOR$0);
            }
            target.set(conditionOperator);
        }
    }
    
    /**
     * Nils the "ConditionOperator" element
     */
    public void setNilConditionOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ConditionOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator)get_store().find_element_user(CONDITIONOPERATOR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator)get_store().add_element_user(CONDITIONOPERATOR$0);
            }
            target.setNil();
        }
    }
}
