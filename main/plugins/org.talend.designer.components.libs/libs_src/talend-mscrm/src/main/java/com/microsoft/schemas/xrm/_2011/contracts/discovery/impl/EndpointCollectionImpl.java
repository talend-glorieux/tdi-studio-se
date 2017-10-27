/*
 * XML Type:  EndpointCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts/Discovery
 * Java type: com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.discovery.impl;
/**
 * An XML EndpointCollection(@http://schemas.microsoft.com/xrm/2011/Contracts/Discovery).
 *
 * This is a complex type.
 */
public class EndpointCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointCollection
{
    private static final long serialVersionUID = 1L;
    
    public EndpointCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEPAIROFENDPOINTTYPESTRINGZTYLK6OT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts/Discovery", "KeyValuePairOfEndpointTypestringztYlk6OT");
    
    
    /**
     * Gets array of all "KeyValuePairOfEndpointTypestringztYlk6OT" elements
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT[] getKeyValuePairOfEndpointTypestringztYlk6OTArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYVALUEPAIROFENDPOINTTYPESTRINGZTYLK6OT$0, targetList);
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT[] result = new org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyValuePairOfEndpointTypestringztYlk6OT" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT getKeyValuePairOfEndpointTypestringztYlk6OTArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT)get_store().find_element_user(KEYVALUEPAIROFENDPOINTTYPESTRINGZTYLK6OT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "KeyValuePairOfEndpointTypestringztYlk6OT" element
     */
    public int sizeOfKeyValuePairOfEndpointTypestringztYlk6OTArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYVALUEPAIROFENDPOINTTYPESTRINGZTYLK6OT$0);
        }
    }
    
    /**
     * Sets array of all "KeyValuePairOfEndpointTypestringztYlk6OT" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKeyValuePairOfEndpointTypestringztYlk6OTArray(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT[] keyValuePairOfEndpointTypestringztYlk6OTArray)
    {
        check_orphaned();
        arraySetterHelper(keyValuePairOfEndpointTypestringztYlk6OTArray, KEYVALUEPAIROFENDPOINTTYPESTRINGZTYLK6OT$0);
    }
    
    /**
     * Sets ith "KeyValuePairOfEndpointTypestringztYlk6OT" element
     */
    public void setKeyValuePairOfEndpointTypestringztYlk6OTArray(int i, org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT keyValuePairOfEndpointTypestringztYlk6OT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT)get_store().find_element_user(KEYVALUEPAIROFENDPOINTTYPESTRINGZTYLK6OT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyValuePairOfEndpointTypestringztYlk6OT);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValuePairOfEndpointTypestringztYlk6OT" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT insertNewKeyValuePairOfEndpointTypestringztYlk6OT(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT)get_store().insert_element_user(KEYVALUEPAIROFENDPOINTTYPESTRINGZTYLK6OT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValuePairOfEndpointTypestringztYlk6OT" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT addNewKeyValuePairOfEndpointTypestringztYlk6OT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT)get_store().add_element_user(KEYVALUEPAIROFENDPOINTTYPESTRINGZTYLK6OT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyValuePairOfEndpointTypestringztYlk6OT" element
     */
    public void removeKeyValuePairOfEndpointTypestringztYlk6OT(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYVALUEPAIROFENDPOINTTYPESTRINGZTYLK6OT$0, i);
        }
    }
}
