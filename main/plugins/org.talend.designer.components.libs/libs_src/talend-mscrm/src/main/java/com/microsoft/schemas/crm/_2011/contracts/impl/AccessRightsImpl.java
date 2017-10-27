/*
 * XML Type:  AccessRights
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.AccessRights
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML AccessRights(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a list type whose items are com.microsoft.schemas.crm._2011.contracts.AccessRights$Item.
 */
public class AccessRightsImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements com.microsoft.schemas.crm._2011.contracts.AccessRights
{
    private static final long serialVersionUID = 1L;
    
    public AccessRightsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected AccessRightsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.microsoft.schemas.crm._2011.contracts.AccessRights$Item.
     */
    public static class ItemImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.microsoft.schemas.crm._2011.contracts.AccessRights.Item
    {
        private static final long serialVersionUID = 1L;
        
        public ItemImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ItemImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
