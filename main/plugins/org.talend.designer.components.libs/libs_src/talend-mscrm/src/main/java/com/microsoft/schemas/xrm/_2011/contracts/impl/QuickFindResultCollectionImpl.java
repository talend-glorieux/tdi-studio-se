/*
 * XML Type:  QuickFindResultCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.QuickFindResultCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML QuickFindResultCollection(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class QuickFindResultCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.QuickFindResultCollection
{
    private static final long serialVersionUID = 1L;
    
    public QuickFindResultCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUICKFINDRESULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "QuickFindResult");
    
    
    /**
     * Gets array of all "QuickFindResult" elements
     */
    public com.microsoft.schemas.xrm._2011.contracts.QuickFindResult[] getQuickFindResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUICKFINDRESULT$0, targetList);
            com.microsoft.schemas.xrm._2011.contracts.QuickFindResult[] result = new com.microsoft.schemas.xrm._2011.contracts.QuickFindResult[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "QuickFindResult" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.QuickFindResult getQuickFindResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QuickFindResult target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QuickFindResult)get_store().find_element_user(QUICKFINDRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "QuickFindResult" element
     */
    public boolean isNilQuickFindResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QuickFindResult target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QuickFindResult)get_store().find_element_user(QUICKFINDRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "QuickFindResult" element
     */
    public int sizeOfQuickFindResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUICKFINDRESULT$0);
        }
    }
    
    /**
     * Sets array of all "QuickFindResult" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setQuickFindResultArray(com.microsoft.schemas.xrm._2011.contracts.QuickFindResult[] quickFindResultArray)
    {
        check_orphaned();
        arraySetterHelper(quickFindResultArray, QUICKFINDRESULT$0);
    }
    
    /**
     * Sets ith "QuickFindResult" element
     */
    public void setQuickFindResultArray(int i, com.microsoft.schemas.xrm._2011.contracts.QuickFindResult quickFindResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QuickFindResult target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QuickFindResult)get_store().find_element_user(QUICKFINDRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(quickFindResult);
        }
    }
    
    /**
     * Nils the ith "QuickFindResult" element
     */
    public void setNilQuickFindResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QuickFindResult target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QuickFindResult)get_store().find_element_user(QUICKFINDRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuickFindResult" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.QuickFindResult insertNewQuickFindResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.QuickFindResult target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.QuickFindResult)get_store().insert_element_user(QUICKFINDRESULT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuickFindResult" element
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
     * Removes the ith "QuickFindResult" element
     */
    public void removeQuickFindResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUICKFINDRESULT$0, i);
        }
    }
}
