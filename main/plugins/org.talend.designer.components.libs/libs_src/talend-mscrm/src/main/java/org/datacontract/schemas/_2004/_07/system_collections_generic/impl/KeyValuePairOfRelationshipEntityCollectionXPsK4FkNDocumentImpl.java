/*
 * An XML document type.
 * Localname: KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN
 * Namespace: http://schemas.datacontract.org/2004/07/System.Collections.Generic
 * Java type: org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkNDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.system_collections_generic.impl;
/**
 * A document containing one KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN(@http://schemas.datacontract.org/2004/07/System.Collections.Generic) element.
 *
 * This is a complex type.
 */
public class KeyValuePairOfRelationshipEntityCollectionXPsK4FkNDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkNDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyValuePairOfRelationshipEntityCollectionXPsK4FkNDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEPAIROFRELATIONSHIPENTITYCOLLECTIONXPSK4FKN$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN");
    
    
    /**
     * Gets the "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN getKeyValuePairOfRelationshipEntityCollectionXPsK4FkN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN)get_store().find_element_user(KEYVALUEPAIROFRELATIONSHIPENTITYCOLLECTIONXPSK4FKN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element
     */
    public boolean isNilKeyValuePairOfRelationshipEntityCollectionXPsK4FkN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN)get_store().find_element_user(KEYVALUEPAIROFRELATIONSHIPENTITYCOLLECTIONXPSK4FKN$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element
     */
    public void setKeyValuePairOfRelationshipEntityCollectionXPsK4FkN(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN keyValuePairOfRelationshipEntityCollectionXPsK4FkN)
    {
        generatedSetterHelperImpl(keyValuePairOfRelationshipEntityCollectionXPsK4FkN, KEYVALUEPAIROFRELATIONSHIPENTITYCOLLECTIONXPSK4FKN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element
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
     * Nils the "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" element
     */
    public void setNilKeyValuePairOfRelationshipEntityCollectionXPsK4FkN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN)get_store().find_element_user(KEYVALUEPAIROFRELATIONSHIPENTITYCOLLECTIONXPSK4FKN$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN)get_store().add_element_user(KEYVALUEPAIROFRELATIONSHIPENTITYCOLLECTIONXPSK4FKN$0);
            }
            target.setNil();
        }
    }
}
