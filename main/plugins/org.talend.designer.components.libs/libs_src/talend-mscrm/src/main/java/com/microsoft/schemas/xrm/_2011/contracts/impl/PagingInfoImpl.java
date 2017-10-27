/*
 * XML Type:  PagingInfo
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.PagingInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML PagingInfo(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class PagingInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.PagingInfo
{
    private static final long serialVersionUID = 1L;
    
    public PagingInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Count");
    private static final javax.xml.namespace.QName PAGENUMBER$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "PageNumber");
    private static final javax.xml.namespace.QName PAGINGCOOKIE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "PagingCookie");
    private static final javax.xml.namespace.QName RETURNTOTALRECORDCOUNT$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ReturnTotalRecordCount");
    
    
    /**
     * Gets the "Count" element
     */
    public int getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Count" element
     */
    public org.apache.xmlbeans.XmlInt xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COUNT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Count" element
     */
    public boolean isSetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNT$0) != 0;
        }
    }
    
    /**
     * Sets the "Count" element
     */
    public void setCount(int count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNT$0);
            }
            target.setIntValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "Count" element
     */
    public void xsetCount(org.apache.xmlbeans.XmlInt count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(COUNT$0);
            }
            target.set(count);
        }
    }
    
    /**
     * Unsets the "Count" element
     */
    public void unsetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNT$0, 0);
        }
    }
    
    /**
     * Gets the "PageNumber" element
     */
    public int getPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGENUMBER$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "PageNumber" element
     */
    public org.apache.xmlbeans.XmlInt xgetPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGENUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "PageNumber" element
     */
    public boolean isSetPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGENUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "PageNumber" element
     */
    public void setPageNumber(int pageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGENUMBER$2);
            }
            target.setIntValue(pageNumber);
        }
    }
    
    /**
     * Sets (as xml) the "PageNumber" element
     */
    public void xsetPageNumber(org.apache.xmlbeans.XmlInt pageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PAGENUMBER$2);
            }
            target.set(pageNumber);
        }
    }
    
    /**
     * Unsets the "PageNumber" element
     */
    public void unsetPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGENUMBER$2, 0);
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
     * Gets the "ReturnTotalRecordCount" element
     */
    public boolean getReturnTotalRecordCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURNTOTALRECORDCOUNT$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReturnTotalRecordCount" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetReturnTotalRecordCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RETURNTOTALRECORDCOUNT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReturnTotalRecordCount" element
     */
    public boolean isSetReturnTotalRecordCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RETURNTOTALRECORDCOUNT$6) != 0;
        }
    }
    
    /**
     * Sets the "ReturnTotalRecordCount" element
     */
    public void setReturnTotalRecordCount(boolean returnTotalRecordCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURNTOTALRECORDCOUNT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURNTOTALRECORDCOUNT$6);
            }
            target.setBooleanValue(returnTotalRecordCount);
        }
    }
    
    /**
     * Sets (as xml) the "ReturnTotalRecordCount" element
     */
    public void xsetReturnTotalRecordCount(org.apache.xmlbeans.XmlBoolean returnTotalRecordCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RETURNTOTALRECORDCOUNT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RETURNTOTALRECORDCOUNT$6);
            }
            target.set(returnTotalRecordCount);
        }
    }
    
    /**
     * Unsets the "ReturnTotalRecordCount" element
     */
    public void unsetReturnTotalRecordCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RETURNTOTALRECORDCOUNT$6, 0);
        }
    }
}
