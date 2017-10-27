/*
 * XML Type:  ConditionExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ConditionExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML ConditionExpression(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ConditionExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ConditionExpression
{
    private static final long serialVersionUID = 1L;
    
    public ConditionExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTENAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "AttributeName");
    private static final javax.xml.namespace.QName OPERATOR$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Operator");
    private static final javax.xml.namespace.QName VALUES$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Values");
    private static final javax.xml.namespace.QName ENTITYNAME$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "EntityName");
    
    
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
     * Gets the "Operator" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ConditionOperator.Enum getOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Operator" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ConditionOperator xgetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ConditionOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator)get_store().find_element_user(OPERATOR$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Operator" element
     */
    public boolean isSetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATOR$2) != 0;
        }
    }
    
    /**
     * Sets the "Operator" element
     */
    public void setOperator(com.microsoft.schemas.xrm._2011.contracts.ConditionOperator.Enum operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATOR$2);
            }
            target.setEnumValue(operator);
        }
    }
    
    /**
     * Sets (as xml) the "Operator" element
     */
    public void xsetOperator(com.microsoft.schemas.xrm._2011.contracts.ConditionOperator operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ConditionOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator)get_store().find_element_user(OPERATOR$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator)get_store().add_element_user(OPERATOR$2);
            }
            target.set(operator);
        }
    }
    
    /**
     * Unsets the "Operator" element
     */
    public void unsetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATOR$2, 0);
        }
    }
    
    /**
     * Gets the "Values" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType getValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType)get_store().find_element_user(VALUES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Values" element
     */
    public boolean isNilValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType)get_store().find_element_user(VALUES$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Values" element
     */
    public boolean isSetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUES$4) != 0;
        }
    }
    
    /**
     * Sets the "Values" element
     */
    public void setValues(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType values)
    {
        generatedSetterHelperImpl(values, VALUES$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Values" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType addNewValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType)get_store().add_element_user(VALUES$4);
            return target;
        }
    }
    
    /**
     * Nils the "Values" element
     */
    public void setNilValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType)get_store().find_element_user(VALUES$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType)get_store().add_element_user(VALUES$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Values" element
     */
    public void unsetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUES$4, 0);
        }
    }
    
    /**
     * Gets the "EntityName" element
     */
    public java.lang.String getEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityName" element
     */
    public org.apache.xmlbeans.XmlString xgetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityName" element
     */
    public boolean isNilEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "EntityName" element
     */
    public boolean isSetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYNAME$6) != 0;
        }
    }
    
    /**
     * Sets the "EntityName" element
     */
    public void setEntityName(java.lang.String entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYNAME$6);
            }
            target.setStringValue(entityName);
        }
    }
    
    /**
     * Sets (as xml) the "EntityName" element
     */
    public void xsetEntityName(org.apache.xmlbeans.XmlString entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYNAME$6);
            }
            target.set(entityName);
        }
    }
    
    /**
     * Nils the "EntityName" element
     */
    public void setNilEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYNAME$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "EntityName" element
     */
    public void unsetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYNAME$6, 0);
        }
    }
}
