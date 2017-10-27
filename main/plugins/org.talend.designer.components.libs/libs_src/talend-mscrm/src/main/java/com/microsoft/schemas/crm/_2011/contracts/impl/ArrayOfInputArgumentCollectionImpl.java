/*
 * XML Type:  ArrayOfInputArgumentCollection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfInputArgumentCollection(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfInputArgumentCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfInputArgumentCollection
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfInputArgumentCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INPUTARGUMENTCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "InputArgumentCollection");
    
    
    /**
     * Gets array of all "InputArgumentCollection" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection[] getInputArgumentCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INPUTARGUMENTCOLLECTION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection[] result = new com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "InputArgumentCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection getInputArgumentCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection)get_store().find_element_user(INPUTARGUMENTCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "InputArgumentCollection" element
     */
    public boolean isNilInputArgumentCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection)get_store().find_element_user(INPUTARGUMENTCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "InputArgumentCollection" element
     */
    public int sizeOfInputArgumentCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUTARGUMENTCOLLECTION$0);
        }
    }
    
    /**
     * Sets array of all "InputArgumentCollection" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInputArgumentCollectionArray(com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection[] inputArgumentCollectionArray)
    {
        check_orphaned();
        arraySetterHelper(inputArgumentCollectionArray, INPUTARGUMENTCOLLECTION$0);
    }
    
    /**
     * Sets ith "InputArgumentCollection" element
     */
    public void setInputArgumentCollectionArray(int i, com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection inputArgumentCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection)get_store().find_element_user(INPUTARGUMENTCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(inputArgumentCollection);
        }
    }
    
    /**
     * Nils the ith "InputArgumentCollection" element
     */
    public void setNilInputArgumentCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection)get_store().find_element_user(INPUTARGUMENTCOLLECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "InputArgumentCollection" element
     */
    public com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection insertNewInputArgumentCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection)get_store().insert_element_user(INPUTARGUMENTCOLLECTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "InputArgumentCollection" element
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
     * Removes the ith "InputArgumentCollection" element
     */
    public void removeInputArgumentCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUTARGUMENTCOLLECTION$0, i);
        }
    }
}
