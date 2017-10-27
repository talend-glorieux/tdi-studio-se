/*
 * XML Type:  ArrayOfAccessRights
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfAccessRights(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfAccessRightsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfAccessRights
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfAccessRightsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCESSRIGHTS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "AccessRights");
    
    
    /**
     * Gets array of all "AccessRights" elements
     */
    public java.util.List[] getAccessRightsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACCESSRIGHTS$0, targetList);
            java.util.List[] result = new java.util.List[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getListValue();
            return result;
        }
    }
    
    /**
     * Gets ith "AccessRights" element
     */
    public java.util.List getAccessRightsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSRIGHTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "AccessRights" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.AccessRights[] xgetAccessRightsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACCESSRIGHTS$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.AccessRights[] result = new com.microsoft.schemas.crm._2011.contracts.AccessRights[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "AccessRights" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AccessRights xgetAccessRightsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().find_element_user(ACCESSRIGHTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AccessRights" element
     */
    public int sizeOfAccessRightsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCESSRIGHTS$0);
        }
    }
    
    /**
     * Sets array of all "AccessRights" element
     */
    public void setAccessRightsArray(java.util.List[] accessRightsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(accessRightsArray, ACCESSRIGHTS$0);
        }
    }
    
    /**
     * Sets ith "AccessRights" element
     */
    public void setAccessRightsArray(int i, java.util.List accessRights)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSRIGHTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setListValue(accessRights);
        }
    }
    
    /**
     * Sets (as xml) array of all "AccessRights" element
     */
    public void xsetAccessRightsArray(com.microsoft.schemas.crm._2011.contracts.AccessRights[]accessRightsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(accessRightsArray, ACCESSRIGHTS$0);
        }
    }
    
    /**
     * Sets (as xml) ith "AccessRights" element
     */
    public void xsetAccessRightsArray(int i, com.microsoft.schemas.crm._2011.contracts.AccessRights accessRights)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().find_element_user(ACCESSRIGHTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(accessRights);
        }
    }
    
    /**
     * Inserts the value as the ith "AccessRights" element
     */
    public void insertAccessRights(int i, java.util.List accessRights)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ACCESSRIGHTS$0, i);
            target.setListValue(accessRights);
        }
    }
    
    /**
     * Appends the value as the last "AccessRights" element
     */
    public void addAccessRights(java.util.List accessRights)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSRIGHTS$0);
            target.setListValue(accessRights);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AccessRights" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AccessRights insertNewAccessRights(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().insert_element_user(ACCESSRIGHTS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AccessRights" element
     */
    public com.microsoft.schemas.crm._2011.contracts.AccessRights addNewAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.AccessRights target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.AccessRights)get_store().add_element_user(ACCESSRIGHTS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AccessRights" element
     */
    public void removeAccessRights(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCESSRIGHTS$0, i);
        }
    }
}
