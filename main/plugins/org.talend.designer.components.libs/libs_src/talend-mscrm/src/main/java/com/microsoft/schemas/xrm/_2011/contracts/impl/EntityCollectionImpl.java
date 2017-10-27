/*
 * XML Type:  EntityCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.EntityCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML EntityCollection(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class EntityCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.EntityCollection
{
    private static final long serialVersionUID = 1L;
    
    public EntityCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITIES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Entities");
    private static final javax.xml.namespace.QName ENTITYNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "EntityName");
    private static final javax.xml.namespace.QName MINACTIVEROWVERSION$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "MinActiveRowVersion");
    private static final javax.xml.namespace.QName MORERECORDS$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "MoreRecords");
    private static final javax.xml.namespace.QName PAGINGCOOKIE$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "PagingCookie");
    private static final javax.xml.namespace.QName TOTALRECORDCOUNT$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "TotalRecordCount");
    private static final javax.xml.namespace.QName TOTALRECORDCOUNTLIMITEXCEEDED$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "TotalRecordCountLimitExceeded");
    
    
    /**
     * Gets the "Entities" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity getEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity)get_store().find_element_user(ENTITIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Entities" element
     */
    public boolean isNilEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity)get_store().find_element_user(ENTITIES$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Entities" element
     */
    public boolean isSetEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITIES$0) != 0;
        }
    }
    
    /**
     * Sets the "Entities" element
     */
    public void setEntities(com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity entities)
    {
        generatedSetterHelperImpl(entities, ENTITIES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Entities" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity addNewEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity)get_store().add_element_user(ENTITIES$0);
            return target;
        }
    }
    
    /**
     * Nils the "Entities" element
     */
    public void setNilEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity)get_store().find_element_user(ENTITIES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntity)get_store().add_element_user(ENTITIES$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Entities" element
     */
    public void unsetEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITIES$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$2, 0);
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
            return get_store().count_elements(ENTITYNAME$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYNAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYNAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYNAME$2);
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
            get_store().remove_element(ENTITYNAME$2, 0);
        }
    }
    
    /**
     * Gets the "MinActiveRowVersion" element
     */
    public java.lang.String getMinActiveRowVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINACTIVEROWVERSION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinActiveRowVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetMinActiveRowVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINACTIVEROWVERSION$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "MinActiveRowVersion" element
     */
    public boolean isNilMinActiveRowVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINACTIVEROWVERSION$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "MinActiveRowVersion" element
     */
    public boolean isSetMinActiveRowVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINACTIVEROWVERSION$4) != 0;
        }
    }
    
    /**
     * Sets the "MinActiveRowVersion" element
     */
    public void setMinActiveRowVersion(java.lang.String minActiveRowVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINACTIVEROWVERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINACTIVEROWVERSION$4);
            }
            target.setStringValue(minActiveRowVersion);
        }
    }
    
    /**
     * Sets (as xml) the "MinActiveRowVersion" element
     */
    public void xsetMinActiveRowVersion(org.apache.xmlbeans.XmlString minActiveRowVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINACTIVEROWVERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MINACTIVEROWVERSION$4);
            }
            target.set(minActiveRowVersion);
        }
    }
    
    /**
     * Nils the "MinActiveRowVersion" element
     */
    public void setNilMinActiveRowVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINACTIVEROWVERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MINACTIVEROWVERSION$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "MinActiveRowVersion" element
     */
    public void unsetMinActiveRowVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINACTIVEROWVERSION$4, 0);
        }
    }
    
    /**
     * Gets the "MoreRecords" element
     */
    public boolean getMoreRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MORERECORDS$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "MoreRecords" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetMoreRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MORERECORDS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "MoreRecords" element
     */
    public boolean isSetMoreRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MORERECORDS$6) != 0;
        }
    }
    
    /**
     * Sets the "MoreRecords" element
     */
    public void setMoreRecords(boolean moreRecords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MORERECORDS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MORERECORDS$6);
            }
            target.setBooleanValue(moreRecords);
        }
    }
    
    /**
     * Sets (as xml) the "MoreRecords" element
     */
    public void xsetMoreRecords(org.apache.xmlbeans.XmlBoolean moreRecords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MORERECORDS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MORERECORDS$6);
            }
            target.set(moreRecords);
        }
    }
    
    /**
     * Unsets the "MoreRecords" element
     */
    public void unsetMoreRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MORERECORDS$6, 0);
        }
    }
    
    /**
     * Gets the "PagingCookie" element
     */
    public java.lang.String getPagingCookie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGINGCOOKIE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PagingCookie" element
     */
    public org.apache.xmlbeans.XmlString xgetPagingCookie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGINGCOOKIE$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PagingCookie" element
     */
    public boolean isNilPagingCookie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGINGCOOKIE$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PagingCookie" element
     */
    public boolean isSetPagingCookie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGINGCOOKIE$8) != 0;
        }
    }
    
    /**
     * Sets the "PagingCookie" element
     */
    public void setPagingCookie(java.lang.String pagingCookie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGINGCOOKIE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGINGCOOKIE$8);
            }
            target.setStringValue(pagingCookie);
        }
    }
    
    /**
     * Sets (as xml) the "PagingCookie" element
     */
    public void xsetPagingCookie(org.apache.xmlbeans.XmlString pagingCookie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGINGCOOKIE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAGINGCOOKIE$8);
            }
            target.set(pagingCookie);
        }
    }
    
    /**
     * Nils the "PagingCookie" element
     */
    public void setNilPagingCookie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGINGCOOKIE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAGINGCOOKIE$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PagingCookie" element
     */
    public void unsetPagingCookie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGINGCOOKIE$8, 0);
        }
    }
    
    /**
     * Gets the "TotalRecordCount" element
     */
    public int getTotalRecordCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALRECORDCOUNT$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalRecordCount" element
     */
    public org.apache.xmlbeans.XmlInt xgetTotalRecordCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALRECORDCOUNT$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalRecordCount" element
     */
    public boolean isSetTotalRecordCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALRECORDCOUNT$10) != 0;
        }
    }
    
    /**
     * Sets the "TotalRecordCount" element
     */
    public void setTotalRecordCount(int totalRecordCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALRECORDCOUNT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALRECORDCOUNT$10);
            }
            target.setIntValue(totalRecordCount);
        }
    }
    
    /**
     * Sets (as xml) the "TotalRecordCount" element
     */
    public void xsetTotalRecordCount(org.apache.xmlbeans.XmlInt totalRecordCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALRECORDCOUNT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TOTALRECORDCOUNT$10);
            }
            target.set(totalRecordCount);
        }
    }
    
    /**
     * Unsets the "TotalRecordCount" element
     */
    public void unsetTotalRecordCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALRECORDCOUNT$10, 0);
        }
    }
    
    /**
     * Gets the "TotalRecordCountLimitExceeded" element
     */
    public boolean getTotalRecordCountLimitExceeded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALRECORDCOUNTLIMITEXCEEDED$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalRecordCountLimitExceeded" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTotalRecordCountLimitExceeded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TOTALRECORDCOUNTLIMITEXCEEDED$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalRecordCountLimitExceeded" element
     */
    public boolean isSetTotalRecordCountLimitExceeded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALRECORDCOUNTLIMITEXCEEDED$12) != 0;
        }
    }
    
    /**
     * Sets the "TotalRecordCountLimitExceeded" element
     */
    public void setTotalRecordCountLimitExceeded(boolean totalRecordCountLimitExceeded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALRECORDCOUNTLIMITEXCEEDED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALRECORDCOUNTLIMITEXCEEDED$12);
            }
            target.setBooleanValue(totalRecordCountLimitExceeded);
        }
    }
    
    /**
     * Sets (as xml) the "TotalRecordCountLimitExceeded" element
     */
    public void xsetTotalRecordCountLimitExceeded(org.apache.xmlbeans.XmlBoolean totalRecordCountLimitExceeded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TOTALRECORDCOUNTLIMITEXCEEDED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TOTALRECORDCOUNTLIMITEXCEEDED$12);
            }
            target.set(totalRecordCountLimitExceeded);
        }
    }
    
    /**
     * Unsets the "TotalRecordCountLimitExceeded" element
     */
    public void unsetTotalRecordCountLimitExceeded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALRECORDCOUNTLIMITEXCEEDED$12, 0);
        }
    }
}
