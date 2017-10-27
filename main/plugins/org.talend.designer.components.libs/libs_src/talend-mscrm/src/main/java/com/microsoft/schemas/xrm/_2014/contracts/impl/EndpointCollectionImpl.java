/*
 * XML Type:  EndpointCollection
 * Namespace: http://schemas.microsoft.com/xrm/2014/Contracts
 * Java type: com.microsoft.schemas.xrm._2014.contracts.EndpointCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2014.contracts.impl;
/**
 * An XML EndpointCollection(@http://schemas.microsoft.com/xrm/2014/Contracts).
 *
 * This is a complex type.
 */
public class EndpointCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2014.contracts.EndpointCollection
{
    private static final long serialVersionUID = 1L;
    
    public EndpointCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEPAIROFENDPOINTTYPESTRINGYDL0RVHI$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2014/Contracts", "KeyValuePairOfEndpointTypestringyDL0RVHi");
    
    
    /**
     * Gets array of all "KeyValuePairOfEndpointTypestringyDL0RVHi" elements
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi[] getKeyValuePairOfEndpointTypestringyDL0RVHiArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYVALUEPAIROFENDPOINTTYPESTRINGYDL0RVHI$0, targetList);
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi[] result = new org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyValuePairOfEndpointTypestringyDL0RVHi" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi getKeyValuePairOfEndpointTypestringyDL0RVHiArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi)get_store().find_element_user(KEYVALUEPAIROFENDPOINTTYPESTRINGYDL0RVHI$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "KeyValuePairOfEndpointTypestringyDL0RVHi" element
     */
    public int sizeOfKeyValuePairOfEndpointTypestringyDL0RVHiArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYVALUEPAIROFENDPOINTTYPESTRINGYDL0RVHI$0);
        }
    }
    
    /**
     * Sets array of all "KeyValuePairOfEndpointTypestringyDL0RVHi" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKeyValuePairOfEndpointTypestringyDL0RVHiArray(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi[] keyValuePairOfEndpointTypestringyDL0RVHiArray)
    {
        check_orphaned();
        arraySetterHelper(keyValuePairOfEndpointTypestringyDL0RVHiArray, KEYVALUEPAIROFENDPOINTTYPESTRINGYDL0RVHI$0);
    }
    
    /**
     * Sets ith "KeyValuePairOfEndpointTypestringyDL0RVHi" element
     */
    public void setKeyValuePairOfEndpointTypestringyDL0RVHiArray(int i, org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi keyValuePairOfEndpointTypestringyDL0RVHi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi)get_store().find_element_user(KEYVALUEPAIROFENDPOINTTYPESTRINGYDL0RVHI$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyValuePairOfEndpointTypestringyDL0RVHi);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValuePairOfEndpointTypestringyDL0RVHi" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi insertNewKeyValuePairOfEndpointTypestringyDL0RVHi(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi)get_store().insert_element_user(KEYVALUEPAIROFENDPOINTTYPESTRINGYDL0RVHI$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValuePairOfEndpointTypestringyDL0RVHi" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi addNewKeyValuePairOfEndpointTypestringyDL0RVHi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi)get_store().add_element_user(KEYVALUEPAIROFENDPOINTTYPESTRINGYDL0RVHI$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyValuePairOfEndpointTypestringyDL0RVHi" element
     */
    public void removeKeyValuePairOfEndpointTypestringyDL0RVHi(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYVALUEPAIROFENDPOINTTYPESTRINGYDL0RVHI$0, i);
        }
    }
}
