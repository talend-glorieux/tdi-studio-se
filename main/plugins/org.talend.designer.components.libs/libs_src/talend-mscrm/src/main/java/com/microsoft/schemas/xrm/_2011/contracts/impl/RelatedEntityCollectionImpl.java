/*
 * XML Type:  RelatedEntityCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML RelatedEntityCollection(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class RelatedEntityCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.RelatedEntityCollection
{
    private static final long serialVersionUID = 1L;
    
    public RelatedEntityCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEPAIROFRELATIONSHIPENTITYCOLLECTIONXPSK4FKN$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN");
    
    
    /**
     * Gets array of all "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" elements
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN[] getKeyValuePairOfRelationshipEntityCollectionXPsK4FkNArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYVALUEPAIROFRELATIONSHIPENTITYCOLLECTIONXPSK4FKN$0, targetList);
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN[] result = new org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN getKeyValuePairOfRelationshipEntityCollectionXPsK4FkNArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN)get_store().find_element_user(KEYVALUEPAIROFRELATIONSHIPENTITYCOLLECTIONXPSK4FKN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element
     */
    public int sizeOfKeyValuePairOfRelationshipEntityCollectionXPsK4FkNArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYVALUEPAIROFRELATIONSHIPENTITYCOLLECTIONXPSK4FKN$0);
        }
    }
    
    /**
     * Sets array of all "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKeyValuePairOfRelationshipEntityCollectionXPsK4FkNArray(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN[] keyValuePairOfRelationshipEntityCollectionXPsK4FkNArray)
    {
        check_orphaned();
        arraySetterHelper(keyValuePairOfRelationshipEntityCollectionXPsK4FkNArray, KEYVALUEPAIROFRELATIONSHIPENTITYCOLLECTIONXPSK4FKN$0);
    }
    
    /**
     * Sets ith "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element
     */
    public void setKeyValuePairOfRelationshipEntityCollectionXPsK4FkNArray(int i, org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN keyValuePairOfRelationshipEntityCollectionXPsK4FkN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN)get_store().find_element_user(KEYVALUEPAIROFRELATIONSHIPENTITYCOLLECTIONXPSK4FKN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyValuePairOfRelationshipEntityCollectionXPsK4FkN);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN insertNewKeyValuePairOfRelationshipEntityCollectionXPsK4FkN(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN)get_store().insert_element_user(KEYVALUEPAIROFRELATIONSHIPENTITYCOLLECTIONXPSK4FKN$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN addNewKeyValuePairOfRelationshipEntityCollectionXPsK4FkN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN)get_store().add_element_user(KEYVALUEPAIROFRELATIONSHIPENTITYCOLLECTIONXPSK4FKN$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element
     */
    public void removeKeyValuePairOfRelationshipEntityCollectionXPsK4FkN(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYVALUEPAIROFRELATIONSHIPENTITYCOLLECTIONXPSK4FKN$0, i);
        }
    }
}
