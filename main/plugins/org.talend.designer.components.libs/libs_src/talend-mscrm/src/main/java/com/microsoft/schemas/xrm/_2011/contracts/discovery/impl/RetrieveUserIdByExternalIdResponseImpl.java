/*
 * XML Type:  RetrieveUserIdByExternalIdResponse
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * An XML RetrieveUserIdByExternalIdResponse(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery).
 *
 * This is a complex type.
 */
public class RetrieveUserIdByExternalIdResponseImpl extends com.microsoft.schemas.xrm._2011.contracts.discovery.impl.DiscoveryResponseImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveUserIdByExternalIdResponse
{
    private static final long serialVersionUID = 1L;
    
    public RetrieveUserIdByExternalIdResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "UserId");
    
    
    /**
     * Gets the "UserId" element
     */
    public java.lang.String getUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserId" element
     */
    public com.microsoft.schemas._2003._10.serialization.Guid xgetUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(USERID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "UserId" element
     */
    public boolean isSetUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERID$0) != 0;
        }
    }
    
    /**
     * Sets the "UserId" element
     */
    public void setUserId(java.lang.String userId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$0);
            }
            target.setStringValue(userId);
        }
    }
    
    /**
     * Sets (as xml) the "UserId" element
     */
    public void xsetUserId(com.microsoft.schemas._2003._10.serialization.Guid userId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas._2003._10.serialization.Guid target = null;
            target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas._2003._10.serialization.Guid)get_store().add_element_user(USERID$0);
            }
            target.set(userId);
        }
    }
    
    /**
     * Unsets the "UserId" element
     */
    public void unsetUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERID$0, 0);
        }
    }
}
