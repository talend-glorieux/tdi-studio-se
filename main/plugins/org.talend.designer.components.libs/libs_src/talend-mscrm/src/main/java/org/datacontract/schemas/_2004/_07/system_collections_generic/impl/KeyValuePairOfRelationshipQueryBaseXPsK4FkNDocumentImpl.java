/*
 * An XML document type.
 * Localname: KeyValuePairOfRelationshipQueryBaseX_PsK4FkN
 * Namespace: http://schemas.datacontract.org/2004/07/System.Collections.Generic
 * Java type: org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkNDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.system_collections_generic.impl;
/**
 * A document containing one KeyValuePairOfRelationshipQueryBaseX_PsK4FkN(@http://schemas.datacontract.org/2004/07/System.Collections.Generic) element.
 *
 * This is a complex type.
 */
public class KeyValuePairOfRelationshipQueryBaseXPsK4FkNDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkNDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyValuePairOfRelationshipQueryBaseXPsK4FkNDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEPAIROFRELATIONSHIPQUERYBASEXPSK4FKN$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN");
    
    
    /**
     * Gets the "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN getKeyValuePairOfRelationshipQueryBaseXPsK4FkN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN)get_store().find_element_user(KEYVALUEPAIROFRELATIONSHIPQUERYBASEXPSK4FKN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN" element
     */
    public boolean isNilKeyValuePairOfRelationshipQueryBaseXPsK4FkN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN)get_store().find_element_user(KEYVALUEPAIROFRELATIONSHIPQUERYBASEXPSK4FKN$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN" element
     */
    public void setKeyValuePairOfRelationshipQueryBaseXPsK4FkN(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN keyValuePairOfRelationshipQueryBaseXPsK4FkN)
    {
        generatedSetterHelperImpl(keyValuePairOfRelationshipQueryBaseXPsK4FkN, KEYVALUEPAIROFRELATIONSHIPQUERYBASEXPSK4FKN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN" element
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
     * Nils the "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN" element
     */
    public void setNilKeyValuePairOfRelationshipQueryBaseXPsK4FkN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN)get_store().find_element_user(KEYVALUEPAIROFRELATIONSHIPQUERYBASEXPSK4FKN$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipQueryBaseXPsK4FkN)get_store().add_element_user(KEYVALUEPAIROFRELATIONSHIPQUERYBASEXPSK4FKN$0);
            }
            target.setNil();
        }
    }
}
