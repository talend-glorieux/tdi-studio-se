/*
 * An XML document type.
 * Localname: KeyValuePairOfEndpointTypestringyDL0RVHi
 * Namespace: http://schemas.datacontract.org/2004/07/System.Collections.Generic
 * Java type: org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHiDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.system_collections_generic.impl;
/**
 * A document containing one KeyValuePairOfEndpointTypestringyDL0RVHi(@http://schemas.datacontract.org/2004/07/System.Collections.Generic) element.
 *
 * This is a complex type.
 */
public class KeyValuePairOfEndpointTypestringyDL0RVHiDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHiDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyValuePairOfEndpointTypestringyDL0RVHiDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEPAIROFENDPOINTTYPESTRINGYDL0RVHI$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfEndpointTypestringyDL0RVHi");
    
    
    /**
     * Gets the "KeyValuePairOfEndpointTypestringyDL0RVHi" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi getKeyValuePairOfEndpointTypestringyDL0RVHi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi)get_store().find_element_user(KEYVALUEPAIROFENDPOINTTYPESTRINGYDL0RVHI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "KeyValuePairOfEndpointTypestringyDL0RVHi" element
     */
    public boolean isNilKeyValuePairOfEndpointTypestringyDL0RVHi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi)get_store().find_element_user(KEYVALUEPAIROFENDPOINTTYPESTRINGYDL0RVHI$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "KeyValuePairOfEndpointTypestringyDL0RVHi" element
     */
    public void setKeyValuePairOfEndpointTypestringyDL0RVHi(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi keyValuePairOfEndpointTypestringyDL0RVHi)
    {
        generatedSetterHelperImpl(keyValuePairOfEndpointTypestringyDL0RVHi, KEYVALUEPAIROFENDPOINTTYPESTRINGYDL0RVHI$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "KeyValuePairOfEndpointTypestringyDL0RVHi" element
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
     * Nils the "KeyValuePairOfEndpointTypestringyDL0RVHi" element
     */
    public void setNilKeyValuePairOfEndpointTypestringyDL0RVHi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi)get_store().find_element_user(KEYVALUEPAIROFENDPOINTTYPESTRINGYDL0RVHI$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringyDL0RVHi)get_store().add_element_user(KEYVALUEPAIROFENDPOINTTYPESTRINGYDL0RVHI$0);
            }
            target.setNil();
        }
    }
}
