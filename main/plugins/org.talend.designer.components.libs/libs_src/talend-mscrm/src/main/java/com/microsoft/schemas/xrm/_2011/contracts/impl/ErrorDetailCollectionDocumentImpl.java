/*
 * An XML document type.
 * Localname: ErrorDetailCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one ErrorDetailCollection(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ErrorDetailCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorDetailCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORDETAILCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ErrorDetailCollection");
    
    
    /**
     * Gets the "ErrorDetailCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection getErrorDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection)get_store().find_element_user(ERRORDETAILCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ErrorDetailCollection" element
     */
    public boolean isNilErrorDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection)get_store().find_element_user(ERRORDETAILCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ErrorDetailCollection" element
     */
    public void setErrorDetailCollection(com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection errorDetailCollection)
    {
        generatedSetterHelperImpl(errorDetailCollection, ERRORDETAILCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ErrorDetailCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection addNewErrorDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection)get_store().add_element_user(ERRORDETAILCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ErrorDetailCollection" element
     */
    public void setNilErrorDetailCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection)get_store().find_element_user(ERRORDETAILCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ErrorDetailCollection)get_store().add_element_user(ERRORDETAILCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
