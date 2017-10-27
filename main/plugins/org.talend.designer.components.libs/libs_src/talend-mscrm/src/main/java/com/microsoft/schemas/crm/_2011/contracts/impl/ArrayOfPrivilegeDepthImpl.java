/*
 * XML Type:  ArrayOfPrivilegeDepth
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfPrivilegeDepth(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfPrivilegeDepthImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfPrivilegeDepth
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfPrivilegeDepthImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIVILEGEDEPTH$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "PrivilegeDepth");
    
    
    /**
     * Gets array of all "PrivilegeDepth" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth.Enum[] getPrivilegeDepthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRIVILEGEDEPTH$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth.Enum[] result = new com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "PrivilegeDepth" element
     */
    public com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth.Enum getPrivilegeDepthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVILEGEDEPTH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "PrivilegeDepth" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth[] xgetPrivilegeDepthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRIVILEGEDEPTH$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth[] result = new com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "PrivilegeDepth" element
     */
    public com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth xgetPrivilegeDepthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth)get_store().find_element_user(PRIVILEGEDEPTH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PrivilegeDepth" element
     */
    public int sizeOfPrivilegeDepthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIVILEGEDEPTH$0);
        }
    }
    
    /**
     * Sets array of all "PrivilegeDepth" element
     */
    public void setPrivilegeDepthArray(com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth.Enum[] privilegeDepthArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(privilegeDepthArray, PRIVILEGEDEPTH$0);
        }
    }
    
    /**
     * Sets ith "PrivilegeDepth" element
     */
    public void setPrivilegeDepthArray(int i, com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth.Enum privilegeDepth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVILEGEDEPTH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(privilegeDepth);
        }
    }
    
    /**
     * Sets (as xml) array of all "PrivilegeDepth" element
     */
    public void xsetPrivilegeDepthArray(com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth[]privilegeDepthArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(privilegeDepthArray, PRIVILEGEDEPTH$0);
        }
    }
    
    /**
     * Sets (as xml) ith "PrivilegeDepth" element
     */
    public void xsetPrivilegeDepthArray(int i, com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth privilegeDepth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth)get_store().find_element_user(PRIVILEGEDEPTH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(privilegeDepth);
        }
    }
    
    /**
     * Inserts the value as the ith "PrivilegeDepth" element
     */
    public void insertPrivilegeDepth(int i, com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth.Enum privilegeDepth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PRIVILEGEDEPTH$0, i);
            target.setEnumValue(privilegeDepth);
        }
    }
    
    /**
     * Appends the value as the last "PrivilegeDepth" element
     */
    public void addPrivilegeDepth(com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth.Enum privilegeDepth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIVILEGEDEPTH$0);
            target.setEnumValue(privilegeDepth);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PrivilegeDepth" element
     */
    public com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth insertNewPrivilegeDepth(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth)get_store().insert_element_user(PRIVILEGEDEPTH$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PrivilegeDepth" element
     */
    public com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth addNewPrivilegeDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.PrivilegeDepth)get_store().add_element_user(PRIVILEGEDEPTH$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "PrivilegeDepth" element
     */
    public void removePrivilegeDepth(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIVILEGEDEPTH$0, i);
        }
    }
}
