/*
 * XML Type:  QueryByAttribute
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.QueryByAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML QueryByAttribute(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class QueryByAttributeImpl extends com.microsoft.schemas.xrm._2011.contracts.impl.QueryBaseImpl implements com.microsoft.schemas.xrm._2011.contracts.QueryByAttribute
{
    private static final long serialVersionUID = 1L;
    
    public QueryByAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Attributes");
    private static final javax.xml.namespace.QName COLUMNSET$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ColumnSet");
    private static final javax.xml.namespace.QName ENTITYNAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "EntityName");
    private static final javax.xml.namespace.QName ORDERS$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Orders");
    private static final javax.xml.namespace.QName PAGEINFO$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "PageInfo");
    private static final javax.xml.namespace.QName VALUES$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Values");
    private static final javax.xml.namespace.QName TOPCOUNT$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "TopCount");
    
    
    /**
     * Gets the "Attributes" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Attributes" element
     */
    public boolean isNilAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Attributes" element
     */
    public boolean isSetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$0) != 0;
        }
    }
    
    /**
     * Sets the "Attributes" element
     */
    public void setAttributes(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring attributes)
    {
        generatedSetterHelperImpl(attributes, ATTRIBUTES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(ATTRIBUTES$0);
            return target;
        }
    }
    
    /**
     * Nils the "Attributes" element
     */
    public void setNilAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring target = null;
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring)get_store().add_element_user(ATTRIBUTES$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Attributes" element
     */
    public void unsetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$0, 0);
        }
    }
    
    /**
     * Gets the "ColumnSet" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ColumnSet getColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ColumnSet target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().find_element_user(COLUMNSET$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ColumnSet" element
     */
    public boolean isNilColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ColumnSet target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().find_element_user(COLUMNSET$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ColumnSet" element
     */
    public boolean isSetColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLUMNSET$2) != 0;
        }
    }
    
    /**
     * Sets the "ColumnSet" element
     */
    public void setColumnSet(com.microsoft.schemas.xrm._2011.contracts.ColumnSet columnSet)
    {
        generatedSetterHelperImpl(columnSet, COLUMNSET$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ColumnSet" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ColumnSet addNewColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ColumnSet target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().add_element_user(COLUMNSET$2);
            return target;
        }
    }
    
    /**
     * Nils the "ColumnSet" element
     */
    public void setNilColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ColumnSet target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().find_element_user(COLUMNSET$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().add_element_user(COLUMNSET$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ColumnSet" element
     */
    public void unsetColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLUMNSET$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$4, 0);
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
            return get_store().count_elements(ENTITYNAME$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYNAME$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYNAME$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYNAME$4);
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
            get_store().remove_element(ENTITYNAME$4, 0);
        }
    }
    
    /**
     * Gets the "Orders" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression getOrders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression)get_store().find_element_user(ORDERS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Orders" element
     */
    public boolean isNilOrders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression)get_store().find_element_user(ORDERS$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Orders" element
     */
    public boolean isSetOrders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERS$6) != 0;
        }
    }
    
    /**
     * Sets the "Orders" element
     */
    public void setOrders(com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression orders)
    {
        generatedSetterHelperImpl(orders, ORDERS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Orders" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression addNewOrders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression)get_store().add_element_user(ORDERS$6);
            return target;
        }
    }
    
    /**
     * Nils the "Orders" element
     */
    public void setNilOrders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression)get_store().find_element_user(ORDERS$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression)get_store().add_element_user(ORDERS$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Orders" element
     */
    public void unsetOrders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERS$6, 0);
        }
    }
    
    /**
     * Gets the "PageInfo" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.PagingInfo getPageInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.PagingInfo target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.PagingInfo)get_store().find_element_user(PAGEINFO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PageInfo" element
     */
    public boolean isNilPageInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.PagingInfo target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.PagingInfo)get_store().find_element_user(PAGEINFO$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PageInfo" element
     */
    public boolean isSetPageInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGEINFO$8) != 0;
        }
    }
    
    /**
     * Sets the "PageInfo" element
     */
    public void setPageInfo(com.microsoft.schemas.xrm._2011.contracts.PagingInfo pageInfo)
    {
        generatedSetterHelperImpl(pageInfo, PAGEINFO$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PageInfo" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.PagingInfo addNewPageInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.PagingInfo target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.PagingInfo)get_store().add_element_user(PAGEINFO$8);
            return target;
        }
    }
    
    /**
     * Nils the "PageInfo" element
     */
    public void setNilPageInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.PagingInfo target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.PagingInfo)get_store().find_element_user(PAGEINFO$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.PagingInfo)get_store().add_element_user(PAGEINFO$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PageInfo" element
     */
    public void unsetPageInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGEINFO$8, 0);
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
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType)get_store().find_element_user(VALUES$10, 0);
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
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType)get_store().find_element_user(VALUES$10, 0);
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
            return get_store().count_elements(VALUES$10) != 0;
        }
    }
    
    /**
     * Sets the "Values" element
     */
    public void setValues(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType values)
    {
        generatedSetterHelperImpl(values, VALUES$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType)get_store().add_element_user(VALUES$10);
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
            target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType)get_store().find_element_user(VALUES$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType)get_store().add_element_user(VALUES$10);
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
            get_store().remove_element(VALUES$10, 0);
        }
    }
    
    /**
     * Gets the "TopCount" element
     */
    public int getTopCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPCOUNT$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "TopCount" element
     */
    public org.apache.xmlbeans.XmlInt xgetTopCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOPCOUNT$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TopCount" element
     */
    public boolean isNilTopCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOPCOUNT$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "TopCount" element
     */
    public boolean isSetTopCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOPCOUNT$12) != 0;
        }
    }
    
    /**
     * Sets the "TopCount" element
     */
    public void setTopCount(int topCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPCOUNT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOPCOUNT$12);
            }
            target.setIntValue(topCount);
        }
    }
    
    /**
     * Sets (as xml) the "TopCount" element
     */
    public void xsetTopCount(org.apache.xmlbeans.XmlInt topCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOPCOUNT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TOPCOUNT$12);
            }
            target.set(topCount);
        }
    }
    
    /**
     * Nils the "TopCount" element
     */
    public void setNilTopCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOPCOUNT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TOPCOUNT$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TopCount" element
     */
    public void unsetTopCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOPCOUNT$12, 0);
        }
    }
}
