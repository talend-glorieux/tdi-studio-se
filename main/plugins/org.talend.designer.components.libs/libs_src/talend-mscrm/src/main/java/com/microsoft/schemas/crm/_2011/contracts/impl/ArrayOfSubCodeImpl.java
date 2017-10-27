/*
 * XML Type:  ArrayOfSubCode
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts.impl;
/**
 * An XML ArrayOfSubCode(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public class ArrayOfSubCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2011.contracts.ArrayOfSubCode
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOfSubCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBCODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2011/Contracts", "SubCode");
    
    
    /**
     * Gets array of all "SubCode" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.SubCode.Enum[] getSubCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBCODE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.SubCode.Enum[] result = new com.microsoft.schemas.crm._2011.contracts.SubCode.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.crm._2011.contracts.SubCode.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "SubCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SubCode.Enum getSubCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.crm._2011.contracts.SubCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "SubCode" elements
     */
    public com.microsoft.schemas.crm._2011.contracts.SubCode[] xgetSubCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBCODE$0, targetList);
            com.microsoft.schemas.crm._2011.contracts.SubCode[] result = new com.microsoft.schemas.crm._2011.contracts.SubCode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "SubCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SubCode xgetSubCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SubCode)get_store().find_element_user(SUBCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SubCode" element
     */
    public int sizeOfSubCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBCODE$0);
        }
    }
    
    /**
     * Sets array of all "SubCode" element
     */
    public void setSubCodeArray(com.microsoft.schemas.crm._2011.contracts.SubCode.Enum[] subCodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subCodeArray, SUBCODE$0);
        }
    }
    
    /**
     * Sets ith "SubCode" element
     */
    public void setSubCodeArray(int i, com.microsoft.schemas.crm._2011.contracts.SubCode.Enum subCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(subCode);
        }
    }
    
    /**
     * Sets (as xml) array of all "SubCode" element
     */
    public void xsetSubCodeArray(com.microsoft.schemas.crm._2011.contracts.SubCode[]subCodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subCodeArray, SUBCODE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "SubCode" element
     */
    public void xsetSubCodeArray(int i, com.microsoft.schemas.crm._2011.contracts.SubCode subCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SubCode)get_store().find_element_user(SUBCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subCode);
        }
    }
    
    /**
     * Inserts the value as the ith "SubCode" element
     */
    public void insertSubCode(int i, com.microsoft.schemas.crm._2011.contracts.SubCode.Enum subCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SUBCODE$0, i);
            target.setEnumValue(subCode);
        }
    }
    
    /**
     * Appends the value as the last "SubCode" element
     */
    public void addSubCode(com.microsoft.schemas.crm._2011.contracts.SubCode.Enum subCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBCODE$0);
            target.setEnumValue(subCode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SubCode insertNewSubCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SubCode)get_store().insert_element_user(SUBCODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SubCode" element
     */
    public com.microsoft.schemas.crm._2011.contracts.SubCode addNewSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2011.contracts.SubCode target = null;
            target = (com.microsoft.schemas.crm._2011.contracts.SubCode)get_store().add_element_user(SUBCODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SubCode" element
     */
    public void removeSubCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBCODE$0, i);
        }
    }
}
