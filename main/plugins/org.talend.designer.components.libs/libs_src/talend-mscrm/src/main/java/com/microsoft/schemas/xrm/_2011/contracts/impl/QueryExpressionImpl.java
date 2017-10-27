/*
 * XML Type:  QueryExpression
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.QueryExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML QueryExpression(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class QueryExpressionImpl extends com.microsoft.schemas.xrm._2011.contracts.impl.QueryBaseImpl implements com.microsoft.schemas.xrm._2011.contracts.QueryExpression
{
    private static final long serialVersionUID = 1L;
    
    public QueryExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMNSET$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ColumnSet");
    private static final javax.xml.namespace.QName CRITERIA$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Criteria");
    private static final javax.xml.namespace.QName DISTINCT$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Distinct");
    private static final javax.xml.namespace.QName ENTITYNAME$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "EntityName");
    private static final javax.xml.namespace.QName LINKENTITIES$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "LinkEntities");
    private static final javax.xml.namespace.QName ORDERS$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Orders");
    private static final javax.xml.namespace.QName PAGEINFO$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "PageInfo");
    private static final javax.xml.namespace.QName NOLOCK$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "NoLock");
    private static final javax.xml.namespace.QName TOPCOUNT$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "TopCount");
    
    
    /**
     * Gets the "ColumnSet" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ColumnSet getColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ColumnSet target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().find_element_user(COLUMNSET$0, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().find_element_user(COLUMNSET$0, 0);
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
            return get_store().count_elements(COLUMNSET$0) != 0;
        }
    }
    
    /**
     * Sets the "ColumnSet" element
     */
    public void setColumnSet(com.microsoft.schemas.xrm._2011.contracts.ColumnSet columnSet)
    {
        generatedSetterHelperImpl(columnSet, COLUMNSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().add_element_user(COLUMNSET$0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().find_element_user(COLUMNSET$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().add_element_user(COLUMNSET$0);
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
            get_store().remove_element(COLUMNSET$0, 0);
        }
    }
    
    /**
     * Gets the "Criteria" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.FilterExpression getCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().find_element_user(CRITERIA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Criteria" element
     */
    public boolean isNilCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().find_element_user(CRITERIA$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Criteria" element
     */
    public boolean isSetCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CRITERIA$2) != 0;
        }
    }
    
    /**
     * Sets the "Criteria" element
     */
    public void setCriteria(com.microsoft.schemas.xrm._2011.contracts.FilterExpression criteria)
    {
        generatedSetterHelperImpl(criteria, CRITERIA$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Criteria" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.FilterExpression addNewCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().add_element_user(CRITERIA$2);
            return target;
        }
    }
    
    /**
     * Nils the "Criteria" element
     */
    public void setNilCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FilterExpression target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().find_element_user(CRITERIA$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.FilterExpression)get_store().add_element_user(CRITERIA$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Criteria" element
     */
    public void unsetCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CRITERIA$2, 0);
        }
    }
    
    /**
     * Gets the "Distinct" element
     */
    public boolean getDistinct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTINCT$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Distinct" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDistinct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DISTINCT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Distinct" element
     */
    public boolean isSetDistinct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTINCT$4) != 0;
        }
    }
    
    /**
     * Sets the "Distinct" element
     */
    public void setDistinct(boolean distinct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTINCT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTINCT$4);
            }
            target.setBooleanValue(distinct);
        }
    }
    
    /**
     * Sets (as xml) the "Distinct" element
     */
    public void xsetDistinct(org.apache.xmlbeans.XmlBoolean distinct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DISTINCT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DISTINCT$4);
            }
            target.set(distinct);
        }
    }
    
    /**
     * Unsets the "Distinct" element
     */
    public void unsetDistinct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTINCT$4, 0);
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
    
    /**
     * Gets the "LinkEntities" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity getLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity)get_store().find_element_user(LINKENTITIES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LinkEntities" element
     */
    public boolean isNilLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity)get_store().find_element_user(LINKENTITIES$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "LinkEntities" element
     */
    public boolean isSetLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKENTITIES$8) != 0;
        }
    }
    
    /**
     * Sets the "LinkEntities" element
     */
    public void setLinkEntities(com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity linkEntities)
    {
        generatedSetterHelperImpl(linkEntities, LINKENTITIES$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LinkEntities" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity addNewLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity)get_store().add_element_user(LINKENTITIES$8);
            return target;
        }
    }
    
    /**
     * Nils the "LinkEntities" element
     */
    public void setNilLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity)get_store().find_element_user(LINKENTITIES$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfLinkEntity)get_store().add_element_user(LINKENTITIES$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "LinkEntities" element
     */
    public void unsetLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKENTITIES$8, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression)get_store().find_element_user(ORDERS$10, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression)get_store().find_element_user(ORDERS$10, 0);
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
            return get_store().count_elements(ORDERS$10) != 0;
        }
    }
    
    /**
     * Sets the "Orders" element
     */
    public void setOrders(com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression orders)
    {
        generatedSetterHelperImpl(orders, ORDERS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression)get_store().add_element_user(ORDERS$10);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression)get_store().find_element_user(ORDERS$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfOrderExpression)get_store().add_element_user(ORDERS$10);
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
            get_store().remove_element(ORDERS$10, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.PagingInfo)get_store().find_element_user(PAGEINFO$12, 0);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.PagingInfo)get_store().find_element_user(PAGEINFO$12, 0);
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
            return get_store().count_elements(PAGEINFO$12) != 0;
        }
    }
    
    /**
     * Sets the "PageInfo" element
     */
    public void setPageInfo(com.microsoft.schemas.xrm._2011.contracts.PagingInfo pageInfo)
    {
        generatedSetterHelperImpl(pageInfo, PAGEINFO$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.PagingInfo)get_store().add_element_user(PAGEINFO$12);
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
            target = (com.microsoft.schemas.xrm._2011.contracts.PagingInfo)get_store().find_element_user(PAGEINFO$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.PagingInfo)get_store().add_element_user(PAGEINFO$12);
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
            get_store().remove_element(PAGEINFO$12, 0);
        }
    }
    
    /**
     * Gets the "NoLock" element
     */
    public boolean getNoLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOLOCK$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "NoLock" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetNoLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NOLOCK$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "NoLock" element
     */
    public boolean isSetNoLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOLOCK$14) != 0;
        }
    }
    
    /**
     * Sets the "NoLock" element
     */
    public void setNoLock(boolean noLock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOLOCK$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOLOCK$14);
            }
            target.setBooleanValue(noLock);
        }
    }
    
    /**
     * Sets (as xml) the "NoLock" element
     */
    public void xsetNoLock(org.apache.xmlbeans.XmlBoolean noLock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NOLOCK$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NOLOCK$14);
            }
            target.set(noLock);
        }
    }
    
    /**
     * Unsets the "NoLock" element
     */
    public void unsetNoLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOLOCK$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPCOUNT$16, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOPCOUNT$16, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOPCOUNT$16, 0);
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
            return get_store().count_elements(TOPCOUNT$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPCOUNT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOPCOUNT$16);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOPCOUNT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TOPCOUNT$16);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOPCOUNT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TOPCOUNT$16);
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
            get_store().remove_element(TOPCOUNT$16, 0);
        }
    }
}
