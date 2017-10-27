/*
 * An XML document type.
 * Localname: ParameterCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ParameterCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one ParameterCollection(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ParameterCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ParameterCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParameterCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ParameterCollection");
    
    
    /**
     * Gets the "ParameterCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ParameterCollection getParameterCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ParameterCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ParameterCollection)get_store().find_element_user(PARAMETERCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ParameterCollection" element
     */
    public boolean isNilParameterCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ParameterCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ParameterCollection)get_store().find_element_user(PARAMETERCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ParameterCollection" element
     */
    public void setParameterCollection(com.microsoft.schemas.xrm._2011.contracts.ParameterCollection parameterCollection)
    {
        generatedSetterHelperImpl(parameterCollection, PARAMETERCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ParameterCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ParameterCollection addNewParameterCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ParameterCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ParameterCollection)get_store().add_element_user(PARAMETERCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ParameterCollection" element
     */
    public void setNilParameterCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ParameterCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ParameterCollection)get_store().find_element_user(PARAMETERCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ParameterCollection)get_store().add_element_user(PARAMETERCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
