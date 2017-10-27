/*
 * An XML document type.
 * Localname: InputArgumentCollection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.InputArgumentCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * A document containing one InputArgumentCollection(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class InputArgumentCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.InputArgumentCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public InputArgumentCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INPUTARGUMENTCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "InputArgumentCollection");
    
    
    /**
     * Gets the "InputArgumentCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection getInputArgumentCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection)get_store().find_element_user(INPUTARGUMENTCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "InputArgumentCollection" element
     */
    public boolean isNilInputArgumentCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection)get_store().find_element_user(INPUTARGUMENTCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "InputArgumentCollection" element
     */
    public void setInputArgumentCollection(com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection inputArgumentCollection)
    {
        generatedSetterHelperImpl(inputArgumentCollection, INPUTARGUMENTCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InputArgumentCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection addNewInputArgumentCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection)get_store().add_element_user(INPUTARGUMENTCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "InputArgumentCollection" element
     */
    public void setNilInputArgumentCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection)get_store().find_element_user(INPUTARGUMENTCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection)get_store().add_element_user(INPUTARGUMENTCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
