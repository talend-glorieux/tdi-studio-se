/*
 * An XML document type.
 * Localname: KeyValuePairOfEndpointTypestringztYlk6OT
 * Namespace: http://schemas.datacontract.org/2004/07/System.Collections.Generic
 * Java type: org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OTDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.system_collections_generic.impl;
/**
 * A document containing one KeyValuePairOfEndpointTypestringztYlk6OT(@http://schemas.datacontract.org/2004/07/System.Collections.Generic) element.
 *
 * This is a complex type.
 */
public class KeyValuePairOfEndpointTypestringztYlk6OTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OTDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyValuePairOfEndpointTypestringztYlk6OTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEPAIROFENDPOINTTYPESTRINGZTYLK6OT$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfEndpointTypestringztYlk6OT");
    
    
    /**
     * Gets the "KeyValuePairOfEndpointTypestringztYlk6OT" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT getKeyValuePairOfEndpointTypestringztYlk6OT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT)get_store().find_element_user(KEYVALUEPAIROFENDPOINTTYPESTRINGZTYLK6OT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "KeyValuePairOfEndpointTypestringztYlk6OT" element
     */
    public boolean isNilKeyValuePairOfEndpointTypestringztYlk6OT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT)get_store().find_element_user(KEYVALUEPAIROFENDPOINTTYPESTRINGZTYLK6OT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "KeyValuePairOfEndpointTypestringztYlk6OT" element
     */
    public void setKeyValuePairOfEndpointTypestringztYlk6OT(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT keyValuePairOfEndpointTypestringztYlk6OT)
    {
        generatedSetterHelperImpl(keyValuePairOfEndpointTypestringztYlk6OT, KEYVALUEPAIROFENDPOINTTYPESTRINGZTYLK6OT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "KeyValuePairOfEndpointTypestringztYlk6OT" element
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
     * Nils the "KeyValuePairOfEndpointTypestringztYlk6OT" element
     */
    public void setNilKeyValuePairOfEndpointTypestringztYlk6OT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT)get_store().find_element_user(KEYVALUEPAIROFENDPOINTTYPESTRINGZTYLK6OT$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT)get_store().add_element_user(KEYVALUEPAIROFENDPOINTTYPESTRINGZTYLK6OT$0);
            }
            target.setNil();
        }
    }
}
