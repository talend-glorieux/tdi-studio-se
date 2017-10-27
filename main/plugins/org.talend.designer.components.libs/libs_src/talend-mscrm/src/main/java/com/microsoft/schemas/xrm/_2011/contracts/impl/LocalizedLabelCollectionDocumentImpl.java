/*
 * An XML document type.
 * Localname: LocalizedLabelCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one LocalizedLabelCollection(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class LocalizedLabelCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocalizedLabelCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCALIZEDLABELCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "LocalizedLabelCollection");
    
    
    /**
     * Gets the "LocalizedLabelCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection getLocalizedLabelCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection)get_store().find_element_user(LOCALIZEDLABELCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocalizedLabelCollection" element
     */
    public boolean isNilLocalizedLabelCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection)get_store().find_element_user(LOCALIZEDLABELCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocalizedLabelCollection" element
     */
    public void setLocalizedLabelCollection(com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection localizedLabelCollection)
    {
        generatedSetterHelperImpl(localizedLabelCollection, LOCALIZEDLABELCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LocalizedLabelCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection addNewLocalizedLabelCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection)get_store().add_element_user(LOCALIZEDLABELCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocalizedLabelCollection" element
     */
    public void setNilLocalizedLabelCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection)get_store().find_element_user(LOCALIZEDLABELCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.LocalizedLabelCollection)get_store().add_element_user(LOCALIZEDLABELCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
