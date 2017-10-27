/*
 * XML Type:  ArrayOfOptionSetValue
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ArrayOfOptionSetValue
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts.impl;
/**
 * An XML ArrayOfOptionSetValue(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfOptionSetValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.contracts.ArrayOfOptionSetValue
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfOptionSetValueImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTIONSETVALUE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Contracts", "OptionSetValue");
    
    
    /**
     * Gets array of all "OptionSetValue" elements
     */
    public com.microsoft.schemas.xrm._2011.contracts.OptionSetValue[] getOptionSetValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPTIONSETVALUE$0, targetList);
            com.microsoft.schemas.xrm._2011.contracts.OptionSetValue[] result = new com.microsoft.schemas.xrm._2011.contracts.OptionSetValue[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OptionSetValue" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OptionSetValue getOptionSetValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OptionSetValue target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OptionSetValue)get_store().find_element_user(OPTIONSETVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OptionSetValue" element
     */
    public boolean isNilOptionSetValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OptionSetValue target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OptionSetValue)get_store().find_element_user(OPTIONSETVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OptionSetValue" element
     */
    public int sizeOfOptionSetValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTIONSETVALUE$0);
        }
    }
    
    /**
     * Sets array of all "OptionSetValue" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOptionSetValueArray(com.microsoft.schemas.xrm._2011.contracts.OptionSetValue[] optionSetValueArray)
    {
        check_orphaned();
        arraySetterHelper(optionSetValueArray, OPTIONSETVALUE$0);
    }
    
    /**
     * Sets ith "OptionSetValue" element
     */
    public void setOptionSetValueArray(int i, com.microsoft.schemas.xrm._2011.contracts.OptionSetValue optionSetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OptionSetValue target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OptionSetValue)get_store().find_element_user(OPTIONSETVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(optionSetValue);
        }
    }
    
    /**
     * Nils the ith "OptionSetValue" element
     */
    public void setNilOptionSetValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OptionSetValue target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OptionSetValue)get_store().find_element_user(OPTIONSETVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OptionSetValue" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OptionSetValue insertNewOptionSetValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OptionSetValue target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OptionSetValue)get_store().insert_element_user(OPTIONSETVALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OptionSetValue" element
     */
    public com.microsoft.schemas.xrm._2011.contracts.OptionSetValue addNewOptionSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.contracts.OptionSetValue target = null;
            target = (com.microsoft.schemas.xrm._2011.contracts.OptionSetValue)get_store().add_element_user(OPTIONSETVALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OptionSetValue" element
     */
    public void removeOptionSetValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTIONSETVALUE$0, i);
        }
    }
}
