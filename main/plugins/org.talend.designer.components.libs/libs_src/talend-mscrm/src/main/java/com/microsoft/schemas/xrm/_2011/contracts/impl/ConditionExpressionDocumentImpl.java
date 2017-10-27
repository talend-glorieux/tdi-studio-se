/*
 * An XML document type.
 * Localname: ConditionExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ConditionExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one ConditionExpression(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ConditionExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ConditionExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConditionExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITIONEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ConditionExpression");
    
    
    /**
     * Gets the "ConditionExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ConditionExpression getConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ConditionExpression)get_store().find_element_user(CONDITIONEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ConditionExpression" element
     */
    public boolean isNilConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ConditionExpression)get_store().find_element_user(CONDITIONEXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ConditionExpression" element
     */
    public void setConditionExpression(com.microsoft.schemas.xrm._2011.contracts.ConditionExpression conditionExpression)
    {
        generatedSetterHelperImpl(conditionExpression, CONDITIONEXPRESSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ConditionExpression" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ConditionExpression addNewConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ConditionExpression)get_store().add_element_user(CONDITIONEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ConditionExpression" element
     */
    public void setNilConditionExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ConditionExpression)get_store().find_element_user(CONDITIONEXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ConditionExpression)get_store().add_element_user(CONDITIONEXPRESSION$0);
            }
            target.setNil();
        }
    }
}
