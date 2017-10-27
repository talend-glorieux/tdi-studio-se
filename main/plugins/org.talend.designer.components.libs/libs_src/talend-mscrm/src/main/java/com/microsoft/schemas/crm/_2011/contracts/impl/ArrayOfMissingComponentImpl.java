/*
 * XML Type:  ArrayOfMissingComponent
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfMissingComponent(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfMissingComponentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfMissingComponent
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfMissingComponentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MISSINGCOMPONENT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "MissingComponent");
    
    
    /**
     * Gets array of all "MissingComponent" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.MissingComponent[] getMissingComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MISSINGCOMPONENT$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.MissingComponent[] result = new com.microsoft.schemas.crm._2011.contracts.MissingComponent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MissingComponent" element
     */
    public com.microsoft.schemas.crm._2011.contracts.MissingComponent getMissingComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.MissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.MissingComponent)get_store().find_element_user(MISSINGCOMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "MissingComponent" element
     */
    public boolean isNilMissingComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.MissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.MissingComponent)get_store().find_element_user(MISSINGCOMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "MissingComponent" element
     */
    public int sizeOfMissingComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MISSINGCOMPONENT$0);
        }
    }
    
    /**
     * Sets array of all "MissingComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMissingComponentArray(com.microsoft.schemas.crm._2011.contracts.MissingComponent[] missingComponentArray)
    {
        check_orphaned();
        arraySetterHelper(missingComponentArray, MISSINGCOMPONENT$0);
    }
    
    /**
     * Sets ith "MissingComponent" element
     */
    public void setMissingComponentArray(int i, com.microsoft.schemas.crm._2011.contracts.MissingComponent missingComponent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.MissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.MissingComponent)get_store().find_element_user(MISSINGCOMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(missingComponent);
        }
    }
    
    /**
     * Nils the ith "MissingComponent" element
     */
    public void setNilMissingComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.MissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.MissingComponent)get_store().find_element_user(MISSINGCOMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MissingComponent" element
     */
    public com.microsoft.schemas.crm._2011.contracts.MissingComponent insertNewMissingComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.MissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.MissingComponent)get_store().insert_element_user(MISSINGCOMPONENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MissingComponent" element
     */
    public com.microsoft.schemas.crm._2011.contracts.MissingComponent addNewMissingComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.MissingComponent target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.MissingComponent)get_store().add_element_user(MISSINGCOMPONENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "MissingComponent" element
     */
    public void removeMissingComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MISSINGCOMPONENT$0, i);
        }
    }
}
