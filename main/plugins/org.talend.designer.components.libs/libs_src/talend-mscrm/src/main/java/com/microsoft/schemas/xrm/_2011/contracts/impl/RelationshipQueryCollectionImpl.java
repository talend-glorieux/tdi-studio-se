/*
 * XML Type:  RelationshipQueryCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.RelationshipQueryCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML RelationshipQueryCollection(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class RelationshipQueryCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.RelationshipQueryCollection
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipQueryCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEPAIROFRELATIONSHIPQUERYBASEXPSK4FKN$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN");
    
    
    /**
     * Gets array of all "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN" elements
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN[] getKeyValuePairOfRelationshipQueryBaseXPsK4FkNArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYVALUEPAIROFRELATIONSHIPQUERYBASEXPSK4FKN$0, targetList);
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN[] result = new org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN getKeyValuePairOfRelationshipQueryBaseXPsK4FkNArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN)get_store().find_element_user(KEYVALUEPAIROFRELATIONSHIPQUERYBASEXPSK4FKN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN" element
     */
    public int sizeOfKeyValuePairOfRelationshipQueryBaseXPsK4FkNArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYVALUEPAIROFRELATIONSHIPQUERYBASEXPSK4FKN$0);
        }
    }
    
    /**
     * Sets array of all "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKeyValuePairOfRelationshipQueryBaseXPsK4FkNArray(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN[] keyValuePairOfRelationshipQueryBaseXPsK4FkNArray)
    {
        check_orphaned();
        arraySetterHelper(keyValuePairOfRelationshipQueryBaseXPsK4FkNArray, KEYVALUEPAIROFRELATIONSHIPQUERYBASEXPSK4FKN$0);
    }
    
    /**
     * Sets ith "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN" element
     */
    public void setKeyValuePairOfRelationshipQueryBaseXPsK4FkNArray(int i, org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN keyValuePairOfRelationshipQueryBaseXPsK4FkN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN)get_store().find_element_user(KEYVALUEPAIROFRELATIONSHIPQUERYBASEXPSK4FKN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyValuePairOfRelationshipQueryBaseXPsK4FkN);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN insertNewKeyValuePairOfRelationshipQueryBaseXPsK4FkN(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN)get_store().insert_element_user(KEYVALUEPAIROFRELATIONSHIPQUERYBASEXPSK4FKN$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN addNewKeyValuePairOfRelationshipQueryBaseXPsK4FkN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN)get_store().add_element_user(KEYVALUEPAIROFRELATIONSHIPQUERYBASEXPSK4FKN$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN" element
     */
    public void removeKeyValuePairOfRelationshipQueryBaseXPsK4FkN(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYVALUEPAIROFRELATIONSHIPQUERYBASEXPSK4FKN$0, i);
        }
    }
}
