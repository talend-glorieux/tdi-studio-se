/*
 * XML Type:  ArrayOfArrayOfConstraintRelation
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfConstraintRelation
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfConstraintRelation(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfConstraintRelationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfConstraintRelation
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfConstraintRelationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFCONSTRAINTRELATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfConstraintRelation");
    
    
    /**
     * Gets array of all "ArrayOfConstraintRelation" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation[] getArrayOfConstraintRelationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFCONSTRAINTRELATION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfConstraintRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation getArrayOfConstraintRelationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation)get_store().find_element_user(ARRAYOFCONSTRAINTRELATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfConstraintRelation" element
     */
    public boolean isNilArrayOfConstraintRelationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation)get_store().find_element_user(ARRAYOFCONSTRAINTRELATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfConstraintRelation" element
     */
    public int sizeOfArrayOfConstraintRelationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFCONSTRAINTRELATION$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfConstraintRelation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfConstraintRelationArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation[] arrayOfConstraintRelationArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfConstraintRelationArray, ARRAYOFCONSTRAINTRELATION$0);
    }
    
    /**
     * Sets ith "ArrayOfConstraintRelation" element
     */
    public void setArrayOfConstraintRelationArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation arrayOfConstraintRelation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation)get_store().find_element_user(ARRAYOFCONSTRAINTRELATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfConstraintRelation);
        }
    }
    
    /**
     * Nils the ith "ArrayOfConstraintRelation" element
     */
    public void setNilArrayOfConstraintRelationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation)get_store().find_element_user(ARRAYOFCONSTRAINTRELATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfConstraintRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation insertNewArrayOfConstraintRelation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation)get_store().insert_element_user(ARRAYOFCONSTRAINTRELATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfConstraintRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation addNewArrayOfConstraintRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation)get_store().add_element_user(ARRAYOFCONSTRAINTRELATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfConstraintRelation" element
     */
    public void removeArrayOfConstraintRelation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFCONSTRAINTRELATION$0, i);
        }
    }
}
