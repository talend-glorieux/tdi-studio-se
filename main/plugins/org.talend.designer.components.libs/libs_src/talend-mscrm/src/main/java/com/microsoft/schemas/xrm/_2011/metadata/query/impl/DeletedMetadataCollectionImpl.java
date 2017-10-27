/*
 * XML Type:  DeletedMetadataCollection
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata/Query
 * Java type: com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.query.impl;
/**
 * An XML DeletedMetadataCollection(@http://schemas.microsoft.com/xrm/2011/Metadata/Query).
 *
 * This is a complex type.
 */
public class DeletedMetadataCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataCollection
{
    private static final long serialVersionUID = 1L;
    
    public DeletedMetadataCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEPAIROFDELETEDMETADATAFILTERSARRAYOFGUIDPLUVPKTF$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF");
    
    
    /**
     * Gets array of all "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF" elements
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF[] getKeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtFArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYVALUEPAIROFDELETEDMETADATAFILTERSARRAYOFGUIDPLUVPKTF$0, targetList);
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF[] result = new org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF getKeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtFArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF)get_store().find_element_user(KEYVALUEPAIROFDELETEDMETADATAFILTERSARRAYOFGUIDPLUVPKTF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF" element
     */
    public int sizeOfKeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtFArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYVALUEPAIROFDELETEDMETADATAFILTERSARRAYOFGUIDPLUVPKTF$0);
        }
    }
    
    /**
     * Sets array of all "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtFArray(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF[] keyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtFArray)
    {
        check_orphaned();
        arraySetterHelper(keyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtFArray, KEYVALUEPAIROFDELETEDMETADATAFILTERSARRAYOFGUIDPLUVPKTF$0);
    }
    
    /**
     * Sets ith "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF" element
     */
    public void setKeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtFArray(int i, org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF keyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF)get_store().find_element_user(KEYVALUEPAIROFDELETEDMETADATAFILTERSARRAYOFGUIDPLUVPKTF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF insertNewKeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF)get_store().insert_element_user(KEYVALUEPAIROFDELETEDMETADATAFILTERSARRAYOFGUIDPLUVPKTF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF addNewKeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF)get_store().add_element_user(KEYVALUEPAIROFDELETEDMETADATAFILTERSARRAYOFGUIDPLUVPKTF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF" element
     */
    public void removeKeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYVALUEPAIROFDELETEDMETADATAFILTERSARRAYOFGUIDPLUVPKTF$0, i);
        }
    }
}
