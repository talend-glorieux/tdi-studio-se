/*
 * XML Type:  ArrayOfConstraintRelation
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfConstraintRelation(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfConstraintRelationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfConstraintRelation
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfConstraintRelationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSTRAINTRELATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ConstraintRelation");
    
    
    /**
     * Gets array of all "ConstraintRelation" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ConstraintRelation[] getConstraintRelationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONSTRAINTRELATION$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ConstraintRelation[] result = new com.microsoft.schemas.crm._2011.contracts.ConstraintRelation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConstraintRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ConstraintRelation getConstraintRelationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ConstraintRelation)get_store().find_element_user(CONSTRAINTRELATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ConstraintRelation" element
     */
    public boolean isNilConstraintRelationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ConstraintRelation)get_store().find_element_user(CONSTRAINTRELATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ConstraintRelation" element
     */
    public int sizeOfConstraintRelationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSTRAINTRELATION$0);
        }
    }
    
    /**
     * Sets array of all "ConstraintRelation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setConstraintRelationArray(com.microsoft.schemas.crm._2011.contracts.ConstraintRelation[] constraintRelationArray)
    {
        check_orphaned();
        arraySetterHelper(constraintRelationArray, CONSTRAINTRELATION$0);
    }
    
    /**
     * Sets ith "ConstraintRelation" element
     */
    public void setConstraintRelationArray(int i, com.microsoft.schemas.crm._2011.contracts.ConstraintRelation constraintRelation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ConstraintRelation)get_store().find_element_user(CONSTRAINTRELATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(constraintRelation);
        }
    }
    
    /**
     * Nils the ith "ConstraintRelation" element
     */
    public void setNilConstraintRelationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ConstraintRelation)get_store().find_element_user(CONSTRAINTRELATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConstraintRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ConstraintRelation insertNewConstraintRelation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ConstraintRelation)get_store().insert_element_user(CONSTRAINTRELATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConstraintRelation" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ConstraintRelation addNewConstraintRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ConstraintRelation)get_store().add_element_user(CONSTRAINTRELATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ConstraintRelation" element
     */
    public void removeConstraintRelation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSTRAINTRELATION$0, i);
        }
    }
}
