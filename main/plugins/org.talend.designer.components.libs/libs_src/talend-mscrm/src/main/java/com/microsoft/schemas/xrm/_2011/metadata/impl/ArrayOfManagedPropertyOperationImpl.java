/*
 * XML Type:  ArrayOfManagedPropertyOperation
 * Namespace: http://schemas.microsoft.com/xrm/2011/Metadata
 * Java type: com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyOperation
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.metadata.impl;
/**
 * An XML ArrayOfManagedPropertyOperation(@http://schemas.microsoft.com/xrm/2011/Metadata).
 *
 * This is a complex type.
 */
public class ArrayOfManagedPropertyOperationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.xrm._2011.metadata.ArrayOfManagedPropertyOperation
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfManagedPropertyOperationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANAGEDPROPERTYOPERATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/xrm/2011/Metadata", "ManagedPropertyOperation");
    
    
    /**
     * Gets array of all "ManagedPropertyOperation" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation.Enum[] getManagedPropertyOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MANAGEDPROPERTYOPERATION$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation.Enum[] result = new com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ManagedPropertyOperation" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation.Enum getManagedPropertyOperationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEDPROPERTYOPERATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "ManagedPropertyOperation" elements
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation[] xgetManagedPropertyOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MANAGEDPROPERTYOPERATION$0, targetList);
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation[] result = new com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ManagedPropertyOperation" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation xgetManagedPropertyOperationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation)get_store().find_element_user(MANAGEDPROPERTYOPERATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ManagedPropertyOperation" element
     */
    public int sizeOfManagedPropertyOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANAGEDPROPERTYOPERATION$0);
        }
    }
    
    /**
     * Sets array of all "ManagedPropertyOperation" element
     */
    public void setManagedPropertyOperationArray(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation.Enum[] managedPropertyOperationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(managedPropertyOperationArray, MANAGEDPROPERTYOPERATION$0);
        }
    }
    
    /**
     * Sets ith "ManagedPropertyOperation" element
     */
    public void setManagedPropertyOperationArray(int i, com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation.Enum managedPropertyOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGEDPROPERTYOPERATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(managedPropertyOperation);
        }
    }
    
    /**
     * Sets (as xml) array of all "ManagedPropertyOperation" element
     */
    public void xsetManagedPropertyOperationArray(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation[]managedPropertyOperationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(managedPropertyOperationArray, MANAGEDPROPERTYOPERATION$0);
        }
    }
    
    /**
     * Sets (as xml) ith "ManagedPropertyOperation" element
     */
    public void xsetManagedPropertyOperationArray(int i, com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation managedPropertyOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation)get_store().find_element_user(MANAGEDPROPERTYOPERATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(managedPropertyOperation);
        }
    }
    
    /**
     * Inserts the value as the ith "ManagedPropertyOperation" element
     */
    public void insertManagedPropertyOperation(int i, com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation.Enum managedPropertyOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MANAGEDPROPERTYOPERATION$0, i);
            target.setEnumValue(managedPropertyOperation);
        }
    }
    
    /**
     * Appends the value as the last "ManagedPropertyOperation" element
     */
    public void addManagedPropertyOperation(com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation.Enum managedPropertyOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANAGEDPROPERTYOPERATION$0);
            target.setEnumValue(managedPropertyOperation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ManagedPropertyOperation" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation insertNewManagedPropertyOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation)get_store().insert_element_user(MANAGEDPROPERTYOPERATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ManagedPropertyOperation" element
     */
    public com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation addNewManagedPropertyOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation target = null;
            target = (com.microsoft.schemas.xrm._2011.metadata.ManagedPropertyOperation)get_store().add_element_user(MANAGEDPROPERTYOPERATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ManagedPropertyOperation" element
     */
    public void removeManagedPropertyOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANAGEDPROPERTYOPERATION$0, i);
        }
    }
}
