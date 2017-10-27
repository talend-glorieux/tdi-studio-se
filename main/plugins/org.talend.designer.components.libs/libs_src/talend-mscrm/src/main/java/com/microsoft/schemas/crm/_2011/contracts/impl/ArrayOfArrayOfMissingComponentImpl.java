/*
 * XML Type:  ArrayOfArrayOfMissingComponent
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfMissingComponent
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfMissingComponent(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfMissingComponentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfMissingComponent
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfMissingComponentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFMISSINGCOMPONENT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfMissingComponent");
    
    
    /**
     * Gets array of all "ArrayOfMissingComponent" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent[] getArrayOfMissingComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFMISSINGCOMPONENT$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfMissingComponent" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent getArrayOfMissingComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent)get_store().find_element_user(ARRAYOFMISSINGCOMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfMissingComponent" element
     */
    public boolean isNilArrayOfMissingComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent)get_store().find_element_user(ARRAYOFMISSINGCOMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfMissingComponent" element
     */
    public int sizeOfArrayOfMissingComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFMISSINGCOMPONENT$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfMissingComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfMissingComponentArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent[] arrayOfMissingComponentArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfMissingComponentArray, ARRAYOFMISSINGCOMPONENT$0);
    }
    
    /**
     * Sets ith "ArrayOfMissingComponent" element
     */
    public void setArrayOfMissingComponentArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent arrayOfMissingComponent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent)get_store().find_element_user(ARRAYOFMISSINGCOMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfMissingComponent);
        }
    }
    
    /**
     * Nils the ith "ArrayOfMissingComponent" element
     */
    public void setNilArrayOfMissingComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent)get_store().find_element_user(ARRAYOFMISSINGCOMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfMissingComponent" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent insertNewArrayOfMissingComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent)get_store().insert_element_user(ARRAYOFMISSINGCOMPONENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfMissingComponent" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent addNewArrayOfMissingComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent)get_store().add_element_user(ARRAYOFMISSINGCOMPONENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfMissingComponent" element
     */
    public void removeArrayOfMissingComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFMISSINGCOMPONENT$0, i);
        }
    }
}
