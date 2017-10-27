/*
 * An XML document type.
 * Localname: AttributeMappingCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.AttributeMappingCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one AttributeMappingCollection(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class AttributeMappingCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.AttributeMappingCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributeMappingCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEMAPPINGCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "AttributeMappingCollection");
    
    
    /**
     * Gets the "AttributeMappingCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.AttributeMappingCollection getAttributeMappingCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributeMappingCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributeMappingCollection)get_store().find_element_user(ATTRIBUTEMAPPINGCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AttributeMappingCollection" element
     */
    public boolean isNilAttributeMappingCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributeMappingCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributeMappingCollection)get_store().find_element_user(ATTRIBUTEMAPPINGCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AttributeMappingCollection" element
     */
    public void setAttributeMappingCollection(com.microsoft.schemas.xrm._2011.contracts.AttributeMappingCollection attributeMappingCollection)
    {
        generatedSetterHelperImpl(attributeMappingCollection, ATTRIBUTEMAPPINGCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AttributeMappingCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.AttributeMappingCollection addNewAttributeMappingCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributeMappingCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributeMappingCollection)get_store().add_element_user(ATTRIBUTEMAPPINGCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "AttributeMappingCollection" element
     */
    public void setNilAttributeMappingCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.AttributeMappingCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.AttributeMappingCollection)get_store().find_element_user(ATTRIBUTEMAPPINGCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.AttributeMappingCollection)get_store().add_element_user(ATTRIBUTEMAPPINGCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
