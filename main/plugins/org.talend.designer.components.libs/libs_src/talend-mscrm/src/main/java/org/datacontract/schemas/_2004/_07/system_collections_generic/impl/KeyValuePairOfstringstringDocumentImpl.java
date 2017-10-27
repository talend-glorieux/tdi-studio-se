/*
 * An XML document type.
 * Localname: KeyValuePairOfstringstring
 * Namespace: http://schemas.datacontract.org/2004/07/System.Collections.Generic
 * Java type: org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstringDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.system_collections_generic.impl;
/**
 * A document containing one KeyValuePairOfstringstring(@http://schemas.datacontract.org/2004/07/System.Collections.Generic) element.
 *
 * This is a complex type.
 */
public class KeyValuePairOfstringstringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstringDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyValuePairOfstringstringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEPAIROFSTRINGSTRING$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring");
    
    
    /**
     * Gets the "KeyValuePairOfstringstring" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring getKeyValuePairOfstringstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring)get_store().find_element_user(KEYVALUEPAIROFSTRINGSTRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "KeyValuePairOfstringstring" element
     */
    public boolean isNilKeyValuePairOfstringstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring)get_store().find_element_user(KEYVALUEPAIROFSTRINGSTRING$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "KeyValuePairOfstringstring" element
     */
    public void setKeyValuePairOfstringstring(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring keyValuePairOfstringstring)
    {
        generatedSetterHelperImpl(keyValuePairOfstringstring, KEYVALUEPAIROFSTRINGSTRING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "KeyValuePairOfstringstring" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring addNewKeyValuePairOfstringstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring)get_store().add_element_user(KEYVALUEPAIROFSTRINGSTRING$0);
            return target;
        }
    }
    
    /**
     * Nils the "KeyValuePairOfstringstring" element
     */
    public void setNilKeyValuePairOfstringstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring)get_store().find_element_user(KEYVALUEPAIROFSTRINGSTRING$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringstring)get_store().add_element_user(KEYVALUEPAIROFSTRINGSTRING$0);
            }
            target.setNil();
        }
    }
}
