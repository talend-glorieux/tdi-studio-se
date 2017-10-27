/*
 * XML Type:  ArrayOfKeyValuePairOfstringanyType
 * Namespace: http://schemas.datacontract.org/2004/07/System.Collections.Generic
 * Java type: org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType
 *
 * Automatically generated - do not modify.
 */
package org.datacontract.schemas._2004._07.system_collections_generic.impl;
/**
 * An XML ArrayOfKeyValuePairOfstringanyType(@http://schemas.datacontract.org/2004/07/System.Collections.Generic).
 *
 * This is a complex type.
 */
public class ArrayOfKeyValuePairOfstringanyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.datacontract.schemas._2004._07.system_collections_generic.ArrayOfKeyValuePairOfstringanyType
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfKeyValuePairOfstringanyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUEPAIROFSTRINGANYTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringanyType");
    
    
    /**
     * Gets array of all "KeyValuePairOfstringanyType" elements
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType[] getKeyValuePairOfstringanyTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYVALUEPAIROFSTRINGANYTYPE$0, targetList);
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType[] result = new org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyValuePairOfstringanyType" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType getKeyValuePairOfstringanyTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType)get_store().find_element_user(KEYVALUEPAIROFSTRINGANYTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "KeyValuePairOfstringanyType" element
     */
    public int sizeOfKeyValuePairOfstringanyTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYVALUEPAIROFSTRINGANYTYPE$0);
        }
    }
    
    /**
     * Sets array of all "KeyValuePairOfstringanyType" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKeyValuePairOfstringanyTypeArray(org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType[] keyValuePairOfstringanyTypeArray)
    {
        check_orphaned();
        arraySetterHelper(keyValuePairOfstringanyTypeArray, KEYVALUEPAIROFSTRINGANYTYPE$0);
    }
    
    /**
     * Sets ith "KeyValuePairOfstringanyType" element
     */
    public void setKeyValuePairOfstringanyTypeArray(int i, org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType keyValuePairOfstringanyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType)get_store().find_element_user(KEYVALUEPAIROFSTRINGANYTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyValuePairOfstringanyType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValuePairOfstringanyType" element
     */
    public org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType insertNewKeyValuePairOfstringanyType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType target = null;
            target = (org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType)get_store().insert_element_user(KEYVALUEPAIROFSTRINGANYTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValuePairOfstringanyType" element
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
     * Removes the ith "KeyValuePairOfstringanyType" element
     */
    public void removeKeyValuePairOfstringanyType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYVALUEPAIROFSTRINGANYTYPE$0, i);
        }
    }
}
