/*
 * XML Type:  FormattedValueCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML FormattedValueCollection(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class FormattedValueCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.FormattedValueCollection
{
    private static final long serialVersionUID = 1L;
    
    public FormattedValueCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEPAIROFSTRINGSTRING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "KeyValuePairOfstringstring");
    
    
    /**
     * Gets array of all "KeyValuePairOfstringstring" elements
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring[] getKeyValuePairOfstringstringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYVALUEPAIROFSTRINGSTRING$0, targetList);
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring[] result = new org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyValuePairOfstringstring" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring getKeyValuePairOfstringstringArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring)get_store().find_element_user(KEYVALUEPAIROFSTRINGSTRING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "KeyValuePairOfstringstring" element
     */
    public int sizeOfKeyValuePairOfstringstringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYVALUEPAIROFSTRINGSTRING$0);
        }
    }
    
    /**
     * Sets array of all "KeyValuePairOfstringstring" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKeyValuePairOfstringstringArray(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring[] keyValuePairOfstringstringArray)
    {
        check_orphaned();
        arraySetterHelper(keyValuePairOfstringstringArray, KEYVALUEPAIROFSTRINGSTRING$0);
    }
    
    /**
     * Sets ith "KeyValuePairOfstringstring" element
     */
    public void setKeyValuePairOfstringstringArray(int i, org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring keyValuePairOfstringstring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring)get_store().find_element_user(KEYVALUEPAIROFSTRINGSTRING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyValuePairOfstringstring);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValuePairOfstringstring" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring insertNewKeyValuePairOfstringstring(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring)get_store().insert_element_user(KEYVALUEPAIROFSTRINGSTRING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValuePairOfstringstring" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring addNewKeyValuePairOfstringstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring)get_store().add_element_user(KEYVALUEPAIROFSTRINGSTRING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyValuePairOfstringstring" element
     */
    public void removeKeyValuePairOfstringstring(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYVALUEPAIROFSTRINGSTRING$0, i);
        }
    }
}
