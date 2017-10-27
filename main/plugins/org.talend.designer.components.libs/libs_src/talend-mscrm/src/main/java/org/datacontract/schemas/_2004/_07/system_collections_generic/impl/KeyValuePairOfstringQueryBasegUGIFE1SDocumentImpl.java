/*
 * An XML document type.
 * Localname: KeyValuePairOfstringQueryBasegUGIFE1S
 * Namespace: http://schemas.datacontract.org/2004/07/System.Collections.Generic
 * Java type: org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1SDocument
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.system_collections_generic.impl;
/**
 * A document containing one KeyValuePairOfstringQueryBasegUGIFE1S(@http://schemas.datacontract.org/2004/07/System.Collections.Generic) element.
 *
 * This is a complex type.
 */
public class KeyValuePairOfstringQueryBasegUGIFE1SDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1SDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyValuePairOfstringQueryBasegUGIFE1SDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEPAIROFSTRINGQUERYBASEGUGIFE1S$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringQueryBasegUGIFE1S");
    
    
    /**
     * Gets the "KeyValuePairOfstringQueryBasegUGIFE1S" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S getKeyValuePairOfstringQueryBasegUGIFE1S()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S)get_store().find_element_user(KEYVALUEPAIROFSTRINGQUERYBASEGUGIFE1S$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "KeyValuePairOfstringQueryBasegUGIFE1S" element
     */
    public boolean isNilKeyValuePairOfstringQueryBasegUGIFE1S()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S)get_store().find_element_user(KEYVALUEPAIROFSTRINGQUERYBASEGUGIFE1S$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "KeyValuePairOfstringQueryBasegUGIFE1S" element
     */
    public void setKeyValuePairOfstringQueryBasegUGIFE1S(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S keyValuePairOfstringQueryBasegUGIFE1S)
    {
        generatedSetterHelperImpl(keyValuePairOfstringQueryBasegUGIFE1S, KEYVALUEPAIROFSTRINGQUERYBASEGUGIFE1S$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "KeyValuePairOfstringQueryBasegUGIFE1S" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S addNewKeyValuePairOfstringQueryBasegUGIFE1S()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S)get_store().add_element_user(KEYVALUEPAIROFSTRINGQUERYBASEGUGIFE1S$0);
            return target;
        }
    }
    
    /**
     * Nils the "KeyValuePairOfstringQueryBasegUGIFE1S" element
     */
    public void setNilKeyValuePairOfstringQueryBasegUGIFE1S()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S)get_store().find_element_user(KEYVALUEPAIROFSTRINGQUERYBASEGUGIFE1S$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringQueryBasegUGIFE1S)get_store().add_element_user(KEYVALUEPAIROFSTRINGQUERYBASEGUGIFE1S$0);
            }
            target.setNil();
        }
    }
}
