/*
 * An XML document type.
 * Localname: FormattedValueCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one FormattedValueCollection(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class FormattedValueCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public FormattedValueCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMATTEDVALUECOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "FormattedValueCollection");
    
    
    /**
     * Gets the "FormattedValueCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection getFormattedValueCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection)get_store().find_element_user(FORMATTEDVALUECOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FormattedValueCollection" element
     */
    public boolean isNilFormattedValueCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection)get_store().find_element_user(FORMATTEDVALUECOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FormattedValueCollection" element
     */
    public void setFormattedValueCollection(com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection formattedValueCollection)
    {
        generatedSetterHelperImpl(formattedValueCollection, FORMATTEDVALUECOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FormattedValueCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection addNewFormattedValueCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection)get_store().add_element_user(FORMATTEDVALUECOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "FormattedValueCollection" element
     */
    public void setNilFormattedValueCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection)get_store().find_element_user(FORMATTEDVALUECOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection)get_store().add_element_user(FORMATTEDVALUECOLLECTION$0);
            }
            target.setNil();
        }
    }
}
