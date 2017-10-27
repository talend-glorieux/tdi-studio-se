/*
 * XML Type:  ArrayOfArrayOfObjectiveRelation
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfObjectiveRelation
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfObjectiveRelation(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfObjectiveRelationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfObjectiveRelation
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfObjectiveRelationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFOBJECTIVERELATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfObjectiveRelation");
    
    
    /**
     * Gets array of all "ArrayOfObjectiveRelation" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation[] getArrayOfObjectiveRelationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFOBJECTIVERELATION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfObjectiveRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation getArrayOfObjectiveRelationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation)get_store().find_element_user(ARRAYOFOBJECTIVERELATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfObjectiveRelation" element
     */
    public boolean isNilArrayOfObjectiveRelationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation)get_store().find_element_user(ARRAYOFOBJECTIVERELATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfObjectiveRelation" element
     */
    public int sizeOfArrayOfObjectiveRelationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFOBJECTIVERELATION$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfObjectiveRelation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfObjectiveRelationArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation[] arrayOfObjectiveRelationArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfObjectiveRelationArray, ARRAYOFOBJECTIVERELATION$0);
    }
    
    /**
     * Sets ith "ArrayOfObjectiveRelation" element
     */
    public void setArrayOfObjectiveRelationArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation arrayOfObjectiveRelation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation)get_store().find_element_user(ARRAYOFOBJECTIVERELATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfObjectiveRelation);
        }
    }
    
    /**
     * Nils the ith "ArrayOfObjectiveRelation" element
     */
    public void setNilArrayOfObjectiveRelationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation)get_store().find_element_user(ARRAYOFOBJECTIVERELATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfObjectiveRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation insertNewArrayOfObjectiveRelation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation)get_store().insert_element_user(ARRAYOFOBJECTIVERELATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfObjectiveRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation addNewArrayOfObjectiveRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfObjectiveRelation)get_store().add_element_user(ARRAYOFOBJECTIVERELATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfObjectiveRelation" element
     */
    public void removeArrayOfObjectiveRelation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFOBJECTIVERELATION$0, i);
        }
    }
}
