/*
 * An XML document type.
 * Localname: KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF
 * Namespace: http://schemas.datacontract.org/2004/07/System.Collections.Generic
 * Java type: org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtFDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.system_collections_generic.impl;
/**
 * A document containing one KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF(@http://schemas.datacontract.org/2004/07/System.Collections.Generic) element.
 *
 * This is a complex type.
 */
public class KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtFDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtFDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtFDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEPAIROFDELETEDMETADATAFILTERSARRAYOFGUIDPLUVPKTF$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF");
    
    
    /**
     * Gets the "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF getKeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF)get_store().find_element_user(KEYVALUEPAIROFDELETEDMETADATAFILTERSARRAYOFGUIDPLUVPKTF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF" element
     */
    public boolean isNilKeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF)get_store().find_element_user(KEYVALUEPAIROFDELETEDMETADATAFILTERSARRAYOFGUIDPLUVPKTF$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF" element
     */
    public void setKeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF keyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF)
    {
        generatedSetterHelperImpl(keyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF, KEYVALUEPAIROFDELETEDMETADATAFILTERSARRAYOFGUIDPLUVPKTF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF" element
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
     * Nils the "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF" element
     */
    public void setNilKeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF)get_store().find_element_user(KEYVALUEPAIROFDELETEDMETADATAFILTERSARRAYOFGUIDPLUVPKTF$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF)get_store().add_element_user(KEYVALUEPAIROFDELETEDMETADATAFILTERSARRAYOFGUIDPLUVPKTF$0);
            }
            target.setNil();
        }
    }
}
