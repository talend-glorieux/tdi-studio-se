/*
 * An XML document type.
 * Localname: LinkEntity
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.LinkEntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one LinkEntity(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class LinkEntityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.LinkEntityDocument
{
    private static final long serialVersionUID = 1L;
    
    public LinkEntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKENTITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "LinkEntity");
    
    
    /**
     * Gets the "LinkEntity" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LinkEntity getLinkEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LinkEntity)get_store().find_element_user(LINKENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LinkEntity" element
     */
    public boolean isNilLinkEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LinkEntity)get_store().find_element_user(LINKENTITY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LinkEntity" element
     */
    public void setLinkEntity(com.microsoft.schemas.xrm._2011.contracts.LinkEntity linkEntity)
    {
        generatedSetterHelperImpl(linkEntity, LINKENTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LinkEntity" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LinkEntity addNewLinkEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LinkEntity)get_store().add_element_user(LINKENTITY$0);
            return target;
        }
    }
    
    /**
     * Nils the "LinkEntity" element
     */
    public void setNilLinkEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LinkEntity target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LinkEntity)get_store().find_element_user(LINKENTITY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.LinkEntity)get_store().add_element_user(LINKENTITY$0);
            }
            target.setNil();
        }
    }
}
