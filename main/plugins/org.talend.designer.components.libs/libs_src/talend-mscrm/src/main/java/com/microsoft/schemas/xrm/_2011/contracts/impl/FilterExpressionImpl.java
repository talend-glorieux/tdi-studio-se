/*
 * XML Type:  FilterExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.FilterExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML FilterExpression(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class FilterExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.FilterExpression
{
    private static final long serialVersionUID = 1L;
    
    public FilterExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITIONS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Conditions");
    private static final javax.xml.namespace.QName FILTEROPERATOR$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "FilterOperator");
    private static final javax.xml.namespace.QName FILTERS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Filters");
    private static final javax.xml.namespace.QName ISQUICKFINDFILTER$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "IsQuickFindFilter");
    
    
    /**
     * Gets the "Conditions" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression getConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression)get_store().find_element_user(CONDITIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Conditions" element
     */
    public boolean isNilConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression)get_store().find_element_user(CONDITIONS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Conditions" element
     */
    public boolean isSetConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDITIONS$0) != 0;
        }
    }
    
    /**
     * Sets the "Conditions" element
     */
    public void setConditions(com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression conditions)
    {
        generatedSetterHelperImpl(conditions, CONDITIONS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Conditions" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression addNewConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression)get_store().add_element_user(CONDITIONS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Conditions" element
     */
    public void setNilConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression)get_store().find_element_user(CONDITIONS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfConditionExpression)get_store().add_element_user(CONDITIONS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Conditions" element
     */
    public void unsetConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDITIONS$0, 0);
        }
    }
    
    /**
     * Gets the "FilterOperator" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LogicalOperator.Enum getFilterOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILTEROPERATOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.xrm._2011.contracts.LogicalOperator.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FilterOperator" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LogicalOperator xgetFilterOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LogicalOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LogicalOperator)get_store().find_element_user(FILTEROPERATOR$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "FilterOperator" element
     */
    public boolean isSetFilterOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTEROPERATOR$2) != 0;
        }
    }
    
    /**
     * Sets the "FilterOperator" element
     */
    public void setFilterOperator(com.microsoft.schemas.xrm._2011.contracts.LogicalOperator.Enum filterOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILTEROPERATOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILTEROPERATOR$2);
            }
            target.setEnumValue(filterOperator);
        }
    }
    
    /**
     * Sets (as xml) the "FilterOperator" element
     */
    public void xsetFilterOperator(com.microsoft.schemas.xrm._2011.contracts.LogicalOperator filterOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LogicalOperator target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LogicalOperator)get_store().find_element_user(FILTEROPERATOR$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.LogicalOperator)get_store().add_element_user(FILTEROPERATOR$2);
            }
            target.set(filterOperator);
        }
    }
    
    /**
     * Unsets the "FilterOperator" element
     */
    public void unsetFilterOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTEROPERATOR$2, 0);
        }
    }
    
    /**
     * Gets the "Filters" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression getFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression)get_store().find_element_user(FILTERS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Filters" element
     */
    public boolean isNilFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression)get_store().find_element_user(FILTERS$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Filters" element
     */
    public boolean isSetFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTERS$4) != 0;
        }
    }
    
    /**
     * Sets the "Filters" element
     */
    public void setFilters(com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression filters)
    {
        generatedSetterHelperImpl(filters, FILTERS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Filters" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression addNewFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression)get_store().add_element_user(FILTERS$4);
            return target;
        }
    }
    
    /**
     * Nils the "Filters" element
     */
    public void setNilFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression)get_store().find_element_user(FILTERS$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfFilterExpression)get_store().add_element_user(FILTERS$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Filters" element
     */
    public void unsetFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTERS$4, 0);
        }
    }
    
    /**
     * Gets the "IsQuickFindFilter" element
     */
    public boolean getIsQuickFindFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISQUICKFINDFILTER$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsQuickFindFilter" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsQuickFindFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISQUICKFINDFILTER$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsQuickFindFilter" element
     */
    public boolean isSetIsQuickFindFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISQUICKFINDFILTER$6) != 0;
        }
    }
    
    /**
     * Sets the "IsQuickFindFilter" element
     */
    public void setIsQuickFindFilter(boolean isQuickFindFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISQUICKFINDFILTER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISQUICKFINDFILTER$6);
            }
            target.setBooleanValue(isQuickFindFilter);
        }
    }
    
    /**
     * Sets (as xml) the "IsQuickFindFilter" element
     */
    public void xsetIsQuickFindFilter(org.apache.xmlbeans.XmlBoolean isQuickFindFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISQUICKFINDFILTER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISQUICKFINDFILTER$6);
            }
            target.set(isQuickFindFilter);
        }
    }
    
    /**
     * Unsets the "IsQuickFindFilter" element
     */
    public void unsetIsQuickFindFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISQUICKFINDFILTER$6, 0);
        }
    }
}
