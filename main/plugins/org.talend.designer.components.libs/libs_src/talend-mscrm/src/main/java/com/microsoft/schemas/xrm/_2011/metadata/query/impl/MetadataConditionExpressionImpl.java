/*
 * XML Type:  MetadataConditionExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * An XML MetadataConditionExpression(@http://schemas.microsoft.com/xrm/2011/Metadata/Query).
 *
 * This is a complex type.
 */
public class MetadataConditionExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionExpression
{
    private static final long serialVersionUID = 1L;
    
    public MetadataConditionExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITIONOPERATOR$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "ConditionOperator");
    private static final javax.xml.namespace.QName PROPERTYNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "PropertyName");
    private static final javax.xml.namespace.QName VALUE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "Value");
    
    
    /**
     * Gets the "ConditionOperator" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator.Enum getConditionOperator()
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
            return (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConditionOperator" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator xgetConditionOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator)get_store().find_element_user(CONDITIONOPERATOR$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ConditionOperator" element
     */
    public boolean isSetConditionOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDITIONOPERATOR$0) != 0;
        }
    }
    
    /**
     * Sets the "ConditionOperator" element
     */
    public void setConditionOperator(com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator.Enum conditionOperator)
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
    public void xsetConditionOperator(com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator conditionOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator)get_store().find_element_user(CONDITIONOPERATOR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.metadata.query.MetadataConditionOperator)get_store().add_element_user(CONDITIONOPERATOR$0);
            }
            target.set(conditionOperator);
        }
    }
    
    /**
     * Unsets the "ConditionOperator" element
     */
    public void unsetConditionOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDITIONOPERATOR$0, 0);
        }
    }
    
    /**
     * Gets the "PropertyName" element
     */
    public java.lang.String getPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PropertyName" element
     */
    public org.apache.xmlbeans.XmlString xgetPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PropertyName" element
     */
    public boolean isNilPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYNAME$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PropertyName" element
     */
    public boolean isSetPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTYNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "PropertyName" element
     */
    public void setPropertyName(java.lang.String propertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYNAME$2);
            }
            target.setStringValue(propertyName);
        }
    }
    
    /**
     * Sets (as xml) the "PropertyName" element
     */
    public void xsetPropertyName(org.apache.xmlbeans.XmlString propertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYNAME$2);
            }
            target.set(propertyName);
        }
    }
    
    /**
     * Nils the "PropertyName" element
     */
    public void setNilPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYNAME$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PropertyName" element
     */
    public void unsetPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTYNAME$2, 0);
        }
    }
    
    /**
     * Gets the "Value" element
     */
    public org.apache.xmlbeans.XmlObject getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(VALUE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Value" element
     */
    public boolean isNilValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(VALUE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Value" element
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$4) != 0;
        }
    }
    
    /**
     * Sets the "Value" element
     */
    public void setValue(org.apache.xmlbeans.XmlObject value)
    {
        generatedSetterHelperImpl(value, VALUE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Value" element
     */
    public org.apache.xmlbeans.XmlObject addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(VALUE$4);
            return target;
        }
    }
    
    /**
     * Nils the "Value" element
     */
    public void setNilValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(VALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(VALUE$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Value" element
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$4, 0);
        }
    }
}
