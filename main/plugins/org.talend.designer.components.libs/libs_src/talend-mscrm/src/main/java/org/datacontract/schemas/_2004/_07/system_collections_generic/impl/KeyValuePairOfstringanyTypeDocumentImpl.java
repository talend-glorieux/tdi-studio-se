/*
 * An XML document type.
 * Localname: KeyValuePairOfstringanyType
 * Namespace: http://schemas.datacontract.org/2004/07/System.Collections.Generic
 * Java type: org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.system_collections_generic.impl;
/**
 * A document containing one KeyValuePairOfstringanyType(@http://schemas.datacontract.org/2004/07/System.Collections.Generic) element.
 *
 * This is a complex type.
 */
public class KeyValuePairOfstringanyTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyValuePairOfstringanyTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEPAIROFSTRINGANYTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringanyType");
    
    
    /**
     * Gets the "KeyValuePairOfstringanyType" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType getKeyValuePairOfstringanyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType)get_store().find_element_user(KEYVALUEPAIROFSTRINGANYTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "KeyValuePairOfstringanyType" element
     */
    public boolean isNilKeyValuePairOfstringanyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType)get_store().find_element_user(KEYVALUEPAIROFSTRINGANYTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "KeyValuePairOfstringanyType" element
     */
    public void setKeyValuePairOfstringanyType(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType keyValuePairOfstringanyType)
    {
        generatedSetterHelperImpl(keyValuePairOfstringanyType, KEYVALUEPAIROFSTRINGANYTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "KeyValuePairOfstringanyType" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType addNewKeyValuePairOfstringanyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType)get_store().add_element_user(KEYVALUEPAIROFSTRINGANYTYPE$0);
            return target;
        }
    }
    
    /**
     * Nils the "KeyValuePairOfstringanyType" element
     */
    public void setNilKeyValuePairOfstringanyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType)get_store().find_element_user(KEYVALUEPAIROFSTRINGANYTYPE$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType)get_store().add_element_user(KEYVALUEPAIROFSTRINGANYTYPE$0);
            }
            target.setNil();
        }
    }
}
