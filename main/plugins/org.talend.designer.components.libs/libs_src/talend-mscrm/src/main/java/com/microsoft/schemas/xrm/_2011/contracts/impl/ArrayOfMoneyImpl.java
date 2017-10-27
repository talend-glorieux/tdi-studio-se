/*
 * XML Type:  ArrayOfMoney
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ArrayOfMoney
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML ArrayOfMoney(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfMoneyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ArrayOfMoney
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfMoneyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MONEY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "Money");
    
    
    /**
     * Gets array of all "Money" elements
     */
    public com.microsoft.schemas.xrm._2011.contracts.Money[] getMoneyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MONEY$0, targetList);
            com.microsoft.schemas.xrm._2011.contracts.Money[] result = new com.microsoft.schemas.xrm._2011.contracts.Money[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Money" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Money getMoneyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Money target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Money)get_store().find_element_user(MONEY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Money" element
     */
    public boolean isNilMoneyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Money target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Money)get_store().find_element_user(MONEY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Money" element
     */
    public int sizeOfMoneyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MONEY$0);
        }
    }
    
    /**
     * Sets array of all "Money" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMoneyArray(com.microsoft.schemas.xrm._2011.contracts.Money[] moneyArray)
    {
        check_orphaned();
        arraySetterHelper(moneyArray, MONEY$0);
    }
    
    /**
     * Sets ith "Money" element
     */
    public void setMoneyArray(int i, com.microsoft.schemas.xrm._2011.contracts.Money money)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Money target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Money)get_store().find_element_user(MONEY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(money);
        }
    }
    
    /**
     * Nils the ith "Money" element
     */
    public void setNilMoneyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Money target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Money)get_store().find_element_user(MONEY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Money" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Money insertNewMoney(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Money target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Money)get_store().insert_element_user(MONEY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Money" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Money addNewMoney()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Money target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Money)get_store().add_element_user(MONEY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Money" element
     */
    public void removeMoney(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MONEY$0, i);
        }
    }
}
