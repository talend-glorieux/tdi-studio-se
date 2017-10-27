/*
 * An XML document type.
 * Localname: QuickFindResultCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.QuickFindResultCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one QuickFindResultCollection(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class QuickFindResultCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.QuickFindResultCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public QuickFindResultCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUICKFINDRESULTCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "QuickFindResultCollection");
    
    
    /**
     * Gets the "QuickFindResultCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.QuickFindResultCollection getQuickFindResultCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QuickFindResultCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QuickFindResultCollection)get_store().find_element_user(QUICKFINDRESULTCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "QuickFindResultCollection" element
     */
    public boolean isNilQuickFindResultCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QuickFindResultCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QuickFindResultCollection)get_store().find_element_user(QUICKFINDRESULTCOLLECTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "QuickFindResultCollection" element
     */
    public void setQuickFindResultCollection(com.microsoft.schemas.xrm._2011.contracts.QuickFindResultCollection quickFindResultCollection)
    {
        generatedSetterHelperImpl(quickFindResultCollection, QUICKFINDRESULTCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "QuickFindResultCollection" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.QuickFindResultCollection addNewQuickFindResultCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QuickFindResultCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QuickFindResultCollection)get_store().add_element_user(QUICKFINDRESULTCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Nils the "QuickFindResultCollection" element
     */
    public void setNilQuickFindResultCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QuickFindResultCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QuickFindResultCollection)get_store().find_element_user(QUICKFINDRESULTCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.QuickFindResultCollection)get_store().add_element_user(QUICKFINDRESULTCOLLECTION$0);
            }
            target.setNil();
        }
    }
}
