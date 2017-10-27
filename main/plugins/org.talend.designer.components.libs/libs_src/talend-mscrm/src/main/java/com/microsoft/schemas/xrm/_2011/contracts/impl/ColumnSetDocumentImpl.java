/*
 * An XML document type.
 * Localname: ColumnSet
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ColumnSetDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * A document containing one ColumnSet(@http://schemas.microsoft.com/xrm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public class ColumnSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ColumnSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public ColumnSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMNSET$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "ColumnSet");
    
    
    /**
     * Gets the "ColumnSet" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ColumnSet getColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ColumnSet target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().find_element_user(COLUMNSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ColumnSet" element
     */
    public boolean isNilColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ColumnSet target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().find_element_user(COLUMNSET$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ColumnSet" element
     */
    public void setColumnSet(com.microsoft.schemas.xrm._2011.contracts.ColumnSet columnSet)
    {
        generatedSetterHelperImpl(columnSet, COLUMNSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ColumnSet" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.ColumnSet addNewColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ColumnSet target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().add_element_user(COLUMNSET$0);
            return target;
        }
    }
    
    /**
     * Nils the "ColumnSet" element
     */
    public void setNilColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.ColumnSet target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().find_element_user(COLUMNSET$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.ColumnSet)get_store().add_element_user(COLUMNSET$0);
            }
            target.setNil();
        }
    }
}
