/*
 * XML Type:  QueryByEntityNameDictionary
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML QueryByEntityNameDictionary(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class QueryByEntityNameDictionaryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.QueryByEntityNameDictionary
{
    private static final long serialVersionUID = 1L;
    
    public QueryByEntityNameDictionaryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEPAIROFSTRINGQUERYBASEGUGIFE1S$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "KeyValuePairOfstringQueryBasegUGIFE1S");
    
    
    /**
     * Gets array of all "KeyValuePairOfstringQueryBasegUGIFE1S" elements
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S[] getKeyValuePairOfstringQueryBasegUGIFE1SArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYVALUEPAIROFSTRINGQUERYBASEGUGIFE1S$0, targetList);
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S[] result = new org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyValuePairOfstringQueryBasegUGIFE1S" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S getKeyValuePairOfstringQueryBasegUGIFE1SArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S)get_store().find_element_user(KEYVALUEPAIROFSTRINGQUERYBASEGUGIFE1S$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "KeyValuePairOfstringQueryBasegUGIFE1S" element
     */
    public int sizeOfKeyValuePairOfstringQueryBasegUGIFE1SArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYVALUEPAIROFSTRINGQUERYBASEGUGIFE1S$0);
        }
    }
    
    /**
     * Sets array of all "KeyValuePairOfstringQueryBasegUGIFE1S" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKeyValuePairOfstringQueryBasegUGIFE1SArray(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S[] keyValuePairOfstringQueryBasegUGIFE1SArray)
    {
        check_orphaned();
        arraySetterHelper(keyValuePairOfstringQueryBasegUGIFE1SArray, KEYVALUEPAIROFSTRINGQUERYBASEGUGIFE1S$0);
    }
    
    /**
     * Sets ith "KeyValuePairOfstringQueryBasegUGIFE1S" element
     */
    public void setKeyValuePairOfstringQueryBasegUGIFE1SArray(int i, org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S keyValuePairOfstringQueryBasegUGIFE1S)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S)get_store().find_element_user(KEYVALUEPAIROFSTRINGQUERYBASEGUGIFE1S$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyValuePairOfstringQueryBasegUGIFE1S);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValuePairOfstringQueryBasegUGIFE1S" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S insertNewKeyValuePairOfstringQueryBasegUGIFE1S(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S)get_store().insert_element_user(KEYVALUEPAIROFSTRINGQUERYBASEGUGIFE1S$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValuePairOfstringQueryBasegUGIFE1S" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S addNewKeyValuePairOfstringQueryBasegUGIFE1S()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S)get_store().add_element_user(KEYVALUEPAIROFSTRINGQUERYBASEGUGIFE1S$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyValuePairOfstringQueryBasegUGIFE1S" element
     */
    public void removeKeyValuePairOfstringQueryBasegUGIFE1S(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYVALUEPAIROFSTRINGQUERYBASEGUGIFE1S$0, i);
        }
    }
}
