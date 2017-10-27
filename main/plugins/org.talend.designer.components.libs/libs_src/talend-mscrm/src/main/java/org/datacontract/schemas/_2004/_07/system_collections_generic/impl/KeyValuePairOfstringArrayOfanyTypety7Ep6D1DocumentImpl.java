/*
 * An XML document type.
 * Localname: KeyValuePairOfstringArrayOfanyTypety7Ep6D1
 * Namespace: http://schemas.datacontract.org/2004/07/System.Collections.Generic
 * Java type: org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringArrayOfanyTypety7Ep6D1Document
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.system_collections_generic.impl;
/**
 * A document containing one KeyValuePairOfstringArrayOfanyTypety7Ep6D1(@http://schemas.datacontract.org/2004/07/System.Collections.Generic) element.
 *
 * This is a complex type.
 */
public class KeyValuePairOfstringArrayOfanyTypety7Ep6D1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringArrayOfanyTypety7Ep6D1Document
{
    private static final long serialVersionUID = 1L;
    
    public KeyValuePairOfstringArrayOfanyTypety7Ep6D1DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEPAIROFSTRINGARRAYOFANYTYPETY7EP6D1$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringArrayOfanyTypety7Ep6D1");
    
    
    /**
     * Gets the "KeyValuePairOfstringArrayOfanyTypety7Ep6D1" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringArrayOfanyTypety7Ep6D1 getKeyValuePairOfstringArrayOfanyTypety7Ep6D1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringArrayOfanyTypety7Ep6D1 target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringArrayOfanyTypety7Ep6D1)get_store().find_element_user(KEYVALUEPAIROFSTRINGARRAYOFANYTYPETY7EP6D1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "KeyValuePairOfstringArrayOfanyTypety7Ep6D1" element
     */
    public boolean isNilKeyValuePairOfstringArrayOfanyTypety7Ep6D1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringArrayOfanyTypety7Ep6D1 target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringArrayOfanyTypety7Ep6D1)get_store().find_element_user(KEYVALUEPAIROFSTRINGARRAYOFANYTYPETY7EP6D1$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "KeyValuePairOfstringArrayOfanyTypety7Ep6D1" element
     */
    public void setKeyValuePairOfstringArrayOfanyTypety7Ep6D1(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringArrayOfanyTypety7Ep6D1 keyValuePairOfstringArrayOfanyTypety7Ep6D1)
    {
        generatedSetterHelperImpl(keyValuePairOfstringArrayOfanyTypety7Ep6D1, KEYVALUEPAIROFSTRINGARRAYOFANYTYPETY7EP6D1$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "KeyValuePairOfstringArrayOfanyTypety7Ep6D1" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringArrayOfanyTypety7Ep6D1 addNewKeyValuePairOfstringArrayOfanyTypety7Ep6D1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringArrayOfanyTypety7Ep6D1 target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringArrayOfanyTypety7Ep6D1)get_store().add_element_user(KEYVALUEPAIROFSTRINGARRAYOFANYTYPETY7EP6D1$0);
            return target;
        }
    }
    
    /**
     * Nils the "KeyValuePairOfstringArrayOfanyTypety7Ep6D1" element
     */
    public void setNilKeyValuePairOfstringArrayOfanyTypety7Ep6D1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringArrayOfanyTypety7Ep6D1 target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringArrayOfanyTypety7Ep6D1)get_store().find_element_user(KEYVALUEPAIROFSTRINGARRAYOFANYTYPETY7EP6D1$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringArrayOfanyTypety7Ep6D1)get_store().add_element_user(KEYVALUEPAIROFSTRINGARRAYOFANYTYPETY7EP6D1$0);
            }
            target.setNil();
        }
    }
}
