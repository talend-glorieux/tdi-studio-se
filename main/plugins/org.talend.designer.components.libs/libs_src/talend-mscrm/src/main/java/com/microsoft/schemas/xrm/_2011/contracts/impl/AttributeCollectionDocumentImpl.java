/*
 * An XML document type.
 * Localname: AttributeCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.AttributeCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one AttributeCollection(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class AttributeCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.AttributeCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributeCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTECOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "AttributeCollection");
    
    
    /**
     * Gets the "AttributeCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.AttributeCollection getAttributeCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributeCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributeCollection)get_store().find_element_user(ATTRIBUTECOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeCollection" element
     */
    public boolean isNilAttributeCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributeCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributeCollection)get_store().find_element_user(ATTRIBUTECOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AttributeCollection" element
     */
    public void setAttributeCollection(com.microsoft.schemas.xrm._2011.contracts.AttributeCollection attributeCollection)
    {
        generatedSetterHelperImpl(attributeCollection, ATTRIBUTECOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AttributeCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.AttributeCollection addNewAttributeCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributeCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributeCollection)get_store().add_element_user(ATTRIBUTECOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "AttributeCollection" element
     */
    public void setNilAttributeCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributeCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributeCollection)get_store().find_element_user(ATTRIBUTECOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.AttributeCollection)get_store().add_element_user(ATTRIBUTECOLLECTION$0);
            }
            target.setNil();
        }
    }
}
