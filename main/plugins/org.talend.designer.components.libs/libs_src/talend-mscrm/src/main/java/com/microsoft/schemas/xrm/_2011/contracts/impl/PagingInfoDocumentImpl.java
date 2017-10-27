/*
 * An XML document type.
 * Localname: PagingInfo
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.PagingInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one PagingInfo(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class PagingInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.PagingInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public PagingInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAGINGINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "PagingInfo");
    
    
    /**
     * Gets the "PagingInfo" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.PagingInfo getPagingInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.PagingInfo target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.PagingInfo)get_store().find_element_user(PAGINGINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PagingInfo" element
     */
    public boolean isNilPagingInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.PagingInfo target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.PagingInfo)get_store().find_element_user(PAGINGINFO$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PagingInfo" element
     */
    public void setPagingInfo(com.microsoft.schemas.xrm._2011.contracts.PagingInfo pagingInfo)
    {
        generatedSetterHelperImpl(pagingInfo, PAGINGINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PagingInfo" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.PagingInfo addNewPagingInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.PagingInfo target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.PagingInfo)get_store().add_element_user(PAGINGINFO$0);
            return target;
        }
    }
    
    /**
     * Nils the "PagingInfo" element
     */
    public void setNilPagingInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.PagingInfo target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.PagingInfo)get_store().find_element_user(PAGINGINFO$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.PagingInfo)get_store().add_element_user(PAGINGINFO$0);
            }
            target.setNil();
        }
    }
}
