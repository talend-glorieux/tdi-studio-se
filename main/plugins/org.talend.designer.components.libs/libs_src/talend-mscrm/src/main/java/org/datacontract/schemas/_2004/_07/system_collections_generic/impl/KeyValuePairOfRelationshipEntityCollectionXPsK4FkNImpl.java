/*
 * XML Type:  KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN
 * Namespace: http://schemas.datacontract.org/2004/07/System.Collections.Generic
 * Java type: org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.system_collections_generic.impl;
/**
 * An XML KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN(@http://schemas.datacontract.org/2004/07/System.Collections.Generic).
 *
 * This is a complex type.
 */
public class KeyValuePairOfRelationshipEntityCollectionXPsK4FkNImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN
{
    private static final long serialVersionUID = 1L;
    
    public KeyValuePairOfRelationshipEntityCollectionXPsK4FkNImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEY$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "key");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "value");
    
    
    /**
     * Gets the "key" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Relationship getKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Relationship target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Relationship)get_store().find_element_user(KEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "key" element
     */
    public boolean isNilKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Relationship target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Relationship)get_store().find_element_user(KEY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "key" element
     */
    public void setKey(com.microsoft.schemas.xrm._2011.contracts.Relationship key)
    {
        generatedSetterHelperImpl(key, KEY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "key" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.Relationship addNewKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Relationship target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Relationship)get_store().add_element_user(KEY$0);
            return target;
        }
    }
    
    /**
     * Nils the "key" element
     */
    public void setNilKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.Relationship target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.Relationship)get_store().find_element_user(KEY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.Relationship)get_store().add_element_user(KEY$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "value" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityCollection getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "value" element
     */
    public boolean isNilValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().find_element_user(VALUE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(com.microsoft.schemas.xrm._2011.contracts.EntityCollection value)
    {
        generatedSetterHelperImpl(value, VALUE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.EntityCollection addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().add_element_user(VALUE$2);
            return target;
        }
    }
    
    /**
     * Nils the "value" element
     */
    public void setNilValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.EntityCollection target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.xrm._2011.contracts.EntityCollection)get_store().add_element_user(VALUE$2);
            }
            target.setNil();
        }
    }
}
