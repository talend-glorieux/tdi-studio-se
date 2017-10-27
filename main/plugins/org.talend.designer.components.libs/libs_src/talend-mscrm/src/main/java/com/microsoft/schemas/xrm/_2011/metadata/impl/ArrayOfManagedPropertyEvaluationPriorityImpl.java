/*
 * XML Type:  ArrayOfManagedPropertyEvaluationPriority
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfManagedPropertyEvaluationPriority(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfManagedPropertyEvaluationPriorityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyEvaluationPriority
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfManagedPropertyEvaluationPriorityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANAGEDPROPERTYEVALUATIONPRIORITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ManagedPropertyEvaluationPriority");
    
    
    /**
     * Gets array of all "ManagedPropertyEvaluationPriority" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum[] getManagedPropertyEvaluationPriorityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MANAGEDPROPERTYEVALUATIONPRIORITY$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum[] result = new com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ManagedPropertyEvaluationPriority" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum getManagedPropertyEvaluationPriorityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEDPROPERTYEVALUATIONPRIORITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "ManagedPropertyEvaluationPriority" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority[] xgetManagedPropertyEvaluationPriorityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MANAGEDPROPERTYEVALUATIONPRIORITY$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority[] result = new com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ManagedPropertyEvaluationPriority" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority xgetManagedPropertyEvaluationPriorityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority)get_store().find_element_user(MANAGEDPROPERTYEVALUATIONPRIORITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ManagedPropertyEvaluationPriority" element
     */
    public int sizeOfManagedPropertyEvaluationPriorityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANAGEDPROPERTYEVALUATIONPRIORITY$0);
        }
    }
    
    /**
     * Sets array of all "ManagedPropertyEvaluationPriority" element
     */
    public void setManagedPropertyEvaluationPriorityArray(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum[] managedPropertyEvaluationPriorityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(managedPropertyEvaluationPriorityArray, MANAGEDPROPERTYEVALUATIONPRIORITY$0);
        }
    }
    
    /**
     * Sets ith "ManagedPropertyEvaluationPriority" element
     */
    public void setManagedPropertyEvaluationPriorityArray(int i, com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum managedPropertyEvaluationPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEDPROPERTYEVALUATIONPRIORITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(managedPropertyEvaluationPriority);
        }
    }
    
    /**
     * Sets (as xml) array of all "ManagedPropertyEvaluationPriority" element
     */
    public void xsetManagedPropertyEvaluationPriorityArray(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority[]managedPropertyEvaluationPriorityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(managedPropertyEvaluationPriorityArray, MANAGEDPROPERTYEVALUATIONPRIORITY$0);
        }
    }
    
    /**
     * Sets (as xml) ith "ManagedPropertyEvaluationPriority" element
     */
    public void xsetManagedPropertyEvaluationPriorityArray(int i, com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority managedPropertyEvaluationPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority)get_store().find_element_user(MANAGEDPROPERTYEVALUATIONPRIORITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(managedPropertyEvaluationPriority);
        }
    }
    
    /**
     * Inserts the value as the ith "ManagedPropertyEvaluationPriority" element
     */
    public void insertManagedPropertyEvaluationPriority(int i, com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum managedPropertyEvaluationPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MANAGEDPROPERTYEVALUATIONPRIORITY$0, i);
            target.setEnumValue(managedPropertyEvaluationPriority);
        }
    }
    
    /**
     * Appends the value as the last "ManagedPropertyEvaluationPriority" element
     */
    public void addManagedPropertyEvaluationPriority(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority.Enum managedPropertyEvaluationPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANAGEDPROPERTYEVALUATIONPRIORITY$0);
            target.setEnumValue(managedPropertyEvaluationPriority);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ManagedPropertyEvaluationPriority" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority insertNewManagedPropertyEvaluationPriority(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority)get_store().insert_element_user(MANAGEDPROPERTYEVALUATIONPRIORITY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ManagedPropertyEvaluationPriority" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority addNewManagedPropertyEvaluationPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyEvaluationPriority)get_store().add_element_user(MANAGEDPROPERTYEVALUATIONPRIORITY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ManagedPropertyEvaluationPriority" element
     */
    public void removeManagedPropertyEvaluationPriority(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANAGEDPROPERTYEVALUATIONPRIORITY$0, i);
        }
    }
}
