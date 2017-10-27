/*
 * XML Type:  InputArgumentCollection
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML InputArgumentCollection(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class InputArgumentCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.InputArgumentCollection
{
    private static final long serialVersionUID = 1L;
    
    public InputArgumentCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARGUMENTS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "Arguments");
    
    
    /**
     * Gets the "Arguments" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType getArguments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType)get_store().find_element_user(ARGUMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Arguments" element
     */
    public boolean isNilArguments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType)get_store().find_element_user(ARGUMENTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Arguments" element
     */
    public boolean isSetArguments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARGUMENTS$0) != 0;
        }
    }
    
    /**
     * Sets the "Arguments" element
     */
    public void setArguments(org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType arguments)
    {
        generatedSetterHelperImpl(arguments, ARGUMENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Arguments" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType addNewArguments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType)get_store().add_element_user(ARGUMENTS$0);
            return target;
        }
    }
    
    /**
     * Nils the "Arguments" element
     */
    public void setNilArguments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType)get_store().find_element_user(ARGUMENTS$0, 0);
            if (target == null)
            {
                target = (org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType)get_store().add_element_user(ARGUMENTS$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Arguments" element
     */
    public void unsetArguments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARGUMENTS$0, 0);
        }
    }
}
