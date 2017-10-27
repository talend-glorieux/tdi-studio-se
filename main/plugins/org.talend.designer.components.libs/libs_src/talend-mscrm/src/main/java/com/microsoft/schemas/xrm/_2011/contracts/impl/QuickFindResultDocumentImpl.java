/*
 * An XML document type.
 * Localname: QuickFindResult
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.QuickFindResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one QuickFindResult(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class QuickFindResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.QuickFindResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public QuickFindResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUICKFINDRESULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "QuickFindResult");
    
    
    /**
     * Gets the "QuickFindResult" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.QuickFindResult getQuickFindResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QuickFindResult target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QuickFindResult)get_store().find_element_user(QUICKFINDRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "QuickFindResult" element
     */
    public boolean isNilQuickFindResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QuickFindResult target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QuickFindResult)get_store().find_element_user(QUICKFINDRESULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "QuickFindResult" element
     */
    public void setQuickFindResult(com.microsoft.schemas.xrm._2011.contracts.QuickFindResult quickFindResult)
    {
        generatedSetterHelperImpl(quickFindResult, QUICKFINDRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "QuickFindResult" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.QuickFindResult addNewQuickFindResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QuickFindResult target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QuickFindResult)get_store().add_element_user(QUICKFINDRESULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "QuickFindResult" element
     */
    public void setNilQuickFindResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QuickFindResult target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QuickFindResult)get_store().find_element_user(QUICKFINDRESULT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.QuickFindResult)get_store().add_element_user(QUICKFINDRESULT$0);
            }
            target.setNil();
        }
    }
}
