/*
 * XML Type:  ArrayOfArrayOfAccessRights
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAccessRights
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfArrayOfAccessRights(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfAccessRightsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfArrayOfAccessRights
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfArrayOfAccessRightsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFACCESSRIGHTS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "ArrayOfAccessRights");
    
    
    /**
     * Gets array of all "ArrayOfAccessRights" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights[] getArrayOfAccessRightsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFACCESSRIGHTS$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights[] result = new com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfAccessRights" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights getArrayOfAccessRightsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights)get_store().find_element_user(ARRAYOFACCESSRIGHTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfAccessRights" element
     */
    public boolean isNilArrayOfAccessRightsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights)get_store().find_element_user(ARRAYOFACCESSRIGHTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfAccessRights" element
     */
    public int sizeOfArrayOfAccessRightsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFACCESSRIGHTS$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfAccessRights" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setArrayOfAccessRightsArray(com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights[] arrayOfAccessRightsArray)
    {
        check_orphaned();
        arraySetterHelper(arrayOfAccessRightsArray, ARRAYOFACCESSRIGHTS$0);
    }
    
    /**
     * Sets ith "ArrayOfAccessRights" element
     */
    public void setArrayOfAccessRightsArray(int i, com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights arrayOfAccessRights)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights)get_store().find_element_user(ARRAYOFACCESSRIGHTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfAccessRights);
        }
    }
    
    /**
     * Nils the ith "ArrayOfAccessRights" element
     */
    public void setNilArrayOfAccessRightsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights)get_store().find_element_user(ARRAYOFACCESSRIGHTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfAccessRights" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights insertNewArrayOfAccessRights(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights)get_store().insert_element_user(ARRAYOFACCESSRIGHTS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfAccessRights" element
     */
    public com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights addNewArrayOfAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights)get_store().add_element_user(ARRAYOFACCESSRIGHTS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfAccessRights" element
     */
    public void removeArrayOfAccessRights(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFACCESSRIGHTS$0, i);
        }
    }
}
