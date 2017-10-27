/*
 * XML Type:  ArrayOfPropagationOwnershipOptions
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfPropagationOwnershipOptions(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfPropagationOwnershipOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfPropagationOwnershipOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPAGATIONOWNERSHIPOPTIONS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "PropagationOwnershipOptions");
    
    
    /**
     * Gets array of all "PropagationOwnershipOptions" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions.Enum[] getPropagationOwnershipOptionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPAGATIONOWNERSHIPOPTIONS$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions.Enum[] result = new com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "PropagationOwnershipOptions" element
     */
    public com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions.Enum getPropagationOwnershipOptionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPAGATIONOWNERSHIPOPTIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "PropagationOwnershipOptions" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions[] xgetPropagationOwnershipOptionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPAGATIONOWNERSHIPOPTIONS$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions[] result = new com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "PropagationOwnershipOptions" element
     */
    public com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions xgetPropagationOwnershipOptionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions)get_store().find_element_user(PROPAGATIONOWNERSHIPOPTIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PropagationOwnershipOptions" element
     */
    public int sizeOfPropagationOwnershipOptionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPAGATIONOWNERSHIPOPTIONS$0);
        }
    }
    
    /**
     * Sets array of all "PropagationOwnershipOptions" element
     */
    public void setPropagationOwnershipOptionsArray(com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions.Enum[] propagationOwnershipOptionsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propagationOwnershipOptionsArray, PROPAGATIONOWNERSHIPOPTIONS$0);
        }
    }
    
    /**
     * Sets ith "PropagationOwnershipOptions" element
     */
    public void setPropagationOwnershipOptionsArray(int i, com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions.Enum propagationOwnershipOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPAGATIONOWNERSHIPOPTIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(propagationOwnershipOptions);
        }
    }
    
    /**
     * Sets (as xml) array of all "PropagationOwnershipOptions" element
     */
    public void xsetPropagationOwnershipOptionsArray(com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions[]propagationOwnershipOptionsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propagationOwnershipOptionsArray, PROPAGATIONOWNERSHIPOPTIONS$0);
        }
    }
    
    /**
     * Sets (as xml) ith "PropagationOwnershipOptions" element
     */
    public void xsetPropagationOwnershipOptionsArray(int i, com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions propagationOwnershipOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions)get_store().find_element_user(PROPAGATIONOWNERSHIPOPTIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(propagationOwnershipOptions);
        }
    }
    
    /**
     * Inserts the value as the ith "PropagationOwnershipOptions" element
     */
    public void insertPropagationOwnershipOptions(int i, com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions.Enum propagationOwnershipOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPAGATIONOWNERSHIPOPTIONS$0, i);
            target.setEnumValue(propagationOwnershipOptions);
        }
    }
    
    /**
     * Appends the value as the last "PropagationOwnershipOptions" element
     */
    public void addPropagationOwnershipOptions(com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions.Enum propagationOwnershipOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPAGATIONOWNERSHIPOPTIONS$0);
            target.setEnumValue(propagationOwnershipOptions);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PropagationOwnershipOptions" element
     */
    public com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions insertNewPropagationOwnershipOptions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions)get_store().insert_element_user(PROPAGATIONOWNERSHIPOPTIONS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PropagationOwnershipOptions" element
     */
    public com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions addNewPropagationOwnershipOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions)get_store().add_element_user(PROPAGATIONOWNERSHIPOPTIONS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "PropagationOwnershipOptions" element
     */
    public void removePropagationOwnershipOptions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPAGATIONOWNERSHIPOPTIONS$0, i);
        }
    }
}
