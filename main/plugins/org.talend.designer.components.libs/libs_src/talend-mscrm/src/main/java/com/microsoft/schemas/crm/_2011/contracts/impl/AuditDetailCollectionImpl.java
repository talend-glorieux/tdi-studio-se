/*
 * XML Type:  AuditDetailCollection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML AuditDetailCollection(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class AuditDetailCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.AuditDetailCollection
{
    private static final long serialVersionUID = 1L;
    
    public AuditDetailCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDITDETAILS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AuditDetails");
    private static final javax.xml.namespace.QName MORERECORDS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "MoreRecords");
    private static final javax.xml.namespace.QName PAGINGCOOKIE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "PagingCookie");
    private static final javax.xml.namespace.QName TOTALRECORDCOUNT$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "TotalRecordCount");
    
    
    /**
     * Gets the "AuditDetails" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail getAuditDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail)get_store().find_element_user(AUDITDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AuditDetails" element
     */
    public boolean isNilAuditDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail)get_store().find_element_user(AUDITDETAILS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AuditDetails" element
     */
    public boolean isSetAuditDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUDITDETAILS$0) != 0;
        }
    }
    
    /**
     * Sets the "AuditDetails" element
     */
    public void setAuditDetails(com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail auditDetails)
    {
        generatedSetterHelperImpl(auditDetails, AUDITDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AuditDetails" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail addNewAuditDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail)get_store().add_element_user(AUDITDETAILS$0);
            return target;
        }
    }
    
    /**
     * Nils the "AuditDetails" element
     */
    public void setNilAuditDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail)get_store().find_element_user(AUDITDETAILS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAuditDetail)get_store().add_element_user(AUDITDETAILS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AuditDetails" element
     */
    public void unsetAuditDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUDITDETAILS$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MORERECORDS$2, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MORERECORDS$2, 0);
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
            return get_store().count_elements(MORERECORDS$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MORERECORDS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MORERECORDS$2);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MORERECORDS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MORERECORDS$2);
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
            get_store().remove_element(MORERECORDS$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGINGCOOKIE$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGINGCOOKIE$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGINGCOOKIE$4, 0);
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
            return get_store().count_elements(PAGINGCOOKIE$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGINGCOOKIE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGINGCOOKIE$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGINGCOOKIE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAGINGCOOKIE$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGINGCOOKIE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAGINGCOOKIE$4);
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
            get_store().remove_element(PAGINGCOOKIE$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALRECORDCOUNT$6, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALRECORDCOUNT$6, 0);
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
            return get_store().count_elements(TOTALRECORDCOUNT$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALRECORDCOUNT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALRECORDCOUNT$6);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALRECORDCOUNT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TOTALRECORDCOUNT$6);
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
            get_store().remove_element(TOTALRECORDCOUNT$6, 0);
        }
    }
}
